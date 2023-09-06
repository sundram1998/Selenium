package locatorPractices;

import java.awt.Window;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CSSSelectors {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10000));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		
		Thread.sleep(3000);
		
		List<WebElement> labelList=driver.findElements(By.xpath("//div[@id='checkbox-example']/fieldset/label"));
		for(WebElement label:labelList) {
			System.out.println(label.getText());
		}
		       
		Thread.sleep(3000);
		
		driver.quit();
	}

}
