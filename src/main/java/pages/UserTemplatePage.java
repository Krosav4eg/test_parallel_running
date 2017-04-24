package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import static utils.Constants.*;

/**
 * Created by Sergey_Potapov
 */
public class UserTemplatePage extends BasePage {

    @FindBy(xpath = USERS_TEMPLATES_PAGE)
    private WebElement userTemplatePage;

    public UserTemplatePage(WebDriver driver) {
        super(driver);
    }
    public void userTemplatePageIsDisplayed() {
        elementVisibility(userTemplatePage, driver).click();
    }

}
