package seleniumBeginer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebdriverLearning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://katalon.com/web-testing";	
		driver.get(url);
		Thread.sleep(6000);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"katalon_header\"]/section[2]/div/div[1]/div/div[1]/div[1]"));

		//Creating object of an Actions class
		Actions action = new Actions(driver);                                                                         
		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id=\"katalon_header\"]/section[1]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/a/div")).click();
		driver.findElement(By.xpath("//*[@id=\"signup_email\"]")).sendKeys("hotshortcut@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"signup_fullname\"]")).sendKeys("SUNDARAM");
		driver.findElement(By.xpath("//*[@id=\"signup_password\"]")).sendKeys("Test.1234");
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[3]/div/form/input")).click();
//		driver.quit();
	}

}
