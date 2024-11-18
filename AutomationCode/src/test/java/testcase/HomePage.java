package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class HomePage {
  @Test
  public void m1() {
  System.out.println(" M1 ");
  }
  
  @Test
  public void m2() {
	  System.out.println(" M2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
  }

}
