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

public class MouseHover {
    public WebDriver driver;

    @Test
    public void Appliances() {
        Actions a = new Actions(driver);
        driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
        WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Appliances')]"));
        a.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'All')]")));
        WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'All')]"));
        a.moveToElement(element1);
        a.click().build().perform();

    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Welcome To Flipkart");
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
    }
}
