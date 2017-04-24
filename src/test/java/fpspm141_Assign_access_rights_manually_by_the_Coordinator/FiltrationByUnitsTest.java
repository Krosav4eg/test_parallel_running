package fpspm141_Assign_access_rights_manually_by_the_Coordinator;

import listener.base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagementOfAccessRightsPage;

import static pages.base.BasePage.COORDINATOR_LOGIN;

/**
 * Created by Avic on 4/23/2017.
 */
public class FiltrationByUnitsTest extends BaseTest {

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
    public void verifyingRoleTest() throws InterruptedException {
        ManagementOfAccessRightsPage managementOfAccessRightsPage = new ManagementOfAccessRightsPage(driver);
        managementOfAccessRightsPage.managementOfAccessRightPageIsDisplayed();
        managementOfAccessRightsPage.assertionRoleFilter();
    }

}

