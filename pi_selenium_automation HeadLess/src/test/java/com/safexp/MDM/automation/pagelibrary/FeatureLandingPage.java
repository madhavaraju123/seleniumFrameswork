package com.safexp.MDM.automation.pagelibrary;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.UtilityClass;
public class FeatureLandingPage {
	
	Logger log= Logger.getLogger(FeatureLandingPage.class.getName());
	public void searchExistingFeature(String featureName) throws InterruptedException
		{
		log.info("Searching feature");
		UtilityClass.fn_InputAndPressEnter("FeatureLandingPage_search_input",featureName);
		Thread.sleep(2000);
		UtilityClass.takeScreenshot();
		
		log.info("Feature details validated");
	}

}
