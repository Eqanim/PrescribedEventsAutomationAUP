package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static resources.listeners.prop;
import static constants.ThreadConstants.driver;
import static resources.listeners.wait;

public class LoginPage {

    
	@FindBy(xpath = "//*[@title='Log in']")
    private WebElement btnLogin;

    @FindBy(xpath = "//input[@id='enter_email']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='enter_passphrase']")
    private WebElement password;

    @FindBy(xpath = "(//span[text()='Log in'])[2]")
    private WebElement btnLogin2;

    @FindBy(xpath = "//label[@class='MuiFormLabel-root Mui-required']")
    private WebElement securityQue;

    @FindBy(xpath = "//input[@class='MuiInputBase-input MuiInput-input']")
    private WebElement securityAnswer;

    @FindBy(xpath = "//span[contains(text(),'NEXT')]")
    private WebElement btnNext;

	public LoginPage() {
		PageFactory.initElements(driver.get(),this);
	}

	public void clickOnLoginButton() {
		btnLogin.click();
	}

	public void sponsorLoginWS() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(btnLogin));
		btnLogin.click();
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(prop.getProperty("UserSponsorWS"));
		password.sendKeys(prop.getProperty("Password"));
		wait.until(ExpectedConditions.visibilityOf(btnLogin2));
		btnLogin2.click();
		System.out.println("Washington sponsor login successfully");
	}

	public void sponsorLoginWS2() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		btnLogin.click();
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(prop.getProperty("UserSponsorWS2"));
		password.sendKeys("Test@1234");
		wait.until(ExpectedConditions.visibilityOf(btnLogin2));
		btnLogin2.click();
		System.out.println("Washington sponsor login successfully");
	}

	public void FSALoginWs() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(prop.getProperty("UnameFSAWS"));
		password.sendKeys(prop.getProperty("Password"));
		wait.until(ExpectedConditions.visibilityOf(btnLogin));
		btnLogin.click();
	}

	public void MMLoginWs() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(prop.getProperty("UnameMMWS"));
		password.sendKeys(prop.getProperty("Password"));
		wait.until(ExpectedConditions.visibilityOf(btnLogin));
		btnLogin.click();
	}

	public void EALoginWs() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(prop.getProperty("UserSponsorWS"));
		password.sendKeys(prop.getProperty("Password"));
		wait.until(ExpectedConditions.visibilityOf(btnLogin));
		btnLogin.click();
	}

	public void handleSecurityQue() throws InterruptedException {
		WebElement element = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//label[@class='MuiFormLabel-root Mui-required']")));
		((JavascriptExecutor) driver.get()).executeScript("arguments[0].click();", element);
		String str = securityQue.getText().trim();
		System.out.println(str);
		if (str.contains("job?")) {
			securityAnswer.sendKeys("Answer_1");
		} else if (str.contains("teacher?")) {
			securityAnswer.sendKeys("Answer_2");
		} else if (str.contains("card?")) {
			securityAnswer.sendKeys("Answer_3");
		} else if (str.contains("emploi?")) {
			securityAnswer.sendKeys("Answer_1");
		} else if (str.contains("ann�e?")) {
			securityAnswer.sendKeys("Answer_2");
		} else if (str.contains("cr�dit?")) {
			securityAnswer.sendKeys("Answer_3");
		} else {
			System.out.println("None of the above security question");
		}
	}

	public void clickOnnext() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(btnNext));
		WebElement abc = btnNext;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc).click().build().perform();
		action.click(abc).build().perform();
	}

}
