package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class CreditContractBurgerMenu {
	Logger log = Logger.getLogger(CreditContractBurgerMenu.class.getName());
	
	public void clickOnContractMenu() {
		log.info("clicking Contract menu ");
		UtilityClass.fn_Click("CreditContractDashboard_contract_menu");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_4S);
	}

	public void clickOnCreditMenu() {
		log.info("clicking Credit menu ");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		UtilityClass.fn_Click("CreditContractDashboard_Credit_menu");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("clicked Credit menu ");
	}

	public void clickOnPRCMenu() {
		log.info("clicking PRC menu ");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_4S);
		UtilityClass.fn_Click("CreditContractDashboard_PRC_menu");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_4S);
		log.info("clicked PRC menu ");
	}

	public void clickOnDraftMode() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
		UtilityClass.fn_Click("CreditContractHomePage_draftmode_button");
		log.info("clicked on draftMode option");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
	}
	
	public void clickOnPendingOptionCreditContract() {
		log.info("Clicking on Pending contract option");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
		UtilityClass.fn_Click("CreditContractBurgerMenu_clickonPendingContract");
		log.info("Clicked on Pending contract option");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
	}

	public void clickOnPRCDraftMode() {
		log.info("clicking on draftMode option");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
		UtilityClass.fn_Click("PRC_ContractHomePage_draftmode_link");
		log.info("clicked on draftMode option");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void clickOnActiveContracts() throws InterruptedException {
		log.info("clicking on Active Contracts option");
		Thread.sleep(5000);
		UtilityClass.fn_Click("CreditContractHomePage_activecontracts_link");
		log.info("clicked on Active Contracts option");
		Thread.sleep(3000);
	}

	public void clickOnRetailMenu() throws InterruptedException {
		log.info("clicking Retail menu ");
		Thread.sleep(5000);
		UtilityClass.fn_clickByAction("CreditContract_Retail_menu");
		Thread.sleep(35000);
		log.info("clicked Retail menu ");
	}

	public void clickOnAssociateBookingMenu() throws InterruptedException {
		log.info("clicking AssociateBooking menu ");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CreditContract_AssociateBooking_menu");
		Thread.sleep(25000);
		log.info("clicked AssociateBooking menu ");
	}

	public void clickOnAssociateDeliveryMenu() throws InterruptedException {
		log.info("clicking AssociateDelivery menu ");
		Thread.sleep(2000);
		UtilityClass.fn_Click("Contract_AssociateDelivery_menu");
		Thread.sleep(25000);
		log.info("clicked AssociateDelivery menu ");
	}

	public void clickOnAssociateAirFreightMenu() throws Exception {
		log.info("clicking AssociateAirFreight menu ");
		Thread.sleep(2000);
		UtilityClass.fn_Click("Contract_AssociateAirFreight_menu");
		Thread.sleep(25000);
		log.info("clicked AssociateAirFreight menu ");
	}

	public void clickOnAssociateCargoMenu() throws Exception {
		log.info("clicking AssociateCargo menu ");
		Thread.sleep(2000);
		UtilityClass.fn_Click("Contract_AssociateCargo_menu");
		Thread.sleep(25000);
		log.info("clicked AssociateCargo menu ");
	}

	public void clickOnAssociateNetworkMenu() throws Exception {
		log.info("clicking AssociateNetwork menu ");
		Thread.sleep(2000);
		UtilityClass.fn_clickByAction("Contract_AssociateNetwork_menu");
		Thread.sleep(25000);
		log.info("clicked AssociateNetwork menu ");
	}
}
