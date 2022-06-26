package com.Selenium_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class PrintLinks {
    public WebDriver driver;

    @Test
    public void PrintLink() throws InterruptedException {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int count = 0;
        System.out.println("No.of total links are =" + " " + links.size());
        for (int i = 0; i < links.size(); i++) {
            if (!links.get(i).getText().isEmpty()) {
                System.out.println(links.get(i).getText());// if it is an array then i write str[i]
                Thread.sleep(1000);
                count++;
            }
        }
        System.out.println("No.of visible links are" + " " + count);
    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
    }
}
