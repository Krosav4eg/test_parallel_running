package fpspm141_Assign_access_rights_manually_by_the_Coordinator;

import listener.base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagementOfAccessRightsPage;

import static pages.base.BasePage.COORDINATOR_LOGIN;

/**
 * Created by Sergey_Potapov
 */

public class SearchingByParametersTest extends BaseTest {

    @Test(priority = 1)
    public void authorizationCoordinatorTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginIntoSite(COORDINATOR_LOGIN);
        loginPage.checkCordinatorRoleName();
        System.out.println("This role is " + LoginPage.role);
        if (LoginPage.role.equalsIgnoreCase("Оператор контента")) {
        } else if (LoginPage.role.equalsIgnoreCase("Аналитик")) {
        } else if (LoginPage.role.equalsIgnoreCase("Координатор")) {
        }
    }

    @Test(priority = 2)
    public void manageOfAccessPageTest() {
        ManagementOfAccessRightsPage mainPage = new ManagementOfAccessRightsPage(driver);
        mainPage.managementOfAccessRightPageIsDisplayed();
    }
    @Test(priority = 3)
    public void searchUserByLastNmeTest() throws InterruptedException {
        ManagementOfAccessRightsPage mainPage = new ManagementOfAccessRightsPage(driver);
        mainPage.searchOfUserLastNameOnManagePage();
    }
    @Test(priority = 4)
    public void searchUserByLoginTest() throws InterruptedException {
        ManagementOfAccessRightsPage mainPage = new ManagementOfAccessRightsPage(driver);
        mainPage.searchOfUserLoginOnManagePage();
    }

    @Test(priority = 5)
    public void displayOnlyCATest() throws InterruptedException {
        ManagementOfAccessRightsPage mainPage = new ManagementOfAccessRightsPage(driver);
        mainPage.displayOnlyCAOnManagePage();
    }
}
