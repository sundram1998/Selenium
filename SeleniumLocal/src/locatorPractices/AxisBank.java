package locatorPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxisBank {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.axisbank.com/");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//li[@id='Aboutus']/preceding-sibling::li[1]")).click();
		driver.navigate().to("https://www.axisbank.com/nri");
		driver.close();
	}
	

}
