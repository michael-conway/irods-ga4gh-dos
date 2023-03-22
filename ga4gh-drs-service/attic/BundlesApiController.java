package org.irods.jargon.ga4gh.dos.api;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.irods.jargon.core.connection.IRODSAccount;
import org.irods.jargon.ga4gh.dos.bundle.DosService;
import org.irods.jargon.ga4gh.dos.bundle.DosServiceFactory;
import org.irods.jargon.ga4gh.dos.bundle.internalmodel.IrodsDataBundle;
import org.irods.jargon.ga4gh.dos.bundle.internalmodel.IrodsDataObject;
import org.irods.jargon.ga4gh.dos.exception.DosDataNotFoundException;
import org.irods.jargon.ga4gh.dos.model.Bundle;
import org.irods.jargon.ga4gh.dos.model.BundleObject;
import org.irods.jargon.ga4gh.dos.model.BundleObject.TypeEnum;
import org.irods.jargon.ga4gh.dos.model.Checksum;
import org.irods.jargon.ga4gh.dos.security.RestAuthUtils;
import org.irods.jargon.ga4gh.dos.utils.ServiceUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-14T11:28:18.659Z")

@Controller
public class BundlesApiController implements BundlesApi {

	private final HttpServletRequest request;

	private static final Logger log = LoggerFactory.getLogger(BundlesApiController.class);

	@Autowired
	private DosServiceFactory dosServiceFactory;

	@org.springframework.beans.factory.annotation.Autowired
	public BundlesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public ResponseEntity<Bundle> getBundle(
			@ApiParam(value = "", required = true) @PathVariable("bundle_id") String bundleId) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			if (bundleId == null || bundleId.isEmpty()) {
				log.error("Null or empty bundle id", bundleId);
				return new ResponseEntity<Bundle>(HttpStatus.INTERNAL_SERVER_ERROR);
			}

			IRODSAccount irodsAccount = RestAuthUtils.irodsAccountFromContext();
			log.debug("irodsAccount:{}", irodsAccount);

			try {
				DosService dosService = this.dosServiceFactory.instanceDosService(irodsAccount);
				IrodsDataBundle irodsDataBundle = dosService.retrieveDataBundle(bundleId);
				log.debug("got data bundle:{}", irodsDataBundle);
				Bundle bundle = new Bundle();
				bundle.addAliasesItem(irodsDataBundle.getIrodsAbsolutePath());
				Checksum checksum = new Checksum();
				checksum.setChecksum(irodsDataBundle.getBundleChecksum());
				checksum.setType(irodsDataBundle.getBundleChecksumType());
				bundle.addChecksumsItem(checksum);
				BundleObject bundleObject;
				List<BundleObject> dataObjects = new ArrayList<>();
				for (IrodsDataObject dataObject : irodsDataBundle.getDataObjects()) {
					bundleObject = new BundleObject();
					bundleObject.setId(dataObject.getGuid());
					bundleObject.setName(dataObject.getFileName());
					bundleObject.setType(TypeEnum.OBJECT);
					bundleObject.setDrsUri(new ArrayList<String>());
					bundleObject.getDrsUri().add(dataObject.getIrodsAccessMethods().get(0).getUrl());
					dataObjects.add(bundleObject);
				}

				bundle.setContents(dataObjects);
				bundle.setCreated(ServiceUtils.offsetDateTimeFromDate(irodsDataBundle.getCreateDate()));
				bundle.setDescription(irodsDataBundle.getDescription());
				bundle.setId(irodsDataBundle.getBundleUuid());
				bundle.setUpdated(ServiceUtils.offsetDateTimeFromDate(irodsDataBundle.getUpdatedDate()));
				bundle.setVersion(irodsDataBundle.getVersion());
				bundle.setName(irodsDataBundle.getIrodsAbsolutePath());
				bundle.setSize("0");

				return new ResponseEntity<Bundle>(bundle, HttpStatus.OK);

			} catch (DosDataNotFoundException e) {
				log.warn("bundle not found for bundleId:{}", bundleId);
				return new ResponseEntity<Bundle>(HttpStatus.NOT_FOUND);
			} catch (Throwable e) {
				log.error("error in operation", e);
				return new ResponseEntity<Bundle>(HttpStatus.INTERNAL_SERVER_ERROR);
			}

		} else {
			return new ResponseEntity<Bundle>(HttpStatus.BAD_REQUEST);
		}
	}

	public DosServiceFactory getDosServiceFactory() {
		return dosServiceFactory;
	}

	public void setDosServiceFactory(DosServiceFactory dosServiceFactory) {
		this.dosServiceFactory = dosServiceFactory;
	}

}
