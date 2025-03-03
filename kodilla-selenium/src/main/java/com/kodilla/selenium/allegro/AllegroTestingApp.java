package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/Tomiczek/Documents/Development/Kodilla/chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        WebElement cookiesPopUp = driver.findElement(By.cssSelector("body > div > div > div > div > div > div >  button"));
        cookiesPopUp.click();


        WebElement categoryCombo = driver.findElement(By.cssSelector("form > div > div > select"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(4);

        WebElement searchElement = driver.findElement(By.cssSelector("div > form > input"));
        searchElement.sendKeys("Mavic mini");
        searchElement.submit();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article > div")));

        List<WebElement> element = driver.findElements(By.cssSelector("article > div"));
        for (WebElement product : element) {
            System.out.println(product.getText());
        }


    }
}
