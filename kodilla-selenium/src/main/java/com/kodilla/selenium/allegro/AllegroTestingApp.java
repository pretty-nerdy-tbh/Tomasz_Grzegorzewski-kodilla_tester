package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/Tomiczek/Documents/Development/Kodilla/chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        Thread.sleep(2000);

        WebElement categoryCombo = driver.findElement(By.xpath("//*[@data-role=\"search-form\"]/select[1]"));
        Select categorySelect = new Select(categoryCombo);
        Thread.sleep(1678);
        categorySelect.selectByValue("Elektronika");

        Thread.sleep(1778);
        WebElement searchElement = driver.findElement(By.xpath("//*[@data-role=\"search-form\"]/input[0]"));
        Thread.sleep(1432);
        searchElement.sendKeys("Mavic mini");
        Thread.sleep(839);
        searchElement.submit();

    }
}
