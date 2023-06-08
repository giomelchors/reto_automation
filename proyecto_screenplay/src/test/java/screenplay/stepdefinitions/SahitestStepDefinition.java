package screenplay.stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import screenplay.questions.PurchaseValue;
import screenplay.tasks.sahitestsite.AddTask;
import static org.hamcrest.Matchers.is;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class SahitestStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor geovanny = Actor.named("Geovanny");

    @Before
    public void initialSetUp(){
        geovanny.can(BrowseTheWeb.with(hisBrowser));
    }

    @ParameterType(".*")
    public String str(String value) {
        return value;
    }

    @When("add {str} java core books, {str} ruby for rails books and {str} python cookbooks to the shopping cart")
    public void addJavaCoreBooksRubyForRailsBooksAndPythonCookbooksToTheShoppingCart(String java_core, String ruby, String python) {
        geovanny.attemptsTo((AddTask.ShoppingCard(java_core, ruby, python)));
    }

    @Then("verify the total cost of the books$")
    public void verifyTheTotalCostOfTheBooks() {
        geovanny.should(seeThat(PurchaseValue.total(),is(true)));

}

}
