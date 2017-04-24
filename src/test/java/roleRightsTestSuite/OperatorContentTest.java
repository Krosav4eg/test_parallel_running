package roleRightsTestSuite;

import org.testng.annotations.Test;
import pages.*;
import listener.base.BaseTest;

import static pages.LoginPage.CONTENT_OPERATOR_LOGIN;

/**
 * Created by Sergey_Potapov
 */

public class OperatorContentTest extends BaseTest {

    @Test
    public void authorizationOperatorContentTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginIntoSite(CONTENT_OPERATOR_LOGIN);
        loginPage.checkContentOperatorRoleName();
        System.out.println("This role is " + LoginPage.role);
        System.out.println(Thread.currentThread().getName());
        if (LoginPage.role.equalsIgnoreCase("Оператор контента")) {
        } else if (LoginPage.role.equalsIgnoreCase("Аналитик")) {
        } else if (LoginPage.role.equalsIgnoreCase("Координатор")) {
        }
    }

    @Test
    public void mainPageTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.mainPageIsDisplayed();
        mainPage.allNeededSectionAreDisplayed();
    }

    @Test
    public void publishPageTest() {
        PublicationPage publicationPage = new PublicationPage(driver);
        publicationPage.publicationPageISDisplayed();
        publicationPage.allNeededTabsInPublicationPageIsDisplayed();
    }

    @Test
    public void themeRubricPageTest() {
        ThemeRubricatorPage themePublicationPage = new ThemeRubricatorPage(driver);
        themePublicationPage.themeRubricPageDisplayed();
        themePublicationPage.themeRubricTableIsVisible();
    }

    @Test
    public void reportPageTest() {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.reportPageIsDisplayed();
    }
}

