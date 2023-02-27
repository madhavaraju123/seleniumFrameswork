package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class AirFreightContractUpdatePg {
	Logger log=Logger.getLogger(AirFreightContractUpdatePg.class.getName());
	public void clickPaymenterms_lnk() throws Exception
	{
		UtilityClass.fn_clickByAction("AirFreightContractUpdatePg_paymentterm_lnk");
		Thread.sleep(10000);
	}
	public void click_Deductionlnk() throws Exception
	{
		UtilityClass.fn_clickByAction("AirFreightContractUpdatePg_Deduction_lnk");
		Thread.sleep(4000);
	}

}
