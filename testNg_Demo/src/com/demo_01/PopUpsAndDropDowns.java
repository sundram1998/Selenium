package com.demo_01;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class PopUpsAndDropDowns {
	
	ChromeDriver driver=new ChromeDriver();
	SoftAssert softAssert=new SoftAssert();
	
  @Test
  public void f() throws InterruptedException {
	  System.out.println(driver.getTitle());
			   
	  driver.findElement(By.name("alert")).click();;
//	  Thread.sleep(3000);
	  Alert alert=driver.switchTo().alert();
	  System.out.println(alert.getText());
	  softAssert.assertEquals(alert.getText(), "I am alert","Failed Assertion:I am alert");
//	  Thread.sleep(3000);
	  alert.accept();
	  driver.findElement(By.name("confirmation")).click();;
//	  Thread.sleep(3000);
	  Alert confAlert=driver.switchTo().alert();
	  System.out.println(confAlert.getText());
	  softAssert.assertEquals(confAlert.getText(), "I am confirm","Failed Assertion:I am confirm");
//	  Thread.sleep(3000);
	  confAlert.accept();
//	  Thread.sleep(3000);
	  driver.findElement(By.name("upload")).sendKeys("C:\\Users\\HP\\Desktop\\SUNDRAM YADAV (dev).pdf");
//	  Thread.sleep(3000);
	  softAssert.assertAll();
  }
  @BeforeTest
  public void beforeMethod() {
	  driver.manage().window().maximize();
	  driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
  }

  @Test
  public void rahulShetty() {
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  }
  @AfterTest
  public void afterMethod() {
//	  softAssert.assertAll();
	  if(driver!=null) {
		  driver.quit();
	  }
  }

}
