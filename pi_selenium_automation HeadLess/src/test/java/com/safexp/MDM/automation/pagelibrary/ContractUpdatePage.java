package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class ContractUpdatePage
{
	Logger log=Logger.getLogger(ContractUpdatePage.class.getName());
	public void ClickOnEditIcon()
	{
		log.info("clicking on GeneralEdit button");
		UtilityClass.fn_Click("CreditContractHomePage_editDetails_button");
	}
	public void clickOn_GeneralEdit() throws Exception
		{
		Thread.sleep(5000);
		log.info("clicking on GeneralEdit button");
		UtilityClass.fn_Click("GeneralEditButton");
		Thread.sleep(5000);
	}
	
	
	public void validateAccountid(String ServiceaccountId)
	{
		
		log.info(UtilityClass.fn_getText("ContractUpdatePage_serviceaccountId"));
		//UtilityClass.fn_validateText("ContractUpdatePage_serviceaccountId",ServiceaccountId);
	}
	public void clickOn_ContractTermination() throws InterruptedException
		{
		Thread.sleep(5000);
		log.info("clicking on ContractTermination button");
		UtilityClass.fn_Click("ContractUpdatePage_contractTermination_button");
		Thread.sleep(5000);
	}
	public void ValidateRetailCode( String RCCode) throws InterruptedException
	{
		log.info(UtilityClass.fn_getText("ContractUpdatePage_RetailCode"));
		UtilityClass.fn_validateText("ContractUpdatePage_RetailCode",RCCode);
		Thread.sleep(2000);
		
	}
}
