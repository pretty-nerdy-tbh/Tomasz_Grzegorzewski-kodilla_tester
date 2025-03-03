package com.kodilla.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class StoreSearchPom extends AbstractPom{

    @FindBy(css = "div > input")
    WebElement searchBox;

    @FindBy(css = ".cookies-submit")
    WebElement cookiePopUp;

    public StoreSearchPom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void searchByPhrase(String phrase){
        searchBox.click();
        searchBox.sendKeys(phrase);
    }

    public void cookiePopUpClicker(){
        cookiePopUp.click();
    }

    public int searchResultsCounter(){
        List<WebElement> element = driver.findElements(By.cssSelector("div > .element"));
        return element.size();
    }

    public void clearSearchBox(){
        searchBox.clear();
    }
}
