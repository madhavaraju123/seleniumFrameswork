package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class CargoDeductionCalculationPg {
	Logger log=Logger.getLogger(CargoDeductionCalculationPg.class.getName());
	public void CalcDeduction(String Remarks) throws Exception
	{
		Thread.sleep(20000);
		UtilityClass.fn_Click("CargoDeductionCalculationPg_mishandlingFlag_yes");
		log.info("flag1 updated");
		UtilityClass.fn_Click("CargoDeductionCalculationPg_AdvanceAmtDeductionFlag_No");
		log.info("flag2 updated");
		UtilityClass.fn_Click("CargoDeductionCalculationPg_latePenalty_yes");
		log.info("flag3 updated");
		UtilityClass.fn_Input("CargoDeductionCalculationPg_Remarks_txt1",Remarks);
	  
		UtilityClass.fn_Input("CargoDeductionCalculationPg_Remarks_txt2",Remarks);
	     Thread.sleep(2000);
	    UtilityClass.fn_Click("CargoDeductionCalculationPg_next_Btn");
	    Thread.sleep(30000);
	}
	public void clickOnNextButton() throws Exception
	{
		Thread.sleep(3000);
		UtilityClass.fn_Click("CargoDeductionCalculationPg_next_Btn");
	    Thread.sleep(20000);
	}

}
