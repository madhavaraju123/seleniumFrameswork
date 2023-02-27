package com.safexp.MDM.automation.pagelibrary;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.common.base.Verify;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class MDM_ZoneMatrixLandingPage {

	Logger log=Logger.getLogger(UsermanagementLandingPage.class.getName());
	public void searchZoneMatrix(String zoneName) throws InterruptedException
	{
		Thread.sleep(5000);
		UtilityClass.fn_InputAndPressEnter("ZoneMatrix_searchbox_input", zoneName);	
		Thread.sleep(5000);
		String s=UtilityClass.fn_getText("ZoneMatrix_ZonetName_Input");
		System.out.println(s);
		Thread.sleep(5000);
		UtilityClass.fn_Click("ZoneMartix_view_icon");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement we=UtilityClass.getWebElement(By.xpath("ZoneMatrixPage_ZoneName"));
		String s1=UtilityClass.fn_getTextfromDisabledElement(we);
		System.out.println(s1);
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println("Zone Matrix Name is verified");
		}
		else
		{
			System.out.println("Zone Matrix Name is not verified");
		}
	}

	
}
