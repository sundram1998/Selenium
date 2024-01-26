package locatorPractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class AutomationPractices {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chromedriver", "/Users/rahulshetty/Documents/chromedriver");
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");

		SoftAssert softAssert=new SoftAssert();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Title of page is: "+driver.getTitle());
		softAssert.assertEquals(driver.getTitle(), "Automation Exercise1");
		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/div[@class='logo pull-left']/a/img")));

//		String h2Text = "Full-Fledged practice website for Automation Engineers";//
		WebElement h2Text= driver.findElement(By.xpath("//div[@class='col-sm-6']/h2"));
		if(h2Text.isDisplayed()) {
			System.out.println(h2Text.getText());
		}else {
			System.out.println("Element is not present");
		}
			
//		if (driver.getPageSource().contains(h2Text)) {
//			System.out.println(h2Text);
//		} else {
//			System.out.println("Text is not present");
//		}

		driver.findElement(By.xpath("//div/ul/li[4]/a")).click();

		// To check text present
		if (driver.getPageSource().contains("New User Signup!")) {
			System.out.println("New User Signup! Text is present");
		} else {
			System.out.println("New User Signup! Text is absent");
		}
		
		driver.findElement(By.name("name")).sendKeys("Sundaram Yadav");
		driver.findElement(By.xpath("//form[@action='/signup']/input[@type='email']")).sendKeys("abcdqawedfxxxx@gmail.com");
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='login-form']/h2")));
		System.out.println("Waited successfully!");
		WebElement accountInfo=driver.findElement(By.xpath("//div[@class='login-form']/h2"));
		boolean isDisplayed=accountInfo.isDisplayed();
		System.out.println(accountInfo.getText());
		System.out.println("Is accountInfo displayed: "+isDisplayed);
		Thread.sleep(5);
		driver.quit();
		softAssert.assertAll();
	}

}
