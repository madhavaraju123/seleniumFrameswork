package com.safexp.MDM.automation.pagelibrary;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class New_MSA_LandingPage {
	Logger log = Logger.getLogger(New_MSA_LandingPage.class.getName());

	// TODO - changed segment options code, sub-segment and pincode -- revisit
	// pincodecity
	public void createNewMSA(String name, String mobile, String addr, String landline, String pincodestate,
			String pincodecity, String poc, String pannum, String GSTN, String sla, String acctype, String segment,
			String subsegment, String loc, String monthlypotential) throws InterruptedException {

		log.info("New_MSA_LandingPage:createNewMSA method");
		setCustomerName(name);
		setMobile(mobile);
		setRegisterAddr(addr);
		setLandline(landline);
		// setPincode(pincodestate,pincodecity);
		log.info(pincodestate);
		setPincode(pincodecity);
		setContactPerson(poc);
		log.info("entering email id");
		UtilityClass.fn_Input("New_MSA_LandingPage_email_input", "ab@gmail.com");
		setPan(pannum);
		setGSTN(GSTN);
		setSLA(sla);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		setAccountType(acctype);
		// setMonthlyPotential(monthlypotential);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		setSegment(segment);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		setSubSegment(subsegment);
		setBaseLocation(loc);
		clickOnPlusIcon();
	}

	public void clickOnConsignerConsigneeDiv() {
		log.info("clicking on consigner/consignee division");
		UtilityClass.fn_Click("NewMSApage_ConsigerConsigneeDiv");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void setCustomerName(String name) {
		log.info("customer name is being entered");
		UtilityClass.fn_Input("NewMSApage_custname", name);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void setPincode(String pincode) {
		log.info("Entering on pincode as a input");
		log.info(pincode);
		UtilityClass.fn_Input("NewMSApage_pincode", pincode);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("NewMSApage_pincode_select");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_1S);
		log.info(pincode);
	}

	public void setMonthlyPotential(String mp) {
		UtilityClass.fn_Input("NewMSApage_monthlyPotential", mp);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void setRegisterAddr(String addr) {
		log.info("Registered address is being entered");
		UtilityClass.fn_Input("NewMSApage_registerAddr", addr);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void setMobile(String name) {
		log.info("mobile number is being entered");
		UtilityClass.fn_Input("NewMSApage_mobileno", name);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void setLandline(String number) {
		log.info("landline number is being entered");
		UtilityClass.fn_Input("NewMSApage_landlineno", number);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void setGroupCode(String name) {
		UtilityClass.fn_Input("NewMSApage_groupcode", name);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void setContactPerson(String name) {
		log.info("contact peson name is being entered");
		UtilityClass.fn_Input("NewMSApage_contactperson", name);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		log.info("contact peson name is entered");
	}

	public void setPan(String name) {
		log.info("pan number is being entered");
		UtilityClass.fn_Input("NewMSApage_pannum", name);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void setGSTN(String gstn) {
		log.info("GSTIN is being entered");
		UtilityClass.fn_Input("NewMSApage_GSTN", gstn);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void setSLA(String sla) {
		log.info("sla is being entered");
		UtilityClass.fn_Input("NewMSApage_sla", sla);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void clickOnPlusIcon() {
		log.info("plusicon is being clicked");
		UtilityClass.fn_Click("NewMSApage_consignerconsigneeplusicon");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
	}

	public void setAccountType(String acctype) {
		log.info("clicking on Account type dropdown");

		UtilityClass.fn_Click("NewMSApage_accType");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		log.info("list of account type is being fetched");
		UtilityClass.fn_Click("NewMSApage_accTypeoptions_CREDIT");
		// UtilityClass.fn_selectElementfromDropDown("NewMSApage_accType", "CREDIT");
		log.info("Selected the account type");
		// List<WebElement> segmentlist = UtilityClass.fn_getWebelements("NewMSApage_accTypeoptions");
		// int listsize=segmentlist.size();
		// segmentlist.get(1).click();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		/*
		 * log.info("expected account is being searched"); for(int i=0;i<listsize;i++) {
		 * String s=segmentlist.get(i).getText(); //System.out.println(s);
		 * if(s.equals(acctype)) {
		 * log.info("expected account type is found and is being clicked");
		 * segmentlist.get(i).click();break; }else
		 * {log.info("expected account type is not matched");} }
		 */

	}

	public void setSegment(String segment) {
		log.info("clicking on segment dropdown");
		Actions act = new Actions(UtilityClass.driver);
		WebElement we = UtilityClass.getWebElement(By.xpath("NewMSApage_segmentdropdown"));
		act.moveToElement(we).perform();
		we.click();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Input("NewMSApage_segmentoptions", segment);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("NewMSApage_segmentoptions_Ent");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void setSubSegment(String subsegment) {
		log.info("clicking on subsegment dropdown");
		Actions act = new Actions(UtilityClass.driver);
		WebElement we = UtilityClass.getWebElement(By.xpath( "NewMSApage_subsegmentdropdown"));
		act.moveToElement(we).perform();
		we.click();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Input("NewMSApage_subsegmentoptions", subsegment);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		UtilityClass.fn_Click("NewMSApage_subsegmentoptions_Ent");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

//	public void setBaseLocation(String branch) throws InterruptedException {
//		log.info("baselocation is being entered");
//		Actions act=new Actions(UtilityClass.driver);
//		UtilityClass.fn_Input("NewMSApage_baselocsearchInput",branch);
//		UtilityClass.wait(3000);
//		List<WebElement> branchlist=UtilityClass.fn_getWebelements("NewMSApage_baselocOptions");
//		int listsize=branchlist.size();
//		for(int i=0;i<listsize;i++) {
//			String s=branchlist.get(i).getText();
//			if(s.equals(branch)) {
//				act.moveToElement(branchlist.get(i)).perform();
//				branchlist.get(i).click();
//				break;
//			}
//		}
//		UtilityClass.wait(3000);
//	}

	// TODO - base location can be a unique entry
	public void setBaseLocation(String baseLocation) {
		log.info("Entering on baseLocation as a input");
		log.info(baseLocation);
		UtilityClass.fn_Input("NewMSApage_baselocsearchInput", baseLocation);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("NewMSApage_baselocsearchInput_options");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info(baseLocation);
	}

	public void verifyMSAcreation() {

	}

	public void selectBaseLocation(String location) {
		UtilityClass.fn_clickByAction("customer_creditpage_baselocation_search");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Input("customer_creditpage_baselocation_advanceSearch", location);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("advancesearch_icon");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("select_radio");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("save_button");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void clickNext() {
		log.info("clicking on Next button");
		UtilityClass.fn_Click("New_MSA_LandingPage_next_button");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
	}

	public void clickOnPlusicon() {
		log.info("clicking on plusicon button");
		UtilityClass.fn_Click("credit_contract_plusicon");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void clickOnSaveAsDraft() {

	}

	public void setAllDetails(String loc, String sla) {
		selectBaseLocation(loc);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		setSLA(sla);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		clickOnPlusicon();
		// clickNext();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}
}
