import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("automation testing website rahul");
		List<WebElement> suggestionsElement=driver.findElements(By.xpath("\"//ul[@class=\\\"G43f7e\\\"]/li[10]\""));
		for(WebElement i:suggestionsElement) {
			if(i.getText().contains("rahulshettyacademy.com/AutomationPractice/")) {
				i.click();
				break;
			}
		}
		driver.findElement(By.linkText("Practice Page")).click();
		driver.getTitle().endsWith("Practice Page");
		Thread.sleep(4000);
		driver.quit();
		
		

	}

}
