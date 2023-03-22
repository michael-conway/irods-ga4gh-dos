/**
 * 
 */
package org.irods.jargon.ga4gh.dos.services.impl;

import org.irods.jargon.core.connection.IRODSAccount;
import org.irods.jargon.core.pub.IRODSAccessObjectFactory;
import org.irods.jargon.extensions.datatyper.DataTypeResolutionService;
import org.irods.jargon.extensions.datatyper.DataTypeResolutionServiceFactory;
import org.irods.jargon.ga4gh.dos.configuration.DosConfiguration;
import org.irods.jargon.ga4gh.dos.services.IrodsDataObjectService;
import org.irods.jargon.ga4gh.dos.services.IrodsDataObjectServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Implementation of a factory for the @link DataTypeService}
 * 
 * @author Mike Conway - NIEHS
 *
 */
@Component("dataObjectServiceFactory")
public class IrodsDataObjectServiceFactoryImpl extends IrodsDataObjectServiceFactory {

	@Autowired
	DataTypeResolutionServiceFactory dataTypeResolutionServiceFactory;

	@Autowired
	IRODSAccessObjectFactory irodsAccessObjectFactory;

	@Autowired
	DosConfiguration dosConfiguration;

	@Override
	public IrodsDataObjectService instance(IRODSAccount irodsAccount) {
		if (irodsAccount == null) {
			throw new IllegalArgumentException("null irodsAccount");
		}

		DataTypeResolutionService dataTypeResolutionService = dataTypeResolutionServiceFactory
				.instanceDataTypeResolutionService(irodsAccount);

		return new IrodsDataObjectServiceImpl(this.getIrodsAccessObjectFactory(), irodsAccount,
				this.getDosConfiguration(), dataTypeResolutionService);

	}

	public DataTypeResolutionServiceFactory getDataTypeResolutionServiceFactory() {
		return dataTypeResolutionServiceFactory;
	}

	public void setDataTypeResolutionServiceFactory(DataTypeResolutionServiceFactory dataTypeResolutionServiceFactory) {
		this.dataTypeResolutionServiceFactory = dataTypeResolutionServiceFactory;
	}

	@Override
	public IRODSAccessObjectFactory getIrodsAccessObjectFactory() {
		return irodsAccessObjectFactory;
	}

	@Override
	public void setIrodsAccessObjectFactory(IRODSAccessObjectFactory irodsAccessObjectFactory) {
		this.irodsAccessObjectFactory = irodsAccessObjectFactory;
	}

	@Override
	public DosConfiguration getDosConfiguration() {
		return dosConfiguration;
	}

	@Override
	public void setDosConfiguration(DosConfiguration dosConfiguration) {
		this.dosConfiguration = dosConfiguration;
	}

}
