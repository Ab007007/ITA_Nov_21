package testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
  
  @Test(dataProvider = "dp", dataProviderClass = TestData.class)
  public void f(String s1, String s2)
  {
	  System.out.println("values are " + s1 + " and " + s2);
	  
  }


}
