package com.Selenium_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AjaxControlHandling {
    public WebDriver driver;

    @Test
    public void Ajax() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(2000);
        String str = driver.findElement(By.xpath("//div[@class='aajZCb']")).getText();
        System.out.println(str);
        String[] s = str.split("\n");
        System.out.println(s.length);
        for (int i = 0; i < s.length; i++) {
            if (s[i].equalsIgnoreCase("selenium tutorial")) {
                driver.findElement(By.name("q")).clear();
                driver.findElement(By.name("q")).sendKeys(s[i]);
                driver.findElement(By.name("btnK")).click();
            }
        }
    }

    @Parameters("Browser")
    @BeforeTest
    public void beforeTest(String str) {
        if (str.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://google.com");
            driver.manage().window().maximize();
        } else if (str.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "F:\\Library\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get("http://google.com");
            driver.manage().window().maximize();
        }
    }
}