package com.demo_02;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AlertsAndPrompts {
	ChromeDriver driver=new ChromeDriver();
  @Test
  public void alertsAndPrompts() throws InterruptedException {
	  // Get the title
	  String titleString=driver.getTitle();
	  titleString.contains("Practice Page");
	  System.out.println(titleString);
	  
	  //Handle the alert
	  driver.findElement(By.id("alertbtn")).click();
	  Thread.sleep(2000);
	  Alert alertWindow=driver.switchTo().alert();
	  alertWindow.accept();
	  // Handle confirm or dismiss
	  driver.findElement(By.id("confirmbtn")).click();
	  Thread.sleep(2000);
	  Alert confirmWindow=driver.switchTo().alert();
	  confirmWindow.accept();
  }
  @BeforeClass
  public void beforeClass() {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
