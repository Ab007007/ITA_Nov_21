package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/java/feature",
		glue = {"stepdefinitions"},
		//dryRun = true,
		//		tags = "@regression and @actitime",
		//	tags = "@regression or @actitime",
		//	tags = "@regression and not @actitime",
		tags = "@newTest",
		monochrome = true,
		plugin = { "pretty","junit:target/JunitReports/report.xml",
							"json:target/JsonReports/report.json",
							"html:target/HTMLReports/report.html"
				
		}
		
		
		)
public class TestRunner {

}
