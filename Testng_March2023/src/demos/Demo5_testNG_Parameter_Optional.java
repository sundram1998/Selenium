package demos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
// Parameter and optional
public class Demo5_testNG_Parameter_Optional {

	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser", "url" })
	public void beforeClass(@Optional("IE") String browser, @Optional String url) {
			System.out.println("Browser : " + browser);
			System.out.println("URL: "+url);
	}

	@Test
	public void f() {
		System.out.println("Demo5_TestNG_Optional_Parameter  Test");

	}

}
