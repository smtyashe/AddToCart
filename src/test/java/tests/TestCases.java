package tests;

import org.page.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends BaseTest {
    SearchResultsPage result = null;

    @Test
    public void addItemToCartTest(){

        String searchCriteria = "laptop";
        result = new SearchResultsPage(browserDriver.getDriver());
        result.SearchCriteria(searchCriteria);
        result.addProductToCart();

        Assert.assertEquals(result.isQtyMoreThanZero(),1);

    }

    @Test
    public void viewCartContents(){

        result.viewProducInoCart();

        Assert.assertEquals(result.isQtyMoreThanZero(),1);
        Assert.assertEquals(result.isTrashCanVisible(),true);

    }

    
}
