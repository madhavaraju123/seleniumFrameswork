package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.base.Verify;
import com.safexp.MDM.automation.Utility.UtilityClass;
import com.safexp.MDM.automation.baseClass.BaseClass;

public class Loginpage extends BaseClass
{
	Logger log=Logger.getLogger(Loginpage.class.getName());
	public void validLogin(String s1,String s2) throws InterruptedException
	{
		try {
			log.info("LoginPage:validLogin method");
			Thread.sleep(2000);
			log.info("username is being entered");
			UtilityClass.fn_Input("Loginpage_usernm_Input", s1);
			Thread.sleep(2000);
			log.info("password is being entered");
			UtilityClass.fn_Input("Loginpage_password_Input", s2);
			log.info("clicking on login button");

			log.info("Saroj: 1");
			UtilityClass.fn_clickByAction("Loginpage_login_btn");
			Thread.sleep(10000);
			log.info("Saroj: 2");
		} 
		catch (Exception ex) {
			log.info("Saroj: 3");
			log.info("Saroj: 4" + ex.toString());
			// TODO Auto-generated catch block
		}	
//		catch (InterruptedException e) {
//			e.printStackTrace();
//		} 
		
		/*boolean status=UtilityClass.fn_isDisplayed("UsermanagementHome_BurgerMenu");
		if(status==true) {
		log.info("User logined successfully");
		}
		else
		{
			log.info("Username or password is incorrect");
			Verify.verify(false);
			
		}*/
	}
	

}











