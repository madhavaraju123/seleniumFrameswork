package com.safexp.MDM.automation.pagelibraryNew;


import java.util.logging.Logger;


import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.safexp.MDM.automation.Utility.UtilityClass;

import com.safexp.MDM.automation.testcases.AllModules.MainTest_UAT;



public class SafexpressTrackPage extends MainTest_UAT{

	Logger log=Logger.getLogger(SafexpressTrackPage.class.getName());
	
	@BeforeMethod
	public static void clickLogoAndTrackaIcon() {
		UtilityClass.fn_Click("//img[@class='company-logo']");
		UtilityClass.waitForElement("//section[contains(@style,'display')]//descendant::p[contains(text(),'Track')]"); 	
	    UtilityClass.fn_Click("//section[contains(@style,'display')]//descendant::p[contains(text(),'Track')]");
//		UtilityClass.implicitelyWaitForAComponent(3000);
		UtilityClass.waitForElement("//div[@class='track-col ng-star-inserted']");
	}
	
	@Test(priority=1)
	public void trackWaybillInfo() {
		UtilityClass.fn_Click("//div/ancestor::form[not(contains(@class,'formob'))]/descendant::input[@id='waybill_number']");
//		UtilityClass.scrollToElementIntoView("//section[contains(@style,'display')]//descendant::p[contains(text(),'Track')]");
		UtilityClass.fn_sendkeys("//div/ancestor::form[not(contains(@class,'formob'))]/descendant::div[@class='form-group col-md-6']/input", "100001200465,112994172");
//		UtilityClass.implicitelyWaitForAComponent(3000);
		UtilityClass.fn_scrolldown("window.scrollBy(0,100)");
		UtilityClass.waitForElement("//div/ancestor::form[not(contains(@class,'formob'))]/descendant::div[@class='form-group col-md-6']/following-sibling::button");
		UtilityClass.fn_Click("//div/ancestor::form[not(contains(@class,'formob'))]/descendant::div[@class='form-group col-md-6']/following-sibling::button");
	//	UtilityClass.fn_scrolldown("window.scrollBy(0,100)");
//		UtilityClass.implicitelyWaitForAComponent(3000);
		UtilityClass.waitForElement("//div/descendant::div[text()='X']");
	    UtilityClass.fn_Click("//div/descendant::div[text()='X']");
		
	   // UtilityClass.fn_scrolldown("window.scrollBy(0,10)");
	    
	}
	
	@Test(priority=2)
	public void trackEwaybillInfo(){
	    UtilityClass.fn_Click("//div/ancestor::form[not(contains(@class,'formob'))]/descendant::input[@id='e_waybill_number']");
//		UtilityClass.implicitelyWaitForAComponent(3000);
		UtilityClass.fn_sendkeys("//div/ancestor::form[not(contains(@class,'formob'))]/descendant::div[@class='form-group col-md-6']/input", "661498603247");
		UtilityClass.fn_scrolldown("window.scrollBy(0,100)");
//		UtilityClass.implicitelyWaitForAComponent(3000);
		UtilityClass.waitForElement("//div/ancestor::form[not(contains(@class,'formob'))]/descendant::div[@class='form-group col-md-6']/following-sibling::button");
		UtilityClass.fn_Click("//div/ancestor::form[not(contains(@class,'formob'))]/descendant::div[@class='form-group col-md-6']/following-sibling::button");
//		UtilityClass.implicitelyWaitForAComponent(5000);
//	    UtilityClass.fn_scrolldown("window.scrollBy(0,30)");
		UtilityClass.waitForElement("//div/descendant::div[text()='X']");
		UtilityClass.fn_Click("//div/descendant::div[text()='X']");
//		UtilityClass.implicitelyWaitForAComponent(3000);
		
	}
	@Test(priority=3)
	public void trackInvoiceInfo() {
//	    UtilityClass.implicitelyWaitForAComponent(3000);
		UtilityClass.fn_Click("//div/ancestor::form[not(contains(@class,'formob'))]/descendant::input[@id='invoice_number']");
		UtilityClass.fn_sendkeys("//div/ancestor::form[not(contains(@class,'formob'))]/descendant::div[@class='form-group col-md-6']/input", "200SGU22324213");
		 UtilityClass.waitForElement("//div/ancestor::form[not(contains(@class,'formob'))]/descendant::div[@class='form-group col-md-6']/following-sibling::button");
//		UtilityClass.implicitelyWaitForAComponent(3000);
		UtilityClass.fn_scrolldown("window.scrollBy(0,100)");
		UtilityClass.fn_Click("//div/ancestor::form[not(contains(@class,'formob'))]/descendant::div[@class='form-group col-md-6']/following-sibling::button");
  	    UtilityClass.implicitelyWaitForAComponent(3000);
   
   }
	
}