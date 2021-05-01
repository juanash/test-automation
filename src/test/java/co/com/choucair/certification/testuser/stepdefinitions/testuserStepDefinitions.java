package co.com.choucair.certification.testuser.stepdefinitions;
import co.com.choucair.certification.testuser.tasks.Login;
import co.com.choucair.certification.testuser.tasks.OpenUp;
import co.com.choucair.certification.testuser.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static co.com.choucair.certification.testuser.tasks.Login.*;


public class testuserStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than braandom wnats to learn automation at the academy choucair$")
    public void thanBraandomWnatsToLearnAutomationAtTheAcademyChoucair() {
    OnStage.theActorCalled("Andrea").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }
    @Given("^than Andrea wnats to learn automation at the academy choucair$")
    public void thanAndreaWnatsToLearnAutomationAtTheAcademyChoucair() {

    }

    @When("^he search for the course(.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {
    OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia() {

    }
}
