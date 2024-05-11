package com.demo_02;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		TakesScreenshot tScreenshot=driver;
		File srcFile= tScreenshot.getScreenshotAs(OutputType.FILE);
		File trgFile=new File("C:\\Users\\HP\\Downloads");
		FileUtils.copyFileToDirectory(srcFile, trgFile);
		System.out.println("SS taken successfully");
		
		Thread.sleep(5000);
		driver.quit();

	}

}
