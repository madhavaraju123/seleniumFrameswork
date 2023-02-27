package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class BookingContractHomePage {
	Logger log=Logger.getLogger(BookingContractHomePage.class.getName());
	
	public void createContract(String ContractStartDt,String ContractEndDt) throws Exception
	{
		
		UtilityClass.fn_InputAndPressEnter("BookingAssociateContractHomePage_ContractEndDt", ContractEndDt);
		Thread.sleep(2000);
		UtilityClass.fn_InputAndPressEnter("BookingAssociateContractHomePage_SignDt", ContractStartDt);
		UtilityClass.fn_InputAndPressEnter("BookingAssociateContractHomePage_ContractStartDt", ContractStartDt);
		Thread.sleep(2000);
		UtilityClass.fn_Click("BookingAssociateContractHomePage_billingCycle_Dropdn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("BookingAssociateContractHomePage_billingCycle_DropdnOption2");
		Thread.sleep(2000);
		UtilityClass.fn_Click("BookingAssociateContractHomePage_CreateContract_btn");
		
	}
	public void clickUpdateContract() throws Exception
	{
		Thread.sleep(2000);
		UtilityClass.fn_Click("BookingAssociateContractHomePage_CreateContract_btn");
	}
}
