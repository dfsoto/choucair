package co.com.choucair.certification.proyectoBase.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/academyChoucair.feature",
        tags = "@stories",
        glue= "co.com.choucair.certification.proyectoBase.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RunnerTags {
    public static void main(String[] args) {

    }
}
