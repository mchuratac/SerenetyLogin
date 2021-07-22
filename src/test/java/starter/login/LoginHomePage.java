package starter.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginHomePage {
    public static Performable Login(String Usuario, String Contraseña) {

        return Task.where("{0} ingresar el usuario '" + Usuario + "'" +
                        "{0} y la contraseña '" + Contraseña + "'" +
                        "{0} y presiona el botón 'Iniciar Sesión'",
                Enter.theValue(Usuario)
                        .into(LoginForm.USER_FIELD),
                Enter.theValue(Contraseña)
                        .into(LoginForm.PASSWORD_FIELD),
                Click.on(LoginForm.LOGIN_BUTTON)

                );
    }

    public static Performable CerrarSesion() {

        return Task.where("{0} cerrar la sesion '" ,

                Click.on(HomePage.BTN_CERRAR)
        );
    }
}
