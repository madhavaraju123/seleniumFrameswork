package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class AirContractPaymentTermsPg 
{
	Logger log=Logger.getLogger(AirContractPaymentTermsPg.class.getName());
public void CalcPaymentTerms(String Rate,String MinAmt,String StartDt,String EndDt) throws Exception
{
	Thread.sleep(5000);
	UtilityClass.fn_Click("AirContractPaymentTermsPg_payoutdd");
	Thread.sleep(2000);
	UtilityClass.fn_Click("AirContractPaymentTermsPg_payoutoptionPerWaybil");
	Thread.sleep(2000);
	log.info("payout selected");
	UtilityClass.fn_Click("AirContractPaymentTermsPg_Weighttypedd");
	Thread.sleep(2000);
	UtilityClass.fn_Click("AirContractPaymentTermsPg_WeighttypeddOption");
	Thread.sleep(3000);
	log.info("weight type selected");
	UtilityClass.fn_Click("AirContractPaymentTermsPg_productCtgy");
	Thread.sleep(2000);
	UtilityClass.fn_Click("AirContractPaymentTermsPg_productCtgyoption");
	Thread.sleep(2000);
	UtilityClass.fn_applyTAB("AirContractPaymentTermsPg_productCtgy");
	log.info("Prod category selected");
	Thread.sleep(3000);
	UtilityClass.fn_Input("AirContractPaymentTermsPg_MinAmtperWaybill",MinAmt);
	log.info("MinAmt updated");
	UtilityClass.fn_Input("AirContractPaymentTermsPg_StartDt",StartDt);
	log.info("Date updated");
	UtilityClass.fn_Input("AirContractPaymentTermsPg__RateperKg",Rate);
	log.info("RateValue updated");
	
	//UtilityClass.fn_Input("AirContractPaymentTermsPg_EndDt",EndDt);
	Thread.sleep(2000);
	UtilityClass.fn_Click("AirContractPaymentTermsPg_nextBtn");
	Thread.sleep(25000);
}
public void updateDetails(String Rate,String MinAmt) throws Exception
{
	/*log.info("updating details");
	Thread.sleep(10000);
	UtilityClass.fn_Input("AirContractPaymentTermsPg__RateperKg",Rate);
	UtilityClass.fn_Input("AirContractPaymentTermsPg_MinAmtperWaybill",MinAmt);
	Thread.sleep(2000);*/ 
	
	
	UtilityClass.fn_Click("AirContractPaymentTermsPg_nextBtn");
	Thread.sleep(5000);
	
}

}
