package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class NetworkDeductionCalculationPg {
	Logger log=Logger.getLogger(NetworkDeductionCalculationPg.class.getName());
	public void CalcDeduction(String EMIAmount,String FromDt,String ToDt,String SealDedPnlty,String NonTouchPnlty) throws Exception
{
	Thread.sleep(7000);
	log.info("deduction screen");
	UtilityClass.fn_Input("NetworkDeductionCalculationPg_SealDedPnlty",SealDedPnlty);
	UtilityClass.fn_Input("NetworkDeductionCalculationPg_NonTouchPnlty",NonTouchPnlty);
//	UtilityClass.fn_Click("NetworkDeductionCalculationPg_EMICalculation_icon");
	
	
    Thread.sleep(2000);
    UtilityClass.fn_Click("NetworkDeductionCalculationPg_NextBtn");
    Thread.sleep(20000);
    }
public void clickOnNextButton(String SealDedPnlty,String NonTouchPnlty) throws Exception
{
	 Thread.sleep(5000);
	UtilityClass.fn_Input("NetworkDeductionCalculationPg_SealDedPnlty",SealDedPnlty);
	UtilityClass.fn_Input("NetworkDeductionCalculationPg_NonTouchPnlty",NonTouchPnlty);
    UtilityClass.fn_Click("NetworkDeductionCalculationPg_NextBtn");
    Thread.sleep(5000);
}
}
