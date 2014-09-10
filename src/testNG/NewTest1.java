package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() {
	  String str = "HELLO";
	Assert.assertEquals(str, "hello");
  }
}
