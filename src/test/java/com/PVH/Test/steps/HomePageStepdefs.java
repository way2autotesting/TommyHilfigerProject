package com.PVH.Test.steps;

import com.PVH.Test.pages.HomePage;
import com.PVH.Test.pages.LandingPage;
import com.PVH.framework.Utilities.CucumberUtil;
import com.PVH.framework.base.Base;
import com.PVH.framework.base.DriverContext;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

/**
 * Created by Ibi on 31/05/2021.
 */
public class HomePageStepdefs extends Base{
    @Given("^I am a customer user$")
    public void iAmACustomerUser()  {

        CurrentPage = GetInstance(HomePage.class);
    }

    @And("^I accept the cookies preference$")
    public void iAcceptTheCookiesPreference()  {

        CurrentPage.As(HomePage.class).ClickAcceptCookiesPreferences();
    }

    @When("^I enter the correct username as \"([^\"]*)\"$")
    public void iEnterTheCorrectUsernameAs(String email)  {

        CurrentPage.As(HomePage.class).enterEmail(email);
    }

    @And("^I leave the password field blank$")
    public void iLeaveThePasswordFieldBlank()  {

        //no code
    }

    @And("^I click the sign up button$")
    public void iClickTheSignUpButton() {

        CurrentPage.As(HomePage.class).ClickSignUpButton();
    }

    @Then("^I should see an error message displayed:$")
    public void iShouldSeeAnErrorMessageDisplayed(List<String> table)  {

        Assert.assertTrue(DriverContext.CheckSectionsExist(table));
    }

    @And("^I click the sign up link$")
    public void iClickTheSignUpLink() {

        CurrentPage.As(HomePage.class).ClickSignUpLink();
    }

    @When("^I enter the correct password as \"([^\"]*)\"$")
    public void iEnterTheCorrectPasswordAs(String password)  {

        CurrentPage.As(HomePage.class).enterPassword(password);
    }

    @And("^I leave the \"([^\"]*)\" field blank$")
    public void iLeaveTheFieldBlank(String arg0) {

        //no code
    }

    @When("^I login successfully with the correct credentials$")
    public void iLoginSuccessfullyWithTheCorrectCredentials(DataTable table)  {

        CucumberUtil.ConvertDataTableToDict(table);

        CurrentPage.As(HomePage.class).doLogin(CucumberUtil.GetCellValueWithRowIndex("Email",1),
                CucumberUtil.GetCellValueWithRowIndex("Password", 1));

        CurrentPage = CurrentPage.As(HomePage.class).ClickSignUpBtnSuccessfullyLogin();
    }

    @Then("^I should see the account login successful with the text \"([^\"]*)\"$")
    public void iShouldSeeTheAccountLoginSuccessfulWithTheText(String text)  {

        DriverContext.WaitForPageToLoad();
        //Assert.assertEquals(CurrentPage.As(LandingPage.class).GetAccountId(),text);
        Assert.assertTrue(CurrentPage.As(LandingPage.class).IsAccountIdPresent());
    }
}
