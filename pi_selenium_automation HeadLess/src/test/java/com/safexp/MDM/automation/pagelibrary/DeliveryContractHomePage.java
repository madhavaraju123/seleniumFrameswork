package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class DeliveryContractHomePage {
	Logger log=Logger.getLogger(DeliveryContractHomePage.class.getName());
	public void createNewContract(String ContractStartDt,String ContractEndDt,String DeliverywtSlabFrom,String DeliveryWtSlabTo) throws Exception
	{
		UtilityClass.fn_Click("DeliveryContractHomePage_SubDeliverydd");
		UtilityClass.fn_Click("DeliveryContractHomePage_SubDeliveryddOption");
		UtilityClass.fn_Input("DeliveryContractHomePage_ContractEndDt", ContractEndDt);
		Thread.sleep(2000);
		UtilityClass.fn_Input("DeliveryContractHomePage_SignDt", ContractStartDt);
		UtilityClass.fn_Input("DeliveryContractHomePage_ContractStartDt", ContractStartDt);
		Thread.sleep(2000);
		UtilityClass.fn_Click("DeliveryContractHomePage_billingCycle_Dropdn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("DeliveryContractHomePage_DropdnOption2");
		Thread.sleep(2000);
		
		
		UtilityClass.fn_Input("DeliveryContractHomePage_Dlvrywtslab_from", DeliverywtSlabFrom);
		UtilityClass.fn_Input("DeliveryContractHomePage_Dlvrywtslab_to", DeliveryWtSlabTo);
		
		UtilityClass.fn_Click("DeliveryContractHomePage_Service_surface");
		UtilityClass.fn_Click("DeliveryContractHomePage_Delivery_schedule");
		UtilityClass.fn_Click("DeliveryContractHomePage_CreateContract");
		Thread.sleep(5000);
	}

}
