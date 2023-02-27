package com.safexp.MDM.automation.pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class NewTnCLandingPage 
{
	
	public void clickOnRadiotestOption()
	{
		UtilityClass.fn_Click("TnC_radiotestOption");
	}
	public void clickOnContinue() throws InterruptedException
	{
		JavascriptExecutor je = (JavascriptExecutor) UtilityClass.driver; 
		WebElement continuebtn=UtilityClass.getWebElement(By.xpath("TnC_ContinueButton"));
		je.executeScript("arguments[0].scrollIntoView()",continuebtn);
		Thread.sleep(5000);
		UtilityClass.fn_Click("TnC_ContinueButton");
	}
	public void clickOnTnCLink()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UtilityClass.fn_Click("TnCLink");
	}
	
	public void setTermsAndConditions() throws InterruptedException
	{
		//clickOnTnCLink();
	//	clickOnRadiotestOption();
		clickOnContinue();
	}

}
