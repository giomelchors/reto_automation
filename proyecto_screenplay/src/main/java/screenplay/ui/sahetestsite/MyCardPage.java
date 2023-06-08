package screenplay.ui.sahetestsite;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyCardPage extends PageObject {
    public static final Target QUANTITY = Target.the("Libros en el carrito").locatedBy("//tr['{0}']/td[2]");
    public static final Target TOTAL_COST = Target.the("Valor total por libros").locatedBy("//*[@id=\'added\']/tbody/tr['{0}']/td[4]");
    public static final Target GRAN_TOTAL = Target.the("Valor total de los libros").located(By.id("total"));
}
