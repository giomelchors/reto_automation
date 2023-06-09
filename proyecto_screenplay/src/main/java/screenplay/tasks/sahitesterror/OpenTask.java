package screenplay.tasks.sahitesterror;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import screenplay.ui.SahitestDemoPage;


public class OpenTask  implements Task {

    private SahitestDemoPage sahitestDemoPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(sahitestDemoPage));
    }

    public static OpenTask SahitestDemoPage(){
        return Tasks.instrumented(OpenTask.class);
    }
}
