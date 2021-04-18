package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/java/features/login.feature","src/test/java/features/createlead.feature"},
glue="Step", monochrome=true,publish=true , tags="@functional or @smoke")
public class Runners extends AbstractTestNGCucumberTests {

}
