package com.Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMS_Login_Logout {
    public static WebDriver driver;

    public static void Verify_URL() {
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.seleniumbymahesh.com/");
        driver.manage().window().maximize();
    }

    public static void verifyLogin() throws Exception {
        driver.findElement(By.linkText("HMS")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("submit")).click();
    }

    public static void verifyLogout() {
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }

    public static void main(String[] args) throws Exception {
        Verify_URL();
        verifyLogin();
        verifyLogout();
    }
}