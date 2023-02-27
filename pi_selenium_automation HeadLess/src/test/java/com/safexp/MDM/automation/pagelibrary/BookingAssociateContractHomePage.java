package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class BookingAssociateContractHomePage {
	Logger log=Logger.getLogger(BookingAssociateContractHomePage.class.getName());
	
	public void createContract(String ContractStartDt,String ContractEndDt) throws Exception
	{
		UtilityClass.fn_Input("BookingAssociateContractHomePage_ContractStartDt", ContractStartDt);
		UtilityClass.fn_Input("BookingAssociateContractHomePage_ContractEndDt", ContractEndDt);
		UtilityClass.fn_Click("BookingAssociateContractHomePage_billingCycle_Dropdn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("BookingAssociateContractHomePage_billingCycle_DropdnOption2");
		UtilityClass.fn_Click("BookingAssociateContractHomePage_CreateContract_btn");
		
	}
	public void clickUpdateContract() throws Exception
	{  
		Thread.sleep(2000);
		UtilityClass.fn_Click("BookingAssociateContractHomePage_CreateContract_btn");
		Thread.sleep(2000);
	}
}
