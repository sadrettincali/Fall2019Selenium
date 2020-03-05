package com.automation.tests.day3;

import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        // WebDriver driver1= DriverFactory.createADriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.name("full_name")).sendKeys("Mister Twister");
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("sdet@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("wooden_spoon")).click(); //   .submit() -->we use when click does not work
        Thread.sleep(3000);
        String expected= "Thank you for signing up. Click the button below to return to the home page.";
        WebElement message= driver.findElement(By.className("subheader"));
        String actual= message.getText();
        if (expected.equals(actual)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        System.out.println(driver.findElement(By.className("subheader")).getText());




        driver.quit();

    }
}
