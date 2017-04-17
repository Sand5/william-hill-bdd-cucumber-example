package testrunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 *This class is the runner class
 * used to execute the cucumber
 * step definitions class
 * the glue code can also
 * be set the edit config
 * setting for any feature file.
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/testreport"},
        features = {"src/test/java/features/"},
        glue = {"steps"}

)
public class CucumberRunner {

}
