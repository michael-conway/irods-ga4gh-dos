package org.irods.jargon.ga4gh.dos.bundlemgmnt.unittest;

import org.irods.jargon.ga4gh.dos.bundle.impl.ServiceInfoServiceImplTest;
import org.irods.jargon.ga4gh.dos.bundlemgmnt.impl.DataBundleChecksumVisitorTest;
import org.irods.jargon.ga4gh.dos.bundlemgmnt.impl.ExplodedDosBundleManagementServiceImplTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DataBundleChecksumVisitorTest.class, ExplodedDosBundleManagementServiceImplTest.class, DataBundleChecksumVisitorTest.class, 
	ExplodedDosBundleManagementServiceImplTest.class, ServiceInfoServiceImplTest.class })
public class AllTests {

}
