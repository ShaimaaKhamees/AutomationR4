package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    public static void main(String[] args) {
        //  WebDriver driver = new ChromeDriver();

        String browser = "chrome";
        WebDriver driver;
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("un supported browser " + browser);
        }
        driver.navigate().to("https://www.selenium.dev/documentation/webdriver/getting_started/first_script/");

    }
}

