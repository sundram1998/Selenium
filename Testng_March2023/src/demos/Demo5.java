package demos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

// Parameter and optional
public class Demo5 {
	WebDriver driver;

	@BeforeSuite
	@Parameters({ "browser", "url" })
	public void beforeSuite(@Optional("Firefox") String browser, @Optional String url) {
		System.out.println("Inside beforeSuit Demo5");
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			break;
		case "FireFox":
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\HP\\\\Downloads\\\\ChromeDriver\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			break;
		}
	}

	@Test
	public void testMouseHover() {
		// Mouse Hovering
		Actions action = new Actions(driver);
		WebElement news = driver.findElement(
				By.xpath("/html/body/div[1]/header/div/div/ameriprise-menu//div/div[1]/div/nav[1]/ul/li[6]/div/a"));
		action.moveToElement(news).perform();
		System.out.println("Demo5 inside Test ");
	}

}
