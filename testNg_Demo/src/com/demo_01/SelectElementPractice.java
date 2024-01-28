package com.demo_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class SelectElementPractice {
	ChromeDriver driver=new ChromeDriver();
  @Test
  public void f() throws InterruptedException {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  System.out.println(driver.findElement(By.tagName("h1")).getText());
	  
	  WebElement dropdownElement=driver.findElement(By.id("dropdown-class-example"));
	  Select select=new Select(dropdownElement);
	  select.selectByIndex(1);
	  
	  WebElement mouseover=driver.findElement(By.id("mousehover"));
	  Actions actions=new Actions(driver);
	  actions.moveToElement(mouseover).build().perform();
	  System.out.println(mouseover.getText());
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
