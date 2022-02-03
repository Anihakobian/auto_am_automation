package com.auto.acceptance.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class FilteringPage extends BasePage {


    @FindBy(id = "ppialog-popover-cancel-button")
    private WebElement denyCookie;

    @FindBy(xpath = "//label[@for='make']")
    private WebElement carBrand;

    @FindBy(xpath = "//span[@id='select2-v-model-container']")
    private WebElement carModel;

    @FindBy(xpath = "//span[contains(@id, 'select2-yeargt')]")
    private WebElement carYearFrom;

    @FindBy(xpath = "//span[contains(@id, 'select2-yearlt')]")
    private WebElement carYearTo;

    @FindBy(xpath = "//span[contains(@id, 'select2-usdpricegt-2y-container')]")
    private WebElement carPriceFrom;

    @FindBy(xpath = "//span[contains(@id, 'select2-usdpricelt-ll-container')]")
    private WebElement carPriceTo;

    @FindBy(id = "select2-filter-make-container")
    public WebElement carBrandElement;

    @FindBy(id = "v-model")
    public WebElement carModelElement;

    @FindBy(name = "year[gt]")
    public WebElement carYearFromElement;

    @FindBy(name = "year[lt]")
    public WebElement carYearToElement;

    @FindBy(name = "usdprice[gt]")
    public WebElement carPriceFromElement;

    @FindBy(name = "usdprice[lt]")
    public WebElement carPriceToElement;

    @FindBy(xpath = "//ul[@class='select2-results__options']//li[contains(@id, 'select2-filter-make-result')]")
    private List<WebElement> carsBrand;

    @FindBy(xpath = "//ul[@class='select2-results__options']//li[contains(@id, 'select2-v-model-result')]")
    private List<WebElement> carsModel;

    @FindBy(xpath = "//select[@name= 'year[gt]']//option[contains(@option, '')]")
    private List<WebElement> carsYearFromList;

    @FindBy(xpath = "//select[@name= 'year[lt]']//option[contains(@option, '')]")
    private List<WebElement> carsYearToList;

    @FindBy(xpath = "//select[@name= 'usdprice[gt]']//option[contains(@option, '')]")
    private List<WebElement> carPriceFromList;

    @FindBy(xpath = "//select[@name= 'usdprice[lt]']//option[contains(@option, '')]")
    private List<WebElement> carPriceToList;


    public FilteringPage(PageContext pageContext) {
        super(pageContext);
    }

    public List<WebElement> getCarBrandList() {
        return visibilityOf(carsBrand);
    }

    public int getCarBrandListSize() {
        return getCarBrandList().size();
    }

    public List<WebElement> getCarsModelList() {
        return visibilityOf(carsModel);
    }
    public int getCarModelListSize() {
        return getCarsModelList().size();
    }

    public List<WebElement> getCarsYearFromList() {
        return visibilityOf(carsYearFromList);
    }

    public int getCarYearFromListSize() {
        return getCarsYearFromList().size();
    }

    public List<WebElement> getCarsYearToList() {
        return visibilityOf(carsYearToList);
    }

    public int getCarYearToListSize() {
        return getCarsYearToList().size();
    }

    public List<WebElement> getCarPriceFromList() {
        return visibilityOf(carPriceFromList);
    }

    public int getCarPriceFromListSize() {
        return getCarPriceFromList().size();
    }

    public List<WebElement> getCarPriceToList() {
        return visibilityOf(carPriceToList);
    }

    public int getCarPriceTolListSize() {
        return getCarPriceFromList().size();
    }

    public void denyCookie() {
        denyCookie.click();
    }

    public void getCarYearFrom() {
        carYearFrom.click();
    }

    public void getCarYearTo() {
        carYearTo.click();
    }

    public void getCarBrand() {
        waitToElementIsClickable(carBrand).click();
    }

    public void getCarModel() {
        waitToElementIsClickable(carModel).click();
    }


}
