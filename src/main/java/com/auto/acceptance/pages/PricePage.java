package com.auto.acceptance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PricePage extends BasePage {
    public static int expectedValue;


    @FindBy(id = "ppialog-popover-cancel-button")
    private WebElement denyCookie;

    @FindBy(id = "search-btn")
    private WebElement searchButton;


    @FindBy(xpath = "//span[@id = 'select2-usdpricegt-gb-container']")
    private WebElement priceSelect;

    @FindBy(className = "blue-text")
    private List<WebElement> elementCount;


    public PricePage(PageContext pageContext) {
        super(pageContext);
    }

    public void denyCookie() {
        denyCookie.click();
    }

    public List<WebElement> carsPrice() {
        return visibilityOf(elementCount);

    }

    public int getCarsPriceList(){
        return carsPrice().size();
    }

    public void getSearchCars() {
        Select price = new Select(webDriver().findElement(By.name("usdprice[gt]")));
        price.selectByValue("100000");
        expectedValue = 100000;
        waitToElementIsClickable(searchButton).click();
    }

}
