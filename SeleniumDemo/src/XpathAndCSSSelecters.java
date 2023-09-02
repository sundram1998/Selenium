import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class XpathAndCSSSelecters {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String chromedriver = "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", chromedriver);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

		// Locator by tagname and attribute="value" ,//tageName[@attribute="value"]
		String forgetPassString = driver.findElement(By.xpath("//div[@class=\"forgot-pwd-container\"]")).getText();
		System.out.println(forgetPassString);

		String forgetPassString1 = driver.findElement(By.xpath("//div/a")).getText();
		System.out.println(forgetPassString1);

		WebElement forgetPassword = driver.findElement(By.xpath("//div/a"));
		forgetPassword.click();

//		String ActualTitle = driver.getTitle();
//		String ExpectedTitle = "Rahul Shetty Academy - Login page";
//
//		Assert.assertEquals(ActualTitle, ExpectedTitle);

		Thread.sleep(3000);
		driver.close();

	}

}
