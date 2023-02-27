package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class DeliveryDeductionCalculationPg {
	Logger log=Logger.getLogger(DeliveryDeductionCalculationPg.class.getName());
	public void CalcDeduction(String EMIAmount,String FromDt,String ToDt) throws Exception
	{
		Thread.sleep(7000);
		log.info("deduction screen");
		UtilityClass.fn_Click("BookingContractDeductionCalculationPage_EMICalculation_icon");
		Thread.sleep(5000);
		UtilityClass.fn_Click("EMIDeductionCalculation_vehicleNumber");
		
		UtilityClass.fn_Input("EMIDeductionCalculation_EMIAmount",EMIAmount);
	   UtilityClass.fn_Input("EMIDeductionCalculation_FromDt",FromDt);
	    UtilityClass.fn_Input("EMIDeductionCalculation_ToDt",ToDt);
	    Thread.sleep(2000);
	    UtilityClass.fn_Click("EMIDeductionCalculation_addBtn");
	    Thread.sleep(2000);
	    UtilityClass.fn_Click("EMIDeductionCalculation_SaveBtn");
	    Thread.sleep(2000);
		UtilityClass.fn_Click("DeliveryDeductionCalculationPg_SNSDFlag_yes");
		UtilityClass.fn_Click("DeliveryDeductionCalculationPg_LatePenalty_No");
		UtilityClass.fn_Click("DeliveryDeductionCalculationPg_VehcilePenalty_No");
		UtilityClass.fn_Click("DeliveryDeductionCalculationPg_marketVehicle_No");
		
		UtilityClass.fn_Click("DeliveryDeductionCalculationPg_DedLost_No");
		UtilityClass.fn_Click("DeliveryDeductionCalculationPg_RecoveryFlag_yes");
		UtilityClass.fn_Click("DeliveryDeductionCalculationPg_AdvanceAmtFlag_No");
		
		
	    
	   /* UtilityClass.fn_Click("BookingContractDeductionCalculationPage_InsuranceCalculation_icon");
		UtilityClass.fn_Click("InsuranceDeductionCalculation_vehicleNumber");
		
		UtilityClass.fn_Input("InsuranceDeductionCalculationn_Amount",Amount);
	    UtilityClass.fn_Input("InsuranceDeductionCalculation_FromDt",FromDt);
	    UtilityClass.fn_Input("InsuranceDeductionCalculation_ToDt",ToDt);
	    UtilityClass.fn_Click("InsuranceDeductionCalculation_addBtn");
	    Thread.sleep(2000);
	    UtilityClass.fn_Click("InsuranceDeductionCalculation_SaveBtn");
	    Thread.sleep(2000); */
		
	    Thread.sleep(2000);
	    UtilityClass.fn_Click("DeliveryDeductionCalculationPg_next_Btn");
	    Thread.sleep(3000);
	}
	public void clickOnNextButton() throws Exception
	{
		UtilityClass.fn_Click("DeliveryDeductionCalculationPg_next_Btn");
	    Thread.sleep(3000);
	}

}
