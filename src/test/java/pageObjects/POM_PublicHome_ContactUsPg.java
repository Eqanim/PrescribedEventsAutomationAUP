package pageObjects;


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

public class POM_PublicHome_ContactUsPg {
	
    
	
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUsBtn;

	@FindBy(xpath = "//body[@id='tinymce']")
	private WebElement messageField;

	@FindBy(xpath = "//span[text()='Send']")
	private WebElement sendBtn;

	@FindBy(xpath = "//*[text()='Thank you for your inquiry.']")
	private WebElement getSuccessMsg;

	@FindBy(xpath = "//*[text()='Please enter a valid email address']")
	private WebElement emailErrorMsg;

	@FindBy(xpath = "(//*[text()='This field is required'])[1]")
	private WebElement errorMsg1;

	@FindBy(xpath = "(//*[text()='This field is required'])[2]")
	private WebElement errorMsg2;

	@FindBy(xpath = "//input[@placeholder='Enter your full name']")
	private WebElement name;

	@FindBy(xpath = "//input[@placeholder='Enter your phone with country code']")
	private WebElement phone;

	@FindBy(xpath = "//input[@placeholder='Enter your email address']")
	private WebElement email;
	
	public POM_PublicHome_ContactUsPg() {
        PageFactory.initElements(driver.get(), this);
    }

	public void ContactUsNameFieldValidation() throws InterruptedException {
		WebElement event = contactUsBtn;
		Actions action = new Actions(driver.get());
		action.moveToElement(event).build().perform();
		action.clickAndHold(event).click().build().perform();
		System.out.println("Contact us form is displayed with fields");
		ObjectRepo.test.log(Status.PASS, "Contact us form is displayed with fields");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = sendBtn;
		js.executeScript("arguments[0].scrollIntoView();", element);
		sendBtn.click();
		String name = errorMsg1.getText();
		System.out.println(name);
		ObjectRepo.test.log(Status.PASS, name);
		String phone = errorMsg2.getText();
		System.out.println(phone);
		ObjectRepo.test.log(Status.PASS, phone);
		email.sendKeys("a2");
		wait.until(ExpectedConditions.visibilityOf(emailErrorMsg));
		String emailmsg = emailErrorMsg.getText();
		System.out.println(emailmsg);
		ObjectRepo.test.log(Status.PASS, emailmsg);
		email.sendKeys(Keys.BACK_SPACE);
		email.sendKeys(Keys.BACK_SPACE);
		String email = errorMsg2.getText();
		System.out.println(email);
		ObjectRepo.test.log(Status.PASS, email);
		String msg = errorMsg2.getText();
		System.out.println(msg);
		ObjectRepo.test.log(Status.PASS, msg);
	}

	public void contactUsForm()  {
		wait.until(ExpectedConditions.elementToBeClickable(contactUsBtn));
		contactUsBtn.click();
		System.out.println("Contact us form is displayed with fields");
		ObjectRepo.test.log(Status.PASS, "Contact us form is displayed with fields");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = name;
		js.executeScript("arguments[0].scrollIntoView();", element);
		name.sendKeys("testSoftware @123");
		phone.sendKeys("02024256123");
		email.sendKeys("test@yopmail.com");
		driver.get().switchTo().frame(0);
		messageField.sendKeys("WCI Auction Platform Pune");
		System.out.println("Filled up the all Mandatory fields");
		ObjectRepo.test.log(Status.PASS, "Filled up the all Mandatory fields");
		driver.get().switchTo().parentFrame();
		sendBtn.click();
		wait.until(ExpectedConditions.visibilityOf(getSuccessMsg));
		String msg = getSuccessMsg.getText();
		System.out.println("Contact Us form submitted and Success message is displayed :- " + msg);
		Assert.assertEquals("Thank you for your inquiry.", msg);
		ObjectRepo.test.log(Status.PASS, "Contact Us form submitted and Success message is displayed :- " + msg);
	}
}