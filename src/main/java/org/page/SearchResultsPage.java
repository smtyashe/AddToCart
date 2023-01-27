package org.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends BasePage {

    WebElement searchProduct = driver.findElement(By.name("search"));
    WebElement clickSearchIcon = driver.findElement(By.className("button search-btn search-icon"));

    WebElement addItemToCart = driver.findElement(By.xpath("//*[@id=\"90463774\"]/div/div[4]/div/button"));

    WebElement viewCart = driver.findElement(By.xpath("//*[@id=\"shopfront-app\"]/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/button"));

    WebElement checkQty = driver.findElement(By.xpath("//*[@id=\"body\"]/div[4]/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div/article/div/div[2]/div[2]/div/div[1]"));

    WebElement trashCanVisible = driver.findElement(By.xpath("//*[@id=\"shopfront-app\"]/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/button/div[1]/svg"));

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public SearchResultsPage SearchCriteria(String searchCriteria) {
        searchProduct.clear();
        searchProduct.sendKeys(searchCriteria);
        clickSearchIcon.click();

        return new SearchResultsPage(driver);

    }

    public void addProductToCart() {
        addItemToCart.click();
    }

    public void viewProducInoCart() {
        addItemToCart.click();
    }

    public boolean isQtyMoreThanZero() {

        if (checkQty.equals(0)) {

            return false;
        }
        return true;
    }

    public boolean isTrashCanVisible() {

        if (checkQty.isSelected()) {

            return true;
        }
        return false;
    }

}