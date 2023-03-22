/**
 * 
 */
package org.irods.jargon.ga4gh.dos.configuration;

import org.irods.jargon.core.connection.AuthScheme;
import org.irods.jargon.ga4gh.dos.exception.DosSystemException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * Bean impl of {@link DosConfigInterface}
 * 
 * @author Mike Conway - NIEHS
 *
 */

@PropertySources({ @PropertySource(value = "/test.dos.properties", ignoreResourceNotFound = true),
		@PropertySource(value = "file:/etc/irods-ext/ga4gh.properties", ignoreResourceNotFound = true) })

@Component
public class DosConfiguration {

	@Value("${irods.host}")
	private String irodsHost;

	@Value("${irods.zone}")
	private String irodsZone;

	@Value("${proxy.user}")
	private String proxyUser;

	@Value("${proxy.password}")
	private String proxyPassword;

	@Value("${shared.jwt.key}")
	private String sharedJwtKey;

	@Value("${jwt.algo}")
	private String jwtAlgo;

	@Value("${irods.port}")
	private int port;

	@Value("${irods.realm}")
	private String realm;

	@Value("${drs.server.name}")
	private String drsServerName;

	@Value("${auth.type}")
	private String authScheme;

	@Value("${ssl.negotiation.policy}")
	private String sslNegotiationPolicy;

	@Value("${irodsext.datatyper.persist.data.types}")
	private boolean persistDataTypes;

	@Value("${irodsext.datatyper.detailed.determination}")
	private boolean detailedDataTypeDetermination;

	@Value("${shared.jwt.key}")
	private String jwtKey = "";
	
	// Service info endpoint parameters
	
	@Value("${service.id}")
	private String serviceId = "";

	@Value("${service.name}")
	private String serviceName = "";
	
	@Value("${service.type.group}")
	private String serviceTypeGroup = "";
	
	@Value("${service.type.artifact}")
	private String serviceTypeArtifact = "";
	
	@Value("${service.type.version}")
	private String serviceTypeVersion = "";
	
	@Value("${service.description}")
	private String serviceDescription = "";
	
	@Value("${service.organization.name}")
	private String serviceOrganizationName = "";
	
	@Value("${service.url}")
	private String serviceUrl = "";

	@Value("${contact.url}")
	private String contactUrl = "";
	
	@Value("${service.documentation.url}")
	private String documentationUrl = "";
	
	@Value("${service.environment}")
	private String serviceEnvironment = "";
	

	/**
	 * {@code String} property 'drs.rest.url.endpoint'. If not blank, represents the
	 * complete url prefix to the REST endpoint that will provide a link to the
	 * data. This is the standard iRODS REST endpoint in the form XXX (TODO: build
	 * rest endpoint)
	 */
	@Value("${drs.rest.url.endpoint}")
	private String drsRestUrlEndpoint = "";

	/**
	 * {@code boolean} indicating whether 'irods://' form urls are provided as an
	 * access method for data objects
	 */
	@Value("${drs.provide.irods.urls}")
	private boolean drsProvideIrodsUrls = true;

	public AuthScheme translateAuthSchemeToEnum() {
		String authSchemeStr = authScheme;
		if (authSchemeStr == null || authSchemeStr.isEmpty()) {
			return AuthScheme.STANDARD;
		} else if (authSchemeStr.equals(AuthScheme.STANDARD.toString())) {
			return AuthScheme.STANDARD;
		} else if (authSchemeStr.equals(AuthScheme.PAM.toString())) {
			return AuthScheme.PAM;
		} else {
			throw new DosSystemException("unknown authscheme");
		}
	}

	public String getIrodsHost() {
		return irodsHost;
	}

	public void setIrodsHost(String irodsHost) {
		this.irodsHost = irodsHost;
	}

	public String getIrodsZone() {
		return irodsZone;
	}

	public void setIrodsZone(String irodsZone) {
		this.irodsZone = irodsZone;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getRealm() {
		return realm;
	}

	public void setRealm(String realm) {
		this.realm = realm;
	}

	public String getDrsServerUrl() {
		return drsServerName;
	}

	public void setDrsServerUrl(String drsServerUrl) {
		this.drsServerName = drsServerUrl;
	}

	public String getAuthScheme() {
		return authScheme;
	}

	public void setAuthScheme(String authScheme) {
		this.authScheme = authScheme;
	}

	public boolean isPersistDataTypes() {
		return persistDataTypes;
	}

	public void setPersistDataTypes(boolean persistDataTypes) {
		this.persistDataTypes = persistDataTypes;
	}

	public boolean isDetailedDataTypeDetermination() {
		return detailedDataTypeDetermination;
	}

	public void setDetailedDataTypeDetermination(boolean detailedDataTypeDetermination) {
		this.detailedDataTypeDetermination = detailedDataTypeDetermination;
	}

	public void setSslNegotiationPolicy(String sslNegotiationPolicy) {
		this.sslNegotiationPolicy = sslNegotiationPolicy;
	}

	public String getSslNegotiationPolicy() {
		return sslNegotiationPolicy;
	}

	public String getDrsRestUrlEndpoint() {
		return drsRestUrlEndpoint;
	}

	public void setDrsRestUrlEndpoint(String drsRestUrlEndpoint) {
		this.drsRestUrlEndpoint = drsRestUrlEndpoint;
	}

	public boolean isDrsProvideIrodsUrls() {
		return drsProvideIrodsUrls;
	}

	public void setDrsProvideIrodsUrls(boolean drsProvideIrodsUrls) {
		this.drsProvideIrodsUrls = drsProvideIrodsUrls;
	}

	@Override
	public String toString() {
		return "DosConfiguration [irodsHost=" + irodsHost + ", irodsZone=" + irodsZone + ", proxyUser=" + proxyUser
				+ ", jwtAlgo=" + jwtAlgo + ", port=" + port + ", realm=" + realm + ", drsServerName=" + drsServerName
				+ ", authScheme=" + authScheme + ", sslNegotiationPolicy=" + sslNegotiationPolicy
				+ ", persistDataTypes=" + persistDataTypes + ", detailedDataTypeDetermination="
				+ detailedDataTypeDetermination + ", serviceId=" + serviceId + ", serviceName=" + serviceName
				+ ", serviceTypeGroup=" + serviceTypeGroup + ", serviceTypeArtifact=" + serviceTypeArtifact
				+ ", serviceTypeVersion=" + serviceTypeVersion + ", serviceDescription=" + serviceDescription
				+ ", serviceOrganizationName=" + serviceOrganizationName + ", serviceUrl=" + serviceUrl
				+ ", contactUrl=" + contactUrl + ", documentationUrl=" + documentationUrl + ", serviceEnvironment="
				+ serviceEnvironment + ", drsRestUrlEndpoint=" + drsRestUrlEndpoint + ", drsProvideIrodsUrls="
				+ drsProvideIrodsUrls + "]";
	}

	public String getProxyUser() {
		return proxyUser;
	}

	public void setProxyUser(String proxyUser) {
		this.proxyUser = proxyUser;
	}

	public String getProxyPassword() {
		return proxyPassword;
	}

	public void setProxyPassword(String proxyPassword) {
		this.proxyPassword = proxyPassword;
	}

	public String getSharedJwtKey() {
		return sharedJwtKey;
	}

	public void setSharedJwtKey(String sharedJwtKey) {
		this.sharedJwtKey = sharedJwtKey;
	}

	public String getJwtAlgo() {
		return jwtAlgo;
	}

	public void setJwtAlgo(String jwtAlgo) {
		this.jwtAlgo = jwtAlgo;
	}

	public String getJwtKey() {
		return jwtKey;
	}

	public void setJwtKey(String jwtKey) {
		this.jwtKey = jwtKey;
	}
	
	public String getDrsServerName() {
		return drsServerName;
	}

	public void setDrsServerName(String drsServerName) {
		this.drsServerName = drsServerName;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceTypeGroup() {
		return serviceTypeGroup;
	}

	public void setServiceTypeGroup(String serviceTypeGroup) {
		this.serviceTypeGroup = serviceTypeGroup;
	}

	public String getServiceTypeArtifact() {
		return serviceTypeArtifact;
	}

	public void setServiceTypeArtifact(String serviceTypeArtifact) {
		this.serviceTypeArtifact = serviceTypeArtifact;
	}

	public String getServiceTypeVersion() {
		return serviceTypeVersion;
	}

	public void setServiceTypeVersion(String serviceTypeVersion) {
		this.serviceTypeVersion = serviceTypeVersion;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getServiceOrganizationName() {
		return serviceOrganizationName;
	}

	public void setServiceOrganizationName(String serviceOrganizationName) {
		this.serviceOrganizationName = serviceOrganizationName;
	}

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getContactUrl() {
		return contactUrl;
	}

	public void setContactUrl(String contactUrl) {
		this.contactUrl = contactUrl;
	}

	public String getDocumentationUrl() {
		return documentationUrl;
	}

	public void setDocumentationUrl(String documentationUrl) {
		this.documentationUrl = documentationUrl;
	}

	public String getServiceEnvironment() {
		return serviceEnvironment;
	}

	public void setServiceEnvironment(String serviceEnvironment) {
		this.serviceEnvironment = serviceEnvironment;
	}

}
