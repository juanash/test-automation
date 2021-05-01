package co.com.choucair.certification.testuser.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/testuser.feature",
                              tags = "@stories",
                              glue = "co.com.choucair.certification.testuser.stepdefinitions",
                              snippets = SnippetType.CAMELCASE )

public class RunnerTags {


}