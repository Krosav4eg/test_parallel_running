package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import static utils.Constants.*;

/**
 * Created by Sergey_Potapov
 */

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    //========================MAIN PAGE TAB=============================================

    @FindBy(xpath = MAIN_PAGE)
    protected WebElement mainPageTab;

    //========================Organizational level SECTION=============================================

    @FindBy(xpath = ORG_LEVEL_BLOCK)
    protected WebElement orgBlock;

    //========================THEME RUBRICS SECTION=============================================

    @FindBy(xpath = THEME_RUBRIC_BLOCK)
    protected WebElement themeRibricBlock;

    //========================TEST DATA RIGHT SECTION=============================================

    @FindBy(xpath = TEST_DATA_RIGHT_SECTION)
    protected WebElement testDataRightSection;

    //--------------------------------------------------------------------------------------------


    public void mainPageIsDisplayed() {
        elementVisibility(mainPageTab, driver).click();
    }

    public void allNeededSectionAreDisplayed() {
        elementVisibility(orgBlock, driver);
        elementVisibility(themeRibricBlock, driver);
        elementVisibility(testDataRightSection, driver);
    }
}