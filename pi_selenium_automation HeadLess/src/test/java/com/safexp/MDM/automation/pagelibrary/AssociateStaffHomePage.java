package com.safexp.MDM.automation.pagelibrary;
import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class AssociateStaffHomePage {
	
	Logger log=Logger.getLogger(AssociateStaffHomePage.class.getName());
	public void clickOnPlusicon()
	{
		UtilityClass.fn_Click("AssociateStaffHomePage_plusicon");
	}

}
