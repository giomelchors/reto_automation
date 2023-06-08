package screenplay.tasks.sahitestsite;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import screenplay.ui.sahetestsite.BooksInStockPage;

public class AddTask implements Task {
    private final String java_core;
    private final String ruby;
    private final String python;

    public AddTask(String java_core, String ruby, String python){
        this.java_core = java_core;
        this.ruby = ruby;
        this.python = python;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(java_core).into(BooksInStockPage.LB_CANTIDA_CORE_JAVA),
                Enter.theValue(ruby).into(BooksInStockPage.LB_CANTIDA_RUBY),
                Enter.theValue(python).into(BooksInStockPage.LB_CANTIDA_PYTHON),
                Click.on(BooksInStockPage.BTN_AGREGAR));

    }


    public static AddTask ShoppingCard(String java_core, String ruby, String python) {
        return Tasks.instrumented(AddTask.class, java_core, ruby, python);
    }
}
