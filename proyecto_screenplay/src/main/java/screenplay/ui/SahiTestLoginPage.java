package screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("http://sahitest.com/demo/training/login.htm")
public class SahiTestLoginPage extends PageObject {

    public static final Target LB_USUARIO = Target.the("Usuario").located(By.name("user"));
    public static final Target LB_CONTRASENIA = Target.the("Contrasenia").located(By.name("password"));
    public static final Target BTN_INICIAR_SESION = Target.the("Boton iniciar sesión").located(By.className("button"));
    public static final Target TITULO_PAGE = Target.the("titulo page").located(By.xpath("/html/body/center/div/b"));
}
