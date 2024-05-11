package com.demo_02;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class SelectAndMouseOverAndDragAndDrop {
  ChromeDriver driver=new ChromeDriver();
  @Test
  public void selectFromDropDown() {
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  WebElement selectDropDownElement= driver.findElement(By.id("dropdown-class-example"));
	  Select select=new Select(selectDropDownElement);
	  select.selectByIndex(2);
  }
  @Test
  public void mouseOver() throws InterruptedException, IOException {
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10000));
	  driver.get("https://econsultancy.com/10-useful-examples-of-mouseover-effects-for-ecommerce-sites/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler"))).click();
	  WebElement elementToMouseOver= driver.findElement(By.xpath("//ul[@class=\"nav__main\"]/li/ul/li[2]"));
	  Actions actions=new Actions(driver);
	  actions.moveToElement(elementToMouseOver).build().perform();
	  Thread.sleep(5000);
	  TakesScreenshot tScreenshot=driver;
	  File srcFile=tScreenshot.getScreenshotAs(OutputType.FILE);
	  File trgFile=new File("C:\\\\Users\\\\HP\\\\Downloads");
	  FileUtils.copyFileToDirectory(srcFile, trgFile);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterClass
  public void afterClass() {
	  if(driver!=null) {
		  driver.quit();
	  }
  }

}
