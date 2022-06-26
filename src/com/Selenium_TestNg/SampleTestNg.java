package com.Selenium_TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNg {
    @Test
    public void sunny() {
        System.out.println("sunny");
        System.out.println("I am inside Sunny Method | " + Thread.currentThread().getId());
    }

    @Test
    public void bunny() {
        System.out.println("bunny");
        System.out.println("I am inside Bunny Method | "+Thread.currentThread().getId());
    }

    @Test
    public void Vinny() {
        System.out.println("vinny");
        System.out.println("I am inside Vinny Method | "+Thread.currentThread().getId());
    }

    @BeforeTest//Pre-condition
    public void beforeTest() {
        System.out.println("beforeTest");
        System.out.println("I am inside Before Method | "+Thread.currentThread().getId());
    }

    @AfterTest//Post-condition
    public void afterTest() {
        System.out.println("afterTest");
        System.out.println("I am inside After Method | "+Thread.currentThread().getId());
    }

}

