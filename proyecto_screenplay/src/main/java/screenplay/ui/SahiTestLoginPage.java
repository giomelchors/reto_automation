package screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("http://sahitest.com/demo/training/login.htm")
public class SahiTestLoginPage extends PageObject {

    public static final Target LB_USER = Target.the("User").located(By.name("user"));
    public static final Target LB_PASSWORD= Target.the("Password").located(By.name("password"));
    public static final Target BTN_LOGIN = Target.the("Login Button").located(By.className("button"));
}
