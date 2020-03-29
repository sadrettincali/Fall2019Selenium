package com.automation.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver createDriver(){
            WebDriverManager.chromedriver().version("79.0").setup();
        return new ChromeDriver();
    }
}
