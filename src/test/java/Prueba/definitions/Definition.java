package Prueba.definitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Vericar;
import tasks.Buscar;
import tasks.OpenPages;

public class Definition {
    @Before
    public void setStage()
    {

        OnStage.setTheStage(new OnlineCast());

    }
    @Given("^ingresar al sitio web$")
    public void ingresarAlSitioWeb() {
        OnStage.theActorCalled("jairo").wasAbleTo(OpenPages.abrir());
    }


    @When("^buscar el pdf para objetos extraviados$")
    public void buscarElPdfParaObjetosExtraviados() {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.busqueda());
    }

    @Then("^verificar el pdf tecto\"([^\"]*)\"$")
    public void verificarElPdfTecto(String arg1) {
        OnStage.theActorInTheSpotlight().should((GivenWhenThen.seeThat(Vericar.preguntar(arg1))));
    }





}
