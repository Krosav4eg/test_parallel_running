package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import static utils.Constants.MY_RIGHTS_PAGE;

/**
 * Created by Sergey_Potapov
 */
public class MyRightsPage extends BasePage {

    public MyRightsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = MY_RIGHTS_PAGE)
    private WebElement myRightsPage;


    public void myRightsPageIsDisplayed() {
        elementVisibility(myRightsPage, driver).click();
    }


}
