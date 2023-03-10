/**
 * 
 */
package seleniumBeginer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author SUNDARAM YADAV
 *
 */
class JUnitDemo_March2023 {

	/**
	 * @throws java.lang.Exception
	 */
	WebDriver driver=new  ChromeDriver();
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chromedriver", "C:\\\\Users\\\\HP\\\\Downloads\\\\ChromeDriver\\\\chromedriver.exe");
		
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
