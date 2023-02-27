package com.safexp.MDM.automation.pagelibrary;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class CommandmentDetailsPage {
	Logger log=Logger.getLogger(CommandmentDetailsPage.class.getName());
	
	public static void searchExistingCommandment(String commandmentname) throws InterruptedException
	{
		Thread.sleep(5000);
		UtilityClass.fn_InputAndPressEnter("CommandmentDetailsPage_searchBox_input",commandmentname);
		System.out.println("searching commandments as "+commandmentname);
		Thread.sleep(4000);
		
		
	}
	
	public static void ValidateDetails()
	{
		String commandmentName_listValue,serviceOffering_listValue,contractType_listValue;
		commandmentName_listValue=UtilityClass.getTextOnElement("CommandmentDetailsPage_commandmentname_listValue");
		System.out.println(commandmentName_listValue);
		serviceOffering_listValue=UtilityClass.getTextOnElement("CommandmentDetailsPage_serviceoffering_listValue");
		System.out.println(serviceOffering_listValue);
		contractType_listValue=UtilityClass.getTextOnElement("CommandmentDetailsPage_contractType_listValue");
		System.out.println(contractType_listValue);
		UtilityClass.fn_Click("CommandmentDetailsPage_list_ViewDetails_button");
		boolean status1=false;
		WebElement we=UtilityClass.getWebElement(By.xpath("CommandmentDetailsPage_editdetails_commandmentName_input") );
		
	String commandmentname_actual= UtilityClass.fn_getTextfromDisabledElement(we);
	System.out.println(commandmentname_actual);
	System.out.println(commandmentName_listValue);
		/*String serviceOffering_actual=UtilityClass.getTextOnElement("CommandmentDetailsPage_editdetails_serviceOffering_dropdown");
		System.out.println(serviceOffering_actual);
		String type=UtilityClass.getTextOnElement("CommandmentDetailsPage_editdetails_cotractType_dropdown");
		System.out.println(type);*/
		UtilityClass.fn_validateString("CommandmentDetailsPage_editdetails_commandmentName_input",commandmentName_listValue);
	
		//UtilityClass.fn_Click("CommandmentDetailsPage_editdetails_serviceOffering_dropdown");
	//	boolean status=UtilityClass.fn_isChecked("CommandmentDetailsPage_editdetails_serviceOffering_dropdown_option");
		
		
		

		
	}

	public  void CreateCommandmentIfnotExist(String commandmentname) throws InterruptedException
	{
		boolean status= false;
		UtilityClass.fn_InputAndPressEnter("CommandmentDetailsPage_searchBox_input",commandmentname);
		
		if(UtilityClass.fn_isDisplayed("CommandmentDetailsPage_searchErrorMsg"))
			UtilityClass.fn_Click("CommandmentDetailsPage_add_Btn");
		else
			log.info("Commandment already exist.pls. try another record");
		
	}
	public static void ClickOnEditCommandment() throws InterruptedException
		{
		System.out.println("Clicking on edit details button");
		Thread.sleep(3000);
		UtilityClass.fn_Click("CommandmentDetailsPage_list_EditDetails_button");
	}
	
}
	

