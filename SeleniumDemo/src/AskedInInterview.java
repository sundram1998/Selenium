import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AskedInInterview {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String chromedriver = "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", chromedriver);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> listBoxElements = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for (WebElement listBox : listBoxElements) {
			System.out.println(listBox.getText());
			if (listBox.getText().equalsIgnoreCase("selenium webdriver")) {
				listBox.click();
				break;
			}
		}
		System.out.println("Hello world");
		
//		driver.findElement(By.xpath("//ul[@role='listbox']/li[2]")).click();
		Thread.sleep(2000);

		
		driver.close();
		
	}

}
