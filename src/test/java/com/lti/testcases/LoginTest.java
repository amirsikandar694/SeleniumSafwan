package com.lti.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.lti.base.TestBase;

public class LoginTest extends TestBase {
	
	@Test
	public void bankManagerLogin() throws InterruptedException
	{
		driver.findElement(By.xpath(OR.getProperty("bankManagerLoginbtn"))).click();
		log.debug("Clicked on bank manger login button");
	}

}
