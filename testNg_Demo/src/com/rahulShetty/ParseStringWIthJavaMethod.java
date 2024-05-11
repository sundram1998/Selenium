package com.rahulShetty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParseStringWIthJavaMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("div[class=\"forgot-pwd-container\"]>a")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement resetPasswordElement= driver.findElement(By.cssSelector("button[class=\"reset-pwd-btn\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(resetPasswordElement));
		resetPasswordElement.click();
		
		// Extract the reset password
		String resetPasswordString =driver.findElement(By.cssSelector("p[class=\"infoMsg\"]")).getText();
		System.out.println(resetPasswordString);
		String splitString[]=resetPasswordString.split("'");
		String getPasswordString[]=splitString[1].split("'");
		System.out.println(getPasswordString[0]);
		
		// Go back to sign in
		driver.findElement(By.cssSelector("button[class=\"go-to-login-btn\"]")).click();
		WebElement userNameElement=driver.findElement(By.cssSelector("input[id=\"inputUsername\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(userNameElement));
		userNameElement.sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys(getPasswordString[0]);
		driver.findElement(By.cssSelector("button[class=\"submit signInBtn\"]")).click();
		Thread.sleep(2000);
		WebElement successMessage=driver.findElement(By.xpath("//h1/following-sibling::p"));
		
		System.out.println(successMessage.getText());
		

	}

}
