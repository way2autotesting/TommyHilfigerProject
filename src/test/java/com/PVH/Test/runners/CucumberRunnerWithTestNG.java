package com.PVH.Test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Ibi on 31/05/2021.
 */
@CucumberOptions(features = {"src/test/java/com/PVH/test/features"},
        format = {"json:target/cucumber.json", "html:target/cucumber-report-html",
                "html:target/site/cucumber-pretty"},
        glue = "com/PVH/Test/steps")
public class CucumberRunnerWithTestNG extends AbstractTestNGCucumberTests {
}
