package demos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Demo1 {
  @Test
  public void testCase() {
	  System.out.println("Inside Test from Demo1");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside beforeTest from Demo1");
  }

}
