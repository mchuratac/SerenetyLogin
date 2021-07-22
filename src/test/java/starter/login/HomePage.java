package starter.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target TITLE_WELCOME =  Target.the("title welcome").located(By.xpath("/html/body/table/tbody/tr[1]/td/table[2]/tbody/tr/td[1]/p/span/b"));
    static Target BTN_CERRAR = Target.the("user field")
            .located(By.linkText("CERRAR SESION"));

}