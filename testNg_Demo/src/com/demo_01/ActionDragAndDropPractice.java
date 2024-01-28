package com.demo_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class ActionDragAndDropPractice {
	ChromeDriver driver = new ChromeDriver();

	@Test
	public void alertPractice() throws InterruptedException {
		driver.get("https://developer.mozilla.org/en-US/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement logoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.logo")));
		System.out.println(logoElement.getText());
		// Mouse Hover
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//ul/li[@class=\"top-level-entry-container \"][1]"))).build()
				.perform();
		driver.findElement(By.xpath(
				"//li[@class=\"html-link-container \"]/a/div[@class=\"submenu-content-container\"]/div[@class=\"submenu-item-heading\"]"))
				.click();

		WebElement headingHTML = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("header>h1")));
		System.out.println(headingHTML.getText());
		driver.navigate().back();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section>h1")));
	}

	@Test
	public void dragAndDrop() {
		driver.get("https://jqueryui.com/droppable/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement draggableHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/h1")));
		System.out.println(draggableHeading.getText());

		driver.switchTo().frame(0);
//		WebElement droppableElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("droppable")));
		Actions actions = new Actions(driver);
		actions.clickAndHold(driver.findElement(By.id("draggable")))
				.moveToElement(driver.findElement(By.xpath("//div[@id=\"droppable\"]"))).release().build().perform();

	}

	@Test
	public void implicitWait() {
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Protien");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}
	
	@BeforeClass
	public void beforeClass() {
		driver.manage().window().maximize();
//		
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
