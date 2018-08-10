/**
 * 
 */
package com.Acquire.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

/*import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;*/
/**
 * @author argusqa
 *
 */
public class Wait {


	public static void wait(WebDriver driver) throws InterruptedException
	  {
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	//--wait for page to load till 10 seconds
	 	   TimeUnit.SECONDS.sleep(5);	//--wait for 5 seconds till next action to be performed
	 	   
	 	 /* WebDriverWait wait = new WebDriverWait(driver, 15, 100);
		    wait.until(ExpectedConditions.alertIsPresent());*/
	 	 /* @Test
	 	 public void test () throws InterruptedException, IOException 
	 	 {   
	 	  //To wait for element visible
	 	  WebDriverWait wait = new WebDriverWait(driver, 15);
	 	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='text3']")));
	 	  
	 	  driver.findElement(By.xpath("//input[@id='text3']")).sendKeys("Text box is visible now");
	 	  System.out.print("Text box text3 is now visible");
	 	    
	 	 }*/
	  }
}
