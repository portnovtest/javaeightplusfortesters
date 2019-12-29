package com.udemy.java.test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.udemy.java.pages.PriceTablePage;
import com.udemy.java.pages.TableDemoPage;
import com.udemy.java.supplier.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MinPriceTest {
    private WebDriver driver;


    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser){
        this.driver = DriverFactory.getDriver(browser);
    }

    @Test
    public void minPriceTest(){
        PriceTablePage p = new PriceTablePage(driver);
        p.selectMinPriceRows();
        String status = p.getStatus();

        Assert.assertEquals("PASS", status);

        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }

    @AfterTest
    public void quitDriver(){
        this.driver.quit();
    }
}
