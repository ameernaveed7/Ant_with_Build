package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("this is test f ");
  }
  @Test
  public void g() {
	  System.out.println("this is test g ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("iam in before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("iam in after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("iam in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("iam in after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("iam in before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("iam in after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("iam in before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("iam in after suite");
  }

}
