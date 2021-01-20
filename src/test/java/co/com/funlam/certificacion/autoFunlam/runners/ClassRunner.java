package co.com.funlam.certificacion.autoFunlam.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/hola_ivan_bien_o_no.feature"},
        glue = {"co.com.funlam.certificacion.autoFunlam.stepDefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class ClassRunner {
}
