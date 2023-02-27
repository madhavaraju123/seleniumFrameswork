package com.safexp.MDM.automation.pagelibrary;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class BillingLandingPage {
	Logger log = Logger.getLogger(BillingLandingPage.class.getName());

	public void submitBillingPage(String aliasname, String subtype, String subtypeinput, String billingcycle,
			String paymentterm, String toa, String tod, String billformat, String billingby) {
		// clickOnBillingLevel_DetailedLink();
		log.info("BillingLandingPage:submitBillingPage method");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		
		clickOnBillingLevel();
		setAliasName(aliasname);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		clickOnBillingsubLevel();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		setBillingsubType(subtype);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		setSubTypeInputVal(subtypeinput);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		clickOnBillingDetails();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		setBillingCycle(billingcycle);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		setBillingPaymentTerm(paymentterm);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		clickTOD_Radio();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		setBillingTurnOverAmt(toa);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		setBillingTodBasedOn(tod);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		setBillingFormat(billformat);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		setBillingBy(billingby);
	}

	private void clickTOD_Radio() {
		log.info("clicking TOD radio button");
		UtilityClass.fn_Click("Billing_TOD_RADIO_BUTTON_YES");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void billingAssignBranch(String billingbranch) {
		log.info("setting bill assign branch");
		UtilityClass.fn_Click("Billing_billingBranch");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Input("Billing_billingBranchpopupInput", billingbranch);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("Billing_billingBranchPopupSearchIcon");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("Billing_billingBranchPopupSelectBranch");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		clickOnSave();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void billingSubmissionBranch(String submissionbranch) {
		log.info("setting submission branch");
		UtilityClass.fn_Click("Billing_submissionBranch");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Input("Billing_submissionBranchPopupInput", submissionbranch);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("Billing_submissionBranchPopupSearchIcon");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("Billing_submissionBranchPopupSelectBranch");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		clickOnSave();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void billingCollectionBranch(String collectionbranch) {
		log.info("setting collection branch");
		UtilityClass.fn_Click("Billing_collectionBranch");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Input("Billing_collectionBranchPopupInput", collectionbranch);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("Billing_collectionBranchPopupSearchIcon");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("Billing_collectionBranchPopupSelectBranch");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		clickOnSave();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void setExcludeBillingDate(String date) {
		String[] dt = date.split("-");
		String day = dt[0];
		String month = dt[1].toUpperCase();
		String year = dt[2];
		UtilityClass.fn_Click("Billing_excludeBillingDate_CalIcon");
		UtilityClass.fn_Click("Billing_excludeBillingDate_yeardropdown");
		List<WebElement> yearList = UtilityClass.fn_getWebelements("Billing_excludeBillingDate_selectyear");
		int listsize = yearList.size();
		for (int i = 0; i < listsize; i++) {
			String s = yearList.get(i).getText();
			if (s.equals(year)) {
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(yearList.get(i)).click().build().perform();
				break;

			}
		}
		List<WebElement> monthList = UtilityClass.fn_getWebelements("Billing_excludeBillingDate_selectmonth");
		int n = monthList.size();
		for (int i = 0; i < n; i++) {
			String s = monthList.get(i).getText();
			if (s.equals(month)) {
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(monthList.get(i)).click().build().perform();
				break;

			}
		}
		List<WebElement> dayList = UtilityClass.fn_getWebelements("Billing_excludeBillingDate_selectday");
		int d = dayList.size();
		for (int i = 0; i < d; i++) {
			String s = dayList.get(i).getText();
			if (s.equals(day)) {
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(dayList.get(i)).click().build().perform();
				break;

			}
		}

	}

	public void setBillingByDetails(String billingbranch, String submissionbranch, String collectionbranch,
			String gstin, String minbillamt, String tan, String ebillemail, String bdmemail, String commemail,
			String addr1, String addr2, String addr3, String GBCategory, String pincode) {
		
		UtilityClass.fn_Click("Billing_excludeBillingNORadioOption");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		
		log.info("providing TAN");
		UtilityClass.fn_Input("Billing_TAN", tan);
		
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		setGBCategory(GBCategory);
		
		log.info("providing minimum bill amount");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Input("Billing_MinBillAmt", minbillamt);
		
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("BLP (setBillingByDetails): Entering Billing Credit Limit");
		UtilityClass.fn_Input("Billing_CreditLimit", "10000");
		
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("BLP (setBillingByDetails): Entering Billing Monthly Potential");
		UtilityClass.fn_Input("Billing_MonthlyPotential", "100000");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		
		billingAssignBranch(billingbranch);
		
		billingSubmissionBranch(submissionbranch);
		
		billingCollectionBranch(collectionbranch);
			
		log.info("providing e-bill emailid");
		addEBillEmailId(ebillemail);
		// log.info("BDM-emailid");
		// UtilityClass.fn_Input("BDM_emailid",bdmemail);
		log.info("communication emailid");
		addCommEmailId(commemail);
		//UtilityClass.fn_Input("Communication_emailid", commemail);
		
		setBillingAddress(addr1, addr2, addr3, pincode);
		// UtilityClass.fn_Click("Billing_excludeBillingYESRadioOption");
		// setExcludeBillingDate("23-APR-2020");
		// UtilityClass.fn_Click("Billing_excludeBillingNORadioOption");
	
		// log.info(excludeBilling);
		// if (excludeBilling.equalsIgnoreCase("Yes")) {

		// } else {
		// // setExcludeBillingDate("23-APR-2020");
		// UtilityClass.fn_Click("Billing_excludeBillingNORadioOption");
		// }
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
		log.info("Added Billing page details");
	}

	private void addCommEmailId(String commemail) {
		UtilityClass.fn_Click("BILLING_CLICK_ON_ADD__comm_EMAIL");
		//input[@name='searchbyname']
		UtilityClass.fn_Input("Ebill_emailid", commemail);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("Billing_EBill_Save_button");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);	
	}

	private void addEBillEmailId(String ebillemail) {
		//*[@id="cdk-accordion-child-0"]/div/mat-card-content/div[2]/table/tbody/tr/td[13]/strong/em
		UtilityClass.fn_Click("BILLING_CLICK_ON_ADD_EMAIL");
		//input[@name='searchbyname']
		UtilityClass.fn_Input("Ebill_emailid", ebillemail);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("Billing_EBill_Save_button");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void setBillingAddress(String addr1, String addr2, String addr3, String pincode) {
		log.info("BillingLandingPage:setBillingAddress method");
		log.info("clicking on plus to add addresses");
		UtilityClass.fn_Click("Billing_billToAddress");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("providing first address");
		UtilityClass.fn_Input("Billing_billToAddress1", addr1);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("providing second address");
		UtilityClass.fn_Input("Billing_billToAddress2", addr2);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("providing third address");
		UtilityClass.fn_Input("Billing_billToAddress3", addr3);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("inserting Pincode");
		UtilityClass.fn_Input("Billing_billToPincode", pincode);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_4S);
		UtilityClass.fn_Click("Billing_billToPincode_select");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
		log.info("clicking on save button");
		UtilityClass.fn_Click("Billing_billToAddressSave");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
	}

	public void setGBCategory(String category) {
		log.info("clicking on billing GBcategory dropdown");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("Billing_GBcategory");
		log.info("list of GBcategory is being fetched");
		List<WebElement> serviceList = UtilityClass.fn_getWebelements("Billing_GBcategoryOptions");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		int listsize = serviceList.size();
		log.info("Expected GBcategory is searched in list");
		for (int i = 0; i < listsize; i++) {
			WebElement we = serviceList.get(i);
			String s = we.getText();
			if (s.equals(category)) {
				log.info("found expected GBcategory and is being clicked");
				// Actions ac=new Actions(UtilityClass.driver);
				// ac.moveToElement(we).perform();
				we.click();
				UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
				break;

			} else {
				log.info("Expected GBcategory is not matched");
			}
		}
	}

	public void clickOnBillingLevel_DetailedLink() {
		log.info("clicking on Detailed link of billing page");
		UtilityClass.fn_Click("BillingLevel_DetailedLink");
	}

	public void clickOnBillingLevel() {
		log.info("clicking on billing level option");
		UtilityClass.fn_Click("BillingLevel");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void setAliasName(String name) {
		log.info("Alias name is being entered");
		UtilityClass.fn_Input("BillingLevel_MSA_aliasName", name);
	}

	public void clickOnBillingsubLevel() {
		log.info("clicking on billing sublevel option");
		UtilityClass.fn_Click("BillingsubLevel_MSA");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void setBillingsubType(String subtype) {
		log.info("clicking on billing subType dropdown");
		UtilityClass.fn_clickByAction("BillingsubType_MSA");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("list of billing subtype is being fetched");
		List<WebElement> deliveryList = UtilityClass.fn_getWebelements("BillingsubTypeOptions_MSA");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		int listsize = deliveryList.size();
		log.info("search of subtype in the list is being done ");
		for (int i = 0; i < listsize; i++) {
			String s = deliveryList.get(i).getText();
			if (s.equals(subtype)) {
				log.info("billing subtype matched with expected");
				WebElement we = deliveryList.get(i);
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(we).perform();
				log.info("billing subtype is being clicked ");
				ac.click().perform();
				UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
				break;
			} else {
				log.info("billing subtype not matched with expected");
			}
		}
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void setSubTypeInputVal(String val) {
		log.info("providing value to subtype inputbox");
		UtilityClass.fn_Input("BillingsubTypeInputVal_MSA", val);
	}

	public void clickOnBillingDetails() {
		log.info("clicking on billing details link");
		UtilityClass.fn_Click("BillingDetails_MSA");
	}

	public void setBillingCycle(String val) {
		log.info("clicking cycle option");
		UtilityClass.fn_clickByAction("BillingCycle_MSA");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("list of billing cycle is being fetched");
		List<WebElement> deliveryList = UtilityClass.fn_getWebelements("BillingCycleOption_MSA");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		int listsize = deliveryList.size();
		log.info("looking expected billing cycle into list");
		for (int i = 0; i < listsize; i++) {
			String s = deliveryList.get(i).getText();
			if (s.equals(val)) {
				log.info("expexted billing cycle found and is being clicked");
				WebElement we = deliveryList.get(i);
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(we).perform();
				we.click();
				UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
				break;
			}
		}
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void setBillingPaymentTerm(String val) {
		log.info("billing paymentterm is being clicked");
		UtilityClass.fn_clickByAction("BillingPaymentTerm_MSA");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("list of billing payment term is being fetched");
		List<WebElement> deliveryList = UtilityClass.fn_getWebelements("BillingPaymentTermOption_MSA");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		int listsize = deliveryList.size();
		log.info("looking expected billing payment term into list ");
		for (int i = 0; i < listsize; i++) {
			String s = deliveryList.get(i).getText();
			if (s.equals(val)) {
				log.info("Expected billing payment term is found and is being clicked");
				WebElement we = deliveryList.get(i);
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(we).perform();
				ac.click().perform();
				UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
				break;
			} else {
				log.info("Expected billing payment term is not matched");
			}
		}
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void setBillingTurnOverAmt(String val) {
		log.info("providing value to BillingTurnOverAmt input field");
		UtilityClass.fn_Input("BillingTurnOverAmt_MSA", val);
	}

	public void setBillingTodBasedOn(String val) {
		log.info("clicking on BillingTodBasedOn dropdown");
		UtilityClass.fn_clickByAction("BillingTodBasedOn_MSA");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("list of BillingTodBasedOnOption is being fetched");
		List<WebElement> deliveryList = UtilityClass.fn_getWebelements("BillingTodBasedOnOption_MSA");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		int listsize = deliveryList.size();
		log.info("looking expected value into list");
		for (int i = 0; i < listsize; i++) {
			String s = deliveryList.get(i).getText();
			if (s.equals(val)) {
				log.info("Expected is found and is being clicked");
				WebElement we = deliveryList.get(i);
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(we).perform();
				ac.click().perform();
				UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
				break;
			} else {
				log.info("Expected is not matched");
			}
		}
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void setBillingFormat(String val) {
		log.info("clicking on billing format dropdown");
		UtilityClass.fn_clickByAction("BillingFormat_MSA");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("list of billing format is being fetched");
		List<WebElement> deliveryList = UtilityClass.fn_getWebelements("BillingFormatOption_MSA");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		int listsize = deliveryList.size();
		log.info("looking expected billing format into list");
		for (int i = 0; i < listsize; i++) {
			String s = deliveryList.get(i).getText();
			if (s.equals(val)) {
				log.info("found expected billing format and is being clicked");
				WebElement we = deliveryList.get(i);
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(we).perform();
				we.click();
				UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
				break;
			} else {
				log.info("Expected billing format is not matched");
			}
		}
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void setBillingBy(String val) {
		log.info("clicking billingby dropdown");
		UtilityClass.fn_clickByAction("BillingBy_MSA");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("list of billingby options is being  fetched");
		List<WebElement> deliveryList = UtilityClass.fn_getWebelements("BillingByOption_MSA");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		int listsize = deliveryList.size();
		log.info("expected billingby option is being searched in list");
		for (int i = 0; i < listsize; i++) {
			String s = deliveryList.get(i).getText();
			if (s.equals(val)) {
				log.info("found expected option and is being clicked");
				WebElement we = deliveryList.get(i);
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(we).perform();
				we.click();
				UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
				break;
			} else {
				log.info("expected option is not matched");
			}
		}
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void validateSFXcode(String sfxcode) {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("validating sfxcode present on billing page");
		log.info(UtilityClass.fn_getText("SFXcodeOnBillingPage"));
		// UtilityClass.fn_validateText("SFXcodeOnBillingPage",sfxcode);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void validatePRCcode(String PRCcode) {
		log.info("validating PRCcode present on billing page");
		log.info(UtilityClass.fn_getText("PRCcodeOnBillingPage"));
		// UtilityClass.fn_validateText("PRCcodeOnBillingPage",PRCcode);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void validateAccountid(String ServiceaccountId) {
		UtilityClass.fn_validateText("BillingLandingPage_serviceaccountId", ServiceaccountId);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_isChecked("BillingLandingPage_RateCardRadioButton");
	}

	public void validateAccountidForPRCCustomer(String ServiceaccountId) {
		UtilityClass.fn_validateText("BillingLandingPage_serviceaccountId", ServiceaccountId);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		// UtilityClass.fn_isChecked("BillingLandingPage_RateCardRadioButton");
	}

	public void clickOnNext() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("clicking on Next button of billing page");
		UtilityClass.fn_Click("BillingNextButton");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
	}

	public void clickOnSave() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("Billing_collectionBranchSelectSavebt");
		log.info("Billing Save Clicked");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
	}
}
