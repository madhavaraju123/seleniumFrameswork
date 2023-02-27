package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class AirContractHomePage {
	Logger log=Logger.getLogger(AirContractHomePage.class.getName());
	public void createNewContract(String ContractStartDt,String ContractEndDt) throws Exception
	{
		UtilityClass.fn_clickByAction("AirContractHomePage_billingCycle_Dropdn");
		Thread.sleep(5000);
		
		UtilityClass.fn_Click("AirContractHomePage_DropdnOption2");
		log.info("Selected billing cycle");
		UtilityClass.fn_Input("AirContractHomePage_SignDt", ContractStartDt);
		
		Thread.sleep(5000);
		UtilityClass.fn_InputAndPressEnter("AirContractHomePage_ContractStartDt", ContractStartDt);
		Thread.sleep(20000);
		//UtilityClass.fn_Input("AirContractHomePage_ContractEndDt", ContractEndDt);
		
			
		//UtilityClass.fn_Click("DeliveryContractHomePage_CreateContract");
		
	}

}	
