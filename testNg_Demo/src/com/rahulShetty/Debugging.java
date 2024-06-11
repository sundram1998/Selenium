package com.rahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debugging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("///input[@placeholder=\"Mobile number or email address\"]")).sendKeys("First Name");
		

	}

}
