import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

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
		System.out.println("Selecting through xpath: " + forgetPassString);

		String forgetPassString1 = driver.findElement(By.xpath("//div/a")).getText();
		System.out.println("Selecting through xpath: " + forgetPassString1);

		WebElement forgetPassword = driver.findElement(By.xpath("//div/a"));
		forgetPassword.click();

		// For cssSelector we use-> tagName.classname or tagname#id
		System.out.println("Selecting through cssSelector: "
				+ driver.findElement(By.cssSelector("div.forgot-pwd-container")).getText());

		// Using cssSelector tagname[placehoder='value']
		WebElement emailElement = driver.findElement(By.cssSelector("input[placeholder='Email']"));
		emailElement.sendKeys("sundram.yadav@infosys.com");

		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Rahul Shetty Academy - Login page");
		System.out.println(verifyTitle);
		assertTrue(verifyTitle); // Hard Assertion
		String ActualTitle = driver.getTitle();
//		String ExpectedTitle = "Rahul Shetty Academy - Login page";
//
//		Assert.assertEquals(ActualTitle, ExpectedTitle);
//		softAssert.assertEquals(ActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Thread.sleep(3000);
		driver.quit();

	}

}
