package com.kodilla.selenium.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

class StoreSearchPomTest {
    StoreSearchPom searchPom;

    WebDriver driver;

    @BeforeEach
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        searchPom = new StoreSearchPom(driver);
    }

    @Test
    public void testSearch_CheckPositiveValidation() {
        searchPom.cookiePopUpClicker();
        searchPom.searchByPhrase("Powerful");
        int count = searchPom.searchResultsCounter();
        assertEquals(0, count);
    }

    @Test
    public void testNoCaseSensitivity_CheckPositiveValidation() {
        searchPom.cookiePopUpClicker();

        searchPom.searchByPhrase("notebook");
        int lowerCase = searchPom.searchResultsCounter();

        searchPom.clearSearchBox();

        searchPom.searchByPhrase("NoteBook");
        int upperCase = searchPom.searchResultsCounter();

        assertEquals(lowerCase, upperCase);
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }
}