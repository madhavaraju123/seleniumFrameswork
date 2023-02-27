package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class CargoContractHomePage {
	Logger log=Logger.getLogger(CargoContractHomePage.class.getName());
	public void createNewContract(String ContractStartDt,String ContractEndDt) throws Exception
	{
		UtilityClass.fn_clickByAction("CargoContractHomePage_billingCycle_Dropdn");
		Thread.sleep(2000);
		
		UtilityClass.fn_Click("CargoContractHomePage_DropdnOption2");
		UtilityClass.fn_clickByAction("CargoContractHomePage_Associatetype_Dropdn");
		Thread.sleep(2000);
		
		UtilityClass.fn_Click("CargoContractHomePage_AssociatetypeOption");
		UtilityClass.fn_applyTAB("CargoContractHomePage_Associatetype_Dropdn");
		
		UtilityClass.fn_Input("CargoContractHomePage_SignDt", ContractStartDt);
		Thread.sleep(2000);
		UtilityClass.fn_InputAndPressEnter("CargoContractHomePage_ContractStartDt", ContractStartDt);
		Thread.sleep(20000);
		//UtilityClass.fn_Input("AirContractHomePage_ContractEndDt", ContractEndDt);
		
			
		//UtilityClass.fn_Click("DeliveryContractHomePage_CreateContract");
		
	}
}
