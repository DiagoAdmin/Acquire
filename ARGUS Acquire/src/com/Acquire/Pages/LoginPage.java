/**
 * 
 */
package com.Acquire.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author argusqa
 *
 * This class will store all the locators and methods of a login page 
 */
public class LoginPage {
	
WebDriver driver;	
By username   = By.xpath("//*[@id=\"username\"]");
By password   = By.xpath("//*[@id=\"password\"]");
By LoginBtn   = By.xpath("//*[@id=\"Login\"]");
By LogoutBtn  = By.xpath("//*[@id=\"cdk-overlay-1\"]/div/div/button[2]");
By AccountBtn = By.xpath("/html/body/app-root/app-mast-header/header/a[4]/i");

public LoginPage(WebDriver driver)
{
	this.driver=driver;
}

public void typeUserName() throws InterruptedException
{
	Wait.wait(driver);
	driver.findElement(username).sendKeys("santosh+user2on097@argusexpresstest.com");
	
}

public void typePassword() throws InterruptedException
{
driver.findElement(password).sendKeys("Acquire123$");	
}
public void clickLoginButton() throws InterruptedException
{	driver.findElement(LoginBtn).click();
}
public void clickLogoutButton() throws InterruptedException
{
	driver.findElement(AccountBtn).click();
	Wait.wait(driver);
	Wait.wait(driver);
	driver.findElement(LogoutBtn).click();
}

}
