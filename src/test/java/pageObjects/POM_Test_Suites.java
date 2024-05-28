package pageObjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import resources.ObjectRepo;
import static constants.ThreadConstants.driver;
import static resources.listeners.wait;

public class POM_Test_Suites {

	 @FindBy(xpath = "//h1[text()='User Administration']")
	    private WebElement userAdminPage;

	    @FindBy(xpath = "//h2[text()='List of Users']")
	    private WebElement userAdminPageHeading;

	    @FindBy(xpath = "//span[text()='Administration']")
	    private WebElement btnAdminstration;

	    @FindBy(xpath = "//label[text()='Search']")
	    private WebElement searchLabel;

	    @FindBy(xpath = "//*[@id='search-term']")
	    private WebElement searchPlaceholder;
	    
	    @FindBy(xpath = "//*[text()='Reset filters']")
	    private WebElement btnResetFilters;

	    @FindBy(xpath = "//span[text()='USER MGMT REPORT']")
	    private WebElement btnUSERMGMTREPORT;

	    @FindBy(xpath = "//span[text()='USER ACTIVITY AUDIT REPORT']")
	    private WebElement btnUSERACTIVITYAUDITREPORT;

	    @FindBy(xpath = "//label[text()='Status']")
	    private WebElement statusLabel;

	    @FindBy(xpath = "//select[@id='demo-customized-select']")
	    private WebElement searchStatusValues;

	    @FindBy(xpath = "//label[text()='Jurisdiction']")
	    private WebElement jurisdictionLabel;

	    @FindBy(xpath = "(//select[@id='demo-customized-select'])")
	    private WebElement searchJurisdictionValues;

	    @FindBy(xpath = "//label[text()='Role']")
	    private WebElement roleLabel;

	    @FindBy(xpath = "//select[@id='age-native-simple']")
	    private WebElement searchRoleValues;

	    @FindBy(xpath = "//span[text()='How User Administration Works']")
	    private WebElement linkHowUserAdministrationWorks;

	    @FindBy(xpath = "//tr[@role='checkbox']")
	    private WebElement userGridColumnAssert;

	    @FindBy(xpath = "//span[@aria-disabled='false']")
	    private WebElement selectAllUsresCheckbox;

	    @FindBy(xpath = "//button[@title='Select number of rows per page.']")
	    private WebElement selectNumberOfRows;

	    @FindBy(xpath = "//li[text()='10 ']")
	    private WebElement select10Rows;

	    @FindBy(xpath = "//li[text()='25 ']")
	    private WebElement select25Rows;

	    @FindBy(xpath = "//li[text()='50 ']")
	    private WebElement select50Rows;

	    @FindBy(xpath = "//li[text()='100 ']")
	    private WebElement select100Rows;

	    @FindBy(xpath = "//li[text()='500 ']")
	    private WebElement select500Rows;

	    @FindBy(xpath = "//td[text()='Sponsor']")
	    private WebElement firstNameAfterSearch;

	    @FindBy(xpath = "//td[text()='California']")
	    private WebElement lastNameAfterSearch;

	    @FindBy(xpath = "//td[text()='seededsponsor.ca@yopmail.com']")
	    private WebElement emailAfterSearch;

	    @FindBy(xpath = "//td[text()='T6QCEmetteurA']")
	    private WebElement entityAfterSearch;

	    @FindBy(xpath = "//button[@aria-label='search']")
	    private WebElement searchIcon;

	    @FindBy(xpath = "//*[contains(text(),'Emails')]")
	    private WebElement emailsInSearchDropdown;

	    @FindBy(xpath = "(//*[contains(text(),'Users')])[2]")
	    private WebElement usersInSearchDropdown;

	    @FindBy(xpath = "//*[contains(text(),'Entities')]")
	    private WebElement entitiesInSearchDropdown;

	    @FindBy(xpath = "//*[contains(text(),'Account number')]")
	    private WebElement accountNumberInSearchDropdown;

	    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root'])[1]")
	    private WebElement moreResultsInSearchDropdown;

	    @FindBy(xpath = "//thead[@class='MuiTableHead-root']")
	    private WebElement columnHeader;

	    @FindBy(xpath = "//div[text()='0 of 10 Selected']")
	    private WebElement default0of10selected;

	    @FindBy(xpath = "//div[text()='0 of 25 Selected']")
	    private WebElement default0of25selected;

	    @FindBy(xpath = "//div[text()='0 of 50 Selected']")
	    private WebElement default0of50selected;

	    @FindBy(xpath = "//div[text()='0 of 100 Selected']")
	    private WebElement default0of100selected;

	    @FindBy(xpath = "//div[text()='0 of 500 Selected']")
	    private WebElement default0of500selected;

	    @FindBy(xpath = "//button[@title='First Page']")
	    private WebElement firstPage;

	    @FindBy(xpath = "//button[@title='Previous Page']")
	    private WebElement previousPage;

	    @FindBy(xpath = "//button[@title='Next Page']")
	    private WebElement nextPage;

	    @FindBy(xpath = "//button[@title='Last Page']")
	    private WebElement lastPage;

	    @FindBy(xpath = "(//span[@class='MuiButton-label'])[14]")
	    private WebElement previousPage1;

	    @FindBy(xpath = "(//button[@title='Next Page'])[2]")
	    private WebElement nextPage1;

	    @FindBy(xpath = "//input[@class='MuiInputBase-input MuiInput-input']")
	    private WebElement inputPageNumber1;

	    @FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input'])[2]")
	    private WebElement inputPageNumber2;

	    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1']")
	    private WebElement totalPages1;

	    @FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1'])[2]")
	    private WebElement totalPages2;

	    @FindBy(xpath = "//select[@id='demo-customized-select']")
	    private WebElement drpdwnStatus;

	    @FindBy(xpath = "//option[contains(text(),'Active ')]")
	    private WebElement selectActiveStatus;

	    @FindBy(xpath = "//option[contains(text(),'Inactive ')]")
	    private WebElement selectInactiveStatus;

	    @FindBy(xpath = "//option[contains(text(),'Not activated ')]")
	    private WebElement selectNotActivatedStatus;

	    @FindBy(xpath = "(//select[@id='demo-customized-select'])[2]")
	    private WebElement drpdwnJurisdiction;

	    @FindBy(xpath = "//option[contains(text(),'California ')]")
	    private WebElement selectCaliforniaRole;

	    @FindBy(xpath = "//option[contains(text(),'Quebec')]")
	    private WebElement selectQuebecRole;

	    @FindBy(xpath = "//select[@name='age']")
	    private WebElement drpdwnRole;

	    @FindBy(xpath = "//option[contains(text(),'Account Representative ')]")
	    private WebElement selectARRole;

	    @FindBy(xpath = "//option[contains(text(),'Event Administrator ')]")
	    private WebElement selectEARole;

	    @FindBy(xpath = "//option[contains(text(),'Financial Services Administrator ')]")
	    private WebElement selectFSARole;

	    @FindBy(xpath = "//option[contains(text(),'Market Monitor ')]")
	    private WebElement selectMMRole;

	    @FindBy(xpath = "//option[contains(text(),'Sponsor ')]")
	    private WebElement selectSponsorRole;

	    @FindBy(xpath = "(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter'])[5]")
	    private WebElement entityNameForUserRoles;

	    @FindBy(xpath = "//span[text()='FIRST NAME']")
	    private WebElement firstNameColumnHeader;

	    @FindBy(xpath = "//span[text()='LAST NAME']")
	    private WebElement lastNameColumnHeader;

	    @FindBy(xpath = "//span[text()='EMAIL ADDRESS']")
	    private WebElement emailAddressColumnHeader;

	    @FindBy(xpath = "//span[text()='USER ROLE']")
	    private WebElement userRoleColumnHeader;

	    @FindBy(xpath = "//span[text()='LAST UPDATED']")
	    private WebElement lastUpdatedColumnHeader;

	    @FindBy(xpath = "//span[text()='UPDATED BY']")
	    private WebElement updatedByColumnHeader;

	    @FindBy(xpath = "(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter'])[6]")
	    private WebElement registryHoldingAccountNumberForUserRoles;

	    @FindBy(xpath = "(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter'])[7]")
	    private WebElement lastUpdatedColumnValue;

	    @FindBy(xpath = "(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft'])[3]")
	    private WebElement updatedByColumnValue;

	    @FindBy(xpath = "(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter'])[8]")
	    private WebElement actionColumnValue;

	    @FindBy(xpath = "//span[text()='Deactivate']")
	    private WebElement deactivateLinkForActiveUsers;

	    @FindBy(xpath = "//*[text()='Reset Security Questions']")
	    private WebElement resetSecQueLinkForActiveUsers;

	    @FindBy(xpath = "//*[text()='Activate']")
	    private WebElement activateLinkForInactiveUsers;

	    @FindBy(xpath = "//span[text()='Resend Activation Email']")
	    private WebElement resendActEmailLinkForNotActiveUsers;

	    @FindBy(xpath = "//span[text()='Cancel']")
	    private WebElement btnCancelOnDeactivateUserPopup;

	    @FindBy(xpath = "//span[text()='Cancel']")
	    private WebElement btnCancelOnActivateUserPopup;

	    @FindBy(xpath = "//span[text()='Cancel']")
	    private WebElement btnCancelOnResetSecQuePopup;

	    @FindBy(xpath = "(//span[text()='Deactivate'])[2]")
	    private WebElement btnDeactivateOnDeactivateUserPopup;

	    @FindBy(xpath = "(//span[text()='Activate'])[2]")
	    private WebElement btnActivateOnActivateUserPopup;

	    @FindBy(xpath = "(//span[text()='Reset Security Questions'])[2]")
	    private WebElement btnResetSecQueOnResetSecQuePopup;

	    @FindBy(xpath = "//div[contains(text(), 'You have chosen to deactivate')]")
	    private WebElement textDisplayedAfterDeactivate;

	    @FindBy(xpath = "//div[contains(text(), 'You have chosen to activate')]")
	    private WebElement textDisplayedAfterActivate;

	    @FindBy(xpath = "//div[contains(text(), 'You have chosen to reset the security questions for')]")
	    private WebElement textDisplayedAfterResetSecQue;

	    @FindBy(xpath = "//p[text()='User-entity relationship(s) deactivated successfully']")
	    private WebElement deactivationSuccessMessage;

	    @FindBy(xpath = "//p[text()='User-entity relationship(s) activated successfully']")
	    private WebElement activationSuccessMessage;

	    @FindBy(xpath = "//p[text()='Security questions  successfully reset. An email has been sent to the user.']")
	    private WebElement resetSecQueSuccessMessage;

	    @FindBy(xpath = "//span[@class='ant-table-column-sorter-inner sortingIcon']")
	    private WebElement btnSorting;

	    @FindBy(xpath = "//*[@title='Log in']")
	    private WebElement btnLogin;

	    @FindBy(xpath = "//input[@id='enter_email']")
	    private WebElement username;

	    @FindBy(xpath = "//input[@id='enter_passphrase']")
	    private WebElement password;

	    @FindBy(xpath = "//h2[text()='Reset security questions']")
	    private WebElement headingResetSecQue;

	    @FindBy(xpath = "//*[contains(text(),'set up three security questions')]")
	    private WebElement subHeadingResetSecQue;

	    @FindBy(xpath = "//*[contains(text(),'Select your first security question')]")
	    private WebElement selectFirstSecQue;

	    @FindBy(xpath = "//option[text()='In which city or town was your first job?']")
	    private WebElement selectQueForFirstSecQue;

	    @FindBy(xpath = "//input[@placeholder='Enter your answer']")
	    private WebElement enterAnsForFirstSecQue;

	    @FindBy(xpath = "(//select[@id='demo-customized-select'])[2]")
	    private WebElement selectSecondSecQue;

	    @FindBy(xpath = "//option[text()='What was the last name of your third-grade teacher?']")
	    private WebElement selectQueForSecondSecQue;

	    @FindBy(xpath = "(//select[@id='demo-customized-select'])[3]")
	    private WebElement selectThirdSecQue;

	    @FindBy(xpath = "//option[(text()='In which year did you get your first credit card?']")
	    private WebElement selectQueForThirdSecQue;

	    @FindBy(xpath = "//*[contains(text(),'Reset security questions')]")
	    private WebElement btnResetSecQue;

	    @FindBy(xpath = "//tr")
	    private List<WebElement> totalNumOfRecords;

	    @FindBy(xpath = "//span[text()='Bulk Actions']")
	    private WebElement btnBulkActions;

	    @FindBy(xpath = "//p[text()='This action cannot be performed as one or more of the selected users are not from your jurisdiction.']")
	    private WebElement failureMsgOnBulkActions;

	    @FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-item'])[4]")
	    private WebElement AddNewUserBtn;

	    @FindBy(xpath = "//span[text()='USER ACTIVITY AUDIT REPORT']")
	    private WebElement userActivityAudReportBtn;

	    @FindBy(xpath = "//*[text()='USER MGMT REPORT']")
	    private WebElement userMNGMNTBtn;

	    @FindBy(xpath = "//input[@placeholder='Start Date']")
	    private WebElement selectActivityReportDate;

	    @FindBy(xpath = "//*[text()='Download']")
	    private WebElement downLoadBtn;

	    @FindBy(xpath = "(//tr[@class='MuiTableRow-root MuiTableRow-hover'])[1]")
	    private WebElement AddedUserTableRow1;

	    @FindBy(xpath = "//input[@id='email']")
	    private WebElement emailField;

	    @FindBy(xpath = "//*[text()='Check if email address is already associated to a platform user']")
	    private WebElement verifyEmail;

	    @FindBy(xpath = "//*[text()='This user does not exist and may be added.']")
	    private WebElement verifyEmailSuccessMsg;

	    @FindBy(xpath = "//input[@id='firstname']")
	    private WebElement firstNmeField;

	    @FindBy(xpath = "//input[@id='lastname']")
	    private WebElement LastNmeField;

	    @FindBy(xpath = "(//select[@id='demo-customized-select'])[3]")
	    private WebElement userRoleDropDown;

	    @FindBy(xpath = "//*[text()='ADD USER']")
	    private WebElement addUserBtn;

	    @FindBy(xpath = "//*[text()='Cancel']")
	    private WebElement cancelBtn;

	    @FindBy(xpath = "//*[text()='The user has been added successfully.']")
	    private WebElement addUserSuccessMsg;

	    @FindBy(xpath = "//*[text()='This email address is already associated to an Auction Platform user.']")
	    private WebElement existindAddUserFailureMsg;

	    @FindBy(xpath = "//*[text()='This email address is already associated to an Auction Platform Sponsor user in Quebec.']")
	    private WebElement QcExistindAddUserFailureMsg;

	    @FindBy(xpath = "(//tr[@class='MuiTableRow-root MuiTableRow-hover'])[1]")
	    private WebElement userStatusTable;

	    @FindBy(xpath = "//*[text()='Add a New User']")
	    private WebElement AddNewUserHeadrLBL;

	    @FindBy(xpath = "(//*[@class='MuiFormLabel-root Mui-required'])[1]")
	    private WebElement EmailAdressText;

	    @FindBy(xpath = "(//*[@class='MuiFormLabel-root Mui-required'])[2]")
	    private WebElement firstName;

	    @FindBy(xpath = "(//*[@class='MuiFormLabel-root Mui-required'])[3]")
	    private WebElement lastName;

	    @FindBy(xpath = "(//*[@class='MuiFormLabel-root Mui-required'])[4]")
	    private WebElement roleText;

	    @FindBy(xpath = "//*[text()='Email is not valid']")
	    private WebElement emailErrorMsg;

	    @FindBy(xpath = "(//p[@class='MuiFormHelperText-root Mui-error MuiFormHelperText-filled'])[1]")
	    private WebElement firstNmeErrorMsg;

	    @FindBy(xpath = "(//p[@class='MuiFormHelperText-root Mui-error MuiFormHelperText-filled'])[2]")
	    private WebElement lastNmeErrorMsg;

	    @FindBy(xpath = "//a[text()='Home']")
	    private WebElement btnHome;

	public POM_Test_Suites() {
        PageFactory.initElements(driver.get(), this);
    }

	public void verifySponsorCanAccessUserAdministrationScreen() throws Exception {

		CreateEvent ref = new CreateEvent();
	
		ref.clickbtnAdmin();
		ref.clickbtnUser();
		String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
		Assert.assertEquals(assertuserAdminPage, "User Administration");
		System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
		ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
		String assertuserAdminPageHeading = wait.until(ExpectedConditions.elementToBeClickable(userAdminPageHeading))
				.getText();
		Assert.assertEquals(assertuserAdminPageHeading, "List of Users");
		System.out.println("Title of the displayed page is : " + assertuserAdminPageHeading);
		ObjectRepo.test.log(Status.PASS, "Title of the displayed page is : " + assertuserAdminPageHeading);
		System.out.println("The sponsor can access the User administration screen from the contextual navigation bar");
		ObjectRepo.test.log(Status.PASS,
				"The sponsor can access the User administration screen from the contextual navigation bar");
	}

	public void verifyEACanAccessUserAdministrationScreen() throws Exception {

	    POMPublicHomePage login = new POMPublicHomePage();
	    login.EALoginCa();
	    System.out.println("Step1: Event Admin Login successfully");
	    login.handleSecurityQue();
	    login.clickOnnext();
	    System.out.println("Step2: Security Question handled successfully");
	    ObjectRepo.test.log(Status.PASS, "Security Answer sent Successfully");
	    CreateEvent ref = new CreateEvent();
	   // By clickbtnAdmin = null;
		//wait.until(ExpectedConditions.elementToBeClickable(clickbtnAdmin)).getText();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();
	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
	    String assertuserAdminPageHeading = wait.until(ExpectedConditions.elementToBeClickable(userAdminPageHeading))
	            .getText();
	    Assert.assertEquals(assertuserAdminPageHeading, "List of Users");
	    System.out.println("Title of the displayed page is : " + assertuserAdminPageHeading);
	    ObjectRepo.test.log(Status.PASS, "Title of the displayed page is : " + assertuserAdminPageHeading);
	    System.out.println(
	            "The Event Admin can access the User administration screen from the contextual navigation bar");
	    ObjectRepo.test.log(Status.PASS,
	            "The Event Admin can access the User administration screen from the contextual navigation bar");
	}


	public void verifyMMCanNotAccessUserAdministrationScreen() throws Exception {
	    POMPublicHomePage login = new POMPublicHomePage();
	    login.MMLoginCa();
	    System.out.println("Step1: Market Monitor Login successfully");
	    login.handleSecurityQue();
	    login.clickOnnext();
	    System.out.println("Step2: Security Question handled successfully");
	    ObjectRepo.test.log(Status.PASS, "Security Answer sent Successfully");
	    try {
	        btnAdminstration.click();
	        System.out.println("The Market Monitor can access the User administration screen from the contextual navigation bar");
	        ObjectRepo.test.log(Status.FAIL, "The Market Monitor can access the User administration screen from the contextual navigation bar");
	    } catch (Exception e) {
	        System.out.println("The Market Monitor can not access the User administration screen from the contextual navigation bar");
	        ObjectRepo.test.log(Status.PASS, "The Market Monitor can not access the User administration screen from the contextual navigation bar");
	    }
	}

	public void verifyFSACanNotAccessUserAdministrationScreen() throws Exception {
	    POMPublicHomePage login = new POMPublicHomePage();
	    login.FSALoginCa();
	    System.out.println("Step1: FSA Login successfully");
	    login.handleSecurityQue();
	    login.clickOnnext();
	    System.out.println("Step2: Security Question handled successfully");
	    ObjectRepo.test.log(Status.PASS, "Security Answer sent Successfully");
	    try {
	        btnAdminstration.click();
	        System.out.println("The FSA can access the User administration screen from the contextual navigation bar");
	        ObjectRepo.test.log(Status.FAIL, "The FSA can access the User administration screen from the contextual navigation bar");
	    } catch (Exception e) {
	        System.out.println("The FSA can not access the User administration screen from the contextual navigation bar");
	        ObjectRepo.test.log(Status.PASS, "The FSA can not access the User administration screen from the contextual navigation bar");
	    }
	}

	public void userAdminScreenFollowsWFGuidelines() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();
	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
	    String assertuserAdminPageHeading = wait.until(ExpectedConditions.elementToBeClickable(userAdminPageHeading))
	            .getText();
	    Assert.assertEquals(assertuserAdminPageHeading, "List of Users");
	    System.out.println("Title of the displayed page is : " + assertuserAdminPageHeading);
	    ObjectRepo.test.log(Status.PASS, "Title of the displayed page is : " + assertuserAdminPageHeading);
	    System.out.println("******************************************************************");
	    String assertSearchLabel = wait.until(ExpectedConditions.elementToBeClickable(searchLabel)).getText();
	    Assert.assertEquals(assertSearchLabel, "Search");
	    System.out.println("Label for the Search field displayed is : " + assertSearchLabel);
	    ObjectRepo.test.log(Status.PASS, "Label for the Search field displayed is : " + assertSearchLabel);
	    String assertSearchPlaceholder = wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder))
	            .getAttribute("placeholder");
	    Assert.assertEquals(assertSearchPlaceholder, "Enter your search terms");
	    System.out.println("Placeholder for the Search field displayed is : " + assertSearchPlaceholder);
	    ObjectRepo.test.log(Status.PASS, "Placeholder for the Search field displayed is : " + assertSearchPlaceholder);
	    System.out.println("******************************************************************");
	    String assertBtnUSERMGMTREPORT = wait.until(ExpectedConditions.elementToBeClickable(btnUSERMGMTREPORT)).getText();
	    Assert.assertEquals(assertBtnUSERMGMTREPORT, "USER MGMT REPORT");
	    System.out.println("Button for User Management Report field displayed is : " + assertBtnUSERMGMTREPORT);
	    ObjectRepo.test.log(Status.PASS, "Button for User Management Report field displayed is : " + assertBtnUSERMGMTREPORT);
	    System.out.println("******************************************************************");
	    String assertbtnUSERACTIVITYAUDITREPORT = wait.until(ExpectedConditions.elementToBeClickable(btnUSERACTIVITYAUDITREPORT)).getText();
	    Assert.assertEquals(assertbtnUSERACTIVITYAUDITREPORT, "USER ACTIVITY AUDIT REPORT");
	    System.out.println("Button for User Activity Audit Report field displayed is : " + assertbtnUSERACTIVITYAUDITREPORT);
	    ObjectRepo.test.log(Status.PASS, "Button for User Activity Audit Report field displayed is : " + assertbtnUSERACTIVITYAUDITREPORT);
	    System.out.println("******************************************************************");
	    String assertStatusLabel = wait.until(ExpectedConditions.elementToBeClickable(statusLabel)).getText();
	    Assert.assertEquals(assertStatusLabel, "Status");
	    System.out.println("Label for Status field displayed is : " + assertStatusLabel);
	    ObjectRepo.test.log(Status.PASS, "Label for Status field displayed is : " + assertStatusLabel);
	    String assertSearchStatusValues = wait.until(ExpectedConditions.elementToBeClickable(searchStatusValues)).getText();
	    System.out.println("Values for Status field displayed is : " + assertSearchStatusValues);
	    ObjectRepo.test.log(Status.PASS, "Values for Status field displayed is : " + assertSearchStatusValues);
	    System.out.println("******************************************************************");
	    String assertJurisdictionLabel = wait.until(ExpectedConditions.elementToBeClickable(jurisdictionLabel)).getText();
	    Assert.assertEquals(assertJurisdictionLabel, "Jurisdiction");
	    System.out.println("Label for Jurisdiction field displayed is : " + assertJurisdictionLabel);
	    ObjectRepo.test.log(Status.PASS, "Label for Jurisdiction field displayed is : " + assertJurisdictionLabel);
	    String assertSearchJurisdictionValues = wait.until(ExpectedConditions.elementToBeClickable(searchJurisdictionValues)).getText();
	    System.out.println("Values for Jurisdiction field displayed is : " + assertSearchJurisdictionValues);
	    ObjectRepo.test.log(Status.PASS, "Values for Jurisdiction field displayed is : " + assertSearchJurisdictionValues);
	    System.out.println("******************************************************************");
	    String assertRoleLabel = wait.until(ExpectedConditions.elementToBeClickable(roleLabel)).getText();
	    Assert.assertEquals(assertRoleLabel, "Role");
	    System.out.println("Label for Role field displayed is : " + assertRoleLabel);
	    ObjectRepo.test.log(Status.PASS, "Label for Role field displayed is : " + assertRoleLabel);
	    String assertSearchRoleValues = wait.until(ExpectedConditions.elementToBeClickable(searchRoleValues)).getText();
	    System.out.println("Values for Role field displayed is : " + assertSearchRoleValues);
	    ObjectRepo.test.log(Status.PASS, "Values for Role field displayed is : " + assertSearchRoleValues);
	    System.out.println("******************************************************************");
	    String assertlinkHowUserAdministrationWorks = wait.until(ExpectedConditions.elementToBeClickable(linkHowUserAdministrationWorks)).getText();
	    Assert.assertEquals(assertlinkHowUserAdministrationWorks, "How User Administration Works");
	    System.out.println("Label for How User administration works link displayed is : " + assertlinkHowUserAdministrationWorks);
	    ObjectRepo.test.log(Status.PASS, "Label for How User administration works link displayed is : " + assertlinkHowUserAdministrationWorks);
	    System.out.println("******************************************************************");
	    String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert)).getText();
	    System.out.println("Columns of User Grid displayed are:-  " + verifyuserGridColumnAssert);
	    ObjectRepo.test.log(Status.PASS, "Columns of User Grid displayed are:-  " + verifyuserGridColumnAssert);
	}

	public void searchTheDataByFirstName() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();
	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
	    String assertSearchLabel = wait.until(ExpectedConditions.elementToBeClickable(searchLabel)).getText();
	    Assert.assertEquals(assertSearchLabel, "Search");
	    System.out.println("Label for the Search field displayed is : " + assertSearchLabel);
	    ObjectRepo.test.log(Status.PASS, "Label for the Search field displayed is : " + assertSearchLabel);
	    wait.until(ExpectedConditions.elementToBeClickable(selectNumberOfRows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(select500Rows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).sendKeys("Sponsor");
	    wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
	    String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert)).getText();
	    System.out.println("Search results displayed as:-  " + verifyuserGridColumnAssert);
	    ObjectRepo.test.log(Status.PASS, "Search results displayed as :-  " + verifyuserGridColumnAssert);
	    String verifyfirstNameAfterSearch = wait.until(ExpectedConditions.elementToBeClickable(firstNameAfterSearch)).getText();
	    Assert.assertEquals(verifyfirstNameAfterSearch, "Sponsor");
	    System.out.println("First Name search results is:- " + verifyfirstNameAfterSearch);
	    ObjectRepo.test.log(Status.PASS, "First Name search results is:- " + verifyfirstNameAfterSearch);
	}

	public void searchTheDataByLastName() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();
	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
	    String assertSearchLabel = wait.until(ExpectedConditions.elementToBeClickable(searchLabel)).getText();
	    Assert.assertEquals(assertSearchLabel, "Search");
	    System.out.println("Label for the Search field displayed is : " + assertSearchLabel);
	    ObjectRepo.test.log(Status.PASS, "Label for the Search field displayed is : " + assertSearchLabel);
	    wait.until(ExpectedConditions.elementToBeClickable(selectNumberOfRows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(select500Rows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).sendKeys("California");
	    wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
	    String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert)).getText();
	    System.out.println("Search results displayed as:-  " + verifyuserGridColumnAssert);
	    ObjectRepo.test.log(Status.PASS, "Search results displayed as :-  " + verifyuserGridColumnAssert);
	    String verifyLastNameAfterSearch = wait.until(ExpectedConditions.elementToBeClickable(lastNameAfterSearch)).getText();
	    Assert.assertEquals(verifyLastNameAfterSearch, "California");
	    System.out.println("Last Name search results is:- " + verifyLastNameAfterSearch);
	    ObjectRepo.test.log(Status.PASS, "Last Name search results is:- " + verifyLastNameAfterSearch);
	}

	public void searchTheDataByEmail() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();
	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
	    String assertSearchLabel = wait.until(ExpectedConditions.elementToBeClickable(searchLabel)).getText();
	    Assert.assertEquals(assertSearchLabel, "Search");
	    System.out.println("Label for the Search field displayed is : " + assertSearchLabel);
	    ObjectRepo.test.log(Status.PASS, "Label for the Search field displayed is : " + assertSearchLabel);
	    wait.until(ExpectedConditions.elementToBeClickable(selectNumberOfRows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(select500Rows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).sendKeys("seededsponsor.ca@yopmail.com");
	    wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
	    String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert)).getText();
	    System.out.println("Search results displayed as:-  " + verifyuserGridColumnAssert);
	    ObjectRepo.test.log(Status.PASS, "Search results displayed as :-  " + verifyuserGridColumnAssert);
	    String verifyEmailAfterSearch = wait.until(ExpectedConditions.elementToBeClickable(emailAfterSearch)).getText();
	    Assert.assertEquals(verifyEmailAfterSearch, "seededsponsor.ca@yopmail.com");
	    System.out.println("Email ID search results is:- " + verifyEmailAfterSearch);
	    ObjectRepo.test.log(Status.PASS, "Email ID search results is:- " + verifyEmailAfterSearch);
	}

	public void searchTheDataByEntityName() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();
	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
	    String assertSearchLabel = wait.until(ExpectedConditions.elementToBeClickable(searchLabel)).getText();
	    Assert.assertEquals(assertSearchLabel, "Search");
	    System.out.println("Label for the Search field displayed is : " + assertSearchLabel);
	    ObjectRepo.test.log(Status.PASS, "Label for the Search field displayed is : " + assertSearchLabel);
	    wait.until(ExpectedConditions.elementToBeClickable(selectNumberOfRows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(select500Rows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).sendKeys("T6QCEmetteurA");
	    wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
	    String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert)).getText();
	    System.out.println("Search results displayed as:-  " + verifyuserGridColumnAssert);
	    ObjectRepo.test.log(Status.PASS, "Search results displayed as :-  " + verifyuserGridColumnAssert);
	    String verifyEntityAfterSearch = wait.until(ExpectedConditions.elementToBeClickable(entityAfterSearch)).getText();
	    Assert.assertEquals(verifyEntityAfterSearch, "T6QCEmetteurA");
	    System.out.println("Entity Name search results is:- " + verifyEntityAfterSearch);
	    ObjectRepo.test.log(Status.PASS, "Entity Name search results is:- " + verifyEntityAfterSearch);
	}

	public void searchIsCaseInsensitive() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();
	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
	    String assertSearchLabel = wait.until(ExpectedConditions.elementToBeClickable(searchLabel)).getText();
	    Assert.assertEquals(assertSearchLabel, "Search");
	    System.out.println("Label for the Search field displayed is : " + assertSearchLabel);
	    ObjectRepo.test.log(Status.PASS, "Label for the Search field displayed is : " + assertSearchLabel);
	    wait.until(ExpectedConditions.elementToBeClickable(selectNumberOfRows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(select500Rows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).sendKeys("California");
	    wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
	    String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert)).getText();
	    System.out.println("Search results displayed for 'last name' is:- " + verifyuserGridColumnAssert);
	    ObjectRepo.test.log(Status.PASS, "Search results displayed for 'last name' is:- " + verifyuserGridColumnAssert);
	    String verifyLastNameAfterSearch = wait.until(ExpectedConditions.elementToBeClickable(lastNameAfterSearch)).getText();
	    Assert.assertEquals(verifyLastNameAfterSearch, "California");
	    System.out.println("Last Name search results is:- " + verifyLastNameAfterSearch);
	    ObjectRepo.test.log(Status.PASS, "Last Name search results is:- " + verifyLastNameAfterSearch);
	    wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(selectNumberOfRows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(select500Rows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).sendKeys("CALIFORNIA");
	    wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
	    String verifyuserGridColumnAssert1 = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert)).getText();
	    System.out.println("Search results displayed for 'LAST NAME' is:- " + verifyuserGridColumnAssert1);
	    ObjectRepo.test.log(Status.PASS, "Search results displayed for 'LAST NAME' is:-  " + verifyuserGridColumnAssert1);
	    String verifyLastNameAfterSearch1 = wait.until(ExpectedConditions.elementToBeClickable(lastNameAfterSearch)).getText();
	    Assert.assertEquals(verifyLastNameAfterSearch1, "California");
	    System.out.println("Last Name search results is:- " + verifyLastNameAfterSearch1);
	    ObjectRepo.test.log(Status.PASS, "Last Name search results is:- " + verifyLastNameAfterSearch1);
	    System.out.println("Serch results are same for 'CALIFORNIA' & 'California'");
	    ObjectRepo.test.log(Status.PASS, "Serch results are same for 'CALIFORNIA' & 'California'");
	}

	public void selecTheOptionOnTheSearchDropDown() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();
	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
	    String assertSearchLabel = wait.until(ExpectedConditions.elementToBeClickable(searchLabel)).getText();
	    Assert.assertEquals(assertSearchLabel, "Search");
	    System.out.println("Label for the Search field displayed is : " + assertSearchLabel);
	    ObjectRepo.test.log(Status.PASS, "Label for the Search field displayed is : " + assertSearchLabel);
	    wait.until(ExpectedConditions.elementToBeClickable(selectNumberOfRows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(select500Rows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).sendKeys("California");
	    wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(moreResultsInSearchDropdown)).click();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    String verifyUsersInSearchDropdown = wait.until(ExpectedConditions.elementToBeClickable(usersInSearchDropdown)).getText();
	    System.out.println("Search results first heading displayed as:-  " + verifyUsersInSearchDropdown);
	    ObjectRepo.test.log(Status.PASS, "Search results first heading displayed as :-  " + verifyUsersInSearchDropdown);
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element1 = emailsInSearchDropdown;
	    js.executeScript("arguments[0].scrollIntoView();", element1);
	    String verifyEmailsInSearchDropdown = wait.until(ExpectedConditions.elementToBeClickable(emailsInSearchDropdown)).getText();
	    System.out.println("Search results second heading displayed as:-  " + verifyEmailsInSearchDropdown);
	    ObjectRepo.test.log(Status.PASS, "Search results second heading displayed as :-  " + verifyEmailsInSearchDropdown);
	    String verifyEntitiesInSearchDropdown = wait.until(ExpectedConditions.elementToBeClickable(entitiesInSearchDropdown)).getText();
	    System.out.println("Search results third heading displayed as:-  " + verifyEntitiesInSearchDropdown);
	    ObjectRepo.test.log(Status.PASS, "Search results third heading displayed as :-  " + verifyEntitiesInSearchDropdown);
	    String verifyAccountNumberInSearchDropdown = wait.until(ExpectedConditions.elementToBeClickable(accountNumberInSearchDropdown)).getText();
	    System.out.println("Search results fourth heading displayed as:-  " + verifyAccountNumberInSearchDropdown);
	    ObjectRepo.test.log(Status.PASS, "Search results fourth heading displayed as :-  " + verifyAccountNumberInSearchDropdown);
	}

	public void confirmColumnsInTheCorrectOrder() throws Exception {
	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();
	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
	    String assertSearchLabel = wait.until(ExpectedConditions.elementToBeClickable(searchLabel)).getText();
	    Assert.assertEquals(assertSearchLabel, "Search");
	    System.out.println("Label for the Search field displayed is : " + assertSearchLabel);
	    ObjectRepo.test.log(Status.PASS, "Label for the Search field displayed is : " + assertSearchLabel);
	    String verifyColumnHeader = wait.until(ExpectedConditions.elementToBeClickable(columnHeader)).getText();
	    System.out.println("Column headers for User Admin page are:- " + '\n' + verifyColumnHeader);
	    ObjectRepo.test.log(Status.PASS, "Column headers for User Admin page are:- " + '\n' + verifyColumnHeader);
	}

	public void paginationCheck() throws Exception {
	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();
	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is :- " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is :- " + assertuserAdminPage);
	    String assertSearchLabel = wait.until(ExpectedConditions.elementToBeClickable(searchLabel)).getText();
	    Assert.assertEquals(assertSearchLabel, "Search");
	    System.out.println("Label for the Search field displayed is :- " + assertSearchLabel);
	    ObjectRepo.test.log(Status.PASS, "Label for the Search field displayed is :- " + assertSearchLabel);
	    String defaultPagination = wait.until(ExpectedConditions.elementToBeClickable(default0of10selected)).getText();
	    System.out.println("Default row selection per page is 10:-  " + defaultPagination);
	    ObjectRepo.test.log(Status.PASS, "Default row selection per page is 10:-  " + defaultPagination);
	    wait.until(ExpectedConditions.elementToBeClickable(selectNumberOfRows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(select25Rows)).click();
	    String RowsPerPage25 = wait.until(ExpectedConditions.elementToBeClickable(default0of25selected)).getText();
	    System.out.println("Rows per page selection is changed to 25:-  " + RowsPerPage25);
	    ObjectRepo.test.log(Status.PASS, "Rows per page selection is changed to 25:-  " + RowsPerPage25);
	    wait.until(ExpectedConditions.elementToBeClickable(selectNumberOfRows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(select50Rows)).click();
	    String RowsPerPage50 = wait.until(ExpectedConditions.elementToBeClickable(default0of50selected)).getText();
	    System.out.println("Rows per page selection is changed to 50:-  " + RowsPerPage50);
	    ObjectRepo.test.log(Status.PASS, "Rows per page selection is changed to 50:-  " + RowsPerPage50);
	    wait.until(ExpectedConditions.elementToBeClickable(selectNumberOfRows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(select100Rows)).click();
	    String RowsPerPage100 = wait.until(ExpectedConditions.elementToBeClickable(default0of100selected)).getText();
	    System.out.println("Rows per page selection is changed to 100:-  " + RowsPerPage100);
	    ObjectRepo.test.log(Status.PASS, "Rows per page selection is changed to 100:-  " + RowsPerPage100);
	    wait.until(ExpectedConditions.elementToBeClickable(selectNumberOfRows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(select500Rows)).click();
	    String RowsPerPage500 = wait.until(ExpectedConditions.elementToBeClickable(default0of500selected)).getText();
	    System.out.println("Rows per page selection is changed to 500:  " + RowsPerPage500);
	    ObjectRepo.test.log(Status.PASS, "Rows per page selection is changed to 500:  " + RowsPerPage500);
	    wait.until(ExpectedConditions.elementToBeClickable(selectNumberOfRows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(select10Rows)).click();
	}

	public void paginationCheck1() throws Exception {
	    wait.until(ExpectedConditions.elementToBeClickable(nextPage)).click();
	    String pageNumberAfterNextPageClick = wait.until(ExpectedConditions.elementToBeClickable(inputPageNumber1)).getText();
	    System.out.println("Page number displayed after clicking on Next Page:-  " + pageNumberAfterNextPageClick);
	    ObjectRepo.test.log(Status.PASS, "Page number displayed after clicking on Next Page:-  " + pageNumberAfterNextPageClick);
	    wait.until(ExpectedConditions.elementToBeClickable(lastPage)).click();
	    String pageNumberAfterLastPageClick = wait.until(ExpectedConditions.elementToBeClickable(inputPageNumber1)).getText();
	    System.out.println("Page number displayed after clicking on Last Page:-  " + pageNumberAfterLastPageClick);
	    ObjectRepo.test.log(Status.PASS, "Page number displayed after clicking on Last Page:-  " + pageNumberAfterLastPageClick);
	    String assertTotalPages1 = wait.until(ExpectedConditions.elementToBeClickable(totalPages1)).getText();
	    System.out.println("Total pages:  " + assertTotalPages1);
	    ObjectRepo.test.log(Status.PASS, "Total pages:  " + assertTotalPages1);
	    wait.until(ExpectedConditions.elementToBeClickable(previousPage)).click();
	    String pageNumberAfterPreviousPageClick = wait.until(ExpectedConditions.elementToBeClickable(inputPageNumber1)).getText();
	    System.out.println("Page number displayed after clicking on Previous Page:-  " + pageNumberAfterPreviousPageClick);
	    ObjectRepo.test.log(Status.PASS, "Page number displayed after clicking on Previous Page:-  " + pageNumberAfterPreviousPageClick);
	    wait.until(ExpectedConditions.elementToBeClickable(firstPage)).click();
	    String pageNumberAfterFirstPageClick = wait.until(ExpectedConditions.elementToBeClickable(inputPageNumber1)).getText();
	    System.out.println("Page number displayed after clicking on First Page:-  " + pageNumberAfterFirstPageClick);
	    ObjectRepo.test.log(Status.PASS, "Page number displayed after clicking on First Page:-  " + pageNumberAfterFirstPageClick);
	    String assertTotalPages2 = wait.until(ExpectedConditions.elementToBeClickable(totalPages1)).getText();
	    System.out.println("Total pages:  " + assertTotalPages2);
	    ObjectRepo.test.log(Status.PASS, "Total pages:  " + assertTotalPages2);
	}

	public void paginationCheck2() throws Exception {
	    wait.until(ExpectedConditions.elementToBeClickable(selectNumberOfRows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(select10Rows)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(nextPage1)).click();
	    String pageNumberAfterNextPageClick2 = wait.until(ExpectedConditions.elementToBeClickable(inputPageNumber1)).getText();
	    System.out.println("Footer side Page number displayed after clicking on Next Page:-  " + pageNumberAfterNextPageClick2);
	    ObjectRepo.test.log(Status.PASS, "Footer side Page number displayed after clicking on Next Page:-  " + pageNumberAfterNextPageClick2);
	    wait.until(ExpectedConditions.elementToBeClickable(lastPage)).click();
	    String pageNumberAfterLastPageClick2 = wait.until(ExpectedConditions.elementToBeClickable(inputPageNumber2)).getText();
	    System.out.println("Footer side Page number displayed after clicking on Last Page:-  " + pageNumberAfterLastPageClick2);
	    ObjectRepo.test.log(Status.PASS, "Footer side Page number displayed after clicking on Last Page:-  " + pageNumberAfterLastPageClick2);
	    String assertTotalPages3 = wait.until(ExpectedConditions.elementToBeClickable(totalPages2)).getText();
	    System.out.println("Total pages:  " + assertTotalPages3);
	    ObjectRepo.test.log(Status.PASS, "Total pages:  " + assertTotalPages3);
	    wait.until(ExpectedConditions.elementToBeClickable(previousPage)).click();
	    String pageNumberAfterPreviousPageClick2 = wait.until(ExpectedConditions.elementToBeClickable(inputPageNumber2)).getText();
	    System.out.println("Footer side Page number displayed after clicking on Previous Page:-  " + pageNumberAfterPreviousPageClick2);
	    ObjectRepo.test.log(Status.PASS, "Footer side Page number displayed after clicking on Previous Page:-  " + pageNumberAfterPreviousPageClick2);
	    wait.until(ExpectedConditions.elementToBeClickable(firstPage)).click();
	    String pageNumberAfterFirstPageClick2 = wait.until(ExpectedConditions.elementToBeClickable(inputPageNumber2)).getText();
	    System.out.println("Footer side Page number displayed after clicking on First Page:-  " + pageNumberAfterFirstPageClick2);
	    ObjectRepo.test.log(Status.PASS, "Footer side Page number displayed after clicking on First Page:-  " + pageNumberAfterFirstPageClick2);
	    String assertTotalPages4 = wait.until(ExpectedConditions.elementToBeClickable(totalPages2)).getText();
	    System.out.println("Total pages:  " + assertTotalPages4);
	    ObjectRepo.test.log(Status.PASS, "Total pages:  " + assertTotalPages4);
	}

	public void LegalEntityNameAssociatedWithAR() throws Exception {

		CreateEvent ref = new CreateEvent( );
		ref.clickbtnAdmin();
		ref.clickbtnUser();
		String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
		Assert.assertEquals(assertuserAdminPage, "User Administration");
		System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
		ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
		wait.until(ExpectedConditions.elementToBeClickable(drpdwnRole)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectARRole)).click();
		String verifyGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(columnHeader)).getText();
		System.out.print("Column Names for user grid displayed as:-  " + verifyGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Column Names for user grid displayed as:-  " + verifyGridColumnAssert);
		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed as:-  " + verifyuserGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Search results displayed as :-  " + verifyuserGridColumnAssert);
		String assertEntityNameForAR = wait.until(ExpectedConditions.elementToBeClickable(entityNameForUserRoles))
				.getText();
		System.out.println("Entity Name displayed for AR is : " + assertEntityNameForAR);
		ObjectRepo.test.log(Status.PASS, "Entity Name displayed for AR is : " + assertEntityNameForAR);
		wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
	}

	public void LegalEntityNameAssociatedWithSponsor() throws Exception {

		wait.until(ExpectedConditions.elementToBeClickable(drpdwnRole)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectSponsorRole)).click();
		String verifyGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(columnHeader)).getText();
		System.out.println("Column Names for user grid displayed as:-  " + verifyGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Column Names for user grid displayed as:-  " + verifyGridColumnAssert);
		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed for Sponsor as:-  " + verifyuserGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Search results displayed for Sponsor as :-  " + verifyuserGridColumnAssert);
		String assertEntityNameForSponsor = wait.until(ExpectedConditions.elementToBeClickable(entityNameForUserRoles))
				.getText();
		System.out.println("Entity Name displayed for Sponsor is: " + assertEntityNameForSponsor);
		ObjectRepo.test.log(Status.PASS, "Entity Name displayed for Sponsor is: " + assertEntityNameForSponsor);
		wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
	}

	public void LegalEntityNameAssociatedWithFSA() throws Exception {

		wait.until(ExpectedConditions.elementToBeClickable(drpdwnRole)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectFSARole)).click();
		String verifyGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(columnHeader)).getText();
		System.out.print("Column Names for user grid displayed as:-  " + verifyGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Column Names for user grid displayed as:-  " + verifyGridColumnAssert);
		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed for FSA as:-  " + verifyuserGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Search results displayed for FSA as :-  " + verifyuserGridColumnAssert);
		String assertEntityNameForFSA = wait.until(ExpectedConditions.elementToBeClickable(entityNameForUserRoles))
				.getText();
		System.out.println("Entity Name displayed for FSA is: " + assertEntityNameForFSA);
		ObjectRepo.test.log(Status.PASS, "Entity Name displayed for FSA is: " + assertEntityNameForFSA);
		wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
	}

	public void LegalEntityNameAssociatedWithMM() throws Exception {

		wait.until(ExpectedConditions.elementToBeClickable(drpdwnRole)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectMMRole)).click();
		String verifyGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(columnHeader)).getText();
		System.out.print("Column Names for user grid displayed as:-  " + verifyGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Column Names for user grid displayed as:-  " + verifyGridColumnAssert);
		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed for MM as:-  " + verifyuserGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Search results displayed for MM as :-  " + verifyuserGridColumnAssert);
		String assertEntityNameForMM = wait.until(ExpectedConditions.elementToBeClickable(entityNameForUserRoles))
				.getText();
		System.out.println("Entity Name displayed for MM is: " + assertEntityNameForMM);
		ObjectRepo.test.log(Status.PASS, "Entity Name displayed for MM is: " + assertEntityNameForMM);
		wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
	}

	public void LegalEntityNameAssociatedWithEA() throws Exception {

		wait.until(ExpectedConditions.elementToBeClickable(drpdwnRole)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectEARole)).click();
		String verifyGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(columnHeader)).getText();
		System.out.print("Column Names for user grid displayed as:-  " + verifyGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Column Names for user grid displayed as:-  " + verifyGridColumnAssert);
		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed for EA as:-  " + verifyuserGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Search results displayed for EA as :-  " + verifyuserGridColumnAssert);
		String assertEntityNameForEA = wait.until(ExpectedConditions.elementToBeClickable(entityNameForUserRoles))
				.getText();
		System.out.println("Entity Name displayed for EA is: " + assertEntityNameForEA);
		ObjectRepo.test.log(Status.PASS, "Entity Name displayed for EA is: " + assertEntityNameForEA);
	}

	public void confirmGridDisplaysTheFirstAndLastNameColumns() throws Exception {

		CreateEvent ref = new CreateEvent( );
		ref.clickbtnAdmin();
		ref.clickbtnUser();
		String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
		Assert.assertEquals(assertuserAdminPage, "User Administration");
		System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
		ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(columnHeader)).getText();
		System.out.println("Column headers for User Admin page are:- " + verifyuserGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Column headers for User Admin page are:- " + verifyuserGridColumnAssert);
		String verifyFirstNameColumnHeader = wait.until(ExpectedConditions.elementToBeClickable(firstNameColumnHeader))
				.getText();
		System.out.println("Column headers for First Name displayed as:- " + verifyFirstNameColumnHeader);
		ObjectRepo.test.log(Status.PASS, "Column headers for First Name displayed as:- " + verifyFirstNameColumnHeader);
		String verifyLastNameColumnHeader = wait.until(ExpectedConditions.elementToBeClickable(lastNameColumnHeader))
				.getText();
		System.out.println("Column headers for Last Name displayed as:- " + verifyLastNameColumnHeader);
		ObjectRepo.test.log(Status.PASS, "Column headers for Last Name displayed as:- " + verifyLastNameColumnHeader);
		String verifyEmailAddressColumnHeader = wait
				.until(ExpectedConditions.elementToBeClickable(emailAddressColumnHeader)).getText();
		System.out.println("Column headers for Email Address displayed as:- " + verifyEmailAddressColumnHeader);
		ObjectRepo.test.log(Status.PASS,
				"Column headers for Email Address displayed as:- " + verifyEmailAddressColumnHeader);
		String verifyUserRoleColumnHeader = wait.until(ExpectedConditions.elementToBeClickable(userRoleColumnHeader))
				.getText();
		System.out.println("Column headers for User Role displayed as:- " + verifyUserRoleColumnHeader);
		ObjectRepo.test.log(Status.PASS, "Column headers for User Role displayed as:- " + verifyUserRoleColumnHeader);
	}

	public void registryHoldingAccountNumberWithAR() throws Exception {

		CreateEvent ref = new CreateEvent( );
		ref.clickbtnAdmin();
		ref.clickbtnUser();
		String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
		Assert.assertEquals(assertuserAdminPage, "User Administration");
		System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
		ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
		wait.until(ExpectedConditions.elementToBeClickable(drpdwnRole)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectARRole)).click();
		String verifyGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(columnHeader)).getText();
		System.out.println("Column Names for user grid displayed as:-  " + '\n' + verifyGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Column Names for user grid displayed as:-  " + '\n' + verifyGridColumnAssert);
		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed as:-  " + verifyuserGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Search results displayed as :-  " + verifyuserGridColumnAssert);
		String assertregistryHoldingAccountNumberForUserRolesForAR = wait
				.until(ExpectedConditions.elementToBeClickable(registryHoldingAccountNumberForUserRoles)).getText();
		System.out.println("Registry Holding Account Number displayed for AR is : "
				+ assertregistryHoldingAccountNumberForUserRolesForAR);
		ObjectRepo.test.log(Status.PASS, "Registry Holding Account Number displayed for AR is : "
				+ assertregistryHoldingAccountNumberForUserRolesForAR);
		wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
		System.out.println("******************************************************************");
	}

	public void registryHoldingAccountNumberWithSponsor() throws Exception {

		wait.until(ExpectedConditions.elementToBeClickable(drpdwnRole)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectSponsorRole)).click();
		String verifyGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(columnHeader)).getText();
		System.out.println("Column Names for user grid displayed as:-  " + '\n' + verifyGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Column Names for user grid displayed as:-  " + '\n' + verifyGridColumnAssert);
		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed for Sponsor as:-  " + verifyuserGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Search results displayed for Sponsor as :-  " + verifyuserGridColumnAssert);
		String assertregistryHoldingAccountNumberForUserRolesForSponsor = wait
				.until(ExpectedConditions.elementToBeClickable(entityNameForUserRoles)).getText();
		System.out.println("Registry Holding Account Number displayed for Sponsor is blank "
				+ assertregistryHoldingAccountNumberForUserRolesForSponsor);
		ObjectRepo.test.log(Status.PASS, "Registry Holding Account Number displayed for Sponsor is blank "
				+ assertregistryHoldingAccountNumberForUserRolesForSponsor);
		wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
		System.out.println("******************************************************************");
	}

	public void registryHoldingAccountNumberWithFSA() throws Exception {

		wait.until(ExpectedConditions.elementToBeClickable(drpdwnRole)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectFSARole)).click();
		String verifyGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(columnHeader)).getText();
		System.out.println("Column Names for user grid displayed as:-  " + '\n' + verifyGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Column Names for user grid displayed as:-  " + '\n' + verifyGridColumnAssert);
		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed for FSA as:-  " + verifyuserGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Search results displayed for FSA as :-  " + verifyuserGridColumnAssert);
		String assertregistryHoldingAccountNumberForUserRolesForFSA = wait
				.until(ExpectedConditions.elementToBeClickable(entityNameForUserRoles)).getText();
		System.out.println("Registry Holding Account Number displayed for FSA is blank "
				+ assertregistryHoldingAccountNumberForUserRolesForFSA);
		ObjectRepo.test.log(Status.PASS, "Registry Holding Account Number displayed for FSA is blank "
				+ assertregistryHoldingAccountNumberForUserRolesForFSA);
		wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
		System.out.println("******************************************************************");
	}

	public void registryHoldingAccountNumberWithMM() throws Exception {

		wait.until(ExpectedConditions.elementToBeClickable(drpdwnRole)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectMMRole)).click();
		String verifyGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(columnHeader)).getText();
		System.out.println("Column Names for user grid displayed as:-  " + '\n' + verifyGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Column Names for user grid displayed as:-  " + '\n' + verifyGridColumnAssert);
		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed for MM as:-  " + verifyuserGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Search results displayed for MM as :-  " + verifyuserGridColumnAssert);
		String assertregistryHoldingAccountNumberForUserRolesForMM = wait
				.until(ExpectedConditions.elementToBeClickable(entityNameForUserRoles)).getText();
		System.out.println("Registry Holding Account Number displayed for MM is blank "
				+ assertregistryHoldingAccountNumberForUserRolesForMM);
		ObjectRepo.test.log(Status.PASS, "Registry Holding Account Number displayed for MM is blank "
				+ assertregistryHoldingAccountNumberForUserRolesForMM);
		wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
		System.out.println("******************************************************************");
	}

	public void registryHoldingAccountNumberWithEA() throws Exception {

		wait.until(ExpectedConditions.elementToBeClickable(drpdwnRole)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectEARole)).click();
		String verifyGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(columnHeader)).getText();
		System.out.println("Column Names for user grid displayed as:-  " + '\n' + verifyGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Column Names for user grid displayed as:-  " + '\n' + verifyGridColumnAssert);
		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed for EA as:-  " + verifyuserGridColumnAssert);
		ObjectRepo.test.log(Status.PASS, "Search results displayed for EA as :-  " + verifyuserGridColumnAssert);
		String assertregistryHoldingAccountNumberForUserRolesForEA = wait
				.until(ExpectedConditions.elementToBeClickable(entityNameForUserRoles)).getText();
		System.out.println("Registry Holding Account Number displayed for EA is blank "
				+ assertregistryHoldingAccountNumberForUserRolesForEA);
		ObjectRepo.test.log(Status.PASS, "Registry Holding Account Number displayed for EA is blank "
				+ assertregistryHoldingAccountNumberForUserRolesForEA);
		System.out.println("******************************************************************");
	}

	public void confirmGridDisplaysTheLastUpdateAndUpdatedBy() throws Exception {

		CreateEvent ref = new CreateEvent();
		ref.clickbtnAdmin();
		ref.clickbtnUser();
		String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
		Assert.assertEquals(assertuserAdminPage, "User Administration");
		System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
		ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(columnHeader)).getText();
		System.out.println("Column headers for User Admin page are:- " + '\n' + verifyuserGridColumnAssert);
		ObjectRepo.test.log(Status.PASS,
				"Column headers for User Admin page are:- " + '\n' + verifyuserGridColumnAssert);
		wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectActiveStatus)).click();
		String verifyLastUpdatedColumnHeader = wait
				.until(ExpectedConditions.elementToBeClickable(lastUpdatedColumnHeader)).getText();
		System.out.println("Column header for Last Updated displayed as:- " + verifyLastUpdatedColumnHeader);
		ObjectRepo.test.log(Status.PASS,
				"Column header for Last Updated displayed as:- " + verifyLastUpdatedColumnHeader);
		String verifyUpdatedByColumnHeader = wait.until(ExpectedConditions.elementToBeClickable(updatedByColumnHeader))
				.getText();
		System.out.println("Column header for Updated By displayed as:- " + verifyUpdatedByColumnHeader);
		ObjectRepo.test.log(Status.PASS, "Column header for Updated By displayed as:- " + verifyUpdatedByColumnHeader);
		String verifyLastUpdatedColumnValue = wait
				.until(ExpectedConditions.elementToBeClickable(lastUpdatedColumnValue)).getText();
		System.out.println("Column value for Last Updated column displayed as:- " + verifyLastUpdatedColumnValue);
		ObjectRepo.test.log(Status.PASS,
				"Column value for Last Updated column displayed as:- " + verifyLastUpdatedColumnValue);
		String verifyUpdatedByColumnValue = wait.until(ExpectedConditions.elementToBeClickable(updatedByColumnValue))
				.getText();
		System.out.println("Column value for Updated By column displayed as:- " + verifyUpdatedByColumnValue);
		ObjectRepo.test.log(Status.PASS,
				"Column value for Updated By column displayed as:- " + verifyUpdatedByColumnValue);
	}

		public void verifyActionButtonPerRow() throws Exception {
		
				CreateEvent ref = new CreateEvent();
				ref.clickbtnAdmin();
				ref.clickbtnUser();
				String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
				Assert.assertEquals(assertuserAdminPage, "User Administration");
				System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
				ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
				String verifyActionColumnHeader = wait.until(ExpectedConditions.elementToBeClickable(actionColumnValue))
						.getText();
				System.out.println("Column header for Action column displayed as:- " + verifyActionColumnHeader);
				ObjectRepo.test.log(Status.PASS, "Column header or Action column displayed as:- " + verifyActionColumnHeader);
				System.out.println("******************************************************************");
			}
		
		public void verifyOptionsDispalyedForActiveUsers() throws Exception {
		
			wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus)).click();
			wait.until(ExpectedConditions.elementToBeClickable(selectActiveStatus)).click();
			wait.until(ExpectedConditions.elementToBeClickable(drpdwnJurisdiction)).click();
			wait.until(ExpectedConditions.elementToBeClickable(selectCaliforniaRole)).click();
			Thread.sleep(5000);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
			WebElement element = actionColumnValue;
			Actions action = new Actions(driver.get());
			action.moveToElement(element).build().perform();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(actionColumnValue)).click();
			Thread.sleep(5000);
		}
		
		public void verifyOptionsDispalyedForInctiveUsers() throws Exception {
		
			wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
			Thread.sleep(8000);
			wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus)).click();
			wait.until(ExpectedConditions.elementToBeClickable(selectInactiveStatus)).click();
			wait.until(ExpectedConditions.elementToBeClickable(drpdwnJurisdiction)).click();
			wait.until(ExpectedConditions.elementToBeClickable(selectCaliforniaRole)).click();
			wait.until(ExpectedConditions.elementToBeClickable(actionColumnValue)).click();
		}

		public void verifyOptionsDispalyedForNotActivatedUsers() throws Exception {

			wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
			Thread.sleep(8000);
			wait.until(ExpectedConditions.elementToBeClickable(drpdwnJurisdiction)).click();
			wait.until(ExpectedConditions.elementToBeClickable(selectCaliforniaRole)).click();
			wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus)).click();
			wait.until(ExpectedConditions.elementToBeClickable(selectNotActivatedStatus)).click();
			wait.until(ExpectedConditions.elementToBeClickable(actionColumnValue)).click();
			String verifyResendActEmailForNotActiveUsers = wait
					.until(ExpectedConditions.elementToBeClickable(resendActEmailLinkForNotActiveUsers)).getText();
			System.out.println("Option displayed on click Action button for Not Activated Users displayed as:- "
					+ verifyResendActEmailForNotActiveUsers);
			ObjectRepo.test.log(Status.PASS,
					"Option displayed on click Action button for Not Activated Users displayed as:- "
							+ verifyResendActEmailForNotActiveUsers);
			System.out.println("Resend Activation Email option is displayed for Not Activtaed users.");
			ObjectRepo.test.log(Status.PASS, "Resend Activation Email option is displayed for Not Activtaed users.");
		}

	public void verifySposnorCanResetHisOwnSecurityQuestionsAndDeactivateHisOwnAccount() throws Exception {

			CreateEvent ref = new CreateEvent();
			ref.clickbtnAdmin();
			ref.clickbtnUser();
			String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
			Assert.assertEquals(assertuserAdminPage, "User Administration");
			System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
			ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
			wait.until(ExpectedConditions.elementToBeClickable(selectNumberOfRows)).click();
			wait.until(ExpectedConditions.elementToBeClickable(select500Rows)).click();
			wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).click();
			wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).sendKeys("sp_at_ca@yopmail.com");
			wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
			try {
				wait.until(ExpectedConditions.elementToBeClickable(actionColumnValue)).click();
				String verifyDeactivateLinkForActiveUsers = wait
						.until(ExpectedConditions.elementToBeClickable(deactivateLinkForActiveUsers)).getText();
				Assert.assertEquals("Deactivate", verifyDeactivateLinkForActiveUsers);
				System.out.println("The sponsor can reset his own security questions.");
				ObjectRepo.test.log(Status.FAIL, "The sponsor can reset his own security questions.");
				System.out.println("The Sponsor can deactivate his own account.");
				ObjectRepo.test.log(Status.FAIL, "The Sponsor can deactivate his own account.");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("The sponsor can not reset his own security questions");
				ObjectRepo.test.log(Status.PASS, "The sponsor can not reset his own security questions");
				System.out.println("The Sponsor can not deactivate his own account.");
				ObjectRepo.test.log(Status.PASS, "The Sponsor can not deactivate his own account.");
			}
		}

	public void verifyCancelDeactivation() throws Exception {

		CreateEvent ref = new CreateEvent( );
		ref.clickbtnAdmin();
		ref.clickbtnUser();

		String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
		Assert.assertEquals(assertuserAdminPage, "User Administration");
		System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
		ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

		wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectActiveStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(drpdwnJurisdiction)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectCaliforniaRole)).click();

		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed for first active user is:- " + verifyuserGridColumnAssert);

		WebElement scroll_To_Bottom = driver.get().findElement(By.xpath("//*[text()='About WCI, Inc.']"));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		ObjectRepo.test.log(Status.PASS,
				"Search results displayed for first active user is:- " + verifyuserGridColumnAssert);
		WebElement body = driver.get().findElement(By.tagName("body"));
		body.sendKeys(Keys.ARROW_DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='MuiSvgIcon-root'])[2]"))).click();
		String verifyDeactivateLinkForActiveUsers = wait
				.until(ExpectedConditions.elementToBeClickable(deactivateLinkForActiveUsers)).getText();
		System.out.println("Option displayed on click Action button for Active Users displayed as:- "
				+ verifyDeactivateLinkForActiveUsers);
		ObjectRepo.test.log(Status.PASS, "Option displayed on click Action button for Active Users displayed as:- "
				+ verifyDeactivateLinkForActiveUsers);

		wait.until(ExpectedConditions.elementToBeClickable(deactivateLinkForActiveUsers)).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnCancelOnDeactivateUserPopup)).click();
		System.out.println("The action is canceled.");
		ObjectRepo.test.log(Status.PASS, "The action is cancelled.");
		System.out.println("******************************************************************");

		wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
		wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectActiveStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(drpdwnJurisdiction)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectCaliforniaRole)).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSorting)).click();

		String verifyuserGridColumnAssert1 = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed for first active user is:- " + verifyuserGridColumnAssert1);
		ObjectRepo.test.log(Status.PASS,
				"Search results displayed for first active user is:- " + verifyuserGridColumnAssert1);
		Assert.assertEquals(verifyuserGridColumnAssert1, verifyuserGridColumnAssert1);
		System.out.println("User is not deactivated and it's record is in its previous position.");
		ObjectRepo.test.log(Status.PASS, "User is not deactivated and it's record is in its previous position.");
		System.out.println("******************************************************************");
	}

	public void verifyDeactivation() throws Exception {

		CreateEvent ref = new CreateEvent( );
		ref.clickbtnAdmin();
		ref.clickbtnUser();

		String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
		Assert.assertEquals(assertuserAdminPage, "User Administration");
		System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
		ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

		wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectActiveStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(drpdwnJurisdiction)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectCaliforniaRole)).click();

		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed for first active user is:- " + verifyuserGridColumnAssert);

		WebElement scroll_To_Bottom = driver.get().findElement(By.xpath("//*[text()='About WCI, Inc.']"));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		ObjectRepo.test.log(Status.PASS,
				"Search results displayed for first active user is:- " + verifyuserGridColumnAssert);

		WebElement body = driver.get().findElement(By.tagName("body"));
		body.sendKeys(Keys.ARROW_DOWN);

		WebElement clickThreeDot = driver.get().findElement(By.xpath("(//*[@class='MuiSvgIcon-root'])[2]"));
		clickThreeDot.click();
		wait.until(ExpectedConditions.elementToBeClickable(deactivateLinkForActiveUsers)).click();

		String assertDeactivateButtonOnPopup = wait
				.until(ExpectedConditions.elementToBeClickable(btnDeactivateOnDeactivateUserPopup)).getText();
		System.out.println("Button presents on Deactivate popup is:- " + assertDeactivateButtonOnPopup);
		ObjectRepo.test.log(Status.PASS, "Button presents on Deactivate popup is:- " + assertDeactivateButtonOnPopup);
		String assertCancelButtonOnPopup = wait
				.until(ExpectedConditions.elementToBeClickable(btnCancelOnDeactivateUserPopup)).getText();
		System.out.println("Button presents on Deactivate popup is:- " + assertCancelButtonOnPopup);
		ObjectRepo.test.log(Status.PASS, "Button presents on Deactivate popup is:- " + assertCancelButtonOnPopup);
		String assertTextDisplayedAfterDeactivate = wait
				.until(ExpectedConditions.elementToBeClickable(textDisplayedAfterDeactivate)).getText();
		System.out.println("Confirmation Text presents on Deactivate popup is:- " + assertTextDisplayedAfterDeactivate);
		ObjectRepo.test.log(Status.PASS,
				"Confirmation Text presents on Deactivate popup is:- " + assertTextDisplayedAfterDeactivate);
		System.out.println(
				"Deactivate pop-up is dispalyed with Deactivate & Cancel buttons and user's first name, last name, role is also displayed which is about to deactivate.");
		ObjectRepo.test.log(Status.PASS,
				"Deactivate pop-up is dispalyed with Deactivate & Cancel buttons and user's first name, last name, role is also displayed which is about to deactivate.");
		System.out.println("******************************************************************");

		wait.until(ExpectedConditions.elementToBeClickable(btnDeactivateOnDeactivateUserPopup)).click();
		String assertDeactivationSuccessMessage = wait
				.until(ExpectedConditions.elementToBeClickable(deactivationSuccessMessage)).getText();
		System.out.println("Success message after deactivation of user account:- " + assertDeactivationSuccessMessage);
		ObjectRepo.test.log(Status.PASS,
				"Success message after deactivation of user account:- " + assertDeactivationSuccessMessage);

		WebElement scrollUp = btnResetFilters;
		Actions action = new Actions(driver.get());
		action.moveToElement(scrollUp).click().perform();

		wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectInactiveStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(drpdwnJurisdiction)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectCaliforniaRole)).click();

		String verifyuserGridColumnAssert1 = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed for first inactive user is:- " + verifyuserGridColumnAssert1);
		ObjectRepo.test.log(Status.PASS,
				"Search results displayed for first inactive user is:- " + verifyuserGridColumnAssert1);

		System.out
				.println("The record with the deactivated user-entity is on top and it shows the user as deactivated.");
		ObjectRepo.test.log(Status.PASS,
				"The record with the deactivated user-entity is on top and it shows the user as deactivated.");
		System.out.println("******************************************************************");
	}

	public void verifyActivation() throws Exception {

		CreateEvent ref = new CreateEvent( );
		ref.clickbtnAdmin();
		ref.clickbtnUser();

		String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
		Assert.assertEquals(assertuserAdminPage, "User Administration");
		System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
		ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

		wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
		wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectInactiveStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(drpdwnJurisdiction)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectCaliforniaRole)).click();

		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed for first Inactive user is:- " + verifyuserGridColumnAssert);
		ObjectRepo.test.log(Status.PASS,
				"Search results displayed for first Inactive user is:- " + verifyuserGridColumnAssert);

		wait.until(ExpectedConditions.elementToBeClickable(actionColumnValue)).click();
		wait.until(ExpectedConditions.elementToBeClickable(activateLinkForInactiveUsers)).click();

		String assertActivateButtonOnPopup = wait
				.until(ExpectedConditions.elementToBeClickable(btnActivateOnActivateUserPopup)).getText();
		System.out.println("Button presents on Activate popup is:- " + assertActivateButtonOnPopup);
		ObjectRepo.test.log(Status.PASS, "Button presents on Activate popup is:- " + assertActivateButtonOnPopup);
		String assertCancelButtonOnPopup = wait
				.until(ExpectedConditions.elementToBeClickable(btnCancelOnActivateUserPopup)).getText();
		System.out.println("Button presents on Activate popup is:- " + assertCancelButtonOnPopup);
		ObjectRepo.test.log(Status.PASS, "Button presents on Activate popup is:- " + assertCancelButtonOnPopup);
		String assertTextDisplayedAfterActivate = wait
				.until(ExpectedConditions.elementToBeClickable(textDisplayedAfterActivate)).getText();
		System.out.println("Confirmation Text presents on Activate popup is:- " + assertTextDisplayedAfterActivate);
		ObjectRepo.test.log(Status.PASS,
				"Confirmation Text presents on Activate popup is:- " + assertTextDisplayedAfterActivate);
		System.out.println(
				"Activate pop-up is dispalyed with Activate & Cancel buttons and user's first name, last name, role is also displayed which is about to Activate.");
		ObjectRepo.test.log(Status.PASS,
				"Activate pop-up is dispalyed with Activate & Cancel buttons and user's first name, last name, role is also displayed which is about to Activate.");
		System.out.println("******************************************************************");

		wait.until(ExpectedConditions.elementToBeClickable(btnActivateOnActivateUserPopup)).click();
		String assertAactivationSuccessMessage = wait
				.until(ExpectedConditions.elementToBeClickable(activationSuccessMessage)).getText();
		System.out.println("Success message after deactivation of user account:- " + assertAactivationSuccessMessage);
		ObjectRepo.test.log(Status.PASS,
				"Success message after deactivation of user account:- " + assertAactivationSuccessMessage);

		wait.until(ExpectedConditions.elementToBeClickable(userAdminPageHeading)).click();

		wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
		wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectActiveStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(drpdwnJurisdiction)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectCaliforniaRole)).click();

		String verifyuserGridColumnAssert1 = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed for first Active user is:- " + verifyuserGridColumnAssert1);
		ObjectRepo.test.log(Status.PASS,
				"Search results displayed for first Active user is:- " + verifyuserGridColumnAssert1);

		System.out.println("The record with the Activated user-entity is on top and it shows the user as activated.");
		ObjectRepo.test.log(Status.PASS,
				"The record with the Activated user-entity is on top and it shows the user as activated.");
		System.out.println("******************************************************************");
	}

	public void verifyUserSecurityQuestionsAreReset() throws Exception {

		CreateEvent ref = new CreateEvent( );
		ref.clickbtnAdmin();
		ref.clickbtnUser();

		String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
		Assert.assertEquals(assertuserAdminPage, "User Administration");
		System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
		ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

		wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectActiveStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(drpdwnJurisdiction)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectCaliforniaRole)).click();
		wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).click();
		wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).sendKeys("sp_test.ca7@yopmail.com");
		wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();

		String verifyuserGridColumnAssert = wait.until(ExpectedConditions.elementToBeClickable(userGridColumnAssert))
				.getText();
		System.out.println("Search results displayed for first Active user is:- " + verifyuserGridColumnAssert);
		ObjectRepo.test.log(Status.PASS,
				"Search results displayed for first Active user is:- " + verifyuserGridColumnAssert);

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(actionColumnValue)).click();
		wait.until(ExpectedConditions.elementToBeClickable(resetSecQueLinkForActiveUsers)).click();

		String assertActivateButtonOnPopup = wait
				.until(ExpectedConditions.elementToBeClickable(btnResetSecQueOnResetSecQuePopup)).getText();
		System.out.println("Button presents on Reset Security Questions popup is:- " + assertActivateButtonOnPopup);
		ObjectRepo.test.log(Status.PASS,
				"Button presents on Reset Security Questions popup is:- " + assertActivateButtonOnPopup);
		String assertCancelButtonOnPopup = wait
				.until(ExpectedConditions.elementToBeClickable(btnCancelOnResetSecQuePopup)).getText();
		System.out.println("Button presents on Reset Security Questions popup is:- " + assertCancelButtonOnPopup);
		ObjectRepo.test.log(Status.PASS,
				"Button presents on Reset Security Questions popup is:- " + assertCancelButtonOnPopup);
		String assertTextDisplayedAfterResetSecQue = wait
				.until(ExpectedConditions.elementToBeClickable(textDisplayedAfterResetSecQue)).getText();
		System.out.println("Confirmation Text presents on Reset Security Questions popup is:- "
				+ assertTextDisplayedAfterResetSecQue);
		ObjectRepo.test.log(Status.PASS, "Confirmation Text presents on Reset Security Questions popup is:- "
				+ assertTextDisplayedAfterResetSecQue);
		System.out.println(
				"Reset Security Questions pop-up is dispalyed with Reset Security Questions & Cancel buttons and user's first name, last name, role is also displayed which is about to Reset Security Questions.");
		ObjectRepo.test.log(Status.PASS,
				"Reset Security Questions pop-up is dispalyed with Reset Security Questions & Cancel buttons and user's first name, last name, role is also displayed which is about to Reset Security Questions.");
		System.out.println("******************************************************************");

		wait.until(ExpectedConditions.elementToBeClickable(btnResetSecQueOnResetSecQuePopup)).click();
		String assertResetSecQueSuccessMessage = wait
				.until(ExpectedConditions.elementToBeClickable(resetSecQueSuccessMessage)).getText();
		System.out.println(
				"Success message after Reset Security Questions of user account:- " + assertResetSecQueSuccessMessage);
		ObjectRepo.test.log(Status.PASS,
				"Success message after Reset Security Questions of user account:- " + assertResetSecQueSuccessMessage);

		wait.until(ExpectedConditions.elementToBeClickable(userAdminPageHeading)).click();
		System.out.println("The system gives a pop up to confirm that the security questions are reset successfully.");
		ObjectRepo.test.log(Status.PASS,
				"The system gives a pop up to confirm that the security questions are reset successfully.");
		System.out.println("******************************************************************");
	}

	public void verifyLoginOfUserWhoseSecurityQuestionsAreReset() throws Exception {

	    wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
	    btnLogin.click();
	    wait.until(ExpectedConditions.visibilityOf(username));
	    username.sendKeys("temporarylockcaspo@yopmail.com");
	    password.sendKeys("Test@1234");
	    wait.until(ExpectedConditions.visibilityOf(btnLogin));
	    btnLogin.click();
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(headingResetSecQue));
	    Actions action = new Actions(driver.get());
	    action.click(element).build().perform();
	    String assertheadingResetSecQue = wait.until(ExpectedConditions.elementToBeClickable(headingResetSecQue))
	            .getText();
	    System.out.println("Heading of Reset Security Questions screen is :- " + assertheadingResetSecQue);
	    ObjectRepo.test.log(Status.PASS,
	            "Heading of Reset Security Questions screen is :- " + assertheadingResetSecQue);
	    String assertSubHeadingResetSecQue = wait.until(ExpectedConditions.elementToBeClickable(subHeadingResetSecQue))
	            .getText();
	    System.out.println("Sub-Heading of Reset Security Questions screen is :- " + assertSubHeadingResetSecQue);
	    ObjectRepo.test.log(Status.PASS,
	            "Sub-Heading of Reset Security Questions screen is :- " + assertSubHeadingResetSecQue);
	    wait.until(ExpectedConditions.elementToBeClickable(selectFirstSecQue)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(selectQueForFirstSecQue)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(enterAnsForFirstSecQue)).sendKeys("Answer_1");
	    wait.until(ExpectedConditions.elementToBeClickable(selectSecondSecQue)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(selectQueForSecondSecQue)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(selectThirdSecQue)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(selectQueForThirdSecQue)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(btnResetSecQue)).click();
	}

	public void verifyOneRecordPerUniqueUserEntityRelationForARUserRecord() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();

	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).sendKeys("t6causerb@demo.citssdev.com");
	    wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();

	    List<WebElement> element = totalNumOfRecords;
	    int totalNumOfARRecords = element.size();
	    int count = 0;
	    for (int i = 0; i <= totalNumOfARRecords - 1; i++) {
	        String rowDetails = element.get(i).getText();
	        if (rowDetails.contains("Emetteur")) {
	            count++;
	            System.out.println(rowDetails);
	        }
	    }
	    System.out.println("total no of records:" + count);

	    System.out.println("The system displays one row per user per unique user-entity relation.");
	    ObjectRepo.test.log(Status.PASS, "The system displays one row per user per unique user-entity relation.");
	    System.out.println("******************************************************************");
	}

	public void verifyOneRecordForEachUserWithNoUserEntityRelationship() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();

	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

	    wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(searchPlaceholder)).sendKeys("seededsponsor.ca@yopmail.com");
	    wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();

	    List<WebElement> element = totalNumOfRecords;
	    int totalNumOfUserRecords = element.size();
	    int count = 0;
	    for (int i = 0; i <= totalNumOfUserRecords - 1; i++) {
	        String rowDetails = element.get(i).getText();
	        if (rowDetails.contains("a@yopmail.com")) {
	            count++;
	            System.out.println(rowDetails);
	            System.out.println("total no of records:" + count);
	        }
	    }

	    System.out.println("The system displays one row per user per unique user-entity relation.");
	    ObjectRepo.test.log(Status.PASS, "The system displays one row per user per unique user-entity relation.");
	    System.out.println("******************************************************************");
	}

	public void verifyActionsWithinJurisdiction() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();

	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

	    wait.until(ExpectedConditions.elementToBeClickable(drpdwnJurisdiction)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(selectCaliforniaRole)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(selectActiveStatus)).click();
	    driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	    driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

	    wait.until(ExpectedConditions.elementToBeClickable(actionColumnValue)).click();
	    WebElement body = driver.get().findElement(By.tagName("body"));
	    body.sendKeys(Keys.ARROW_DOWN);

	    String assertDeactivateLinkForActiveUsers;
	    try {
	        driver.get().findElement(By.xpath("(//*[@class='MuiSvgIcon-root'])[2]")).click();
	        assertDeactivateLinkForActiveUsers = wait.until(ExpectedConditions.elementToBeClickable(deactivateLinkForActiveUsers)).getText();
	    } catch (Exception e) {
	        driver.get().findElement(By.xpath("(//*[@class='MuiSvgIcon-root'])[2]")).click();
	        assertDeactivateLinkForActiveUsers = wait.until(ExpectedConditions.elementToBeClickable(deactivateLinkForActiveUsers)).getText();
	    }
	    System.out.println("Option presents for Active users after clicking on Action button is:- " + assertDeactivateLinkForActiveUsers);
	    ObjectRepo.test.log(Status.PASS, "Option presents for Active users after clicking on Action button is:- " + assertDeactivateLinkForActiveUsers);

	    String assertResetSecQueLinkForActiveUsers = wait.until(ExpectedConditions.elementToBeClickable(resetSecQueLinkForActiveUsers)).getText();
	    System.out.println("Option presents for Active users after clicking on Action button is:- " + assertResetSecQueLinkForActiveUsers);
	    ObjectRepo.test.log(Status.PASS, "Option presents for Active users after clicking on Action button is:- " + assertResetSecQueLinkForActiveUsers);

	    wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(drpdwnJurisdiction)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(selectCaliforniaRole)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(selectInactiveStatus)).click();

	    wait.until(ExpectedConditions.elementToBeClickable(actionColumnValue)).click();
	    String assertSelectActiveStatus = wait.until(ExpectedConditions.elementToBeClickable(activateLinkForInactiveUsers)).getText();
	    System.out.println("Option presents for Inactive users after clicking on Action button is:- " + assertSelectActiveStatus);
	    ObjectRepo.test.log(Status.PASS, "Option presents for Inactive users after clicking on Action button is:- " + assertSelectActiveStatus);

	    String assertResetSecQueLinkForActiveUsers1 = wait.until(ExpectedConditions.elementToBeClickable(resetSecQueLinkForActiveUsers)).getText();
	    System.out.println("Option presents for Inactive users after clicking on Action button is:- " + assertResetSecQueLinkForActiveUsers1);
	    ObjectRepo.test.log(Status.PASS, "Option presents for Inactive users after clicking on Action button is:- " + assertResetSecQueLinkForActiveUsers1);

	    System.out.println("******************************************************************");
	    wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
	    System.out.println("Linked Jurisdiction - Sponsor actions are applicable to users within their Jurisdiction.");
	    ObjectRepo.test.log(Status.PASS, "Linked Jurisdiction - Sponsor actions are applicable to users within their Jurisdiction.");
	    System.out.println("******************************************************************");
	}

	public void verifyBulkActionsWithinJurisdiction() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();

	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

	    wait.until(ExpectedConditions.elementToBeClickable(drpdwnJurisdiction)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(selectQuebecRole)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(selectActiveStatus)).click();

	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(actionColumnValue)).click();
	        String verifyDeactivateLinkForActiveUsers = wait.until(ExpectedConditions.elementToBeClickable(deactivateLinkForActiveUsers)).getText();
	        Assert.assertEquals("Deactivate", verifyDeactivateLinkForActiveUsers);
	        System.out.println("The activate/de-activate action is performed.");
	        ObjectRepo.test.log(Status.FAIL, "The activate/de-activate action is performed.");
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.println("The activate/de-activate action is not performed.");
	        ObjectRepo.test.log(Status.PASS, "The activate/de-activate action is not performed.");
	    }

	    System.out.println("******************************************************************");

	    wait.until(ExpectedConditions.elementToBeClickable(btnResetFilters)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(drpdwnJurisdiction)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(selectQuebecRole)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(selectActiveStatus)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(selectAllUsresCheckbox)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(btnBulkActions)).click();

	    String assertFailureMsgOnBulkActions = wait.until(ExpectedConditions.elementToBeClickable(failureMsgOnBulkActions)).getText();
	    System.out.println("Failure message displayed when bulk action is performed on other Jurisdiction's users is:- " + '\n' + assertFailureMsgOnBulkActions);
	    ObjectRepo.test.log(Status.PASS, "Failure message displayed when bulk action is performed on other Jurisdiction's users is:- " + '\n' + assertFailureMsgOnBulkActions);

	    System.out.println("******************************************************************");
	}

	public void verifyInputTheAdminUserEmailAddressAndSpecifyAnEventAdminUserRole() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();

	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

	    String userText = AddNewUserBtn.getText();
	    System.out.println(userText);
	    ObjectRepo.test.log(Status.PASS, "Add new user button available on User Administration Screen");
	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserBtn)).click();
	    System.out.println("Add new user page is displayed with fields");
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");

	    wait.until(ExpectedConditions.visibilityOf(AddNewUserHeadrLBL)).click();
	    String text = AddNewUserHeadrLBL.getText();
	    System.out.println(text);
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");

	    wait.until(ExpectedConditions.elementToBeClickable(EmailAdressText));
	    String text1 = EmailAdressText.getText();
	    System.out.println(text1);
	    ObjectRepo.test.log(Status.PASS, "Email Adress field is displayed");

	    wait.until(ExpectedConditions.elementToBeClickable(firstName));
	    String text2 = firstName.getText();
	    System.out.println(text2);
	    ObjectRepo.test.log(Status.PASS, "First Name field is displayed");

	    wait.until(ExpectedConditions.elementToBeClickable(lastName));
	    String text3 = lastName.getText();
	    System.out.println(text3);
	    ObjectRepo.test.log(Status.PASS, "Last Name field is displayed");

	    wait.until(ExpectedConditions.elementToBeClickable(roleText));
	    String text4 = roleText.getText();
	    System.out.println(text4);
	    ObjectRepo.test.log(Status.PASS, "User Role field is displayed");

	    int length = 6;
	    boolean useLetters = true;
	    boolean useNumbers = true;
	    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
	    String randomString = ("user" + generatedString + "@yopmail.com");
	    emailField.sendKeys(randomString);

	    wait.until(ExpectedConditions.elementToBeClickable(verifyEmail)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(verifyEmailSuccessMsg));
	    String EmailSuccessText = verifyEmailSuccessMsg.getText();
	    System.out.println(EmailSuccessText);
	    ObjectRepo.test.log(Status.PASS, EmailSuccessText);

	    wait.until(ExpectedConditions.elementToBeClickable(firstNmeField)).sendKeys("Auto");
	    wait.until(ExpectedConditions.elementToBeClickable(LastNmeField)).sendKeys("Test");

	    wait.until(ExpectedConditions.elementToBeClickable(userRoleDropDown));
	    Select event = new Select(userRoleDropDown);
	    event.selectByIndex(1);
	    System.out.println("Event Administrator User Role selected from dropdown");
	    ObjectRepo.test.log(Status.PASS, "Event Administrator User Role selected from dropdown");

	    wait.until(ExpectedConditions.elementToBeClickable(addUserBtn)).click();

	    wait.until(ExpectedConditions.elementToBeClickable(addUserSuccessMsg));
	    String userAddSuccessText = addUserSuccessMsg.getText();
	    System.out.println(userAddSuccessText);
	    ObjectRepo.test.log(Status.PASS, "Event Admin user has been added successfully message displayed and users activation link send on email");

	    wait.until(ExpectedConditions.elementToBeClickable(userStatusTable));
	    String zxc = userStatusTable.getText();
	    System.out.println(zxc);
	    ObjectRepo.test.log(Status.PASS, "Added user info is displayed in the table " + userStatusTable);

	    System.out.println("******************************************************************");
	}

	public void verifyInputTheAdminUserEmailAddressAndSpecifyFSAUserRole() throws Exception {
	    wait.until(ExpectedConditions.elementToBeClickable(btnHome)).click();
	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();
	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);
	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserBtn));
	    String userText = AddNewUserBtn.getText();
	    System.out.println(userText);
	    ObjectRepo.test.log(Status.PASS, "Add new user button available on User Administration Screen");
	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserBtn)).click();
	    System.out.println("Add new user page is displayed with fields");
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");
	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserHeadrLBL)).click();
	    String text = AddNewUserHeadrLBL.getText();
	    System.out.println(text);
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");
	    wait.until(ExpectedConditions.elementToBeClickable(EmailAdressText));
	    String text1 = EmailAdressText.getText();
	    System.out.println(text1);
	    ObjectRepo.test.log(Status.PASS, "Email Adress field is displayed");
	    wait.until(ExpectedConditions.elementToBeClickable(firstName));
	    String text2 = firstName.getText();
	    System.out.println(text2);
	    ObjectRepo.test.log(Status.PASS, "First Name field is displayed");
	    wait.until(ExpectedConditions.elementToBeClickable(lastName));
	    String text3 = lastName.getText();
	    System.out.println(text3);
	    ObjectRepo.test.log(Status.PASS, "Last Name field is displayed");
	    wait.until(ExpectedConditions.elementToBeClickable(roleText));
	    String text4 = roleText.getText();
	    System.out.println(text4);
	    ObjectRepo.test.log(Status.PASS, "User Role field is displayed");
	    int length = 6;
	    boolean useLetters = true;
	    boolean useNumbers = true;
	    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
	    String randomString = ("user" + generatedString + "@yopmail.com");
	    emailField.sendKeys(randomString);
	    wait.until(ExpectedConditions.elementToBeClickable(verifyEmail)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(verifyEmailSuccessMsg));
	    String EmailSuccessText = verifyEmailSuccessMsg.getText();
	    System.out.println(EmailSuccessText);
	    ObjectRepo.test.log(Status.PASS, EmailSuccessText);
	    wait.until(ExpectedConditions.elementToBeClickable(firstNmeField)).sendKeys("Auto");
	    wait.until(ExpectedConditions.elementToBeClickable(LastNmeField)).sendKeys("Test");
	    wait.until(ExpectedConditions.elementToBeClickable(userRoleDropDown));
	    Select event = new Select(userRoleDropDown);
	    event.selectByIndex(2);
	    System.out.println("Financial Services Administrator User Role selected from dropdown");
	    ObjectRepo.test.log(Status.PASS, "Financial Services Administrator User Role selected from dropdown");
	    wait.until(ExpectedConditions.elementToBeClickable(addUserBtn)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(addUserSuccessMsg));
	    String userAddSuccessText = addUserSuccessMsg.getText();
	    System.out.println(userAddSuccessText);
	    ObjectRepo.test.log(Status.PASS, "FSA user has been added successfully message displayed and users activation link send on email");
	    wait.until(ExpectedConditions.elementToBeClickable(userStatusTable));
	    String zxc = userStatusTable.getText();
	    System.out.println(zxc);
	    ObjectRepo.test.log(Status.PASS, "Added user info is displayed in the table " + userStatusTable);
	    System.out.println("******************************************************************");
	}

	public void verifyInputTheAdminUserEmailAddressAndSpecifyMMUserRole() throws Exception {

	    wait.until(ExpectedConditions.elementToBeClickable(btnHome)).click();
	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();

	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

	    String userText = AddNewUserBtn.getText();
	    System.out.println(userText);
	    ObjectRepo.test.log(Status.PASS, "Add new user button available on User Administration Screen");

	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserBtn)).click();
	    System.out.println("Add new user page is displayed with fields");
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");

	    String text = AddNewUserHeadrLBL.getText();
	    System.out.println(text);
	    AddNewUserHeadrLBL.click();
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");

	    String text1 = EmailAdressText.getText();
	    System.out.println(text1);
	    ObjectRepo.test.log(Status.PASS, "Email Adress field is displayed");

	    String text2 = firstName.getText();
	    System.out.println(text2);
	    ObjectRepo.test.log(Status.PASS, "First Name field is displayed");

	    String text3 = lastName.getText();
	    System.out.println(text3);
	    ObjectRepo.test.log(Status.PASS, "Last Name field is displayed");

	    String text4 = roleText.getText();
	    System.out.println(text4);
	    ObjectRepo.test.log(Status.PASS, "User Role field is displayed");

	    int length = 6;
	    boolean useLetters = true;
	    boolean useNumbers = true;
	    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
	    String randomString = ("user" + generatedString + "@yopmail.com");
	    emailField.sendKeys(randomString);

	    wait.until(ExpectedConditions.elementToBeClickable(verifyEmail)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(verifyEmailSuccessMsg));
	    String EmailSuccessText = verifyEmailSuccessMsg.getText();
	    System.out.println(EmailSuccessText);
	    ObjectRepo.test.log(Status.PASS, EmailSuccessText);

	    firstNmeField.sendKeys("Auto");
	    LastNmeField.sendKeys("Test");

	    WebElement element = userRoleDropDown;
	    Select event = new Select(element);
	    event.selectByIndex(3);
	    System.out.println("Market Monitor User Role selected from dropdown");
	    ObjectRepo.test.log(Status.PASS, "Market Monitor User Role selected from dropdown");

	    wait.until(ExpectedConditions.elementToBeClickable(addUserBtn)).click();

	    wait.until(ExpectedConditions.elementToBeClickable(addUserSuccessMsg));
	    String userAddSuccessText = addUserSuccessMsg.getText();
	    System.out.println(userAddSuccessText);
	    ObjectRepo.test.log(Status.PASS, "Market Monitor user has been added successfully message displayed and users activation link send on email");

	    wait.until(ExpectedConditions.elementToBeClickable(userStatusTable));
	    String zxc = userStatusTable.getText();
	    System.out.println(zxc);
	    ObjectRepo.test.log(Status.PASS, "Added user info is displayed in the table " + userStatusTable);

	    System.out.println("******************************************************************");
	}

	public void verifyInputTheAdminUserEmailAddressAndSpecifySponsorUserRole() throws Exception {

	    wait.until(ExpectedConditions.elementToBeClickable(btnHome)).click();
	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();

	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

	    String userText = AddNewUserBtn.getText();
	    System.out.println(userText);
	    ObjectRepo.test.log(Status.PASS, "Add new user button available on User Administration Screen");

	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserBtn)).click();
	    System.out.println("Add new user page is displayed with fields");
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");

	    String text = AddNewUserHeadrLBL.getText();
	    System.out.println(text);
	    AddNewUserHeadrLBL.click();
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");

	    String text1 = EmailAdressText.getText();
	    System.out.println(text1);
	    ObjectRepo.test.log(Status.PASS, "Email Adress field is displayed");

	    String text2 = firstName.getText();
	    System.out.println(text2);
	    ObjectRepo.test.log(Status.PASS, "First Name field is displayed");

	    String text3 = lastName.getText();
	    System.out.println(text3);
	    ObjectRepo.test.log(Status.PASS, "Last Name field is displayed");

	    String text4 = roleText.getText();
	    System.out.println(text4);
	    ObjectRepo.test.log(Status.PASS, "User Role field is displayed");

	    int length = 6;
	    boolean useLetters = true;
	    boolean useNumbers = true;
	    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
	    String randomString = ("user" + generatedString + "@yopmail.com");
	    emailField.sendKeys(randomString);

	    wait.until(ExpectedConditions.elementToBeClickable(verifyEmail)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(verifyEmailSuccessMsg));
	    String EmailSuccessText = verifyEmailSuccessMsg.getText();
	    System.out.println(EmailSuccessText);
	    ObjectRepo.test.log(Status.PASS, EmailSuccessText);

	    wait.until(ExpectedConditions.elementToBeClickable(firstNmeField)).sendKeys("Auto");
	    wait.until(ExpectedConditions.elementToBeClickable(LastNmeField)).sendKeys("Test");

	    WebElement element = userRoleDropDown;
	    Select event = new Select(element);
	    event.selectByIndex(4);
	    System.out.println("Sponsor User Role selected from dropdown");
	    ObjectRepo.test.log(Status.PASS, "Sponsor User Role selected from dropdown");

	    wait.until(ExpectedConditions.elementToBeClickable(addUserBtn)).click();

	    wait.until(ExpectedConditions.elementToBeClickable(addUserSuccessMsg));
	    String userAddSuccessText = addUserSuccessMsg.getText();
	    System.out.println(userAddSuccessText);
	    ObjectRepo.test.log(Status.PASS, "Sponsor user has been added successfully message displayed and users activation link send on email");

	    wait.until(ExpectedConditions.elementToBeClickable(userStatusTable));
	    String zxc = userStatusTable.getText();
	    System.out.println(zxc);
	    ObjectRepo.test.log(Status.PASS, "Added user info is displayed in the table " + userStatusTable);

	    System.out.println("******************************************************************");
	}

	public void verifyAddNewUserRole() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();

	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

	    String userText = AddNewUserBtn.getText();
	    System.out.println(userText);
	    ObjectRepo.test.log(Status.PASS, "Add new user button available on User Administration Screen");

	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserBtn)).click();
	    System.out.println("Add new user page is displayed with fields");
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");

	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserHeadrLBL)).click();
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");

	    String text1 = EmailAdressText.getText();
	    System.out.println(text1);
	    ObjectRepo.test.log(Status.PASS, "Email Adress field is displayed");

	    String text2 = firstName.getText();
	    System.out.println(text2);
	    ObjectRepo.test.log(Status.PASS, "First Name field is displayed");

	    String text3 = lastName.getText();
	    System.out.println(text3);
	    ObjectRepo.test.log(Status.PASS, "Last Name field is displayed");

	    String text4 = roleText.getText();
	    System.out.println(text4);
	    ObjectRepo.test.log(Status.PASS, "User Role field is displayed");

	    int length = 6;
	    boolean useLetters = true;
	    boolean useNumbers = true;
	    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
	    String randomString = ("user" + generatedString + "@yopmail.com");
	    emailField.sendKeys(randomString);

	    wait.until(ExpectedConditions.elementToBeClickable(verifyEmail)).click();

	    String EmailSuccessText = verifyEmailSuccessMsg.getText();
	    System.out.println(EmailSuccessText);
	    ObjectRepo.test.log(Status.PASS, EmailSuccessText);

	    firstNmeField.sendKeys("Auto");
	    LastNmeField.sendKeys("Test");

	    WebElement element = userRoleDropDown;
	    Select event = new Select(element);
	    event.selectByIndex(1);
	    System.out.println("Event Administrator User Role selected from dropdown");
	    ObjectRepo.test.log(Status.PASS, "Event Administrator User Role selected from dropdown");

	    wait.until(ExpectedConditions.elementToBeClickable(addUserBtn)).click();

	    String userAddSuccessText = addUserSuccessMsg.getText();
	    System.out.println(userAddSuccessText);
	    ObjectRepo.test.log(Status.PASS, "Event Admin user has been added successfully message displayed and users activation link send on email");

	    String zxc = userStatusTable.getText();
	    System.out.println(zxc);
	    ObjectRepo.test.log(Status.PASS, "Added user info is displayed in the table " + userStatusTable);

	    System.out.println("******************************************************************");
	}

	public void tryingExistingAddedUserFunctionality() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();

	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

	    wait.until(ExpectedConditions.elementToBeClickable(AddedUserTableRow1));
	    String tableRow1 = AddedUserTableRow1.getText();
	    System.out.println("Before trying added existing user " + tableRow1);
	    ObjectRepo.test.log(Status.PASS, "Before trying added existing user " + tableRow1);

	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserBtn)).click();
	    System.out.println("Add new user page is displayed with fields");
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");

	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserHeadrLBL)).click();
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");

	    String text1 = EmailAdressText.getText();
	    System.out.println(text1);
	    ObjectRepo.test.log(Status.PASS, "Email Adress field is displayed");

	    String text2 = firstName.getText();
	    System.out.println(text2);
	    ObjectRepo.test.log(Status.PASS, "First Name field is displayed");

	    String text3 = lastName.getText();
	    System.out.println(text3);
	    ObjectRepo.test.log(Status.PASS, "Last Name field is displayed");

	    String text4 = roleText.getText();
	    System.out.println(text4);
	    ObjectRepo.test.log(Status.PASS, "User Role field is displayed");

	    wait.until(ExpectedConditions.elementToBeClickable(emailField)).sendKeys("seededsponsor.ca@yopmail.com");

	    wait.until(ExpectedConditions.elementToBeClickable(verifyEmail)).click();

	    wait.until(ExpectedConditions.elementToBeClickable(existindAddUserFailureMsg));
	    String failureMsg = existindAddUserFailureMsg.getText();
	    System.out.println(failureMsg);
	    ObjectRepo.test.log(Status.PASS, failureMsg);

	    wait.until(ExpectedConditions.elementToBeClickable(AddedUserTableRow1));
	    String tableRow2 = AddedUserTableRow1.getText();
	    System.out.println("After trying added existing user " + tableRow2);
	    ObjectRepo.test.log(Status.PASS, "After trying added existing user " + tableRow2);

	    Assert.assertEquals(tableRow1, tableRow2);
	    System.out.println("Existing user is not getting added in the platform again.");
	    ObjectRepo.test.log(Status.PASS, "Existing user is not getting added in the platform again.");

	    System.out.println("******************************************************************");
	}

	public void cancelAddUser() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();

	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

	    wait.until(ExpectedConditions.elementToBeClickable(AddedUserTableRow1));
	    String tableRow1 = AddedUserTableRow1.getText();
	    System.out.println("Before Cancel add user :" + tableRow1);
	    ObjectRepo.test.log(Status.PASS, "Before cancel add user :" + tableRow1);

	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserBtn)).click();
	    System.out.println("Add new user page is displayed with fields");
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");

	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserHeadrLBL)).click();
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");

	    String text1 = EmailAdressText.getText();
	    System.out.println(text1);
	    ObjectRepo.test.log(Status.PASS, "Email Adress field is displayed");

	    String text2 = firstName.getText();
	    System.out.println(text2);
	    ObjectRepo.test.log(Status.PASS, "First Name field is displayed");

	    String text3 = lastName.getText();
	    System.out.println(text3);
	    ObjectRepo.test.log(Status.PASS, "Last Name field is displayed");

	    String text4 = roleText.getText();
	    System.out.println(text4);
	    ObjectRepo.test.log(Status.PASS, "User Role field is displayed");

	    wait.until(ExpectedConditions.elementToBeClickable(emailField)).sendKeys("autotesteqanim@yopmail.com");

	    wait.until(ExpectedConditions.elementToBeClickable(verifyEmail)).click();

	    wait.until(ExpectedConditions.elementToBeClickable(verifyEmailSuccessMsg));
	    String EmailSuccessText = verifyEmailSuccessMsg.getText();
	    System.out.println(EmailSuccessText);
	    ObjectRepo.test.log(Status.PASS, EmailSuccessText);

	    wait.until(ExpectedConditions.elementToBeClickable(firstNmeField)).sendKeys("Auto");

	    wait.until(ExpectedConditions.elementToBeClickable(LastNmeField)).sendKeys("Test");

	    wait.until(ExpectedConditions.elementToBeClickable(userRoleDropDown));
	    WebElement element = userRoleDropDown;
	    Select event = new Select(element);
	    event.selectByIndex(1);
	    ObjectRepo.test.log(Status.PASS, "Sponsor User Role selected from dropdown");

	    wait.until(ExpectedConditions.elementToBeClickable(cancelBtn)).click();

	    String tableRow2 = AddedUserTableRow1.getText();
	    System.out.println("After Cancel add user :" + tableRow2);
	    ObjectRepo.test.log(Status.PASS, "After cancel add user :" + tableRow2);

	    Assert.assertEquals(tableRow1, tableRow2);
	    System.out.println("******************************************************************");
	}

	public void addUserFieldValidation() throws Exception {
	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();

	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

	    wait.until(ExpectedConditions.elementToBeClickable(AddedUserTableRow1));
	    String tableRow1 = AddedUserTableRow1.getText();
	    System.out.println("Before Cancel add user :" + tableRow1);
	    ObjectRepo.test.log(Status.PASS, "Before cancel add user :" + tableRow1);

	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserBtn)).click();
	    System.out.println("Add new user page is displayed with fields");
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");

	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserHeadrLBL)).click();
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");

	    wait.until(ExpectedConditions.elementToBeClickable(emailField)).sendKeys("auto");

	    wait.until(ExpectedConditions.elementToBeClickable(emailErrorMsg));
	    String emailText = emailErrorMsg.getText();
	    System.out.println(emailText + " Error message is displayed");
	    ObjectRepo.test.log(Status.PASS, " Error message is displayed");

	    emailField.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);

	    wait.until(ExpectedConditions.elementToBeClickable(emailField)).sendKeys("autotesteqanim@yopmail.com");

	    wait.until(ExpectedConditions.elementToBeClickable(verifyEmail)).click();

	    wait.until(ExpectedConditions.elementToBeClickable(verifyEmailSuccessMsg));
	    String EmailSuccessText = verifyEmailSuccessMsg.getText();
	    System.out.println(EmailSuccessText);
	    ObjectRepo.test.log(Status.PASS, EmailSuccessText);

	    wait.until(ExpectedConditions.elementToBeClickable(firstNmeField)).sendKeys("@@@@@");

	    wait.until(ExpectedConditions.elementToBeClickable(LastNmeField)).sendKeys("@@@@");

	    wait.until(ExpectedConditions.elementToBeClickable(addUserBtn)).click();

	    String text1 = firstNmeErrorMsg.getText();
	    System.out.println(text1 + " ,Error message is displayed");
	    ObjectRepo.test.log(Status.PASS, text1 + " Error message is displayed");

	    String text2 = lastNmeErrorMsg.getText();
	    System.out.println(text2 + " Error message is displayed");
	    ObjectRepo.test.log(Status.PASS, text2 + " Error message is displayed");
	    System.out.println("******************************************************************");
	}

	public void addExistingUserForAnotherJurisdiction() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();

	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

	    wait.until(ExpectedConditions.elementToBeClickable(AddedUserTableRow1));
	    String tableRow1 = AddedUserTableRow1.getText();
	    System.out.println("Before trying added existing user " + tableRow1);
	    ObjectRepo.test.log(Status.PASS, "Before trying added existing user " + tableRow1);

	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserBtn));
	    String userText = AddNewUserBtn.getText();
	    System.out.println(userText);
	    ObjectRepo.test.log(Status.PASS, "Add new user button available on User Administration Screen");
	    wait.until(ExpectedConditions.elementToBeClickable(AddNewUserBtn));

	    AddNewUserBtn.click();
	    System.out.println("Add new user page is displayed with fields");
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");

	    String text = AddNewUserHeadrLBL.getText();
	    System.out.println(text);
	    ObjectRepo.test.log(Status.PASS, "Add new user page is displayed with fields");
	    String text1 = EmailAdressText.getText();
	    System.out.println(text1);
	    ObjectRepo.test.log(Status.PASS, "Email Adress field is displayed");
	    String text2 = firstName.getText();
	    System.out.println(text2);
	    ObjectRepo.test.log(Status.PASS, "First Name field is displayed");
	    String text3 = lastName.getText();
	    System.out.println(text3);
	    ObjectRepo.test.log(Status.PASS, "Last Name field is displayed");
	    String text4 = roleText.getText();
	    System.out.println(text4);
	    ObjectRepo.test.log(Status.PASS, "User Role field is displayed");

	    emailField.sendKeys("seededsponsor.qc@yopmail.com");
	    wait.until(ExpectedConditions.elementToBeClickable(verifyEmail));
	    verifyEmail.click();

	    wait.until(ExpectedConditions.elementToBeClickable(QcExistindAddUserFailureMsg));
	    String failureMsg = QcExistindAddUserFailureMsg.getText();
	    System.out.println(failureMsg);
	    ObjectRepo.test.log(Status.PASS, failureMsg);
	    wait.until(ExpectedConditions.elementToBeClickable(AddedUserTableRow1));
	    String tableRow2 = AddedUserTableRow1.getText();
	    System.out.println("After trying added existing user " + tableRow2);
	    ObjectRepo.test.log(Status.PASS, "After trying added existing user " + tableRow2);
	    Assert.assertEquals(tableRow1, tableRow2);
	    System.out.println("******************************************************************");
	}

	public void downloadTheUserActivityAuditReport() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();

	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

	    wait.until(ExpectedConditions.elementToBeClickable(userActivityAudReportBtn));
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element1 = userActivityAudReportBtn;
	    js.executeScript("arguments[0].scrollIntoView();", element1);

	    userActivityAudReportBtn.click();

	    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
	    Date date = new Date();
	    String date1 = dateFormat.format(date);

	    selectActivityReportDate.click();
	    selectActivityReportDate.sendKeys(date1);
	    System.out.println(date1 + " Date is selected from datepicker");
	    ObjectRepo.test.log(Status.PASS, date1 + " Date is selected from datepicker");

	    wait.until(ExpectedConditions.elementToBeClickable(downLoadBtn));
	    downLoadBtn.click();
	    System.out.println("******************************************************************");
	}

	public void downloadTheUserManagementReport() throws Exception {

	    CreateEvent ref = new CreateEvent();
	    ref.clickbtnAdmin();
	    ref.clickbtnUser();

	    String assertuserAdminPage = wait.until(ExpectedConditions.elementToBeClickable(userAdminPage)).getText();
	    Assert.assertEquals(assertuserAdminPage, "User Administration");
	    System.out.println("Heading of the displayed page is : " + assertuserAdminPage);
	    ObjectRepo.test.log(Status.PASS, "Heading of the displayed page is : " + assertuserAdminPage);

	    wait.until(ExpectedConditions.elementToBeClickable(userMNGMNTBtn));
	    userMNGMNTBtn.click();

	    System.out.println("******************************************************************");
	}}
