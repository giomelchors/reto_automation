package screenplay.tasks.sahitesterror;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.ui.SahitestDemoPage;

public class EnterTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SahitestDemoPage.LB_ERROR_PAGES));
    }
    public static EnterTask ErrorPages(){
        return Tasks.instrumented(EnterTask.class);
    }
}
