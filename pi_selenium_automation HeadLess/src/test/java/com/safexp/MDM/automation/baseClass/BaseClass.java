package com.safexp.MDM.automation.baseClass;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.safexp.MDM.automation.Utility.UtilityClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	Logger log=Logger.getLogger(BaseClass.class.getName());
	
	
    @Test
	public void launchApp(String url,String browser)
	{
		log.info("Application is launching");
		UtilityClass.launchApplication(url,browser);
		log.info("Application launched");
	}
	
	public void closeApp()
	{ 
		log.info("Application is being closed");
		UtilityClass.closeApplication();
		log.info("Application is closed");
	}
	public void clickOnMenu()
	{
		
	    UtilityClass.fn_Click("CreateUserLanding_Menu_BT");
	   
	}
	
	public void clickOnUserManagementMenuOption_sidenavlist()
	{
		clickOnMenu();
	    UtilityClass.clickOnElementByIndexInList("CreateUserLanding_MenuOptions_LIST",1);
	   
	}
	public void clickOnRoleManagementMenuOption_sidenavlist()
	{
		clickOnMenu();
	    UtilityClass.clickOnElementByIndexInList("CreateUserLanding_MenuOptions_LIST",2);
	   
	}
	public void clickOnObjectManagementMenuOption_sidenavlist()
	{
		clickOnMenu();
	    UtilityClass.clickOnElementByIndexInList("CreateUserLanding_MenuOptions_LIST",3);
	   
	}
	public void clickOnContractMenuOption_sidenavlist()
	{
		clickOnMenu();
	    UtilityClass.clickOnElementByIndexInList("CreateUserLanding_MenuOptions_LIST",4);
	   
	}
	public void clickOnMSAMenuOption_sidenavlist()
	{
		clickOnMenu();
	    UtilityClass.clickOnElementByIndexInList("CreateUserLanding_MenuOptions_LIST",5);
	   
	}
	public void clickOnOpportunityMenuOption_sidenavlist()
	{
		clickOnMenu();
	    UtilityClass.clickOnElementByIndexInList("CreateUserLanding_MenuOptions_LIST",6);
	   
	}
	public void clickOnServiceMenuOption_sidenavlist()
	{
		clickOnMenu();
	    UtilityClass.clickOnElementByIndexInList("CreateUserLanding_MenuOptions_LIST",7);
	   
	}
	public void clickOnRatecardMenuOption_sidenavlist()
	{
		clickOnMenu();
	    UtilityClass.clickOnElementByIndexInList("CreateUserLanding_MenuOptions_LIST",8);
	   
	}
	public void clickOnBillingMenuOption_sidenavlist()
	{
		clickOnMenu();
	    UtilityClass.clickOnElementByIndexInList("CreateUserLanding_MenuOptions_LIST",9);
	   
	}
	
	public void launchbr()
	{
	WebDriverManager.chromedriver().setup();
	
		//System.setProperty("webdriver.ie.driver","drivers/IEDriverServer");
	WebDriver driver=new ChromeDriver();
	driver.get("https://propeli-uat.sfxapps.com/login");
	}
}
