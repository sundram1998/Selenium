package com.demo_02;

import org.testng.annotations.Test;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import com.google.common.base.Function;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class FluentWaitExample {
	ChromeDriver driver=new ChromeDriver();
  @Test
  public void fluentWait() throws InterruptedException {
	  driver.manage().window().maximize();
	// Waiting 30 seconds for an element to be present on the page, checking
	   // for its presence once every 5 seconds.
	   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	       .withTimeout(Duration.ofSeconds(30L))
	       .pollingEvery(Duration.ofSeconds(5L))
	       .ignoring(NoSuchElementException.class);
	 
	  driver.get("https://econsultancy.com/10-useful-examples-of-mouseover-effects-for-ecommerce-sites/");
	  WebElement waitForPopUp = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("onetrust-accept-btn-handler"));
		     }
		   });
	  driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	  WebElement elementToMouseOver= driver.findElement(By.xpath("//ul[@class=\"nav__main\"]/li/ul/li[2]"));
	  Actions actions=new Actions(driver);
	  actions.moveToElement(elementToMouseOver).build().perform();
	  Thread.sleep(5000);
	  
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
