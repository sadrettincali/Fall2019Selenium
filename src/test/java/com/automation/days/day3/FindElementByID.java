package com.automation.days.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByID {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        Thread.sleep(2000);
        driver.findElement(By.id("wooden_spoon")).click();
        if (driver.findElement(By.tagName("h4")).getText().equals("Welcome to the Secure Area. When you are done click logout below.")){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }
        WebElement logout = driver.findElement(By.partialLinkText("Logout"));
        String href = logout.getAttribute("href");
        System.out.println(href);
        Thread.sleep(3000);
        driver.findElement( By.linkText("Logout")).click();
        Thread.sleep(2000);





        driver.quit();

    }

}
