package testng;

import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

public class TestData {

	
	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "customer1", "customer1-Desc" },
	      new Object[] { "customer2", "customer2-Desc" },
	    };
	  }
	  
	  @DataProvider
	  public Object[][] createcustomerdata() {
		 Faker faker = new Faker();
	    return new Object[][] {
	      new Object[] { faker.name().firstName(), "customer1-Desc" },
	      new Object[] { faker.name().firstName(), "customer2-Desc" },
	    };
	  }
	  
	  @DataProvider
	  public Object[][] createprojectdata() {
	    return new Object[][] {
	      new Object[] { "project1" , "customer1", "project1-Desc" },
	      new Object[] { "project2",  "customer2", "project2-Desc" },
	    };
	  }
}
