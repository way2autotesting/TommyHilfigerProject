package com.PVH.Test.steps;

import com.PVH.Test.pages.AddressPage;
import com.PVH.Test.pages.LandingPage;
import com.PVH.Test.pages.MyAccountPage;
import com.PVH.framework.base.Base;
import com.PVH.framework.base.DriverContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by Ibi on 31/05/2021.
 */
public class AddNewAddressStepdefs extends Base {
    @And("^I navigate to My Account overview page$")
    public void iNavigateToMyAccountOverviewPage() {

        CurrentPage = CurrentPage.As(LandingPage.class).ClickMyAccount();
    }

    @And("^I click Directory to add new address$")
    public void iClickDirectoryToAddNewAddress()  {

        CurrentPage.As(MyAccountPage.class).ClickToCancelAdd();
        CurrentPage = CurrentPage.As(MyAccountPage.class).ClickAddress();
    }

    @Then("^I land in My Account Directory page$")
    public void iLandInMyAccountDirectoryPage() throws Throwable {

        //Assert.assertTrue(CurrentPage.As(AddressPage.class).IsAddNewAddressBtnPresent());
    }

    @When("^I click the Add new address$")
    public void iClickTheAddNewAddress(){

        CurrentPage.As(AddressPage.class).ClickNewAddress();
    }

    @And("^I fill the form displayed on the screen$")
    public void iFillTheFormDisplayedOnTheScreen()  {

        CurrentPage.As(AddressPage.class).FillFormAs("testFirstName","testLastName","test street","test number","test place","1111 AB","000000");
    }

    @And("^I click the save button$")
    public void iClickTheSaveButton()  {

        CurrentPage.As(AddressPage.class).ClickSaveButton();
    }

    @Then("^the new address added to my account profile$")
    public void theNewAddressAddedToMyAccountProfile()  {

        CurrentPage.As(AddressPage.class).UpdatingAddress();
    }

    @And("^I delete the current address to revert back to the previous status$")
    public void iDeleteTheCurrentAddressToRevertBackToThePreviousStatus()  {

        CurrentPage.As(AddressPage.class).DeleteTheCurrentAddress();
        DriverContext.WaitForPageToLoad();
    }
}
