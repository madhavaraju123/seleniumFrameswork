package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class DeliveryAssocContractUpdatePg {
	Logger log=Logger.getLogger(DeliveryAssocContractUpdatePg.class.getName());
	public void clickPaymenterms_lnk() throws Exception
	{
		UtilityClass.fn_Click("DeliveryAssocContractUpdatePg_paymentterm_lnk");
		Thread.sleep(4000);
	}

}
