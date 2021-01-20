package co.com.funlam.certificacion.autoFunlam.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClassUser extends PageObject {
    public static final Target LAVEL_TITULOPAGINA =
            Target.the("Pagina arquitectura").located(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/h1"));
}
