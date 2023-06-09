package screenplay.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import screenplay.tasks.sahitesterror.OpenTask;
import screenplay.tasks.sahitestsite.LoginTask;

public class CommonSteps {
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

    @Given("that Geovanny enter to the page sahitest")
    public void thatGeovannyEnterToThePageSahitest() {
        geovanny.wasAbleTo(OpenTask.SahitestDemoPage());

    }
}
