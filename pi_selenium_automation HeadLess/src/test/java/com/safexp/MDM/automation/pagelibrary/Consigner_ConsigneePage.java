package com.safexp.MDM.automation.pagelibrary;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class Consigner_ConsigneePage {
	Logger log = Logger.getLogger(Consigner_ConsigneePage.class.getName());

	public void clickOnSave() {
		log.info("clicking on save button");
		UtilityClass.fn_Click("consignor_consignee_savebt");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
	}

	public void clickOnPlusicon(String orname) {
		log.info("clicking on Plus-icon");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click(orname);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
	}

	public void createNewConsignee(String name, String gst, String tannum, String pannum, String pincodestate,
			String pincodecity, String dlrcode, String mob, String cosigntype) {
		log.info("Consigner_ConsigneePage:createNewConsignerConsignee method");
		setName("Newconsignor_consignee_name", name);
		setGST("Newconsignor_consignee_gstnum", gst);
		setTAN("Newconsignor_consignee_tannum", tannum);
		setPAN("Newconsignor_consignee_pannum", pannum);
		setPincode(pincodestate, pincodecity);
		setDealercode("Newconsignor_consignee_dealer", dlrcode);
		setMobile("Newconsignor_consignee_mob", mob);
		selectConsignType("Newconsignor_consignee_consigntype", cosigntype);
	}

	public void createNewConsigner(String name, String gst, String tannum, String pannum, String pincodestate,
			String pincodecity, String dlrcode, String mob, String cosigntype,String addr1, String addr2, String addr3) {
		log.info("Adding new  Consignor");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		setName("Newconsignor_consignee_name", name);
		log.info("Adding new Consignor Name");
		setGST("Newconsignor_consignee_gstnum", gst);
		
		log.info("Adding new Consignor GST");
		setTAN("Newconsignor_consignee_tannum", tannum);
		log.info("Adding new Consignor TAN");
		setPAN("Newconsignor_consignee_pannum", pannum);
		
		log.info("Adding new Consignor PAN");
		selectConsignorType("Newconsignor_consignee_consigntype", cosigntype);
		
		setPincode(pincodestate, pincodecity);
		
		setDealercode("Newconsignor_consignee_dealer", dlrcode);
		setMobile("Newconsignor_consignee_mob", mob);
		setAddressNewConsignor(addr1, addr2, addr3);
	}

	public void setAddressNewConsignor(String addr1, String addr2, String addr3) {
		log.info("Consigner_ConsigneePage:setAddress method");
		log.info("setting first address");
		UtilityClass.fn_Input("consignor_consignee_address1", addr1);
		log.info("setting second address");
		UtilityClass.fn_Input("consignor_consignee_address2", addr2);
		log.info("Consigner_Consignee third address");
		UtilityClass.fn_Input("consignor_consignee_address3", addr3);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		clickOnPlusicon("Newconsignor_consignee_plusicon");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		clickOnSave();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		clickOnPlusIcon();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}
	
	private void selectConsignorType(String orname, String cosigntype) {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		UtilityClass.fn_Click(orname);
		log.info("list of consignor type is being fetched");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	  //  List<WebElement> segmentlist = UtilityClass.fn_getWebelements("Newconsignor_consigntypeOptions");
		UtilityClass.fn_Click("Newconsignor_consigntypeOptions");
	//	segmentlist.get(2).click();
		log.info("Consignor has been Selected");
	}

	public void clickOnPlusIcon() {
		UtilityClass.fn_Click("NewMSApage_consignerconsigneeplusicon");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
		log.info("Adding Consignee details Clicked");
	}

	public void setAddress(String addr1, String addr2, String addr3) {
		log.info("Consigner_ConsigneePage:setAddress method");
		log.info("setting first address");
		UtilityClass.fn_Input("consignor_consignee_address1", addr1);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		log.info("setting second address");
		UtilityClass.fn_Input("consignor_consignee_address2", addr2);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		log.info("Consigner_Consignee third address");
		UtilityClass.fn_Input("consignor_consignee_address3", addr3);
		
		//UtilityClass.waitForAComponent(1000);
		try {
			Thread.sleep(Constants.WAIT_1S);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clickOnPlusicon("Newconsignor_consignee_plusicon");
		try {
			Thread.sleep(Constants.WAIT_3S);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//UtilityClass.waitForAComponent(Constants.WAIT_3S);
		clickOnSave();
	}

	public void setName(String orname, String name) {
		log.info("setting consigner/consignee name");
		UtilityClass.fn_Input(orname, name);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void setGST(String orname, String gstnum) {
		log.info("setting GST value");
		UtilityClass.fn_Input(orname, gstnum);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void setTAN(String orname, String tan) {
		log.info("setting TAN value");
		UtilityClass.fn_Input(orname, tan);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void setPAN(String orname, String pan) {
		log.info("setting PAN value");
		UtilityClass.fn_Input(orname, pan);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void setPincode(String pincodestate, String pincodecity) {
		log.info("Entering on pincode as a input in Con_COnsignee Field");
		UtilityClass.fn_Input("Newconsignor_consignee_pincode_selectcity", pincodecity);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("Newconsignor_consignee_pincode_selectcity_select");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_1S);
		log.info(pincodecity);
	}

	public void setDealercode(String orname, String dlrcode) {
		log.info("setting dealer code");
		UtilityClass.fn_Input(orname, dlrcode);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void setMobile(String orname, String mobile) {
		log.info("setting mobile number");
		UtilityClass.fn_Input(orname, mobile);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void selectConsignType(String orname, String option) {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		//log.info("clicking on consignee type dropdown");
		// UtilityClass.fn_SelectByVisibleText(orname, option);
		UtilityClass.fn_Click(orname);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		log.info("list of consignee type is being fetched");
		UtilityClass.fn_Click("NewConsignee_consigntypeOptions");
		//List<WebElement> segmentlist = UtilityClass.fn_getWebelements("NewConsignee_consigntypeOptions");
		//log.info(segmentlist.size());
		//segmentlist.get(1).click();
		log.info("Consignee Type Clicked");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		/*
		 * int listsize=segmentlist.size();
		 * log.info("expected consign type is being searched"); for(int
		 * i=0;i<listsize;i++) { String s=segmentlist.get(i).getText();
		 * //System.out.println(s); if(s.equals(option)) {
		 * log.info("found expected consign type and is being clicked");
		 * segmentlist.get(i).click();break; } }
		 */
	}

	public void filldetailsExceptAddress(String name, String dlrcode, String pannum, String tannum, String gst,
			String mob, String pincodestate, String pincodecity, String cosigntype) {
		setName("consignor_consignee_name", name);
		setGST("consignor_consignee_gstnum", gst);
		setTAN("consignor_consignee_tannum", tannum);
		setPAN("consignor_consignee_pannum", pannum);
		setPincode(pincodestate, pincodecity);
		setDealercode("consignor_consignee_dealer", dlrcode);
		setMobile("consignor_consignee_mob", mob);
		selectConsignType("consignor_consignee_consigntype", cosigntype);
	}

	public void saveDetails() {
		// clickOnPlusicon();
		clickOnSave();
	}
}
