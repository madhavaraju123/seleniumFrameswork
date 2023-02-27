package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class DeliveryContractPaymentTermsPg {
	Logger log=Logger.getLogger(DeliveryContractPaymentTermsPg.class.getName());
public void CalcPaymentTerms(String Rate,String incentive1,String incentive2,String incentive3,String Amt,String EndDt,String StartDt) throws Exception
{
	UtilityClass.fn_Click("DeliveryContractPaymentTermsPg_payoutdd");
	UtilityClass.fn_Click("DeliveryContractPaymentTermsPg_payoutoptionPerWaybil");
	UtilityClass.fn_Input("DeliveryContractPaymentTermsPg_RateperWaybill",Rate);
	UtilityClass.fn_Click("DeliveryContractPaymentTermsPg_AdditionalAmtFlg_No");
	UtilityClass.fn_Input("DeliveryContractPaymentTermsPg_SameDayIncentive", incentive1);
	UtilityClass.fn_Input("DeliveryContractPaymentTermsPg_NextDayIncentive", incentive2);
	UtilityClass.fn_Input("DeliveryContractPaymentTermsPg_SecondDayIncentive", incentive3);
	UtilityClass.fn_Input("DeliveryContractPaymentTermsPg_ThirdDayIncentive", incentive3);
	UtilityClass.fn_Click("DeliveryContractPaymentTermsPg_ContinueBtn");
	Thread.sleep(3000);
	//UtilityClass.fn_Click("DeliveryContractPaymentTermsPg_ExGratiaFlag");
	/*UtilityClass.fn_Input("DeliveryContractPaymentTermsPg_ExGratiaAmt", Amt);
	UtilityClass.fn_Input("DeliveryContractPaymentTermsPg_StartDt", StartDt);
	UtilityClass.fn_Input("DeliveryContractPaymentTermsPg_EndDt", EndDt);*/
	//UtilityClass.fn_Click("DeliveryContractPaymentTermsPg_MGFlagNo");
	//UtilityClass.fn_Click("DeliveryContractPaymentTermsPg_PromotionalFlagNo");
//	UtilityClass.fn_Click("DeliveryContractPaymentTermsPg_AdditionalExpenseFlag");
	
	UtilityClass.fn_Click("DeliveryContractPaymentTermsPg_nextBtn");
	Thread.sleep(10000);
}
public void updateDetails(String Incentive1,String Incentive2,String Incentive3) throws Exception
{
	/*log.info("updating incentive details");
	Thread.sleep(3000);
	UtilityClass.fn_Input("DeliveryContractPaymentTermsPg_SameDayIncentive", Incentive1);
	UtilityClass.fn_Input("DeliveryContractPaymentTermsPg_RateperWaybill",Incentive1);
	UtilityClass.fn_Input("DeliveryContractPaymentTermsPg_NextDayIncentive", Incentive2);
	UtilityClass.fn_Input("DeliveryContractPaymentTermsPg_SecondDayIncentive", Incentive3);*/
	UtilityClass.fn_Click("DeliveryContractPaymentTermsPg_ContinueBtn");
	Thread.sleep(3000);
	UtilityClass.fn_Click("DeliveryContractPaymentTermsPg_nextBtn");
	Thread.sleep(10000);
	
}

}
