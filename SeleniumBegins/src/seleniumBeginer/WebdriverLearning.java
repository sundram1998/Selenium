package seleniumBeginer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://www.ally.com";
		
		driver.get(url);

	}

}
