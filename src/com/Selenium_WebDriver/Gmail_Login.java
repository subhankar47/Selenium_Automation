package com.Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {
    public static WebDriver driver;

    public static void Verify_URL() {
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://gmail.com");
        driver.manage().window().maximize();
    }

    public static void Verify_Login() {
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("testingguruji007@gmail.com");
        driver.findElement(By.cssSelector("span.VfPpkd-vQzf8d")).click();
        driver.findElement(By.name("password")).sendKeys("abc@123");
        driver.findElement(By.cssSelector("span.VfPpkd-vQzf8d")).click();
    }

    public static void main(String[] args) {
        Verify_URL();
        Verify_Login();
    }
}
