package com.automation.days.day6;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectByText {
    public static void main(String[] args) {

        WebDriver driver = DriverFactory.createDriver();
        BrowserUtils.wait(3);
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement simpleDropdown= driver.findElement(By.id("dropdown"));
        Select selectSimpleDropdown= new Select(simpleDropdown);
        selectSimpleDropdown.selectByVisibleText("Option 2");







        BrowserUtils.wait(3);
        driver.quit();
    }
}
