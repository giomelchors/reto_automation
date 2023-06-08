package screenplay.ui.sahetestsite;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BooksInStockPage extends PageObject {
    public static final Target LB_CANTIDA_CORE_JAVA = Target.the("Campo cantidad  de libros Core Java").located(By.xpath("//*[@id=\"listing\"]/tbody/tr[2]/td[4]/input"));
    public static final Target LB_CANTIDA_RUBY = Target.the("Campo cantidad  de libros Ruby for Rails").located(By.xpath("//*[@id=\"listing\"]/tbody/tr[3]/td[4]/input"));
    public static final Target LB_CANTIDA_PYTHON = Target.the("Campo cantidad  de libros Python Cookbook").located(By.xpath("//*[@id=\"listing\"]/tbody/tr[4]/td[4]/input"));
    public static final Target BTN_AGREGAR = Target.the("Boton agregar libros al carrito").located(By.xpath("//*[@id=\"available\"]/input[1]"));

}
