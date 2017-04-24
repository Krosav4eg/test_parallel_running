package utils;

/**
 * Created by Sergey_Potapov
 */
public class Constants {
    //========================LOGIN PAGES=============================================
    public static final String LOGIN_FIELD = "userID";
    public static final String PASSWORD_FIELD = "password";
    public static final String AUTHORIZATION_BUTTON = "//input[@value='Log in']";

    //========================ROLE INDICATORS=============================================
    public static final String CONTENT_OPERATOR_ROLE_INDICATOR = "//li[contains(text(),'Оператор Контента ДБН')]";
    public static final String ANALITIC_ROLE_INDICATOR = "//li[contains(text(),'Аналитик ЦА ДБН')]";
    public static final String COORDINATOR_ROLE_INDICATOR = "//li[contains(text(),'Координатор ДБН')]";

    //========================MAIN PAGES=============================================
    public static final String MAIN_PAGE = "//a[contains(text(),'Главная страница')]";
    public static final String ORG_LEVEL_BLOCK = "(//fieldset[@class='fpspm-simple-fieldset'])[1]";
    public static final String THEME_RUBRIC_BLOCK = "(//fieldset[@class='fpspm-simple-fieldset'])[2]";
    public static final String TEST_DATA_RIGHT_SECTION = "//div[@class='ui-datagrid-content ui-widget-content ui-datagrid-col-1']";

    //========================Publication PAGE=============================================
    public static final String PUBLISHING_PAGE = "//a[contains(text(),'Публикация')]";
    public static final String NAME_OF_MATERIAL_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[1]";
    public static final String REQUISITE_OF_MATERIAL_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[2]";
    public static final String RUBRICATOR_OF_ORG_LEVEL_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[3]";
    public static final String DESCRIPTION_OF_MATERIAL_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[4]";
    public static final String ATTACHED_FIELS_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[5]";
    public static final String THEME_RUBRICATOR_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[6]";
    public static final String RELATED_MATERIALS_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[7]";
    public static final String SERVICE_INFO_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[8]";

    //========================THEME RUBRIC PAGE=============================================
    public static final String THEME_RUBRIC_PAGE = "//a[contains(text(),'Тематический рубрикатор')]";
    public static final String THEME_RUBRIC_TABLE = "//div[@class='ui-treetable-tablewrapper']";
    public static final String NAME_COLUMN_OF_TABLE = "//table/thead/tr/th[1]";
    public static final String DESCRIPTION_COLUMN_OF_TABLE = "//table/thead/tr/th[2]";
    public static final String ADD_BUTTON_ON_THEME_RUBRIC_PAGE = "(//span[contains(text(),'Добавить')])[1]";
    public static final String CHANGE_BUTTON_ON_THEME_RUBRIC_PAGE = "(//span[contains(text(),'Изменить')])[1]";
    public static final String CHANGE_WINDOW_TITLE_ON_THEME_RUBRIC_PAGE = "(//span[contains(text(),'Изменить')])[2]";
    public static final String DIALOG_ADD_WINDOW_ON_THEME_RUBRIC_PAGE = "(//span[contains(text(),'Добавить')])[2]";
    public static final String NAME_OF_RUBRIC_IN_DIALOG_ADD_WINDOW = "//input[@name='name']";
    public static final String DESCRIPTION_OF_RUBRIC_IN_DIALOG_ADD_WINDOW = "//textarea[@name='description']";
    public static final String SAVE_BUTTON_OF_RUBRIC_IN_DIALOG_ADD_WINDOW = "(//button[@type='button'])[6]";
    public static final String NEW_THEME_RUBRIC = "//span[contains(text(),'Новая Тестовая Рубрика')]";
    public static final String NEW_THEME_RUBRIC_AFTER_CHANGE = "//span[contains(text(),'  Новая Тестовая')]";
    public static final String DESCRIPTION_OF_THEME_RUBRIC = "//td[contains(text(),'Для автотестов')]";
    public static final String DESCRIPTION_OF_THEME_RUBRIC_AFTER_CHANGE = "//td[contains(text(),'Для новых автотестов')]";
    public static final String DELETE_RUBRIC_BUTTON = "//span[contains(text(),'Удалить')]";
    public static final String ACCEPT_DELETE_RUBRIC_BUTTON_IN_DIALOG_WINDOW = "//span[contains(text(),'OK')]";
    public static final String REQUIRED_FIELD_IN_ADD_NEW_RUBRIC_WINDOW = "//label[contains(text(), 'Это поле необходимо заполнить.')]";
    public static final String CLOSE_CHANGE_NEW_RUBRIC_WINDOW_BUTTON = "(//span[@class='fa fa-fw fa-close'])[1]";
    public static final String TRANSFER_BUTTON = "//span[contains(text(), 'Переместить')]";
    public static final String SAVE_BUTTON_IN_CHANGE_RUBRIC_WINDOW = "(//span[contains(text(),'Сохранить')])[1]";


    //========================REPORT PAGE=============================================
    public static final String REPORTS_PAGE = "//a[contains(text(),'Отчеты')]";

    //========================MANAGEMENT OF ACCESS RIGHTS PAGE=============================================
    public static final String FPS_PM_TAB = "//a[contains(text(),'ФПС ПМ')]";
    public static final String MANAGEMENT_OF_ACCESS_RIGHTS = "//a[contains(text(),'Управление правами доступа')]";
    public static final String SEARCH_PARAMETERS_SECTION = "//div[@class='ui-fieldset-content']";
    public static final String RESULTS_OF_SEARCH_TABLE = "//div[@class='fpspm-text-center ui-datatable ui-widget']";
    public static final String INPUT_LAST_NAME_FIST_NAME_FIELD = "//input[@name='displayName']";
    public static final String INPUT_LOGIN_FIELD = "//input[@name='catalogUserId']";
    public static final String USER_FIRST_NAME_LAST_NAME_IN_TABLE = "//div[@class='fpspm-text-center ui-datatable ui-widget']//tr/td[3]";
    public static final String USER_LOGIN_IN_IN_TABLE = "//div[@class='fpspm-text-center ui-datatable ui-widget']//tr/td[4]";
    public static final String DISPLAY_ONLY_CA_CHECKBOX = "//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']";
    public static final String FOUNTED_USER_1_IN_TABLE = "(//tr/td[5])[1]";
    public static final String FOUNTED_USER_2_IN_TABLE = "(//tr/td[5])[2]";
    public static final String FOUNTED_USER_3_IN_TABLE = "(//tr/td[5])[3]";
    public static final String FOUNTED_USER_4_IN_TABLE = "(//tr/td[5])[4]";
    public static final String UNCONFIRMED_ROLE_IN_TABLE = "(//i[@style='color: red;'])[1]";
    public static final String CONFIRMATION_ROLE_FOR_USER_DIALOG_WINDOW = "(//div[@role='dialog'])[2]";
    public static final String CONFIRMATION_ROLE_FOR_USER_DIALOG_WINDOW_CHECKBOX = "//input[@name='confirmed']";
    public static final String CONFIRMATION_ROLE_FOR_USER_DIALOG_WINDOW_SAVE_BUTTON = "(//span[contains(text(), 'Сохранить')])[5]";
    public static final String CONFIRMED_ROLE_IN_TABLE = "(//i[@style='color: green;'])[1]";
    public static final String RUBRIC_ICON = "(//tr[@class='ui-widget-content ui-datatable-even']/td[8]/i)[1]";
    public static final String SELECT_RUBRIC_WINDOW = "(//div[@role='dialog'])[5]";
    public static final String SELECT_RUBRIC = "(//i[@class='fa fa-plus'])[1]";
    public static final String SELECT_RUBRIC_IS_DISPLAYED = "//tr/td[2][contains(text(),'Рубрика')]";
    public static final String SELECTED_RUBRIC_CHECKBOX1 = "(//input[@type='checkbox'])[2]";
    public static final String SELECTED_RUBRIC_CHECKBOX2 = "(//input[@type='checkbox'])[2]";
    public static final String DELETE_SELECTED_RUBRIC_BUTTON = "//span[contains(text(),'Удалить')]";
    public static final String NO_RECORDS_FOUND_MESSAGE = "//tr/td[contains(text(),'No records found')]";
    public static final String SAVE_RUBRIC_BUTTON = "(//span[contains(text(),'Сохранить')])[4]";

    //========================MANAGEMENT OF ACCESS RIGHTS ROLE DROPDOWN FILTERS=============================================

    public static final String DROPDOWN_ROLE_BUTTON = "//select[@name='roleId']";
    public static final String DROPDOWN_ALL_ROLE_BUTTON = "(//li[@data-label='Все роли']";
    public static final String DROPDOWN_ROLE_CONTENT_OPERATOR_BUTTON = "//li[@data-label='Оператор контента']";
    public static final String DROPDOWN_ROLE_ANALITIC_BUTTON = "//li[@data-label='Аналитик']";



    //========================MANAGEMENT OF ACCESS RIGHTS DROPDOWN FILTERS=============================================

    public static final String ALL_DEPARTMENTS_FILTER = "//li[@data-label='Все подразделения']";
    public static final String VOLGO_VJTSKAJ_MI_FILTER = "//li[@data-label='Волго-Вятская МИ']";
    public static final String VOLGO_VJTSKAJ_GU_OF_BANK_RUSSIA_FILTER = "//li[@data-label='Волго-Вятское ГУ Банка России']";
    public static final String GU_OF_BANK_RUSSIA_FILTER = "//li[@data-label='ГУ Банка России по Центральному федеральному округу']";
    public static final String GU_OF_MOSCOW_REGION = "//li[@data-label='ГУ Банка России по Центральному федеральному округу (Московский регион)']";
    public static final String DALNEVOSTOCHNOE_GU_OF_BANK_RUSSIA = "//li[@data-label='Дальневосточное ГУ Банка России']";
    public static final String MI_PO_DALNEVOSTOCHNOMU_FO = "//li[@data-label='МИ по Дальневосточному ФО']";
    public static final String MI_PO_SEVERO_ZAPADNOMU_FO = "//li[@data-label='МИ по Северо-Западному ФО']";
    public static final String MI_PO_SEBIRSCOMU_FO = "//li[@data-label='МИ по Сибирскому ФО']";
    public static final String MI_PO_CENTRALNOMU_FO = "//li[@data-label='МИ по Центральному ФО']";
    public static final String MI_PO_IUJNOMU_I_SEVERNOMU_KAVKAZU = "//li[@data-label='МИ по Южному и Северо-Кавказскому ФО']";
    public static final String MI_PO_GORODU_MOSCOW = "//li[@data-label='МИ по городу Москва']";
    public static final String CALUGA_DEP = "//li[@data-label='Отделение Калуга']";
    public static final String SEVERO_ZAPADNOE_GU_BANK_OF_RUSSIA = "//li[@data-label='Северо-Западное ГУ Банка России']";
    public static final String SIBIRSKOE_GU_BANKA_RUSSIA = "//li[@data-label='Сибирское ГУ Банка России']";
    public static final String URALSCOE_MI = "//li[@data-label='Уральская МИ']";
    public static final String URALSCOE_GU_OF_BANK_RUSSIA = "//li[@data-label='Уральское ГУ Банка России']";
    public static final String UJNOE_GU_OF_BANK_RUSSIA = "//li[@data-label='Уральское ГУ Банка России']";

    //========================USERS TEMPLATES PAGE=============================================
    public static final String USERS_TEMPLATES_PAGE = "//a[contains(text(),'Пользовательские шаблоны')]";

    //========================MY RIGHTS PAGE=============================================
    public static final String MY_RIGHTS_PAGE = "//a[contains(text(),'Мои права')]";

}
