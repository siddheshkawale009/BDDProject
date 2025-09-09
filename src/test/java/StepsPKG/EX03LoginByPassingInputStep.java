package StepsPKG;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EX03LoginByPassingInputStep
{

    @Given("User is on Login Page")
    public void user_is_on_login_page()
    {
        System.out.println("Login page visible");

    }

    @When("User Enter UserName")
    public void user_enter_user_name()
    {
        System.out.println("User name entered");

    }

    @When("User Enter Password")
    public void user_enter_password()
    {
        System.out.println("Password entered");

    }

    @When("User click on Login button")
    public void user_click_on_login_button()
    {
        System.out.println("Login Button clicked");

    }

    @Then("User redirected to Home page")
    public void user_redirected_to_home_page()
    {
        System.out.println("Home page visible");

    }


    @When("User Enter UserName as {string}")
    public void userEnterUserNameAs(String userName)
    {
        System.out.println("UserName = "+userName);
        // Write code here that turns the phrase above into concrete actions
    }

    @And("User Enter Password as {string}")
    public void userEnterPasswordAs(String password)
    {
        System.out.println("Password = "+password);
        // Write code here that turns the phrase above into concrete actions
    }


}
