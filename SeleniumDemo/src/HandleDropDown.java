import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.getTitle().contains("Practice Page");
		System.out.println("Title validation success");
		
		WebElement dropDownElement=driver.findElement(By.id("dropdown-class-example"));
		Select select=new Select(dropDownElement);
		select.selectByIndex(1);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		driver.findElement(By.id("confirmbtn")).click();
		alert.dismiss();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
