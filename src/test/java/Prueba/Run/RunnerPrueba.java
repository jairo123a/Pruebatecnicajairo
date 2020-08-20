package Prueba.Run;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/Robot.feature",
        tags = "@caso1",
        glue = "Prueba/definitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerPrueba {
}
