package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles"}, monochrome=true,tags= {"@tag"}, glue = {"stepDefinition"}, format = {"pretty", "html:target/Destination"})
public class Runner2 {

	
}
