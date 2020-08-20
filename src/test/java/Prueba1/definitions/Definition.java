package Prueba1.definitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Vericar;
import questions.VericarUno;
import tasks.Buscar;
import tasks.BuscarHistoria;
import tasks.OpenPages;

public class Definition {
    @Before
    public void setStage()
    {

        OnStage.setTheStage(new OnlineCast());

    }
    @Given("^Ingresar al sitio web$")
    public void ingresarAlSitioWeb() {
        OnStage.theActorCalled("jairo").wasAbleTo(OpenPages.abrir());
    }


    @When("^Buscar la pestaña quienes somos$")
    public void buscarLaPestañaQuienesSomos() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarHistoria.busqueda());
    }

    @Then("^Verificar que aparezca la historia en quienes somos Respuesta\"([^\"]*)\"$")
    public void verificarQueAparezcaLaHistoriaEnQuienesSomosRespuesta(String arg1) {
        OnStage.theActorInTheSpotlight().should((GivenWhenThen.seeThat(VericarUno.pregunta(arg1))));
    }


}
