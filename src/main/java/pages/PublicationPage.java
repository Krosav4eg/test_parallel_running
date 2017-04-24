package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import static org.testng.Assert.assertTrue;
import static utils.Constants.*;

/**
 * Created by Sergey_Potapov
 */
public class PublicationPage extends BasePage {

    public PublicationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = PUBLISHING_PAGE)
    private WebElement publishPage;

    @FindBy(xpath = NAME_OF_MATERIAL_TAB)
    private WebElement nameOfMaterialTab;

    @FindBy(xpath = REQUISITE_OF_MATERIAL_TAB)
    private WebElement requesiteOfMaterialTab;

    @FindBy(xpath = RUBRICATOR_OF_ORG_LEVEL_TAB)
    private WebElement rubricatorOfOrgLevelTab;

    @FindBy(xpath = DESCRIPTION_OF_MATERIAL_TAB)
    private WebElement descriptionOfMaterialTab;

    @FindBy(xpath = ATTACHED_FIELS_TAB)
    private WebElement attachedFilesTab;

    @FindBy(xpath = RELATED_MATERIALS_TAB)
    private WebElement relatedMaterialsTab;

    @FindBy(xpath = THEME_RUBRICATOR_TAB)
    private WebElement themeRubricatorTab;

    @FindBy(xpath = SERVICE_INFO_TAB)
    private WebElement serviceInfoTab;


    public void publicationPageISDisplayed() {
        elementVisibility(publishPage, driver).click();
    }
    public void allNeededTabsInPublicationPageIsDisplayed() {
        elementVisibility(nameOfMaterialTab, driver);
        assertTrue(nameOfMaterialTab.getText().contains("Название материала"));

        elementVisibility(requesiteOfMaterialTab, driver);
        assertTrue(requesiteOfMaterialTab.getText().contains("Реквизиты материала"));

        elementVisibility(rubricatorOfOrgLevelTab, driver);
        assertTrue(rubricatorOfOrgLevelTab.getText().contains("Рубрикатор организационных уровней"));

        elementVisibility(descriptionOfMaterialTab, driver);
        assertTrue(descriptionOfMaterialTab.getText().contains("Описание материала"));

        elementVisibility(attachedFilesTab, driver);
        assertTrue(attachedFilesTab.getText().contains("Прикрепленные файлы"));

        elementVisibility(themeRubricatorTab, driver);
        assertTrue(themeRubricatorTab.getText().contains("Тематический рубрикатор"));

        elementVisibility(relatedMaterialsTab, driver);
        assertTrue(relatedMaterialsTab.getText().contains("Связанные материалы"));

        elementVisibility(serviceInfoTab, driver);
        assertTrue(serviceInfoTab.getText().contains("Служебная информация"));
    }
}