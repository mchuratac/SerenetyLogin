package starter.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

public class CerrarSesionPage {

    public static Performable CerrarSesion() {

        return Task.where("{0} cerrar la sesion '" ,
                Scroll.to(CerrarSesion.BTN_CONFIR_CERRAR),
                Click.on(CerrarSesion.BTN_CONFIR_CERRAR)
        );
    }
}
