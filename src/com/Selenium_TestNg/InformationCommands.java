package com.Selenium_TestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InformationCommands {
    public WebDriver driver;

    @Test
    public void readValue() {
        //<input................>Text<input...........................>
        String str = driver.findElement(By.linkText("Gmail")).getText();
        System.out.println(str);
        //<input..............Text..................><input...........................>
        String str1 = driver.findElement(By.name("btnI")).getAttribute("aria-label");
        System.out.println(str1);
        driver.navigate().to("https://www.ixigo.com/");
        //driver.get("https://www.ixigo.com/");
        String str2 = driver.findElement(By.className("ixigo-logo")).getAttribute("title");
        System.out.println(str2);
    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();

    }

}
