package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "src/main/java/stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
