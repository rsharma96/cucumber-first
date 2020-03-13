package org.explorechoice.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/org/explorechoice/features/OpenBrowser.feature",
        glue = {"org.explorechoice.stepdefinitions"},
        plugin = {"pretty"},
        monochrome = false,
        dryRun = false
)
public class OpenBrowserTestRunner {


}
