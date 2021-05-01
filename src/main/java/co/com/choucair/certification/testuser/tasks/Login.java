package co.com.choucair.certification.testuser.tasks;

import co.com.choucair.certification.testuser.userinterface.TestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onThePage(){
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TestLoginPage.LOGIN_BUTTON),
        Enter.theValue("IngresaTuUsuario").into(TestLoginPage.INPUT_USER),
        Enter.theValue("IngresaTuContraseña").into(TestLoginPage.INPUT_PASSWORD),
                Click.on(TestLoginPage.ENTER_BUTTON)
        );

    }
}
