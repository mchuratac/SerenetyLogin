package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.login.*;

import starter.login.HomePage;

import starter.navigation.NavigateToHome;

public class LoginStepDefinitions {

    @Given("{actor} accede a la ruta de SGCRED")
    public void LoginPaginaTPido(Actor actor) {
        actor.wasAbleTo(NavigateToHome.theTePidoWeb());
    }

    @When("{actor} ingresa el usuario {string} y la contraseña {string} y le da click en el botón Ingresar")
    public void elIngresaElUsuarioNombreUsuario(Actor actor, String usuario, String contraseña) {
        actor.attemptsTo(
                Login.Login(usuario, contraseña)
        );
    }

    @When("{actor} ingresa el usuario ([^\"]*) y la contraseña ([^\"]*) y le da click en el botón Ingresar")
    public void elIngresaElUsuarioNombreUsuarioOutline(Actor actor, String usuario, String contraseña) {
        actor.attemptsTo(
                Login.Login(usuario, contraseña)
        );
    }

    @Then("{actor} se cierra el icono del Popup")
    public void heSeCierraElIconoDelPopup(Actor actor) {
        actor.attemptsTo(Login.CERRAR_POPUD()
        );
    }


    @Then("{actor} visualiza en la página home del SGCRED el texto {string}")
    public void teLlevaALaHomeDelSGCRED(Actor actor, String TextoBienvenida) {
        actor.attemptsTo(
                Ensure.that(HomePage.TITLE_WELCOME).text().contains(TextoBienvenida)
        );
    }

    @Then("{actor} cierra la sesión")
    public void heCierraLaSesión(Actor actor ) {
        actor.attemptsTo(Login.LHomeCerrarSesion(), Login.CPageCerrarSesion()
        );
    }


}
