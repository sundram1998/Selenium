package com.demo_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class GetWindowHandlePractice {
	ChromeDriver driver = new ChromeDriver();

	@Test
	public void getWindowHandlePractice() {
	}

	@BeforeClass
	public void beforeClass() {
		driver.get("https://the-internet.herokuapp.com/windows");

		Set<String> windowHandlerSet = driver.getWindowHandles();
		Iterator<String> it = windowHandlerSet.iterator();
		String parentWindow = it.next();
		System.out.println(parentWindow);
		driver.findElement(By.xpath("//div[@class=\"example\"]/a")).click();
		String childWindowString = it.next();
		driver.switchTo().window(childWindowString);
		System.out.println(driver.getTitle());

	}

	@AfterClass
	public void afterClass() {
	}

}
