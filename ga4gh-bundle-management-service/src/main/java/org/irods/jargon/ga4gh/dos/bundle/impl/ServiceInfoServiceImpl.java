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
import org.irods.jargon.ga4gh.dos.model.InlineResponse200;
import org.irods.jargon.ga4gh.dos.utils.Ga4ghVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
		inlineResponse200.setContactUrl(this.getDosConfiguration().getContactUrl());
		inlineResponse200.setCreatedAt(new Date(Ga4ghVersion.BUILD_TIME));
	}

}
