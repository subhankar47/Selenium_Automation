package com.Selenium_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Example {

    public WebDriver driver;

    @Test(dataProvider = "LoginAuthentication")
    public void HmsLoginLogout(String uname, String pwd) {
        driver.findElement(By.name("username")).sendKeys(uname);
        driver.findElement(By.name("password")).sendKeys(pwd);
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.linkText("Logout")).click();
    }

    @DataProvider(name = "LoginAuthentication")
    @Test()
    public Object[][] Credential() {
        Object[][] data = {{"admin", "admin"}, {"mahesh", "mahesh"}, {"sunny", "vinny"}};
        return data;
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("OpenURL");
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.seleniumbymahesh.com/HMS");
        driver.manage().window().maximize();
    }
}