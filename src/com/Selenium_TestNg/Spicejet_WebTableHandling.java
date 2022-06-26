package com.Selenium_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Spicejet_WebTableHandling {
    public WebDriver driver;

    @Test
    public void Depature() {

        driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']")));
        String str = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']")).getText();
        System.out.println(str);
        String[] s = str.split("\n");
        System.out.println("No. of value in Web table" + " " + s.length);
        for (int i = 0; i < s.length; i++) {
            if (s[i].equalsIgnoreCase("Kempegowda International Airport"))
                System.out.println(s[i]);
            else if (s[i].equalsIgnoreCase("Biju Patnaik International Airport"))
                System.out.println(s[i]);
            else if (s[i].equalsIgnoreCase("Indira Gandhi International Airport"))
                System.out.println(s[i]);
        }
    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
    }
}
