package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class RateCardLandingPage {
	Logger log = Logger.getLogger(RateCardLandingPage.class.getName());

	public void addNewRateCard() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
		log.info("Adding new Rate Card");
		UtilityClass.fn_Click("customer_creditpage4_ratecard_addnew");
		log.info("Adding new Rate Card Clicked");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void clickOnRateCardDetails() {
		UtilityClass.fn_Click("RateCardLandingPage_rateCardDetails");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void deleteRateCard() {
		UtilityClass.fn_Click("RateCardLandingPage_Click_rate_card_slider");
		UtilityClass.fn_Click("RateCardLandingPage_deleteRateCard");
		UtilityClass.fn_Click("RateCardLandingPage_deleteRateCard_confirmationOK");
	}

	public void clickOnSave() {

	}

	public void submitService(String service) {
		// setServiceLine(service);
		// setServiceOffering();
		clickOnSave();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void clickOnCommercialSurface() {
		// UtilityClass.fn_Click("CommercialSurfaceLink");
		clickOnCommercialSurface_addNew();
		log.info("RCLP : -- clicked on commercial link");
	}

	public void clickOnCommercialSurface_addNew() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
		UtilityClass.fn_Click("CommercialSurface_addNew");
		log.info("RCLP : -- clicked on Add new commercial");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
	}

	public void clickOnCommandment() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("CommandmentLink");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void clickOnTnCLink() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("TnCLink");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void clickOnSLALink() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("SLALink");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void clickOnVMILink() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("VMILink");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void clickOnBranchLink() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("BranchLink");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void clickNext() {
		UtilityClass.fn_Click("ratecardpageSubmit");
		//Thread.sleep(5000);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
	}

	public void validateSFXcode(String sfxcode) {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info(UtilityClass.fn_getText("SFXcodeOnRateCardPage"));
		// UtilityClass.fn_validateText("SFXcodeOnRateCardPage",sfxcode);
		//Thread.sleep(5000);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
	}

	public void validatePRCcode(String PRCcode) {
		log.info(UtilityClass.fn_getText("PRCcodeOnRateCardPage"));
		// UtilityClass.fn_validateText("PRCcodeOnRateCardPage",PRCcode);
		// Thread.sleep(5000);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
	}

	public void validateAccountid(String ServiceaccountId) {
		UtilityClass.fn_validateText("RateCardLandingPage_serviceaccountId", ServiceaccountId);
	}

	public void validateRCCode(String RCCode) {
		//Thread.sleep(2000);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		UtilityClass.fn_validateText("RateCardLandingPage_RCCode_label", RCCode);
		log.info("rate cardpage");
		UtilityClass.fn_Click("RateCardLandingPage_next_button");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}
}
