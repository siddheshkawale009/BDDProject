package RunnerPKG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\ASUS\\IdeaProjects\\BDDProject\\src\\test\\java\\FeaturesPKG\\EX02_Hooks.feature",
        glue = {"StepsPKG","HooksPKG"}
)
public class EX02_HooksRun extends AbstractTestNGCucumberTests
{

}
