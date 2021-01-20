package co.com.funlam.certificacion.autoFunlam.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClassTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {

    }

    public static ClassTasks enChrome(){
        return Tasks.instrumented(ClassTasks.class);
    }
}
