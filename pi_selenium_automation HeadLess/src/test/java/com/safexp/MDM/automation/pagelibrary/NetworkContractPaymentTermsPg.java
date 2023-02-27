package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class NetworkContractPaymentTermsPg {
	Logger log=Logger.getLogger(NetworkContractPaymentTermsPg.class.getName());
	public void CalcPaymentTerms(String Rate,String FuelDt,String FLEC1,String FLEC2) throws Exception
	{
		Thread.sleep(5000);
		UtilityClass.fn_Click("NetworkContractPaymentTermsPg_payoutdd");
		UtilityClass.fn_Click("NetworkContractPaymentTermsPg_payoutoption");
		log.info("Selected Payout");
		UtilityClass.fn_Input("NetworkContractPaymentTermsPg_RateperKM",Rate);
		UtilityClass.fn_Click("NetworkContractPaymentTermsPg_FuelTypedd");
		UtilityClass.fn_Click("NetworkContractPaymentTermsPg_FuelTypeoption");
		UtilityClass.fn_Click("NetworkContractPaymentTermsPg_FuelIndexdd");
		UtilityClass.fn_Click("NetworkContractPaymentTermsPg_FuelIndexoption");
		log.info("Selected Fuel details");
		Thread.sleep(5000);
		UtilityClass.fn_Input("NetworkContractPaymentTermsPg_BaseFuelDt",FuelDt);
		UtilityClass.fn_Input("NetworkContractPaymentTermsPg_FLECClause1",FLEC1);
		UtilityClass.fn_Input("NetworkContractPaymentTermsPg_FLECClause2",FLEC2);
		log.info("Selected FLEC details");
		Thread.sleep(5000);
		UtilityClass.fn_Click("NetworkContractPaymentTermsPg_NextBtn");
		Thread.sleep(20000);
	}
	public void updateDetails(String Rate,String FLEC1,String FLEC2) throws Exception
	{
		log.info("updating details");
		Thread.sleep(3000);
		UtilityClass.fn_Input("NetworkContractPaymentTermsPg_RateperKM",Rate);
		UtilityClass.fn_Input("NetworkContractPaymentTermsPg_FLECClause1",FLEC1);
		UtilityClass.fn_Click("NetworkContractPaymentTermsPg_NextBtn");
		Thread.sleep(5000);
		
	}

}
