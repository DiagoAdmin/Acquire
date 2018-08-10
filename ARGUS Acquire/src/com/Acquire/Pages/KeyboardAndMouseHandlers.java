/**
 * 
 */
package com.Acquire.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

/**
 * @author argusqa
 *
 */
public class KeyboardAndMouseHandlers {

	WebDriver driver = new SafariDriver();
	
	public void mouseoveronDeal(WebElement openDeal) {
		
	
	Actions builder=new Actions(driver);
	Action moveOnElement = builder.moveToElement(openDeal).build();
	}
}
