package starter.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target TITLE_WELCOME =  Target.the("title welcome").located(By.xpath("//*[@id=\"dialog1\"]/img"));
    static Target BTN_CERRAR = Target.the("user field")
            .located(By.linkText("CERRAR SESION"));

}