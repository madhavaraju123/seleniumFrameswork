package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class BookingDeductionCalculation {
Logger log=Logger.getLogger(BookingDeductionCalculation.class.getName());
public void calculateDeductions(String EMIAmount,String FromDt,String ToDt ,String Amount) throws Exception
{
	Thread.sleep(5000);
	UtilityClass.fn_Click("BookingContractDeductionCalculationPage_penaltywrongdimension_yes");
	UtilityClass.fn_Click("BookingContractDeductionCalculationPage_penaltyAgainstwybl_yes");
	log.info("deduction screen");
	/*UtilityClass.fn_Click("BookingContractDeductionCalculationPage_EMICalculation_icon");
	Thread.sleep(5000);
	UtilityClass.fn_Click("EMIDeductionCalculation_vehicleNumber");
	Thread.sleep(2000);
	UtilityClass.fn_Input("EMIDeductionCalculation_EMIAmount",EMIAmount);
	
	
    Thread.sleep(2000);
   UtilityClass.fn_Input("EMIDeductionCalculation_FromDt",FromDt);
  
   UtilityClass.fn_Input("EMIDeductionCalculation_ToDt",ToDt);
   Thread.sleep(2000);
    UtilityClass.fn_Click("EMIDeductionCalculation_addBtn");
    Thread.sleep(2000);
    UtilityClass.fn_Click("EMIDeductionCalculation_SaveBtn");
    Thread.sleep(2000);
    UtilityClass.takeScreenshot();*/
	UtilityClass.fn_Click("BookingContractDeductionCalculationPage_slaApplicable_yes");
	UtilityClass.fn_Click("BookingContractDeductionCalculationPage_samedayDispatch_yes");
	UtilityClass.fn_Click("BookingContractDeductionCalculationPage_penaltyWrongwt_yes");
	UtilityClass.fn_Click("BookingContractDeductionCalculationPage_marketVehicleExpense_yes");
		UtilityClass.fn_Click("BookingContractDeductionCalculationPage_lateArrivalflg_yes");
	
	
	
    Thread.sleep(2000);
    
    
	
	
	
    Thread.sleep(2000);
    UtilityClass.fn_Click("BookingContractDeductionCalculationPage_next_Btn");
    Thread.sleep(3000);
}
public void clickOnNextButton() throws Exception
{ 
	Thread.sleep(5000);
    log.info("deduction screen");
    UtilityClass.fn_Click("BookingContractDeductionCalculationPage_slaApplicable_yes");
	log.info(" updating flag1");	
		
	UtilityClass.fn_Click("BookingContractDeductionCalculationPage_next_Btn");
    Thread.sleep(3000);
}
}
