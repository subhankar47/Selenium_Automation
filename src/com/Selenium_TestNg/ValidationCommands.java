package com.Selenium_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidationCommands {
    public WebDriver driver;

    @Test
    public void VC() {
        if (driver.findElement(By.name("username")).isDisplayed()) {
            System.out.println("username is enabled");
            driver.findElement(By.name("username")).sendKeys("admin");
        } else {
            System.out.println("username is not enabled");
        }
        if (driver.findElement(By.name("submit")).isEnabled()) {
            System.out.println("login is enabled");
        } else {
            System.out.println("login is not enabled");
        }
        driver.navigate().to("https://www.spicejet.com/");
        if (driver.findElement(By.xpath("//div[contains(text(),'round trip')]")).isSelected()) {
            System.out.println("one way radio button is selected");
        } else {
            System.out.println("one way radio button is not selected'");
        }
    }


    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.seleniumbymahesh.com/HMS");
        driver.manage().window().maximize();
    }
}
