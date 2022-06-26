package com.Selenium_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class FarameHandle {
    public WebDriver driver;

    @Test
    public void TooptipThemeRoller() {
        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        System.out.println("The total no.of frame is =" + " " + frames.size());
        driver.switchTo().frame(0);
        // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        String str = driver.findElement(By.linkText("Tooltips")).getAttribute("title");
        System.out.println("1st Tooltip" + " " + str);
        String str1 = driver.findElement(By.linkText("ThemeRoller")).getAttribute("title");
        System.out.println("1st Tooltip" + " " + str1);
    }


    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/tooltip/");
        driver.manage().window().maximize();
    }
}