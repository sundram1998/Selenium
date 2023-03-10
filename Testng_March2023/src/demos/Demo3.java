package demos;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Demo3 {
  @Test
  public void testCase() {
	  System.out.println("Inside Test from Demo3");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside beforeTest from Demo3");
  }
}
