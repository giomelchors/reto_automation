package screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://sahitest.com/demo/")
public class SahitestDemoPage extends PageObject {

    public static  final Target LB_ERROR_PAGES = Target.the("Label error pages").
            located(By.xpath("/html/body/table/tbody/tr/td[4]/a[10]"));

    public static final Target LB_500_PAGE = Target.the("label 500 page").
            located(By.xpath("/html/body/a[2]"));

    public static final  Target MSM_DESCRIPTION = Target.the("code description").
            located(By.xpath("//*[@id=\"error-information-popup-content\"]/div[2]"));
}
