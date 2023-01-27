package org.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    private WebDriver driver;
    private final String driverPath = System.getProperty("user.dir") + "/src/main/java/org/webdrivers";
    private final Config config;

    public BrowserDriver(Config config) {
        this.config = config;
        setupBrowser();
    }

    void setupBrowser() {
        if(config.getBrowser().equalsIgnoreCase("chrome")) {
            String chromeDriver = driverPath + "/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromeDriver);

            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");

            driver = new ChromeDriver(options);
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Config getConfig() {
        return config;
    }
}
