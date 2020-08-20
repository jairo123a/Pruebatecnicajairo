package tasks;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.BusquedaPa;


public class Buscar implements Task {


    BusquedaPa busquedaPa;
    public static tasks.Buscar busqueda(){

        return Tasks.instrumented(tasks.Buscar.class);


    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BusquedaPa.servicio)
                ,Click.on(BusquedaPa.Infomacion),Click.on(BusquedaPa.objetos));
                busquedaPa.metodo();
                actor.attemptsTo(Click.on(BusquedaPa.texto));
                busquedaPa.metodo();
    }
}
