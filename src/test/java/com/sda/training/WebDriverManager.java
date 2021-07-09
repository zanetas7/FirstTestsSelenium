package com.sda.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {

    public static WebDriver DRIVER;

    public static void startDriver() {
        switch (getDriverName().toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
                DRIVER = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
                DRIVER = new FirefoxDriver();
                break;
            default:
                throw new IllegalStateException("UNSUPPORTED BROWSER !!!!!!!!!!");
        }
    }

    public static void destroyDriver() {
        DRIVER.quit();
    }

    private static String getDriverName() {
        return System.getProperty("browserName", "chrome");
    }


}