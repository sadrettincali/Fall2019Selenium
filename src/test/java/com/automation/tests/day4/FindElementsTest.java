package com.automation.tests.day4;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;

public class FindElementsTest {
    public static void main(String[] args) {

        WebDriver driver= DriverFactory.createADriver("chrome");

        driver.get("http://practice.cybertekschool.com/");
    }
}
