package utils;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    /*
     * Data can easily be retrieved from an external file through dataprovider
     * For the purpose of this demonstration, a hardcoded test data will be used
     */

    @DataProvider
    public Object[][] searchCriteria() {
        return new Object[][] {
                {"Laptop"},
                {"Phone"},
                {"Bag"}
        };
    }
}
