package Runner;

import io.cucumber.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features="src/test/resources/Features",
glue= {"Stepdefinition"},

monochrome=true
)

public class Runner {

}
