package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;
import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.Reporter;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"gluecode"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
