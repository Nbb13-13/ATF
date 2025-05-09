package stepDefinition;


import Util.DataKeys;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static Actions.Action.*;
import static Util.DataKeys.PASSWORD;
import static Util.DataKeys.USERNAME;
import static Util.HighlightElement.highlightElement;
import static Util.ScenarioContext.getData;
import static Util.ScenarioContext.saveData;
import static Util.WaitUntil.waitUntil;

public class Login extends AbstractStepDef {
    @Given("user insert username")
    public void userInsertusername() throws InterruptedException {
        navigate(loginPageUrl, driver);
        Thread.sleep(3000);
        sendKey(loginPage.getUsernameField(), "Admin");
        saveData(USERNAME,"Admin");
    }

    @And("user insert password")
    public void userInsertPassword() throws InterruptedException {
        Thread.sleep(3000);
        sendKey(loginPage.getPasswordField(), "admin123");
        saveData(PASSWORD, "admin123");
    }

    @When("user clicks on Login button")
    public void userClicksOnLoginButton() {
        click(loginPage.getSubmitButton(), 3);
    }

    @Then("user is redirect to homepage")
    public void userRedirectToHomepage() throws InterruptedException {
        waitUntil(3);
        highlightElement(homePage.getDashboardSign());
        Assert.assertEquals("Dashboard", homePage.getDashboardSign().getText());

    }

    @And("user clicks on LogOut button")
    public void userClickOnLogOutButton() {
        click(homePage.getUserMeniu(), 1);
        highlightElement(homePage.getLogOutButton());
        waitUntil(1);
        click(homePage.getLogOutButton(), 1);
    }
    @And("insert username")
    public void Insertusername()  {
        waitUntil(3);
        sendKey(loginPage.getUsernameField(), getData(USERNAME).toString());

    }

    @And("insert password")
    public void InsertPassword() {
        waitUntil(3);
        sendKey(loginPage.getPasswordField(), getData(PASSWORD).toString());

    }
}





