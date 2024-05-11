package com.demo_02;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.params.provider.Arguments;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AllPractices {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Scroll To Element
		WebElement mouseoverElement = driver.findElement(By.id("mousehover"));
		JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver);
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", mouseoverElement);
		
		// Mouse Hover
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseoverElement).build().perform();

		Thread.sleep(4000);
		
		// Handle Alert
		WebElement alertElement= driver.findElement(By.id("alertbtn"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true)", alertElement);
		alertElement.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		// Take ScreenShot
		TakesScreenshot tScreenshot=(TakesScreenshot)driver;
		File srcFile=tScreenshot.getScreenshotAs(OutputType.FILE);
		File targetFile=new File("C:\\Users\\HP\\Pictures\\Screenshots");
		FileUtils.copyFileToDirectory(srcFile, targetFile);
		
		// Select an element
		WebElement selectBoxElement=driver.findElement(By.id("dropdown-class-example"));
		Select select =new Select(selectBoxElement);
		select.selectByIndex(1);
		
		Thread.sleep(4000); 

		driver.quit();

	}

}
