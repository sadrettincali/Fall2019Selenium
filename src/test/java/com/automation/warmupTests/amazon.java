package com.automation.warmupTests;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class amazon {
    public static void main(String[] args) {
        WebDriver driver= DriverFactory.createADriver("chrome");
        driver.get("http://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book", Keys.ENTER);
       if (driver.getTitle().contains("java book")){
           System.out.println("Test PASSED");
       }else{
           System.out.println("Test FAILED");
       }
    }
}
