package com.safexp.MDM.automation.pagelibrary;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class ServicesLandingPage {
	Logger log = Logger.getLogger(ServicesLandingPage.class.getName());

	public void setServiceLine(String serviceline) {
		UtilityClass.fn_Click("customer_creditpage3_serviceline");
		UtilityClass.fn_Click("customer_creditpage3_serviceline_option");

//		Actions ac = new Actions(UtilityClass.driver);
//		ac.moveToElement(we).perform();
//		log.info("clicking on service line dropdown");
//		we.click();
		// List<WebElement> serviceoptions =
		// UtilityClass.fn_getWebelements("customer_creditpage3_serviceline_option");
		// serviceoptions.get(1).click();
//		for (int i = 0; i < serviceoptions.size(); i++) {
//			String s = serviceoptions.get(i).getText().toString();
//			if (s.trim().equals(serviceline)) {
//				log.info("Selecting service line");
//				log.info(serviceline + " --- "+  serviceoptions.get(i).getText());
//				WebElement we1 = serviceoptions.get(i);
//				ac.moveToElement(we1).perform();
//				UtilityClass.waitForAComponent(Constants.WAIT_2S);
//				we1.click();
//				break;
//			} else {
//				log.info("service line is not matched");
//			}
//		}
	}

	public void setServiceLine_ExistingCustomer(String serviceline) {
		UtilityClass.fn_Click("customer_creditpage3_serviceline");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		UtilityClass.fn_Click("customer_creditpage3_serviceline_option");

//		WebElement we = UtilityClass.getWebElement("customer_creditpage3_serviceline");
//		Actions ac = new Actions(UtilityClass.driver);
//		ac.moveToElement(we).perform();
//		log.info("clicking on service line drop down");
//		we.click();
//		// UtilityClass.fn_Click("customer_creditpage3_serviceline_option");
//		List<WebElement> serviceOptions = UtilityClass.fn_getWebelements("customer_creditpage3_serviceline_option");
//		log.info("Clicked Distribution Option");
//		serviceOptions.get(1).click();
	}

	public void submitService_ExistingCustomer(String serviceline, String serviceoffer) {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
		setServiceLine_ExistingCustomer(serviceline);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_4S);
		setServiceOffering_existingCustomer(serviceoffer);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_4S);
		clickOnSave();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void setServiceOffering(String serviceoffer) {
		UtilityClass.fn_Click("service_offering");
		log.info("Clicked Service Offering");

//		String str[] = null;
//		if (serviceoffer.contains(",")) {
//			log.info("preparing the list of service offering");
//			str = serviceoffer.split(",");
//		} else {
//			str = new String[1];
//			str[0] = serviceoffer;
//		}
//		int options = str.length;
//		List<WebElement> serviceoptions = UtilityClass.fn_getWebelements("service_offering");
//		int n = serviceoptions.size();
//		log.info("service offering is being selected");
//		log.info(n);
//		for (int j = 0; j < options; j++) {
//			String option = str[j];
//			for (int i = 0; i < n; i++) {
//				WebElement wb = serviceoptions.get(i);
//				String s = wb.getText();
//				log.info(s);
//				if (s.equals(option)) {
//					Actions ac = new Actions(UtilityClass.driver);
//					ac.moveToElement(wb).perform();
//					UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
//					ac.click().perform();
//					wb.click();
//					// wb.click();
//				}
//			}
//		}
	}

	public void setServiceOffering_existingCustomer(String serviceoffer) {
		String str[] = null;
		if (serviceoffer.contains(",")) {
			log.info("preparing the list of service offering");
			str = serviceoffer.split(",");
		} else {
			str = new String[1];
			str[0] = serviceoffer;
		}
		int options = str.length;
		List<WebElement> serviceoptions = UtilityClass.fn_getWebelements("service_offering_existing");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		int n = serviceoptions.size();
		log.info("service offering is being selected");
		log.info(n);
		for (int j = 0; j < options; j++) {
			String option = str[j];
			for (int i = 0; i < n; i++) {
				WebElement wb = serviceoptions.get(i);
				String s = wb.getText();
				if (UtilityClass.fn_isCheckboxSelected(wb)) {
					log.info("The element selected is --> " + wb.getText());
					break;
				} else {
					log.info(s);
					if (s.equals(option)) {
						Actions ac = new Actions(UtilityClass.driver);
						ac.moveToElement(wb).perform();
						UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
						ac.click().perform();
						wb.click();
						UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
						wb.click();
						log.info("The element selected is --> " + wb.getText());
						break;
					}
				}
			}
		}
	}

	public void clickOnSave() {
		UtilityClass.fn_Click("Service_next_button");
		log.info("next button is clicked");
	}

	// TODO - new customer
	public void submitService(String serviceline, String serviceoffer) {
		setServiceLine(serviceline);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		setServiceOffering(serviceoffer);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		clickOnSave();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_4S);
	}

	public void validateSFXcode(String sfxcode) {
		log.info("sfxcode is being validated");
		log.info(UtilityClass.fn_getText("SFXcodeOnServicePage"));
		// UtilityClass.fn_validateText("SFXcodeOnServicePage",sfxcode);
	}

	public void validatePRCcode(String PRCcode) throws Exception {
		log.info("PRCcode is being validated");
		Thread.sleep(3000);
		log.info(UtilityClass.fn_getText("PRCcodeOnServicePage"));
		// UtilityClass.fn_validateText("PRCcodeOnServicePage",PRCcode);
	}

	public void validateAccountidAndOffering(String ServiceaccountId) throws InterruptedException {
		Thread.sleep(2000);
		UtilityClass.fn_validateText("ServicesLandingPage_serviceaccountId", ServiceaccountId);
		boolean status = UtilityClass.fn_isChecked("ServicesLandingPage_surfaceCheckBox");
		if (status) {
			log.info("service offering is matched");
		} else {
			log.info("service offering is not matched");
		}
	}

	public void validateAccountidAndOfferingForPRCCustomer(String ServiceaccountId) {
		UtilityClass.fn_validateText("ServicesLandingPage_serviceaccountId", ServiceaccountId);
		boolean status = UtilityClass.fn_isChecked("ServicesLandingPage_surfaceCheckBox_PRCCustomer");
		if (status) {
			log.info("service offering is matched");
		} else {
			log.info("service offering is not matched");
		}

	}

	public void validateRCCodeAndOffering(String RCCode) throws InterruptedException {
		log.info("service landing page RCCode being validated");
		Thread.sleep(3000);
		// UtilityClass.fn_getText("ServicesLandingPage_RCCode");
		// UtilityClass.fn_validateText("ServicesLandingPage_RCCode",RCCode);
		/*
		 * boolean status=UtilityClass.fn_isChecked("ServicesLandingPage_AIRCheckBox");
		 * // log.info(status); if(status) log.info("service offering is matched"); else
		 * log.info("service offering is not matched");
		 */

		UtilityClass.fn_Click("ServicesLandingPage_next_button");
		Thread.sleep(3000);
	}
}