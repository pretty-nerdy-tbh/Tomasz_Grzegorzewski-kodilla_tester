package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;

public class OcularExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(chromeOptions);

        Ocular.config()
                .resultPath(Paths.get("/Users/Tomiczek/Documents/Kodilla_bootcamp/results"))
                .snapshotPath(Paths.get("/Users/Tomiczek/Documents/Kodilla_bootcamp/snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);


        WorldTimePage page = new WorldTimePage(webDriver);

        page.open();
        page.compare();
        page.close();

    }
}
