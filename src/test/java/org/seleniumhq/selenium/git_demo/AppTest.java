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
	  System.setProperty("webdriver.chrome.driver", "F:\\Backup\\MyCode\\chromedriver\\chromedriver.exe");
  }
  
}
