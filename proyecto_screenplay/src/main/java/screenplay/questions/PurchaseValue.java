package screenplay.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import screenplay.ui.sahetestsite.MyCardPage;

import java.util.List;

public class PurchaseValue implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        List<WebElementFacade> value;
        value = MyCardPage.TOTAL_COST.resolveAllFor(actor);
        int totalCost = 0;
        for (int i = 1; i <= (value.size()-1); i++){
            String costBook = value.get(i).getText().replace("Rs.", "" );
            System.out.println(costBook);
            int valueBook = Integer.parseInt(costBook);
            totalCost+= valueBook;

        }
        String sumOfValues = String.valueOf(totalCost);
        String grandTotal = MyCardPage.GRAN_TOTAL.resolveFor(actor).getValue();

        boolean value_expected;

        value_expected = grandTotal.equals(sumOfValues);

        return value_expected;

    }

    public static  PurchaseValue total(){
        return new PurchaseValue();
    }
}
