package sergey_potapov.test_automation.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

/**
 * Created by Sergey_Potapov
 */

public class MainPage {

    private final WebDriver driver;
    private static String PRODUCT = "Barbour Leather Explorer Bag, Brown";
    private final By searchField = By.cssSelector("#search-keywords");
    private final By searchButton = By.cssSelector("#search-button-in-header");
    private final By addToBasketButton = By.cssSelector(".btn-plrg-addtobasket");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage searchProduct() {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(searchField));
        driver.findElement(searchField).sendKeys(PRODUCT);
        driver.findElement(searchButton).click();
        return this;
    }

    public void moveCursor() {
        try {
            new Robot().mouseMove(1315, 558);
        } catch (AWTException ex) {
            ex.printStackTrace();
        }
    }

    public MainPage waitForBasketButton (WebDriverWait wait) {
        wait.until(ExpectedConditions.elementToBeClickable(addToBasketButton));
        return this;
    }

    public BasketPage addProductToBasket() {
        driver.findElement(addToBasketButton).click();
        return new BasketPage(driver);
    }

    public static String getPRODUCT() {
        return PRODUCT;
    }
}