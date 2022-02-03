package com.auto.acceptance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;


public class AudiFilterPage extends BasePage {
    public String getSearchValue;

    @FindBy(xpath = "//label[@for='make']")
    private WebElement carBrand;

    @FindBy(xpath = "//option[text()='Audi']")
    private WebElement audi;

    @FindBy(id = "search-btn")
    private WebElement searchButton;

    @FindBy(id = "research-btn")
    private WebElement researchButton;

    @FindBy(xpath = "//*[@id='search-cont']/div[4]/ul/li[7]/a")
    private WebElement lastPage;

    @FindBy(className = "blue-text")
    private List<WebElement> elementCount;

    @FindBy(xpath = "//ul[@class='pagination center']//li[contains(@class, '')]")
    private List<WebElement> pageCount;

    public AudiFilterPage(PageContext pageContext) {
        super(pageContext);
    }

    public void getCarBrand() {
        waitToElementIsClickable(carBrand).click();
    }

    public void getAudi() {
        waitToElementIsClickable(audi).click();
    }

    public void getLastPage() {
        waitToElementIsClickable(lastPage).click();

    }

    public void searchAudiCars() {
        waitToElementIsClickable(searchButton).click();
    }

    public List<WebElement> getElementCount() {
        return visibilityOf(elementCount);
    }

    public int getElementCountSize() {
        return getElementCount().size();
    }

    public List<WebElement> getPageCount() {
        return visibilityOf(pageCount);
    }

    public int getPageCountSize() {
        return getPageCount().size();
    }

    public List<WebElement> getLastPageCount() {
        return visibilityOf(elementCount);
    }

    public int getLastPageCarsSize() {
        return getLastPageCount().size();
    }

    public String getTheCountOfButton() {
        return (waitToElementIsClickable(researchButton)).getText();
    }


}
