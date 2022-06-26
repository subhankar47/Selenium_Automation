package com.Selenium_TestNg;

import org.testng.annotations.Test;

public class InvocationCount {

    @Test(invocationCount = 6, threadPoolSize = 3)
    public void Test001() {
        System.out.println("I am in Test001_Thread ID=" + Thread.currentThread().getId());
    }

}
