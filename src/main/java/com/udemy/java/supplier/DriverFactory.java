package com.udemy.java.supplier;

import com.google.common.base.Supplier;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {
    private static final Supplier<WebDriver> chromeSupplier = () -> {
        System.setProperty("webdriver.chrome.driver","/Users/phildolganov/Desktop/Desktop/drivers/chromedriver");
        return new ChromeDriver();
    };

    private static final Supplier<WebDriver> firefoxSupplier = () -> {
        System.setProperty("webdriver.chrome.driver","/Users/phildolganov/Desktop/Desktop/drivers/geckodriver");
        return new FirefoxDriver();
    };

    // JAVA 8 approach
//    private static final Map<String,Supplier<WebDriver>> MAP = new HashMap<>();
//
//    static {
//        MAP.put("chrome", chromeSupplier);
//        MAP.put("firefox", firefoxSupplier);
//    }

    // JAVA 9+ approach w/ immutable map
    private static final Map<String,Supplier<WebDriver>> MAP = Map.of(
            "chrome",chromeSupplier,
            "firefox",firefoxSupplier
    );

    public static WebDriver getDriver(String browser){
        return MAP.get(browser).get();
    }
}
