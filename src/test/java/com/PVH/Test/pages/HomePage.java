package com.PVH.Test.pages;

import com.PVH.framework.base.BasePage;
import com.PVH.framework.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ibi on 31/05/2021.
 */
public class HomePage extends BasePage{

    @FindBy(how = How.ID, using = "signin-email")
    private WebElement emailId;

    @FindBy(how = How.ID, using = "signin-password")
    private WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@data-testid, 'Button-primary-new')]")
    private WebElement signupBtn;

    @FindBy(how = How.XPATH, using = "//*[text()='ACCEPTEER ALLES']")
    private WebElement acceptEverythingBtn;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@data-testid, 'sign-in-button')]")
    private WebElement signupLink;

    @FindBy(how = How.ID, using = "signin-password-helper-text")
    private WebElement blankPwErrorMessage;





    /**
     * @WebElement Actions
     * @param mail
     * @param password
     */
    public void doLogin(String mail, String password) {

        DriverContext.enterTextbox(emailId,mail);
        DriverContext.enterTextbox(txtPassword,password);
    }

    public void enterEmail(String mail) {

        DriverContext.enterTextbox(emailId,mail);
    }

    public void enterPassword(String password) {

        DriverContext.enterTextbox(txtPassword,password);
    }

    public void ClickSignUpButton(){

        DriverContext.WaitForElementToBeClickable(signupBtn);
    }

    public void ClickAcceptCookiesPreferences(){

        DriverContext.WaitForElementToBeClickable(acceptEverythingBtn);
    }

    public void ClickSignUpLink(){

        DriverContext.WaitForElementToBeClickable(signupLink);
    }

    public LandingPage ClickSignUpBtnSuccessfullyLogin(){

        DriverContext.WaitForElementToBeClickable(signupBtn);
        DriverContext.WaitForPageToLoad();
        return GetInstance(LandingPage.class);
    }
}
