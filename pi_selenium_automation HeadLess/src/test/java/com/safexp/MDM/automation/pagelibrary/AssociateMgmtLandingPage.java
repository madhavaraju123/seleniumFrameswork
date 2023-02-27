package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class AssociateMgmtLandingPage {

	Logger log= Logger.getLogger(AssociateMgmtLandingPage.class.getName());
	
	public void clickOnAssociateMgmtLink() throws Exception
	{
		UtilityClass.fn_Click("AssociateMgmtLink");
		Thread.sleep(5000);
		
	}
	public void ClickOnBookingLink() throws Exception
	{
		Thread.sleep(3000);
		UtilityClass.fn_Click("Bookinglink");
		Thread.sleep(15000);
		
	}
	public void ClickOnDeliveryLink() throws Exception
	{
		Thread.sleep(3000);
		UtilityClass.fn_Click("Deliverylink");
		Thread.sleep(20000);
		
	}
	public void ClickOnAirLink() throws Exception
	{
		Thread.sleep(3000);
		UtilityClass.fn_Click("AssociateMgmtAirlink");
		Thread.sleep(7000);
		
	}
	public void ClickOnCargoLink() throws Exception
	{
		Thread.sleep(3000);
		UtilityClass.fn_Click("AssociateMgmtCargolink");
		Thread.sleep(7000);
		
	}
	public void ClickOnNetworkLink() throws Exception
	{
		Thread.sleep(3000);
		UtilityClass.fn_Click("AssociateMgmtNetworklink");
		Thread.sleep(7000);
		
	}
	
}
