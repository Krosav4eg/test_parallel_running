package fpspm141_Assign_access_rights_manually_by_the_Coordinator;

import listener.base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagementOfAccessRightsPage;

import static pages.base.BasePage.COORDINATOR_LOGIN;

/**
 * Created by Avic on 4/23/2017.
 */
public class RoleConfirmationTest extends BaseTest {

    @Test
    public void authorizationCordinatorTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginIntoSite(COORDINATOR_LOGIN);
        System.out.println("This role is " + LoginPage.role);
        System.out.println(Thread.currentThread().getName());
        if (LoginPage.role.equalsIgnoreCase("Оператор контента")) {
        } else if (LoginPage.role.equalsIgnoreCase("Аналитик")) {
        } else if (LoginPage.role.equalsIgnoreCase("Координатор")) {
        }
    }

    @Test(priority = 2)
    public void manageOfAccessPageTest() {
        ManagementOfAccessRightsPage managementOfAccessRightsPage = new ManagementOfAccessRightsPage(driver);
        managementOfAccessRightsPage.managementOfAccessRightPageIsDisplayed();
    }

    @Test(priority = 3)
    public void confirmationRoleTest() throws InterruptedException {
        ManagementOfAccessRightsPage managementOfAccessRightsPage = new ManagementOfAccessRightsPage(driver);
        managementOfAccessRightsPage.approvalOfRoleOnManagePage();
    }

    //BUG!!!!!!!!!!!!!!!!!!!!!
//    @Test(priority = 4)
//    public void confirmationRubricTest() throws InterruptedException {
//        ManagementOfAccessRightsPage managementOfAccessRightsPage = new ManagementOfAccessRightsPage(driver);
//        managementOfAccessRightsPage.assignRubricToTheRole();
//    }
}
