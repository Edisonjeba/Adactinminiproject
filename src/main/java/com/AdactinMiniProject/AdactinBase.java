package com.AdactinMiniProject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AdactinBase {
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName) throws Exception {

		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\edison\\eclipse-workspace\\AutomationPracticeminiproject1\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "//src//test//resource//Drivers3//geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "//src//test//resource//Drivers//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				throw new Exception("Invalid browser name");
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
			// TODO Auto-generated c
			e.printStackTrace();
			throw new Exception("Issue is browser launch");
		}

	}
	public static void getUrl(String url) throws Exception {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("URL Is not valid");
		}
	}
		public static void enterText(WebElement element, String name) {
		element.sendKeys(name);
	}

		public static void clickBox(WebElement element ) {
	element.click();
	}
		public static void moveTOtheElement(WebElement element) throws Exception {
			try {
				waitForElementVisiblity(element);
				Actions ac = new Actions(driver);
				ac.moveToElement(element).build().perform();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception();

			}

		}
		public static void waitForElementVisiblity(WebElement element) {
			// TODO Auto-generated method stub
			
		}
		
		public static void scrollToElement(WebElement element) throws Exception {
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", element);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception();
			}
		}
		
		public static void scrollUsingCoordinates(int width, int height) throws Exception {
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(" + width + "," + height + ")");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception();
			}
		}
		
		public static void frameurl(WebElement Element) {
			driver.switchTo().frame(Element);
		}
		
		public static void selectOptionInDD(WebElement element, String options, String values) throws Exception {
			waitForElementVisiblity(element);
			Select sc = new Select(element);
			if (options.equalsIgnoreCase("index")) {
				sc.selectByIndex(Integer.parseInt(values));
			} else if (options.equalsIgnoreCase("value")) {
				sc.selectByValue(values);
			} else if (options.equalsIgnoreCase("visibletext")) {
				sc.selectByVisibleText(values);
			} else {
				throw new Exception("Not a valid options");

			}

		}
		
		 public static void DropDown(WebElement element, String index) {
         	
         	Select sc = new Select(element);
         	sc.selectByValue(index);

			}
		
		public static void takeScreenShot(String filename) throws IOException {

			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File temp = ts.getScreenshotAs(OutputType.FILE);
				File des = new File(System.getProperty("user.dir") + "C:\\Users\\edison\\eclipse-workspace\\" + filename + ".png");
				FileUtils.copyFile(temp, des);
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
	
		}
	



