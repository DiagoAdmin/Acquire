/**
 * 
 */
package com.Acquire.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author argusqa
 *
 */
public class PipelineView {
	WebDriver driver;
	By opendeal=By.xpath("/html/body/app-root/app-deals/div/app-deals-by-state/div/app-renderer/app-deal-row[1]/div/div[1]/div[1]/div[2]");
public void openDeal() throws InterruptedException
{
	Wait.wait(driver);
	driver.findElement(opendeal).click();
	Wait.wait(driver);
	
}
}
