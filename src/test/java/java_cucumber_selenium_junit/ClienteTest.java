package java_cucumber_selenium_junit;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Cliente.feature", glue = { "" }, monochrome = true, dryRun = false)
public class ClienteTest {

}
