package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	public WebDriver browser;
  @Test
  public void Test() {
	  browser.get("https://www.google.com");
	String val=  browser.getCurrentUrl();
	browser.quit();
	System.out.println(val);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  browser= new FirefoxDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

}
