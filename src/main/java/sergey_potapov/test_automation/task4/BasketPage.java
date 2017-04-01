package sergey_potapov.test_automation.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sergey_Potapov
 */

public class BasketPage {

    private final WebDriver driver;
    private static final String BASKET_URL = "https://www.johnlewis.com/basket";
    private final By productTitle = By.cssSelector(".prod-desc-col > h3 > a");

    public BasketPage(WebDriver driver) {
        this.driver = driver;
        redirectToBasket(driver);
    }

    private void redirectToBasket(WebDriver driver) {
        driver.navigate().to(BASKET_URL);
    }

    public String getProductTitle() {
        return driver.findElement(productTitle).getText();
    }
}