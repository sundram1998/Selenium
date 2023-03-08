package demos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

public class Demo2 {
  @Test
  public void mainTest() {
	  System.out.println("Inside mainTest from Demo2");  
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside beforeTest from Demo2");
  }

}
