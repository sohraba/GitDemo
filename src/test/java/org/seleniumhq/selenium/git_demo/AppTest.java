package org.seleniumhq.selenium.git_demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
  protected WebDriver driver;
  @Test
  public void testGoogle() throws InterruptedException{
	  System.out.println("Testing");
	  System.out.println("new code123");
	  System.out.println("Testing");
	  System.setProperty("webdriver.chrome.driver", "F:\\Backup\\MyCode\\chromedriver\\chromedriver.exe");
  }
  
}
