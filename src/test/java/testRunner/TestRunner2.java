package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\Features\\FacebookNew.feature",
                 glue="stepDefination",
		         tags="@sainty",
		         plugin={"pretty","html:.\\target\\facebook2.html"}
		)




public class TestRunner2 {

}
