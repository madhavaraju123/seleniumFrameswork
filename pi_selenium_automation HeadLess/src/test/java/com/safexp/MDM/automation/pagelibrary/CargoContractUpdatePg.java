package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class CargoContractUpdatePg {
	Logger log=Logger.getLogger(CargoContractUpdatePg.class.getName());
public void clickPaymenterms_lnk() throws Exception
{
	UtilityClass.fn_Click("CargoContractUpdatePg_paymentterm_lnk");
	Thread.sleep(15000);
}

}
