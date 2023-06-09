package screenplay.tasks.sahitesterror;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.ui.SahitestDemoPage;

public class EnterCode implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SahitestDemoPage.LB_500_PAGE));
    }

    public static EnterCode ClickInCode(){
        return Tasks.instrumented(EnterCode.class);
    }
}
