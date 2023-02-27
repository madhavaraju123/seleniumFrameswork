package com.safexp.MDM.automation.pagelibrary;

import java.util.List;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class CreditContractHomePage {
	Logger log = Logger.getLogger(CreditContractHomePage.class.getName());

	public void clickOnMSA_MenuOption() {
		log.info("clicking MSA menu option");
		UtilityClass.fn_Click("MSA_menuOption");
	}

	public void clickOnMSA_Button() {
		log.info("clicking MSA button");
		UtilityClass.fn_Click("MSA_Button");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
	}

	public void clickOnOppotunity() {
		clickOnMenu();
		log.info("clicking on opportunity menuoption");
		UtilityClass.fn_Click("Opportunity_menuOption");
	}

	public void clickOnContract() {
		clickOnMenu();
		log.info("clicking on contract menu option");
		UtilityClass.fn_clickByAction("Contract_MenuOption");
	}

	public void clickOnTopCustomerName() {
		// clickOnMenu();
		// UtilityClass.fn_Click("Contract_MenuOption");
		// UtilityClass.fn_Click("firstcustomerName_Link");
		// searchCustomer();
	}

	public void searchCustomer(String customername) {
		log.info("customername is being entered to search");
		//UtilityClass.fn_Click("clickonPendingContract");
		UtilityClass.fn_Input("inputCustomerName", customername);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("searchCustomername");
		log.info("search the name in customer table");
		List<Integer> rowlist = UtilityClass.fn_searchByElementTextInWebTable("customernamelist", 1, customername);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		if (rowlist.size() != 0) {
			log.info("name found and is being clicked ");
			UtilityClass.fn_clickOnSetOfDataInWebTable1("customernamelist", rowlist, 1);
		}
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
	}

	public void searchSFXCode(String SFXcode) throws InterruptedException {
		// log.info("SFXcode is being entered to search");
		// UtilityClass.fn_Click("CreditContractHomePage_search_dd");
		// Thread.sleep(2000);
		// UtilityClass.fn_Click("CreditContractHomePage_search_optionsfxcode");
		// UtilityClass.fn_InputAndPressEnter("searchCreditCustomername",SFXcode);
		Thread.sleep(3000);
		UtilityClass.fn_Click("CreditContractHomePage_editDetails_button");
		Thread.sleep(5000);
		/*
		 * List<Integer>
		 * rowlist=UtilityClass.fn_searchByElementTextInWebTable("customernamelist",8,
		 * SFXcode); if(rowlist.size()!=0) {
		 * log.info("SFX code found and is being clicked ");
		 * UtilityClass.fn_Click("CreditContractHomePage_editDetails_button"); }
		 */
	}

	public void clickOnService() {
		clickOnMenu();
		log.info("click on service menu option");
		UtilityClass.fn_Click("Service_menuOption");
	}

	public void searchContractByMSAorSFX() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
		log.info("Search contract with SFX code -- >");
		String SFXCode = DocumentSubmissionPage.uc.getSFXCode();
		log.info(SFXCode);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("CreditContractHomePage_search_OPTIONS");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		UtilityClass.fn_Click("CreditContractHomePage_search_optionsfxcode");
		log.info("Clicked the options");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		UtilityClass.fn_Input("CreditContractHomePage_search_optionsfxcode_1", SFXCode);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("CreditContractHomePage_search_Btn_CLICK");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("Searched contract with above SFX code And Found Contract");
	}

	public void clickOnBilling() {
		clickOnMenu();
		log.info("clicking on billing menu option");
		UtilityClass.fn_Click("Billing_menuOption");
	}

	public void clickOnRatecard() {
		clickOnMenu();
		log.info("clicking ratecard menu option");
		UtilityClass.fn_Click("Ratecard_menuOption");
	}

	public void clickOnMenu() {
		log.info("clicking on Propeli menu option");
		UtilityClass.fn_clickByAction("Propeli_Menu");
	}
}
