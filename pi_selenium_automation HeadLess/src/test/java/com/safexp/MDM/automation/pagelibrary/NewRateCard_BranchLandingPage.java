package com.safexp.MDM.automation.pagelibrary;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class NewRateCard_BranchLandingPage {

	Logger log = Logger.getLogger(NewRateCard_BranchLandingPage.class.getName());

	public void clickContinue() {
		
		try {
			log.info("clicking on continue button");
			UtilityClass.fn_Click("Branch_ContinueButton");		
			UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);	
		}catch(Exception ex) {
			log.info("NRCBLP - clickContinue: " + ex.getMessage().toString());
		}
	}

	public void clickOnSearchIcon() {
		try {
			log.info("clicking on search icon");
			UtilityClass.fn_Click("Branch_searchicon");
			UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);			
		}catch(Exception ex) {
			log.info("NRCBLP - clickOnSearchIcon: " + ex.getMessage().toString());
		}
	}

	public void setBranchSearchPopupInput(String branch) {
		
		try {
			log.info("branch to search is being entered");
			UtilityClass.fn_Input("Branch_searchPopupInput", branch);
			UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);		
		}catch(Exception ex) {
			log.info("NRCBLP - setBranchSearchPopupInput: " + ex.getMessage().toString());
		}

	}

	public void clickOnPopUpSearchIcon() {
		
		try {
			log.info("search icon on popup is being clicked");
			UtilityClass.fn_Click("Branch_searchPopupIcon");
			UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);		
		}catch(Exception ex) {
			log.info("NRCBLP - clickOnPopUpSearchIcon: " + ex.toString());
		}

	}

	public void selectBranch() {
		try {
			log.info("branch is being selected");
			UtilityClass.fn_Click("Branch_selectBranch");	
			UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);	
		}catch(Exception ex) {
			log.info("NRCBLP - selectBranch: " + ex.toString());
		}
	}

	public void clickSave() {
		try {
			log.info("save button is being clicked");
			UtilityClass.fn_Click("Branch_SaveButton");		
			UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);	
		}catch(Exception ex) {
			log.info("NRCBLP - clickSave: " + ex.toString());
		}
	}

	public void setBranch(String branch) {
		try {
			UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
			clickOnSearchIcon();
			UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
			setBranchSearchPopupInput(branch);
			clickOnPopUpSearchIcon();
			UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
			selectBranch();
			clickSave();			
		}catch(Exception ex) {
			log.info("NRCBLP - setBranch: " + ex.getMessage().toString());
		}

	}

	public void setExpiryDate(String date) {
		String[] dt = date.split("-");
		String day = dt[0];
		String month = dt[1].toUpperCase();
		String year = dt[2];
		log.info("clicking on calendar icon");
		UtilityClass.fn_Click("Branch_Expirydate_CalIcon");
		log.info("clicking on year dropdown");
		UtilityClass.fn_Click("Branch_Expirydate_yeardropdown");
		log.info("selecting year");
		List<WebElement> yearList = UtilityClass.fn_getWebelements("Branch_Expirydate_selectyear");
		int listsize = yearList.size();
		for (int i = 0; i < listsize; i++) {
			String s = yearList.get(i).getText();
			if (s.equals(year)) {
				log.info("year is found and is being selected");
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(yearList.get(i)).click().build().perform();
				break;

			} else {
				log.info("expected year is not matched");
			}
		}
		log.info("month is being selected");
		List<WebElement> monthList = UtilityClass.fn_getWebelements("Branch_Expirydate_selectmonth");
		int n = monthList.size();
		for (int i = 0; i < n; i++) {
			String s = monthList.get(i).getText();
			if (s.equals(month)) {
				log.info("expected is found and is being selected");
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(monthList.get(i)).click().build().perform();
				break;

			} else {
				log.info("month is not matched");
			}
		}
		log.info("selecting day");
		List<WebElement> dayList = UtilityClass.fn_getWebelements("Branch_Expirydate_selectday");
		int d = dayList.size();
		for (int i = 0; i < d; i++) {
			String s = dayList.get(i).getText();
			if (s.equals(day)) {
				log.info("day is found and is being selected");
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(dayList.get(i)).click().build().perform();
				break;

			} else {
				log.info("day is not matched");
			}
		}

	}

	public void setBookingHold(String reason) {
		log.info("clicking on booking hold checkbox");
		UtilityClass.fn_Click("Branch_BookingHoldCheckbox");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		log.info("clicking on booking hold dropdown");
		UtilityClass.fn_clickByAction("Branch_BookingHold");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		log.info("list of booking hold is being fetched");
		List<WebElement> bookingList = UtilityClass.fn_getWebelements("Branch_BookingHoldOptions");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		int listsize = bookingList.size();
		log.info("searching the booking hold in the list");
		for (int i = 0; i < listsize; i++) {
			String s = bookingList.get(i).getText();
			if (s.equals(reason)) {
				log.info("booking hold is being selected");
				WebElement we = bookingList.get(i);
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(we).perform();
				we.click();
				UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
				break;
			} else {
				log.info("booking hold is not matched");
			}
		}
			UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void setDeliveryHold(String reason) {
		log.info("clicking on delivery hold checkbox");
		UtilityClass.fn_Click("Branch_DeliveryHoldCheckbox");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		log.info("clicking on delivery hold dropdown");
		UtilityClass.fn_clickByAction("Branch_DeliveryHold");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		log.info("selecting the delivery hold");
		List<WebElement> deliveryList = UtilityClass.fn_getWebelements("Branch_DeliveryHoldOptions");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		int listsize = deliveryList.size();
		for (int i = 0; i < listsize; i++) {
			String s = deliveryList.get(i).getText();
			if (s.equals(reason)) {
				log.info("delivery hold is found and selected");
				WebElement we = deliveryList.get(i);
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(we).perform();
				we.click();
				UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
				break;
			} else {
				log.info("delivery hold is not matched");
			}
		}
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void submitBranch(String branch, String date, String bookreason, String deliverreason) {
		try {
		setBranch(branch);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		setExpiryDate(date);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		// setBookingHold(bookreason);
		// setDeliveryHold(deliverreason);
		setCustomerLocation();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		clickContinue();
		}
		catch(Exception ex) {
			log.info(ex.toString());
		}
	}

	private void setCustomerLocation() {
		UtilityClass.fn_Click("Branch_CLICK_TO_SET_CUSTOMER_LOCATION");
		log.info("Branch_CLICK_TO_SET_CUSTOMER_LOCATION");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("BRANCH_CLICK_ON_CHECK_BOX");
		log.info("BRANCH_CLICK_ON_CHECK_BOX");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("BRANCH_CLICK_ON_SUBMIT");
		log.info("BRANCH_CLICK_ON_SUBMIT");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
	}
}
