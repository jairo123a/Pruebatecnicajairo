package tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.Tocumenpanama;

public class OpenPages implements Task {
    Tocumenpanama tocumenpanama;



    public static tasks.OpenPages abrir() {

        return Tasks.instrumented(tasks.OpenPages.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(tocumenpanama));
    }
}
