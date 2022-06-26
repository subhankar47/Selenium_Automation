package com.Selenium_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HMSLoginLogout {
    public WebDriver driver;

    @Parameters({"username", "password"})
    @Test
    public void hmsLoginLogout(String uname, String pwd) {
        driver.findElement(By.name("username")).sendKeys(uname);
        driver.findElement(By.name("password")).sendKeys(pwd);
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.linkText("Logout")).click();
    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.seleniumbymahesh.com/HMS");
        driver.manage().window().maximize();
    }

}
