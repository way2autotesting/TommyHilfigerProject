package com.PVH.Test.pages;

import com.PVH.framework.base.BasePage;
import com.PVH.framework.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ibi on 31/05/2021.
 */
public class LandingPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//*[starts-with(@data-testid, 'HeaderMyAccount')]")
    private WebElement accountId;

    @FindBy(how = How.XPATH, using = "//a[starts-with(@href, '/')]")
    private WebElement tommyHilfigerTitle;


    public String GetAccountId(){

        return accountId.getText();
    }

    public boolean IsAccountIdPresent(){

        return tommyHilfigerTitle.isDisplayed();
    }

    public MyAccountPage ClickMyAccount(){

        DriverContext.WaitForElementToBeClickable(accountId);
        DriverContext.WaitForPageToLoad();
        return GetInstance(MyAccountPage.class);
    }
}
