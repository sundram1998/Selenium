package com.demo_01;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;

public class FluentWaitPractice {
	ChromeDriver driver = new ChromeDriver();
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void f() {
		String expectedTitle = "Codewars - Achieve mastery through coding practice and developer mentorship";
		softAssert.assertEquals(driver.getTitle(), expectedTitle,"Element not matching");
		System.out.println("This line will execute anyway");
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement fluentwaitforElement = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				
				WebElement element= driver.findElement(By.xpath("//div[@class='button-group is-center']/a"));
				if(element.isEnabled()) {
					System.out.println("Element Fount");
				}
				return element;
			}
		});
		softAssert.assertEquals(fluentwaitforElement.getText(), "Get Started","Element is not matching in line 38");
		System.out.println(fluentwaitforElement.getText());
		fluentwaitforElement.click();
		
		WebElement imgElement = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				
				WebElement element= driver.findElement(By.xpath("//div[@class='p-6 mb-2']/img"));
				if(element.isEnabled()) {
					System.out.println("Image Element Fount");
				}
				return element;
			}
		});
		if (imgElement.isDisplayed()) {
			System.out.println("Image element displayed!");
		}else {
			System.out.println("Image element not displayed!");
		}
	
		softAssert.assertAll();

	}

	@BeforeMethod
	public void beforeMethod() {
		driver.manage().window().maximize();
		driver.get("https://www.codewars.com/");	
		
	}

	@AfterMethod
	public void afterMethod() {
		if (driver != null) {
			driver.quit();
		}
	}

}
