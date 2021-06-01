package com.PVH.framework.base;

import org.openqa.selenium.WebDriver;

/**
 * Created by Ibi on 31/05/2021.
 */
public class Browser extends Base{

    private WebDriver _driver;

    public Browser(WebDriver driver) {

        _driver = driver;
    }

    public BrowserType Type;
}
