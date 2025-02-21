package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/Tomiczek/Documents/Development/Kodilla/chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");

        WebElement inputField = driver.findElement(By.name("_nkw"));
        inputField.click();
        inputField.sendKeys("laptop");
        inputField.submit();
    }
}
