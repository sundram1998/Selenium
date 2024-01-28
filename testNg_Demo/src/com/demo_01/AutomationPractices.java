package com.demo_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AutomationPractices {
	WebDriver driver = new ChromeDriver();
	@BeforeMethod
	public void testMethod() {
		System.setProperty("webdriver.chromedriver", "/Users/rahulshetty/Documents/chromedriver");
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	
	@Test
	public void test() throws InterruptedException {

		SoftAssert softAssert=new SoftAssert();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("Title of page is: "+driver.getTitle());
//		Assert.assertEquals(driver.getTitle(), "A","Title does not match");
		softAssert.assertEquals(driver.getTitle(), "Automation Exercise","Title does not match");
		
		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/div[@class='logo pull-left']/a/img")));

//		String h2Text = "Full-Fledged practice website for Automation Engineers";//
//		WebElement h2Text= driver.findElement(By.xpath("//div[@class='col-sm-6']/h2"));
		WebElement h2Text=new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-sm-6']/h2")));
		softAssert.assertEquals("Full-Fledged practice website for Automation Engineers", h2Text.getText());
		if(h2Text.isDisplayed()) {
			System.out.println(h2Text.getText());
		}else {
			System.out.println("Element is not present");
		}
		
//		if (driver.getPageSource().contains(h2Text)) {
//			System.out.println(h2Text);
//		} else {
//			System.out.println("Text is not present");
//		}

		driver.findElement(By.xpath("//div/ul/li[4]/a")).click();

		// To check text present
		if (driver.getPageSource().contains("New User Signup!")) {
			System.out.println("New User Signup! Text is present");
		} else {
			System.out.println("New User Signup! Text is absent");
		}
		
		driver.findElement(By.name("name")).sendKeys("Sundaram Yadav");
		driver.findElement(By.xpath("//form[@action='/signup']/input[@type='email']")).sendKeys("abcdqawedfxxxx@gmail.com");
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='login-form']/h2")));
		System.out.println("Waited successfully!");
		WebElement accountInfo=driver.findElement(By.xpath("//div[@class='login-form']/h2"));
		boolean isDisplayed=accountInfo.isDisplayed();
		System.out.println(accountInfo.getText());
		System.out.println("Is accountInfo displayed: "+isDisplayed);
		Thread.sleep(5);
	
		softAssert.assertAll();
	}
	
	@AfterMethod
	public void afterMethod() {
		if(driver!=null) {
			driver.quit();
		}
		
	}

}
