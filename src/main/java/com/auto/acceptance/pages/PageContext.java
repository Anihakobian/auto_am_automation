package com.auto.acceptance.pages;

import org.openqa.selenium.WebDriver;

public class PageContext {
    private WebDriver driver;

    public PageContext(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getDriver() {
        driver.manage().window().maximize();
        return driver;
    }
}
