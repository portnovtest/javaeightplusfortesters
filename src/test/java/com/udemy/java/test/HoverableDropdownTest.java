package com.udemy.java.test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.udemy.java.supplier.DriverFactory;
import com.udemy.java.util.LinkUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class HoverableDropdownTest {
    private WebDriver driver;
    private Actions actions;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser){
        this.driver = DriverFactory.getDriver(browser);
        this.actions = new Actions(driver);
    }


    @Test(dataProvider = "linkProvider")
    public void dropdownTest(String path){
        this.driver.get("https://www.bootply.com/render/6FC76YQ4Nh#");
        //Java 10+
        //String[] split = path.split("=>");
        var split = path.split("=>");

        Arrays.stream(split)
                .map(String::trim)
                .map(By::linkText)
                .map(by -> driver.findElement(by))
                .map(ele -> actions.moveToElement(ele))
                .forEach(Actions::perform);

        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);

    }

    @DataProvider(name = "linkProvider")
    public Object[] testData(){

        return new Object[]{
                "Dropdown => Dropdown Link 2",
                "Dropdown => Dropdown Link 5 => Dropdown Submenu Link 5.1",
                "Dropdown => Dropdown Link 5 => Dropdown Submenu Link 5.4 => Dropdown Submenu Link 5.4.2",
        };
    }

    @AfterTest
    public void quitDriver(){
        this.driver.quit();
    }
}
