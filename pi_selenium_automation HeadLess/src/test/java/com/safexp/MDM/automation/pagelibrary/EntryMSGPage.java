package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

public class EntryMSGPage {
	Logger log = Logger.getLogger(ExistingSFXPage.class.getName());

	public void printEntryMessage(String testCaseID) {
		log.info(testCaseID + " --------------- is being Executed");
	}

	public void printExitMessage(String testCaseID) {
		log.info(testCaseID + " --------------- is Executed");
	}
}