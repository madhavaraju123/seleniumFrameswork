package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class BookingLandingPage {
Logger log= Logger.getLogger(BookingLandingPage.class.getName());
	
	public void clickOnBookingLink() throws Exception
	{
		UtilityClass.fn_Click("BookingLandingPageLink");
		log.info("Clicked Booking link");
		Thread.sleep(5000);
		
	}
	public void clickOnBookingWebLink() throws Exception
	{
		UtilityClass.fn_Click("BookingLandingPage_BookingWebLink");
		log.info("Clicked Booking Web link");
		Thread.sleep(15000);
		
	}
}
