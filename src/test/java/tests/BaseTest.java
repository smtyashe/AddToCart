package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.utils.BrowserDriver;
import org.utils.Config;
import org.utils.PropertyLoader;

public abstract class BaseTest  {
    BrowserDriver browserDriver = null;
    Config config = null;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        config = new Config(new PropertyLoader("config.properties").getProperties());
        browserDriver = new BrowserDriver(config);
        browserDriver.getDriver().get(config.getUrl());
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        browserDriver.getDriver().quit();
    }
}
