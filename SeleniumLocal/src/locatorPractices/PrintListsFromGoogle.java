package locatorPractices;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class PrintListsFromGoogle {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String chromedriver = "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chromedriver", chromedriver);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		Thread.sleep(4000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(2 + 2, 4, "Sum is incorrect");
		softAssert.assertTrue("Hello".contains("H"), "'Hello' contains 'H'");
		softAssert.assertFalse(5 > 10, "5 is not greater than 10");

		// The test continues even if one or more assertions fail

		// AssertAll will mark the test as failed if any soft assertions have failed
		softAssert.assertAll();
		System.out.println(driver.findElement(By.cssSelector("textarea[class=\"gLFyf\"]")).isDisplayed());
		driver.findElement(By.cssSelector("textarea[class=\"gLFyf\"]")).sendKeys("Selenium");

		List<WebElement> listItemElements = driver.findElements(By.cssSelector("ul[role='listbox']>li"));
		Thread.sleep(4000);
		for (WebElement i : listItemElements) {
			if (i.getText().equalsIgnoreCase("selenium download")) {
				System.out.println(i.getText());
				i.click();
				break;
			}
//			System.out.println(i.getText());
		}

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='heading']/span"))).getText());
		
		System.out.println("success");
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
//				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		driver.close();
	}

}
