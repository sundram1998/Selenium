package locatorPractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class IframePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
//		driver.switchTo().alert().dismiss();
		WebElement addOn=driver.findElement(By.cssSelector("div[class=\"css-1dbjc4n r-1rngwi6 r-o9xkwf\"]>svg[data-testid=\"svg-img\"]:nth-of-type(1)"));
		Thread.sleep(2000);
		//move to an element or mouse over
		Actions action=new Actions(driver);
		action.moveToElement(addOn).build().perform();
		
		System.out.println(driver.getTitle());
		String titleString="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", titleString,"Title is not Matching");
		softAssert.assertAll();
		Thread.sleep(3000);
		driver.close();
	}

}
