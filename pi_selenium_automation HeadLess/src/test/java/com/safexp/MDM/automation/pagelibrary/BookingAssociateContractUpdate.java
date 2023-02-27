package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class BookingAssociateContractUpdate {
	Logger log=Logger.getLogger(BookingAssociateContractUpdate.class.getName());
	public void updateExistingContract() throws Exception
	{
		
	//	UtilityClass.fn_clickByAction("BookingAssociateContractUpdate_PaymentTermstab");
		
		
	UtilityClass.fn_clickByAction("BookingAssociateContractUpdate_Deductiontab");
	log.info("navigating to deduction page");
	Thread.sleep(50000);
	}

}
