package com.safexp.MDM.automation.pagelibraryNew;

import java.time.Duration;
import java.util.logging.Logger;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.safexp.MDM.automation.Utility.UtilityClass;
import com.safexp.MDM.automation.pagelibrary.AssociateAirMgmtDashboardPg;
import com.safexp.MDM.automation.testcases.AllModules.MainTest_UAT;

public class SafexpressHomePage extends MainTest_UAT {
   
	Logger log = Logger.getLogger(SafexpressHomePage.class.getName());
	@Test
	public void clickOnIcons() throws InterruptedException {
		
		UtilityClass.fn_Click("//section[contains(@style,'display')]//descendant::p[contains(text(),'Track')]");
		Thread.sleep(2000);
		UtilityClass.fn_Click("/html/body/app-root/app-home/section/app-home-tracking/section/div[2]/div[1]/form[1]/div[2]/input");
		
		UtilityClass.fn_Click("//section[contains(@style,'display')]//descendant::p[contains(text(),'Rate & Time')]");

		UtilityClass.fn_Click("//section[contains(@style,'display')]//descendant::p[contains(text(),'GST')]");

		UtilityClass.fn_Click("//section[contains(@style,'display')]//descendant::p /span[contains(text(),'E-payment')]");

		UtilityClass.fn_Click("//section[contains(@style,'display')]//descendant::p[contains(text(),'Pincode ')]");
		Thread.sleep(3000);

		UtilityClass.fn_clickByAction("HomePage_GST_icon");

		UtilityClass.fn_Click("//div[@id='navbarSupportedContent']/descendant::a[contains(text(),'About Us')]");

		UtilityClass.fn_Click("//div[@id='navbarSupportedContent']/descendant::a[contains(text(),'Services ')]");

		UtilityClass.fn_Click("//div[@id='navbarSupportedContent']/descendant::a[contains(text(),'Technology')]");

		UtilityClass.fn_Click("//div[@id='navbarSupportedContent']/descendant::a[contains(text(),' Industries')]");
		
		UtilityClass.fn_Click("//section/descendant::img[contains(@class,'company-logo')]");
		
		UtilityClass.fn_Click("//section[contains(@style,'display')]//descendant::p[contains(text(),'Rate & Time')]");
		
		
		
		
		
		
		
		
		//UtilityClass.fn_Click("HomePage_GST_icon");
		//UtilityClass.fn_Click("HomePage_GST_icon");
		
	}
	
}
