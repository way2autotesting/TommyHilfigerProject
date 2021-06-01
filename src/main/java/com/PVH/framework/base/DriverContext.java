package com.PVH.framework.base;

import com.PVH.framework.config.Settings;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.ui.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ibi on 31/05/2021.
 */
public class DriverContext {

    private static Select select;

    public static void GoToUrl(String url) {

        LocalDriverContext.getRemoteWebDriver().get(url);
    }

    public static void Maximize() {

        LocalDriverContext.getRemoteWebDriver().manage().window().maximize();
    }

    public static void ImplicitlyWait() {

        LocalDriverContext.getRemoteWebDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    public static void WaitForPageToLoad() {

        //todo: replace "Driver" to "LocalDriverContext.getRemoteWebDriver()" and replace "WebDriverWait" to var
        WebDriverWait wait = new WebDriverWait(LocalDriverContext.getRemoteWebDriver(), 60);
        JavascriptExecutor jsExecutor = LocalDriverContext.getRemoteWebDriver();

        ExpectedCondition<Boolean> jsLoad = webDriver -> LocalDriverContext.getRemoteWebDriver()
                .executeScript("return document.readyState").toString().equals("complete"); //ToDo: Tp check if page is fully loaded

        //Get JS Ready
        boolean jsReady = jsExecutor.executeScript("return document.readyState").toString().equals("complete");

        if (!jsReady)
            wait.until(jsLoad);
        else
            Settings.logs.Write("Page is ready !");
    }

    public static void MouseHover(WebElement ele) {

        Actions action = new Actions(LocalDriverContext.getRemoteWebDriver());
        action.moveToElement(ele).perform();
    }

    public static void enterTextbox(WebElement webElement, String string) {
        try {
            WebDriverWait wait = new WebDriverWait(LocalDriverContext.getRemoteWebDriver(), 15);
            wait.until(ExpectedConditions.visibilityOf(webElement));
            webElement.clear();
            webElement.sendKeys(string);
        } catch (Exception t) {
            System.out.println("unable to enterText on the element using enterText(WebElement webElement,String string) : " + webElement);
            throw t;
        }
    }

    public static void WaitForElementToBeClickable(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(LocalDriverContext.getRemoteWebDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        WaitForPageToLoad();
        Settings.logs.Write("Wait for element to be clickable");
    }

    public static boolean CheckSectionsExist(List<String> table) {
        String source = LocalDriverContext.getRemoteWebDriver().getPageSource();
        for (String section : table) {
            if (!source.contains(section))
                return false;
        }
        return true;
    }

    public static void SelectElement(WebElement locator, int index) {
        select = new Select(locator);
        select.selectByIndex(index);
        Settings.logs.Write("select index " + index + " from dropdown");
    }

    public static void SelectElement(WebElement locator, String visibletext) {
        select = new Select(locator);
        select.selectByVisibleText(visibletext);
        Settings.logs.Write("select " + visibletext + " from dropdown");
    }

    public static String getSelectElementText(WebElement locator) {
        Select selectDropdown = new Select(locator);
        String selectedOption = selectDropdown.getFirstSelectedOption().getAttribute("value");
        Settings.logs.Write("selected option " + selectedOption + " from dropdown");
        return selectedOption;
    }

    public static void ScrollByPage(){

        JavascriptExecutor js = (JavascriptExecutor) LocalDriverContext.getRemoteWebDriver();
        js.executeScript("window.scrollBy(0,250)", "");
    }




}
