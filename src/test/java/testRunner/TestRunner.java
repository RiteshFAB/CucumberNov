package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\Features\\Facebook.feature",
		glue="stepDefination",
		tags="@Sainty",		
		monochrome=true,
		plugin= {"pretty","html:.\\target\\cucumber.html"}
		)

public class TestRunner {

}
