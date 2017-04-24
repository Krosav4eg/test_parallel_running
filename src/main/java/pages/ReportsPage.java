package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import static utils.Constants.REPORTS_PAGE;

/**
 * Created by Sergey_Potapov
 */
public class ReportsPage extends BasePage {
    public ReportsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = REPORTS_PAGE)
    private WebElement reportPage;


    public void reportPageIsDisplayed() {
        elementVisibility(reportPage, driver).click();
    }
}
