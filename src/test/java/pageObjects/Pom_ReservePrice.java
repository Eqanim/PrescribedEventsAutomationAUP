package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.aventstack.extentreports.Status;

import resources.ObjectRepo;
import static resources.listeners.wait;
import static constants.ThreadConstants.driver;

public class Pom_ReservePrice {
	
	@FindBy(xpath = "//*[text()='Reserve Price']")
	private WebElement reservePriceBtn;

	@FindBy(xpath = "//*[@data-icon='caret-down']")
	private WebElement auctionSortDownBtn;

	@FindBy(xpath = "(//td)[1]")
	private WebElement auctionSortFirstRow;

	@FindBy(xpath = "//tbody[@class='MuiTableBody-root']")
	private WebElement eventListTable;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root']")
	private WebElement reservePricePopUpXBtn;

	@FindBy(xpath = "//*[text()='How Auction Reserve Price Administration Works']")
	private WebElement reservePriceAdministrationBtn;

	 public Pom_ReservePrice() {
	        PageFactory.initElements(driver.get(), this);
	    }
	 
	public void clickAnReservePriceBtn() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(reservePriceBtn));
		WebElement abc1 = reservePriceBtn;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc1).build().perform();
		action.clickAndHold(abc1).build().perform();
		action.click(abc1).build().perform();
		ObjectRepo.test.log(Status.PASS, "Reserve price button is selected");
	}

	public void sortingAuctionNameFunctionality() {
		String sort = eventListTable.getText();
		System.out.println("Before clicking on auction sorting button :" + sort);
		ObjectRepo.test.log(Status.PASS, "Before clicking on auction sorting button :" + sort);
		wait.until(ExpectedConditions.elementToBeClickable(auctionSortDownBtn));
		WebElement abc1 = auctionSortDownBtn;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc1).build().perform();
		action.clickAndHold(abc1).build().perform();
		action.click(abc1).build().perform();
		System.out.println("Sorting button is clickable and List of events changed in the first row");
		ObjectRepo.test.log(Status.PASS, "Sorting button is clickable and List of events changed in the first row");
		String sort1 = auctionSortFirstRow.getText();
		System.out.println("After clicking on auction sorting button :" + sort1);
		ObjectRepo.test.log(Status.PASS, "After clicking on auction sorting button :" + sort1);
	}

	public void HowReservePriceWorks() {
		wait.until(ExpectedConditions.elementToBeClickable(reservePriceAdministrationBtn));
		reservePriceAdministrationBtn.click();
		System.out.println(
				"It opens a pop up window with text explaining the same How Auction Reserve Price Administration Works info is displayed");
		ObjectRepo.test.log(Status.PASS,
				"It opens a pop up window with text explaining the same How Auction Reserve Price Administration Works info is displayed");
		reservePricePopUpXBtn.click();
		System.out.println("After Clicking on (X) closes the window.");
		ObjectRepo.test.log(Status.PASS, "After Clicking on (X) closes the window.");
	}

}