package com.automation.warmupTests;

import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://ebay.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("gh-ac")).sendKeys("java book");
        Thread.sleep(2000);
        driver.findElement(By.id("gh-btn")).click();
        driver.findElement(By.id("w27-follow-follow-faux-btn")).click();
        WebElement searchResult= driver.findElement(By.tagName("h1"));
        System.out.println(searchResult.getText());



    }
}
