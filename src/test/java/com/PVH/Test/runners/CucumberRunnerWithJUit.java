package com.PVH.Test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Ibi on 31/05/2021.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/com/PVH/test/features"},
        format = {"json:target/cucumber-json-report.json", "html:target/cucumber-report-html"},
        glue = {"com/PVH/Test/steps"}
        //, tags = "@Smoke"
)
public class CucumberRunnerWithJUit {
}
