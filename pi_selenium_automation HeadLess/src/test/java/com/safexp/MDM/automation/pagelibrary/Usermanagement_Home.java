package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.UtilityClass;
import com.safexp.MDM.automation.baseClass.BaseClass;

public class Usermanagement_Home extends BaseClass {
	Logger log=Logger.getLogger(Usermanagement_Home.class.getName());
	public void clickOnPlusIcon()
	{
		UtilityClass.fn_Click("UsermanagementHomeCreateUser_PlusIcon_BT");
	}
	
	public void verifyForUserCreation(String expectedVal)
	{   String actual=UtilityClass.getdataofWebTable("UsermanagementHome_WebTable");
		//UtilityClass.validateString(actual);
	}
	
	public void clickOnBurgerMenu() throws InterruptedException
	{
		Thread.sleep(10000);
	UtilityClass.fn_clickByAction("UsermanagementHome_BurgerMenu");
	Thread.sleep(2000);
	}
	
	public void clickOnUserManagementInBurgerMenu() throws InterruptedException
	{
		//WebElement we=UtilityClass.getWebElement("UsermanagementHome_Usermanagementmenu_BurgerMenu");
		//we.click();
		System.out.println("clicking on user management option");
		Thread.sleep(4000);
		UtilityClass.fn_Click("UsermanagementHome_Usermanagementmenu_BurgerMenu");
	}
	public void clickOnUserInUsermanagementInBurgerMenu() throws InterruptedException
	{
		System.out.println("clicking on user menu option");
		clickOnBurgerMenu();
		clickOnUserManagementInBurgerMenu();
		UtilityClass.fn_Click("UsermanagementHome_user_Usermanagementmenu");
		System.out.println("clicked on user menu option");
	
	}
	public void clickOnRoleInUsermanagementInBurgerMenu() throws InterruptedException
	{	
		clickOnBurgerMenu();
		clickOnUserManagementInBurgerMenu();
		Thread.sleep(2000);
		UtilityClass.fn_Click("UsermanagementHome_role_Usermanagementmenu");
		System.out.println("clicked on role menu option");
	}
	public void clickOnObjectInUsermanagementInBurgerMenu() throws InterruptedException
	{
		
		clickOnBurgerMenu();
		clickOnUserManagementInBurgerMenu();
		System.out.println("clicking on object menu option");
		Thread.sleep(2000);
		UtilityClass.fn_clickByAction("UsermanagementHome_object_Usermanagementmenu");
		System.out.println("clicked on object menu option");
		Thread.sleep(20000);

	}
}
