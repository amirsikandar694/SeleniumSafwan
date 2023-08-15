package com.lti.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.lti.base.TestBase;

public class LoginTest extends TestBase {

	@Test
	public void bankManagerLogin() throws InterruptedException {
		
		WebElement bnkmgrbtn = driver.findElement(By.xpath(OR.getProperty("bankManagerLoginbtn")));
		Assert.assertTrue(bnkmgrbtn.isEnabled());
		driver.findElement(By.xpath(OR.getProperty("bankManagerLoginbtn"))).click();
		log.debug("Clicked on bank manger login button");
		
	}

	//@Test
	public void bankManagerLogin1() throws InterruptedException {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		WebElement bnkmgrbtn = driver.findElement(By.xpath(OR.getProperty("bankManagerLoginbtn")));
		Assert.assertTrue(bnkmgrbtn.isEnabled());
		driver.findElement(By.xpath(OR.getProperty("bankManagerLoginbtn"))).click();
		}

}
