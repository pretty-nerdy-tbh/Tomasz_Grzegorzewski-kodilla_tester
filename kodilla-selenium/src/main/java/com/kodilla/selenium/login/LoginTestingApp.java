package com.kodilla.selenium.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/Tomiczek/Documents/Development/Kodilla/chromedriver-mac-x64/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://kodilla.com/pl/test/login");

        WebElement emailInputField = driver.findElement(By.xpath("//html/body/section/form/div[1]/input"));
        emailInputField.click();
        emailInputField.sendKeys("test@kodilla.com");

        WebElement passwordInputField = driver.findElement(By.xpath("//html/body/section/form/div[2]/input"));
        passwordInputField.click();
        passwordInputField.sendKeys("kodilla123");
        passwordInputField.submit();


    }
}