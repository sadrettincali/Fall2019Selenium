package com.automation.zdays.day12;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Table_FindNames {
    WebDriver driver;


    @Test
    public void Test1(){
        driver.findElement(By.xpath("//*[@id=\"table1\"]/thead/tr/th[1]")).click();
        List <WebElement> elements= driver.findElements(By.xpath("//table[1]//td[1]"));
        List<String> lNames= new ArrayList<>();

        for (WebElement name : elements) {
            lNames.add(name.getText());
        }
        System.out.println(lNames);
    }



    @BeforeMethod
    public void Setup(){
        driver= DriverFactory.createDriver();
        driver.get("http://practice.cybertekschool.com/tables");
        driver.manage().window().maximize();
        BrowserUtils.wait(2);
    }


    @AfterMethod
    public void Closed(){
        driver.quit();
    }
}


