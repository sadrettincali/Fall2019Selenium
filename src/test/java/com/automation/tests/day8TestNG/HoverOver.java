package com.automation.tests.day8TestNG;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {
    public static void main(String[] args) {
        WebDriver driver= DriverFactory.createADriver();
        driver.get("http://practice.cybertekschool.com/jqueryui/menu#");

        Actions action= new Actions(driver);

    }
}
