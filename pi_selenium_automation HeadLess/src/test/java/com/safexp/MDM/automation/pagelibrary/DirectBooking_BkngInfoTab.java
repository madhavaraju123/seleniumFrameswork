package com.safexp.MDM.automation.pagelibrary;

import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class DirectBooking_BkngInfoTab {
	Logger log = Logger.getLogger(DirectBooking_BkngInfoTab.class.getName());

	public void addBookingInformation(String SFXcode, String pincode, String time, String secs) {

		try {
		// E-Waybill button click
		UtilityClass.fn_Click("BookingInformationTab_EwayBill-NoBtn");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
		
		// Mode of Payment
		setModeOfPayment("CREDIT");

		// entering booking SFX code
		UtilityClass.fn_Click("BookingInformationTab_SFXCode_DD");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
		UtilityClass.fn_Click("BookingInformationTab_SFXCode_DDoption");
		UtilityClass.fn_InputAndPressEnter("BookingInformationTab_SFXCodetext", SFXcode);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
		log.info("Searching SFXcode");

		// Booking time entries
		log.info("Before Entering Time");
		UtilityClass.fn_Input("BookingInformationTab_time", time);
		log.info("After Entering Time");
		UtilityClass.fn_Input("BookingInformationTab_secs", secs);
		log.info("After Entering secs");

		// Pincode entries
		UtilityClass.fn_InputAndPressEnter("BookingInformationTab_DestinationPincCode", pincode);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
		UtilityClass.fn_Click("BookingInformationTab_DestinationPincCode_select");
		log.info("Pincode entered");

		// Service Offering
	//	setServiceOffering("SURFACE");

		UtilityClass.takeScreenshot();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
		}catch(Exception ex) {
			log.info("DBBIT - AddBookingInfo" + ex.toString());
		}
	}

	private void setServiceOffering(String serviceOffering) {
		log.info("Clicking on Service Offering Dropdown");
		Actions act = new Actions(UtilityClass.driver);
		WebElement we = UtilityClass.getWebElement(By.xpath("DirectBooking_BkngInfoTab_SFDD")   );
		act.moveToElement(we).perform();
		we.click();
		UtilityClass.fn_Input("DirectBooking_BkngInfoTab_SFDD_Search", serviceOffering);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		UtilityClass.fn_Click("DirectBooking_BkngInfoTab_SFDD_Search_Select");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_1S);
	}

	private void setModeOfPayment(String MOP) {
		log.info("Clicking on Mode Of Payment Dropdown");
		Actions act = new Actions(UtilityClass.driver);
		WebElement we = UtilityClass.getWebElement(By.xpath("DirectBooking_BkngInfoTab_MOPdropdown"));
		act.moveToElement(we).perform();
		we.click();
		UtilityClass.fn_Input("DirectBooking_BkngInfoTab_MOPoptions", MOP);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_1S);
		UtilityClass.fn_Click("DirectBooking_BkngInfoTab_MOPoptions_Ent");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_1S);
	}

	public void addConsignorDetails() {
		log.info("Inside consignor method");
		UtilityClass.fn_Click("ConsignorInformationTab_SelectConsignorBTn");
		log.info("Selected consignor");
//		UtilityClass.fn_Click("ConsigneeInformationTab_ContractType_DD");
//		Thread.sleep(2000);
//				UtilityClass.fn_Click("ConsigneeInformationTab_ContractType_DDoption");
//		Thread.sleep(4000);
//		log.info("Selecting Existing Consignee");
		UtilityClass.fn_Click("ConsignorInformationTab_SelectConsigneeBTn");
		// Thread.sleep(2000);
		log.info("Selected consignee");
		UtilityClass.takeScreenshot();

		UtilityClass.fn_Click("BookingInformation_OperationalInforTab");
	}

	public void addOperationalDetails(String actualWt, String NoofPackages, String SaidtoContain, String length,
			String width, String height, String InvDate, String Amount) {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		log.info("Adding Operational Details");
		UtilityClass.fn_Input("OperationInfo_actualWt", actualWt);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);

		UtilityClass.fn_Input("OperationInfo_TotalPackage", NoofPackages);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);

//		UtilityClass.fn_Input("OperationInfo_ChargeWt",actualWt);
//		Thread.sleep(2000);
		UtilityClass.fn_Input("OperationInfo_SaidtoContain", SaidtoContain);
		// UtilityClass.fn_Input("OperationInfo_SpecialInstruction",SaidtoContain);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		log.info("Added Package Details1");
		UtilityClass.fn_Click("OperationalDetails_ProdCatDD");
		// Thread.sleep(2000);
		UtilityClass.fn_Click("OperationalDetails_ProdCatDD_DDoption");
		UtilityClass.fn_applyTAB("OperationalDetails_ProdCatDD");
		// Thread.sleep(2000);
		UtilityClass.fn_Click("OperationalDetails_PackageTypeDD");
		log.info("After  Package Details DD Select");
		// Thread.sleep(2000);
		UtilityClass.fn_Click("OperationalDetails_PackageType_DDoption");
		UtilityClass.fn_applyTAB("OperationalDetails_PackageTypeDD");
		// Thread.sleep(2000);
		UtilityClass.fn_Input("OperationInfo_PackageactualWt", actualWt);
		// Thread.sleep(2000);
		UtilityClass.fn_Input("OperationInfo_PackageNumber", NoofPackages);
		UtilityClass.fn_Input("OperationInfo_Packagelength", length);
		UtilityClass.fn_Input("OperationInfo_Packagewidth", width);
		// Thread.sleep(2000);
		UtilityClass.fn_Input("OperationInfo_Packageheight", height);
		log.info("Added Package Details2");
		// Thread.sleep(5000);
		Random rand = new Random();
		String InvoiceNumber;
		InvoiceNumber = String.valueOf(rand.nextInt(10000));
		log.info(InvoiceNumber);
		UtilityClass.fn_Input("OperationInfo_InvNumber", InvoiceNumber);
		// Thread.sleep(2000);
		UtilityClass.fn_Click("OperationInfo_InvDate");
		// UtilityClass.fn_Input("OperationInfo_InvDate",InvDate);
		// UtilityClass.fn_Click("OperationInfo_InvDate");
		// Thread.sleep(2000);
		UtilityClass.fn_Click("OperationInfo_InvDateOption");
		// Thread.sleep(3000);
		// UtilityClass.fn_Click("OperationInfo_Amount");
		UtilityClass.fn_Input("OperationInfo_Amount", Amount);
		// UtilityClass.fn_Click("OperationInfo_InvoiceNCVCheck");
		// log.info("Invoice NCV button checked ");

		// Thread.sleep(3000);
		Boolean status = UtilityClass.fn_isEnabled("OperationInfo_CalculateBtn");
		log.info(status);
		UtilityClass.fn_clickByAction("OperationInfo_CalculateBtn");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_15S);

		log.info("Freight Charges calculated");

		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_4S);
		UtilityClass.takeScreenshot();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_4S);
		UtilityClass.fn_Click("OperationInfo_CreateWaybillBtn");
		log.info("WayBill Generated");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_15S);
		UtilityClass.takeScreenshot();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_4S);
		UtilityClass.fn_Click("OperationInfo_CloseBtn");
		log.info("Closed Waybill Flow");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_15S);
		UtilityClass.fn_Click("Logout_Action");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_1S);

		UtilityClass.fn_Click("Sign_Out");

		log.info("Sign Out from the Direct Booking Create Way Bill Flow");

	}

}
