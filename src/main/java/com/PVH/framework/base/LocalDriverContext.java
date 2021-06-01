package com.PVH.framework.base;

import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by Ibi on 31/05/2021.
 */
public class LocalDriverContext {

    private static ThreadLocal<RemoteWebDriver> remoteWebDriverThreadLocal = new ThreadLocal<>();

    public static RemoteWebDriver getRemoteWebDriver() {

        return remoteWebDriverThreadLocal.get();
    }

    static void setRemoteWebDriverThreadLocal(RemoteWebDriver driverThreadLocal) {

        remoteWebDriverThreadLocal.set(driverThreadLocal);
    }
}
