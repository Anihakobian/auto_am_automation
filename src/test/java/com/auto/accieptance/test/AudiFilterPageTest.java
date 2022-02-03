package com.auto.accieptance.test;

import com.auto.acceptance.pages.AudiFilterPage;
import com.auto.acceptance.pages.BasePage;
import com.auto.acceptance.pages.PageContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AudiFilterPageTest {

    WebDriver driver = new ChromeDriver();
    PageContext pageContext = new PageContext(driver);
    AudiFilterPage audiFilterPage = new AudiFilterPage(pageContext);
    private static int size;
    private static int audiCount;
    private static int searchValueParsing;


    @BeforeClass
    public void setUP() {
        audiFilterPage.webDriver().get(BasePage.BASE_URL);
    }


    @Test(priority = 1)
    public void audiFiltering() {
        audiFilterPage.getCarBrand();
        audiFilterPage.getAudi();

    }

    @Test(priority = 2)
    public void getAudiCarsCount() {
        audiFilterPage.searchAudiCars();
        searchValueParsing = Integer.parseInt(BasePage.replaceAll(audiFilterPage.getTheCountOfButton()));
        size = audiFilterPage.getElementCountSize() * audiFilterPage.getPageCountSize();
    }

    @Test(priority = 3)
    public void getLastPage() {
        audiFilterPage.getLastPage();
        BasePage.sleep();
        audiCount = size + audiFilterPage.getLastPageCarsSize();


    }

    @Test(priority = 4)
    public void audiFilteringPageAssertion() {
        Assert.assertEquals(audiCount, searchValueParsing);
    }


    @AfterTest
    public void quit() {
        audiFilterPage.webDriver().quit();
    }

}
