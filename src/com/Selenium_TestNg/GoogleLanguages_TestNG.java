package com.Selenium_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.Selenium_WebDriver.Google_Languages.driver;

public class GoogleLanguages_TestNG {

    public WebDriver driver;

    public void clickLinks(String str) {
        driver.findElement(By.xpath(str)).click();
        driver.findElement(By.linkText("English")).click();
    }

    @Test
    public void googleLanguages() {
        clickLinks("//div[@id='SIvCob']/a[1]");// hindi
        clickLinks("//div[@id='SIvCob']/a[2]");// Bengali
        clickLinks("//div[@id='SIvCob']/a[3]");// Telugu
        clickLinks("//div[@id='SIvCob']/a[8]");// kanada

    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
    }
}
