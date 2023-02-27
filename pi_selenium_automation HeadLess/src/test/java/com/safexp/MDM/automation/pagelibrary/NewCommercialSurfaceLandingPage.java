package com.safexp.MDM.automation.pagelibrary;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class NewCommercialSurfaceLandingPage {
	Logger log = Logger.getLogger(NewCommercialSurfaceLandingPage.class.getName());

	public void submitCommercialSurface(String chargeby, String prodcategory, String Arate, String Afreight,
			String Brate, String Bfreight, String Crate, String Cfreight, String Drate, String Dfreight, 
			String Erate, String Efreight) {
		log.info("NCSLP : submitCommercialSurface -- inside");
		
		log.info(Efreight);
		log.info(Erate);

		try {
			log.info("New Commercial Surface Landing Page: ChargeBy");
			setCommercialSurface_ChargeBy(chargeby);
			log.info("New Commercial Surface Landing Page: ProductCategory");
			setCommercialSurface_ProdCategory(prodcategory);
			log.info("New Commercial Surface Landing Page: GSTFlag");
			clickOnCommercialSurface_GSTFlag();
			log.info("New Commercial Surface Landing Page: GSTType");			
			clickOnCommercialSurface_GSTType();
			log.info("New Commercial Surface Landing Page: SlabRequired");				
			clickOnCommercialSurface_slabRequired();
			log.info("New Commercial Surface Landing Page: ZonalGroup");	
			setZonalGroup(Arate, Afreight, Brate, Bfreight, Crate, Cfreight, Drate, Dfreight, Erate, Efreight);
			log.info("New Commercial Surface Landing Page: SFXExt Flag");	
			clickOnCommercialSurface_safextensionFlag();
			log.info("New Commercial Surface Landing Page: Roundoff");			
			clickOnCommercialSurface_roundOff5or10();
			UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
			log.info("New Commercial Surface Landing Page: SufaceContinueButton");	
			clickOnCommercialSurface_Continue_bt();
			// selectCommercialCard();
		} 
		catch (Exception ex) {
			log.info("New Commercial Surface Landing Page: " + ex.toString());
			// TODO Auto-generated catch block
		}

	}

	public void clickOnCommercialSurface_roundOff5or10() {
		UtilityClass.fn_Click("CommercialSurface_roundOff5or10");
	}

	public void clickOnCommercialSurface_GSTFlag() {
		UtilityClass.fn_Click("CommercialSurface_GSTFlag_Yes");
	}
	
	public void clickOnCommercialSurface_GSTType() {
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		UtilityClass.fn_Click("CommercialSurface_GSTType_click");
		UtilityClass.fn_Click("CommercialSurface_GSTType_select");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void clickOnCommercialSurface_slabRequired() {
		UtilityClass.fn_Click("CommercialSurface_slabRequired_No");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}
	
	//TODO adding new to handle flacky scenarios
	public void setCommercialSurface_ProdCategory(String prodcategory) {	
		log.info("clicking on Product Category dropdown");
		//Actions act=new Actions(UtilityClass.driver);
		UtilityClass.fn_Click("CommercialSurface_ProdCategory");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		//act.moveToElement(we).perform();
		//we.click();
		UtilityClass.fn_Input("CommercialSurface_ProdCategory_search_input", prodcategory);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		UtilityClass.fn_Click("CommercialSurface_ProdCategoryoptions");
	}

	public void clickOnCommercialSurface_safextensionFlag() {
		UtilityClass.fn_Click("CommercialSurface_safextensionFlag_NO");
	}


	public void setCommercialSurface_ChargeBy(String chargeby) {
		try {
			log.info("NCSLP - setCommercialSurface_ChargeBy: Button Clicking");
			UtilityClass.fn_Click("CommercialSurface_ChargeBy");
			UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
			log.info("NCSLP - CommercialSurface_ChargeByOptions: Option Selecting");
			List<WebElement> commandmentoptions = UtilityClass.fn_getWebelements("CommercialSurface_ChargeByOptions");
			int n = commandmentoptions.size();
			for (int i = 0; i < n; i++) {
				WebElement we = commandmentoptions.get(i);
				String s = we.getText();
				if (s.equals(chargeby)) {
					// Actions ac=new Actions(UtilityClass.driver);
					// ac.moveToElement(we).perform();
					we.click();
					break;
				}
			}
		} 
		catch (Exception ex) {
			log.info("NCSLP - setCommercialSurface_ChargeBy: " + ex.toString());
			// TODO Auto-generated catch block
		}

	}

//	public void setCommercialSurface_ProdCategory(String prodcategory) {
//		UtilityClass.fn_Click("CommercialSurface_ProdCategory");
//		UtilityClass.wait(2000);
//		List<WebElement> commandmentoptions = UtilityClass.fn_getWebelements("CommercialSurface_ProdCategoryoptions");
//		int n = commandmentoptions.size();
//
//		for (int i = 0; i < n; i++) {
//			WebElement we = commandmentoptions.get(i);
//			String s = we.getText();
//			if (s.equals(prodcategory)) {
//				// Actions ac=new Actions(UtilityClass.driver);
//				// ac.moveToElement(we).perform();
//				we.click();
//				break;
//			}
//		}
//	}

	public void setZonalGroup(String Arate, String Afreight, String Brate, String Bfreight, String Crate,
			String Cfreight, String Drate, String Dfreight, String Erate, String Efreight) {
		List<WebElement> zonaloptions = UtilityClass.fn_getWebelements("CommercialSurface_ZonalGrp");
		int n = zonaloptions.size();
		String[] zonalval = { Arate, Afreight, Brate, Bfreight, Crate, Cfreight, Drate, Dfreight, Erate, Efreight};
		for (int i = 0; i < n; i++) {
			WebElement we = zonaloptions.get(i);
			we.clear();
			log.info(zonalval[i]);
			we.sendKeys(zonalval[i]);
		}
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
	}

	public void selectCommercialCard() {
		UtilityClass.fn_Click("CommercialSurfaceLink");
		List<WebElement> ls = UtilityClass.fn_getWebelements("CommercialSurfaceCardList");
		int n = ls.size();
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		// WebElement wele=ls.get(n-1);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_2S);
		// wele.click();
		WebElement wele = UtilityClass.driver
				.findElement(By.xpath("//form[@name='commSurface']/div/div[1]/div[" + n + "]/div/div/h6"));
		String commercialcardcode = wele.getText();
		System.out.println("commercialcardcode:" + commercialcardcode);
		wele.click();

		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_5S);
		UtilityClass.fn_Click("CommercialSurfaceLink");
	}

	public void clickOnCommercialSurface_SaveAndCreateNew_bt() {
		UtilityClass.fn_Click("CommercialSurface_SaveAndCreateNew_bt");
	}

	public void clickOnCommercialSurface_Continue_bt() {
		try {
			UtilityClass.fn_Click("CommercialSurface_Continue_bt");			
		}catch(Exception ex) {
			log.info(ex.getMessage().toString());
		}
		

	}

}
