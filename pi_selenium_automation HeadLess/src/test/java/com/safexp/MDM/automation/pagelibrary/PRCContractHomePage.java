package com.safexp.MDM.automation.pagelibrary;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class PRCContractHomePage {

	Logger log=Logger.getLogger(PRCContractHomePage.class.getName());
	
	public void searchPRCCode(String searchCustomername) throws InterruptedException
	{
		log.info("PRC code is being entered to search");
		Thread.sleep(3000);
	//UtilityClass.fn_Input("searchPRCCode",searchCustomername);
//	 UtilityClass.fn_Click("PRCContractHomePage_search_button");
	//log.info("searching PRC code");
	//	UtilityClass.fn_InputAndPressEnter("searchCustomername",searchCustomername);
		 UtilityClass.fn_Click("PRCContractHomePage_editDetails_button");
		 Thread.sleep(5000);
		/*List<Integer> rowlist=UtilityClass.fn_searchByElementTextInWebTable("customernamelist",8,SFXcode);
		if(rowlist.size()!=0) 
		{			
			log.info("SFX code found and is being clicked ");	
			
		}*/
	}
	

	
	public void clickOnMSA_MenuOption()
	{
		log.info("clicking MSA menu option");
		UtilityClass.fn_Click("MSA_menuOption");
	}
	public void clickOnMSA_Button()
	{
		log.info("clicking MSA button");
		UtilityClass.fn_Click("MSA_Button");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void clickOnOppotunity()
	{
		clickOnMenu();
		log.info("clicking on opportunity menuoption");
		UtilityClass.fn_Click("Opportunity_menuOption");
	}
	public void clickOnContract()
	{
		clickOnMenu();
		log.info("clicking on contract menu option");
		UtilityClass.fn_clickByAction("Contract_MenuOption");
		
		
	}
	public void clickOnTopCustomerName()
	{
		//clickOnMenu();
		//UtilityClass.fn_Click("Contract_MenuOption");
		//UtilityClass.fn_Click("firstcustomerName_Link");
		//searchCustomer();
		
		
	}
	public void searchCustomer(String customername)
	{
		log.info("customername is being entered to search");
		UtilityClass.fn_Input("searchPRC_Customername",customername);
		log.info("search the name in customer table");
		List<Integer> rowlist=UtilityClass.fn_searchByElementTextInWebTable("customernamelist",1,customername);
		if(rowlist.size()!=0) 
		{			
			log.info("name found and is being clicked ");	
			 UtilityClass.fn_clickOnSetOfDataInWebTable1("customernamelist",rowlist,1);
		}
	}
	
	public void clickOnService()
	{
		clickOnMenu();
		log.info("click on service menu option");
		UtilityClass.fn_Click("Service_menuOption");
	}
	
	public void searchContractByMSAorSFX()
	{
		JavascriptExecutor js = (JavascriptExecutor)UtilityClass.driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		UtilityClass.fn_Click("CreditContractHomePage_ContractRadioOption");
		UtilityClass.fn_Click("CreditContractHomePage_SearchContract");
	}
	public void clickOnBilling()
	{
		clickOnMenu();
		log.info("clicking on billing menu option");
		UtilityClass.fn_Click("Billing_menuOption");
	}
	public void clickOnRatecard()
	{
		clickOnMenu();
		log.info("clicking ratecard menu option");
		UtilityClass.fn_Click("Ratecard_menuOption");
	}
	public void clickOnMenu()
	{
		log.info("clicking on Propeli menu option");
		UtilityClass.fn_clickByAction("Propeli_Menu");
	}

}
