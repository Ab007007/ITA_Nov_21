package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ita.selenium.actitime.utils.ActitimeUtils;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps extends ActitimeUtils {

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

	@Then("user should get suggestion(s) releated to user text")
	public void user_should_get_suggestions_releated_to_user_text() {
		autoSuggestions = driver
				.findElements(By.xpath("//li[contains(@class,'sbct') and @role='presentation']/parent::ul/li"));

		System.out.println("Total  Auto Suggestions displayed is " + autoSuggestions.size());

	}

	@Then("user will print/save the autosuggestions")
	public void user_will_print_the_autosuggestions() {
		for (WebElement ele : autoSuggestions) {
			System.out.println(ele.getText());
		}
		driver.close();
	}

	@Then("user search companies one after another and print them")
	public void user_search_companies_one_after_another_and_print_them(DataTable dataTable) {
		 List<Map<String, String>> data = dataTable.asMaps();
		String companyName;
		for (int i = 0; i < data.size(); i++) {
			companyName = data.get(i).get("companyname");
			driver.findElement(By.name("q")).sendKeys(companyName);
			autoSuggestions = driver
					.findElements(By.xpath("//li[contains(@class,'sbct') and @role='presentation']/parent::ul/li"));

			System.out.println("Total  Auto Suggestions displayed is " + autoSuggestions.size());
			for (WebElement ele : autoSuggestions) {
				System.out.println(ele.getText());
			}
			driver.navigate().refresh();
			
		}

	}

	;
}
