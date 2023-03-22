/**
 * 
 */
package org.irods.jargon.ga4gh.dos.bundlemgmnt;

import org.irods.jargon.ga4gh.dos.model.InlineResponse200;

/**
 * Interface describes a service that can produce Service Info information, describing the service and organization running
 * the service
 * @author conwaymc
 *
 */
public interface ServiceInfoService {
	
	/**
	 * Generate the response to the service info endpoint by mining the service configuration
	 * @return {@link InlineResponse200}
	 */
	InlineResponse200 generateServiceInfoFromConfig();
	
	
	

}
