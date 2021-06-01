package com.PVH.Test.pages;

import com.PVH.framework.base.BasePage;
import com.PVH.framework.base.DriverContext;
import com.PVH.framework.base.LocalDriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by Ibi on 31/05/2021.
 */
public class MyAccountPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//*[starts-with(@class, 'overview__item-title')]")//Adresboek
    private WebElement address;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@class, 'newsletter__close button--close')]")
    private WebElement close;

    @FindBy(how = How.XPATH, using = "//a[starts-with(@href, '/')]")
    private WebElement tommyHilfigerTitle;



    public AddressPage ClickAddress(){

        DriverContext.ScrollByPage();
        DriverContext.MouseHover(tommyHilfigerTitle);

        List<WebElement> List = LocalDriverContext.getRemoteWebDriver().findElements(By.xpath("//*[starts-with(@class, 'overview__item-title')]"));

        //DriverContext.WaitForElementToBeClickable(address);
        DriverContext.WaitForElementToBeClickable(List.get(2));
        DriverContext.WaitForPageToLoad();
        return GetInstance(AddressPage.class);
    }

    public void ClickToCancelAdd(){

        DriverContext.WaitForElementToBeClickable(close);
    }
}
