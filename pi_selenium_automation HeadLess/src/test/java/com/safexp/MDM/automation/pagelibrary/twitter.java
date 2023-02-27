package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;


public class twitter {
	Logger log=Logger.getLogger(twitter.class.getName());
	public void clickingWather() throws InterruptedException
	{
		UtilityClass.fn_Input("searchsamsungtab","Samsung Galaxy tab");	
		UtilityClass.fn_Click("searchbutton");
		UtilityClass.fn_Click("BuyNowbutton");
		
		
	}
	
}
