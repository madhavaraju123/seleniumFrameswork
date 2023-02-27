package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class CreateVehicleMasterPage {
	
	Logger log=Logger.getLogger(CreateVehicleMasterPage.class.getName());
	public void createNewVehicle(String length,String width,String height,String year,String weight,String vehicleno,String Enginenum,String chasisNum,String EffDt,String RegistrationUpto,String InsuranceNum,String InsuranceComapny,String InsuranceUpto,String Description) throws Exception
	{
		UtilityClass.fn_Input("CreateVehicleMasterPage_length_text",length);
		UtilityClass.fn_Input("CreateVehicleMasterPage_width_text",width);
		UtilityClass.fn_Input("CreateVehicleMasterPage_height_text",height);
		
		UtilityClass.fn_Click("CreateVehicleMasterPage_vehicleMake_drpdn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CreateVehicleMasterPage_vehicleMake_drpdnOption1");
		Thread.sleep(3000);
		UtilityClass.fn_Click("CreateVehicleMasterPage_vehicleModel_drpdn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CreateVehicleMasterPage_vehicleModel_drpdnOption1");
		UtilityClass.fn_Input("CreateVehicleMasterPage_year_text",year);
		UtilityClass.fn_Click("CreateVehicleMasterPage_body_drpdn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CreateVehicleMasterPage_body_drpdnOption1");
		
		UtilityClass.fn_Input("CreateVehicleMasterPage_weight_text",weight);
		UtilityClass.fn_Input("CreateVehicleMasterPage_vehicleno_text",vehicleno);
		UtilityClass.fn_Input("CreateVehicleMasterPage_Enginenum_text",Enginenum);
		UtilityClass.fn_Input("CreateVehicleMasterPage_chasisNum_text",chasisNum);
		
		
		
		
		UtilityClass.fn_Input("CreateVehicleMasterPage_EffDt_text",EffDt);
		UtilityClass.fn_Input("CreateVehicleMasterPage_RegistrationUpto_text",RegistrationUpto);
		UtilityClass.fn_Input("CreateVehicleMasterPage_InsuranceNum_text",InsuranceNum);
		UtilityClass.fn_Input("CreateVehicleMasterPage_InsuranceComapny_text",InsuranceComapny);
		UtilityClass.fn_Input("CreateVehicleMasterPage_InsuranceUpto_text",InsuranceUpto);
		UtilityClass.fn_Input("CreateVehicleMasterPage_Descr_text",Description);
		
		UtilityClass.fn_Click("CreateVehicleMasterPage_submit_btn");
		Thread.sleep(3000);
		
		
	}
}
