package com.safexp.MDM.automation.pagelibrary;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class MSAforExistingCustomer {
	Logger log = Logger.getLogger(MSAforExistingCustomer.class.getName());
	/*
	 * baselocation consigner plus icon consigner and consignee link sla next button
	 */

	public void modifyBaselocation(String branchAdvanceSearch) {
		UtilityClass.fn_Click("customer_creditpage_baselocation_search");
		UtilityClass.fn_Input("customer_creditpage_baselocation_advanceSearch", branchAdvanceSearch);
		UtilityClass.fn_Click("advancesearch_icon");
		UtilityClass.fn_Click("select_radio");
		UtilityClass.fn_Click("save_button");

	}

	public void addConsignerConsignee(String name, String dlrcode, String pannum, String tannum, String gst, String mob,
			String pin, String cosigntype, String Addr1, String Addr2, String Addr3) throws InterruptedException {
		// clickConsignerPlusicon();
		// Consigner_ConsigneePage cc=new Consigner_ConsigneePage();
		// cc.filldetailsExceptAddress(name,dlrcode,pannum,tannum,gst,mob,pin,cosigntype);
		// cc.setAddress(Addr1,Addr2,Addr3);
		// cc.clickOnSave();
		clickNext();
	}

	public void clickConsignerPlusicon() {
		UtilityClass.fn_Click("customer_creditpage_addconsigner_plusicon");
	}

	public void clickNext() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("ExistingMSA_next_button");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
	}

	public void setBaseloc(String branch) {
		Actions act = new Actions(UtilityClass.driver);
		UtilityClass.fn_Input("NewMSApage_baselocsearchInput", branch);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> branchlist = UtilityClass.fn_getWebelements("NewMSApage_baselocOptions");
		int listsize = branchlist.size();
		for (int i = 0; i < listsize; i++) {
			String s = branchlist.get(i).getText();
			// System.out.println(s);
			if (s.equals(branch)) {
				act.moveToElement(branchlist.get(i)).perform();
				branchlist.get(i).click();
				break;
			}

		}
	}

	public void setSLA(String sla) {
		UtilityClass.fn_Input("SLA_input", sla);
	}

	public void updateMSA(String baselc, String name, String dlrcode, String pannum, String tannum, String gst,
			String mob, String pin, String cosigntype, String Addr1, String Addr2, String Addr3, String sla)
			throws InterruptedException {
		modifyBaselocation(baselc);
		addConsignerConsignee(name, dlrcode, pannum, tannum, gst, mob, pin, cosigntype, Addr1, Addr2, Addr3);
		setSLA(sla);
		clickNext();
	}

	public void validateSFXcode(String sfxcode) {
		// UtilityClass.fn_validateText("SFXcodeOnMSAPage",sfxcode);
		// log.info(sfxcode);
	}

	public void validatePRCcode(String PRCcode) throws Exception {
		log.info(UtilityClass.fn_getText("PRCcodeOnMSAPage"));
		// fUtilityClass.fn_validateText("PRCcodeOnMSAPage",PRCcode);
		Thread.sleep(3000);
	}

	public void validateAccountid(String ServiceaccountId) {
		UtilityClass.fn_validateText("MSAforExistingCustomer_accountId", ServiceaccountId);
	}

	public void validatePANNumber(String PANNumber) {
		UtilityClass.fn_validateText("MSAforExistingCustomer_PANnumber", PANNumber);
	}

	public void validatePANNumberForPRCCustomer(String PANNumber) {
		UtilityClass.fn_validateText("MSAforExistingCustomer_PANnumber_ForPRCCustomer", PANNumber);
	}

}
