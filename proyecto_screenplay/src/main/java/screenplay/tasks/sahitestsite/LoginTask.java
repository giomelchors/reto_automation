package screenplay.tasks.sahitestsite;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import screenplay.ui.SahiTestLoginPage;

public class LoginTask implements Task {
    private final String user;
    private final String password;

    private SahiTestLoginPage sahiTestLoginPage;

    public LoginTask(String user, String password) {
        this.user = user;
        this.password =password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(sahiTestLoginPage));
        actor.attemptsTo(Enter.theValue(user).into(SahiTestLoginPage.LB_USER),
                Enter.theValue(password).into(SahiTestLoginPage.LB_PASSWORD),
                Click.on(SahiTestLoginPage.BTN_LOGIN));

    }


    public static LoginTask inSahiTest(String user, String password) {
        return Tasks.instrumented(LoginTask.class,user,password);
    }
}
