package com.safexp.MDM.automation.pagelibrary;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class DocumentSubmissionPage {
	Logger log = Logger.getLogger(DocumentSubmissionPage.class.getName());

	public static UtilityClass uc = new UtilityClass();

	public void DocumentSubmission_doctype(String service) {
		try {
			log.info("clicking on document type dropdown");
			UtilityClass.fn_Click("DocumentSubmission_doctype");
			Thread.sleep(2000);
			// WebDriverWait wait=new WebDriverWait(UtilityClass.driver,30);
			// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='cdk-overlay-pane']/div/div/mat-option")));
			log.info("list of document type is being fetched");
			List<WebElement> serviceList = UtilityClass.fn_getWebelements("DocumentSubmission_doctypeOption");

			int listsize = serviceList.size();
			log.info("expected document type is being searched in list");
			for (int i = 0; i < listsize; i++) {
				WebElement we = serviceList.get(i);
				String s = we.getText();
				if (s.equals(service)) {
					log.info("expected document type is being selected");
					// Actions ac=new Actions(UtilityClass.driver);
					// ac.moveToElement(we).perform();
					Thread.sleep(2000);
					we.click();
					break;

				} else {
					log.info("document type not matched");
				}
			}
		} catch (Exception e) {
		}
	}

	public void DocumentSubmission_docSubtype(String service) {
		try {
			log.info("clicking on document subtype dropdown");
			UtilityClass.fn_Click("DocumentSubmission_docSubtype");
			Thread.sleep(2000);
			// WebDriverWait wait=new WebDriverWait(UtilityClass.driver,30);
			// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='cdk-overlay-pane']/div/div/mat-option")));
			log.info("list of document subtype is being fetched");
			List<WebElement> serviceList = UtilityClass.fn_getWebelements("DocumentSubmission_docSubtypeOption");
			int listsize = serviceList.size();
			log.info("expected document subtype is being searched in list");
			for (int i = 0; i < listsize; i++) {
				WebElement we = serviceList.get(i);
				String s = we.getText();
				if (s.equals(service)) {
					log.info("expected document type is being selected");
					// Actions ac=new Actions(UtilityClass.driver);
					// ac.moveToElement(we).perform();
					Thread.sleep(2000);
					we.click();
					break;

				} else {
					log.info("document type not matched");
				}
			}
		} catch (Exception e) {
		}
	}

	public void DocumentSubmission_Entitytype(String service) {
		try {
			log.info("clicking on entity type dropdown");
			UtilityClass.fn_Click("DocumentSubmission_Entitytype");
			Thread.sleep(2000);
			// WebDriverWait wait=new WebDriverWait(UtilityClass.driver,30);
			// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='cdk-overlay-pane']/div/div/mat-option")));
			log.info("list of entity type is being fetched");
			List<WebElement> serviceList = UtilityClass.fn_getWebelements("DocumentSubmission_EntitytypeOption");
			int listsize = serviceList.size();
			log.info("expected entity type is being searched in list");
			for (int i = 0; i < listsize; i++) {
				WebElement we = serviceList.get(i);
				String s = we.getText();
				if (s.equals(service)) {
					log.info("expected entity type is being selected");
					// Actions ac=new Actions(UtilityClass.driver);
					// ac.moveToElement(we).perform();
					Thread.sleep(2000);
					we.click();
					break;

				} else {
					log.info("entity type not matched");
				}
			}
		} catch (Exception e) {
		}
	}

	public void clickOnPreview() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_1S);
		UtilityClass.fn_Click("DocumentSubmission_PreviewButton");
		log.info("Clicked on preview button");
	}

	public void getSFXCodeFromSFXGeneratedPopupMessage() {
		log.info("Catching SFX Code");
		String sfxcode = UtilityClass.getTextOnElement("SFXCodeGeneratedMessage");
		log.info("generated sfxcode:" + sfxcode);
		uc.setSFXCode(sfxcode);
		log.info("clicking on popup OK button");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("SFXCodeGeneratedpopupOKbutton");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
	}

	public void validateSFXcode(String sfxcode) {
		log.info("sfxcode is being validated");
		log.info(UtilityClass.fn_getText("SFXcodeOnDocumentUploadPage"));
//	UtilityClass.fn_validateText("SFXcodeOnDocumentUploadPage",sfxcode);
	}

	public void validatePRCcode(String PRCcode) {
		log.info("PRCcode is being validated");
		log.info(UtilityClass.fn_getText("PRCcodeOnDocumentUploadPage"));
		// UtilityClass.fn_validateText("PRCcodeOnDocumentUploadPage",PRCcode);
	}

	public void clickOnPreviewPageSubmit() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("PreviewPageSubmit");
		log.info("Clicked on preview page submit button");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
	}

	public void setDocumentDetails(String doctype, String docsubtype, String entitytype) {
		
		try {
			log.info("DOC Submission Page: Before Doc Type");
			DocumentSubmission_doctype(doctype);
			log.info("DOC Submission Page: Before Doc Sub Type");
			DocumentSubmission_docSubtype(docsubtype);
			log.info("DOC Submission Page: Before Entity Type");
			DocumentSubmission_Entitytype(entitytype);
			UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
			clickOnPreview();
			UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
			log.info("DOC Submission Page: Before Preview Submission");
			clickOnPreviewPageSubmit();
			UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		//  clickOnSubmit();
		//	UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		//  getSFXCodeFromSFXGeneratedPopupMessage();
		} 
		catch (Exception ex) {
			log.info("DOC Submission Page: Exception 1");
			log.info("DOC Submission Page: Exception : " + ex.toString());
			// TODO Auto-generated catch block
		}
	}

//	private void clickOnSubmit() {
//		UtilityClass.fn_Click("PreviewPage_Submit_button_click");
//		log.info("Clicked on submit button");
//	}

	public void validateAccountid(String ServiceaccountId) {
		UtilityClass.fn_validateText("BillingLandingPage_serviceaccountId", ServiceaccountId);
	}
}
