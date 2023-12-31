package locatorPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetHerokuApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");

		String headingString = driver.findElement(By.cssSelector("h1.heading")).getText();
		System.out.println(headingString);
		
		driver.findElement(By.cssSelector("ul>li:nth-of-type(1)>a")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());

		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		System.out.println(driver.findElement(By.xpath("//div/p")).getText());
		Thread.sleep(5000);
		driver.quit();
	}

}
