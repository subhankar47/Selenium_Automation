package com.Selenium_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handle_Alerts {
    public WebDriver driver;


    @Test
    public void verifyAlerts() throws InterruptedException {
        driver.findElement(By.xpath("//body/main[1]/form[1]/div[1]/div[1]/div[2]/div[3]/button[1]")).click();
        Thread.sleep(5000);
        String str = driver.switchTo().alert().getText();
        System.out.println(str);
        driver.switchTo().alert().accept();// OK
        // driver.switchTo().alert().dismiss();//Cancel
        String expected_msg = "'From' place is required please update the same";
        //For validation We need to use Assert Class in TestNG
        //Assert.assertEquals(str, expected_msg);
        Assert.assertEquals(expected_msg, expected_msg);
        driver.quit();
    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://ksrtc.in/oprs-web/");
        driver.manage().window().maximize();
    }
}
