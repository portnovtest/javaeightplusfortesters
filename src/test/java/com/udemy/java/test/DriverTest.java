package com.udemy.java.test;

import com.udemy.java.predicate.Rules;
import com.udemy.java.supplier.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class DriverTest {

    private WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser){
        this.driver = DriverFactory.getDriver(browser);
    }

    @Test(enabled = true)
    public void googleTest(){
        this.driver.get("https://google.com");
        List<WebElement> elements = this.driver.findElements(By.tagName("a"));
                //.forEach(e -> System.out.println(e.getText()));
        System.out.println("Before :: " + elements.size());
      //  Rules.get().forEach(rule -> elements.removeIf(rule));
        Rules.get().forEach(elements::removeIf);
        //elements.removeIf(isBlank.or(hasS));
        System.out.println("After :: " + elements.size());
        elements.forEach(e -> System.out.println(e.getText()));
    }

    // do not allow blank links
    // do n ot allow links containing s
    // convert link text to uppercase
    // print on the console
    @Test
    public void googleTestStream(){
        this.driver.get("https://google.com");
        this.driver.findElements(By.tagName("a"))
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                //.peek(i -> System.out.println("link text :: " + i))
                .filter(e -> e.length() > 0)
                .filter(e -> !e.toLowerCase().contains("s"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    @Test
    public void googleTestStreamInstructorSolution(){
        this.driver.get("https://google.com");
        this.driver.findElements(By.tagName("a"))
                .stream()
                .filter(e -> e.getText().trim().length() > 0)
                .filter(e -> !e.getText().toLowerCase().contains("s"))
                .map(e -> e.getText().toUpperCase())
                .forEach(System.out::println);
    }

    @AfterTest
    public void quitDriver(){
        this.driver.quit();
    }
}
