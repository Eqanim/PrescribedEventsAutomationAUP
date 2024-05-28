package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import com.aventstack.extentreports.Status;
import resources.ObjectRepo;
import static resources.listeners.wait;
import static constants.ThreadConstants.driver;

public class POMSetting {

	@FindBy(xpath = "//button[@title='Settings']")
	private WebElement btnSettings;

	@FindBy(xpath = "//a[text()='Execute API']")
	private WebElement btnExecuteAPI;

	@FindBy(xpath = "(//*[text()='Execute'])[1]")
	private WebElement APIGetEntities_Users;

	@FindBy(xpath = "(//button[@title='Execute'])[1]")
	private WebElement APIGetQualifiedBidder;

	@FindBy(xpath = "(//button[@title='Execute'])[2]")
	private WebElement APIGetQualifiedBidder1;

	@FindBy(xpath = "(//*[text()='Execute'])[3]")
	private WebElement APIGetBidLimitations;

	@FindBy(xpath = "//button//span[text()='Execute API']")
	private WebElement APIexecutionPopupbtn;

	@FindBy(xpath = "(//tbody//tr/td[4])[1]")
	private WebElement successMsgAPIGetEntities_Users;

	@FindBy(xpath = "(//tbody//tr/td[4])[2]")
	private WebElement successMsgAPIGetQualifiedBidder;

	@FindBy(xpath = "(//tbody//tr/td[4])[3]")
	private WebElement successMsgAPIGetBidLimitations;

	@FindBy(xpath = "//*[contains(text(),'The API execution started. Once completed, the status will change to')]")
	private WebElement successMsg;

	@FindBy(xpath = "//a[contains(text(),'Configuration')]")
	private WebElement btnconfiguration;

	@FindBy(xpath = "//p[contains(text(),'Login Settings')]")
	private WebElement btnLoginSetting;

	@FindBy(xpath = "//p[contains(text(),'Event Edit Settings')]")
	private WebElement btnEditEventSetting;

	@FindBy(xpath = "//p[contains(text(),'Wiring Instructions')]")
	private WebElement btnWiringInstruction;

	@FindBy(xpath = "//p[contains(text(),'Contact Us Page Email Address')]")
	private WebElement btnContactusEmailPage;

	@FindBy(xpath = "//span[contains(text(),'CANCEL')]")
	private WebElement btnCancel;

	@FindBy(xpath = "//span[contains(text(),'SAVE')]")
	private WebElement btnSave;

	@FindBy(xpath = "(//input[contains(@id,'Max_Login_Attempts')])[1]")
	private WebElement MaxLoginAtt;

	@FindBy(xpath = "//input[contains(@id,'Account_Lockout_Time')]")
	private WebElement LockoutTime;

	@FindBy(xpath = "(//input[contains(@id,'Max_Login_Attempts')])[2]")
	private WebElement MaxFailedLoginAtt;

	@FindBy(xpath = "//input[contains(@name,'Remember_Me')]")
	private WebElement RememberMe;

	@FindBy(xpath = "//input[contains(@id,'Remember_Me_Duration')]")
	private WebElement RememberMe_Dur;

	@FindBy(xpath = "//input[contains(@id,'Passphrase_Expiry')]")
	private WebElement PassExp;

	@FindBy(xpath = "//input[contains(@id,'Change_Passphrase_Reminder')]")
	private WebElement ChangePassRem;

	@FindBy(xpath = "(//input[contains(@id,'Session_Timeout')])[1]")
	private WebElement SessionTime;

	@FindBy(xpath = "(//input[contains(@id,'Session_Timeout')])[2]")
	private WebElement NoticeTime;

	@FindBy(xpath = "//input[contains(@name,'Admin_Edit_Event')]")
	private WebElement EventAdmin;

	@FindBy(xpath = "//button[@aria-label=\"approval1Status\"]")
	private WebElement CAapprove;

	@FindBy(xpath = "(//input[@name='approval1Status']/following::*/descendant-or-self::*[text()='SUBMIT'])[1]")
	private WebElement CAsubmit;

	@FindBy(xpath = "//button[@aria-label=\"approval2Status\"]")
	private WebElement CASAapprove;

	@FindBy(xpath = "(//input[@name='approval2Status']/following::*/descendant-or-self::*[text()='SUBMIT'])[1]")
	private WebElement CASsubmit;

	@FindBy(xpath = "//span[text()='APPROVE']")
	private WebElement btnApprove;

	public POMSetting() {
		PageFactory.initElements(driver.get(), this);
	}

	public void settingConfiguration() {
		getbtnSetting();
		getbtnconfiguration();
		System.out.println("Step2: Navigate to configuration screen");
		getMaxLoginAtt();
		System.out.println("Max login attempt set ");
		getLockoutTime();
		System.out.println("Lockout time set ");
		getMaxFailedLoginAtt();
		System.out.println("max failed login attempt set ");
		getRememberMe();
		System.out.println("Remember me functionality disabled ");
		getRememberMe();
		System.out.println("Remember me functionality enabled");
		getRememberMe_Dur();
		System.out.println("");
		getPassExp();
		getChangePassRem();
		System.out.println("change passphrase functionality set ");
		getSessionTime();
		System.out.println("session timeout set");
		getNoticeTime();
		System.out.println("notice time set ");
	}

	public void executeApiGetEntitiesUsers() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(btnSettings));
		WebElement abc = btnSettings;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc).build().perform();
		action.clickAndHold(abc).build().perform();
		action.click(abc).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(btnExecuteAPI));
		btnExecuteAPI.click();
		wait.until(ExpectedConditions.elementToBeClickable(APIGetEntities_Users));
		APIGetEntities_Users.click();
		wait.until(ExpectedConditions.visibilityOf(APIexecutionPopupbtn));
		APIexecutionPopupbtn.click();
		wait.until(ExpectedConditions.visibilityOf(successMsg));
		String msg1 = successMsg.getText();
		System.out.println(msg1);
		Assert.assertEquals("The API execution started. Once completed, the status will change to \"Success\".", msg1);
	}

	public void getstatusAfterExecute() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(APIGetEntities_Users));
		String status = successMsgAPIGetEntities_Users.getText();
		System.out.println("Status :" + status);
		if (status.equals("Success")) {
			System.out.println("APIGetEntities_Users was executed successfully");
		} else if (status.equals("Running")) {
			wait.until(ExpectedConditions.elementToBeClickable(APIGetEntities_Users));
		}
	}

	public void getstatusAfterExecute1() {
		wait.until(ExpectedConditions.elementToBeClickable(APIGetQualifiedBidder));
		String status = successMsgAPIGetQualifiedBidder.getText();
		if (status.equals("Success")) {
			System.out.println("APIGetQualifiedBidder was executed successfully");

		} else if (status.equals("Failure")) {
			System.out.println("APIGetQualifiedBidder is failed");
			Assert.assertEquals(false, true);
		}
	}

	public void getstatusAfterExecute2() {
		wait.until(ExpectedConditions.elementToBeClickable(APIGetBidLimitations));
		String status = successMsgAPIGetBidLimitations.getText();
		if (status.equals("Success")) {
			System.out.println("APIGetBidLimitations was executed successfully");
		} else if (status.equals("Failure")) {
			System.out.println("APIGetBidLimitations is failed");
			Assert.assertEquals(false, true);
		}
	}

	public void executeAPIbutton() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(btnSettings));
		WebElement abc = btnSettings;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc).build().perform();
		action.clickAndHold(abc).build().perform();
		action.click(abc).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(btnExecuteAPI));
		btnExecuteAPI.click();
	}

	public void executeAPIGetQualifiedBidder() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Event Monitoring']")));
		wait.until(ExpectedConditions.elementToBeClickable(btnSettings));
		WebElement abc = btnSettings;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc).click().build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(btnExecuteAPI));
		btnExecuteAPI.click();
		wait.until(ExpectedConditions.elementToBeClickable(APIGetQualifiedBidder1));
		APIGetQualifiedBidder1.click();
		wait.until(ExpectedConditions.elementToBeClickable(APIexecutionPopupbtn));
		APIexecutionPopupbtn.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//*[text()='The API execution started. Once completed, the status will change to \"Success\".']")));

		String initialStatus = driver.get()
				.findElement(By.xpath("//th[contains(text(),'GetQualifiedBidder')]/parent::tr//td[4]")).getText();
		System.out.println("initialStatus  : " + initialStatus);
		WebElement statusElement = driver.get()
				.findElement(By.xpath("//th[contains(text(),'GetQualifiedBidder')]/parent::tr//td[4]"));
		wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(statusElement, initialStatus)));
		String currentStatus = statusElement.getText();
		System.out.println("currentStatus  : " + currentStatus);
		if (initialStatus.equals("Running") && currentStatus.equals("Success")) {
			System.out.println("Status changed from Running to Success");
		} else {
			System.out.println("Status did not change from Running to Success");
		}
	}

	public void executeAPIGetBidLimitations() {
		wait.until(ExpectedConditions.elementToBeClickable(APIGetBidLimitations));
		APIGetBidLimitations.click();
		wait.until(ExpectedConditions.elementToBeClickable(APIexecutionPopupbtn));
		APIexecutionPopupbtn.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//*[text()='The API execution started. Once completed, the status will change to \"Success\".']")));

		String initialStatus = driver.get()
				.findElement(By.xpath("//th[contains(text(),'GetBidLimitations')]/parent::tr//td[4]")).getText();
		System.out.println("initialStatus  : " + initialStatus);
		WebElement statusElement = driver.get()
				.findElement(By.xpath("//th[contains(text(),'GetBidLimitations')]/parent::tr//td[4]"));
		wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(statusElement, initialStatus)));
		String currentStatus = statusElement.getText();
		System.out.println("currentStatus  : " + currentStatus);
		if (initialStatus.equals("Running") && currentStatus.equals("Success")) {
			System.out.println("Status changed from Running to Success");
		} else {
			System.out.println("Status did not change from Running to Success");
		}
	}

	public void loginSetting(){
		POMPublicHomePage login = new POMPublicHomePage();
		login.sponsorLoginCa2();
		login.handleSecurityQue();
		login.clickOnnext();
		System.out.println("Step1: Sponsor Login into the application ");
		ObjectRepo.test.log(Status.PASS, "First Sponsor login Successfully");
		settingConfiguration();
		ObjectRepo.test.log(Status.PASS, "Edit Event Setting click Successfully");
		getbbtnWiringInstruction();
		ObjectRepo.test.log(Status.PASS, "Wiring Instruction click Successfully");
		getbtnContactusEmailPage();
		ObjectRepo.test.log(Status.PASS, "Contactus EmailPage click Successfully");
		getbtnSave();
		getCAapprove();
		getCAsubmit();
		ObjectRepo.test.log(Status.PASS, "First Sponsor changes Saved Successfully eith approval");
		driver.get().navigate().refresh();
		POM_ApprovalStatus status = new POM_ApprovalStatus();
		status.Logout();
		ObjectRepo.test.log(Status.PASS, "First Sponsor Logout Successfully");
		login.runtimesponsorLoginCa();
		login.handleSecurityQue();
		login.clickOnnext();
		ObjectRepo.test.log(Status.PASS, "Second  Sponsor login Successfully");
		getbtnSetting();
		getbtnconfiguration();
		getCASAapprove();
		getCASsubmit();
	}

	public void getbtnSetting() {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSettings));
			btnSettings.click();
		} catch (Exception e) {
			WebElement abc = btnSettings;
			Actions action = new Actions(driver.get());
			action.clickAndHold(abc).build().perform();
			action.click(abc).build().perform();
		}
	}

	public void getbtnconfiguration() {
		wait.until(ExpectedConditions.elementToBeClickable(btnconfiguration));
		btnconfiguration.click();
	}

	public void getbtnExecuteAPI() {
		wait.until(ExpectedConditions.elementToBeClickable(btnExecuteAPI));
		btnExecuteAPI.click();
	}

	public void getbtnLoginSetting() {
		wait.until(ExpectedConditions.elementToBeClickable(btnLoginSetting));
		btnLoginSetting.click();
	}

	public void getbtnEditEventSetting() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = btnEditEventSetting;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		btnEditEventSetting.click();
	}

	public void getbbtnWiringInstruction() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = btnWiringInstruction;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		btnWiringInstruction.click();
	}

	public void getbtnContactusEmailPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = btnContactusEmailPage;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		btnContactusEmailPage.click();
	}

	public void getbtnCancel() {
		wait.until(ExpectedConditions.elementToBeClickable(btnCancel));
		btnCancel.click();
	}

	public void getbtnSave() {
		btnSave.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='The new configurations have been successfully saved.']")));
	}

	public void getMaxLoginAtt() {
		wait.until(ExpectedConditions.elementToBeClickable(MaxLoginAtt));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = MaxLoginAtt;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		MaxLoginAtt.click();
		MaxLoginAtt.clear();
		MaxLoginAtt.sendKeys(Keys.BACK_SPACE);
		MaxLoginAtt.sendKeys("7");
	}

	public void getLockoutTime() {
		wait.until(ExpectedConditions.visibilityOf(LockoutTime));
		LockoutTime.click();
		LockoutTime.clear();
		LockoutTime.sendKeys(Keys.BACK_SPACE);
		LockoutTime.sendKeys(Keys.BACK_SPACE);
		LockoutTime.sendKeys("17");
	}

	public void getMaxFailedLoginAtt() {
		wait.until(ExpectedConditions.visibilityOf(MaxFailedLoginAtt));
		MaxFailedLoginAtt.click();
		MaxFailedLoginAtt.clear();
		MaxFailedLoginAtt.sendKeys(Keys.BACK_SPACE);
		MaxFailedLoginAtt.sendKeys(Keys.BACK_SPACE);
		MaxFailedLoginAtt.sendKeys("32");
	}

	public void getRememberMe() {
		RememberMe.click();
	}

	public void getRememberMe_Dur() {
		RememberMe_Dur.click();
		RememberMe_Dur.clear();
		RememberMe_Dur.sendKeys(Keys.BACK_SPACE);
		RememberMe_Dur.sendKeys(Keys.BACK_SPACE);
		RememberMe_Dur.sendKeys("3");
	}

	public void getPassExp() {
		wait.until(ExpectedConditions.visibilityOf(PassExp));
		PassExp.click();
		PassExp.clear();
		PassExp.sendKeys(Keys.BACK_SPACE);
		PassExp.sendKeys(Keys.BACK_SPACE);
		PassExp.sendKeys("91");
	}

	public void getChangePassRem() {
		wait.until(ExpectedConditions.visibilityOf(ChangePassRem));
		ChangePassRem.click();
		ChangePassRem.clear();
		ChangePassRem.sendKeys(Keys.BACK_SPACE);
		ChangePassRem.sendKeys(Keys.BACK_SPACE);
		ChangePassRem.sendKeys("11");
	}

	public void getSessionTime() {
		wait.until(ExpectedConditions.visibilityOf(SessionTime));
		SessionTime.click();
		SessionTime.clear();
		SessionTime.sendKeys(Keys.BACK_SPACE);
		SessionTime.sendKeys(Keys.BACK_SPACE);
		SessionTime.sendKeys("31");
	}

	public void getNoticeTime() {
		wait.until(ExpectedConditions.elementToBeClickable(NoticeTime));
		NoticeTime.click();
		NoticeTime.clear();
		NoticeTime.sendKeys(Keys.BACK_SPACE);
		NoticeTime.sendKeys("2");
	}

	public void getEventAdmin() {
		wait.until(ExpectedConditions.elementToBeClickable(EventAdmin));
		EventAdmin.click();
	}

	public void getCAapprove() {
		try {
			wait.until(ExpectedConditions.visibilityOf(CAapprove));
			CAapprove.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(CAapprove));
			CAapprove.click();
		}
	}

	public void getCAsubmit() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(CAsubmit));
			CAsubmit.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(CAsubmit));
			CAsubmit.click();
		}
	}

	public void getCASAapprove() {
		wait.until(ExpectedConditions.elementToBeClickable(CASAapprove));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = CASAapprove;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		CASAapprove.click();
	}

	public void getCASsubmit() {
		wait.until(ExpectedConditions.elementToBeClickable(CASsubmit));
		CASsubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnApprove));
		btnApprove.click();
	}

	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,2000)");
		System.out.println("scroll done");
	}

}
