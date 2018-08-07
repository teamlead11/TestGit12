package org.maven.project;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Amazon.class)
@CucumberOptions(features = "Feature/Amazon.feature", glue = { "org.maven.project" }, plugin = {"html:target/CucumberReports" })

public class Runner {

}
