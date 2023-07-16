package com.lti.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.lti.base.TestBase;

public class LoginTest extends TestBase {
	
	@Test
	public void bankManagerLogin() throws InterruptedException
	{
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		WebElement bnkmgrbtn=driver.findElement(By.xpath(OR.getProperty("bankManagerLoginbtn")));
		Assert.assertTrue(bnkmgrbtn.isEnabled());
		driver.findElement(By.xpath(OR.getProperty("bankManagerLoginbtn"))).click();
		log.debug("Clicked on bank manger login button");
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Amir\\eclipse-workspace\\SafwanDataDriven\\src\\test\\resources\\screenshot\\error.jpg\">Screenshot</a> ");
//		String appURL=driver.getCurrentUrl();
//		String url="https://www.way2automation.com/angularjs-protractor/banking/#/manager";
//		Assert.assertEquals(appURL, url);
//		String titleURL="Protractor practice website - Banking App";
//		String title=driver.getTitle();
//		Assert.assertEquals(title, titleURL);
	}


}
