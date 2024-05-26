package codingChallenge;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Demo01 {
	public static void main(String[] args) throws InterruptedException {
		String chromedriver = "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chromedriver", chromedriver);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.codewars.com/");
		String expectedTitle = "Codewars - Achieve mastery through coding practice and developer mentorship";

		driver.getTitle().contains(expectedTitle);
		System.out.println(driver.getTitle());

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='button-group is-center']/a")));
		driver.findElement(By.xpath("//div[@class='button-group is-center']/a")).click();

		WebElement linkGitGubAccountButton = driver.findElement(By.xpath("//div[@data-controller='auth']/button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='p-6 mb-2']/img")));
		System.out.println(linkGitGubAccountButton.getText());

		driver.findElement(By.cssSelector("input[placeholder='* Email']")).sendKeys("solvery1998@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='* Username']")).sendKeys("Sundram Yadav");
		driver.findElement(By.cssSelector("input[placeholder='* Password']")).sendKeys("Test1998");
		driver.findElement(By.cssSelector("input[placeholder='* Password Confirmation']")).sendKeys("Test");
		driver.findElement(By.cssSelector("button#enlist_btn")).click();

		WebElement errorElement = driver.findElement(By.cssSelector("div[class='field_value']>small"));
		String expectedString = "doesn't match Password1";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedString, errorElement.getText());
		System.out.println("This code will be executed even if the assertion fails.");
		
//		TakesScreenshot tScreenshot=(TakesScreenshot)driver;
//		File srcFile=tScreenshot.getScreenshotAs(OutputType.FILE);
//		File target=new File("C:\\Users\\HP\\Downloads");
//		FileU
		Thread.sleep(3000);
		driver.close();
		softAssert.assertAll();
	}

}
