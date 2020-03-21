package com.automation.warmupTests;

import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://wikipedia.org");
        driver.findElement(By.id("searchInput")).sendKeys("Selenium_(software)", Keys.ENTER);
        String url = driver.getCurrentUrl();
        if (url.endsWith("Selenium_(software)")){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }


    }
}
