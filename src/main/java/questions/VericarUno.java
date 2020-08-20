package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.BusquedaPa;

public class VericarUno implements Question<Boolean> {
    private  String pregunta;
    public VericarUno(String pregunta){
        this.pregunta=pregunta;


    }

    public static VericarUno pregunta(String arg1) {

        return new VericarUno(arg1);

    }



    @Override
    public Boolean answeredBy(Actor actor) {
        String texto;
        Boolean resultado;
        texto = Text.of(BusquedaPa.historia).viewedBy(actor).asString();
        if (texto.equals(pregunta)) {
            resultado=true;
            System.out.println(texto);
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
