package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Abel on 30/07/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:out"}, snippets = SnippetType.CAMELCASE)
public class RunCukesTest {
}
