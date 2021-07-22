package starter.login;

import net.serenitybdd.screenplay.targets.Target;

public class CerrarSesion {

    static Target BTN_CONFIR_CERRAR = Target.the("user field")
            .locatedBy("/html/body/table[2]/tbody/tr[3]/td/form/table/tbody/tr[2]/td/button[1]");
}
