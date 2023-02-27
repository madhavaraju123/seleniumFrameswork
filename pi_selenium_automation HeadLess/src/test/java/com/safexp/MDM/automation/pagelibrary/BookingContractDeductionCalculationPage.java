package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class BookingContractDeductionCalculationPage {
Logger log=Logger.getLogger(BookingContractDeductionCalculationPage.class.getName());
public void calculateDeductions(String EMIAmount,String FromDt,String ToDt ,String Amount) throws Exception
{
	UtilityClass.fn_Click("BookingContractDeductionCalculationPage_slaApplicable_yes");
	UtilityClass.fn_Click("BookingContractDeductionCalculationPage_samedayDispatch_yes");
	UtilityClass.fn_Click("BookingContractDeductionCalculationPage_penaltyWrongwt_yes");
	UtilityClass.fn_Click("BookingContractDeductionCalculationPage_marketVehicleExpense_yes");
	UtilityClass.fn_Click("BookingContractDeductionCalculationPage_EMICalculation_icon");
	UtilityClass.fn_Click("EMIDeductionCalculation_vehicleNumber");
	
	UtilityClass.fn_Input("EMIDeductionCalculation_EMIAmount",EMIAmount);
    UtilityClass.fn_Input("EMIDeductionCalculation_FromDt",FromDt);
    UtilityClass.fn_Input("EMIDeductionCalculation_ToDt",ToDt);
    UtilityClass.fn_Click("EMIDeductionCalculation_addBtn");
    UtilityClass.fn_Click("EMIDeductionCalculation_SaveBtn");
    
    UtilityClass.fn_Click("BookingContractDeductionCalculationPage_InsuranceCalculation_icon");
	UtilityClass.fn_Click("InsuranceDeductionCalculation_vehicleNumber");
	
	UtilityClass.fn_Input("InsuranceDeductionCalculationn_Amount",Amount);
    UtilityClass.fn_Input("InsuranceDeductionCalculation_FromDt",FromDt);
    UtilityClass.fn_Input("InsuranceDeductionCalculation_ToDt",ToDt);
    UtilityClass.fn_Click("InsuranceDeductionCalculation_addBtn");
    UtilityClass.fn_Click("InsuranceDeductionCalculation_SaveBtn");
    Thread.sleep(2000);
    UtilityClass.fn_Click("BookingContractDeductionCalculationPage_next_Btn");
    Thread.sleep(3000);
}
public void clickOnNextButton() throws Exception
{
	UtilityClass.fn_Click("BookingContractDeductionCalculationPage_next_Btn");
    Thread.sleep(3000);
}
}
