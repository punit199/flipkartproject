package runfile;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Er punit kumar\\eclipse-workspacenew\\fipcatproject\\src\\test\\java\\feature\\homepage.feature",
glue="stepdefination",
format={"pretty","html:test-output","junit:junit_xml/cumber.xml"},monochrome=true,dryRun=false,tags={"@SmokeTesting"} )

 
public class RunnerTest {

}
