package screenplay.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import screenplay.tasks.sahitestsite.LoginTask;

public class SahitestStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor geovanny = Actor.named("Geovanny");

    @Before
    public void initialSetUp(){
        geovanny.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("that Geovanny enter the user \"([^\"]*)\" and password \"([^\"]*)\" to the login page$")
    public void thatGeovannyEnterTheUserAndPasswordToTheLoginPage(String user, String password) {
        geovanny.wasAbleTo(LoginTask.inSahiTest(user, password));
    }

    @When("add \"([^\"]*)\" java core books, \"([^\"]*)\" ruby for rails books and \"([^\"]*)\" python cookbooks to the shopping cart")
    public void addJavaCoreBooksRubyForRailsBooksAndPythonCookbooksToTheShoppingCart(Integer java_core, Integer ruby, Integer python) {
    }
    @Then("verify the total cost of the books")
    public void verifyTheTotalCostOfTheBooks() {
    }
}
