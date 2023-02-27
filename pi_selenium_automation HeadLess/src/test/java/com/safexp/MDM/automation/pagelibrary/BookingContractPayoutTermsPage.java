package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class BookingContractPayoutTermsPage {
	Logger log=Logger.getLogger(BookingContractPayoutTermsPage.class.getName());
	public void payoutCalculation(String CreditAmt,String ToPayAmt,String PaidAmt,String WaybillMin,String WaybillMax,String AdditionalParameterValue,String StartDt,String EndDt,String Amount,String Reason,String StartDate,String EndDate,String Remarks) throws Exception
	{
		
		UtilityClass.fn_Click("BookingContractPayoutTermsPage_payoutBased_Dropdn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("BookingContractPayoutTermsPage_payoutBased_DropdnOption1");
		UtilityClass.fn_clickByAction("BookingContractPayoutTermsPage_expenseType_Dropdn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("BookingContractPayoutTermsPage_expenseType_DropdnOption1");
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_surface_credit",CreditAmt);
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_surface_paid",PaidAmt);
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_surface_topay",ToPayAmt);
		
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_air_credit",CreditAmt);
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_air_paid",PaidAmt);
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_air_topay",ToPayAmt);
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_express_credit",CreditAmt);
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_express_paid",PaidAmt);
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_express_topay",ToPayAmt);
		
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_Test_credit",CreditAmt);
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_Test_paid",PaidAmt);
		
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_Test_topay",ToPayAmt);
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_express+_credit",CreditAmt);
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_express+_paid",PaidAmt);
		
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_express+_topay",ToPayAmt);
        UtilityClass.fn_Click("BookingContractPayoutTermsPage_ExGratia_yes_RadioBtn");
        UtilityClass.fn_Click("BookingContractPayoutTermsPage_promotionApplicable_yes_RadioBtn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("BookingContractPayoutTermsPage_additionalExpense_yes_RadioBtn");
				
		UtilityClass.fn_Input("BookingContractPayoutTermsPage_WaybillMin",WaybillMin);
	UtilityClass.fn_Input("BookingContractPayoutTermsPage_WaybillMax",WaybillMax);
		UtilityClass.fn_Click("BookingContractPayoutTermsPage_MG_yes_RadioBtn");
	
			UtilityClass.fn_Click("BookingContractPayoutTermsPage_next_btn");
			Thread.sleep(5000);
		
	}
	
	public void updateDetails(String WaybillMin,String WaybillMax,String Remarks ) throws Exception
	{
		log.info("updating payout details");
		Thread.sleep(10000);
	    UtilityClass.fn_Input("BookingContractPayoutTermsPageupdate_WaybillMin",WaybillMin);
	    log.info("updated waybil min value");
		UtilityClass.fn_Input("BookingContractPayoutTermsPageupdate_WaybillMax",WaybillMax);
		log.info("updated waybil max value");
	//	UtilityClass.fn_Input("BookingContractPayoutTermsPageupdate_Remarks",Remarks);*/
		UtilityClass.fn_Click("BookingContractPayoutTermsPage_next_btn");
		Thread.sleep(5000);
	}
	public void clickNextButton() throws Exception
	{
		log.info("Payout terms page");
		UtilityClass.fn_Click("BookingContractPayoutTermsPage_next_btn");
		
		Thread.sleep(5000);
	}
}
