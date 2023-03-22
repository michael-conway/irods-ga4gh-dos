/**
 *
 */
package org.irods.jargon.ga4gh.dos.bundle.impl;

import org.irods.jargon.core.connection.IRODSAccount;
import org.irods.jargon.core.pub.IRODSAccessObjectFactory;
import org.irods.jargon.ga4gh.dos.bundle.AbstractDosService;
import org.irods.jargon.ga4gh.dos.bundle.DosServiceFactory;
import org.irods.jargon.ga4gh.dos.bundlemgmnt.ServiceInfoService;
import org.irods.jargon.ga4gh.dos.configuration.DosConfiguration;
import org.irods.jargon.ga4gh.dos.model.DrsServiceType;
import org.irods.jargon.ga4gh.dos.model.DrsServiceType.ArtifactEnum;
import org.irods.jargon.ga4gh.dos.model.InlineResponse200;
import org.irods.jargon.ga4gh.dos.model.ServiceOrganization;
import org.irods.jargon.ga4gh.dos.utils.Ga4ghVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.threeten.bp.OffsetDateTime;

/**
 * Generate service info endpoint responses
 * @author conwaymc
 *
 */
public class ServiceInfoServiceImpl extends AbstractDosService implements ServiceInfoService {

	private static final Logger log = LoggerFactory.getLogger(ServiceInfoServiceImpl.class);


	public ServiceInfoServiceImpl(IRODSAccessObjectFactory irodsAccessObjectFactory, IRODSAccount irodsAccount,
			DosServiceFactory dosServiceFactory, DosConfiguration dosConfiguration) {
		super(irodsAccessObjectFactory, irodsAccount, dosServiceFactory, dosConfiguration);
	}

	@Override
	public InlineResponse200 generateServiceInfoFromConfig() {
		log.info("generateServiceInfoFromConfig()");
		InlineResponse200 inlineResponse200 = new InlineResponse200();
		inlineResponse200.setName(this.getDosConfiguration().getServiceName());
		inlineResponse200.setContactUrl(this.getDosConfiguration().getContactUrl());
		inlineResponse200.setCreatedAt(OffsetDateTime.parse(Ga4ghVersion.BUILD_TIME));
		inlineResponse200.setDescription(this.getDosConfiguration().getServiceDescription());
		inlineResponse200.setDocumentationUrl(this.getDosConfiguration().getDocumentationUrl());
		inlineResponse200.setEnvironment(this.getDosConfiguration().getServiceEnvironment());
		inlineResponse200.setId(this.getDosConfiguration().getServiceId());
		
		DrsServiceType drsServiceType = new DrsServiceType();
		drsServiceType.setArtifact(ArtifactEnum.DRS);
		inlineResponse200.setInlineResponse200Type(drsServiceType);
		
		ServiceOrganization serviceOrganization = new ServiceOrganization();
		serviceOrganization.setName(this.getDosConfiguration().getServiceOrganizationName());
		serviceOrganization.setUrl(this.getDosConfiguration().getServiceUrl());
		
		inlineResponse200.setOrganization(serviceOrganization);
		inlineResponse200.setUpdatedAt(OffsetDateTime.parse(Ga4ghVersion.BUILD_TIME));
		inlineResponse200.setVersion(Ga4ghVersion.VERSION);
		return inlineResponse200;

	}

}
