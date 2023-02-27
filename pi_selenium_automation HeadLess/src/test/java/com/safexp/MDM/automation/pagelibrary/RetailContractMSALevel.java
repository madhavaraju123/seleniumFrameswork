package com.safexp.MDM.automation.pagelibrary;
import java.util.List;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;
public class RetailContractMSALevel {
	Logger log=Logger.getLogger(RetailContractMSALevel.class.getName());

	public void ClickNext() throws InterruptedException
	{
		UtilityClass.fn_Click("RetailContractMSALevel_next_button");
		Thread.sleep(2000);
	}
}
