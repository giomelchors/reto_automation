package screenplay.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import screenplay.questions.ResponseCode;
import screenplay.tasks.sahitesterror.EnterCode;
import screenplay.tasks.sahitesterror.EnterTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;



public class SahiErrorStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor geovanny = Actor.named("Geovanny");

    @Before
    public void initialSetUp(){
        geovanny.can(BrowseTheWeb.with(hisBrowser));
    }

    @When("^enter to the option Error Pages$")
    public void enterToTheOptionErrorPages() {
        geovanny.attemptsTo(EnterTask.ErrorPages());
    }
    @And("select the code 500 page")
    public void selectTheCode()  {
        geovanny.attemptsTo(EnterCode.ClickInCode());
    }
    @Then("the screen should display the message {string}")
    public void theMessageOfThePageThisPageIsnTWorking(String string) {
        geovanny.should(seeThat(ResponseCode.answer(),equalTo(string)));
    }
}
