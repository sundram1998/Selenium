package demos;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Demo1 {

	@BeforeClass
	@Parameters({ "browser", "url" })
	public void beforeClass(@Optional("FireFox") String browser, @Optional String url) {
		System.out.println("Browser: " + browser+" in demo1");
		System.out.println("url :" + url);
		System.out.println("Inside BeforeClass from Demo1");
	}

	@Test
	public void testCase() {
		System.out.println("Inside Test from Demo1");
	}

	@AfterSuite
	public void aftersuit() {
		System.out.println("after suit from demo1");
	}
}
