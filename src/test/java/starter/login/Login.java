package starter.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.targets.Target;

class Login{

    static Target USER_FIELD = Target.the("user field")
            .locatedBy("/html/body/table[2]/tbody/tr[3]/td/div/form/table/tbody/tr[1]/td[2]/input");

    static Target PASSWORD_FIELD = Target.the("password field")
            .locatedBy("/html/body/table[2]/tbody/tr[3]/td/div/form/table/tbody/tr[2]/td[2]/input");

    static Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("/html/body/table[2]/tbody/tr[3]/td/div/form/table/tbody/tr[3]/td[1]/button");

    static Target BTN_CONFIR_CERRAR = Target.the("user field")
            .locatedBy("/html/body/table[2]/tbody/tr[3]/td/form/table/tbody/tr[2]/td/button[1]");

    public static Performable Login(String Usuario, String Contraseña) {
        return Task.where("{0} ingresar el usuario '" + Usuario + "'" +
                        "{0} y la contraseña '" + Contraseña + "'" +
                        "{0} y presiona el botón 'Iniciar Sesión'",
                Enter.theValue(Usuario).into(this.USER_FIELD),
                Enter.theValue(Contraseña).into(this.PASSWORD_FIELD),
                Click.on(this.LOGIN_BUTTON)
                );
    }

    public static Performable LHomeCerrarSesion() {
        return Task.where("{0} cerrar la sesion '" , Click.on(HomePage.BTN_CERRAR));
    }

    public static Performable CPageCerrarSesion() {
        return Task.where("{0} cerrar la sesion '" ,
        Scroll.to(this.BTN_CONFIR_CERRAR),
        Click.on(this.BTN_CONFIR_CERRAR)
        );
    }

}