package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class MDM_RateGroupLandingPage {
	Logger log=Logger.getLogger(UsermanagementLandingPage.class.getName());
	public void searchRateGroup(String rateGroup) throws InterruptedException
	{
		Thread.sleep(5000);
		UtilityClass.fn_InputAndPressEnter("RateGroup_searchbox_input", rateGroup);	
		Thread.sleep(5000);
		String s=UtilityClass.fn_getText("RateGroup_RateGroupName");
		System.out.println(s);
		Thread.sleep(5000);
		UtilityClass.fn_Click("RateGroup_view_icon");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//WebElement we=UtilityClass.getWebElement("RateGroupPage_ZoneName");
		//String s1=UtilityClass.fn_getTextfromDisabledElement(we);
		//System.out.println(s1);
		if(s.equalsIgnoreCase(rateGroup))
		{
			System.out.println("Rate Group Name is verified");
		}
		else
		{
			System.out.println("Rate Group Name is not verified");
		}
	}

}
