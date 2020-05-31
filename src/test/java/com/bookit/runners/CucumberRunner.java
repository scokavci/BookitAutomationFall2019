package com.bookit.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue =  "com/bookit/step_definitions",
        features = "src/test/resources/features",
        dryRun =false,
       // tags = "@create_student_3",
        plugin = {
                 "json:target/cucumber.json"
        }
)
public class CucumberRunner {

}
