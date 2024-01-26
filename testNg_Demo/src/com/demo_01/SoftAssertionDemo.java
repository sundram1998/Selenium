package com.demo_01;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class SoftAssertionDemo {
//	String chromedriver = "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	ChromeDriver driver = new ChromeDriver();
	SoftAssert softAssert = new SoftAssert();
	@BeforeMethod
	public void beforeMethod() {

//		driver.manage().window().maximize();
////		System.setProperty("webdriver.chromedriver", chromedriver);
//		driver.get("https://www.codewars.com/");
	}

	@Test
	public void test1() {
		driver.manage().window().maximize();
		driver.get("https://www.codewars.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String expectedTitle = "Codewars - Achieve mastery through coding practice and developer mentorship";

		driver.getTitle().contains(expectedTitle);
		System.out.println(driver.getTitle());

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='button-group is-center']/a")));
		driver.findElement(By.xpath("//div[@class='button-group is-center']/a")).click();

		WebElement linkGitGubAccountButton = driver.findElement(By.xpath("//div[@data-controller='auth']/button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='p-6 mb-2']/img")));
		System.out.println(linkGitGubAccountButton.getText());

		driver.findElement(By.cssSelector("input[placeholder='* Email']")).sendKeys("solvery1998@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='* Username']")).sendKeys("Sundram Yadav");
		driver.findElement(By.cssSelector("input[placeholder='* Password']")).sendKeys("Test1998");
		driver.findElement(By.cssSelector("input[placeholder='* Password Confirmation']")).sendKeys("Test");
		driver.findElement(By.cssSelector("button#enlist_btn")).click();

//		String[] firldErrors = {,};
		WebElement errorElement = driver.findElement(By.cssSelector("div[class='field_value']>small"));
		String expectedString = "doesn't match Password1";
		
		softAssert.assertEquals(expectedString, errorElement.getText());
		System.out.println("This code will be executed even if the assertion fails.");
		softAssert.assertAll();
	}

	@Test
	public void test2() {
		
		System.out.println("Open Banking Webpage");
		softAssert.assertEquals(true, false);
		System.out.println("Validate the title");
		softAssert.assertEquals(true, false);
		System.out.println("Validate heading of dashboard");
		softAssert.assertEquals(true, false);
		System.out.println("click on a savings account");
		softAssert.assertEquals(true, false);
		softAssert.assertAll();
	}
	

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
