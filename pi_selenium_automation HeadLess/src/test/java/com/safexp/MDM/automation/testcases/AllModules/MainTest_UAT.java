package com.safexp.MDM.automation.testcases.AllModules;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.google.common.base.Verify;
import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;
import com.safexp.MDM.automation.Utility.ZipUtils;
import com.safexp.MDM.automation.managerClasses.HybridFrameworkDriver;

//@Listeners(com.safexp.MDM.automation.managerClasses.TestListener.class)
public class MainTest_UAT {
	Logger log = Logger.getLogger(MainTest_UAT.class.getName());
//	String drvrsheet = null;
//	String datasheet = null;
//
//	String testdataresource = null;
//	String scriptresource = null;
//	WebDriver driver;

//	@BeforeTest
//	public void OR_Log_Extent_Initialisation() {
//		UtilityClass.Init_UAT();
//		//UtilityClass.deleteFolder(new File(System.getProperty("user.dir") + "/Report"));
//		//UtilityClass.deleteFolder(new File(System.getProperty("user.dir") + "/Report/Screenshots"));
//	}
    
	
//	public void PATHS_Log_Extent_Initialisation() {
//		UtilityClass.Init_UAT();
		//UtilityClass.deleteFolder(new File(System.getProperty("user.dir") + "/Report"));
//		//UtilityClass.deleteFolder(new File(System.getProperty("user.dir") + "/Report/Screenshots"));
//	}
	
	@BeforeTest
	public void appLaunch() {
		UtilityClass.initOR_UAT();
		log.info("URL Launch");
		UtilityClass.launchUrl();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
	}
	@AfterTest
	public void closeOpenWindow() {
		log.info("after method");
		UtilityClass.driver.quit();
	}




}
