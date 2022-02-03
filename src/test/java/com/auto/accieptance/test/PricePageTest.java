package com.auto.accieptance.test;


import com.auto.acceptance.pages.BasePage;
import com.auto.acceptance.pages.PricePage;
import org.testng.Assert;
import org.testng.annotations.*;
import com.auto.acceptance.pages.PageContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class PricePageTest {
    WebDriver driver = new ChromeDriver();
    PageContext pageContext = new PageContext(driver);
    PricePage pricePage = new PricePage(pageContext);
    private static int valueParsing;
    private static String carValue;


    @BeforeClass
    public void setUp() {
        pricePage.webDriver().get(BasePage.BASE_URL);
    }

    @Test
    public void priceFilter() {
        pricePage.getSearchCars();
        for (int i = 0; i < pricePage.getCarsPriceList(); i++) {
            carValue = pricePage.carsPrice().get(i).getText();
            valueParsing = Integer.parseInt(BasePage.replaceAll(carValue));
            Assert.assertTrue(valueParsing >= pricePage.expectedValue);


        }

    }

    @AfterTest
    public void quit() {
        pricePage.webDriver().quit();
    }


}

