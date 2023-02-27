package com.safexp.MDM.automation.pagelibrary;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.UtilityClass;
public class NotepadViewDetailspage 
{
	Logger log=Logger.getLogger(NotepadViewDetailspage.class.getName());
	public void verifyNotepadDetails()
	{
		String notepadName,attributeType,displayValue,status;
		log.info("Validating details");
		notepadName=UtilityClass.getTextOnElement("NotepadList1stElement_notepadname_label");
		log.info(notepadName);
		attributeType=UtilityClass.getTextOnElement("NotepadList1stElement_AttributeType_label");
		log.info(attributeType);
		displayValue=UtilityClass.getTextOnElement("NotepadList1stElement_DisplayValue_label");
		log.info(displayValue);
		status=UtilityClass.getTextOnElement("NotepadList1stElement_Status_label");
		log.info(status);
		NotepadHomePage.clickOnViewDetailsButton();
		log.info(UtilityClass.fn_getText("NotepadViewDetails_Notepadname"));
		log.info(UtilityClass.fn_getText("NotepadViewDetails_AttributeType"));
		log.info(UtilityClass.fn_getText("NotepadViewDetails_DisplayValue"));
		log.info(UtilityClass.fn_getText("NotepadViewDetails_Status"));
		
		UtilityClass.fn_validateText("NotepadViewDetails_Notepadname",notepadName);
		UtilityClass.fn_validateText("NotepadViewDetails_AttributeType",attributeType);
		UtilityClass.fn_validateText("NotepadViewDetails_DisplayValue",displayValue);
		UtilityClass.fn_validateText("NotepadViewDetails_Status",status);
	}
	
}
