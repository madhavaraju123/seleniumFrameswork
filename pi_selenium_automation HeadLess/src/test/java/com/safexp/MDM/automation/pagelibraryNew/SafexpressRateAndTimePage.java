package com.safexp.MDM.automation.pagelibraryNew;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.safexp.MDM.automation.Utility.UtilityClass;
import com.safexp.MDM.automation.testcases.AllModules.MainTest_RunTest;
import com.safexp.MDM.automation.testcases.AllModules.MainTest_UAT;

public class SafexpressRateAndTimePage extends MainTest_UAT {

	Logger log=Logger.getLogger(SafexpressRateAndTimePage.class.getName());
	
	@BeforeClass
	public void clickLogoAndRateAndTime_icon() throws InterruptedException {
		UtilityClass.fn_Click("//img[@class='company-logo']");
		UtilityClass.fn_Click("//section[contains(@style,'display')]//descendant::p[contains(text(),'Rate & Time')]");
		UtilityClass.waitForElement("//input[@placeholder='Source City']");
		UtilityClass.fn_scrolldown("window.scrollBy(0,200)");
//		UtilityClass.implicitelyWaitForAComponent(5000);
	}
	@Test(priority=1)
	public void rateAndTimeGetdtailsAndGetRate() {
		UtilityClass.implicitelyWaitForAComponent(6000);
		UtilityClass.fn_Input("//input[@placeholder='Source City']","PRODDATUR");
		UtilityClass.implicitelyWaitForAComponent(6000);
		UtilityClass.waitForElement("//div/child::div[@class='ng-star-inserted']");
		UtilityClass.fn_list("//div/child::div[@class='ng-star-inserted']", "PRODDATUR");
	//	driver.findElement(By.xpath("//input[@placeholder='Source City']")).sendKeys("PRODDATUR");
//		UtilityClass.implicitelyWaitForAComponent(5000);
		UtilityClass.fn_Input("//input[@placeholder='Destination City']", "cuddapah");
//		UtilityClass.implicitelyWaitForAComponent(8000);
		UtilityClass.waitForElement("//div/child::div[@class='ng-star-inserted']");
		UtilityClass.fn_list("//div/child::div[@class='ng-star-inserted']", "cuddapah");
//		UtilityClass.implicitelyWaitForAComponent(5000);
		UtilityClass.fn_Click("//button[text()='Get Details']");
		
		UtilityClass.waitForElement("//button[text()='Get Rate']");
	//	UtilityClass.implicitelyWaitForAComponent(8000);
		UtilityClass.fn_Click("//button[text()='Get Rate']");
//		UtilityClass.implicitelyWaitForAComponent(5000);
//		UtilityClass.fn_sendkeys("UtilityClass.implicitelyWaitForAComponent(5);", "madhav");
//	    UtilityClass.fn_sendkeys("", null)
		UtilityClass.fn_scrolldown("window.scrollBy(0,200)");
		UtilityClass.waitForElement("//input[@placeholder='Customer/Consigner Name']");
//		UtilityClass.implicitelyWaitForAComponent(5000);
	}
	
	@Test(priority=2)
	public void rateAndTimeCalculate() {
		UtilityClass.fn_sendkeys("//input[@placeholder='Customer/Consigner Name']", "Ram");
//		UtilityClass.implicitelyWaitForAComponent(5000);
		UtilityClass.fn_sendkeys("//input[@placeholder='Mobile Number']", "7887878789");
//		UtilityClass.implicitelyWaitForAComponent(5000);
		UtilityClass.fn_sendkeys("//input[@placeholder='Origin Pincode']", "516360");
//		UtilityClass.implicitelyWaitForAComponent(1000);
		UtilityClass.fn_tab("//input[@placeholder='Origin Pincode']");
		UtilityClass.waitForElement("//div/child::label[text()='Branch']");
		UtilityClass.fn_Input("//input[@placeholder='Select Packing Type']", "bike");
//		UtilityClass.implicitelyWaitForAComponent(3000);
		UtilityClass.fn_scrolldown("window.scrollBy(0,40)");
//		UtilityClass.implicitelyWaitForAComponent(5000);
		UtilityClass.fn_list("//div[@class='packing-type-list ng-star-inserted']","BIKE");
//		UtilityClass.implicitelyWaitForAComponent(5000);
		UtilityClass.fn_sendkeys("//input[@placeholder='Destination Pincode']", "282008");
		UtilityClass.fn_tab("//input[@placeholder='Destination Pincode']");
//		UtilityClass.implicitelyWaitForAComponent(5000);
		UtilityClass.waitForElement("//input[@class='form-control ng-pristine ng-touched ng-valid' and @formcontrolname='city']");
	//	UtilityClass.fn_sendkeys("//input[@placeholder='City']", "naga samudram");
//		UtilityClass.implicitelyWaitForAComponent(5000);
		UtilityClass.fn_sendkeys("//input[contains(@placeholder,'packages') or contains(@formcontrolname,'packages')]", "78");
//		UtilityClass.implicitelyWaitForAComponent(5000);
		UtilityClass.fn_sendkeys("//input[@placeholder='Approx. Weight(Kg)']", "1000");
//		UtilityClass.implicitelyWaitForAComponent(5000);
		UtilityClass.fn_sendkeys("//input[@placeholder='Approx. Invoice Value']", "1");
//		UtilityClass.implicitelyWaitForAComponent(5000);
		UtilityClass.fn_datepicker("20-feb-2023", "//span[@class='mat-button-wrapper']",
				"//div[@aria-modal='true']/descendant::span[@class='mat-button-wrapper']/span",
				 "//tbody/descendant::td/descendant::div[contains(@class,'mat-calendar-body-cell-content')]",
				 "//tbody[@class='mat-calendar-body']/descendant::div[contains(@class,'mat-calendar-body-cell-content')]",
				 "//tbody[@class='mat-calendar-body']/descendant::div[contains(@class,'mat-calendar-body-cell-content')]");
//		UtilityClass.implicitelyWaitForAComponent(5000);
		UtilityClass.fn_Click("//button[@class='booknow-submit-sucess-button']");
		UtilityClass.waitForElement("//button[@class='pickup-request-button']");
//		UtilityClass.takeScreenshot();
		UtilityClass.implicitelyWaitForAComponent(12000);
		
	}
	
}
