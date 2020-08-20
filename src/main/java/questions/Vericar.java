package questions;

import net.bytebuddy.implementation.Implementation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.codehaus.groovy.transform.trait.Traits;
import userinterface.BusquedaPa;

public class Vericar implements Question<Boolean> {
  private  String pregunta;
    public Vericar(String pregunta){
    this.pregunta=pregunta;


    }


    public static Vericar preguntar(String arg1) {

     return new Vericar(arg1);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto;
        Boolean resultado;
        texto = Text.of(BusquedaPa.pdf).viewedBy(actor).asString();
        if (texto.equals(pregunta)) {
             resultado=true;

        } else
        {

         resultado=false;

        }
       return resultado;

    }

    @Override
    public String getSubject() {
        return null;
    }
}
