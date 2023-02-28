package com.safexp.MDM.automation.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.base.Function;
import com.safexp.MDM.automation.managerClasses.ReadExcelData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {

	public static Properties OR = null;
//	public static Properties PATHS = null;
	public static Properties conf = null;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static String expectedUserid;
	public static WebDriver driver;

	private String SFXCode;

	public String getSFXCode() {
		return SFXCode;
	}

	public void setSFXCode(String sFXCode) {
		SFXCode = sFXCode;
	}

	static Logger log = Logger.getLogger(UtilityClass.class.getName());
//	private static Object cellData;
//	public static Object fn_Click;

	public static void Init_SIT() {
		initOR_SIT();
		intitExtentReport();
		initLogReport();
	}
	


	public static void Init_UAT() {
		initOR_UAT();
		intitExtentReport();
		initLogReport();
	}
//	public static void Init_UAT_New() {
//		initPATHS_UAT();
//	}
//
//	public static void Init_UAT() {
//		initPATHS_UAT();
//		intitExtentReport();
//		initLogReport();
//	}

	public static void initLogReport() {
		PropertyConfigurator.configure("Log4j/log4j.properties");
		log.info("in beforetest");
	}

	public static void Initeration() {
		ReadExcelData.DataMap = ReadExcelData.DataIt.next();
	}

	public static void initOR_SIT() {
		try {
			FileInputStream file_or = new FileInputStream("OR/OR_SIT.properties");
			FileInputStream file_config = new FileInputStream("Config/config_SIT.properties");

			OR = new Properties();
			conf = new Properties();
			OR.load(file_or);
			conf.load(file_config);
		} catch (IOException e) {
			logger.fail("Object repository initialisation failed");
		}
	}
	
//	public static void initPATHS_UAT() {
//		try {
//			FileInputStream file_paths = new FileInputStream("C:\\Users\\80339\\eclipse-workspace\\WorkSpace2\\gitPropeliSelenium_UAT\\gitPropeliSelenium_UAT\\pi_selenium_automation\\PATHS\\PATHS_UAT.properties");
//			FileInputStream file_config = new FileInputStream("Config/config_UAT.properties");
//			PATHS = new Properties();
//			conf = new Properties();
//			PATHS.load(file_paths);
//			conf.load(file_config);
//			log.info("Loaded conf file");
//		} catch (IOException e) {
//			logger.fail("Object repository initialisation failed");
//		}
//	}


	public static void initOR_UAT() {
		try {
			FileInputStream file_or = new FileInputStream("OR/OR_UAT.properties");
			FileInputStream file_config = new FileInputStream("Config/config_UAT.properties");

			OR = new Properties();
			conf = new Properties();
			OR.load(file_or);
			conf.load(file_config);
			log.info("Loaded conf file");
		} catch (IOException e) {
        	logger.fail("Object repository initialisation failed");
		}
	}
   
   
	public static void webDriverInit(String browser) {
	
		browser = (System.getProperty("browser")!=null)?System.getProperty("browser"):"chrome";
		if (browser!=null) {
			if (browser.contains("chrome")) {
				
					WebDriverManager.chromedriver().setup();
//				     System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
					ChromeOptions chromeOptions = new ChromeOptions();
					chromeOptions.addArguments("headless");
					chromeOptions.addArguments("--window-size=1920,1080");
//					chromeOptions.setHeadless(true);
//					chromeOptions.addArguments("--no-sandbox");
//					chromeOptions.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
					driver = new ChromeDriver(chromeOptions);
//					driver = new ChromeDriver();
//					driver = new ChromeDriver();

//					// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//					driver.manage().window().maximize();
//					log.info("Chrome driver loaded Successfully");
//					
//	            options.addArguments("--window-size=1400,600");
			}else if (browser.contains("firefox")) {
				WebDriverManager.firefoxdriver().setup();
//				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
				FirefoxOptions firefoxOption = new FirefoxOptions();
				firefoxOption.addArguments("--headless");
				firefoxOption.addArguments("--window-size=1920,1080");
//				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver(firefoxOption);
				
			}else if (browser.contains("edge")) {
				WebDriverManager.edgedriver().setup();
//				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
				EdgeOptions edgeOption = new EdgeOptions();
				edgeOption.addArguments("--headless");
				edgeOption.addArguments("--window-size=1920,1080");
//				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver(edgeOption);
			
			}else {
				System.out.println("please give valid browser name like chrome, edge and firefox");
			}
//			Dimension d = new Dimension(1330, 800);
//			driver.manage().window().setSize(d);
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}else {
			System.out.println("please give browser name");
		}
		
	}
    
	public static void launchApplication(String url,String browser) {  // String url=conf.getProperty("AppUrl");
																		// String
                              											// browser=conf.getProperty("browser_name");
		webDriverInit(browser);
		driver.get(url);
		Assert.assertEquals(driver.getTitle(), "Safexpress");
	}
	
	public static void launchUrl() {
		String browser = conf.getProperty("browser_name");
		String url = conf.getProperty("ApplUrl");
		webDriverInit(browser);
		driver.get(url);
	}

	public static void closeApplication() {
		driver.close();
	}

	public static void clickOnElementByIndexInList(String listxpath, int index) {
		String xpath = OR.getProperty(listxpath);
		List<WebElement> wb = UtilityClass.driver.findElements(By.xpath(xpath));
		wb.get(index - 1).click();
	}

	public static void switchtoFrame() {
		driver.switchTo().frame("twcount");
	}

	public static void switchtodefaultFrame() {
		driver.switchTo().parentFrame();
	}

	public static void fn_Input(final String s1, String s) {
		System.out.println(s);
		implicitelyWaitForAComponent(Constants.WAIT_3S);

		WebElement we = getWebElement(By.xpath(s1));

		we.clear();
		we.sendKeys(s);
	}

	public static void fn_InputAndPressEnter(String s1, String s) {
		System.out.println(s);
		implicitelyWaitForAComponent(Constants.WAIT_3S);
		WebElement we = getWebElement(By.xpath(s1));
		we.clear();
		we.sendKeys(s, Keys.ENTER);
	}

	public static void fn_InputByAction(String s1, String s) {
		// System.out.println(s);
		WebElement we = getWebElement(By.xpath(s1));
		Actions act = new Actions(driver);
		act.moveToElement(we).doubleClick().sendKeys(Keys.BACK_SPACE).build().perform();
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(50));
		wt.until(ExpectedConditions.textToBePresentInElement(we, ""));
		we.clear();
		implicitelyWaitForAComponent(Constants.WAIT_5S);
		we.sendKeys(s);
	}

	public static void fn_doubleClick(String ORname) {
		WebElement we = getWebElement(By.xpath(ORname));
		Actions act = new Actions(driver);
		act.moveToElement(we).doubleClick().build().perform();
	}

	public static void fn_scrolldown(String scrollNum) {
		JavascriptExecutor js = ((JavascriptExecutor) UtilityClass.driver);
		js.executeScript(scrollNum);
		driver.manage().window().maximize();
	}

	public static void fn_scrollright() {
		JavascriptExecutor js = ((JavascriptExecutor) UtilityClass.driver);
		js.executeScript("window.scrollBy(0,-5000)");
	}

	public static void fn_scrollup() {
		JavascriptExecutor js = ((JavascriptExecutor) UtilityClass.driver);
		js.executeScript("window. scrollBy(0,-4000)");
	}

	public static void fn_sendKeysINTByJS(String ORname, String s) {
		WebElement we = getWebElement(By.xpath(ORname));
		int a = Integer.parseInt(s);
		JavascriptExecutor js = ((JavascriptExecutor) UtilityClass.driver);
		js.executeScript("arguments[0].setAttribute('value','" + a + "');", we);
	}

	public static void fn_sendKeysByJS(String ORname, String s) {
		WebElement we = getWebElement(By.xpath(ORname));
		JavascriptExecutor js = ((JavascriptExecutor) UtilityClass.driver);
		js.executeScript("arguments[0].setAttribute('value','" + s + "');", we);
	}

	public static void fn_metaselect(String metaselectxpath, String metaoptionxpath) {
		WebElement we = getWebElement(By.xpath(metaselectxpath));
		we.click();
		WebElement we2 = getWebElement(By.xpath(metaoptionxpath));
		we2.click();
	}

	public static void fn_switchTochildWindow() {
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();

		// Here we will check if child window has other child windows and will fetch the
		// heading of the child window
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
			}
		}
	}
	
	public static void fn_sendkeys(String newxpath,String inputText) {
		getWebElement(By.xpath(newxpath)).sendKeys(inputText);;
	}
	
	public static void fn_list(String listXpath,String expectedText) {
		
		List<WebElement> elem = driver.findElements(By.xpath(listXpath));
         String equals = expectedText.toUpperCase();
		for (WebElement option : elem) {
			if (option.getText().trim().toUpperCase().equalsIgnoreCase(equals)) {
				option.click();
				System.out.println("string matched and as expected");
				break;
			} else {
				System.out.println("String not matched");
			}
		}
	}

	public static String getdataofWebTable(String xpath) {
		WebElement we = getWebElement(By.xpath(xpath));
		return (we.getText());

	}

	public static void fn_applyTAB(String ORname) {
		WebElement we = getWebElement(By.xpath(ORname));
		we.sendKeys(Keys.TAB);

	}

	public static void fn_applyEnter(String ORname) {
		WebElement we = getWebElement(By.xpath(ORname));
		we.sendKeys(Keys.ENTER);

	}

	public static void fn_validateString(String ORname, String expectedtext) {
		WebElement we = getWebElement(By.xpath(ORname));
		implicitelyWaitForAComponent(Constants.WAIT_3S);
		String actual = we.getAttribute("value");
		System.out.println(actual);
		if (actual.equalsIgnoreCase(expectedtext)) {
			log.info("string matched and as expected");
		} else {
			log.info("string not matched");

		}
	}

	public static void implicitelyWaitForAComponent(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void fn_validateText(String ORname, String expectedtext) {
		WebElement we = getWebElement(By.xpath(ORname));
		implicitelyWaitForAComponent(Constants.WAIT_3S);
		String actual = we.getText();
		System.out.println("actual string is :" + actual + " expectedtext is :" + expectedtext);
		if (actual.equalsIgnoreCase(expectedtext)) {
			log.info("string matched and as expected");
		} else {
			log.info("string not matched");

		}
	}

	public static void fn_validatesplitText(String ORname, String expectedtext) {
		WebElement we = getWebElement(By.xpath(ORname));
		implicitelyWaitForAComponent(Constants.WAIT_3S);
		String actual = we.getText();
		String[] arr = actual.split(")");

		System.out.println("actual string is :" + arr[0] + " expectedtext is :" + expectedtext);
		if (arr[0].equalsIgnoreCase(expectedtext)) {
			log.info("string matched and as expected");
		} else {
			log.info("string not matched");

		}
	}

	public static void fn_SelectByVisibleText(String dropdownxpath, String dropdownlistxpath, String text) {
		WebElement element = getWebElement(By.xpath(dropdownxpath));
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();

		implicitelyWaitForAComponent(Constants.WAIT_3S);
		ac.click().perform();
		implicitelyWaitForAComponent(Constants.WAIT_3S);
		List<WebElement> optionslist = UtilityClass.fn_getWebelements(dropdownlistxpath);
		int n = optionslist.size();
		for (int i = 0; i < n; i++) {
			String s = optionslist.get(i).getText();
			if (s.equals(text)) {
				WebElement we1 = optionslist.get(i);
				ac.moveToElement(we1).perform();
				implicitelyWaitForAComponent(Constants.WAIT_3S);
				ac.click().perform();
				break;
			}
		}
	}

	public static void fn_SelectByIndex(String xpath, String index) {

	}

	public static void fn_SelectByValue(String xpath, String value) {

	}

	public static String getTitleOfPage() {
		return (driver.getTitle());
	}

	public static void fn_Click(String s) {
		WebElement we = getWebElement(By.xpath(s));
		try {
			Thread.sleep(500);
			we.click();
			// System.out.println("button clicked");
		} catch (Exception e) {
			// WebElement we=getWebElement(s);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", we);
			// System.out.println("button clicked");
		}
	}

	public static void fn_tab(String s) {
		WebElement we = getWebElement(By.xpath(s));
		we.sendKeys(Keys.TAB);
	}

	public static String fn_getTextfromDisabledElement(WebElement we) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('disabled','')", we);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(we));
		return we.getAttribute("value");
	}

	public static String fn_getText(String ORname) {
		WebElement we = getWebElement(By.xpath(ORname));
		return we.getText();
	}

	public static void clearTheContent(String ORname) {
		WebElement we = getWebElement(By.xpath(ORname));
		we.clear();
	}

	public static boolean fn_isDisplayed(String ORname) {
		boolean status = false;
		WebElement we = getWebElement(By.xpath(ORname));
		if (we != null) {
			status = true;
		}
		return status;
	}

	public static boolean fn_isEnabled(String ORname) {
		boolean status = false;
		WebElement we = getWebElement(By.xpath(ORname));
		if (we.isEnabled()) {
			status = true;
		}
		return status;
	}

	public static boolean fn_isChecked(String ORname) {
		boolean status = false;
		WebElement we = getWebElement(By.xpath(ORname));
		if (we.isSelected()) {
			status = true;
		}
		return status;
	}

	public static void fn_setFocusOnElement(String ORname) {
		WebElement we = getWebElement(By.xpath(ORname));
		String tagname = we.getTagName();
		System.out.println(tagname);
		if ("input".equals(tagname)) {
			we.sendKeys(" ");
		} else {
			new Actions(driver).moveToElement(we).perform();

		}
	}

	public static WebElement getWebElement(final By xpath) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(2000)).ignoring(NoSuchElementException.class);
		return wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(xpath);
			}
		});
	
//	     try {
//				return driver.findElement(xpath);
//			} catch (NoSuchElementException e) {
//				return null;
//				// TODO: handle exception
//			}

//		WebElement we = null;
//		try {
//			//String object = null;
//			String xpath1 = OR.getProperty(by);
//			// System.out.println(xpath);
//			we = driver.findElement(By.xpath(xpath1));
//		} catch (NoSuchElementException e) {
//			// log.info("element not found");
//		}
//		return we;
//
	}

	public static String genRandomNumber() {
		int nk;
		Random rn = new Random();
		nk = rn.nextInt();
		if (nk < 0) {
			nk = nk * (-1);
		}
		String s = Integer.toString(nk);
		return (s.substring(0, 3));

	}

	public static void pressDownArrowKey(String Object) {
		WebElement wb = getWebElement(By.xpath(Object));
		Actions a = new Actions(driver);
		a.moveToElement(wb).sendKeys(Keys.ARROW_DOWN);

	}

	public static void pressEnterKey(String Object) {
		WebElement wb = getWebElement(By.xpath(Object));
		// Actions a=new Actions(driver);
		wb.sendKeys(Keys.RETURN);
	}

	public static String getTextOnElement(String Object) {
		WebElement wb = getWebElement(By.xpath(Object));
		String text = wb.getText();
		return text;
	}

	public static void scrollToElementIntoView(String object) {
		WebElement element = getWebElement(By.xpath(object));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", element);

	}
	
	public static String getScreenshot(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		// String
		// path=System.getProperty("user.dir")+"/Report/"+System.currentTimeMillis()+".png";
		String path = "./Report/Screenshots/" + System.currentTimeMillis() + ".png";
		System.out.println(path);
		File destination = new File(path);
		
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			System.out.println("Capture Failed " + e.getMessage());
		}
		return path;
	}

	public static String takeScreenshot() {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		// String
		// path=System.getProperty("user.dir")+"/Report/"+System.currentTimeMillis()+".png";
		String path = "./Report/Screenshots/" + System.currentTimeMillis() + ".png";
		System.out.println(path);
		File destination = new File(path);

		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {

			System.out.println("Capture Failed " + e.getMessage());
		}
		return path;
	}

	// TODO - changed the deleting login from recursion to normal flow to avoid
	// delay
//	public static void deleteFolder(File folder) {
//		log.info("clearing Report directory");
//		final File[] files = folder.listFiles();
//		for (File f : files)
//			f.delete();
//	}

	public static void intitExtentReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Report/extentreport.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		log.info("Init Extent Report");
	}

	public static void closeAllWindow() {
		driver.quit();
	}

	public static List<WebElement> fn_getWebelements(String ORname) {
		//String xpath = OR.getProperty(ORname);
		List<WebElement> welist = driver.findElements(By.xpath(ORname));
		return welist;
	}

//	public static List<Integer> fn_searchByElementTextInWebTable(String xpathforrows, int columnindex, String text) {
//		// boolean flag=false;
//		// System.out.println("Element is being searched");
//		List<Integer> flag = new ArrayList<Integer>();
//		int count = 0;
//		waitForAComponent(Constants.WAIT_3S);
//		String xpath = OR.getProperty(xpathforrows);
//		List<WebElement> rows = fn_getWebelements(xpathforrows);
//
//		String beforeXpath = xpath + "[";
//		String afterXpath = "]/td[" + columnindex + "]";
//		int totalrecords = rows.size();
//		// System.out.println(totalrecords);
//		String txt = text.toUpperCase().trim();
//		for (int i = 1; i <= totalrecords; i++) {
//			String actualXpath = beforeXpath + i + afterXpath;
//			WebElement element = driver.findElement(By.xpath(actualXpath));
//			System.out.println(element.getText());
//			if (element.getText().equals(txt)) {
//				flag.add(i);
//				// System.out.println("Element found");
//				// break;
//			}
//		}
//		return flag;
//	}

	public static List<Integer> fn_searchByElementTextInWebTable(String xpathforrows, int columnindex, String text) {
		List<Integer> flag = new ArrayList<Integer>();
		implicitelyWaitForAComponent(Constants.WAIT_3S);
		String xpath = OR.getProperty(xpathforrows);
		List<WebElement> rows = fn_getWebelements(xpathforrows);

		String beforeXpath = xpath + "[";
		String afterXpath = "]/td[" + columnindex + "]";
		int totalrecords = rows.size();
		log.info("UC : fn_searchByElementTextInWebTable " + text + " RowSize: " + totalrecords);
		String txt = text.toUpperCase().trim();
		for (int i = 1; i <= totalrecords; i++) {
			String actualXpath = beforeXpath + i + afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			log.info("UC : fn_searchByElementTextInWebTable ");
			log.info(element.getText());
			String eleName = element.getText();
			String neweleName = eleName.replace('.', ' ');
			neweleName = neweleName.trim();
			log.info("UC : fn_searchByElementTextInWebTable Final: " + neweleName);
			if (txt.contains(neweleName)) {
				flag.add(i);
			}
		}
		return flag;
	}

	public static void fn_clickOnSetOfCheckboxInWebTable(String xpathforrows, List<Integer> rowindexlist,
			int columnindex) {
		String xpath = OR.getProperty(xpathforrows);
		// List<WebElement> rows=fn_getWebelements(xpath);
		String beforeXpath = xpath + "[";
		String afterXpath = "]/td[" + columnindex + "]/mat-checkbox";
		int totalrecords = rowindexlist.size();
		for (int i = 0; i < totalrecords; i++) {
			int rowindex = rowindexlist.get(i);
			String actualXpath = beforeXpath + rowindex + afterXpath;
			WebElement we = driver.findElement(By.xpath(actualXpath));
			Actions act = new Actions(driver);
			act.moveToElement(we).click().build().perform();
		}
	}

	public static void fn_clickOnSetOfDataInWebTable(String xpathforrows, List<Integer> rowindexlist, int columnindex) {
		String xpath = OR.getProperty(xpathforrows);
		// List<WebElement> rows=fn_getWebelements(xpath);
		String beforeXpath = xpath + "[";
		String afterXpath = "]/td[" + columnindex + "]/span[2]";
		int totalrecords = rowindexlist.size();
		for (int i = 0; i < totalrecords; i++) {
			int rowindex = rowindexlist.get(i);
			String actualXpath = beforeXpath + rowindex + afterXpath;
			WebElement we = driver.findElement(By.xpath(actualXpath));
			Actions act = new Actions(driver);
			act.moveToElement(we).perform();
			we.click();
		}
	}

	public static void fn_clickOnSetOfDataInWebTable1(String xpathforrows, List<Integer> rowindexlist,
			int columnindex) {
		String xpath = OR.getProperty(xpathforrows);
		// List<WebElement> rows=fn_getWebelements(xpath);
		String beforeXpath = xpath + "[";
		String afterXpath = "]/td[" + columnindex + "]";
		int totalrecords = rowindexlist.size();
		for (int i = 0; i < totalrecords; i++) {
			int rowindex = rowindexlist.get(i);
			String actualXpath = null;
			if (rowindex == 1) {
				actualXpath = xpath + "/td[" + columnindex + "]/a";
			} else {
				actualXpath = beforeXpath + rowindex + "]/td[" + columnindex + "]/a";
			}
			WebElement we = driver.findElement(By.xpath(actualXpath));
			Actions act = new Actions(driver);
			act.moveToElement(we).perform();
			we.click();
			break;
		}
	}

	public static void fn_clickOnCheckboxInWebTable(String xpathforrows, int rowindex, int columnindex) {
		String xpath = OR.getProperty(xpathforrows);
		String beforeXpath = xpath + "[";
		String afterXpath = "]/td[" + columnindex + "]/mat-checkbox";
		String actualXpath = beforeXpath + rowindex + afterXpath;
		WebElement we = driver.findElement(By.xpath(actualXpath));
		Actions act = new Actions(driver);
		act.moveToElement(we).click().build().perform();
	}

	public static void fn_clickByAction(String ORElement) {
		WebElement we = getWebElement(By.xpath(ORElement));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		act.click().perform();
	}
	public static void fn_clickByAction1(String element) {
		WebElement elem = driver.findElement(By.xpath(element));
		Actions act = new Actions(driver);
		act.moveToElement(elem).click().build().perform();
		
	}
	/*
	 * public static void WaituntilElementClickable(String ORElement) { WebElement
	 * we=getWebElement(ORElement);
	 * wait.until(ExpectedConditions.elementToBeClickable(we));
	 * 
	 * }
	 */

	public static void fn_selectElementfromDropDown(String xpath, String value) {
		Select dropdown = new Select(driver.findElement(By.xpath(xpath)));
		// dropdown.selectByValue(value);
		dropdown.selectByVisibleText(value);
	}
	public static void fn_select(String xpath) {
		Select click = new Select(driver.findElement(By.xpath(xpath)));
	}

	public static boolean fn_isCheckboxSelected(WebElement element) {
		if (element.getAttribute("class").contains("mat-checkbox-checked")) {
			log.info("The Checkbox seems to be clicked for " + element.getText());
			return Boolean.TRUE;
		} else {
			log.info("Checkbox is not clicked");
			return Boolean.FALSE;
		}
	}

//	public static void fn_datepicker(String date, String datepicker_orname, String selectyeardropdown_orname,
//			String selectyear_orname, String selectmonth_orname, String selectday_orname) {
//		String[] dt = date.split("-");
//		String day = dt[0];
//		String month = dt[1].toUpperCase();
//		String year = dt[2];
//		UtilityClass.fn_Click("customer_creditpage2_contractsigndate");
//		UtilityClass.fn_Click("customer_creditpage2_contractsigndate_selectyeardropdown");
//		List<WebElement> yearList = UtilityClass.fn_getWebelements("customer_creditpage2_contractsigndate_selectyear");
//		int listsize = yearList.size();
//		for (int i = 0; i < listsize; i++) {
//			String s = yearList.get(i).getText();
//			if (s.equals(year)) {
//				Actions ac = new Actions(UtilityClass.driver);
//				ac.moveToElement(yearList.get(i)).click().build().perform();
//				break;
//			}
//		}
//		List<WebElement> monthList = UtilityClass
//				.fn_getWebelements("customer_creditpage2_contractsigndate_selectmonth");
//		int n = monthList.size();
//		for (int i = 0; i < n; i++) {
//			String s = monthList.get(i).getText();
//			if (s.equals(month)) {
//				Actions ac = new Actions(UtilityClass.driver);
//				ac.moveToElement(monthList.get(i)).click().build().perform();
//				break;
//			}
//		}
//		List<WebElement> dayList = UtilityClass.fn_getWebelements("customer_creditpage2_contractsigndate_selectdate");
//		int d = dayList.size();
//		for (int i = 0; i < d; i++) {
//			String s = dayList.get(i).getText();
//			if (s.equals(day)) {
//				Actions ac = new Actions(UtilityClass.driver);
//				ac.moveToElement(dayList.get(i)).click().build().perform();
//				break;
//			}
//		}
//	}
	public static void fn_datepicker(String date, String clickOnCalenderButton, String clickOnyear,
			String yearWebElements, String MonthWebElements, String dayListWebElements) {
		String[] dt = date.split("-");
		String day = dt[0];
		String month = dt[1].toUpperCase();
		String year = dt[2];
		UtilityClass.fn_Click(clickOnCalenderButton);
		UtilityClass.fn_Click(clickOnyear);
		List<WebElement> yearList = UtilityClass.fn_getWebelements(yearWebElements);
		int listsize = yearList.size();
		for (int i = 0; i < listsize; i++) {
			String s = yearList.get(i).getText().trim();
			if (s.equals(year)) {
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(yearList.get(i)).click().build().perform();
				break;
			}
		}
		List<WebElement> monthList = UtilityClass
				.fn_getWebelements(MonthWebElements);
		int n = monthList.size();
		for (int i = 0; i < n; i++) {
			String s = monthList.get(i).getText().trim();
			if (s.equals(month)) {
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(monthList.get(i)).click().build().perform();
				break;
			}
		}
		List<WebElement> dayList = UtilityClass.fn_getWebelements(dayListWebElements);
		int d = dayList.size();
		for (int i = 0; i < d; i++) {
			String s = dayList.get(i).getText().trim();
			if (s.equals(day)) {
				Actions ac = new Actions(UtilityClass.driver);
				ac.moveToElement(dayList.get(i)).click().build().perform();
				break;
			}
		}
	}

//	public static Object readXlData(int rowValue,int cellValue) throws Exception {
//		String xlsxFilepath = conf.getProperty("Testdata_file_path");
//		FileInputStream inputStream = new FileInputStream(xlsxFilepath);
//		HSSFWorkbook wb=new HSSFWorkbook(inputStream);
//		 HSSFSheet sheet=wb.getSheetAt(1);
//		 int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
//		 for(int i=0;i<=rowCount;i++){
//			 
//			 if (i==rowValue) {
//				  //get cell count in a row
//	            int cellcount = sheet.getRow(i).getLastCellNum();
//	            
//	            
//	            for(int j=1;j<cellcount;j++){
//	            	if (j==cellValue) {
//	            		String cellData =   sheet.getRow(i).getCell(j).getStringCellValue();
//	            	}
//						break;
//					
//	            }
//	           
//	            }
//	           
//	        }
//			 return cellData;
//		 }
//	
//	
//	((JavascriptExecutor) driver).executeScript("scroll(0,300)");
//
//	       Actions ac = new Actions(driver);
//
//	WebElement live= driver.findElement(By. cssSelector("div.product-cards-wrapper--click a[title='Live']"));     
//	ac.moveToElement(live).build().perform();
//	
//	
//	driver.get("https://www.browserstack.com/");
//	Actions action = new Actions(driver); 
//	element = driver.findElement(By.linkText("Get started free"));
//
//	action.moveToElement(element).click();
	
	
	public static void clearValue(String Xpath) {
		getWebElement(By.xpath(Xpath)).clear();
	}
	
	public static void waitForElement(String elem) {
	     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elem)));
    }
}