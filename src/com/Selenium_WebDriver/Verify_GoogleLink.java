package com.Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_GoogleLink {
    public static WebDriver driver;

    public static void Verify_URL() {
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
    }

    public static void Verify_GoogleSearch() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("h3.LC20lb.DKV0Md")).click();
    }

    public static void main(String[] args) throws InterruptedException {
        Verify_URL();
        Verify_GoogleSearch();
    }
}
