package com.Acquire.TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import com.Acquire.Pages.LoginPage;
import com.Acquire.Pages.PipelineView;
import com.Acquire.Pages.Wait;



/**
 * @author argusqa
 * This class verifies the logged in user is valid or not
 */

public class VerifyAcquireLogin {
@Test
public void VerifyValidLogin() throws InterruptedException
{
	WebDriver driver=new SafariDriver();
	//DesiredCapabilities capabilites = DesiredCapabilities.chrome();
	//capabilites.setBrowserName("chrome");
	//System.setProperty("webdriver.chrome.driver", "/Users/argusqa/Downloads/chromedriver.exe"); 
	//WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://acquire.qa.altusplatform.com");
	Wait.wait(driver);
		LoginPage login = new LoginPage(driver);
	
		Wait.wait(driver);
	login.typeUserName();
	Wait.wait(driver);
	login.typePassword();
	Wait.wait(driver);
	login.clickLoginButton();
	Wait.wait(driver);
	//PipelineView pv= new PipelineView();
	Wait.wait(driver);
	//pv.openDeal();
	Wait.wait(driver);
	Wait.wait(driver);
	login.clickLogoutButton();

}	

}