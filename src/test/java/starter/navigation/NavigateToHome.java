package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToHome {
    public static Performable theTePidoWeb() {
        return Task.where("{0} opens the TePido home page",
                Open.browserOn().the(SGCREDHomePage.class));
    }
}
