package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class BookingWebDashboardPage {
	Logger log = Logger.getLogger(BookingWebDashboardPage.class.getName());

	public void ClickOnDirectBookingBtn() {
		UtilityClass.fn_Click("BookingWebDashboardPage_DirectBookinglnk");
		log.info("Clicked DirectBooking link");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);

	}

	public void ClickOnManifestlnk() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
		log.info("Clicking on manifest link");
		UtilityClass.fn_clickByAction("BookingWebDashboardPage_Manifestlnk");
		log.info("Clicked Manifest link");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);

	}
}
