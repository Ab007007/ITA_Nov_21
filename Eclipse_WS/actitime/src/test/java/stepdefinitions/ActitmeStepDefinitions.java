package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ita.selenium.actitime.utils.ActitimeUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActitmeStepDefinitions extends ActitimeUtils {

	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		getDriver();
		launch("http://localhost/login.do");
		validateTitle("actiTIME - Login");
	}
	@When("user enter invalid username and password")
	public void user_enter_invalid_username_and_password() {
	    //login("admin", "manager");
		type("id", "username", "admin1");
		type("name", "pwd", "manager1");
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
		click("id", "loginButton");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("user should be shown an error message")
	public void user_should_be_shown_an_error_message() {
		WebElement errorMsg = getElement("xpath", "//span[@class='errormsg']");
		
		System.out.println(errorMsg.getText());
		
	}
	@Then("user validate the Login page")
	public void user_validate_the_login_page() {
		validateTitle("actiTIME - Login");
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		type("id", "username", "admin");
		type("name", "pwd", "manager");
	}

	@Then("user validate the dashboard page")
	public void user_validate_the_dashboard_page() {
		validateTitle("actiTIME - Enter Time-Track");
	}

	@Then("user should be landed on Dashboard page")
	public void user_should_be_landed_on_dashboard_page() {
		System.out.println("on dashboard page");
	}
	@Then("close the browser")
	public void close_the_browser() {
	   driver.close();
	}


}
