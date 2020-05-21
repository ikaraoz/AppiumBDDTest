package appium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.net.MalformedURLException;

import static appium.AppiumHelpers.*;

public class MyStepdefs {


    @Given("The user is on Phone app")
    public void theUserIsOnPhoneApp() throws IOException {
        navigateHelper();
    }

    @When("The user taps {string}")
    public void theUserTaps(String arg0) {
        tapHelper(arg0);
    }

    @And("The user types {string} to {string} area")
    public void theUserTypesToArea(String arg0, String arg1) {
        //sendKeys
    }

    @Then("the number is saved")
    public void theNumberIsSaved() {
        //tap
    }
}
