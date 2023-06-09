package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import screenplay.ui.SahitestDemoPage;

public class ResponseCode implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(SahitestDemoPage.MSM_DESCRIPTION).answeredBy(actor).toString();
    }

    public static ResponseCode answer(){
        return new ResponseCode();
    }

}
