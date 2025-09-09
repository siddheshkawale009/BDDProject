package StepsPKG;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EX01_BackgroundTest
{

    @Given("User is present on login page")
    public void user_is_present_on_login_page() {
        System.out.println("Login page visible");
    }

    @When("User enter valid Username")
    public void user_enter_valid_username() {
        System.out.println("Entered valid username");
    }

    @When("User enter valid Password")
    public void user_enter_valid_password() {
        System.out.println("Entered valid password");
    }

    @When("User click on Login BTN")
    public void user_click_on_login_btn() {
        System.out.println("Login button clicked");
    }

    @When("User enter invalid Username")
    public void user_enter_invalid_username() {
        System.out.println("Entered invalid Username");
    }

    @Then("Home page is visible")
    public void homePageIsVisible() {
        System.out.println("Redirected to home page");
        System.out.println("------------------------------------");
    }

    @And("Validation message")
    public void validationMessage() {
        System.out.println("Validation message");
    }

    @Then("Home page not visible")
    public void homePageNotVisible() {
        System.out.println("Home page not visible");
        System.out.println("--------------------------------------");
    }
}
