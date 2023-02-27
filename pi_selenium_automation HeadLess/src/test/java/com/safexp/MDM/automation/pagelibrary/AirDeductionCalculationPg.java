package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class AirDeductionCalculationPg {
	Logger log=Logger.getLogger(AirDeductionCalculationPg.class.getName());
	public void CalcDeduction(String MaxDeduction,String Offload_ded) throws Exception
	{
		Thread.sleep(10000);
		UtilityClass.fn_Click("AirDeductionCalculationPg_slaApplicable_yes");
		log.info("updated flag1");
		UtilityClass.fn_Click("AirDeductionCalculationPg_Deduction_lost_No");
		log.info("updated flag2");
		UtilityClass.fn_Click("AirDeductionCalculationPg_latePenalty_yes");
		log.info("updated flag3");
		UtilityClass.fn_Input("AirDeductionCalculationPg_MaxDeduction",MaxDeduction);
	   UtilityClass.fn_Input("AirDeductionCalculationPg_Offload_ded",Offload_ded);
	    
	     Thread.sleep(2000);
	    UtilityClass.fn_Click("AirDeductionCalculationPg_next_Btn");
	    Thread.sleep(20000);
	}
	public void clickOnNextButton() throws Exception
	{
		Thread.sleep(3000);
		UtilityClass.fn_Click("AirDeductionCalculationPg_next_Btn");
	    Thread.sleep(20000);
	}
	public void updateDetails(String MaxDeduction,String Offload_ded) throws Exception
	{
		Thread.sleep(10000);
		
		UtilityClass.fn_Input("AirDeductionCalculationPg_MaxDeduction",MaxDeduction);
		log.info("updated Max deduction value");
	   UtilityClass.fn_Input("AirDeductionCalculationPg_Offload_ded",Offload_ded);
	   log.info("updated off load charges");
	     Thread.sleep(2000);
	    UtilityClass.fn_Click("AirDeductionCalculationPg_next_Btn");
	    Thread.sleep(3000);}

}
