package toolsQA.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/main/java/toolsQA/cucumber/testfeatures", glue={"toolsQA.cucumber.stepdefinitions"}, plugin= {"html:target"})

public class TestRunner {

}
