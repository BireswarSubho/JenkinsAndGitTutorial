package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src/test/java/FeatureFiles/Amazon.feature",
		glue="StepDefinitions",
		monochrome=true
		)
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

	
}
