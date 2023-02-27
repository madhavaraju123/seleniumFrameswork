package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class ExistingSFXPage {
	Logger log = Logger.getLogger(ExistingSFXPage.class.getName());

	public void clickOnEdit() {
		log.info("Editing SFX Code");
		UtilityClass.fn_Click("SFX_EditIcon");
	}

}
