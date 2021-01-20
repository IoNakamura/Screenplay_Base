package co.com.funlam.certificacion.autoFunlam.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Classquestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        /*
        Visibility.of(LAVEL_TITULOPAGINA).viewedBy(actor);
        String laRespuestaEs = LAVEL_TITULOPAGINA.resolveFor(actor).getText();
        return laRespuestaEs.contains("Arquitectura (Presencial)");
         */
    }
    public static Classquestions elMetodo(){
        return new Classquestions();
    }

}
