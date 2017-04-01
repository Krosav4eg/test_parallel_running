package sergey_potapov.test_automation.task4;

import org.testng.Assert;
import org.testng.annotations.Test;
import sergey_potapov.test_automation.task4.factory.BaseTest;

/**
 * Created by Sergey_Potapov
 */

public class ProductAdditionToBasketTest extends BaseTest {

    @Test
    public void AddProductTest() {
        driver.get(URL);
        MainPage mainPage = new MainPage(driver);
        mainPage.searchProduct();
        mainPage.moveCursor();
        mainPage.waitForBasketButton(wait);
        BasketPage basketPage = mainPage.addProductToBasket();
        Assert.assertTrue(basketPage.getProductTitle().contains(MainPage.getPRODUCT()));
    }

}