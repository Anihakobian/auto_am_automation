package com.auto.acceptance.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BasePage {
    private final PageContext pageContext;
    private final WebDriverWait wait;
    public static String BASE_URL = "https://auto.am/";

    public BasePage(PageContext pageContext) {
        this.pageContext = pageContext;
        wait = new WebDriverWait(pageContext.getDriver(), Duration.ofSeconds(30));
        PageFactory.initElements(pageContext.getDriver(), this);
    }

    public  WebDriver webDriver() {
        return pageContext.getDriver();
    }

    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement waitToElementIsClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public List<WebElement> visibilityOf(List<WebElement> element){
        return wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }


    public static int randomNumberGenerator(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }

    public static String replaceAll(String string) {
        return string.replaceAll("\\D+", "");
    }


}
