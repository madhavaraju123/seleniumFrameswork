package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class NotepadHomePage
{
	Logger log=Logger.getLogger(NotepadHomePage.class.getName());
	
	//Method for searching existing notepad for Module & Entity combination.
	public void searchExistingNotepadList() throws InterruptedException
	{
		log.info("clicking module dropdown");
		Thread.sleep(7000);
		UtilityClass.fn_Click("NotepadHomePage_Module_dropdown");
		Thread.sleep(2000);
		UtilityClass.fn_Click("NotepadHomePage_Module_dropdown_option1");
		Thread.sleep(2000);
		UtilityClass.fn_Click("NotepadHomePage_Entity_dropdown");
		log.info("clicking Entity dropdown");
		Thread.sleep(2000);
		UtilityClass.fn_Click("NotepadHomePage_Entity_dropdown_option1");
		Thread.sleep(3000);
		
		UtilityClass.fn_Click("NotepadHomePage_Search_button");
		Thread.sleep(3000);
	}
	public void verifyButtonsInPage()
	{
		boolean status=UtilityClass.fn_isDisplayed("NotePadDetails_AddNew_button");
		if (status=false)
		{
			log.info("AddNew Button is not displaying for Notepad");
		}
		status=UtilityClass.fn_isDisplayed("NotePadDetails_ViewDetails_button");
		if (status=false)
		{
			log.info("ViewDetails Button is not displaying for Notepad");
		}
		status=UtilityClass.fn_isDisplayed("NotePadDetails_EditDetails_button");
		if (status=false)
		{
			log.info("EditDetails Button is not displaying for Notepad");
		}
		status=UtilityClass.fn_isDisplayed("NotePadDetails_PaginationNext_button");
		if (status=false)
		{
			log.info("Next Button is not displaying for moving to next page for notepad list");
		}
	}
	
	public static boolean searchNotepad(String NotepadName)
	{
		boolean status=false;
		do
		{		
		for(int i=1;i<10;i++)
		{
			String NotepadList="/html[1]/body[1]/div[3]/div[3]/app-root[1]/app-notepad[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div["+i+"]/mat-grid-list[1]/div[1]/mat-grid-tile[1]/figure[1]/mat-label[1]";
					String text=UtilityClass.getWebElement( By.xpath( NotepadList)).getText();
					if (text.compareTo(NotepadName)!=0)
					{
						continue;
					}
					else {
						status=true;
						return status;
					}
		}
		UtilityClass.fn_Click("NotePadDetails_PaginationNext_button");
		} while(UtilityClass.fn_isEnabled("NotePadDetails_PaginationNext_button"));
		return status;
	}
	public void clickOnEditDetailsButton() throws InterruptedException
	{		
			UtilityClass.fn_Click("NotePadDetails_EditDetails_button");
		
		Thread.sleep(2000);
	}
	public static void clickOnViewDetailsButton()
	{
		UtilityClass.fn_Click("NotePadDetails_ViewDetails_button");
	}
	public void CreateNewNotepad(String notepadname) throws InterruptedException
	{
				UtilityClass.fn_Click("NotePadDetails_AddNew_button");		
	}
	public static boolean verifyupdatedDetails(String DisplayValue,String status)
	{
		String displayvaluetext=UtilityClass.getTextOnElement("NotepadList1stElement_DisplayValue_label");
		String statusText=UtilityClass.getTextOnElement("NotepadList1stElement_Status_label");
		if((displayvaluetext==DisplayValue)&&(statusText==status))
		{return true;}
		else {return false;}
	}
	public boolean verifyNotepadExistence(String notepadname)
	{
		boolean status1=false;
	     status1=searchNotepad(notepadname);
	     if(status1)
	        	{
	    	 log.info("Notepad already exist.Pls.provide new details for notepad");   
	    	 status1=true;
	    	}
	     return status1;
	   	
	}
	
}
