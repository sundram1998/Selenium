package locatorPractices;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://guide.blazemeter.com/hc/en-us");
		
		Thread.sleep(2000);
		
//		driver.findElement(By.linkText("Getting Started")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Getting Started')][1]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.linkText("The Basics")).click();
		driver.findElement(By.xpath("//span[contains(text(),'The Basics')]")).click();
		Thread.sleep(2000);
		
		List<WebElement> lists= driver.findElements(By.xpath("//li[@class='201609089']//ul[@class='subcategory']//li"));
		for(WebElement list:lists) {
			System.out.println(list.getText());
			
		}
		
		driver.quit();

	}

}
