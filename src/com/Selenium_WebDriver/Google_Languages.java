package com.Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Languages {
    public static WebDriver driver;

    public static void Verify_URL() {
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
    }

    public static void Verify_Clicklinks(String str) {
        driver.findElement(By.xpath(str)).click();
        driver.findElement(By.linkText("English")).click();
    }

    public static void main(String[] args) {
        Verify_URL();
        Verify_Clicklinks("//div[@id='SIvCob']/a[1]");// hindi
        Verify_Clicklinks("//div[@id='SIvCob']/a[2]");// Bengali
        Verify_Clicklinks("//div[@id='SIvCob']/a[3]");// Telugu
        Verify_Clicklinks("//div[@id='SIvCob']/a[8]");// kanada
    }
}
