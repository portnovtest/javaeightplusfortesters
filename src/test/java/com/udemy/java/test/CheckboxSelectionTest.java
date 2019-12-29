package com.udemy.java.test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.udemy.java.pages.TableDemoPage;
import com.udemy.java.supplier.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

public class CheckboxSelectionTest {
    private WebDriver driver;
    private TableDemoPage tableDemoPage;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser){
        this.driver = DriverFactory.getDriver(browser);
        this.tableDemoPage = new TableDemoPage(driver);
    }

    @Test(dataProvider = "criteriaProvider")
    public void tableRowTest(Predicate<List<WebElement>> searchCriteria){
        tableDemoPage.goTo();
//        tableDemoPage.selectRows(SearchCriteriaFactory.getCriteria("allMale"));
        tableDemoPage.selectRows(searchCriteria);
//        this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table-1.html");
//        this.driver.findElements(By.tagName("tr")) // rows
//                .stream()
//                .skip(1)
//                .map(tr -> tr.findElements(By.tagName("td"))) // td list
//                .filter(tdList -> tdList.size() == 4)
//                .filter(tdList -> tdList.get(1).getText().equalsIgnoreCase(gender)) // gender check
//                .map(tdList -> tdList.get(3)) // td containing checkbox
//                .map(td -> td.findElement(By.tagName("input")))
//                .forEach(WebElement::click);

        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
    }

    @DataProvider(name = "criteriaProvider")
    public Object[] testData(){

        return new Object[]{
                SearchCriteriaFactory.getCriteria("allMale"),
                SearchCriteriaFactory.getCriteria("allFemale"),
                SearchCriteriaFactory.getCriteria("allGender"),
                SearchCriteriaFactory.getCriteria("allAU"),
                SearchCriteriaFactory.getCriteria("allFemaleAU")
        };
    }


    @AfterTest
    public void quitDriver(){
        this.driver.quit();
    }
}
