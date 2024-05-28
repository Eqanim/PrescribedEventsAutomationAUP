package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.EmptyFileException;
import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.aventstack.extentreports.Status;
import resources.ObjectRepo;
import resources.commonLib;
import static resources.listeners.prop2;
import static constants.ThreadConstants.driver;
import static resources.listeners.folderPath;
import static resources.listeners.wait;

public class Reg_QA_AUP_Pad {
	public static Actions action;
	public String dynamicEmail;
	
	@FindBy(xpath = "//*[text()='About WCI, Inc.']")
	private WebElement scroll_To_Bottom;

	@FindBy(xpath = "//*[@placeholder='Enter Entity Name or Entity ID']")
	private WebElement searchentity;

	@FindBy(xpath = "(//*[@name='rollDownProcedure'])")
	private WebElement selectentity;

	@FindBy(xpath = "(//*[text()='CONTINUE'])")
	private WebElement BtnContinueclk;

	@FindBy(xpath = "//*[text()='Events']")
	private WebElement EventDropdown;

	@FindBy(xpath = "(//*[text()='EventNameWADuringBidding'])")
	private WebElement EventName;

	@FindBy(xpath = "(//*[contains(text(),'12.20 USD')])[1]")
	private WebElement FloorPrice;

	@FindBy(xpath = "(//*[@name='rollDownProcedure'])[1]")
	private WebElement EntityQC;

	@FindBy(xpath = "(//*[text()='CONTINUER'])")
	private WebElement continueBtnQC;

	@FindBy(xpath = "(//*[@name='rollDownProcedure'])[1]")
	private WebElement selectentityQC;

	@FindBy(xpath = "(//*[text()='CONTINUER'])")
	private WebElement BtnContinueclkQC;

	@FindBy(xpath = "(//*[text()='JointAuctionAutomation'])")
	private WebElement EventNamePHomepage;

	@FindBy(xpath = "(//*[text()='Event in progress'])")
	private WebElement Eventstatus;

	@FindBy(xpath = "(//div[@role='region']//div//div//div[2])[1]")
	private WebElement countdownClock;

	@FindBy(xpath = "//*[text()='Reports']")
	private WebElement reportBtn;

	@FindBy(xpath = "//*[text()='Rapports']")
	private WebElement reportBtnFR;

	@FindBy(xpath = "//span[text()='Event Monitoring']//parent::button[@type='button']")
	private WebElement btnEventMonitoring;

	@FindBy(xpath = "(//*[text()='JointAuctionAutomation'])")
	private WebElement selectEvent;

	@FindBy(xpath = "//input[@aria-label=\"select all\"]")
	private WebElement clickcheckbox;

	@FindBy(xpath = "(//*[text()='Bulk Actions'])")
	private WebElement BulkAct;

	@FindBy(xpath = "(//*[text()='FLAG'])")
	private WebElement flag;

	@FindBy(xpath = "(//*[text()='REMOVE FLAG'])")
	private WebElement removeflag;

	@FindBy(xpath = "//ul[@role='menu']")
	private WebElement Menu;

	@FindBy(xpath = "//li[text()='Add Flag']")
	private WebElement addFlag;

	@FindBy(xpath = "//span[text()='POST']")
	private WebElement addFlagPost;

	@FindBy(xpath = "//li[text()='Remove Flag']")
	private WebElement removeFlag;

	@FindBy(xpath = "//*[@placeholder='Enter Text']")
	private WebElement textBoxComment;

	@FindBy(xpath = "//span[text()='Administration']//parent::button[@type='button']")
	private WebElement btnAdministration;

	@FindBy(xpath = "//*[text()='User']")
	private WebElement btnUser;

	@FindBy(xpath = "(//*[@type='button'])[5]")
	private WebElement btnAddNewUser;

	@FindBy(xpath = "//*[@id='email']")
	private WebElement mail;

	@FindBy(xpath = "//*[text()='Check if email address is already associated to a platform user']")
	private WebElement maillinkchk;

	@FindBy(xpath = "//*[@id='firstname']")
	private WebElement Fname;

	@FindBy(xpath = "//*[@id='lastname']")
	private WebElement Lname;

	@FindBy(xpath = "//*[text()='ADD USER']")
	private WebElement btnAddUser;

	@FindBy(xpath = "//*[text()='Reserve Price']")
	private WebElement btnReservePrice;

	@FindBy(xpath = "(//*[text()='ReserveSaleAutomation'])")
	private WebElement AllowanceSaleEvent1NamePHomepage;

	@FindBy(xpath = "(//*[text()='JointAuctionAutomation'])")
	private WebElement JointAuctionEventNamePHomepage;

	@FindBy(xpath = "//a[@title='Reports']")
	private WebElement btnReport;

	@FindBy(xpath = "(//*[@name='rollDownProcedure'])[2]")
	private WebElement selectentityNS;

	@FindBy(xpath = "(//*[text()='CONTINUE'])")
	private WebElement BtnContinueclkNS;

	private By btnClientBidsReportsNS = By.xpath(
			"//button[@aria-label='Download Client Bids Report for event " + prop2.getProperty("eventNameNS") + "']");
	private By btnBidsReportsRS_QC = By.xpath(
			"//button[@aria-label='Download Bids Report for event " + prop2.getProperty("Event_Name_RE1QC") + "']");// ReserveSaleEventNameR70
	private By btnBidsReportsRS_QC_french = By.xpath("//button[@aria-label='Download Rapport des offres for event "
			+ prop2.getProperty("Event_Name_RE1QC_FR") + "']");// ReserveSaleEventNameR70
	private By btnBidLotAuditReportsRS_QC = By
			.xpath("//button[@aria-label='Download Sales by Mutual Agreement Bid Lot Audit Report for event "
					+ prop2.getProperty("Event_Name_RE1QC") + "']");// ReserveSaleEventNameR70
	private By btnBidLotAuditReportsRS_QC_FR = By
			.xpath("//button[@aria-label='Download Rapport de vérification des lots de la vente de gré à gré for event "
					+ prop2.getProperty("Event_Name_RE1QC_FR") + "']");// ReserveSaleEventNameR70
	private By btnClientBidsAuditReportsRS_QC = By
			.xpath("//button[@aria-label='Download Client Bids Audit Report for event "
					+ prop2.getProperty("Event_Name_RE1QC") + "']");// ReserveSaleEventNameR70
	private By btnEmissionUnitsDeliveryReportRS_QC = By
			.xpath("//button[@aria-label='Download Emission Units Delivery Report for event "
					+ prop2.getProperty("Event_Name_RE1QC") + "']");
	private By btnEmissionUnitsDeliveryReportRS_QC_FR = By
			.xpath("//*[@aria-label=\"Download Rapport de la livraison des unités d'émission for event "
					+ prop2.getProperty("Event_Name_RE1QC_FR") + "\"]");
	private By btnFinancialStatementReportRS_QC = By
			.xpath("//button[@aria-label='Download Financial Statement for event "
					+ prop2.getProperty("Event_Name_RE1QC_FR") + "']");
	private By btnClientBidsReportsRS_QC = By.xpath("//button[@aria-label='Download Client Bids Report for event "
			+ prop2.getProperty("Event_Name_RE1QC") + "']");// ReserveSaleEventNameR70
	private By btnBidsReportsRS_CAL = By.xpath(
			"//button[@aria-label='Download Bids Report for event " + prop2.getProperty("ReserveSaleEventName") + "']");// ReserveSaleEventNameR70
	private By btnAllowanceDeliveryReportRS_CA = By
			.xpath("//button[@aria-label='Download Allowance Delivery Report for event "
					+ prop2.getProperty("ReserveSaleEventName") + "']");

	public Reg_QA_AUP_Pad() {
		PageFactory.initElements(driver.get(), this);
	}

	public void SelectEntity_AR() {
		wait.until(ExpectedConditions.elementToBeClickable(searchentity));
		searchentity.sendKeys("WA6585-9938");
		WebElement abc = selectentity;
		abc.click();
		WebElement abc1 = BtnContinueclk;
		abc1.click();
		wait.until(ExpectedConditions.visibilityOf(EventDropdown));
		WebElement abc2 = EventDropdown;
		abc2.click();
		wait.until(ExpectedConditions.visibilityOf(EventName));
		WebElement abc3 = EventName;
		abc3.click();
		WebElement abc4 = FloorPrice;
		String ActualFloorpriceCurrency = FloorPrice.getText();
		String ExpectedFloorpriceCurrency = "12.20 USD";
		Assert.assertEquals(ActualFloorpriceCurrency, ExpectedFloorpriceCurrency);
		System.out.println("validated Actual & expected floor price for WA individual auction.");
		ObjectRepo.test.log(Status.PASS, "validated Actual & expected floor price for WA individual auction.");
		System.out.println("Auction Floor price is Displayed in:" + abc4.getText());
		ObjectRepo.test.log(Status.PASS,
				"TC:C31115-Confirm for a WA individual auction, the auction floor price is displayed in USD.");
	}

	public void CountDownClockDisplayed() {
		System.out.println("Land on private Home page");
		ObjectRepo.test.log(Status.PASS, "Land on private Home page");
		wait.until(ExpectedConditions.elementToBeClickable(EventNamePHomepage));
		WebElement abc = EventNamePHomepage;
		System.out.println("Event name is:" + abc);
		ObjectRepo.test.log(Status.PASS, "Event name is:" + abc);
		wait.until(ExpectedConditions.elementToBeClickable(Eventstatus));
		WebElement abc1 = Eventstatus;
		System.out.println("Event status is:" + abc1);
		ObjectRepo.test.log(Status.PASS, "Event name is:" + abc1);
		WebElement countdownClock1 = countdownClock;
		String remainingTime = countdownClock1.getText();
		System.out.println("Remaining Time: " + remainingTime);
		ObjectRepo.test.log(Status.PASS, "Remaining Time:" + remainingTime);
	}

	public void verifyEventMonitoring() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btnEventMonitoring));
		WebElement event = btnEventMonitoring;
		Actions action = new Actions(driver.get());
		wait.until(ExpectedConditions.elementToBeClickable(event));
		action.moveToElement(event).build().perform();
		action.clickAndHold(event).click().build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(selectEvent));
		selectEvent.click();
	}

	public void FlaggedBidByMM() {
		wait.until(ExpectedConditions.elementToBeClickable(btnEventMonitoring)).click();
		System.out.println("Access the running event from event monitoring");
		ObjectRepo.test.log(Status.PASS, "Access the running event from event monitoring");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = selectEvent;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		wait.until(ExpectedConditions.elementToBeClickable(selectEvent)).click();
		try {
			js.executeScript("arguments[0].scrollIntoView();", clickcheckbox);
			wait.until(ExpectedConditions.elementToBeClickable(clickcheckbox)).click();
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(clickcheckbox).click().build().perform();
		}
		wait.until(ExpectedConditions.elementToBeClickable(BulkAct)).click();
		System.out.println("Select multiple bids");
		ObjectRepo.test.log(Status.PASS, "Select multiple bids");
		String Con = Menu.getText();
		System.out.println(Con);
		if (Con.contains("Add Flag") == true) {
			wait.until(ExpectedConditions.visibilityOf(addFlag));
			addFlag.click();
			wait.until(ExpectedConditions.visibilityOf(flag));
			flag.click();
			wait.until(ExpectedConditions.visibilityOf(textBoxComment));
			textBoxComment.sendKeys("Flag");
			wait.until(ExpectedConditions.visibilityOf(addFlagPost));
			addFlagPost.click();
			System.out.println("Select bulk actions and Flag  the bids");
			ObjectRepo.test.log(Status.PASS, "Select bulk actions and Flag  the bids");
			System.out.println("The selected bids have been successfully flagged.");
		} else {
			wait.until(ExpectedConditions.elementToBeClickable(removeFlag));
			removeFlag.click();
			wait.until(ExpectedConditions.visibilityOf(removeflag));
			removeFlag.click();
			wait.until(ExpectedConditions.elementToBeClickable(textBoxComment));
			textBoxComment.sendKeys("UNFlag");
			wait.until(ExpectedConditions.elementToBeClickable(addFlagPost));
			addFlagPost.click();
		}
	}

	public void UnFlaggedBidBySP() {
		wait.until(ExpectedConditions.elementToBeClickable(btnEventMonitoring));
		WebElement a = driver.get().findElement(By.xpath("//*[text()='Event Monitoring']"));
		a.click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = selectEvent;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		wait.until(ExpectedConditions.elementToBeClickable(selectEvent)).click();
		try {
			js.executeScript("arguments[0].scrollIntoView();", clickcheckbox);
			wait.until(ExpectedConditions.elementToBeClickable(clickcheckbox)).click();
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(clickcheckbox).click().build().perform();
		}
		wait.until(ExpectedConditions.elementToBeClickable(BulkAct)).click();
		System.out.println("Select multiple bids");
		ObjectRepo.test.log(Status.PASS, "Select multiple bids");
		String Con = Menu.getText();
		System.out.println(Con);
		if (Con.contains("Remove Flag") == true) {
			wait.until(ExpectedConditions.elementToBeClickable(removeFlag));
			removeFlag.click();
			ObjectRepo.test.log(Status.PASS, "Select bulk actions - select Remove Flag");
			System.out.println("The flag has been removed successfully from the selected bids.");
			System.out.println("Verified there is a confirmation pop-up message");
			ObjectRepo.test.log(Status.PASS, "Verified there is a confirmation pop-up message");
			wait.until(ExpectedConditions.visibilityOf(removeflag));
			removeFlag.click();
			wait.until(ExpectedConditions.elementToBeClickable(addFlagPost)).click();
			String ActualSmsg1 = driver.get()
					.findElement(By.xpath("(//*[text()='A comment must contain at least one character.'])")).getText();
			String ExpectedSmsg1 = "A comment must contain at least one character.";
			Assert.assertEquals(ActualSmsg1, ExpectedSmsg1);
			System.out.println(
					"Verified a comment has to be placed to remove the flag and that un-flagging does not happen when comments are not placed.\r\n"
							+ "The comment should have at least one character");
			ObjectRepo.test.log(Status.PASS,
					"Verified a comment has to be placed to remove the flag and that un-flagging does not happen when comments are not placed.\r\n"
							+ "The comment should have at least one character");
			textBoxComment.sendKeys("UNFlag");
			System.out.println("Add comment & click on POST button");
			ObjectRepo.test.log(Status.PASS, "Add comment & click on POST button");
			wait.until(ExpectedConditions.elementToBeClickable(addFlagPost));
			addFlagPost.click();
			System.out.println("Select bulk actions - select Remove Flag");
			ObjectRepo.test.log(Status.PASS, "Select bulk actions - select Remove Flag");
			System.out.println("The flag has been removed successfully from the selected bids.");
		} else {
			wait.until(ExpectedConditions.visibilityOf(addFlag));
			addFlag.click();
			wait.until(ExpectedConditions.visibilityOf(flag));
			flag.click();
			wait.until(ExpectedConditions.visibilityOf(textBoxComment));
			textBoxComment.sendKeys("Flag");
			wait.until(ExpectedConditions.visibilityOf(addFlagPost));
			addFlagPost.click();
		}
	}

	public void NavigateUserAdministrationCA() {
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		WebElement element11 = btnAdministration;
		js1.executeScript("arguments[0].scrollIntoView();", element11);
		element11.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnUser)).click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = btnAddNewUser;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewUser)).click();
		dynamicEmail = "MMuser" + System.currentTimeMillis() + "@yopmail.com";
		System.out.println(dynamicEmail);
		wait.until(ExpectedConditions.elementToBeClickable(mail)).sendKeys(dynamicEmail); // mm1112.ca@yopmail.com
		wait.until(ExpectedConditions.elementToBeClickable(maillinkchk)).click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[text()='This user does not exist and may be added.']")));
		String ActualSmsg = driver.get()
				.findElement(By.xpath("//*[text()='This user does not exist and may be added.']")).getText();
		String ExpectedSmsg = "This user does not exist and may be added.";
		Assert.assertEquals(ActualSmsg, ExpectedSmsg);
		System.out.println("validated Actual & expected success msg for new user");
		wait.until(ExpectedConditions.elementToBeClickable(Fname)).sendKeys("FN");
		wait.until(ExpectedConditions.elementToBeClickable(Lname)).sendKeys("LN");
		Select s = new Select(driver.get().findElement(By.xpath("(//*[@id='demo-customized-select'])[3]")));
		s.selectByVisibleText("Market Monitor");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddUser)).click();
		System.out.println("Success Msg-The user has been added successfully.");
		ObjectRepo.test.log(Status.PASS, "Success Msg-The user has been added successfully.");
		System.out.println("Added a user as Market Monitor for CA.");
		ObjectRepo.test.log(Status.PASS, "Added a user as Market Monitor for CA.");
	}

	public void NavigateUserAdministrationNS() {
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		WebElement element11 = btnAdministration;
		js1.executeScript("arguments[0].scrollIntoView();", element11);
		element11.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnUser)).click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = btnAddNewUser;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewUser)).click();
		System.out.println("Clicked btnAddNewUser");
		wait.until(ExpectedConditions.elementToBeClickable(mail)).sendKeys(dynamicEmail);
		System.out.println(dynamicEmail);
		wait.until(ExpectedConditions.elementToBeClickable(maillinkchk)).click();
		driver.get().findElement(By.xpath("//*[text()='User is present in the system please proceed.']")).getText();
		String ActualSmsg = driver.get()
				.findElement(By.xpath("//*[text()='User is present in the system please proceed.']")).getText();
		String ExpectedSmsg = "User is present in the system please proceed.";
		Assert.assertEquals(ActualSmsg, ExpectedSmsg);
		System.out.println("Already linked user Message " + ActualSmsg);
		System.out.println("Validated Actual & expected success msg for linked jurisdiction ");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddUser)).click();
		System.out.println("The user has been added successfully.");
		ObjectRepo.test.log(Status.PASS, "The user has been added successfully.");
		System.out.println("Add the same user-CA_MM as Market Monitor for NS.");
		ObjectRepo.test.log(Status.PASS, "Add the same user-CA_MM as Market Monitor for NS.");
	}

	public void FieldsDisplayedInEventInfoSectionAllowanceSale() {
		System.out.println("Land on private Home page");
		ObjectRepo.test.log(Status.PASS, "Land on private Home page");
		wait.until(ExpectedConditions.elementToBeClickable(AllowanceSaleEvent1NamePHomepage));
		WebElement abc = AllowanceSaleEvent1NamePHomepage;
		System.out.println("Event name is:" + abc);
		ObjectRepo.test.log(Status.PASS, "Event name is:" + abc);
		wait.until(ExpectedConditions.elementToBeClickable(Eventstatus));
		WebElement abc1 = Eventstatus;
		System.out.println("Event status is:" + abc1);
		ObjectRepo.test.log(Status.PASS, "Event name is:" + abc1);

		System.out.println("Navigate to the Event Info section");
		ObjectRepo.test.log(Status.PASS, "Navigate to the Event Info section");

		List<WebElement> list2 = driver.get()
				.findElements(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1'])[17]"));
		System.out.println(list2);
		int listSize2 = list2.size();
		String listString2 = "";
		for (int i = 0; i <= listSize2 - 1; i++) {
			listString2 = list2.get(i).getText();
		}
		System.out.println(listString2);

		List<WebElement> name = driver.get().findElements(By.xpath("(//*[@class='MuiTable-root'])[8]/thead/tr/th"));
		int nameSize = name.size();
		String namepresent = "";
		for (int i = 1; i <= nameSize - 1; i++) {
			namepresent = name.get(i).getText();
			System.out.println(namepresent);
		}
		System.out.println(name);
		List<WebElement> labels = driver.get().findElements(By.xpath("(//*[@class='MuiTableRow-root'])[8]/td"));
		int labelSize = labels.size();
		String labelpresent = "";
		for (int i = 1; i <= labelSize - 1; i++) {
			labelpresent = labels.get(i).getText();
			System.out.println(labelpresent);
		}
		System.out.println(labels);
		ObjectRepo.test.log(Status.PASS, "Labels displayed" + labels);
		System.out.println("Fields are displayed in event info section");
		ObjectRepo.test.log(Status.PASS, "Fields are displayed in event info section");
	}

	public void WebinarDatesOnPrivateWebPage() throws InterruptedException {
		System.out.println("Land on private Home page");
		ObjectRepo.test.log(Status.PASS, "Land on private Home page");
		wait.until(ExpectedConditions.elementToBeClickable(AllowanceSaleEvent1NamePHomepage));
		WebElement abc = AllowanceSaleEvent1NamePHomepage;
		System.out.println("Event name is:" + abc);
		ObjectRepo.test.log(Status.PASS, "Event name is:" + abc);
		wait.until(ExpectedConditions.elementToBeClickable(Eventstatus));
		WebElement abc1 = Eventstatus;
		System.out.println("Event status is:" + abc1);
		ObjectRepo.test.log(Status.PASS, "Event status is:" + abc1);
		List<WebElement> name = driver.get().findElements(By.xpath("(//*[@class='MuiTable-root'])[10]/thead/tr/th"));
		int nameSize = name.size();
		String namepresent = "";
		for (int i = 1; i <= nameSize - 1; i++) {
			namepresent = name.get(i).getText();
			System.out.println(namepresent);
			ObjectRepo.test.log(Status.PASS, namepresent);
		}
		System.out.println(name);
		List<WebElement> labels = driver.get().findElements(By.xpath("(//*[@class='MuiTableRow-root'])[10]/td"));
		int labelSize = labels.size();
		String labelpresent = "";
		for (int i = 1; i <= labelSize - 1; i++) {
			labelpresent = labels.get(i).getText();
			System.out.println(labelpresent);
			ObjectRepo.test.log(Status.PASS, labelpresent);
		}
		System.out.println(labels);
		ObjectRepo.test.log(Status.PASS, "labels displayed" + labels);
		System.out.println("Webinar dates for event are displayed");
		ObjectRepo.test.log(Status.PASS, "Webinar dates for event are displayed");
	}

	public void UnableToResetFXRateApproval() throws InterruptedException {
		System.out.println("Land on private Home page");
		ObjectRepo.test.log(Status.PASS, "Land on private Home page");
		wait.until(ExpectedConditions.elementToBeClickable(JointAuctionEventNamePHomepage));
		WebElement abc = JointAuctionEventNamePHomepage;
		System.out.println("Event name is:" + abc);
		ObjectRepo.test.log(Status.PASS, "Event name is:" + abc);
		wait.until(ExpectedConditions.elementToBeClickable(Eventstatus));
		WebElement abc1 = Eventstatus;
		System.out.println("The bidding window for the event has opened.:" + abc1);
		ObjectRepo.test.log(Status.PASS, "The bidding window for the event has opened.:" + abc1);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		WebElement element11 = btnAdministration;
		js1.executeScript("arguments[0].scrollIntoView();", element11);
		element11.click();
		System.out.println("Click on the Administration menu");
		ObjectRepo.test.log(Status.PASS, "Click on the Administration menu");
		wait.until(ExpectedConditions.elementToBeClickable(btnReservePrice)).click();
		System.out.println("Click on Reserve Price Administration");
		ObjectRepo.test.log(Status.PASS, "Click on Reserve Price Administration");
		wait.until(ExpectedConditions.elementToBeClickable(JointAuctionEventNamePHomepage));
		WebElement abc11 = JointAuctionEventNamePHomepage;
		System.out.println("Event name is:" + abc11);
		ObjectRepo.test.log(Status.PASS, "Event name is:" + abc11);
		WebElement element2 = JointAuctionEventNamePHomepage;
		js1.executeScript("arguments[0].scrollIntoView();", element2);
		element2.click();
		System.out.println("Navigated Event name is:" + abc11);
		ObjectRepo.test.log(Status.PASS, "Navigated Event name is:" + abc11);
		boolean Display = driver.get()
				.findElement(
						By.xpath("(//*[text()='JointAuctionAutomation']/ancestor::tr/following-sibling::tr/td[5])[1]"))
				.getText().isBlank();
		System.out.println("Reset button is not displayed:" + Display);
		try {
			Assert.assertTrue(Display);
			System.out.println("Reset button is not available for Sponsor user");
		} catch (Exception e) {
			Assert.assertFalse(Display);
			System.out.println("Reset button is available for Sponsor user");
		}
		System.out.println("Reset button is not available to reset the FX rates");
		ObjectRepo.test.log(Status.PASS, "Reset button is not available to reset the FX rates");
	}

	public void DataReadFromBidsReportRS_QC() throws EncryptedDocumentException, Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Monitoring']")));
		reportBtn.click();
		System.out.println("Report page is opened");
		ObjectRepo.test.log(Status.PASS, "Report page is opened");
		searchReportsByEventName_SBMA();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnBidsReportsRS_QC);
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		System.out.println(
				"C31912/C31915-Sponsor/MM can get access to Bids report for an Allowance Sale event during the bidding window");
		ObjectRepo.test.log(Status.PASS,
				"C31912/C31915-Sponsor/MM can get access to Bids report for an Allowance Sale event during the bidding window ");
		System.out.println(
				"C31949 Sponsor/MM can get access to Bids report for an Allowance Sale event during the bidding window(Bids Report_Allowance Sale_English)");
		ObjectRepo.test.log(Status.PASS,
				"C31949 Sponsor/MM can get access to Bids report for an Allowance Sale event during the bidding window(Bids Report_Allowance Sale_English)");
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src;
		src = new File(folderPath + File.separator + "Bids Report - " + prop2.getProperty("Event_Name_RE1QC") + " "
				+ "02-27-2024" + ".xlsx"); // "07-18-2023"
		System.out.println("reports path : " + folderPath + File.separator + "Bids Report - "
				+ prop2.getProperty("Event_Name_RE1QC") + " " + date1 + ".xlsx");
		try {
			FileInputStream ExcelFileToRead = new FileInputStream(src);
			try (XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead)) {
				XSSFSheet sheet = wb.getSheetAt(0);
				XSSFRow row;
				XSSFCell cell;
				Iterator<Row> rows = sheet.rowIterator();
				while (rows.hasNext()) {
					row = (XSSFRow) rows.next();
					for (int i = 0; i < row.getLastCellNum(); i++) {
						cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
						ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
						System.out.print(cell.toString() + " ");
						ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
					}
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Asserted The name of the report must be Bids Report");
		ObjectRepo.test.log(Status.PASS, "Asserted The name of the report must be Bids Report");

		FileInputStream excel = new FileInputStream(src);
		Sheet a = WorkbookFactory.create(excel).getSheet("Bids Report");

		String FirstColomnH = a.getRow(0).getCell(0).getStringCellValue();
		Assert.assertEquals(FirstColomnH, "Report Date & Time");
		System.out.println("Report Date & Time" + ":- " + FirstColomnH);
		ObjectRepo.test.log(Status.PASS, FirstColomnH);

		String SecondColomnH = a.getRow(1).getCell(0).getStringCellValue();
		Assert.assertEquals(SecondColomnH, "Event Name");
		System.out.println(SecondColomnH);
		ObjectRepo.test.log(Status.PASS, SecondColomnH);

		String ThirdColomnH = a.getRow(2).getCell(0).getStringCellValue();
		Assert.assertEquals(ThirdColomnH, "Event Date");
		System.out.println(ThirdColomnH);
		ObjectRepo.test.log(Status.PASS, ThirdColomnH);

		String fourthColomnH = a.getRow(3).getCell(0).getStringCellValue();
		Assert.assertEquals(fourthColomnH, "Total Bids Submitted");
		System.out.println(fourthColomnH);
		ObjectRepo.test.log(Status.PASS, fourthColomnH);
		System.out.println("C31910-Confirm the specified introductory fields are available");
		ObjectRepo.test.log(Status.PASS, "C31910-Confirm the specified introductory fields are available");

	}

	public void DataReadFromBidsReportRS_QC_French() {
		wait.until(ExpectedConditions.visibilityOf(reportBtnFR));
		reportBtnFR.click();
		System.out.println("Report page is opened");
		ObjectRepo.test.log(Status.PASS, "Report page is opened");
		searchReportsByEventName_SBMA_FR();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnBidsReportsRS_QC_french);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnBidsReportsRS_QC_french).click();
		System.out.println(
				"C31949 Sponsor/MM can get access to Bids report for an Allowance Sale event during the bidding window(Bids Report_Allowance Sale_French)");
		ObjectRepo.test.log(Status.PASS,
				"C31949 Sponsor/MM can get access to Bids report for an Allowance Sale event during the bidding window(Bids Report_Allowance Sale_French)");
	}

	public void clickreportmenu() {
		wait.until(ExpectedConditions.elementToBeClickable(btnReport));
		btnReport.click();
		
	}

	public void SponsoraccessSBMABidLotAuditReportQC_RS() throws EncryptedDocumentException, IOException {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");

		searchReportsByEventName_SBMA();
		// clickdownloadAllowanceDeliveryReport();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnBidLotAuditReportsRS_QC);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnBidLotAuditReportsRS_QC).click();
		System.out.println("C31941-Confirm Sale By Mutual Agreement Bid Lot Audit Report is available in English");
		ObjectRepo.test.log(Status.PASS,
				"C31941-Confirm Sale By Mutual Agreement Bid Lot Audit Report is available in English ");
		System.out.println(
				"C31939-Sponsor can access the Sale By Mutual Agreement Bid Lot Audit Report after the roll down the process");
		ObjectRepo.test.log(Status.PASS,
				"C31939-Sponsor can access the Sale By Mutual Agreement Bid Lot Audit Report after the roll down the process");

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);//// date1//EQA_R70_SBMA Prescribed_Event_7_12 07-12-2023.xlsx\
		String date2 = "02-25-2024";
		File src = new File(folderPath + File.separator + "Sales by Mutual Agreement Bid Lot Audit Report - "
				+ prop2.getProperty("Event_Name_RE1QC") + " " + date2 + ".xlsx");

		System.out.println("Asserted The name of the report must be Bid Lot Audit Report");
		ObjectRepo.test.log(Status.PASS, "Asserted The name of the report must be Bid Lot Audit Report");
		FileInputStream excel = new FileInputStream(src);
		Sheet a = WorkbookFactory.create(excel).getSheet("Sales by Mutual Agreement Bid L");

		String FirstColomn = a.getRow(4).getCell(0).getStringCellValue();
		Assert.assertEquals(FirstColomn, "General Account Number");
		System.out.println("General Account Number" + ":- " + FirstColomn);
		ObjectRepo.test.log(Status.PASS, FirstColomn);

		String SecondColomn = a.getRow(4).getCell(1).getStringCellValue();
		Assert.assertEquals(SecondColomn, "Legal Name");
		System.out.println("Legal Name" + ":- " + SecondColomn);
		ObjectRepo.test.log(Status.PASS, SecondColomn);

		String ThirdColomn = a.getRow(4).getCell(2).getStringCellValue();
		Assert.assertEquals(ThirdColomn, "Operating Name");
		System.out.println(ThirdColomn);
		ObjectRepo.test.log(Status.PASS, ThirdColomn);

		String fourthColomn = a.getRow(4).getCell(3).getStringCellValue();
		Assert.assertEquals(fourthColomn, "Bid ID");
		System.out.println(fourthColomn);
		ObjectRepo.test.log(Status.PASS, fourthColomn);

		String fifthColomn = a.getRow(4).getCell(4).getStringCellValue();
		Assert.assertEquals(fifthColomn, "Client Bid ID");
		System.out.println(fifthColomn);
		ObjectRepo.test.log(Status.PASS, fifthColomn);

		String sixthColomn = a.getRow(4).getCell(5).getStringCellValue();
		Assert.assertEquals(sixthColomn, "Transaction ID");
		System.out.println(sixthColomn);
		ObjectRepo.test.log(Status.PASS, sixthColomn);

		String seventhColomn = a.getRow(4).getCell(6).getStringCellValue();
		Assert.assertEquals(seventhColomn, "Category Price");
		System.out.println(seventhColomn);
		ObjectRepo.test.log(Status.PASS, seventhColomn);

		String eighthColomn = a.getRow(4).getCell(7).getStringCellValue();
		Assert.assertEquals(eighthColomn, "Lots");
		System.out.println(eighthColomn);
		ObjectRepo.test.log(Status.PASS, eighthColomn);

		String ninghthColomn = a.getRow(4).getCell(8).getStringCellValue();
		Assert.assertEquals(ninghthColomn, "Lot #");
		System.out.println(ninghthColomn);
		ObjectRepo.test.log(Status.PASS, ninghthColomn);

		String tenthColomn = a.getRow(4).getCell(9).getStringCellValue();
		Assert.assertEquals(tenthColomn, "Total Emission Units Bid");
		System.out.println(tenthColomn);
		ObjectRepo.test.log(Status.PASS, tenthColomn);

		String eleventhColomn = a.getRow(4).getCell(10).getStringCellValue();
		Assert.assertEquals(eleventhColomn, "Random Number");
		System.out.println(eleventhColomn);
		ObjectRepo.test.log(Status.PASS, eleventhColomn);

		String twelvthColomn = a.getRow(4).getCell(11).getStringCellValue();
		Assert.assertEquals(twelvthColomn, "Price Sold");
		System.out.println(twelvthColomn);
		ObjectRepo.test.log(Status.PASS, twelvthColomn);

		String thirteenColomn = a.getRow(4).getCell(12).getStringCellValue();
		Assert.assertEquals(thirteenColomn, "Successful Roll-Down Bid Emission Units");
		System.out.println(thirteenColomn);
		ObjectRepo.test.log(Status.PASS, thirteenColomn);
		System.out.println("C31940-Validated Allowance Sale bid lot audit report-Headers");
		ObjectRepo.test.log(Status.PASS, "C31940-Validated Allowance Sale bid lot audit report-Headers");

	}

	public void clickreportmenu_FR()  {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Surveillance']")));
		driver.get().findElement(By.xpath("//a[@title='Rapports']")).click();
	}

	public void SponsoraccessSBMABidLotAuditReportQC_RS_French()  {
		clickreportmenu_FR();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		searchReportsByEventName_SBMA_FR();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnBidLotAuditReportsRS_QC_FR);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnBidLotAuditReportsRS_QC_FR).click();
		System.out.println("C31941-Confirm Sale By Mutual Agreement Bid Lot Audit Report is available in French");
		ObjectRepo.test.log(Status.PASS,
				"C31941-Confirm Sale By Mutual Agreement Bid Lot Audit Report is available in French.");
	try {
		Thread.sleep(25000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	public File getLatestFilefromDir(String folderPath) {
		return null;
	}

	public void DataReadFromBidsAuditReportRS_QC() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(reportBtn));
		reportBtn.click();
		System.out.println("Report page is opened");
		ObjectRepo.test.log(Status.PASS, "Report page is opened");

		searchReportsByEventName_SBMA();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnBidsReportsRS_QC);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnBidsReportsRS_QC).click();
		System.out.println(
				"C31912/C31915-Sponsor/MM can get access to Bids report for an Allowance Sale event during the bidding window");
		ObjectRepo.test.log(Status.PASS,
				"C31912/C31915-Sponsor/MM can get access to Bids report for an Allowance Sale event during the bidding window ");
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src;
		src = new File(folderPath + File.separator + "Bids Report - " + prop2.getProperty("Event_Name_RE1QC") + " "
				+ "07-12-2023" + ".xlsx"); // "07-18-2023"
		System.out.println("reports path : " + folderPath + File.separator + "Bids Report - "
				+ prop2.getProperty("Event_Name_RE1QC") + " " + date1 + ".xlsx");
		try {
			FileInputStream ExcelFileToRead = new FileInputStream(src);
			try (XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead)) {
				XSSFSheet sheet = wb.getSheetAt(0);
				XSSFRow row;
				XSSFCell cell;
				Iterator<Row> rows = sheet.rowIterator();
				while (rows.hasNext()) {
					row = (XSSFRow) rows.next();
					for (int i = 0; i < row.getLastCellNum(); i++) {
						cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
						ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
						System.out.print(cell.toString() + " ");
					}
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void DataReadFromClientBidsAuditReport_SBMA_QC() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(reportBtn));
		reportBtn.click();
		System.out.println("Report page is opened");
		ObjectRepo.test.log(Status.PASS, "Report page is opened");
		searchClientBidsAuditReportsByEventName_SBMA();
		downloadClientBidsAuditReportFromGrid();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src;
		src = new File(folderPath + File.separator + "Client Bids Audit Report - "
				+ prop2.getProperty("Event_Name_RE1QC") + " " + "02-25-2024"+ " " +"QC4085-5100" + ".xlsx"); // "07-18-2023"
		System.out.println("reports path : " + folderPath + File.separator + "Client Bids Audit Report - "
				+ prop2.getProperty("Event_Name_RE1QC") + " " + "02-25-2024"+ " " +"QC4085-5100" + ".xlsx");

		System.out.println("Asserted The name of the report must be Client Bids Audit Report");
		ObjectRepo.test.log(Status.PASS, "Asserted The name of the report must be Client Bids Audit Report");

		try {
			FileInputStream ExcelFileToRead = new FileInputStream(src);
			try (XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead)) {
				XSSFSheet sheet = wb.getSheetAt(0);
				XSSFRow row;
				XSSFCell cell;
				Iterator<Row> rows = sheet.rowIterator();
				while (rows.hasNext()) {
					row = (XSSFRow) rows.next();
					for (int i = 0; i < row.getLastCellNum(); i++) {
						cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
						ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
						System.out.print(cell.toString() + " ");
						System.out.print(cell.toString() + " ");
						ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
					}
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Client Bids Audit Report Data is fetched ");
		ObjectRepo.test.log(Status.PASS, "Client Bids Audit Report Data is fetched");
		FileInputStream excel = new FileInputStream(src);
		Sheet a = WorkbookFactory.create(excel).getSheet("Client Bids Audit Report");

		// Introductory fields
		String FirstIntrField = a.getRow(0).getCell(0).getStringCellValue();
		Assert.assertEquals(FirstIntrField, "Report Date & Time");
		System.out.println(FirstIntrField);
		ObjectRepo.test.log(Status.PASS, FirstIntrField);

		String SecondIntrField = a.getRow(1).getCell(0).getStringCellValue();
		Assert.assertEquals(SecondIntrField, "Event Name");
		System.out.println(SecondIntrField);
		ObjectRepo.test.log(Status.PASS, SecondIntrField);

		String ThirdIntrField = a.getRow(2).getCell(0).getStringCellValue();
		Assert.assertEquals(ThirdIntrField, "Event Date");
		System.out.println(ThirdIntrField);
		ObjectRepo.test.log(Status.PASS, ThirdIntrField);

		String FourthIntrField = a.getRow(3).getCell(0).getStringCellValue();
		Assert.assertEquals(FourthIntrField, "Legal Name");
		System.out.println(FourthIntrField);
		ObjectRepo.test.log(Status.PASS, FourthIntrField);

		String FifthIntrField = a.getRow(4).getCell(0).getStringCellValue();
		Assert.assertEquals(FifthIntrField, "Operating Name");
		System.out.println(FifthIntrField);
		ObjectRepo.test.log(Status.PASS, FifthIntrField);

		String tenthColomn = a.getRow(5).getCell(0).getStringCellValue();
		Assert.assertEquals(tenthColomn, "Total Bids Submitted");
		System.out.println(tenthColomn);
		ObjectRepo.test.log(Status.PASS, tenthColomn);

		System.out.println("C31991-Confirm the specified introductory fields are available");
		ObjectRepo.test.log(Status.PASS, "C31991-Confirm the specified introductory fields are available");

		/// Data-headers
		String FirstColomn = a.getRow(7).getCell(0).getStringCellValue();
		Assert.assertEquals(FirstColomn, "Client Bid ID");
		System.out.println("Client Bid ID" + ":- " + FirstColomn);
		ObjectRepo.test.log(Status.PASS, FirstColomn);

		String SecondColomn = a.getRow(7).getCell(1).getStringCellValue();
		Assert.assertEquals(SecondColomn, "Transaction ID");
		System.out.println("Transaction ID" + ":- " + SecondColomn);
		ObjectRepo.test.log(Status.PASS, SecondColomn);

		String ThirdColomn = a.getRow(7).getCell(2).getStringCellValue();
		Assert.assertEquals(ThirdColomn, "Update Type");
		System.out.println(ThirdColomn);
		ObjectRepo.test.log(Status.PASS, ThirdColomn);

		String fourthColomn = a.getRow(7).getCell(3).getStringCellValue();
		Assert.assertEquals(fourthColomn, "Update By");
		System.out.println(fourthColomn);
		ObjectRepo.test.log(Status.PASS, fourthColomn);

		String fifthColomn = a.getRow(7).getCell(4).getStringCellValue();
		Assert.assertEquals(fifthColomn, "Update Time (ET)");
		System.out.println(fifthColomn);
		ObjectRepo.test.log(Status.PASS, fifthColomn);

		String sixthColomn = a.getRow(7).getCell(5).getStringCellValue();
		Assert.assertEquals(sixthColomn, "Bid Creation Time (ET)");
		System.out.println(sixthColomn);
		ObjectRepo.test.log(Status.PASS, sixthColomn);

		String seventhColomn = a.getRow(7).getCell(6).getStringCellValue();
		Assert.assertEquals(seventhColomn, "Category");
		System.out.println(seventhColomn);
		ObjectRepo.test.log(Status.PASS, seventhColomn);

		String eighthColomn = a.getRow(7).getCell(7).getStringCellValue();
		Assert.assertEquals(eighthColomn, "Category Price");
		System.out.println(eighthColomn);
		ObjectRepo.test.log(Status.PASS, eighthColomn);

		String ninghthColomn = a.getRow(7).getCell(8).getStringCellValue();
		Assert.assertEquals(ninghthColomn, "Total Emission Units Bid");
		System.out.println(ninghthColomn);
		ObjectRepo.test.log(Status.PASS, ninghthColomn);

		System.out.println("C32003-Verify the data in the Client Bids Audit Report is correct");
		ObjectRepo.test.log(Status.PASS, "C32003-Verify the data in the Client Bids Audit Report is correct");
	}

	public void SponsoraccessSBMAClientBidsAuditReportQC_RS_French() throws Exception {
		clickreportmenu_FR();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");

		searchClientBidsReportsByEventName_SBMA_FR();
		downloadClientBidsReportFromGrid_SBMA_FR();
		System.out.println(
				"C31952-Sponsor/AR can get access to Client Bids Audit report for an Allowance Sale event during the bidding window(Report available in french )");
		ObjectRepo.test.log(Status.PASS,
				"C31952-Sponsor/AR can get access to Client Bids Audit report for an Allowance Sale event during the bidding window(Report available in french )");
	}

	public void ARSelectentityClientBidsAuditReport_SBMA_QC() throws IOException, InterruptedException {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='CONTINUE']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='CONTINUER']")));
		}
		selectentityQC.click();
		WebElement abc1 = BtnContinueclkQC;
		abc1.click();
	}

	public void ARAccessClientBidsAuditReport_SBMA_QC() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Events']")));
		reportBtn.click();
		System.out.println("Report page is opened");
		ObjectRepo.test.log(Status.PASS, "Report page is opened");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop2.getProperty("Event_Name_RE1QC"));
		driver.get().findElement(By.xpath("//*[text()='" + prop2.getProperty("Event_Name_RE1QC") + "']")).click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnClientBidsAuditReportsRS_QC);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnClientBidsAuditReportsRS_QC).click();
		System.out.println(
				"C31993-Sponsor/AR can get access to Client Bids Audit report for an Allowance Sale event during the bidding window");
		ObjectRepo.test.log(Status.PASS,
				"C31993-Sponsor/AR can get access to Client Bids Audit report for an Allowance Sale event during the bidding window");
	}

	public void AccessEmissionUnitsDeliveryreportRS_QC() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Monitoring']")));
		reportBtn.click();
		System.out.println("Report page is opened");
		ObjectRepo.test.log(Status.PASS, "Report page is opened");

		searchReportsByEventName_SBMA();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnEmissionUnitsDeliveryReportRS_QC);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnEmissionUnitsDeliveryReportRS_QC).click();
		Thread.sleep(25000);
		System.out.println(
				"C31897 Confirm Emission Units Delivery report is generated after results are run for Sponsor and MM.");
		ObjectRepo.test.log(Status.PASS,
				"C31897 Confirm Emission Units Delivery report is generated after results are run for Sponsor and MM.");
		System.out.println(
				"C31943 Confirm Allowance Delivery report is generated after results are run for Sponsor and MM.(Confirm Allowance delivery Report is available in English.)");
		ObjectRepo.test.log(Status.PASS,
				"C31943 Confirm Allowance Delivery report is generated after results are run for Sponsor and MM.(Confirm Allowance delivery Report is available in English.)");

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

		Date date = new Date();

		String date1 = dateFormat.format(date);
		File src;
		src = new File(folderPath + File.separator + "Emission Units Delivery Report - "
				+ prop2.getProperty("Event_Name_RE1QC") + " " + "02-25-2024" + ".xlsx"); // "07-18-2023"
		System.out.println("reports path : " + folderPath + File.separator + "Emission Units Delivery Report - "
				+ prop2.getProperty("Event_Name_RE1QC") + " " + "02-25-2024"  + ".xlsx");
		try {
			FileInputStream ExcelFileToRead = new FileInputStream(src);
			try (XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead)) {
				XSSFSheet sheet = wb.getSheetAt(0);
				XSSFRow row;
				XSSFCell cell;
				Iterator<Row> rows = sheet.rowIterator();
				while (rows.hasNext()) {
					row = (XSSFRow) rows.next();
					for (int i = 0; i < row.getLastCellNum(); i++) {
						cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
						ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
						System.out.print(cell.toString() + " ");

					}
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Emission Units Delivery Report Data is fetched ");
		ObjectRepo.test.log(Status.PASS, "Emission Units Delivery Report Data is fetched");
		FileInputStream excel = new FileInputStream(src);
		Sheet a = WorkbookFactory.create(excel).getSheet("Emission Units Delivery Report");

		String FirstColomn = a.getRow(4).getCell(0).getStringCellValue();
		Assert.assertEquals(FirstColomn, "General Account Number");
		System.out.println("General Account Number" + ":- " + FirstColomn);
		ObjectRepo.test.log(Status.PASS, FirstColomn);

		String SecondColomn = a.getRow(4).getCell(1).getStringCellValue();
		Assert.assertEquals(SecondColomn, "Legal Name");
		System.out.println("Legal Name" + ":- " + SecondColomn);
		ObjectRepo.test.log(Status.PASS, SecondColomn);

		String ThirdColomn = a.getRow(4).getCell(2).getStringCellValue();
		Assert.assertEquals(ThirdColomn, "Operating Name");
		System.out.println(ThirdColomn);
		ObjectRepo.test.log(Status.PASS, ThirdColomn);

		String fourthColomn = a.getRow(4).getCell(3).getStringCellValue();
		Assert.assertEquals(fourthColomn, "Government");
		System.out.println(fourthColomn);
		ObjectRepo.test.log(Status.PASS, fourthColomn);

		String fifthColomn = a.getRow(4).getCell(4).getStringCellValue();
		Assert.assertEquals(fifthColomn, "Awarded Category");
		System.out.println(fifthColomn);
		ObjectRepo.test.log(Status.PASS, fifthColomn);

		String sixthColomn = a.getRow(4).getCell(5).getStringCellValue();
		Assert.assertEquals(sixthColomn, "Successful Emission Units");
		System.out.println(sixthColomn);
		ObjectRepo.test.log(Status.PASS, sixthColomn);

		System.out.println(
				"C31902-Confirm Emission Units Delivery report is generated after results are run for Sponsor and MM.(Headers displayed)");
		ObjectRepo.test.log(Status.PASS,
				"C31902-Confirm Emission Units Delivery report is generated after results are run for Sponsor and MM.(Headers displayed)");

	}

	public void AccessEmissionUnitsDeliveryreportRS_QC_French() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Surveillance']")));
	    reportBtnFR.click();
	    System.out.println("Report page is opened");
	    ObjectRepo.test.log(Status.PASS, "Report page is opened");
	    searchReportsByEventName_SBMA_FR();
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(btnEmissionUnitsDeliveryReportRS_QC_FR);
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    driver.get().findElement(btnEmissionUnitsDeliveryReportRS_QC_FR).click();
	    System.out.println("C31943 Confirm Allowance Delivery report is generated after results are run for Sponsor and MM.(Confirm Allowance delivery Report is available in French.)");
	    ObjectRepo.test.log(Status.PASS, "C31943 Confirm Allowance Delivery report is generated after results are run for Sponsor and MM.(Confirm Allowance delivery Report is available in French.)");
	Thread.sleep(25000);
	}

	public void searchReportAR_QC() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='CONTINUER']")));
		EntityQC.click();
	    continueBtnQC.click();
	}

	public String ValidateFinancialStatementreportAR_QC_SBMA() throws EmptyFileException, IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Events']")));
		btnReport.click();
	    System.out.println("Click 'Report' Button on navigation bar");
	    ObjectRepo.test.log(Status.PASS, "Click 'Report' Button on navigation bar");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
	    Thread.sleep(5000);
	    driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
	    driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
	    driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
	            .sendKeys(prop2.getProperty("Event_Name_RE1QC_FR"));
	    driver.get().findElement(By.xpath("//*[text()='" + prop2.getProperty("Event_Name_RE1QC_FR") + "']")).click();
	    driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(btnFinancialStatementReportRS_QC);
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    driver.get().findElement(btnFinancialStatementReportRS_QC).click();
	    System.out.println("Financial Statement report download successfully");
	    Thread.sleep(25000);
	    System.out.println("C31980 AR can get access to Financial Statement for an Allowance Sale event after Certification of an Allowance Sale event.");
	    ObjectRepo.test.log(Status.PASS, "C31980 AR can get access to Financial Statement for an Allowance Sale event after Certification of an Allowance Sale event.");
	    File src = new File(
	            folderPath + File.separator + "Financial Statement - R70_SBMA_AfterCertify 02-25-2024 QC4085-5100.pdf");
	    FileInputStream PdfFileToRead = new FileInputStream(src);
	    PDDocument doc = PDDocument.load(PdfFileToRead);
	    int pages = doc.getNumberOfPages();
	    System.out.println("The total number of pages " + pages);
	    PDFTextStripper strip = new PDFTextStripper();
	    strip.setStartPage(1);
	    strip.setEndPage(2);
	    String stripText = strip.getText(doc);
	    String value = stripText.toString();
	    System.out.println(value);
	    if (value == "Financial Services Account Number") {
	        Assert.assertTrue(value.contains("Financial Services Account Number"));
	    }
	    System.out.println(stripText);
	    ObjectRepo.test.log(Status.PASS, stripText);
	    doc.close();
	    return stripText;
	}

	public String ValidateFinancialStatementreportSponsor_QC_SBMA()
	        throws EmptyFileException, IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Monitoring']")));
		Thread.sleep(5000);
		btnReport.click();
	    System.out.println("Click 'Report' Button on navigation bar");
	    ObjectRepo.test.log(Status.PASS, "Click 'Report' Button on navigation bar");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
	    driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
	    driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
	    driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
	            .sendKeys(prop2.getProperty("Event_Name_RE1QC_FR"));
	    JavascriptExecutor js12 = (JavascriptExecutor) driver.get();
	    WebElement element12 = driver.get()
	            .findElement(By.xpath("//*[text()='" + prop2.getProperty("Event_Name_RE1QC_FR") + "']"));
	    js12.executeScript("arguments[0].scrollIntoView();", element12);
	    element12.click();
	    driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
	    driver.get().findElement(By.xpath("(//*[@aria-label='Entity Name'])[2]")).click();
	    JavascriptExecutor js121 = (JavascriptExecutor) driver.get();
	    WebElement element121 = driver.get().findElement(By.xpath("(//*[text()='About WCI, Inc.'])"));
	    js121.executeScript("arguments[0].scrollIntoView();", element121);
	    WebElement click_On_Entiy_Dropdown = driver.get().findElement(By.xpath("(//*[@aria-label='Entity Name'])[2]"));
	    Actions action = new Actions(driver.get());
	    action.moveToElement(click_On_Entiy_Dropdown).build().perform();
	    driver.get().findElement(By.xpath("(//*[text()='Prescribed_Emitter+A - PLC=0 PLA=0 HLC=15717500 HLA=0'])"))
	            .click();
	    Select s = new Select(driver.get().findElement(By.xpath("(//*[@id='demo-customized-select'])[4]")));
	    s.selectByVisibleText("Financial Statement");
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(By.xpath("(//*[@aria-label='Download Report'])"));
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    driver.get().findElement(By.xpath("(//*[@aria-label='Download Report'])")).click();
	    System.out.println("Financial Statement report downloaded successfully");
	    Thread.sleep(25000);
	    System.out.println("The Sponsor can access the Financial Statement Report");
	    ObjectRepo.test.log(Status.PASS, "The Sponsor  can access the Financial Statement Report");
	    File src = new File(
	            folderPath + File.separator + "Financial Statement - R70_SBMA_AfterCertify 02-25-2024 QC4085-5100.pdf");
	    FileInputStream PdfFileToRead = new FileInputStream(src);
	    PDDocument doc = PDDocument.load(PdfFileToRead);
	    int pages = doc.getNumberOfPages();
	    System.out.println("The total number of pages " + pages);
	    PDFTextStripper strip = new PDFTextStripper();
	    strip.setStartPage(1);
	    strip.setEndPage(2);
	    String stripText = strip.getText(doc);
	    String value = stripText.toString();
	    System.out.println(value);
	    if (value == "Financial Services Account Name") {
	        Assert.assertTrue(value.contains("Financial Services Account Name"));
	    }
	    if (value == "General Account Number") {
	        Assert.assertTrue(value.contains("General Account Number"));
	    }
	    ObjectRepo.test.log(Status.PASS, stripText);
	    System.out.println(stripText);
	    System.out.println(
	            "C31980 Sponsor/AR can get access to Financial Statement for an Allowance Sale event after Certification of an Allowance Sale event.");
	    ObjectRepo.test.log(Status.PASS,
	            "C31980 Sponsor/AR can get access to Financial Statement for an Allowance Sale event after Certification of an Allowance Sale event.");
	    System.out.println("C31987 Verify the data in the Financial Statement is correct");
	    ObjectRepo.test.log(Status.PASS, "C31987 Verify the data in the Financial Statement is correct");
	    doc.close();
	    return stripText;
	}

	public void DataReadFromClientBidsReport_SBMA_QC() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Monitoring']")));
		reportBtn.click();
		System.out.println("Report page is opened");
		ObjectRepo.test.log(Status.PASS, "Report page is opened");
		searchClientBidsAuditReportsByEventName_SBMA();
		downloadClientBidsReportFromGrid();
	}

	public void SponsoraccessSBMAClientBidsReportQC_RS_French() throws Exception {
		clickreportmenu_FR();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");

		searchClientBidsReportsByEventName_SBMA_FR();
		downloadClientBidsReportFromGrid_SBMA_FR();
		System.out.println(
				"C31965 Sponsor/AR can get access to Client Bid Report for an Allowance Sale event during the bidding window(Client Bid Report available in french)");
		ObjectRepo.test.log(Status.PASS,
				"C31965 Sponsor/AR can get access to Client Bid Report for an Allowance Sale event during the bidding window(Client Bid Report available in french)");
	}

	public void ARSelectentityClientBidsReport_SBMA_QC() throws IOException, InterruptedException {
		WebElement abc = selectentityQC;
		abc.click();
		WebElement abc1 = BtnContinueclkQC;
		abc1.click();
	}

	public void ARAccessClientBidsReport_SBMA_QC() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Events']")));
	    reportBtn.click();
	    System.out.println("Report page is opened");
	    ObjectRepo.test.log(Status.PASS, "Report page is opened");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
	    driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
	    driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
	    driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
	            .sendKeys(prop2.getProperty("Event_Name_RE1QC"));
	    driver.get().findElement(By.xpath("//*[text()='" + prop2.getProperty("Event_Name_RE1QC") + "']")).click();
	    driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(btnClientBidsReportsRS_QC);
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    element.click();
	    System.out.println("C31964 AR can get access to Client Bids report for an Allowance Sale event");
	    ObjectRepo.test.log(Status.PASS, "C31964 AR can get access to Client Bids report for an Allowance Sale event ");
	}

	public void DataReadFromBidsReportRS_CAL() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Event Monitoring']")));
		Thread.sleep(4000);
	    reportBtn.click();
	    System.out.println("Report page is opened");
	    ObjectRepo.test.log(Status.PASS, "Report page is opened");
	    searchReportsByEventName_ReserveSale();
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(btnBidsReportsRS_CAL);
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    element.click();
	    Thread.sleep(25000);
	    System.out.println("C31911 Sponsor/MM can get access to Bids report for an Allowance Sale event during the bidding window");
	    ObjectRepo.test.log(Status.PASS, "C31911 Sponsor/MM can get access to Bids report for an Allowance Sale event during the bidding window");
	    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
	    Date date = new Date();
	    String date1 = dateFormat.format(date);
	    File src;
	    src = new File(folderPath + File.separator + "Bids Report - " + prop2.getProperty("ReserveSaleEventName") + " " + date1 + ".xlsx");
	    System.out.println("reports path : " + folderPath + File.separator + "Bids Report - " + prop2.getProperty("ReserveSaleEventName") + " " + "06-30-2023" + ".xlsx");
	    try {
	        FileInputStream ExcelFileToRead = new FileInputStream(src);
	        try (XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead)) {
	            XSSFSheet sheet = wb.getSheetAt(0);
	            XSSFRow row;
	            XSSFCell cell;
	            Iterator<Row> rows = sheet.rowIterator();
	            while (rows.hasNext()) {
	                row = (XSSFRow) rows.next();
	                for (int i = 0; i < row.getLastCellNum(); i++) {
	                    cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
	                    ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
	                    String value = cell.toString();
	                    switch (value) {
	                        case "Registry General Account Number":
	                            Assert.assertTrue(value.contains("Registry General Account Number"));
	                            break;
	                        case "Entity Legal Name":
	                            Assert.assertTrue(value.contains("Entity Legal Name"));
	                            break;
	                        case "Entity Operating Name":
	                            Assert.assertTrue(value.contains("Entity Operating Name"));
	                            break;
	                        case "Entity Type":
	                            Assert.assertTrue(value.contains("Entity Type"));
	                            break;
	                        case "Entity Jurisdiction":
	                            Assert.assertTrue(value.contains("Entity Jurisdiction"));
	                            break;
	                        case "Bid ID":
	                            Assert.assertTrue(value.contains("Bid ID"));
	                            break;
	                        case "Client Bid ID":
	                            Assert.assertTrue(value.contains("Client Bid ID"));
	                            break;
	                        case "Transaction ID":
	                            Assert.assertTrue(value.contains("Transaction ID"));
	                            break;
	                        case "Bid By":
	                            Assert.assertTrue(value.contains("Bid By"));
	                            break;
	                        case "Update Time (ET)":
	                            Assert.assertTrue(value.contains("Update Time (ET)"));
	                            break;
	                        case "Submitted Tier":
	                            Assert.assertTrue(value.contains("Submitted Tier"));
	                            break;
	                        case "Tier Price":
	                            Assert.assertTrue(value.contains("Tier Price"));
	                            break;
	                        case "Allowances Bid":
	                            Assert.assertTrue(value.contains("Allowances Bid"));
	                            break;
	                        case "Holding Limit Violation":
	                            Assert.assertTrue(value.contains("Holding Limit Violation"));
	                            break;
	                        case "Bid Guarantee Violation":
	                            Assert.assertTrue(value.contains("Bid Guarantee Violation"));
	                            break;
	                        case "Awarded Tier":
	                            Assert.assertTrue(value.contains("Awarded Tier"));
	                            break;
	                        case "Successful Bid Allowances":
	                            Assert.assertTrue(value.contains("Successful Bid Allowances"));
	                            break;
	                        case "Tie Breaker":
	                            Assert.assertTrue(value.contains("Tie Breaker"));
	                            break;
	                        case "Tie Breaker Share":
	                            Assert.assertTrue(value.contains("Tie Breaker Share"));
	                            break;
	                        case "Share Allocation":
	                            Assert.assertTrue(value.contains("Share Allocation"));
	                            break;
	                        case "Random Number Assignment":
	                            Assert.assertTrue(value.contains("Random Number Assignment"));
	                            break;
	                        case "Random Allocation":
	                            Assert.assertTrue(value.contains("Random Allocation"));
	                            break;
	                        case "Flag":
	                            Assert.assertTrue(value.contains("Flag"));
	                            break;
	                        case "Flag Time (ET)":
	                            Assert.assertTrue(value.contains("Flag Time (ET)"));
	                            break;
	                        case "Flagged By":
	                            Assert.assertTrue(value.contains("Flagged By"));
	                            break;
	                        case "Excluded":
	                            Assert.assertTrue(value.contains("Excluded"));
	                            break;
	                        case "Exclude Time (ET)":
	                            Assert.assertTrue(value.contains("Exclude Time (ET)"));
	                            break;
	                        case "Excluded By":
	                            Assert.assertTrue(value.contains("Excluded By"));
	                            break;
	                        case "Comment":
	                            Assert.assertTrue(value.contains("Comment"));
	                            break;
	                        default:
	                            break;
	                    }
	                    System.out.print(cell.toString() + " ");
	                    ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
	                }
	                System.out.println();
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public void DataReadFromBidsReportRS_QCSBMA() throws IOException, InterruptedException {
	    wait.until(ExpectedConditions.visibilityOf(reportBtn));
	    reportBtn.click();
	    System.out.println("Report page is opened");
	    ObjectRepo.test.log(Status.PASS, "Report page is opened");
	    searchReportsByEventName_SBMA();
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(btnBidsReportsRS_QC);
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    driver.get().findElement(btnBidsReportsRS_QC).click();
	    Thread.sleep(25000);
	    System.out.println("C31933 Verify bids report has information about the comments added to the bid during monitoring of the bids");
	    ObjectRepo.test.log(Status.PASS, "C31933 Verify bids report has information about the comments added to the bid during monitoring of the bids");
	    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
	    Date date = new Date();
	    String date1 = dateFormat.format(date);
	    File src;
	    src = new File(folderPath + File.separator + "Bids Report - " + prop2.getProperty("Event_Name_RE1QC") + " " + "02-25-2024" + ".xlsx");
	    System.out.println("reports path : " + folderPath + File.separator + "Bids Report - " + prop2.getProperty("Event_Name_RE1QC") + " " + "02-25-2024" + ".xlsx");
	    try {
	        FileInputStream ExcelFileToRead = new FileInputStream(src);
	        try (XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead)) {
	            XSSFSheet sheet = wb.getSheetAt(1);
	            XSSFRow row;
	            XSSFCell cell;
	            Iterator<Row> rows = sheet.rowIterator();
	            while (rows.hasNext()) {
	                row = (XSSFRow) rows.next();
	                for (int i = 0; i < row.getLastCellNum(); i++) {
	                    cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
	                    ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
	                    System.out.print(cell.toString() + " ");
	                    ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
	                }
	                System.out.println();
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    System.out.println("Bids report Data is fetched ");
	    ObjectRepo.test.log(Status.PASS, "Bids report Data is fetched");
	    FileInputStream excel = new FileInputStream(src);
	    Sheet a = WorkbookFactory.create(excel).getSheet("Comment");
	    String FirstColomn = a.getRow(0).getCell(0).getStringCellValue();
	    Assert.assertEquals(FirstColomn, "Bid ID");
	    System.out.println("Bid ID" + ":- " + FirstColomn);
	    ObjectRepo.test.log(Status.PASS, FirstColomn);

	    String secondColomn = a.getRow(0).getCell(1).getStringCellValue();
	    Assert.assertEquals(secondColomn, "Client Bid ID");
	    System.out.println("Client Bid ID" + ":- " + secondColomn);
	    ObjectRepo.test.log(Status.PASS, secondColomn);

	    String ThirdColomn = a.getRow(0).getCell(2).getStringCellValue();
	    Assert.assertEquals(ThirdColomn, "Transaction ID");
	    System.out.println("Transaction ID" + ":- " + ThirdColomn);
	    ObjectRepo.test.log(Status.PASS, ThirdColomn);

	    String FourthColomn = a.getRow(0).getCell(3).getStringCellValue();
	    Assert.assertEquals(FourthColomn, "Comment");
	    System.out.println("Comment" + ":- " + FourthColomn);
	    ObjectRepo.test.log(Status.PASS, FourthColomn);
	}

	public void AccessAllowanceDeliveryreportRS_CA() throws IOException, InterruptedException {
	    reportBtn.click();
	    System.out.println("Report page is opened");
	    ObjectRepo.test.log(Status.PASS, "Report page is opened");
	    searchReportsByEventName_ReserveSale();
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(btnAllowanceDeliveryReportRS_CA);
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    driver.get().findElement(btnAllowanceDeliveryReportRS_CA).click();
	    Thread.sleep(25000);
	    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
	    Date date = new Date();
	    String date1 = dateFormat.format(date);
	    File src;
	    src = new File(folderPath + File.separator + "Allowance Delivery Report - "
	            + prop2.getProperty("ReserveSaleEventName") + " " + "02-12-2024" + ".xlsx");
	    System.out.println("reports path : " + folderPath + File.separator + "Allowance Delivery Report - "
	            + prop2.getProperty("ReserveSaleEventName") + " " + "02-12-2024" + ".xlsx");
	    try {
	        FileInputStream ExcelFileToRead = new FileInputStream(src);
	        try (XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead)) {
	            XSSFSheet sheet = wb.getSheetAt(0);
	            XSSFRow row;
	            XSSFCell cell;
	            Iterator<Row> rows = sheet.rowIterator();
	            while (rows.hasNext()) {
	                row = (XSSFRow) rows.next();
	                for (int i = 0; i < row.getLastCellNum(); i++) {
	                    cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
	                    ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
	                    System.out.print(cell.toString() + " ");

	                }
	                System.out.println();
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    System.out.println("Allowance Delivery report Data is fetched ");
	    ObjectRepo.test.log(Status.PASS, "Allowance Delivery report Data is fetched");
	    FileInputStream excel = new FileInputStream(src);
	    Sheet a = WorkbookFactory.create(excel).getSheet("Allowance Delivery Report");

	    // Introductory fields
	    String FirstIntField = a.getRow(0).getCell(0).getStringCellValue();
	    Assert.assertEquals(FirstIntField, "Report Date & Time");
	    System.out.println("Report Date & Time" + ":- " + FirstIntField);
	    ObjectRepo.test.log(Status.PASS, FirstIntField);

	    String SecondIntField = a.getRow(1).getCell(0).getStringCellValue();
	    Assert.assertEquals(SecondIntField, "Event Name");
	    System.out.println("Event Name" + ":- " + SecondIntField);
	    ObjectRepo.test.log(Status.PASS, SecondIntField);

	    String ThirdIntField = a.getRow(2).getCell(0).getStringCellValue();
	    Assert.assertEquals(ThirdIntField, "Event Date");
	    System.out.println("Event Date" + ":- " + ThirdIntField);
	    ObjectRepo.test.log(Status.PASS, ThirdIntField);

	    // Headers
	    String FirstColomn = a.getRow(4).getCell(0).getStringCellValue();
	    Assert.assertEquals(FirstColomn, "Registry General Account Number");
	    System.out.println("Registry General Account Number" + ":- " + FirstColomn);
	    ObjectRepo.test.log(Status.PASS, FirstColomn);

	    String SecondColomn = a.getRow(4).getCell(1).getStringCellValue();
	    Assert.assertEquals(SecondColomn, "Entity Legal Name");
	    System.out.println("Entity Legal Name" + ":- " + SecondColomn);
	    ObjectRepo.test.log(Status.PASS, SecondColomn);

	    String ThirdColomn = a.getRow(4).getCell(2).getStringCellValue();
	    Assert.assertEquals(ThirdColomn, "Entity Operating Name");
	    System.out.println(ThirdColomn);
	    ObjectRepo.test.log(Status.PASS, ThirdColomn);

	    String fourthColomn = a.getRow(4).getCell(3).getStringCellValue();
	    Assert.assertEquals(fourthColomn, "Entity Jurisdiction");
	    System.out.println(fourthColomn);
	    ObjectRepo.test.log(Status.PASS, fourthColomn);

	    String fifthColomn = a.getRow(4).getCell(4).getStringCellValue();
	    Assert.assertEquals(fifthColomn, "Tier Allowances Sold");
	    System.out.println(fifthColomn);
	    ObjectRepo.test.log(Status.PASS, fifthColomn);

	    String sixthColomn = a.getRow(4).getCell(5).getStringCellValue();
	    Assert.assertEquals(sixthColomn, "Total Successful Bid Quantity");
	    System.out.println(sixthColomn);
	    ObjectRepo.test.log(Status.PASS, sixthColomn);

	    System.out.println("C31901-Confirm Allowance Delivery report is generated after results are run for Sponsor and MM.");
	    ObjectRepo.test.log(Status.PASS,
	            "C31901-Confirm Allowance Delivery report is generated after results are run for Sponsor and MM.");

	}

	public class ExcelDataProviderforResultReportRSQCR70 extends commonLib {
		XSSFWorkbook wb;

		public ExcelDataProviderforResultReportRSQCR70() throws Exception {
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			Date date = new Date();
			String date1 = dateFormat.format(date);
			File src = new File(folderPath + File.separator + "Results Report - "
					+ prop2.getProperty("Event_Name_RE1QC") + " " + date1 + ".xlsx");

			try {
				FileInputStream ExcelFileToRead = new FileInputStream(src);
				try (XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead)) {
					XSSFSheet sheet = wb.getSheetAt(0);
					XSSFRow row;
					XSSFCell cell;
					Iterator<Row> rows = sheet.rowIterator();
					while (rows.hasNext()) {
						row = (XSSFRow) rows.next();
						for (int i = 0; i < row.getLastCellNum(); i++) {
							cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
							ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
							System.out.print(cell.toString() + " ");
						}
						System.out.println();

					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				FileInputStream fis = new FileInputStream(src);
				wb = new XSSFWorkbook(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				{

				}
			}
		}

		public void DataReadFromClientBidsReport_NSIndividualAuction() throws IOException, InterruptedException {

		}

		public String getStringData(String Sheetname, int row, int col) {
			return wb.getSheet(Sheetname).getRow(row).getCell(col).getStringCellValue();
		}

		public double getNumericData(String Sheetname, int row, int col) {
			return wb.getSheet(Sheetname).getRow(row).getCell(col).getNumericCellValue();
		}

	}

	public void DataReadFromClientBidsReport_NSIndividualAuction()
			throws InterruptedException, EncryptedDocumentException, IOException {
		reportBtn.click();
		System.out.println("Report page is opened");
		ObjectRepo.test.log(Status.PASS, "Report page is opened");

		searchClientBidsReportsByEventName_NS();
		downloadClientBidsReportFromGrid_NS();

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

		Date date = new Date();

		String date1 = dateFormat.format(date);
		File src;
		src = new File(folderPath + File.separator + "Client Bids Report - " + prop2.getProperty("eventNameNS") + " "
				+ date1 + ".xlsx"); // "07-18-2023"
		System.out.println("reports path : " + folderPath + File.separator + "Client Bids Report - "
				+ prop2.getProperty("eventNameNS") + " " + "08-16-2023 NS3561-3847" + ".xlsx");

		System.out.println("Asserted The name of the report must be Client Bids Audit Report");
		ObjectRepo.test.log(Status.PASS, "Asserted The name of the report must be Client Bids Audit Report");

		try {
			FileInputStream ExcelFileToRead = new FileInputStream(src);
			try (XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead)) {
				XSSFSheet sheet = wb.getSheetAt(0);
				XSSFRow row;
				XSSFCell cell;
				Iterator<Row> rows = sheet.rowIterator();
				while (rows.hasNext()) {
					row = (XSSFRow) rows.next();
					for (int i = 0; i < row.getLastCellNum(); i++) {
						cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
						ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
						System.out.print(cell.toString() + " ");
						ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
					}
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Client Bids Report Data is fetched ");
		ObjectRepo.test.log(Status.PASS, "Client Bids Report Data is fetched");
		FileInputStream excel = new FileInputStream(src);
		Sheet a = WorkbookFactory.create(excel).getSheet("Client Bids Report");
		String FirstIntrField = a.getRow(0).getCell(0).getStringCellValue();
		Assert.assertEquals(FirstIntrField, "Report Date & Time");
		System.out.println(FirstIntrField);
		ObjectRepo.test.log(Status.PASS, FirstIntrField);

		String SecondIntrField = a.getRow(1).getCell(0).getStringCellValue();
		Assert.assertEquals(SecondIntrField, "Event Name");
		System.out.println(SecondIntrField);
		ObjectRepo.test.log(Status.PASS, SecondIntrField);

		String ThirdIntrField = a.getRow(2).getCell(0).getStringCellValue();
		Assert.assertEquals(ThirdIntrField, "Event Date");
		System.out.println(ThirdIntrField);
		ObjectRepo.test.log(Status.PASS, ThirdIntrField);

		String FourthIntrField = a.getRow(3).getCell(0).getStringCellValue();
		Assert.assertEquals(FourthIntrField, "Entity Legal Name");
		System.out.println(FourthIntrField);
		ObjectRepo.test.log(Status.PASS, FourthIntrField);

		String FifthIntrField = a.getRow(4).getCell(0).getStringCellValue();
		Assert.assertEquals(FifthIntrField, "Entity Operating Name");
		System.out.println(FifthIntrField);
		ObjectRepo.test.log(Status.PASS, FifthIntrField);

		String tenthColomn = a.getRow(5).getCell(0).getStringCellValue();
		Assert.assertEquals(tenthColomn, "Total Bids Submitted");
		System.out.println(tenthColomn);
		ObjectRepo.test.log(Status.PASS, tenthColomn);

		String eleventhColomn = a.getRow(6).getCell(0).getStringCellValue();
		Assert.assertEquals(eleventhColomn, "Settlement price CAD (Current)");
		System.out.println(eleventhColomn);
		ObjectRepo.test.log(Status.PASS, eleventhColomn);

		double twelvththColomn = a.getRow(6).getCell(1).getNumericCellValue();
		System.out.println("Settlment price" + twelvththColomn);
		System.out.println("Confirm the specified introductory fields are available");
		ObjectRepo.test.log(Status.PASS, "Confirm the specified introductory fields are available");
		String FirstColomn = a.getRow(8).getCell(0).getStringCellValue();
		Assert.assertEquals(FirstColomn, "Client Bid ID");
		System.out.println("Client Bid ID" + ":- " + FirstColomn);
		ObjectRepo.test.log(Status.PASS, FirstColomn);
		String SecondColomn = a.getRow(8).getCell(1).getStringCellValue();
		Assert.assertEquals(SecondColomn, "Transaction ID");
		System.out.println("Transaction ID" + ":- " + SecondColomn);
		ObjectRepo.test.log(Status.PASS, SecondColomn);

		String ThirdColomn = a.getRow(8).getCell(2).getStringCellValue();
		Assert.assertEquals(ThirdColomn, "Bid By");
		System.out.println(ThirdColomn);
		ObjectRepo.test.log(Status.PASS, ThirdColomn);

		String fourthColomn = a.getRow(8).getCell(3).getStringCellValue();
		Assert.assertEquals(fourthColomn, "Update Time (ET)");
		System.out.println(fourthColomn);
		ObjectRepo.test.log(Status.PASS, fourthColomn);

		String fifthColomn = a.getRow(8).getCell(4).getStringCellValue();
		Assert.assertEquals(fifthColomn, "Currency");
		System.out.println(fifthColomn);
		ObjectRepo.test.log(Status.PASS, fifthColomn);

		String sixthColomn = a.getRow(8).getCell(5).getStringCellValue();
		Assert.assertEquals(sixthColomn, "Bid Price");
		System.out.println(sixthColomn);
		ObjectRepo.test.log(Status.PASS, sixthColomn);

		String seventhColomn = a.getRow(8).getCell(6).getStringCellValue();
		Assert.assertEquals(seventhColomn, "Allowances Bid");
		System.out.println(seventhColomn);
		ObjectRepo.test.log(Status.PASS, seventhColomn);

		String eighthColomn = a.getRow(8).getCell(7).getStringCellValue();
		Assert.assertEquals(eighthColomn, "Vintage");
		System.out.println(eighthColomn);
		ObjectRepo.test.log(Status.PASS, eighthColomn);

		String ninghthColomn = a.getRow(8).getCell(8).getStringCellValue();
		Assert.assertEquals(ninghthColomn, "Successful Bid Allowances");
		System.out.println(ninghthColomn);
		ObjectRepo.test.log(Status.PASS, ninghthColomn);

		String tenthColomn1 = a.getRow(9).getCell(0).getStringCellValue();
		Assert.assertEquals(tenthColomn1, "kbYtei2z");
		System.out.println(tenthColomn1);
		ObjectRepo.test.log(Status.PASS, tenthColomn1);

		String EleventhColomn1 = a.getRow(9).getCell(2).getStringCellValue();
		Assert.assertEquals(EleventhColomn1, "t1nsusera@demo.citssdev.com");
		System.out.println(EleventhColomn1);
		ObjectRepo.test.log(Status.PASS, EleventhColomn1);
		double twelvthhColomn1 = a.getRow(9).getCell(6).getNumericCellValue();
		System.out.println("Allowances Bid" + twelvthhColomn1);
		double thirtenththhColomn1 = a.getRow(9).getCell(8).getNumericCellValue();
		System.out.println("Successful Bid Allowances" + thirtenththhColomn1);
		System.out.println("Verify the data in the Client Bids Report is correct");
		ObjectRepo.test.log(Status.PASS, "Verify the data in the Client Bids Report is correct");
	}

	public void ARSelectentityClientBidsReport_NS() throws IOException, InterruptedException {
		WebElement abc = selectentityNS;
		abc.click();
		WebElement abc1 = BtnContinueclkNS;
		abc1.click();
	}

	public void ARAccessClientBidsReport_NS() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(reportBtn));
		reportBtn.click();
		System.out.println("Report page is opened");
		ObjectRepo.test.log(Status.PASS, "Report page is opened");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Search Reports']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label='Event Name']")));
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).sendKeys(prop2.getProperty("eventNameNS"));
		driver.get().findElement(By.xpath("//*[text()='" + prop2.getProperty("eventNameNS") + "']")).click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnClientBidsReportsNS);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnClientBidsReportsNS).click();
		System.out.println(
				"C31356	AR can access the Client bids report and the data must reflect the final bids submitted.");
		ObjectRepo.test.log(Status.PASS,
				"C31356 AR can access the Client bids report and the data must reflect the final bids submitted.");

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

		Date date = new Date();

		String date1 = dateFormat.format(date);
		File src;
		src = new File(folderPath + File.separator + "Client Bids Report - " + prop2.getProperty("eventNameNS") + " "
				+ date1 + ".xlsx"); // "07-18-2023"
		System.out.println("reports path : " + folderPath + File.separator + "Client Bids Report - "
				+ prop2.getProperty("eventNameNS") + " " + "08-16-2023 NS3561-3847" + ".xlsx");

		System.out.println("Asserted The name of the report must be Client Bids Audit Report");
		ObjectRepo.test.log(Status.PASS, "Asserted The name of the report must be Client Bids Audit Report");

		try {
			FileInputStream ExcelFileToRead = new FileInputStream(src);
			try (XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead)) {
				XSSFSheet sheet = wb.getSheetAt(0);
				XSSFRow row;
				XSSFCell cell;
				Iterator<Row> rows = sheet.rowIterator();
				while (rows.hasNext()) {
					row = (XSSFRow) rows.next();
					for (int i = 0; i < row.getLastCellNum(); i++) {
						cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
						ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
						System.out.print(cell.toString() + " ");
						System.out.print(cell.toString() + " ");
						ObjectRepo.test.log(Status.PASS, cell.toString() + " ");
					}
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Client Bids Report Data is fetched ");
		ObjectRepo.test.log(Status.PASS, "Client Bids Report Data is fetched");
		FileInputStream excel = new FileInputStream(src);
		Sheet a = WorkbookFactory.create(excel).getSheet("Client Bids Report");

		// Introductory fields
		String FirstIntrField = a.getRow(0).getCell(0).getStringCellValue();
		Assert.assertEquals(FirstIntrField, "Report Date & Time");
		System.out.println(FirstIntrField);
		ObjectRepo.test.log(Status.PASS, FirstIntrField);

		String SecondIntrField = a.getRow(1).getCell(0).getStringCellValue();
		Assert.assertEquals(SecondIntrField, "Event Name");
		System.out.println(SecondIntrField);
		ObjectRepo.test.log(Status.PASS, SecondIntrField);

		String ThirdIntrField = a.getRow(2).getCell(0).getStringCellValue();
		Assert.assertEquals(ThirdIntrField, "Event Date");
		System.out.println(ThirdIntrField);
		ObjectRepo.test.log(Status.PASS, ThirdIntrField);
		String FourthIntrField = a.getRow(3).getCell(0).getStringCellValue();
		Assert.assertEquals(FourthIntrField, "Entity Legal Name");
		System.out.println(FourthIntrField);
		ObjectRepo.test.log(Status.PASS, FourthIntrField);
		String FifthIntrField = a.getRow(4).getCell(0).getStringCellValue();
		Assert.assertEquals(FifthIntrField, "Entity Operating Name");
		System.out.println(FifthIntrField);
		ObjectRepo.test.log(Status.PASS, FifthIntrField);
		String tenthColomn = a.getRow(5).getCell(0).getStringCellValue();
		Assert.assertEquals(tenthColomn, "Total Bids Submitted");
		System.out.println(tenthColomn);
		ObjectRepo.test.log(Status.PASS, tenthColomn);
		String eleventhColomn = a.getRow(6).getCell(0).getStringCellValue();
		Assert.assertEquals(eleventhColomn, "Settlement price CAD (Current)");
		System.out.println(eleventhColomn);
		ObjectRepo.test.log(Status.PASS, eleventhColomn);
		double twelvththColomn = a.getRow(6).getCell(1).getNumericCellValue();
		System.out.println("Settlment price" + twelvththColomn);
		System.out.println("Confirm the specified introductory fields are available");
		ObjectRepo.test.log(Status.PASS, "Confirm the specified introductory fields are available");
		String FirstColomn = a.getRow(8).getCell(0).getStringCellValue();
		Assert.assertEquals(FirstColomn, "Client Bid ID");
		System.out.println("Client Bid ID" + ":- " + FirstColomn);
		ObjectRepo.test.log(Status.PASS, FirstColomn);
		String SecondColomn = a.getRow(8).getCell(1).getStringCellValue();
		Assert.assertEquals(SecondColomn, "Transaction ID");
		System.out.println("Transaction ID" + ":- " + SecondColomn);
		ObjectRepo.test.log(Status.PASS, SecondColomn);
		String ThirdColomn = a.getRow(8).getCell(2).getStringCellValue();
		Assert.assertEquals(ThirdColomn, "Bid By");
		System.out.println(ThirdColomn);
		ObjectRepo.test.log(Status.PASS, ThirdColomn);
		String fourthColomn = a.getRow(8).getCell(3).getStringCellValue();
		Assert.assertEquals(fourthColomn, "Update Time (ET)");
		System.out.println(fourthColomn);
		ObjectRepo.test.log(Status.PASS, fourthColomn);
		String fifthColomn = a.getRow(8).getCell(4).getStringCellValue();
		Assert.assertEquals(fifthColomn, "Currency");
		System.out.println(fifthColomn);
		ObjectRepo.test.log(Status.PASS, fifthColomn);
		String sixthColomn = a.getRow(8).getCell(5).getStringCellValue();
		Assert.assertEquals(sixthColomn, "Bid Price");
		System.out.println(sixthColomn);
		ObjectRepo.test.log(Status.PASS, sixthColomn);
		String seventhColomn = a.getRow(8).getCell(6).getStringCellValue();
		Assert.assertEquals(seventhColomn, "Allowances Bid");
		System.out.println(seventhColomn);
		ObjectRepo.test.log(Status.PASS, seventhColomn);
		String eighthColomn = a.getRow(8).getCell(7).getStringCellValue();
		Assert.assertEquals(eighthColomn, "Vintage");
		System.out.println(eighthColomn);
		ObjectRepo.test.log(Status.PASS, eighthColomn);
		String ninghthColomn = a.getRow(8).getCell(8).getStringCellValue();
		Assert.assertEquals(ninghthColomn, "Successful Bid Allowances");
		System.out.println(ninghthColomn);
		ObjectRepo.test.log(Status.PASS, ninghthColomn);
		String tenthColomn1 = a.getRow(9).getCell(0).getStringCellValue();
		Assert.assertEquals(tenthColomn1, "kbYtei2z");
		System.out.println(tenthColomn1);
		ObjectRepo.test.log(Status.PASS, tenthColomn1);
		String EleventhColomn1 = a.getRow(9).getCell(2).getStringCellValue();
		Assert.assertEquals(EleventhColomn1, "t1nsusera@demo.citssdev.com");
		System.out.println(EleventhColomn1);
		ObjectRepo.test.log(Status.PASS, EleventhColomn1);
		double twelvthhColomn1 = a.getRow(9).getCell(6).getNumericCellValue();
		System.out.println("Allowances Bid" + twelvthhColomn1);
		double thirtenththhColomn1 = a.getRow(9).getCell(8).getNumericCellValue();
		System.out.println("Successful Bid Allowances" + thirtenththhColomn1);
		System.out.println("Verify the data in the Client Bids Report is correct");
		ObjectRepo.test.log(Status.PASS, "Verify the data in the Client Bids Report is correct");
	}

	public void searchReportsByEventName_SBMA() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Search Reports']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label='Event Name']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label='Event Name']")))
				.sendKeys(prop2.getProperty("Event_Name_RE1QC"));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + prop2.getProperty("Event_Name_RE1QC") + "']")));
		WebElement event = driver.get().findElement(By.xpath("//*[text()='" + prop2.getProperty("Event_Name_RE1QC") + "']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", event);
		event.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='SEARCH']"))).click();
	}

	public void searchReportsByEventName_SBMA_FR() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Surveillance']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='NOM DU RAPPORT']")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Rechercher un rapport']")))
					.click();
			WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='demo-customized-select'])[2]")));
			Select s = new Select(element2);
			s.selectByVisibleText("Rapport de la livraison des unités d'émission");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@placeholder='Tous'])[1]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@placeholder='Tous'])[1]")))
				.sendKeys(prop2.getProperty("Event_Name_RE1QC_FR"));
		WebElement event = driver.get().findElement(By.xpath("//*[text()='" + prop2.getProperty("Event_Name_RE1QC_FR") + "']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", event);
		event.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='RECHERCHER']"))).click();
	}

	public void searchEmmisionReportsByEventName_SBMA_FR() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Surveillance']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='NOM DU RAPPORT']")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Rechercher un rapport']")))
					.click();
			WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='demo-customized-select'])[2]")));
			Select s = new Select(element2);
			s.selectByVisibleText("Rapport de vérification des lots de la vente de gré à gré");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@placeholder='Tous'])[1]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@placeholder='Tous'])[1]")))
				.sendKeys(prop2.getProperty("Event_Name_RE1QC_FR"));
		WebElement event = driver.get().findElement(By.xpath("//*[text()='" + prop2.getProperty("Event_Name_RE1QC_FR") + "']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", event);
		event.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='RECHERCHER']"))).click();
	}
	public void searchClientBidsAuditReportsByEventName_SBMA()  {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Search Reports']")))
					.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label='Event Name']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label='Event Name']")))
				.sendKeys(prop2.getProperty("Event_Name_RE1QC_FR"));
		 WebElement event = driver.get().findElement(By.xpath("//*[text()='" + prop2.getProperty("Event_Name_RE1QC_FR") + "']"));
		 JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", event);
		event.click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='SEARCH']"))).click();
	}

	public void downloadClientBidsAuditReportFromGrid() {
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@aria-label='Entity Name'])[2]"))).click();
		js1.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Prescribed_Emitter+A - PLC=0 PLA=0 HLC=15717500 HLA=0']")));
		js1.executeScript("arguments[0].scrollIntoView();", element1);
		element1.click();
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='demo-customized-select'])[4]")));
		Select s = new Select(element2);
		s.selectByVisibleText("Client Bids Audit Report");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@aria-label='Download Report'])")));
		js.executeScript("arguments[0].scrollIntoView();", element);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@aria-label='Download Report'])"))).click();
		System.out.println(
				"C31952-Sponsor/AR can get access to Client Bids Audit report for an Allowance Sale event during the bidding window(Report available in English )");
		ObjectRepo.test.log(Status.PASS,
				"C31952-Sponsor/AR can get access to Client Bids Audit report for an Allowance Sale event during the bidding window(Report available in English )");
		System.out.println(
				"C31993-Sponsor/AR can get access to Client Bids Audit report for an Allowance Sale event during the bidding window");
		ObjectRepo.test.log(Status.PASS,
				"C31993-Sponsor/AR can get access to Client Bids Audit report for an Allowance Sale event during the bidding window");
	try {
		Thread.sleep(25000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}

	public void searchClientBidsAuditReportsByEventName_SBMA_FR() throws InterruptedException {
	    driver.get().findElement(By.xpath("//*[text()='Rechercher un rapport']")).click();
	    driver.get().findElement(By.xpath("(//*[@placeholder='Tous'])[1]")).click();
	    driver.get().findElement(By.xpath("(//*[@placeholder='Tous'])[1]"))
	            .sendKeys(prop2.getProperty("Event_Name_RE1QC_FR"));
	    driver.get().findElement(By.xpath("//*[text()='" + prop2.getProperty("Event_Name_RE1QC_FR") + "']")).click();
	    driver.get().findElement(By.xpath("//*[text()='RECHERCHER']")).click();
	}

	public void downloadClientBidsAuditReportFromGrid_SBMA_FR() throws InterruptedException {
	    driver.get().findElement(By.xpath("(//*[@placeholder='Tous'])[3]")).click();
	    JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
	    WebElement element1 = driver.get()
	            .findElement(By.xpath("//*[text()='Prescribed_Emitter+A - PLC=0 PLA=0 HLC=15717500 HLA=0']"));
	    js1.executeScript("arguments[0].scrollIntoView();", element1);
	    element1.click();
	    Select s = new Select(driver.get().findElement(By.xpath("(//*[@id='demo-customized-select'])[4]")));
	    s.selectByVisibleText("Rapport de vérification des offres client");
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(By.xpath("(//*[@data-icon='download'])[9]"));
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    element.click();
	}

	public void ARAccessAndDownloadBidsAuditReportsByEventName_SBMA() throws InterruptedException {
	    driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
	    driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
	    driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
	            .sendKeys(prop2.getProperty("Event_Name_RE1QC"));
	    driver.get().findElement(By.xpath("//*[text()='" + prop2.getProperty("Event_Name_RE1QC") + "']")).click();
	    driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(By.xpath("(//*[@data-icon='download'])"));
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    element.click();
	}
	public void downloadClientBidsReportFromGrid() throws InterruptedException {
	    driver.get().findElement(By.xpath("(//*[@aria-label='Entity Name'])[2]")).click();
	    JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
	    WebElement element1 = driver.get()
	            .findElement(By.xpath("//*[text()='Prescribed_Emitter+A - PLC=0 PLA=0 HLC=15717500 HLA=0']"));
	    js1.executeScript("arguments[0].scrollIntoView();", element1);
	    element1.click();
	    Select s = new Select(driver.get().findElement(By.xpath("(//*[@id='demo-customized-select'])[4]")));
	    s.selectByVisibleText("Client Bids Report");
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(By.xpath("(//*[@aria-label='Download Report'])"));
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    element.click();
	    Thread.sleep(25000);
	}

	public void searchClientBidsReportsByEventName_SBMA_FR() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='NOM DU RAPPORT']")));
	    driver.get().findElement(By.xpath("//*[text()='Rechercher un rapport']")).click();
	    driver.get().findElement(By.xpath("(//*[@placeholder='Tous'])[1]")).click();
	    driver.get().findElement(By.xpath("(//*[@placeholder='Tous'])[1]"))
	            .sendKeys(prop2.getProperty("Event_Name_RE1QC_FR"));
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get()
	            .findElement(By.xpath("//*[text()='" + prop2.getProperty("Event_Name_RE1QC_FR") + "']"));
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    element.click();
	    driver.get().findElement(By.xpath("//*[text()='RECHERCHER']")).click();
	}

	public void downloadClientBidsReportFromGrid_SBMA_FR() throws InterruptedException {
	    driver.get().findElement(By.xpath("(//*[@placeholder='Tous'])[3]")).click();
	    JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
	    WebElement element1 = driver.get()
	            .findElement(By.xpath("//*[text()='Prescribed_Emitter+A - PLC=0 PLA=0 HLC=15717500 HLA=0']"));
	    js1.executeScript("arguments[0].scrollIntoView();", element1);
	    element1.click();
	    Select s = new Select(driver.get().findElement(By.xpath("(//*[@id='demo-customized-select'])[4]")));
	    s.selectByVisibleText("Rapport des offres client");
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(By.xpath("(//*[@data-icon='download'])[9]"));
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    element.click();
	    Thread.sleep(25000);
	}

	public void searchReportsByEventName_ReserveSale() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		Thread.sleep(5000);
	    driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
	    driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
	    driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
	            .sendKeys(prop2.getProperty("ReserveSaleEventName"));
	    WebElement eventElement = driver.get().findElement(By.xpath("//*[text()='" + prop2.getProperty("ReserveSaleEventName") + "']"));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", eventElement);
		eventElement.click();
	    driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
	}

	public void searchClientBidsReportsByEventName_NS() throws InterruptedException {
	    driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
	    WebElement eventNameElement = driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"));
	    eventNameElement.click();
	    eventNameElement.sendKeys(prop2.getProperty("eventNameNS"));
	    WebElement eventElement = driver.get().findElement(By.xpath("//*[text()='" + prop2.getProperty("eventNameNS") + "']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", eventElement);
	    eventElement.click();
	    driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
	}

	public void downloadClientBidsReportFromGrid_NS() throws InterruptedException {
	    driver.get().findElement(By.xpath("(//*[@aria-label='Entity Name'])[2]")).click();
	    WebElement element1 = driver.get().findElement(By.xpath("//*[text()='T1NSEmetteurN']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	    element1.click();
	    Select s = new Select(driver.get().findElement(By.xpath("(//*[@id='demo-customized-select'])[4]")));
	    s.selectByVisibleText("Client Bids Report");
	    WebElement downloadElement = driver.get().findElement(By.xpath("(//*[@aria-label='Download Report'])"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", downloadElement);
	    downloadElement.click();
	}


}
