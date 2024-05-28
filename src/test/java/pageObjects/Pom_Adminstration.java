package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.Status;

import resources.ObjectRepo;
import static constants.ThreadConstants.driver;

public class Pom_Adminstration {
	@FindBy(xpath = "//a[text()='User']")
	private WebElement selectUser;

	@FindBy(xpath = "//span[text()='Add New User']")
	private WebElement btnAddUser;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement EnterEmail;

	@FindBy(xpath = "//span[contains(text(),'Check if email address is already associated')]")
	private WebElement btnTermsofUse;

	@FindBy(xpath = "(//p[contains(text(),'')])[5]")
	private WebElement textErrorMsg;

	public Pom_Adminstration() {
		PageFactory.initElements(driver.get(), this);
	}

	public void getselectUser() throws InterruptedException {
		selectUser.click();
	}

	public void getbtnAddUser() throws InterruptedException {
		btnAddUser.click();
	}

	public void getEnterEmail() throws InterruptedException {
		EnterEmail.sendKeys("seededsponsor.qc@yopmail.com");
	}

	public void getbtnTermsofUse() throws InterruptedException {
		btnTermsofUse.click();
	}

	public void gettextErrorMsg() throws InterruptedException {
		textErrorMsg.click();
	}

	public void verify_Login_and_logout_functionality_for_EA() throws InterruptedException {
		POMPublicHomePage login = new POMPublicHomePage();
		login.EALoginQc();
		login.handleSecurityQue();
		login.clickOnnext();
		ObjectRepo.test.log(Status.PASS, "Quebec Event Admin login successfully");
		POM_ApprovalStatus ref = new POM_ApprovalStatus();
		ref.Logout();
	}
}
