package RunnerPKG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "C:\\Users\\ASUS\\IdeaProjects\\BDDProject\\src\\test\\java\\FeaturesPKG\\EX01_BackgroundKeyword.feature",
        glue = "StepsPKG",
        publish = true
)
public class EX01_BackgroundKeyRun extends AbstractTestNGCucumberTests {
}
