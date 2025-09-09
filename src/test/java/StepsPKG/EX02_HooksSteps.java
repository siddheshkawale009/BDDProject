package StepsPKG;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EX02_HooksSteps
{


    @Given("User is on Registration Page")
    public void user_is_on_registration_page()
    {
        System.out.println("User is on Registration page");
    }

    @When("User Enter valid Mail")
    public void user_enter_valid_mail()
    {
        System.out.println("Valid Mail eneter");
    }

    @When("User Enter valid Mobile")
    public void user_enter_valid_mobile()
    {
        System.out.println("Valid Mobile enter");
    }

    @Then("User redirected to Login page")
    public void user_redirected_to_login_page()
    {
        System.out.println("Redirected to Login page");
    }

    @When("User Enter invaid Mail")
    public void user_enter_invaid_mail()
    {
        System.out.println("Invalid Mail enter");
    }

    @When("User Enter invaid Mobile Number")
    public void user_enter_invaid_mobile_number()
    {
        System.out.println("Invalid Mobile number enter");
    }

    @When("User click on Submit button")
    public void user_click_on_submit_button()
    {
        System.out.println("Submit button click");
    }

    @Then("User get the validation message")
    public void user_get_the_validation_message()
    {
        System.out.println("Validation message visible");
    }

    @When("User Enter vaid Mail")
    public void user_enter_vaid_mail()
    {
        System.out.println("User enter valid Mail");
    }



}
