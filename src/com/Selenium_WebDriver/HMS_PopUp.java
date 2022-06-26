package com.Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class HMS_PopUp {
    public static WebDriver driver;

    public static void Verify_URL() {
        System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.seleniumbymahesh.com/");
        driver.manage().window().maximize();
    }

    public static void Verify_Login() throws Exception {
        driver.findElement(By.linkText("HMS")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("submit")).click();
    }

    public static void Verify_Registration() {
        driver.findElement(By.linkText("Registration")).click();
        driver.findElement(By.linkText("Perminent Registration")).click();
    }

    public static void Verify_PR() {
        new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
        new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
        new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
        driver.findElement(By.name("MOTHER_NAME")).sendKeys("Satyabhama jena");
        driver.findElement(By.name("PNT_NAME")).sendKeys("Subhankar");
        new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("AAdhar Card");
        driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("676664487064");
        driver.findElement(By.name("LAST_NAME")).sendKeys("Jena");
        driver.findElement(By.name("DOB")).sendKeys("18-04-1997");
        driver.findElement(By.name("image")).sendKeys("F:\\IMG_20200105_172549.jpg");
    }

    public static void Verify_PopUp() {
        driver.findElement(By.linkText("Feedback")).click();
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);
        Object[] s = windows.toArray();
        driver.switchTo().window(s[1].toString());
        driver.findElement(By.id("name")).sendKeys("subhankaerjena");
        driver.findElement(By.id("email")).sendKeys("subhankarjena14@gmail.com");
        driver.findElement(By.name("radio")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("F:\\IMG_20200105_172549.jpg");
        driver.findElement(By.id("message")).sendKeys("welcome to HMS");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("close")).click();
        driver.switchTo().window(s[0].toString());
        driver.findElement(By.name("ADDRESS1")).sendKeys("Odisha");
    }

    public static void main(String[] args) throws Exception {
        Verify_URL();
        Verify_Login();
        Verify_Registration();
        Verify_PR();
        Verify_PopUp();
    }
}
