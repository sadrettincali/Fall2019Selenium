package com.automation.days.day8TestNG;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {
    @Test
    public void Test2(){
        driver.findElement(By.linkText("Radio Buttons")).click();
        BrowserUtils.wait(3);
        driver.findElement(By.id("red")).click();
        BrowserUtils.wait(3);
        Assert.assertTrue(driver.findElement(By.id("red")).isSelected(),"Red radio button is not selected");
    }

    private WebDriver driver;
    @Test
    public void Test1(){
        driver.findElement(By.linkText("Floating Menu")).click();
        BrowserUtils.wait(3);
        Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(),"Floating Menu", "they do not match");

    }




    @BeforeMethod
    public void setupp(){
        driver= DriverFactory.createDriver();
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void ending(){
        driver.quit();
    }
}
