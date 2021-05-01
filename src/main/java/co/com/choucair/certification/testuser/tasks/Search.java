package co.com.choucair.certification.testuser.tasks;

import co.com.choucair.certification.testuser.userinterface.TestLoginPage;
import co.com.choucair.certification.testuser.userinterface.TestSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {

    private String course;

    public Search(String course) {
        this.course = course;
    }

    public static Search the(String course){
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TestSearchPage.UC_BUTTON),
                Enter.theValue(course).into(TestSearchPage.UC_BUTTON),
                Click.on(TestSearchPage.GO_BUTTON),
                Click.on(TestSearchPage.SELECT_COURSE)
        );

    }
}