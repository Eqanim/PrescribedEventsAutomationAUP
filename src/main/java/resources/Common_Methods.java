package resources;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static constants.ThreadConstants.driver;
import static resources.listeners.wait;

public class Common_Methods {

	private WebDriver driver;
    private WebDriverWait wait;
	private By btnHome = By.xpath("//*[contains(text(),'Home')]");

	public Common_Methods(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

	public boolean privateHomePageLoaded() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(btnHome));
		String str = driver.findElement(btnHome).getText();
		Assert.assertEquals(str, "Home");
		return true;
	}

	public boolean privateHomePageLoaded1() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(btnHome));
		String str = driver.findElement(btnHome).getText();
		Assert.assertEquals(str, "Home");
		return true;

	}
}
