package com.Selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Verify_All_Browser {

    public static WebDriver driver;

    public static void Chrome() {
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
    }

    public static void Firefox() {
        System.setProperty("webdriver.gecko.driver", "F:\\Library\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://amazon.com/");
        driver.manage().window().maximize();
        driver.quit();
    }

    public static void Ie() {
        System.setProperty("webdriver.ie.driver", "F:\\Library\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.get("http://www.seleniumbymahesh.com/");
        driver.manage().window().maximize();
        driver.quit();
    }

    public static void main(String[] args) {
        Chrome();
        Firefox();
        Ie();
    }
}
