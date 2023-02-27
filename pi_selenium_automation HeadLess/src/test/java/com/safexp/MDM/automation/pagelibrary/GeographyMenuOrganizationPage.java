package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class GeographyMenuOrganizationPage
{
	Logger log=Logger.getLogger(GeographyMenuOrganizationPage.class.getName());
	public boolean searchExistingOrganisation(String organisationName) throws InterruptedException
	{
		boolean status=false;
		
		UtilityClass.fn_InputAndPressEnter("GeographyMenuOrganizationPage_searchbox_input",organisationName);
		Thread.sleep(2000);
	status=UtilityClass.fn_isDisplayed("GeographyMenuOrganizationPage_ErrorText_OrganisationNotExist");
	if(status)
	{
		log.info("Organisation does not exist.Try other values");
	}
	return status;
	}
	
	public void ValidateAddedOrganisation(String organisationName) throws InterruptedException
	{
		boolean status=false;
		status=searchExistingOrganisation(organisationName);
		if(status)
		log.info("Organisation is not added successfully.Pls. recheck the issue.");
		else 
			log.info("Organisation is added successfully");
				
		}
	public void validateExistingOrganisationDetails(String organisationName)
	{
		String organisationName_expected,description_expected;
		organisationName_expected=UtilityClass.fn_getText("GeographyMenuOrganizationPage_LookupList_Name_label");
		log.info(organisationName);
		
		description_expected=UtilityClass.fn_getText("GeographyMenuOrganizationPage_LookupList_Descritpion_label");
		log.info(description_expected);
		UtilityClass.fn_clickByAction("GeographyMenuOrganizationPage_ViewDetails");
		UtilityClass.takeScreenshot();
		UtilityClass.fn_clickByAction("OrganisationEditDetails_Back");
	}
	public void addOrganisationIfNotExist(String organisationName,String CountryName,String description) throws InterruptedException
	{
		boolean status=searchExistingOrganisation(organisationName);
		if(status)
		{
		log.info("Creating new organisation");
		UtilityClass.fn_Click("GeographyMenuOrganizationPage_plus_button");
		UtilityClass.fn_Input("OrganisationAddDetails_organisationName_input",organisationName);
		//UtilityClass.fn_SelectByValue("OrganisationAddDetails_status_list","ACTIVE");
		
		log.info("selecting description value");
		
		UtilityClass.fn_Input("OrganisationAddDetails_Description_input",description);
		UtilityClass.fn_Click("OrganisationAddDetails_lineOfBusiness_checkbox");
		log.info("selecting cuntry value");
		UtilityClass.fn_Click("OrganisationAddDetails_countryName_dropdown");
		Thread.sleep(3000);
		UtilityClass.fn_Click("OrganisationAddDetails_countryName_dropdown_options");
		UtilityClass.fn_Click("OrganisationAddDetails_save_button");
	//	ValidateAddedOrganisation(organisationName);
		}
		else
		{
			log.info("Organisation already exist.Try new values");
		}
			
	}
	public void ClickOnGeographyTab() throws InterruptedException
		{
		Thread.sleep(2000);
		
		UtilityClass.fn_Click("GeographyMenuOrganizationPage_geography_tab");
		log.info("Clicked on Geography tab");
		Thread.sleep(2000);
	}
	public void ClickOnOrganisationTab()
	{
		UtilityClass.fn_clickByAction("GeographyMenuOrganizationPage_organisation_tab");
	}
	public void InactiavtionOfOrganisation(String organisationName) throws InterruptedException
	{
		boolean status=searchExistingOrganisation(organisationName);
		log.info(status);
		if(status)
		{
			log.info("Organisation does not exist so can not edit the details");
		}
		else
		{
			
			UtilityClass.fn_clickByAction("GeographyMenuOrganizationPage_editDetails_button");
			log.info("editing the organisation status details");
			Thread.sleep(3000);
			
		}
	}
}
