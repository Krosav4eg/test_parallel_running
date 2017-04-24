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
public class ManagementOfAccessRightsPage extends BasePage {

    public ManagementOfAccessRightsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = FPS_PM_TAB)
    private WebElement fpsPmTab;

    @FindBy(xpath = MANAGEMENT_OF_ACCESS_RIGHTS)
    private WebElement managemetOfAccessRights;

    @FindBy(xpath = SEARCH_PARAMETERS_SECTION)
    private WebElement searchParametersSection;

    @FindBy(xpath = RESULTS_OF_SEARCH_TABLE)
    private WebElement resultsOfSearchTable;

    @FindBy(xpath = INPUT_LAST_NAME_FIST_NAME_FIELD)
    private WebElement inputLastNameField;

    @FindBy(xpath = INPUT_LOGIN_FIELD)
    private WebElement inputLoginField;

    @FindBy(xpath = USER_FIRST_NAME_LAST_NAME_IN_TABLE)
    private WebElement firstNameLastNameInTable;

    @FindBy(xpath = USER_LOGIN_IN_IN_TABLE)
    private WebElement userLoginInTable;

    @FindBy(xpath = DISPLAY_ONLY_CA_CHECKBOX)
    private WebElement displayOnlyCaCheckBox;

    @FindBy(xpath = FOUNTED_USER_1_IN_TABLE)
    private WebElement displayfoundedUser1;

    @FindBy(xpath = FOUNTED_USER_2_IN_TABLE)
    private WebElement displayfoundedUser2;

    @FindBy(xpath = FOUNTED_USER_3_IN_TABLE)
    private WebElement displayfoundedUser3;

    @FindBy(xpath = FOUNTED_USER_4_IN_TABLE)
    private WebElement displayfoundedUser4;

    @FindBy(xpath = UNCONFIRMED_ROLE_IN_TABLE)
    private WebElement unconfirmedRole;

    @FindBy(xpath = CONFIRMATION_ROLE_FOR_USER_DIALOG_WINDOW)
    private WebElement confirmedRoleForUser;

    @FindBy(xpath = CONFIRMATION_ROLE_FOR_USER_DIALOG_WINDOW_CHECKBOX)
    private WebElement confirmedRoleForUserCheckBox;

    @FindBy(xpath = CONFIRMATION_ROLE_FOR_USER_DIALOG_WINDOW_SAVE_BUTTON)
    private WebElement confirmedRoleForUserSaveButton;

    @FindBy(xpath = CONFIRMED_ROLE_IN_TABLE)
    private WebElement confirmedRole;

    @FindBy(xpath = RUBRIC_ICON)
    private WebElement rubricIcon;

    @FindBy(xpath = SELECT_RUBRIC_WINDOW)
    private WebElement selectRubricWindow;

    @FindBy(xpath = SELECT_RUBRIC)
    private WebElement selectRubric;

    @FindBy(xpath = SELECT_RUBRIC_IS_DISPLAYED)
    private WebElement selectedRubricIsDispalayed;

    @FindBy(xpath = SELECTED_RUBRIC_CHECKBOX1)
    private WebElement selectedRubricCheckbox1;

    @FindBy(xpath = SELECTED_RUBRIC_CHECKBOX2)
    private WebElement selectedRubricCheckbox2;

    @FindBy(xpath = DELETE_SELECTED_RUBRIC_BUTTON)
    private WebElement deleteSelectedRubricButton;

    @FindBy(xpath = NO_RECORDS_FOUND_MESSAGE)
    private WebElement noRecordsFoundMessage;

    @FindBy(xpath = SAVE_RUBRIC_BUTTON)
    private WebElement saveRubricButton;

    //========================MANAGEMENT OF ACCESS RIGHTS DROPDOWN FILTERS=============================================

    @FindBy(xpath = ALL_DEPARTMENTS_FILTER)
    private WebElement allDepartmentsFilter;

    @FindBy(xpath = VOLGO_VJTSKAJ_MI_FILTER)
    private WebElement volgoVjtskajMiFilter;

    @FindBy(xpath = VOLGO_VJTSKAJ_GU_OF_BANK_RUSSIA_FILTER)
    private WebElement volgoVjtskajGuOfBankRussiaFilter;

    @FindBy(xpath = GU_OF_BANK_RUSSIA_FILTER)
    private WebElement guOfBankRussiaFilter;

    @FindBy(xpath = GU_OF_MOSCOW_REGION)
    private WebElement guOfMoscowRegionFilter;

    @FindBy(xpath = DALNEVOSTOCHNOE_GU_OF_BANK_RUSSIA)
    private WebElement dalnevostochnoeGuOfBankRussiaFilter;

    @FindBy(xpath = MI_PO_DALNEVOSTOCHNOMU_FO)
    private WebElement miPodalnevostochnoeFoFilter;

    @FindBy(xpath = MI_PO_SEVERO_ZAPADNOMU_FO)
    private WebElement miPoSeveroZapadnomuFoFilter;

    @FindBy(xpath = MI_PO_SEBIRSCOMU_FO)
    private WebElement miPoSebirscomuFoFilter;

    @FindBy(xpath = MI_PO_CENTRALNOMU_FO)
    private WebElement miPoCentralnomuFoFilter;

    @FindBy(xpath = MI_PO_IUJNOMU_I_SEVERNOMU_KAVKAZU)
    private WebElement miPoIujnomuISebvernomuKavkazuFilter;

    @FindBy(xpath = MI_PO_GORODU_MOSCOW)
    private WebElement miPoGoroduMoscowFilter;

    @FindBy(xpath = CALUGA_DEP)
    private WebElement calugaDepFilter;

    @FindBy(xpath = SEVERO_ZAPADNOE_GU_BANK_OF_RUSSIA)
    private WebElement severoZapadnoeGuBankOfRussiaFilter;

    @FindBy(xpath = SIBIRSKOE_GU_BANKA_RUSSIA)
    private WebElement sebirscoeGuBankOfRussiaFilter;

    @FindBy(xpath = URALSCOE_MI)
    private WebElement uralscoeOfRussiaFilter;

    @FindBy(xpath = URALSCOE_GU_OF_BANK_RUSSIA)
    private WebElement uralscoeGuOfRussiaFilter;

    @FindBy(xpath = UJNOE_GU_OF_BANK_RUSSIA)
    private WebElement ujnoeGuOfRussiaFilter;

    //========================MANAGEMENT OF ACCESS RIGHTS ROLE DROPDOWN FILTERS=============================================

    @FindBy(xpath = DROPDOWN_ROLE_BUTTON)
    private WebElement dropDownRoleButton;

    @FindBy(xpath = DROPDOWN_ALL_ROLE_BUTTON)
    private WebElement dropDownAllRoleButton;

    @FindBy(xpath = DROPDOWN_ROLE_CONTENT_OPERATOR_BUTTON)
    private WebElement dropDownRoleContentButton;

    @FindBy(xpath = DROPDOWN_ROLE_ANALITIC_BUTTON)
    private WebElement dropDownRoleAnaliticButton;

    //========================Founded USERS=============================================
    @FindBy(xpath = "(//td[contains(text(),'dbn_content_operator')])[2]")
    private WebElement contetntOperatorFoundedUser;


    public void managementOfAccessRightPageIsDisplayed() {
        elementVisibility(fpsPmTab, driver).click();
        elementVisibility(managemetOfAccessRights, driver);
    }

    public void allNeededSectionAreDisplayedInManagePage() {
        elementVisibility(searchParametersSection, driver);
        elementVisibility(resultsOfSearchTable, driver);
    }

    public void searchOfUserLastNameOnManagePage() throws InterruptedException {
        fillInputField(inputLastNameField, driver, "ДБН dbn_content_operator");
        elementVisibility(firstNameLastNameInTable, driver);
        assertTrue(firstNameLastNameInTable.getText().contains("ДБН dbn_content_operator"));
        Thread.sleep(5000);
    }

    public void searchOfUserLoginOnManagePage() throws InterruptedException {
        elementVisibility(inputLastNameField, driver).clear();
        fillInputField(inputLoginField, driver, "dbn_analyst_ca");
        elementVisibility(userLoginInTable, driver);
        Thread.sleep(5000);
        assertTrue(userLoginInTable.getText().contains("dbn_analyst_ca"));

    }

    public void displayOnlyCAOnManagePage() throws InterruptedException {
        elementVisibility(inputLoginField, driver).clear();
        elementVisibility(displayOnlyCaCheckBox, driver).click();
        Thread.sleep(5000);
        assertTrue(displayfoundedUser1.getText().contains("Центральный аппарат"));
        assertTrue(displayfoundedUser2.getText().contains("Центральный аппарат"));
        assertTrue(displayfoundedUser3.getText().contains("МИ по Центральному ФО"));
        assertTrue(displayfoundedUser4.getText().contains("Центральный аппарат"));
    }

    public void approvalOfRoleOnManagePage() throws InterruptedException {
        Thread.sleep(5000);
        elementVisibility(unconfirmedRole, driver).click();
        elementVisibility(confirmedRoleForUserCheckBox, driver).click();
        Thread.sleep(5000);
        elementVisibility(confirmedRoleForUserSaveButton, driver).click();
        elementVisibility(confirmedRole, driver);
        Thread.sleep(5000);
        elementVisibility(confirmedRole, driver).click();
        elementVisibility(confirmedRoleForUserCheckBox, driver).click();
        Thread.sleep(5000);
        elementVisibility(confirmedRoleForUserSaveButton, driver).click();
        elementVisibility(unconfirmedRole, driver);
        Thread.sleep(5000);
    }

    public void assignRubricToTheRole() throws InterruptedException {
        Thread.sleep(7000);
        elementVisibility(rubricIcon, driver).click();
        elementVisibility(selectRubricWindow, driver);
        elementVisibility(selectRubric, driver).click();
        Thread.sleep(7000);
        elementVisibility(selectedRubricIsDispalayed, driver);
        elementVisibility(selectedRubricCheckbox1, driver).click();
        elementVisibility(selectedRubricCheckbox1, driver).click();
        elementVisibility(deleteSelectedRubricButton, driver).click();
        elementVisibility(noRecordsFoundMessage, driver);
        elementVisibility(saveRubricButton, driver).click();
    }

    public void assertionRoleFilter() throws InterruptedException {
        Thread.sleep(5000);
        elementIsClicable(dropDownRoleButton, driver).click();
        elementVisibility(dropDownRoleContentButton, driver).click();
        Thread.sleep(5000);
        assertTrue(contetntOperatorFoundedUser.getText().contains("dbn_content_operator"));
//        assertTrue(displayfoundedUser2.getText().contains("Центральный аппарат"));
//        assertTrue(displayfoundedUser3.getText().contains("МИ по Центральному ФО"));
//        assertTrue(displayfoundedUser4.getText().contains("Центральный аппарат"));
    }
}
