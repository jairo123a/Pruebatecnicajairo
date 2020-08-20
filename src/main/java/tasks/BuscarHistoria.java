package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.BusquedaPa;

public class BuscarHistoria implements Task {

    BusquedaPa busquedaPa;
    public static tasks.BuscarHistoria busqueda(){

        return Tasks.instrumented(tasks.BuscarHistoria.class);


    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BusquedaPa.quienessomos));
        busquedaPa.metodo();
    }
}
