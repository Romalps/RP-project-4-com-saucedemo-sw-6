package com.saucedemo.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "com/saucedemo",
        tags = "@smoke",
        plugin = {}


)



public class TestRunner {
}
