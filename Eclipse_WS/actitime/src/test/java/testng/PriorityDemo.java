package testng;

import org.testng.annotations.Test;

public class PriorityDemo {

	
	 @Test(priority = 1)
	  public void launch() 
	  {
		  System.out.println("Launching Application");
	  }
	 @Test(priority = 2)
	  public void login() 
	  {
		  System.out.println("Login Application");
	  }
	 @Test(priority = 3)
	  public void createCustomer() 
	  {
		  System.out.println("CC in Application");
	  }
	 @Test(priority = 4)
	  public void logout() 
	  {
		  System.out.println("Logout from  Application");
	  }
}
