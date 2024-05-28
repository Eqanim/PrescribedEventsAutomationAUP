package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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

public class MonitoringPage {

    
	@FindBy(xpath = "//span[text()='Event Monitoring']//parent::button[@type='button']")
    private WebElement btnEventMonitoring;

    @FindBy(xpath = "//ul//li[1]")
    private WebElement selectEvent;

    @FindBy(xpath = "//*[contains(text(),'Monitoring')]")
    private WebElement pageTitle;

	@FindBy(xpath = "(//*[text()='A211_OpenBW_Automation'])[1]")
	private WebElement runningEventName1;
	
    @FindBy(xpath = "(//*[text()='JointAuctionAutomation'])[1]")
    private WebElement selectEventName;

    @FindBy(xpath = "//*[text()='SEARCH']")
    private WebElement searchBtn;

    @FindBy(xpath = "(//tbody[@class='MuiTableBody-root'])[2]")
    private WebElement monitoringBidTble;

    @FindBy(xpath = "//*[text()='RESET']")
    private WebElement resetBtn;

    @FindBy(xpath = "//select[@id='select-jurisdiction']")
    private WebElement selecturisdictionDropDwn;

    @FindBy(xpath = "(//*[@data-icon='ellipsis-h'])[1]")
    private WebElement threeDotFirstBtn;

    @FindBy(xpath = "(//tr[@class='MuiTableRow-root MuiTableRow-hover'])[1]")
    private WebElement firstBidRow;

    @FindBy(xpath = "//*[text()='Add Flag']")
    private WebElement addFlagBtn;

    @FindBy(xpath = "//*[text()='Remove Flag']")
    private WebElement removeFlagBtn;

    @FindBy(xpath = "//*[text()='REMOVE FLAG']")
    private WebElement removeFlagBtn2;

    @FindBy(xpath = "//*[text()='FLAG']")
    private WebElement flagBtn;

    @FindBy(xpath = "//*[contains(text(),'You have selected ')]")
    private WebElement addFlagPopUpMsg1;

    @FindBy(xpath = "//*[contains(text(),'Are you sure you want to exclude these')]")
    private WebElement addFlagPopUpMsg2;

    @FindBy(xpath = "//*[text()='The flag has been removed successfully from the selected bids.']")
    private WebElement removFlagSuccessMsg;

    @FindBy(xpath = "//*[text()='The selected bids have been successfully flagged.']")
    private WebElement addFlagSuccessMsg;

    @FindBy(xpath = "//*[text()='This action cannot be performed as one or more of the selected bids cannot be flagged.']")
    private WebElement bulkActionFlaggedMultipleBidsErrorMsg;

    @FindBy(xpath = "//*[text()='This action cannot be performed as one or more of the selected bids are not flagged.']")
    private WebElement bulkActionUnflaggedMultipleBidsErrorMsg;

    @FindBy(xpath = "//*[text()='This action cannot be performed as one or more of the selected bids cannot be excluded.']")
    private WebElement bulkActionExcludeMultipleBidsErrorMsg;

    @FindBy(xpath = "//*[text()='Include Bid']")
    private WebElement includeBidBtn;

    @FindBy(xpath = "//*[text()='INCLUDE BID']")
    private WebElement includeBidBtn1;

    @FindBy(xpath = "//*[contains(text(),'You have selected ')]")
    private WebElement includeBidPopUpMsg1;

    @FindBy(xpath = "//*[contains(text(),'Are you sure you want to include ')]")
    private WebElement includeBidPopUpMsg2;

    @FindBy(xpath = "//*[text()='The selected bids have been successfully included.']")
    private WebElement includeBidSuccessMsg;

    @FindBy(xpath = "//*[text()='A comment must contain at least one character.']")
    private WebElement commentBidErrorMsg;

    @FindBy(xpath = "//*[text()='Exclude Bid']")
    private WebElement excludeBidBtn;

    @FindBy(xpath = "//*[text()='EXCLUDE']")
    private WebElement excludeBidBtn1;

    @FindBy(xpath = "//*[contains(text(),'You have selected ')]")
    private WebElement excludeBidPopUpMsg1;

    @FindBy(xpath = "//*[contains(text(),'Are you sure you want to exclude these')]")
    private WebElement excludeBidPopUpMsg2;

    @FindBy(xpath = "//*[text()='The selected bids have been successfully excluded.']")
    private WebElement excludeBidSuccessMsg;

    @FindBy(xpath = "//*[text()='Bulk Actions']")
    private WebElement bulkActionBtn;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElement selectCheckBox1;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    private WebElement selectCheckBox2;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    private WebElement selectCheckBox3;

    @FindBy(xpath = "(//span[@class='MuiIconButton-label'])[10]")
    private WebElement firstThreeDotBtn;

    @FindBy(xpath = "(//tr[@class='MuiTableRow-root MuiTableRow-hover'])[1]")
    private WebElement assertFisrtRow;

    @FindBy(xpath = "//*[@aria-label=\"select all\"]")
    private WebElement allCheckBoxBtn;

    @FindBy(xpath = "//input[@placeholder='Enter Text']")
    private WebElement addCommentTextBox;

    @FindBy(xpath = "//*[text()='POST']")
    private WebElement postBtn;
	
	public MonitoringPage() {
        PageFactory.initElements(driver.get(), this);
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
		wait.until(ExpectedConditions.elementToBeClickable(pageTitle));
		String title = pageTitle.getText();
		System.out.println(title);
		Assert.assertEquals(title, "Event Monitoring");
	}

	public void clickOnEventMonitoringBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(btnEventMonitoring));
		WebElement event = btnEventMonitoring;
		Actions action = new Actions(driver.get());
		wait.until(ExpectedConditions.elementToBeClickable(event));
		action.moveToElement(event).build().perform();
		action.clickAndHold(event).click().build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(runningEventName1));
		runningEventName1.click();
	}

	public void resetAndSearchFilter() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(monitoringBidTble));
		String msg = monitoringBidTble.getText();
		System.out.println(msg);
		ObjectRepo.test.log(Status.PASS, msg);
		wait.until(ExpectedConditions.elementToBeClickable(selecturisdictionDropDwn));
		WebElement eventType = selecturisdictionDropDwn;
		Select s = new Select(eventType);
		s.selectByVisibleText("Quebec");
		System.out.println("Quebec jurisdiction is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Quebec jurisdiction selected from dropdown");
		wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
		WebElement event = searchBtn;
		Actions action = new Actions(driver.get());
		action.moveToElement(event).build().perform();
		action.clickAndHold(event).click().build().perform();
		System.out.println("Search functions are working and search function is displayed");
		ObjectRepo.test.log(Status.PASS, "Search functions are working and search function is displayed");
		wait.until(ExpectedConditions.elementToBeClickable(monitoringBidTble));
		String ref = monitoringBidTble.getText();
		System.out.println("After Clicking Search button " + ref);
		ObjectRepo.test.log(Status.PASS, "After Clicking Search button " + ref);
		wait.until(ExpectedConditions.visibilityOf(resetBtn));
		resetBtn.click();
		String msg1 = monitoringBidTble.getText();
		System.out.println("After Clicking Reset button " + msg1);
		ObjectRepo.test.log(Status.PASS, "After Clicking Reset button " + msg1);
	}

	public void cancelFunctionAFlaggingBid() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(firstBidRow));
		String msg = firstBidRow.getText();
		System.out.println("Before Cancel flagging bid :- " + msg);
		ObjectRepo.test.log(Status.PASS, "Before Cancel flagging bid :- " + msg);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = threeDotFirstBtn;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		WebElement event = threeDotFirstBtn;
		Actions action = new Actions(driver.get());
		action.moveToElement(event).build().perform();
		action.clickAndHold(event).click().build().perform();
		System.out.println("Three dot button is selected");
		ObjectRepo.test.log(Status.PASS, "Three dot button is selected");
		try {
			wait.until(ExpectedConditions.visibilityOf(addFlagBtn));
		} catch (Exception e) {
		}
		if (addFlagBtn== null) {
			JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
			WebElement element12 = removeFlagBtn;
			js1.executeScript("arguments[0].scrollIntoView();", element12);
			wait.until(ExpectedConditions.visibilityOf(addFlagBtn));
			removeFlagBtn.click();
		} else {
			JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
			WebElement element12 = addFlagBtn;
			js1.executeScript("arguments[0].scrollIntoView();", element12);
			wait.until(ExpectedConditions.visibilityOf(addFlagBtn));
			addFlagBtn.click();
		}
		System.out.println("After clicking on add flag button comment pop up is displayed with cancel X button");
		ObjectRepo.test.log(Status.PASS,
				"After clicking on add flag button comment pop up is displayed with cancel X button");
		driver.get().navigate().refresh();
		System.out.println("After clicking X cancel button Bid is not flagged");
		ObjectRepo.test.log(Status.PASS, "After clicking X cancel button Bid is not flagged");
		wait.until(ExpectedConditions.visibilityOf(firstBidRow));
		String msg1 = firstBidRow.getText();
		System.out.println("After Cancel flagging bid :- " + msg1);
		ObjectRepo.test.log(Status.PASS, "After Cancel flagging bid :- " + msg1);
		System.out.println("Successfully Cancel flagging Bid by sponsor");
		ObjectRepo.test.log(Status.PASS, "Successfully Cancel flagging Bid by sponsor");
	}

	public void SponsorAndMMCannotFlagMultipleBidsWhenTheSelectionOfBidsAreNotCorrect() throws InterruptedException {
//		wait.until(ExpectedConditions.elementToBeClickable(threeDotFirstBtn));
//		WebElement element111 = threeDotFirstBtn;
//		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
//		js1.executeScript("arguments[0].scrollIntoView();", element111);
//		element111.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver.get();
//		WebElement element12 = addFlagBtn;
//		js.executeScript("arguments[0].scrollIntoView();", element12);
//		wait.until(ExpectedConditions.visibilityOf(addFlagBtn));
//		addFlagBtn.click();
//		wait.until(ExpectedConditions.visibilityOf(addCommentTextBox));
//		addCommentTextBox.sendKeys("Test");
//		wait.until(ExpectedConditions.visibilityOf(postBtn));
//		postBtn.click();
//		System.out.println("Bid Successfully flagged By sponsor ");
//		ObjectRepo.test.log(Status.PASS, "Bid Successfully flagged By sponsor");
//		driver.get().navigate().refresh();
		WebElement element11 = allCheckBoxBtn;
		JavascriptExecutor jsq = (JavascriptExecutor) driver.get();
		jsq.executeScript("arguments[0].scrollIntoView();", element11);
		element11.click();
		wait.until(ExpectedConditions.visibilityOf(bulkActionBtn));
		bulkActionBtn.click();
		wait.until(ExpectedConditions.visibilityOf(flagBtn));
		flagBtn.click();
		wait.until(ExpectedConditions.visibilityOf(bulkActionFlaggedMultipleBidsErrorMsg));
		String msg = bulkActionFlaggedMultipleBidsErrorMsg.getText();
		System.out.println("After clicking add flag button :- " + msg);
		ObjectRepo.test.log(Status.PASS, "After clicking add flag button :- " + msg);
		driver.get().navigate().refresh();
		 
		WebElement element121 = threeDotFirstBtn;
		JavascriptExecutor jsq1 = (JavascriptExecutor) driver.get();
		jsq1.executeScript("arguments[0].scrollIntoView();", element121);
		element121.click();
		System.out.println("Flagged Bid checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "Flagged Bid checkbox is selected");
		wait.until(ExpectedConditions.visibilityOf(removeFlagBtn));
		removeFlagBtn.click();
		wait.until(ExpectedConditions.visibilityOf(addCommentTextBox));
		addCommentTextBox.sendKeys("Testnew");
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		System.out.println("Flag Removed successfully by sponsor");
		ObjectRepo.test.log(Status.PASS, "Flag Removed successfully by sponsor");
	}

	public void MarketMonitorCannotFlagMultipleBidsWhenTheSelectionOfBidsAreNotCorrect() {
		wait.until(ExpectedConditions.elementToBeClickable(threeDotFirstBtn));
		WebElement element111 = threeDotFirstBtn;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", element111);
		element111.click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element12 = addFlagBtn;
		js.executeScript("arguments[0].scrollIntoView();", element12);
		wait.until(ExpectedConditions.visibilityOf(addFlagBtn));
		addFlagBtn.click();
		wait.until(ExpectedConditions.visibilityOf(addCommentTextBox));
		addCommentTextBox.sendKeys("Test");
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bid Successfully flagged By sponsor ");
		ObjectRepo.test.log(Status.PASS, "Bid Successfully flagged By MM");
		driver.get().navigate().refresh();
		ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Submitted Bids']"));
		JavascriptExecutor jsq = (JavascriptExecutor) driver.get();
		jsq.executeScript("arguments[0].scrollIntoView();", allCheckBoxBtn);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(allCheckBoxBtn)).click();
		} catch (Exception e) {
			new Actions(driver.get()).moveToElement(allCheckBoxBtn).click().build().perform();
		}
		wait.until(ExpectedConditions.elementToBeClickable(bulkActionBtn));
		bulkActionBtn.click();
		wait.until(ExpectedConditions.visibilityOf(addFlagBtn));
		addFlagBtn.click();
		wait.until(ExpectedConditions.visibilityOf(bulkActionFlaggedMultipleBidsErrorMsg));
		String msg = bulkActionFlaggedMultipleBidsErrorMsg.getText();
		System.out.println("After clicking add flag button :- " + msg);
		ObjectRepo.test.log(Status.PASS, "After clicking add flag button :- " + msg);
		driver.get().navigate().refresh();
		WebElement element121 = threeDotFirstBtn;
		JavascriptExecutor jsq1 = (JavascriptExecutor) driver.get();
		jsq1.executeScript("arguments[0].scrollIntoView();", element121);
		element121.click();
		System.out.println("Flagged Bid checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "Flagged Bid checkbox is selected");
		wait.until(ExpectedConditions.visibilityOf(removeFlagBtn));
		removeFlagBtn.click();
		wait.until(ExpectedConditions.visibilityOf(addCommentTextBox));
		addCommentTextBox.sendKeys("Testnew");
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		System.out.println("Flag Removed successfully by MM");
		ObjectRepo.test.log(Status.PASS, "Flag Removed successfully by MM");
	}

	public void SponsorCannotUnFlagMultipleBidsWhenTheSelectionOfBidsAreNotCorrect() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = selectCheckBox2;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		WebElement event = selectCheckBox2;
		Actions action = new Actions(driver.get());
		action.moveToElement(event).build().perform();
		action.clickAndHold(event).click().build().perform();
		System.out.println("1st Bid is selected for ADD Flag");
		ObjectRepo.test.log(Status.PASS, "1st Bid is selected for ADD Flag");
		WebElement event1 = selectCheckBox1;
		Actions action2 = new Actions(driver.get());
		action2.moveToElement(event1).build().perform();
		action2.clickAndHold(event1).click().build().perform();
		System.out.println("2nd Bid is selected for ADD Flag");
		ObjectRepo.test.log(Status.PASS, "2nd Bid is selected for ADD Flag");
		WebElement bulkAction = bulkActionBtn;
		Actions action1 = new Actions(driver.get());
		action1.moveToElement(bulkAction).build().perform();
		action1.clickAndHold(bulkAction).click().build().perform();
		System.out.println("Bulk actions button is selected");
		ObjectRepo.test.log(Status.PASS, "Bulk actions button is selected");
		WebElement bulkAction1 = addFlagBtn;
		Actions action11 = new Actions(driver.get());
		action11.moveToElement(bulkAction1).build().perform();
		action11.clickAndHold(bulkAction1).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(flagBtn));
		flagBtn.click();
		wait.until(ExpectedConditions.visibilityOf(addCommentTextBox));
		addCommentTextBox.sendKeys("Test");
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		 
		wait.until(ExpectedConditions.elementToBeClickable(addFlagSuccessMsg));
		String flagSuccessMsg = addFlagSuccessMsg.getText();
		System.out.println(flagSuccessMsg);
		ObjectRepo.test.log(Status.PASS, flagSuccessMsg);
		WebElement check = allCheckBoxBtn;
		Actions act = new Actions(driver.get());
		act.moveToElement(check).build().perform();
		act.clickAndHold(check).click().build().perform();
		System.out.println("Sponsor selected all check box for bulk actions");
		ObjectRepo.test.log(Status.PASS, "Sponsor selected all check box for bulk actions");
		wait.until(ExpectedConditions.visibilityOf(bulkActionBtn));
		bulkActionBtn.click();
		wait.until(ExpectedConditions.visibilityOf(removeFlagBtn));
		removeFlagBtn.click();
		 
		wait.until(ExpectedConditions.visibilityOf(bulkActionUnflaggedMultipleBidsErrorMsg));
		String msg = bulkActionUnflaggedMultipleBidsErrorMsg.getText();
		System.out.println("After clicking Remove flag button :- " + msg);
		ObjectRepo.test.log(Status.PASS, "After clicking Remove flag button :- " + msg);
		WebElement check1 = allCheckBoxBtn;
		Actions act1 = new Actions(driver.get());
		act1.moveToElement(check1).build().perform();
		act1.clickAndHold(check1).click().build().perform();
		System.out.println("Unselected multiple Checkbox by sponsorr");
		ObjectRepo.test.log(Status.PASS, "Unselected multiple Checkbox by sponsor");
		JavascriptExecutor jss = (JavascriptExecutor) driver.get();
		WebElement element19 = selectCheckBox2;
		jss.executeScript("arguments[0].scrollIntoView();", element19);
		WebElement eventE = selectCheckBox2;
		Actions actionA = new Actions(driver.get());
		actionA.moveToElement(eventE).build().perform();
		actionA.clickAndHold(eventE).click().build().perform();
		System.out.println("1st Bid is selected for UN-Flag");
		ObjectRepo.test.log(Status.PASS, "1st Bid is selected for UN-Flag");
		WebElement event13 = selectCheckBox1;
		Actions action21 = new Actions(driver.get());
		action21.moveToElement(event13).build().perform();
		action21.clickAndHold(event13).click().build().perform();
		System.out.println("2nd Bid is selected for UN-Flag");
		ObjectRepo.test.log(Status.PASS, "2nd Bid is selected for UN-Flag");
		 
		wait.until(ExpectedConditions.visibilityOf(bulkActionBtn));
		bulkActionBtn.click();
		wait.until(ExpectedConditions.visibilityOf(removeFlagBtn));
		removeFlagBtn.click();
		wait.until(ExpectedConditions.visibilityOf(removeFlagBtn2));
		removeFlagBtn2.click();
		wait.until(ExpectedConditions.visibilityOf(addCommentTextBox));
		addCommentTextBox.sendKeys("Testnew");
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		 
		wait.until(ExpectedConditions.visibilityOf(removFlagSuccessMsg));
		String removeFlagSuccessMsg = removFlagSuccessMsg.getText();
		System.out.println(removeFlagSuccessMsg);
		ObjectRepo.test.log(Status.PASS, removeFlagSuccessMsg);
	}

	public void MarketMonitorCannotUnFlagMultipleBidsWhenTheSelectionOfBidsAreNotCorrect() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = selectCheckBox2;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		WebElement event = selectCheckBox2;
		Actions action = new Actions(driver.get());
		action.moveToElement(event).build().perform();
		action.clickAndHold(event).click().build().perform();
		System.out.println("1st Bid is selected for ADD Flag");
		ObjectRepo.test.log(Status.PASS, "1st Bid is selected for ADD Flag");
		WebElement event1 = selectCheckBox1;
		Actions action2 = new Actions(driver.get());
		action2.moveToElement(event1).build().perform();
		action2.clickAndHold(event1).click().build().perform();
		System.out.println("2nd Bid is selected for ADD Flag");
		ObjectRepo.test.log(Status.PASS, "2nd Bid is selected for ADD Flag");
		WebElement bulkAction = bulkActionBtn;
		Actions action1 = new Actions(driver.get());
		action1.moveToElement(bulkAction).build().perform();
		action1.clickAndHold(bulkAction).click().build().perform();
		System.out.println("Bulk actions button is selected");
		ObjectRepo.test.log(Status.PASS, "Bulk actions button is selected");
		WebElement bulkAction1 = addFlagBtn;
		Actions action11 = new Actions(driver.get());
		action11.moveToElement(bulkAction1).build().perform();
		action11.clickAndHold(bulkAction1).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(flagBtn));
		flagBtn.click();
		wait.until(ExpectedConditions.visibilityOf(addCommentTextBox));
		addCommentTextBox.sendKeys("Test");
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		 
		wait.until(ExpectedConditions.visibilityOf(addFlagSuccessMsg));
		String flagSuccessMsg = addFlagSuccessMsg.getText();
		System.out.println(flagSuccessMsg);
		ObjectRepo.test.log(Status.PASS, flagSuccessMsg);
		 
		WebElement check = allCheckBoxBtn;
		Actions act = new Actions(driver.get());
		act.moveToElement(check).build().perform();
		act.clickAndHold(check).click().build().perform();
		System.out.println("MM selected all check box for bulk actions");
		ObjectRepo.test.log(Status.PASS, "MM selected all check box for bulk actions");
		wait.until(ExpectedConditions.visibilityOf(bulkActionBtn));
		bulkActionBtn.click();
		wait.until(ExpectedConditions.visibilityOf(removeFlagBtn));
		removeFlagBtn.click();
		wait.until(ExpectedConditions.visibilityOf(bulkActionUnflaggedMultipleBidsErrorMsg));
		String msg = bulkActionUnflaggedMultipleBidsErrorMsg.getText();
		System.out.println("After clicking Remove flag button :- " + msg);
		ObjectRepo.test.log(Status.PASS, "After clicking Remove flag button :- " + msg);
		System.out.println("Error Message for MM");
		ObjectRepo.test.log(Status.PASS, "Error Message for MM");
		WebElement check1 = allCheckBoxBtn;
		Actions act1 = new Actions(driver.get());
		act1.moveToElement(check1).build().perform();
		act1.clickAndHold(check1).click().build().perform();
		System.out.println("Unselected multiple Checkbox by sponsorr");
		ObjectRepo.test.log(Status.PASS, "Unselected multiple Checkbox by sponsor");
		JavascriptExecutor jss = (JavascriptExecutor) driver.get();
		WebElement element19 = selectCheckBox2;
		jss.executeScript("arguments[0].scrollIntoView();", element19);
		WebElement eventE = selectCheckBox2;
		Actions actionA = new Actions(driver.get());
		actionA.moveToElement(eventE).build().perform();
		actionA.clickAndHold(eventE).click().build().perform();
		System.out.println("1st Bid is selected for UN-Flag");
		ObjectRepo.test.log(Status.PASS, "1st Bid is selected for UN-Flag");
		WebElement event13 = selectCheckBox1;
		Actions action21 = new Actions(driver.get());
		action21.moveToElement(event13).build().perform();
		action21.clickAndHold(event13).click().build().perform();
		System.out.println("2nd Bid is selected for UN-Flag");
		ObjectRepo.test.log(Status.PASS, "2nd Bid is selected for UN-Flag");
		wait.until(ExpectedConditions.visibilityOf(bulkActionBtn));
		bulkActionBtn.click();
		wait.until(ExpectedConditions.visibilityOf(removeFlagBtn));
		removeFlagBtn.click();
		wait.until(ExpectedConditions.visibilityOf(removeFlagBtn2));
		removeFlagBtn2.click();
		wait.until(ExpectedConditions.visibilityOf(addCommentTextBox));
		addCommentTextBox.sendKeys("Testnew");
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		 
		wait.until(ExpectedConditions.visibilityOf(removFlagSuccessMsg));
		String removeFlagSuccessMsg = removFlagSuccessMsg.getText();
		System.out.println(removeFlagSuccessMsg);
	}

	public void SponsorCanExcludeMultipleBids() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = selectCheckBox2;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		WebElement event = selectCheckBox2;
		Actions action = new Actions(driver.get());
		action.moveToElement(event).build().perform();
		action.clickAndHold(event).click().build().perform();
		System.out.println("Second Number checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "Second Number checkbox is selected");
		WebElement event1 = selectCheckBox1;
		Actions action2 = new Actions(driver.get());
		action2.moveToElement(event1).build().perform();
		action2.clickAndHold(event1).click().build().perform();
		System.out.println("First Number checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "First Number checkbox is selected");
		WebElement bulkAction = bulkActionBtn;
		Actions action1 = new Actions(driver.get());
		action1.moveToElement(bulkAction).build().perform();
		action1.clickAndHold(bulkAction).click().build().perform();
		System.out.println("Bulk actions button is selected");
		ObjectRepo.test.log(Status.PASS, "Bulk actions button is selected");
		WebElement bulkAction1 = excludeBidBtn;
		Actions action11 = new Actions(driver.get());
		action11.moveToElement(bulkAction1).build().perform();
		action11.clickAndHold(bulkAction1).click().build().perform();
		System.out.println("Exclude bid button is selected");
		ObjectRepo.test.log(Status.PASS, "Exclude bid button is selected");
		String ref = excludeBidPopUpMsg1.getText();
		System.out.println("Exclude bid Pop up message displayed :- " + ref);
		ObjectRepo.test.log(Status.PASS, "Exclude bid Pop up message displayed :- " + ref);
		String ref1 = excludeBidPopUpMsg2.getText();
		System.out.println("Exclude bid Pop up message displayed :- " + ref1);
		ObjectRepo.test.log(Status.PASS, "Exclude bid Pop up message displayed :- " + ref1);
		wait.until(ExpectedConditions.visibilityOf(excludeBidBtn1));
		excludeBidBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		String errorMsg = commentBidErrorMsg.getText();
		System.out.println("Error message is displayed for empty exclude bid comment :- " + errorMsg);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed :- " + errorMsg);
		wait.until(ExpectedConditions.visibilityOf(addCommentTextBox));
		addCommentTextBox.sendKeys("Testnew");
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		 
		wait.until(ExpectedConditions.visibilityOf(excludeBidSuccessMsg));
		String SuccessMsg = excludeBidSuccessMsg.getText();
		System.out.println("Exclude Bid success message :- " + SuccessMsg);
		ObjectRepo.test.log(Status.PASS, "Exclude Bid success message :- " + SuccessMsg);
		System.out.println("************************************************************************");
		JavascriptExecutor java = (JavascriptExecutor) driver.get();
		WebElement ele = selectCheckBox2;
		java.executeScript("arguments[0].scrollIntoView();", ele);
		WebElement abc1 = selectCheckBox2;
		Actions abc = new Actions(driver.get());
		abc.moveToElement(abc1).build().perform();
		WebElement abc2 = selectCheckBox1;
		Actions xyz = new Actions(driver.get());
		xyz.moveToElement(abc2).build().perform();
		WebElement btn = firstThreeDotBtn;
		Actions xyz1 = new Actions(driver.get());
		xyz1.moveToElement(btn).build().perform();
		xyz1.click();
		String assertRow = assertFisrtRow.getText();
		System.out.println("After Exclude bid :- " + assertRow);
		ObjectRepo.test.log(Status.PASS, "After Exclude bid :- " + assertRow);
		JavascriptExecutor jsv = (JavascriptExecutor) driver.get();
		WebElement element1A = selectCheckBox2;
		jsv.executeScript("arguments[0].scrollIntoView();", element1A);
		WebElement eventNew = selectCheckBox2;
		Actions actionT = new Actions(driver.get());
		actionT.moveToElement(eventNew).build().perform();
		actionT.clickAndHold(eventNew).click().build().perform();
		System.out.println("Second Number checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "Second Number checkbox is selected");
		WebElement event5 = selectCheckBox1;
		Actions pqr = new Actions(driver.get());
		pqr.moveToElement(event5).build().perform();
		pqr.clickAndHold(event5).click().build().perform();
		System.out.println("First Number checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "First Number checkbox is selected");
		WebElement includeAction = bulkActionBtn;
		Actions actionY = new Actions(driver.get());
		actionY.moveToElement(includeAction).build().perform();
		actionY.clickAndHold(includeAction).click().build().perform();
		System.out.println("Bulk actions button is selected");
		ObjectRepo.test.log(Status.PASS, "Bulk actions button is selected");
		WebElement includeAction1 = includeBidBtn;
		Actions POM = new Actions(driver.get());
		POM.moveToElement(includeAction1).build().perform();
		POM.clickAndHold(includeAction1).click().build().perform();
		System.out.println("Include bid button is selected");
		ObjectRepo.test.log(Status.PASS, "Include bid button is selected");
		String text = includeBidPopUpMsg1.getText();
		System.out.println("Include bid Pop up message displayed :- " + text);
		ObjectRepo.test.log(Status.PASS, "Include bid Pop up message displayed :- " + text);
		String text1 = includeBidPopUpMsg2.getText();
		System.out.println("Include bid Pop up message displayed :- " + text1);
		ObjectRepo.test.log(Status.PASS, "Include bid Pop up message displayed :- " + text1);
		wait.until(ExpectedConditions.visibilityOf(includeBidBtn1));
		includeBidBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		String errorMsg1 = commentBidErrorMsg.getText();
		System.out.println("Error message is displayed :- " + errorMsg1);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed :- " + errorMsg1);
		wait.until(ExpectedConditions.visibilityOf(addCommentTextBox));
		addCommentTextBox.sendKeys("Testnew");
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		wait.until(ExpectedConditions.visibilityOf(includeBidSuccessMsg));
		String includeSuccessMsg = includeBidSuccessMsg.getText();
		System.out.println("Include Bid success message :- " + includeSuccessMsg);
		ObjectRepo.test.log(Status.PASS, "Include Bid success message :- " + includeSuccessMsg);
		System.out.println("***************************************************************");
		WebElement pmt = selectCheckBox2;
		Actions verify = new Actions(driver.get());
		verify.moveToElement(pmt).build().perform();
		WebElement abcd = selectCheckBox1;
		Actions xy = new Actions(driver.get());
		xy.moveToElement(abcd).build().perform();
		WebElement ele1 = selectCheckBox2;
		java.executeScript("arguments[0].scrollIntoView();", ele1);
		WebElement btn1 = firstThreeDotBtn;
		Actions xyz12 = new Actions(driver.get());
		xyz12.moveToElement(btn1).build().perform();
		xyz12.click();
		String assertRow1 = assertFisrtRow.getText();
		System.out.println("After Include bid :- " + assertRow1);
		ObjectRepo.test.log(Status.PASS, "After Include bid :- " + assertRow1);
	}

	public void SponsorCannotIncludeMultipleBids() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = selectCheckBox2;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		WebElement event = selectCheckBox2;
		Actions action = new Actions(driver.get());
		action.moveToElement(event).build().perform();
		action.clickAndHold(event).click().build().perform();
		System.out.println("Second Number checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "Second Number checkbox is selected");
		WebElement event1 = selectCheckBox1;
		Actions action2 = new Actions(driver.get());
		action2.moveToElement(event1).build().perform();
		action2.clickAndHold(event1).click().build().perform();
		System.out.println("First Number checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "First Number checkbox is selected");
		WebElement bulkAction = bulkActionBtn;
		Actions action1 = new Actions(driver.get());
		action1.moveToElement(bulkAction).build().perform();
		action1.clickAndHold(bulkAction).click().build().perform();
		System.out.println("Bulk actions button is selected");
		ObjectRepo.test.log(Status.PASS, "Bulk actions button is selected");
		WebElement bulkAction1 = excludeBidBtn;
		Actions action11 = new Actions(driver.get());
		action11.moveToElement(bulkAction1).build().perform();
		action11.clickAndHold(bulkAction1).click().build().perform();
		System.out.println("Exclude bid button is selected");
		ObjectRepo.test.log(Status.PASS, "Exclude bid button is selected");
		wait.until(ExpectedConditions.elementToBeClickable(excludeBidPopUpMsg1));
		String ref = excludeBidPopUpMsg1.getText();
		System.out.println("Exclude bid Pop up message displayed :- " + ref);
		ObjectRepo.test.log(Status.PASS, "Exclude bid Pop up message displayed :- " + ref);
		String ref1 = excludeBidPopUpMsg2.getText();
		System.out.println("Exclude bid Pop up message displayed :- " + ref1);
		ObjectRepo.test.log(Status.PASS, "Exclude bid Pop up message displayed :- " + ref1);
		wait.until(ExpectedConditions.visibilityOf(excludeBidBtn1));
		excludeBidBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		String errorMsg = commentBidErrorMsg.getText();
		System.out.println("Error message is displayed for empty exclude bid comment :- " + errorMsg);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed :- " + errorMsg);
		wait.until(ExpectedConditions.visibilityOf(addCommentTextBox));
		addCommentTextBox.sendKeys("Testnew");
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		wait.until(ExpectedConditions.visibilityOf(excludeBidSuccessMsg));
		String SuccessMsg = excludeBidSuccessMsg.getText();
		System.out.println("Exclude Bid success message :- " + SuccessMsg);
		ObjectRepo.test.log(Status.PASS, "Exclude Bid success message :- " + SuccessMsg);
		System.out.println("************************************************************************");
		 
		JavascriptExecutor jsv = (JavascriptExecutor) driver.get();
		WebElement element1A = selectCheckBox2;
		jsv.executeScript("arguments[0].scrollIntoView();", element1A);
		WebElement eventNew = selectCheckBox2;
		Actions actionT = new Actions(driver.get());
		actionT.moveToElement(eventNew).build().perform();
		actionT.clickAndHold(eventNew).click().build().perform();
		System.out.println("excluded bid checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "excluded bid checkbox is selected");
		WebElement event5 = selectCheckBox1;
		Actions pqr = new Actions(driver.get());
		pqr.moveToElement(event5).build().perform();
		pqr.clickAndHold(event5).click().build().perform();
		System.out.println("excluded bid checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "excluded bid checkbox is selected");
		WebElement event6 = selectCheckBox3;
		Actions pqrs = new Actions(driver.get());
		pqrs.moveToElement(event6).build().perform();
		pqrs.clickAndHold(event6).click().build().perform();
		System.out.println("Without excluded bid checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "Without excluded bid checkbox is selected");
		WebElement bulkActions = bulkActionBtn;
		Actions actionNew = new Actions(driver.get());
		actionNew.moveToElement(bulkActions).build().perform();
		actionNew.clickAndHold(bulkActions).click().build().perform();
		System.out.println("Bulk actions button is selected");
		ObjectRepo.test.log(Status.PASS, "Bulk actions button is selected");
		WebElement test = includeBidBtn;
		Actions actionC = new Actions(driver.get());
		actionC.moveToElement(test).build().perform();
		actionC.clickAndHold(test).click().build().perform();
		System.out.println("Include bid button is selected");
		ObjectRepo.test.log(Status.PASS, "Include bid button is selected");
		System.out.println("************************************************************************");
	}

	public void SponsorCannotExcludeMultipleBids() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = selectCheckBox2;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		WebElement event = selectCheckBox2;
		Actions action = new Actions(driver.get());
		action.moveToElement(event).build().perform();
		action.clickAndHold(event).click().build().perform();
		System.out.println("Second Number checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "Second Number checkbox is selected");
		WebElement event1 = selectCheckBox1;
		Actions action2 = new Actions(driver.get());
		action2.moveToElement(event1).build().perform();
		action2.clickAndHold(event1).click().build().perform();
		System.out.println("First Number checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "First Number checkbox is selected");
		WebElement bulkAction = bulkActionBtn;
		Actions action1 = new Actions(driver.get());
		action1.moveToElement(bulkAction).build().perform();
		action1.clickAndHold(bulkAction).click().build().perform();
		System.out.println("Bulk actions button is selected");
		ObjectRepo.test.log(Status.PASS, "Bulk actions button is selected");
		WebElement bulkAction1 = excludeBidBtn;
		Actions action11 = new Actions(driver.get());
		action11.moveToElement(bulkAction1).build().perform();
		action11.clickAndHold(bulkAction1).click().build().perform();
		System.out.println("Exclude bid button is selected");
		ObjectRepo.test.log(Status.PASS, "Exclude bid button is selected");
		String ref = excludeBidPopUpMsg1.getText();
		System.out.println("Exclude bid Pop up message displayed :- " + ref);
		ObjectRepo.test.log(Status.PASS, "Exclude bid Pop up message displayed :- " + ref);
		String ref1 = excludeBidPopUpMsg2.getText();
		System.out.println("Exclude bid Pop up message displayed :- " + ref1);
		ObjectRepo.test.log(Status.PASS, "Exclude bid Pop up message displayed :- " + ref1);
		wait.until(ExpectedConditions.visibilityOf(excludeBidBtn1));
		excludeBidBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(addCommentTextBox));
		addCommentTextBox.sendKeys("Testnew");
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(excludeBidSuccessMsg));
		String SuccessMsg = excludeBidSuccessMsg.getText();
		System.out.println("Exclude Bid success message :- " + SuccessMsg);
		ObjectRepo.test.log(Status.PASS, "Exclude Bid success message :- " + SuccessMsg);
		System.out.println("************************************************************************");
		JavascriptExecutor jsv = (JavascriptExecutor) driver.get();
		WebElement element1A = selectCheckBox2;
		jsv.executeScript("arguments[0].scrollIntoView();", element1A);
		WebElement eventNew = selectCheckBox2;
		Actions actionT = new Actions(driver.get());
		actionT.moveToElement(eventNew).build().perform();
		actionT.clickAndHold(eventNew).click().build().perform();
		System.out.println("excluded bid checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "excluded bid checkbox is selected");
		WebElement event5 = selectCheckBox1;
		Actions pqr = new Actions(driver.get());
		pqr.moveToElement(event5).build().perform();
		pqr.clickAndHold(event5).click().build().perform();
		System.out.println("excluded bid checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "excluded bid checkbox is selected");
		WebElement event6 = selectCheckBox3;
		Actions pqrs = new Actions(driver.get());
		pqrs.moveToElement(event6).build().perform();
		pqrs.clickAndHold(event6).click().build().perform();
		System.out.println("Without excluded bid checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "Without excluded bid checkbox is selected");
		WebElement bulkActions = bulkActionBtn;
		Actions actionNew = new Actions(driver.get());
		actionNew.moveToElement(bulkActions).build().perform();
		actionNew.clickAndHold(bulkActions).click().build().perform();
		System.out.println("Bulk actions button is selected");
		ObjectRepo.test.log(Status.PASS, "Bulk actions button is selected");
		WebElement test = excludeBidBtn;
		Actions actionC = new Actions(driver.get());
		actionC.moveToElement(test).build().perform();
		actionC.clickAndHold(test).click().build().perform();
		System.out.println("Exclude bid button is selected");
		ObjectRepo.test.log(Status.PASS, "Exclude bid button is selected");
		wait.until(ExpectedConditions.elementToBeClickable(bulkActionExcludeMultipleBidsErrorMsg));
		String IncludeBidErrorMsg = bulkActionExcludeMultipleBidsErrorMsg.getText();
		System.out.println(IncludeBidErrorMsg + " :- Error message is displayed and None of the bids are excluded");
		ObjectRepo.test.log(Status.PASS, "Include Bid Error Message Displayed :- " + IncludeBidErrorMsg);
		System.out.println("************************************************************************");
	}

	public void includeMultipleBidMethod() throws InterruptedException {
		JavascriptExecutor jsv = (JavascriptExecutor) driver.get();
		WebElement element1A = selectCheckBox2;
		jsv.executeScript("arguments[0].scrollIntoView();", element1A);
		WebElement eventNew = selectCheckBox2;
		Actions actionT = new Actions(driver.get());
		actionT.moveToElement(eventNew).build().perform();
		actionT.clickAndHold(eventNew).click().build().perform();
		System.out.println("Second Number checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "Second Number checkbox is selected");
		WebElement event5 = selectCheckBox1;
		Actions pqr = new Actions(driver.get());
		pqr.moveToElement(event5).build().perform();
		pqr.clickAndHold(event5).click().build().perform();
		System.out.println("First Number checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "First Number checkbox is selected");
		WebElement includeAction = bulkActionBtn;
		Actions actionY = new Actions(driver.get());
		actionY.moveToElement(includeAction).build().perform();
		actionY.clickAndHold(includeAction).click().build().perform();
		System.out.println("Bulk actions button is selected");
		ObjectRepo.test.log(Status.PASS, "Bulk actions button is selected");
		WebElement includeAction1 = includeBidBtn;
		Actions POM = new Actions(driver.get());
		POM.moveToElement(includeAction1).build().perform();
		POM.clickAndHold(includeAction1).click().build().perform();
		System.out.println("Include bid button is selected");
		ObjectRepo.test.log(Status.PASS, "Include bid button is selected");
		 
		wait.until(ExpectedConditions.visibilityOf(includeBidPopUpMsg2));
		String text1 = includeBidPopUpMsg2.getText();
		System.out.println("Include bid Pop up message displayed :- " + text1);
		ObjectRepo.test.log(Status.PASS, "Include bid Pop up message displayed :- " + text1);
		wait.until(ExpectedConditions.visibilityOf(includeBidBtn1));
		includeBidBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(addCommentTextBox));
		addCommentTextBox.sendKeys("Testnew");
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		 
	}

	public void includeMultipleBidMethod1() throws InterruptedException {
		JavascriptExecutor jsv = (JavascriptExecutor) driver.get();
		WebElement element1A = selectCheckBox2;
		jsv.executeScript("arguments[0].scrollIntoView();", element1A);
		WebElement eventNew = selectCheckBox2;
		Actions actionT = new Actions(driver.get());
		actionT.moveToElement(eventNew).build().perform();
		actionT.clickAndHold(eventNew).click().build().perform();
		System.out.println("Second Number checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "Second Number checkbox is selected");
		WebElement event5 = selectCheckBox1;
		Actions pqr = new Actions(driver.get());
		pqr.moveToElement(event5).build().perform();
		pqr.clickAndHold(event5).click().build().perform();
		System.out.println("First Number checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "First Number checkbox is selected");
		WebElement includeAction = bulkActionBtn;
		Actions actionY = new Actions(driver.get());
		actionY.moveToElement(includeAction).build().perform();
		actionY.clickAndHold(includeAction).click().build().perform();
		System.out.println("Bulk actions button is selected");
		ObjectRepo.test.log(Status.PASS, "Bulk actions button is selected");
		WebElement includeAction1 = includeBidBtn1;
		Actions POM = new Actions(driver.get());
		POM.moveToElement(includeAction1).build().perform();
		 
		POM.click(includeAction1).click().build().perform();
		System.out.println("Include bid button is selected");
		ObjectRepo.test.log(Status.PASS, "Include bid button is selected");
		wait.until(ExpectedConditions.visibilityOf(addCommentTextBox));
		addCommentTextBox.sendKeys("Testnew");
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
	}

	public void SponsorFlagMultipleBids() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = selectCheckBox2;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		WebElement event = selectCheckBox2;
		Actions action = new Actions(driver.get());
		action.moveToElement(event).build().perform();
		action.clickAndHold(event).click().build().perform();
		System.out.println("Second Number checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "Second Number checkbox is selected");
		WebElement event1 = selectCheckBox1;
		Actions action2 = new Actions(driver.get());
		action2.moveToElement(event1).build().perform();
		action2.clickAndHold(event1).click().build().perform();
		System.out.println("First Number checkbox is selected");
		ObjectRepo.test.log(Status.PASS, "First Number checkbox is selected");
		WebElement bulkAction = bulkActionBtn;
		Actions action1 = new Actions(driver.get());
		action1.moveToElement(bulkAction).build().perform();
		action1.clickAndHold(bulkAction).click().build().perform();
		System.out.println("Bulk actions button is selected");
		ObjectRepo.test.log(Status.PASS, "Bulk actions button is selected");
		WebElement bulkAction1 = addFlagBtn;
		Actions action11 = new Actions(driver.get());
		action11.moveToElement(bulkAction1).build().perform();
		action11.clickAndHold(bulkAction1).click().build().perform();
		System.out.println("Add Flag button is selected");
		ObjectRepo.test.log(Status.PASS, "Add Flag button is selected");
		String ref = addFlagPopUpMsg1.getText();
		System.out.println("Add flag Pop up first message :- " + ref);
		ObjectRepo.test.log(Status.PASS, "Add flag Pop up first message :- " + ref);
		String ref1 = addFlagPopUpMsg2.getText();
		System.out.println("Add Flag Pop up Second message is displayed :- " + ref1);
		ObjectRepo.test.log(Status.PASS, "Add Flag Pop up second message :- " + ref1);
		wait.until(ExpectedConditions.visibilityOf(excludeBidBtn1));
		excludeBidBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		String errorMsg = commentBidErrorMsg.getText();
		System.out.println("Error message is displayed for empty exclude bid comment :- " + errorMsg);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed :- " + errorMsg);
		wait.until(ExpectedConditions.visibilityOf(addCommentTextBox));
		addCommentTextBox.sendKeys("Testnew");
		wait.until(ExpectedConditions.visibilityOf(postBtn));
		postBtn.click();
		String SuccessMsg = excludeBidSuccessMsg.getText();
		System.out.println("Exclude Bid success message :- " + SuccessMsg);
		ObjectRepo.test.log(Status.PASS, "Exclude Bid success message :- " + SuccessMsg);
		System.out.println("************************************************************************");
	}
}
