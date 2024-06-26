import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class XpathAndCSSSelecters {

	@Test
	public void setUp() throws InterruptedException {
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
		emailElement.sendKeys("Test@gmail.com");
 
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Rahul Shetty Academy - Login page");
		System.out.println(verifyTitle);
		assertTrue(verifyTitle); // Hard Assertion
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		String expectedTitle = "Rahul Shetty Academy - Login page";

//		Assert.assertEquals(actualTitle, expectedTitle);

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualTitle, "Rahul Shetty Academy - Login page","This is not matching");
		softAssert.assertNotEquals(actualTitle, expectedTitle);
		softAssert.assertNull(actualTitle);
		softAssert.assertNotNull(actualTitle);
		softAssert.assertTrue("Rahul Shetty Academy - Login page".equals("Rahul Shetty Academy - Login page"),
				"First soft assert failed");
		softAssert.assertAll();

		Select select=new Select(driver.findElement(By.cssSelector(expectedTitle)))	;
//		driver.findElement(By.)
		System.out.println("Hello");
		Thread.sleep(5000);
		driver.quit();

	}

}
