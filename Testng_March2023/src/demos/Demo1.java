package demos;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;

public class Demo1 {
  @Test
  public void testCase() {
	  System.out.println("Inside Test from Demo1");
  }
  
  @AfterSuite
  public void aftersuit() {
	  System.out.println("after suit from demo1");
  }
}
