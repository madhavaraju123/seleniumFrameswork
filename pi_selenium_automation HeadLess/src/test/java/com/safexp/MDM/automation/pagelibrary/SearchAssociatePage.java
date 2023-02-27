package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class SearchAssociatePage {
	Logger log= Logger.getLogger(SearchAssociatePage.class.getName());
	
	public void searchAssociate(String AssociateName) throws InterruptedException
	{
		Thread.sleep(10000);
		UtilityClass.fn_InputAndPressEnter("SearchAssociatePage_search_Text", AssociateName);
		Thread.sleep(10000);
		
	}
public void updateExistingAssociate(String AssociateName)
{
	
}
public void createNewAssociate(String AssociateName) throws InterruptedException
{
        log.info("creating new associate");	
        UtilityClass.fn_InputAndPressEnter("SearchAssociatePage_search_Text", AssociateName);
        Thread.sleep(3000);
		UtilityClass.fn_Click("SearchAssociatePage_plusicon");
		Thread.sleep(7000);
	
}
public void createNewNetworkContract(String AssociateName) throws InterruptedException
{
	UtilityClass.fn_Input("SearchAssociatePage_search_Text", AssociateName);
	log.info("Searching associate");
	log.info(AssociateName);
	UtilityClass.fn_clickByAction("SearchAssociatePage_associateNameNw_link");
	log.info("Creating new contract for "+AssociateName);
	    Thread.sleep(15000);
		
}
public void EditAssociate(String AssociateName) throws InterruptedException
{
	UtilityClass.fn_Click("SearchAssociatePage_EditDetails");
	
	
}
public void createNewContract(String AssociateName) throws InterruptedException
{
	UtilityClass.fn_Input("SearchAssociatePage_search_Text", AssociateName);
	UtilityClass.fn_Click("SearchAssociatePage_associateName_link");
	    Thread.sleep(5000);
}
}
