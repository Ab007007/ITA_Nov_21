package testng;

import org.testng.annotations.Test;

public class HelloWorldTestNG
{
	 @Test
	  public void launch() 
	  {
		  System.out.println("Launching Application");
	  }
	 @Test
	  public void login() 
	  {
		  System.out.println("Login Application");
	  }
	 @Test
	  public void createCustomer() 
	  {
		  System.out.println("CC in Application");
	  }
	 @Test
	  public void logout() 
	  {
		  System.out.println("Logout from  Application");
	  }
	  
  
  
}
