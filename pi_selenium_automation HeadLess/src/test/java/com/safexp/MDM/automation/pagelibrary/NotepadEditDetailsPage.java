package com.safexp.MDM.automation.pagelibrary;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.UtilityClass;
public class NotepadEditDetailsPage 
{
	Logger log=Logger.getLogger(NotepadEditDetailsPage.class.getName());
	public void editDetails(String expiryDt,String description)
	{
		UtilityClass.fn_Input("EditNotePadDetails_ExpiryDt_input",expiryDt);
	    String text=UtilityClass.getTextOnElement("EditNotePadDetails_Description_input");
	    String Texttobeupdated=text+"_updated";
		UtilityClass.fn_Input("EditNotePadDetails_Description_input",Texttobeupdated);
		String status=UtilityClass.getTextOnElement("EditNotePadDetails_status_list");
		UtilityClass.fn_Click("EditNotePadDetails_Save_button");
		boolean status1=false;
		if(status.equalsIgnoreCase("ACTIVE"))
			{ 
			status1=NotepadHomePage.verifyupdatedDetails(Texttobeupdated,"ACTIVE");
			}
		else if(status.equalsIgnoreCase("INACTIVE"))
		{
			UtilityClass.fn_Click("DeleteNotePad_Delete_button");
			status1=NotepadHomePage.verifyupdatedDetails(Texttobeupdated,"INACTIVE");
					}
		if(status1)
		log.info("Notepad details are edited successfully");
		else
			log.info("Notepad is not edited properly.Pls. recheck the issue");
			
	}
	public void InactivateNotepad() throws InterruptedException
	{
		boolean status1=false;
		
		UtilityClass.fn_Click("NotepadEditDetails_status_dropdown");
		UtilityClass.fn_Click("NotepadEditDetails_status_dropdown_option2");
		
		//UtilityClass.fn_SelectByValue("NotepadEditDetails_status_list","INACTIVE");
		String text=UtilityClass.getTextOnElement("EditNotePadDetails_Description_input");
	    String Texttobeupdated=text+"_updated";
		UtilityClass.fn_Input("EditNotePadDetails_Description_input",Texttobeupdated);
		UtilityClass.fn_Click("EditNotePadDetails_Save_button");
		Thread.sleep(2000);
		UtilityClass.fn_Click("DeleteNotePad_Delete_button");
		Thread.sleep(1000);
		/*status1=NotepadHomePage.verifyupdatedDetails(Texttobeupdated,"INACTIVE");
		if(status1)
			log.info("Notepad is inactivated");
			else
				log.info("Notepad is not Inactivated.Pls. recheck the issue");*/
				
	}

}
