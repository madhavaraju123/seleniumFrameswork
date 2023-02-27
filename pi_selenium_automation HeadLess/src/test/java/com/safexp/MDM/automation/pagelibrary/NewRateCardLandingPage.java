package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class NewRateCardLandingPage {
	Logger log = Logger.getLogger(NewRateCardLandingPage.class.getName());

	public void setBaseLocation(String branchlocation) {
		//Actions act = new Actions(UtilityClass.driver);
		UtilityClass.fn_Input("baseLocationSearch", branchlocation);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		UtilityClass.fn_clickByAction("baseLocationOptions");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void createRateCard(String zonematrix, String cmnt, String serviceoffering, String baseLocation,
			String commandment) throws InterruptedException {
		setZoneMatrix(zonematrix);
		setRateCardCommandment(commandment);
		setComment(cmnt);
	    // setServiceOffering(serviceOffering);
		// setBaseLocation(baseLocation);
		log.info("clicking continue button");
		clickContinue();
		// setRatecardName();
	}

	public void setRatecardName() {
		UtilityClass.fn_Click("ratecardheading");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		/*
		 * List<WebElement> ls=UtilityClass.fn_getWebelements("ratecardiconlist"); int
		 * n=ls.size(); if(n==1) { WebElement
		 * wele=UtilityClass.driver.findElement(By.xpath(
		 * "//div[@class='commercialboxflex']/div[1]/div/div/div/h6")); wele.click(); }
		 * else { WebElement wele=UtilityClass.driver.findElement(By.xpath(
		 * "//div[@class='commercialboxflex']/div[1]/div["+n+"]/div/div/h6"));
		 * wele.click(); }
		 * 
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * //WebElement we1=ls.get(n-1); //we1.click();
		 * 
		 * 
		 * String ratecardcode=UtilityClass.driver.findElement(By.name("rateCardCode")).
		 * getAttribute("value"); System.out.println("ratecardcode:"+ratecardcode);
		 * UtilityClass.fn_Click("continueButton"); try { Thread.sleep(5000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
	}

	public void setComment(String cmnt) {
		UtilityClass.fn_Input("comment", cmnt);

	}

	public void clickContinue() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_4S);
		UtilityClass.fn_Click("NewRateCardLandingPage_continueButton");
	}

	public void setServiceOffering(String service) {
		UtilityClass.fn_Click("serviceOffering");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		UtilityClass.fn_clickByAction("serviceOfferingOption");
		/*
		 * List<WebElement>
		 * serviceList=UtilityClass.fn_getWebelements("serviceOfferingOption"); int
		 * listsize=serviceList.size();
		 * 
		 * for(int i=0;i<listsize;i++) { WebElement we=serviceList.get(i); String
		 * s=we.getText(); if(s.equals(service)) { // Actions ac=new
		 * Actions(UtilityClass.driver); // ac.moveToElement(we).perform(); we.click();
		 * break;
		 * 
		 * } }
		 */
	}

	public void setZoneMatrix(String zone) {
		UtilityClass.fn_Click("zoneMatrix");
		log.info("clicking zone Matrix options");
		UtilityClass.fn_Click("zoneMatrix_options");
		/*
		 * List<WebElement>
		 * zoneoptions=UtilityClass.fn_getWebelements("zoneMatrix_options"); int
		 * n=zoneoptions.size(); for(int i=0;i<n;i++) { String
		 * s=zoneoptions.get(i).getText(); if(s.equals(zone)) {
		 * zoneoptions.get(i).click();break; } }
		 */
	}

	public void setRateCardCommandment(String commandment) {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		UtilityClass.fn_Click("commandement");
		log.info("clicking commandment Options");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		UtilityClass.fn_Click("commandement_options");

		/*
		 * List<WebElement>
		 * commandmentoptions=UtilityClass.fn_getWebelements("commandement_options");
		 * int n=commandmentoptions.size();
		 * 
		 * for(int i=0;i<n;i++) { WebElement we=commandmentoptions.get(i); String
		 * s=we.getAttribute("value"); if(s.equals(commandment)) { //Actions ac=new
		 * Actions(UtilityClass.driver); //ac.moveToElement(we).perform(); we.click();
		 * break;
		 * 
		 * } }
		 */
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}
}
