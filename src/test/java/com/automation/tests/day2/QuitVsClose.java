package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/open_new_tab");

        Thread.sleep(3000);
        //driver.close();
        driver.quit();
    }
}
