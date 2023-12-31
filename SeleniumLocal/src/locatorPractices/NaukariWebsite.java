package locatorPractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukariWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromedriver = "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chromedriver", chromedriver);
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5000));

		
		driver.get("https://www.naukri.com/mnjuser/homepage");
		System.out.println(driver.getTitle());
		
//		WebElement strElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='row']/div/strong[@class='hdn']")));
//		System.out.println(strElement.getText());
		WebElement strElement=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='row']/div/strong[@class='hdn']")));
		System.out.println(strElement.getText());
		
//		WebElement usernamElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userField']")));
//		System.out.println(usernamElement.getText());
		driver.findElement(By.cssSelector("input#usernameField")).sendKeys("solvery1998@gmail.com");
		driver.findElement(By.cssSelector("input#passwordField"))
				.sendKeys("Test1234");
		driver.findElement(By.xpath("//div[@class='action row mb0']/div/button[@type='submit'][1]")).click();

	}

}
