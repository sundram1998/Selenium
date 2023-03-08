package seleniumBeginer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ameriprice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ameriprise.com/");

		// Mouse Hovering
		Actions action = new Actions(driver);
		WebElement news=driver.findElement(By.xpath("/html/body/div[1]/header/div/div/ameriprise-menu//div/div[1]/div/nav[1]/ul/li[6]/div/a"));
		action.moveToElement(news).perform();
		
		// Login user 
	}

}
