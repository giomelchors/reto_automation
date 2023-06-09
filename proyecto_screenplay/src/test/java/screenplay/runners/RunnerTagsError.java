package screenplay.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/error_page.feature",
        glue="screenplay.stepdefinitions",
        snippets= CucumberOptions.SnippetType.CAMELCASE)
public class RunnerTagsError {
}
