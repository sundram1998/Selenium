package locatorPractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class CssLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://guide.blazemeter.com/hc/en-us");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		SoftAssert softAssert=new SoftAssert();
		
		Assert.assertEquals(driver.getTitle(), "BlazeMeter");
		
		System.out.println(driver.getTitle());
		
//		WebElement headerElement= driver.findElement(By.cssSelector("header.article-header.clearfix>h1"));
//		softAssert.assertEquals(headerElement.getText(), " Welcome to BlazeMeter Docs");
		softAssert.assertAll();
		
		driver.quit();

	}

}
