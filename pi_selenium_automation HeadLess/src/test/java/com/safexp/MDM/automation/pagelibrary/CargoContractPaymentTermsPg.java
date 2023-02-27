package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class CargoContractPaymentTermsPg {
	Logger log=Logger.getLogger(CargoContractPaymentTermsPg.class.getName());
	public void CalcPaymentTerms(String Price) throws Exception
	{
		Thread.sleep(5000);
		UtilityClass.fn_Click("CargoContractPaymentTermsPg_payoutdd");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CargoContractPaymentTermsPg_payoutoption");
		log.info("selected payout");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CargoContractPaymentTermsPg_Weighttypedd");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CargoContractPaymentTermsPg_WeighttypeddOption");
		Thread.sleep(3000);
		log.info("selected weight type");
		
		UtilityClass.fn_Input("CargoContractPaymentTermsPg__RateperPerson",Price);
		
		UtilityClass.fn_Click("CargoContractPaymentTermsPg_nextBtn");
		Thread.sleep(20000);
	}
	public void updateDetails(String Price) throws Exception
	{
		log.info("updating details");
		UtilityClass.fn_Input("CargoContractPaymentTermsPg__RateperPerson",Price);
		Thread.sleep(5000);
				
		UtilityClass.fn_Click("AirContractPaymentTermsPg_nextBtn");
		Thread.sleep(20000);
		
	}

}
