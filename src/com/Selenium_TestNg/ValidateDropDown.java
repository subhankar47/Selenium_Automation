package com.Selenium_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ValidateDropDown {
    public WebDriver driver;


    @Test
    public void Dropdown() {
        List<WebElement> value = new Select(driver.findElement(By.id("mothertongue"))).getOptions();
        System.out.println("No.of values in dropdown =" + " " + value.size());
        for (int i = 1; i < value.size(); i++) {
            //System.out.println(value.get(i).getText());
          /*  if (value.get(i).getText().equalsIgnoreCase("Oriya")) {
                System.out.println(value.get(i).getText());
            }*/
            if (value.get(i).getText().equalsIgnoreCase("Hindi")) {
                System.out.println(value.get(i).getText());
            }
        }
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("OpenURL");
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.kalyanmatrimony.com/");
        driver.manage().window().maximize();
    }
}
