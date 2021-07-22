package starter.login;

import net.serenitybdd.screenplay.targets.Target;

class LoginForm {
    static Target USER_FIELD = Target.the("user field")
            .locatedBy("/html/body/table[2]/tbody/tr[3]/td/div/form/table/tbody/tr[1]/td[2]/input");

    static Target PASSWORD_FIELD = Target.the("password field")
            .locatedBy("/html/body/table[2]/tbody/tr[3]/td/div/form/table/tbody/tr[2]/td[2]/input");

    static Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("/html/body/table[2]/tbody/tr[3]/td/div/form/table/tbody/tr[3]/td[1]/button");

}
