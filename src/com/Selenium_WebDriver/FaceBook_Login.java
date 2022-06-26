package com.Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Login {
    public static WebDriver driver;

    public static void Verify_URL() {
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    public static void Verify_Login() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8895315748");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcdefgh");
        driver.findElement(By.xpath("//button[@name='login']")).click();
    }

    public static void main(String[] args) {
        Verify_URL();
        Verify_Login();
    }
}