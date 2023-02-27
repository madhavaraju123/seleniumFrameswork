package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class MDM_LogisticZoneLandingPage {
	Logger log=Logger.getLogger(UsermanagementLandingPage.class.getName());
	public void searchLogisticZoneMatrix(String LogisticZoneName) throws InterruptedException
	{
		Thread.sleep(2000);
		UtilityClass.fn_InputAndPressEnter("LogisticZone_searchbox_input", LogisticZoneName);	
		Thread.sleep(2000);
		String s=UtilityClass.fn_getText("LogisticZone_ZoneName_input");
		System.out.println(s);
		Thread.sleep(2000);
		UtilityClass.fn_Click("LogisticZone_view_icon");
		UtilityClass.takeScreenshot();
	}

	


}
