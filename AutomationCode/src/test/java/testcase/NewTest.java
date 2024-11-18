package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void m1() {
	  System.out.println("Method m1");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
  }

}
