package test;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


import pages.GoogleSearchPageFirst;
public class FirstPageTest {
	public static WebDriver driver = null;
	
	
  @Test
  public void googleSearchTest() {
	  
	  driver.get("http://www.google.com");
	  GoogleSearchPageFirst.textbox_searchname(driver).sendKeys("Selenium");
	  //GoogleSearchPageFirst.textbox_submitbutton(driver);
	  
	  GoogleSearchPageFirst.button_searchname(driver).sendKeys(Keys.RETURN);
	
	  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
