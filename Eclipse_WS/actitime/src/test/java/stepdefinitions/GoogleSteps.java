package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ita.selenium.actitime.utils.ActitimeUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps extends ActitimeUtils 
{

	WebDriver driver = null;
	List<WebElement> autoSuggestions = null;
	@Given("user is on Google page")
	public void user_is_on_google_page() {
	
		driver = getDriver();
		driver.get("http://www.google.com");
	}

	@When("user search for {}")
	public void user_search_for(String companyName) {
		driver.findElement(By.name("q")).sendKeys(companyName);
	}

	@Then("user should get suggestions releated to user text")
	public void user_should_get_suggestions_releated_to_user_text() {
		autoSuggestions = driver.findElements(By.xpath("//li[contains(@class,'sbct') and @role='presentation']/parent::ul/li"));
		
		System.out.println("Total  Auto Suggestions displayed is " + autoSuggestions.size());

	}

	@Then("user will print the autosuggestions")
	public void user_will_print_the_autosuggestions() {
		for(WebElement ele: autoSuggestions)
		{
			System.out.println(ele.getText());
		}
		driver.close();
	}

}
