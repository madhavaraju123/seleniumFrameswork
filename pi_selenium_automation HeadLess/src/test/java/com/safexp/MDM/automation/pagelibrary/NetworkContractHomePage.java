package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class NetworkContractHomePage {
	Logger log=Logger.getLogger(NetworkContractHomePage.class.getName());
	public void createNewContract(String ContractStartDt,String ContractEndDt) throws Exception
	{
		UtilityClass.fn_Click("NetworkContractHomePage_billingCycle_Dropdn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("NetworkContractHomePage_billingCycle_Option");
		log.info("billing cycle selected");
		UtilityClass.fn_Click("NetworkContractHomePage_Vehicletype_Dropdn");
		Thread.sleep(2000);
		
		UtilityClass.fn_Click("NetworkContractHomePage_vehicletypeOption");
		log.info("vehicle type selected");
		
		UtilityClass.fn_Input("NetworkContractHomePage_SignDt", ContractStartDt);
		Thread.sleep(2000);
		UtilityClass.fn_InputAndPressEnter("NetworkContractHomePage_ContractStartDt", ContractStartDt);
		Thread.sleep(15000);
		//UtilityClass.fn_Input("AirContractHomePage_ContractEndDt", ContractEndDt);
		
			
		//UtilityClass.fn_Click("DeliveryContractHomePage_CreateContract");
		
	}

}
