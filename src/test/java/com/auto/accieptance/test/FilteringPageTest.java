package com.auto.accieptance.test;


import com.auto.acceptance.pages.BasePage;
import com.auto.acceptance.pages.FilteringPage;
import com.auto.acceptance.pages.PageContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;


public class FilteringPageTest {


    WebDriver driver = new ChromeDriver();
    PageContext pageContext = new PageContext(driver);
    FilteringPage filteringPage = new FilteringPage(pageContext);
    Assertion softAssert = new SoftAssert();


    @BeforeClass
    public void setUP() {
        filteringPage.webDriver().get(BasePage.BASE_URL);

    }

    @Test
    public void CarBrand() {
        filteringPage.getCarBrand();
        filteringPage.getCarBrandList().get(BasePage.randomNumberGenerator(filteringPage.getCarBrandListSize())).click();
        softAssert.assertTrue(filteringPage.carBrandElement.isSelected());
    }

    @Test
    public void CarModel() {
        filteringPage.getCarModel();
        filteringPage.getCarsModelList().get(BasePage.randomNumberGenerator(filteringPage.getCarModelListSize())).click();
        softAssert.assertTrue(filteringPage.carModelElement.isSelected());
    }

    @Test
    public void CarYearFrom() {
        filteringPage.getCarYearFrom();
        filteringPage.getCarsYearFromList().get(BasePage.randomNumberGenerator(filteringPage.getCarYearFromListSize())).click();
        softAssert.assertTrue(filteringPage.carYearToElement.isSelected());

    }

    @Test
    public void CarYearTo() {
        filteringPage.getCarYearTo();
        filteringPage.getCarsYearToList().get(BasePage.randomNumberGenerator(filteringPage.getCarYearToListSize())).click();
        softAssert.assertTrue(filteringPage.carYearToElement.isSelected());

    }

    @Test
    public void CarPriceFrom() {
        filteringPage.getCarPriceFromList().get(BasePage.randomNumberGenerator(filteringPage.getCarPriceFromListSize())).click();
        softAssert.assertTrue(filteringPage.carPriceFromElement.isSelected());
    }

    @Test
    public void CarPriceTo() {
        filteringPage.getCarPriceToList().get(BasePage.randomNumberGenerator(filteringPage.getCarPriceTolListSize())).click();
        softAssert.assertTrue(filteringPage.carPriceToElement.isSelected());

    }

    @AfterClass
    public void quit() {
        filteringPage.webDriver().quit();
    }
}
