package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.aventstack.extentreports.Status;
import resources.ObjectRepo;
import static constants.ThreadConstants.driver;
import static resources.listeners.wait;

public class PrivateHomePage {
	@FindBy(xpath = "//*[text()='Français']")
	private WebElement langBtnFrench;

	@FindBy(xpath = "//span[text()='WCI, Inc. Auction Platform']")
	private WebElement pageTitleEngQc;

	@FindBy(xpath = "//li[text()='English']")
	private WebElement langBtnEng;

	@FindBy(xpath = "//span[text()='Administration']")
	private WebElement btnAdminstration;

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement btnHome;

	public PrivateHomePage() {
        PageFactory.initElements(driver.get(), this);
    }

	public void verifyPageTitleLanguage() {
		String FrenchTitle = driver.get().getTitle();
		if (FrenchTitle.equals("Plateforme de vente aux ench�res de WCI, inc.")) {
			System.out.println("Title is :" + FrenchTitle);
			System.out.println("Prefered langauge is French for quebec user");
			ObjectRepo.test.log(Status.PASS, "Prefered langauge is French for quebec user");
		}
	}

	public void changeLangauge() {
		wait.until(ExpectedConditions.elementToBeClickable(langBtnFrench));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = langBtnFrench;
		js.executeScript("arguments[0].scrollIntoView();", element);
		langBtnFrench.click();
		langBtnEng.click();
		System.out.println("Langauge changed successfully from french to english ");
		String EnglishTitle = pageTitleEngQc.getText();
		if (EnglishTitle.equals("WCI, Inc. Auction Platform")) {
			System.out.println("Title is :" + EnglishTitle);
			ObjectRepo.test.log(Status.PASS, " langauge changed from french to english successfully ");
		} else {
			System.out.println("Langauge is not set to english ");
		}
	}

	public void adminstrationNavigation() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btnAdminstration));
		btnAdminstration.click();
	}

	public void HomeNavigation()  {
		wait.until(ExpectedConditions.elementToBeClickable(btnHome));
		btnHome.click();
	}

}
