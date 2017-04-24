package fpspm137_WorkWithRubricatorTestSuit;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ThemeRubricatorPage;
import listener.base.BaseTest;

import static pages.base.BasePage.CONTENT_OPERATOR_LOGIN;

/**
 * Created by Avic on 4/20/2017.
 */
public class WorkWithRubricatorTest extends BaseTest {
    @Test(priority = 1)
    public void authorizationOperatorContentTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginIntoSite(CONTENT_OPERATOR_LOGIN);
        loginPage.checkContentOperatorRoleName();
        System.out.println("This role is " + LoginPage.role);
        if (LoginPage.role.equalsIgnoreCase("Оператор контента")) {
        } else if (LoginPage.role.equalsIgnoreCase("Аналитик")) {
        } else if (LoginPage.role.equalsIgnoreCase("Координатор")) {
        }
    }

    @Test(priority = 2)
    public void createNewThemeRubricTest() {
        ThemeRubricatorPage themePublicationPage = new ThemeRubricatorPage(driver);
        themePublicationPage.themeRubricPageDisplayed();
        themePublicationPage.themeRubricTableIsVisible();
        themePublicationPage.checkRequiredFieldsOfNewAddedRubric();
        themePublicationPage.addNewRubric();
    }

    @Test(priority = 3)
    public void changeRubricTest() throws InterruptedException {
        ThemeRubricatorPage themePublicationPage = new ThemeRubricatorPage(driver);
        themePublicationPage.checkChangeOfNewAddedRubric();
    }

    @Test(priority = 4)
    public void deleteNewRubricTest() {
        ThemeRubricatorPage themePublicationPage = new ThemeRubricatorPage(driver);
        themePublicationPage.deleteNewAddedRubric();
    }

    @Test(priority = 5)
    public void newRubricWasSuccessfullyDeletedTest() {
        ThemeRubricatorPage themePublicationPage = new ThemeRubricatorPage(driver);
        themePublicationPage.checkDeletionOfNewAddedRubric();
    }

}
