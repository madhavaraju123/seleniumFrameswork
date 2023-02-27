package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class NetworkContractUpdatePg {
	Logger log=Logger.getLogger(DeliveryAssocContractUpdatePg.class.getName());
	public void click_Paymentterms_lnk() throws Exception
	{
		UtilityClass.fn_Click("NetworkContractUpdatePg_Paymentterms_lnk");
		Thread.sleep(4000);
	}
}
