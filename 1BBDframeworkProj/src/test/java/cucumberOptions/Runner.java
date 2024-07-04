package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	//	features ="src/test/java/featureLayer",
		features ="src/test/java/featureLayer/Login.feature",
	//	features ="src/test/java/featureLayer/Contact.feature",
		glue ="stepDefinition",
		dryRun =false,
		plugin = {"pretty","html:target/cucumberReport1.html","json:target/cucumberReport.json"},
		tags="@RegressionTest"
		
		)


public class Runner extends AbstractTestNGCucumberTests{

}
