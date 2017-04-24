package roleRightsTestSuite;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.MyRightsPage;
import pages.PublicationPage;
import listener.base.BaseTest;

import static pages.base.BasePage.ANALITIC_LOGIN;

/**
 * Created by Sergey_Potapov
 */
public class AnaliticTest extends BaseTest {

    @Test
    public void authorizationAnaliticTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginIntoSite(ANALITIC_LOGIN);
        loginPage.checkAnaliticRoleName();
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
    public void myRightsPageTest() {
        MyRightsPage myRightsPage = new MyRightsPage(driver);
        myRightsPage.myRightsPageIsDisplayed();
    }
}
