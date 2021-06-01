package com.PVH.Test.pages;

import com.PVH.framework.base.BasePage;
import com.PVH.framework.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ibi on 31/05/2021.
 */
public class AddressPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//*[starts-with(@data-testid, 'address-add-button')]")
    private WebElement createNewAddress;

    @FindBy(how = How.ID, using = "firstName")
    private WebElement fName;

    @FindBy(how = How.ID, using = "lastName")
    private WebElement lName;

    @FindBy(how = How.ID, using = "address1")
    private WebElement street;

    @FindBy(how = How.ID, using = "address2")
    private WebElement houseN;

    @FindBy(how = How.ID, using = "city")
    private WebElement cityPlace;

    @FindBy(how = How.ID, using = "zipCode")//1111 AB
    private WebElement postcode;

    @FindBy(how = How.ID, using = "phone1")
    private WebElement phoneN;

    @FindBy(how = How.ID, using = "country")
    private WebElement country;

    @FindBy(how = How.XPATH, using = "//*[contains(text(), 'Opslaan')]")
    private WebElement saveButton;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@data-testid, 'address-update-button')]")
    private WebElement updatingButton;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@data-testid, 'address-delete-button')]")
    private WebElement deleteCurrentAddress;





    public void ClickNewAddress(){

        DriverContext.WaitForElementToBeClickable(createNewAddress);
    }

    public boolean IsAddNewAddressBtnPresent(){

        DriverContext.MouseHover(createNewAddress);
        return createNewAddress.isDisplayed();
    }

    public void SelectCountry(String countryN){

        DriverContext.SelectElement(country,countryN);
    }

    public void FillFormAs(String firstN,String lastN, String streetN, String houseNumber, String place, String pCode, String phone){

        DriverContext.enterTextbox(fName,firstN);
        DriverContext.enterTextbox(lName,lastN);
        DriverContext.enterTextbox(street,streetN);
        DriverContext.enterTextbox(houseN,houseNumber);
        DriverContext.enterTextbox(cityPlace,place);
        DriverContext.enterTextbox(postcode,pCode);
        DriverContext.enterTextbox(phoneN,phone);
    }

    public void ClickSaveButton(){

        DriverContext.ScrollByPage();
        DriverContext.ScrollByPage();
        DriverContext.WaitForElementToBeClickable(saveButton);
    }

    public void UpdatingAddress(){

        DriverContext.WaitForElementToBeClickable(updatingButton);
    }

    public void DeleteTheCurrentAddress(){

        DriverContext.WaitForElementToBeClickable(deleteCurrentAddress);
    }
}
