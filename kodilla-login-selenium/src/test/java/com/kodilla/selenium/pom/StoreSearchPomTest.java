package com.kodilla.selenium.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
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

    @ParameterizedTest
    @CsvSource(value = {"2,NoteBook", "1,School", "1,Brand", "1,Bussines", "1,Gaming", "0,Powerful"})
    public void testSearch_CheckPositiveValidation(int searchCount, String searchPhrase) {
        searchPom.cookiePopUpClicker();
        searchPom.searchByPhrase(searchPhrase);
        int count = searchPom.searchResultsCounter();
        assertEquals(searchCount, count);
    }

    @ParameterizedTest
    @CsvSource(value = {"notebook,NoteBook", "school,School", "brand,Brand", "bussines,Bussines", "gaming,Gaming", "powerful,Powerful"})
    public void testNoCaseSensitivity_CheckPositiveValidation(String lowerCasePhrase, String upperCasePhrase) {
        searchPom.cookiePopUpClicker();

        searchPom.searchByPhrase(lowerCasePhrase);
        int lowerCaseCount = searchPom.searchResultsCounter();

        searchPom.clearSearchBox();

        searchPom.searchByPhrase(upperCasePhrase);
        int upperCaseCount = searchPom.searchResultsCounter();

        assertEquals(lowerCaseCount, upperCaseCount);
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }
}