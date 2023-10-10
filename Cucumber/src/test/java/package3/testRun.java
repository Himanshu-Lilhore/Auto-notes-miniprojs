package package3;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

       @RunWith(Cucumber.class)
        @CucumberOptions
        (
        		features="C:\\Users\\hlilhore\\eclipse-workspace\\Cucumber\\src\\test\\java\\package1\\facebook2.feature",
        		glue="package2"
        )
        
public class testRun {

}