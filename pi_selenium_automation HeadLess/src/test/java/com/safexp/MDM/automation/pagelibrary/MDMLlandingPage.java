package com.safexp.MDM.automation.pagelibrary;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.UtilityClass;
public class MDMLlandingPage 
{
	
	Logger log=Logger.getLogger(MDMLlandingPage.class.getName());
	
	public void clickOnBurgerMenu()
	{
	UtilityClass.fn_Click("UsermanagementHome_BurgerMenu");
	}
	
	public void clickOnMDMmenu() throws InterruptedException
	{
		
		log.info("Clicking on MDM menu");
		//UtilityClass.WaituntilElementClickable("MDMDashboard_MDM_menu");
		UtilityClass.fn_clickByAction("MDMDashboard_MDM_menu");
		log.info("Clicked on MDM menu");
		Thread.sleep(1000);
	}
	public void clickOnCommandmentMenu() throws InterruptedException
	{
		log.info("Clicking on Commandment menu");
		UtilityClass.fn_clickByAction("MDMDashboard_Commandment_menu");
		Thread.sleep(15000);
		log.info("Clicked on Commandment menu");
	}

	public void clickOnPricingParameterButton() throws InterruptedException
	{
		log.info("Clicking on Pricing Parameter button");
		UtilityClass.fn_Click("MDMDashboard_Commandment_PricingParameterButton");
		Thread.sleep(5000);
		log.info("Clicked on Pricing Parameter button");
	}
	
	public void clickOnNotepadMenu() throws InterruptedException
	{
		UtilityClass.fn_clickByAction("MDMDashboard_Notepad_menu");
		Thread.sleep(15000);
	}
	public void clickOnGeographyMenu() throws InterruptedException
		{
		
		log.info("Clicking on Geography menu");
		UtilityClass.fn_clickByAction("MDMDashboard_Geography_menu");
		Thread.sleep(15000);
	}
	public void clickOnZoneMatrixtMenu() throws InterruptedException
	
	{
		
		clickOnMDMmenu();
		Thread.sleep(2000);
		UtilityClass.fn_Click("MDMDashboard_ZoneMatrix_menu");
		Thread.sleep(20000);
	}
	
public void clickOnZoneMatrixButton() throws InterruptedException
	
	{		
		Thread.sleep(2000);
		UtilityClass.fn_clickByAction("MDMDashboard_ZoneMatrix_button");
		Thread.sleep(20000);
	}

public void clickOnLogisticZoneButton() throws InterruptedException

{		
	Thread.sleep(3000);
	UtilityClass.fn_clickByAction("MDMDashboard_LogisticZone_button");
	Thread.sleep(3000);
}

public void clickOnRateGroupButton() throws InterruptedException

{		
	Thread.sleep(3000);
	UtilityClass.fn_clickByAction("MDMDashboard_RateGroup_button");
}
public void clickOnLookUpMenu() throws InterruptedException

{		
	Thread.sleep(2000);
	UtilityClass.fn_clickByAction("MDMDashboard_LookupMenu");
	Thread.sleep(20000);
	log.info("Clicked on Lookup Menu");
}
	
public void clickOnBranchMenu() throws InterruptedException

{		
	
	UtilityClass.fn_clickByAction("MDMDashboard_BranchMenu");
	Thread.sleep(20000);
	log.info("Clicked on Branch Menu");
}
	
}
