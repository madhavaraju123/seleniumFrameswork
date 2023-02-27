package com.safexp.MDM.automation.pagelibrary;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.UtilityClass;
public class NotepadAdddetailsPage 
{
	Logger log=Logger.getLogger(NotepadAdddetailsPage.class.getName());
	public void addDetails(String notepadname,String attributetype,String effectiveDate,String expiryDt,String status) throws InterruptedException
	{
		boolean status1 =false;
		log.info("adding details");
			UtilityClass.fn_Input("AddNotepad_NotepadName_input",notepadname);
			UtilityClass.fn_Click("AddNotepad_AttributeType_dropdown");
			
			UtilityClass.fn_Click("AddNotepad_AttributeType_dropdown_option2");
			
			//UtilityClass.fn_Input("AddNotepad_Attributevalue_input",attributevalue);
			UtilityClass.fn_Input("AddNotepad_EffectiveDate_input",effectiveDate);
			
			log.info("Notepad details are added");
			UtilityClass.fn_Click("AddNotepad_Save_button");	
			
			//add code to capture text message for addition of notepad later once code is stable
			/*if(verifyNotepadExistence(notepadname))
			{
				log.info("New Notepad is created");
			}
			else
			{
				log.info("There is some issue in notepad addition.Pls. check again");
			}*/
		}
	 
	
		
	
	
}
