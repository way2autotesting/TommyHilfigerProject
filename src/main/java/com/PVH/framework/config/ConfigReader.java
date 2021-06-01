package com.PVH.framework.config;


import com.PVH.framework.base.BrowserType;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Ibi on 31/05/2021.
 */
public class ConfigReader {

    public static  void PopulateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }



    private void ReadProperty() throws IOException {
        //Create Property Object
        Properties p = new Properties();
        //Load the Property file available in same package
        InputStream inputStream = new FileInputStream("src/main/java/com/PVH/framework/config/GlobalConfig.properties");
        p.load(inputStream);
        //Get LogPath
        Settings.LogPath = p.getProperty("LogPath");
        //Get AUT
        Settings.AUT = p.getProperty("AUT");
        //Browser Type
        Settings.BrowserType = BrowserType.valueOf(p.getProperty("BrowserType"));
        //Navigation
        Settings.FreeCarCheck = (p.getProperty("FreeCarCheck"));
    }
}
