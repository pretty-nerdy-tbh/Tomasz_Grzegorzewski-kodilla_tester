package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StoreSearchPomApplication {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");

        StoreSearchPom searchPom = new StoreSearchPom(driver);
        searchPom.cookiePopUpClicker();
        searchPom.searchByPhrase("NoteBook");

        int count = searchPom.searchResultsCounter();
        System.out.println("There are " + count + " with that parameters");

        driver.close();
    }
}
