import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\ChromeDriver\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("selenium");
		List<WebElement> listBoxElements = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for(WebElement listBox:listBoxElements) {
			System.out.println(listBox.getText());
		}
		driver.quit();
		Thread.sleep(10000); 
		driver.quit();
		System.out.println(driver.findElement(By.xpath("//img[@class='lnXdpd']")).getText());
	}

}
