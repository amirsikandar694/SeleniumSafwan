package com.lti.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.lti.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase {

	public static WebDriver driver=null;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static Logger log=Logger.getLogger("devpinoyLogger");
	public ExtentReports rep=ExtentManager.getInstance();
	public static ExtentTest test;

	@BeforeMethod
	public void setup() throws IOException {
		
		if(driver==null) {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fis);
		log.debug("Config file loaded");
		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		log.info("Object repo file loaded");
		System.out.println(config.getProperty("browser"));
		if (config.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			log.info("Chrome browser launched");
		} else if (config.getProperty("browser").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			log.info("firefox browser launched");
		} else {
			driver = new InternetExplorerDriver();
			log.info("IE browser launched");
		}
		
		driver.get(config.getProperty("testurl"));
		log.info("URL opened successfully...!!!");
		Reporter.log("URL opened successfully...!!!");
		driver.manage().window().maximize();
		}
		
	}

	@AfterMethod
	public void teardown() {
		if(driver!=null)
		{
		driver.quit();
		driver=null;
		log.debug("browser closed");
		}
	}
}
