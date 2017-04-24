package roleRightsTestSuite;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagementOfAccessRightsPage;
import pages.ReportsPage;
import pages.UserTemplatePage;
import listener.base.BaseTest;

import static pages.base.BasePage.COORDINATOR_LOGIN;


/**
 * Created by Avic on 4/14/2017.
 */
public class CordinatorTest extends BaseTest {

    @Test
    public void authorizationCordinatorTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginIntoSite(COORDINATOR_LOGIN);
        loginPage.checkCordinatorRoleName();
        System.out.println("This role is " + LoginPage.role);
        System.out.println(Thread.currentThread().getName());
        if (LoginPage.role.equalsIgnoreCase("Оператор контента")) {
        } else if (LoginPage.role.equalsIgnoreCase("Аналитик")) {
        } else if (LoginPage.role.equalsIgnoreCase("Координатор")) {
        }
    }

    @Test
    public void manageOfAccessPageTest() {
        ManagementOfAccessRightsPage mainPage = new ManagementOfAccessRightsPage(driver);
        mainPage.managementOfAccessRightPageIsDisplayed();
        mainPage.allNeededSectionAreDisplayedInManagePage();
    }
    @Test
    public void userTemplatePageTest() {
        UserTemplatePage userTemplatePage = new UserTemplatePage(driver);
        userTemplatePage.userTemplatePageIsDisplayed();
    }

    @Test
    public void reportPageTest() {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.reportPageIsDisplayed();
    }
}
