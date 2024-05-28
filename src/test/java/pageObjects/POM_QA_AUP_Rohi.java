package pageObjects;

import java.util.List;
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

import static resources.listeners.prop;
import static constants.ThreadConstants.driver;
import static resources.listeners.wait;

public class POM_QA_AUP_Rohi {

	@FindBy(xpath = "//*[@placeholder='Enter Entity Name or Entity ID']")
	private WebElement search_entityName;
	
	@FindBy(xpath = "//*[text()='SEARCH']")
	private WebElement search;

	@FindBy(xpath = "//*[text()='WA_Entity+A (WA6585-9938)']")
	private WebElement select_entityName;

	@FindBy(xpath = "//span[text()='Administration']")
	private WebElement administration;

	@FindBy(xpath = "//a[text()='Reserve Sale Certification']")
	private WebElement reserveSaleCertification;

	@FindBy(xpath = ("//p[text()='Certification decision saved successfully.']"))
	private WebElement getSuccesMsg;

	@FindBy(xpath = ("//*[@data-icon='times']"))
	private WebElement popUpClose;

	@FindBy(xpath = ("(//*[@data-icon='angle-down'])"))
	private WebElement logoutDdropdwon;

	@FindBy(xpath = ("//*[text()='Logout']"))
	private WebElement logout;

	@FindBy(xpath = "//span[text()='Administration']")
	private WebElement administration2;

	@FindBy(xpath = "//*[text()='Home']")
	private WebElement home;

	@FindBy(xpath = "//a[text()='Reserve Sale Certification']")
	private WebElement reserveSaleCertification2;

	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[4]")
	private WebElement sumbitbtn4;

	@FindBy(xpath = ("//p[text()='Certification decision saved successfully.']"))
	private WebElement getSuccesMsg2;

	@FindBy(xpath = ("//*[@data-icon='times']"))
	private WebElement popUpClose2;

	@FindBy(xpath = ("(//*[@data-icon='angle-down'])"))
	private WebElement logoutDdropdwon2;

	@FindBy(xpath = ("//*[text()='Logout']"))
	private WebElement logout2;

	@FindBy(xpath = "//*[text()='WA_Entity+B (WA6586-9940)']")
	private WebElement select_entityName1;

	@FindBy(xpath = "//*[text()='Company+R (CA3223-4531)']")
	private WebElement select_entityNameAR2;

	@FindBy(xpath = "//*[text()='T3NSEmetteurF (NS3624-3951)']")
	private WebElement select_entityNameAR;

	@FindBy(xpath = "//*[text()='Prescribed_Company+H - PLC=0 PLA=0 HLC=11598500 HLA=0 (CA4015-4980)']")
	private WebElement select_entityNameARafterCertify;

	@FindBy(xpath = "//*[text()='Events']")
	private WebElement click_onEvents;

	@FindBy(xpath = "//*[text()='RESET']")
	private WebElement clickResetAlgorithm;

	@FindBy(xpath = "//*[text()='Administration']")
	private WebElement click_onAdministration;

	@FindBy(xpath = "//*[text()='Event']")
	private WebElement click_onEvent;

	@FindBy(xpath = "//button[@title=\"Go to details of Event R45_DummEvent\"]/ancestor::tr//td[8]")
	private WebElement get_EventStatus;

	@FindBy(xpath = "//*[text()='Event Monitoring']")
	private WebElement click_onEventMonitoring;

	@FindBy(xpath = "//*[text()='EventNameWADuringBidding']")
	private WebElement select_Events;

	@FindBy(xpath = "(//*[text()='ReserveSaleAutomation'])[1]")
	private WebElement select_Event;

	@FindBy(xpath = "//*[text()='BIDDING CLOSES IN']")
	private WebElement bidding_periodStatus;

	@FindBy(xpath = "//*[text()='WA_Entity+A (WA6585-9938)']")
	private WebElement select_entityNamePostCerty;

	@FindBy(xpath = "//*[text()='CONTINUE']")
	private WebElement click_onContinue;

	@FindBy(xpath = "//*[text()='Reports']")
	private WebElement reports;

	@FindBy(xpath = "//*[text()='Administration']")
	private WebElement administration1;

	@FindBy(xpath = "//*[text()='Auction Certification']")
	private WebElement AuctionCertification;

	@FindBy(xpath = "//*[text()='CMS']")
	private WebElement CMS;

	@FindBy(xpath = "//*[@name='language']")
	private WebElement language;

	@FindBy(xpath = "//*[@title='Select number of rows per page.']")
	private WebElement rowsPerPage;

	@FindBy(xpath = "//*[text()='500 ']")
	private WebElement selectRowsNum;

	@FindBy(xpath = "//*[text()='PUBLISH']")
	private WebElement publish;
	
	@FindBy(xpath = "//*[text()='Header']")
	private WebElement Header;
	
	@FindBy(xpath = "//*[text()='PUBLIER']")
	private WebElement publier;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiIconButton-root']")
	private WebElement removeSuccessPopUp;

	@FindBy(xpath = "//*[text()='English']")
	private WebElement changeLang;

	@FindBy(xpath = "//*[text()='Français']")
	private WebElement selectFrance;

	@FindBy(xpath = "//*[@title='Go to details of Event EventNameWADuringBidding']")
	private WebElement goToDetails;

	@FindBy(xpath = "//*[text()='CREATE NEW EVENT']")
	private WebElement CREATE_NEW_EVENT;

	@FindBy(xpath = "//*[@name='eventType']")
	private WebElement eventType;

	@FindBy(xpath = "//*[text()='Event ID']")
	private WebElement EventID;

	@FindBy(xpath = "//*[text()='Event Creation']")
	private WebElement Event_Creation;

	@FindBy(xpath = "//*[text()='Event Details']")
	private WebElement Event_Details;

	@FindBy(xpath = "//*[text()='Edit Event']")
	private WebElement clickOnEditEvent;

	@FindBy(xpath = "//*[text()='RESET']")
	private WebElement scroll_ToSearch;

	@FindBy(xpath = "//*[text()='About WCI, Inc.']")
	private WebElement scroll_To_Bottom;

	@FindBy(xpath = "(//*[@aria-label='Entity Name'])[2]")
	private WebElement click_On_Entiy_Dropdown;

	@FindBy(xpath = "//*[@id='entity-reports']/table/tbody/tr/td[1]/div/div[2]/div[2]/span")
	private WebElement select_Entity_Name1;

	@FindBy(xpath = "(//*[@id='demo-customized-select'])[2]")
	private WebElement select_Report_Name;

	@FindBy(xpath = "(//*[@id='demo-customized-select'])[4]")
	private WebElement select_Report_Name2;

	@FindBy(xpath = "(//*[@id='demo-customized-select'])[2]")
	private WebElement Report_NameDuring_Bidding;

	@FindBy(xpath = "//td[text()='Bids Report']")
	private WebElement bids_Report;

	@FindBy(xpath = "//*[@aria-label='Download Bids Report for event EventNameWADuringBidding']")
	private WebElement bids_Report_Download;

	@FindBy(xpath = "//*[@aria-label='Download Bids Audit Report for event EventNameWADuringBidding']")
	private WebElement bids_AuditReport_DownloadAR2;

	@FindBy(xpath = "//*[@aria-label='Download Results Report for event A42_JoinAuc_Automation_CloseBW']")
	private WebElement ResultReport_Download;
	
	@FindBy(xpath = "//span[contains(text(),'Welcome,')]")
	private WebElement lougout;

	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement lougoutFSA;

	@FindBy(xpath = "//*[@aria-label='Download Bids Report for event ReserveSaleAutomation']")
	private WebElement bids_Report_DownloadAR2;

	@FindBy(xpath = "//*[@aria-label='Download Bids Audit Report for event EventNameWADuringBidding']")
	private WebElement bids_AuditReport_Download;

	@FindBy(xpath = "//*[text()='Event']")
	private WebElement event1;

	@FindBy(xpath = "(//*[text()='RUN ALGORITHM'])[1]")
	private WebElement runalgorithm_1;

	@FindBy(xpath = "(//*[text()='RUN ALGORITHM'])[2]")
	private WebElement runalgorithm_2;

	@FindBy(xpath = "(//*[text()='CONTINUE'])")
	private WebElement continue1;

	@FindBy(xpath = "//*[text()='The algorithm ran successfully.']")
	private WebElement getSuccessMassage2;

	@FindBy(xpath = "(//*[@data-icon='angle-down'])")
	private WebElement logoutDropdown1;

	@FindBy(xpath = ("//*[text()='Logout']"))
	private WebElement logout1;

	@FindBy(xpath = "(//*[text()='You have been successfully logged out.'])")
	private WebElement logoutMassage1;

	public POM_QA_AUP_Rohi() {
        PageFactory.initElements(driver.get(), this);
    }
	public void searchReportByName() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Events']")));
		reports.click();
		WebElement ReportName = driver.get().findElement(By.xpath("//*[text()='REPORT NAME']"));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();",ReportName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		WebElement eventName = driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"));
		wait.until(ExpectedConditions.visibilityOf(eventName)).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).sendKeys(prop.getProperty("EventNameWA"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("EventNameWA") + "']")).click();
		Select sel = new Select(select_Report_Name);
		sel.selectByVisibleText("Client Bids Report");
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
	}

	public void c32057_reportAccesstoAR_ForClientsBidsReportPostCertificationWS() throws InterruptedException {
		
		search_entityName.sendKeys(prop.getProperty("EventID"));
		select_entityName.click();
		click_onContinue.click();
		searchReportByName();
		driver.get().findElement(By.xpath("//*[@data-icon='download']")).click();
		ObjectRepo.test.log(Status.PASS, "AR can access the Client Bid Report post certification(WS)");
		System.out.println("AR can access the Client Bid Report post certification(WS)");
	}

	public void c32068_c32070Sponsor_AR_AccessToClientBidsAuditReportForAnAllowanceSaleEventDuringBiddingWindow() throws InterruptedException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", scroll_ToSearch);
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("EventNameWADuringBidding"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("EventNameWADuringBidding") + "']"))
				.click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		js.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		Actions action = new Actions(driver.get());
		action.moveToElement(click_On_Entiy_Dropdown).build().perform();
		click_On_Entiy_Dropdown.click();
		select_Entity_Name1.click();
		Select sel = new Select(select_Report_Name2);
		sel.selectByVisibleText("Client Bids Audit Report");
		driver.get().findElement(By.xpath("(//*[@title='Download Report'])[4]")).click();
		System.out.println(
				"Sponsor/AR can Access To Client Bids Audit Report For An Allowance SaleEvent During Bidding Window.");
		ObjectRepo.test.log(Status.PASS,
				"Sponsor/AR can Access To Client Bids Audit Report For An Allowance SaleEvent During Bidding Window.");
			Thread.sleep(25000);
	}

	public void c32055_C32045_c32017Sponsor_or_MMAccessBidsReportForAllowanceSaleEventDuringBiddingWindow()
			throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", scroll_ToSearch);
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("EventNameWADuringBidding"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("EventNameWADuringBidding") + "']"))
				.click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		js.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		bids_Report.getText();
		System.out.println(bids_Report + "Access Granted Successfully");
		bids_Report_Download.click();
		System.out.println("Sponsor/MM can Access To Bids Report For An Allowance SaleEvent During Bidding Window.");
		ObjectRepo.test.log(Status.PASS, "Bids Report Downloaded Successfully");
		Thread.sleep(10000);
	}

	public void c32052_c32016_c32056_SponsorMMAccessBidsAuditReportForAllowanceSaleEventDuringBiddingWindowWS()
			throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", scroll_ToSearch);
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("EventNameWADuringBidding"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("EventNameWADuringBidding") + "']"))
				.click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		js.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		bids_AuditReport_Download.click();
		ObjectRepo.test.log(Status.PASS, "Bids Audit Report Downloaded Successfully");
		Thread.sleep(10000);
	}

	public void c32069_c32071_ARGetAccessClientBidsAuditReportForAllowanceSaleEventDuringBiddingWindow()
			throws InterruptedException {
		search_entityName.sendKeys(prop.getProperty("EventIDWADuringBidding"));
		select_entityName1.click();
		click_onContinue.click();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Events']")));
		}
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("EventNameWADuringBidding"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("EventNameWADuringBidding") + "']"))
				.click();
		Select sel = new Select(Report_NameDuring_Bidding);
		sel.selectByVisibleText("Client Bids Audit Report");
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		driver.get().findElement(By.xpath("//*[@data-icon='download']")).click();
		ObjectRepo.test.log(Status.PASS, "AR can access the Client Bid Audit Report during bidding(WS)");
		System.out.println("AR can access the Client Bid Audit Report during bidding(WS)");
		Thread.sleep(25000);
	}

	public void C32070_SponsorAccessClientBidsAuditReportForAllowanceSaleEventDuringBiddingWindow()
			throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("EventNameWADuringBidding"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("EventNameWADuringBidding") + "']"))
				.click();
		Select sel = new Select(Report_NameDuring_Bidding);
		sel.selectByVisibleText("Client Bids Audit Report");
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		driver.get().findElement(By.xpath("//*[@data-icon='download']")).click();
		ObjectRepo.test.log(Status.PASS, "AR can access the Client Bid Audit Report during bidding(WS)");
		System.out.println("AR can access the Client Bid Audit Report during bidding(WS)");
		Thread.sleep(25000);
	}

	public void C32059_AR_can_get_access_to_Client_Bid_Report_for_an_Allowance_Sale_event_during_the_bidding_window_Post_Certification()
			throws InterruptedException {
		search_entityName.sendKeys(prop.getProperty("EventID"));
		select_entityNamePostCerty.click();
		click_onContinue.click();
		click_onEvents.click();
		select_Events.click();
		String ExpectedBidPeriodStatus = "BIDDING CLOSES IN";
		String bidPeriodStatus = bidding_periodStatus.getText();
		Assert.assertEquals(bidPeriodStatus, ExpectedBidPeriodStatus);
		System.out.println("Bidding period is Open");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Events']")));
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).sendKeys(prop.getProperty("EventNameWA"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("EventNameWA") + "']")).click();
		Select sel = new Select(select_Report_Name);
		sel.selectByVisibleText("Client Bids Report");
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		driver.get().findElement(By.xpath("//*[@data-icon='download']")).click();
		ObjectRepo.test.log(Status.PASS, "AR can access the Client Bid Report post certification(WS)");
		System.out.println("AR can access the Client Bid Report post certification(WS)");
		Thread.sleep(25000);
	}

	public void C31992_C31996_SponsoraccessClientBidsAuditReportForAllowanceSaleEventDuringBiddingWindowCA()
			throws InterruptedException {
		click_onEventMonitoring.click();
		wait.until(ExpectedConditions.visibilityOf(select_Event));
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", select_Event);
		wait.until(ExpectedConditions.visibilityOf(select_Event));
		select_Event.click();
		String ExpectedBidPeriodStatus = "BIDDING CLOSES IN";
		String bidPeriodStatus = bidding_periodStatus.getText();
		Assert.assertEquals(bidPeriodStatus, ExpectedBidPeriodStatus);
		System.out.println("Bidding period is Open");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", scroll_ToSearch);
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("EventNameCADuringBidding"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("EventNameCADuringBidding") + "']"))
				.click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		js.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		Actions action = new Actions(driver.get());
		action.moveToElement(click_On_Entiy_Dropdown).build().perform();
		click_On_Entiy_Dropdown.click();
		select_Entity_Name1.click();
		Select sel = new Select(select_Report_Name2);
		sel.selectByVisibleText("Client Bids Audit Report");
		driver.get().findElement(By.xpath("(//*[@title='Download Report'])[4]")).click();
		ObjectRepo.test.log(Status.PASS, "Sponsor can access the Client Bid Audit Report during bidding(CA)");
		System.out.println("Sponsor can access the Client Bid Audit Report during bidding(CA)");
		Thread.sleep(20000);
	}

	public void c31994_c31997_AR_GetAccessClientBidsAuditReportForAllowanceSaleEventDuringBiddingWindowCA()
			throws InterruptedException {
		search_entityName.sendKeys(prop.getProperty("AREventID_DuringBiddingCA"));
		select_entityNameAR2.click();
		click_onContinue.click();
		click_onEvents.click();
		wait.until(ExpectedConditions.visibilityOf(select_Event));
		select_Event.click();
		String ExpectedBidPeriodStatus = "BIDDING CLOSES IN";
		String bidPeriodStatus = bidding_periodStatus.getText();
		Assert.assertEquals(bidPeriodStatus, ExpectedBidPeriodStatus);
		System.out.println("Bidding period is Open");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Events']")));
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("EventNameCADuringBidding"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("EventNameCADuringBidding") + "']"))
				.click();
		Select sel = new Select(Report_NameDuring_Bidding);
		sel.selectByVisibleText("Client Bids Audit Report");
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		driver.get().findElement(By.xpath("//*[@data-icon='download']")).click();
		ObjectRepo.test.log(Status.PASS, "AR can access the Client Bid Audit Report during bidding(WS)");
		System.out.println("AR can access the Client Bid Audit Report during bidding(WS)");
		Thread.sleep(20000);
	}

	public void C31914_C31947_C31948_SponsorAccessBidReportForEventOnceBiddingWindowOpensCA()
			throws InterruptedException {
		click_onEventMonitoring.click();
		wait.until(ExpectedConditions.visibilityOf(select_Event));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", select_Event);
		wait.until(ExpectedConditions.visibilityOf(select_Event));
		select_Event.click();
		String ExpectedBidPeriodStatus = "BIDDING CLOSES IN";
		String bidPeriodStatus = bidding_periodStatus.getText();
		Assert.assertEquals(bidPeriodStatus, ExpectedBidPeriodStatus);
		System.out.println("Bidding period is Open");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", scroll_ToSearch);
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("EventNameCADuringBidding"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("EventNameCADuringBidding") + "']"))
				.click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		js.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		bids_Report.getText();
		System.out.println(bids_Report + "Access Granted Successfully");
		bids_Report_DownloadAR2.click();
		ObjectRepo.test.log(Status.PASS, "Bids Report Downloaded Successfully");
		System.out.println("Bids Report Downloaded Successfully");
		Thread.sleep(25000);
	}

	public void C31963_Sponsor_accessClientBidsReportForAllowanceSaleEventDuringBiddingWindowCA()
			throws InterruptedException {
		click_onEventMonitoring.click();
		wait.until(ExpectedConditions.visibilityOf(select_Event));
		select_Event.click();
		String ExpectedBidPeriodStatus = "BIDDING CLOSES IN";
		String bidPeriodStatus = bidding_periodStatus.getText();
		Assert.assertEquals(bidPeriodStatus, ExpectedBidPeriodStatus);
		System.out.println("Bidding period is Open");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", scroll_ToSearch);
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("ResSaleEventAfterCertify"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("ResSaleEventAfterCertify") + "']"))
				.click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		js.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		Actions action = new Actions(driver.get());
		action.moveToElement(click_On_Entiy_Dropdown).build().perform();
		click_On_Entiy_Dropdown.click();
		select_Entity_Name1.click();
		Select sel = new Select(select_Report_Name2);
		sel.selectByVisibleText("Client Bids Report");
		driver.get().findElement(By.xpath("(//*[@title='Download Report'])[9]")).click();
		ObjectRepo.test.log(Status.PASS, "Sponsor can access the Client Bids Report during bidding(CA)");
		System.out.println("Sponsor can access the Client Bids Report during bidding(CA)");
		Thread.sleep(25000);
	}

	public void C31963_AR_AccessClientBidReportForAllowanceSaleEventDuringBiddingWindow() throws InterruptedException  {
		search_entityName.sendKeys(prop.getProperty("EventIdForAfterCertify1"));
		select_entityNameARafterCertify.click();
		click_onContinue.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Reserve Sale']")));
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("EventNameCADuringBidding"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("EventNameCADuringBidding") + "']"))
				.click();
		Select sel = new Select(Report_NameDuring_Bidding);
		sel.selectByVisibleText("Client Bids Report");
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		driver.get().findElement(By.xpath("//*[@data-icon='download']")).click();
		ObjectRepo.test.log(Status.PASS, "AR can access the Client Bids Audit Report during bidding CA");
		System.out.println("AR can access the Client Bids Audit Report during bidding(CA)");
		Thread.sleep(25000);
	}

	public void C31934_SponsorAccessBidAuditReportForEventOnceBiddingWindowOpensCA() throws InterruptedException  {
		click_onEventMonitoring.click();
		select_Event.click();
		String ExpectedBidPeriodStatus = "BIDDING CLOSES IN";
		String bidPeriodStatus = bidding_periodStatus.getText();
		Assert.assertEquals(bidPeriodStatus, ExpectedBidPeriodStatus);
		System.out.println("Bidding period is Open");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", scroll_ToSearch);
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("EventNameCADuringBidding"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("EventNameCADuringBidding") + "']"))
				.click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		js.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		driver.get().findElement(By.xpath("//*[@aria-label='Download Bids Audit Report for event "
				+ prop.getProperty("EventNameCADuringBidding") + "']")).click();
		ObjectRepo.test.log(Status.PASS, "Bids Audit Report Downloaded Successfully");
		Thread.sleep(25000);
	}

	public void C31340_TheSettlementPriceCalculatedIsAsExpected() throws InterruptedException  {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("AucEventForResultRepQC"));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", scroll_ToSearch);
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("AucEventForResultRepQC") + "']")).click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		js.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		ResultReport_Download = driver.get().findElement(By.xpath("//*[@aria-label='Download Results Report for event "
				+ prop.getProperty("AucEventForResultRepQC") + "']"));
		ResultReport_Download.click();
		ObjectRepo.test.log(Status.PASS, "Result Report Downloaded Successfully");
		Thread.sleep(25000);
	}

	public void C31340_C31341_TheSettlementPriceCalculatedIsAsExpected() throws InterruptedException  {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("AucEventForResultRepQC"));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", scroll_ToSearch);
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("AucEventForResultRepQC") + "']")).click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		js.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		ResultReport_Download.click();
		ObjectRepo.test.log(Status.PASS, "Result Report Downloaded Successfully");
		Thread.sleep(25000);
	}

	public void C31599_VerifyEAORSponsorIsAbleORunableEditEventQC()  {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		administration1.click();
		wait.until(ExpectedConditions.elementToBeClickable(event1));
		event1.click();
		wait.until(ExpectedConditions.elementToBeClickable(rowsPerPage));
		rowsPerPage.click();
		wait.until(ExpectedConditions.elementToBeClickable(selectRowsNum));
		selectRowsNum.click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement selectEvent2 = driver.get().findElement(
				By.xpath("//button[@title='Go to details of Event " + prop.getProperty("Event_NameQC") + "']"));
		js.executeScript("arguments[0].scrollIntoView();", selectEvent2);
		selectEvent2.click();
		clickOnEditEvent.isDisplayed();
		System.out.println(" Sponsor is able to edit the event.");
	}

	public void C31599_VerifyEAORSponsorIsAbleORunableEditEventCA()  {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		administration1.click();
		wait.until(ExpectedConditions.elementToBeClickable(event1));
		event1.click();
		wait.until(ExpectedConditions.elementToBeClickable(rowsPerPage));
		rowsPerPage.click();
		wait.until(ExpectedConditions.elementToBeClickable(selectRowsNum));
		selectRowsNum.click();;
		for (int i = 0; i < 5; i++) {
			WebElement element = null;
			try {
				element = driver.get()
						.findElement(By.xpath("//*[text()='" + prop.getProperty("EventNameCADuringBidding") + "']"));
			} catch (org.openqa.selenium.NoSuchElementException e) {
				WebElement nextPageButton = driver.get().findElement(By.xpath("(//*[@aria-label='Next Page'])[1]"));
				nextPageButton.click();
			}
		}
		driver.get().findElement(By.xpath(
				"//*[@title='Go to details of Event " + prop.getProperty("EventNameCADuringBidding") + "']"))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(clickOnEditEvent));
		clickOnEditEvent.isDisplayed();
		System.out.println(" EA is able to edit the event.");

	}

	public void C31599_VerifyEAORSponsorIsAbleORunableEditEventWA()  {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		administration1.click();
		wait.until(ExpectedConditions.elementToBeClickable(event1));
		event1.click();
		wait.until(ExpectedConditions.elementToBeClickable(rowsPerPage));
		rowsPerPage.click();
		wait.until(ExpectedConditions.elementToBeClickable(selectRowsNum));
		selectRowsNum.click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement selectEvent2 = driver.get().findElement(By.xpath(
				"//button[@title='Go to details of Event " + prop.getProperty("EventNameWADuringBidding") + "']"));
		js.executeScript("arguments[0].scrollIntoView();", selectEvent2);
		selectEvent2.click();
		clickOnEditEvent.isDisplayed();
		System.out.println(" Sponsor is able to edit the event.");

	}

	public void C31487_ConfirmEventCreationPageAllowanceSaleDsiplaysLocalizedInformation()  {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		administration1.click();
		wait.until(ExpectedConditions.elementToBeClickable(event1));
		event1.click();
		CREATE_NEW_EVENT.click();
		String EventCreation = Event_Creation.getText();
		Assert.assertEquals(EventCreation, "Event Creation");
		ObjectRepo.test.log(Status.PASS, "Event Creation :- " + EventCreation);
		System.out.println("Succesfully navigated on " + EventCreation);
		Select sel = new Select(eventType);
		sel.selectByVisibleText("Reserve Sale");
		List<WebElement> labels = driver.get().findElements(By.xpath(
				"(//*[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1 MuiGrid-align-items-xs-center MuiGrid-justify-xs-space-between']/following-sibling::div)"));
		int labelSize = labels.size();
		String labelpresent = "";
		for (int i = 1; i <= labelSize - 1; i++) {
			labelpresent = labels.get(i).getText();
			System.out.println(labelpresent);
		}
		ObjectRepo.test.log(Status.PASS,
				"C31487_Confirm_Event_Creation_Page_Allowance_Sale_dsiplays_localized_information.");
	}

	public void C31862_QualifiedBiddersReportIsDynamicReportBiddingPeriodOpenCA()  {
		click_onEventMonitoring.click();
		select_Event.click();
		String ExpectedBidPeriodStatus = "BIDDING CLOSES IN";
		String bidPeriodStatus = bidding_periodStatus.getText();
		Assert.assertEquals(bidPeriodStatus, ExpectedBidPeriodStatus);
		System.out.println("Bidding period is Open");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", scroll_ToSearch);
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("EventNameCADuringBidding"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("EventNameCADuringBidding") + "']"))
				.click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		js.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		driver.get().findElement(By.xpath("//*[@aria-label='Download Qualified Bidders Report for event "
				+ prop.getProperty("EventNameCADuringBidding") + "']")).click();
		String Text = driver.get().findElement(By.xpath(
				"(//button[@aria-label=\"Download Qualified Bidders Report for event ReserveSaleAutomation\"]/ancestor::tr//td[@class='MuiTableCell-root MuiTableCell-body'])[4]"))
				.getText();
		System.out.println(Text);
		boolean GeneratedOnTime = driver.get()
				.findElement(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][4]")).getText().isBlank();
		try {
			Assert.assertTrue(GeneratedOnTime);
			System.out.println("The Qualified Bidders report is a Dynamic report. (prior to Bidding period is open)");
		} catch (AssertionError e) {
			Assert.assertFalse(GeneratedOnTime);
			System.out.println("The Qualified Bidders report is a Static report. (prior to Bidding period is open)");
		}

		ObjectRepo.test.log(Status.PASS, "Qualified Bidders Report Downloaded Successfully");
	}

	public void C31861_QualifiedBiddersReportIsDynamicReportBiddingPeriodOpenNS()  {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", scroll_ToSearch);
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("EventNameNSAppnPrdOpen"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("EventNameNSAppnPrdOpen") + "']")).click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		js.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		driver.get().findElement(By.xpath("//*[@aria-label='Download Qualified Bidders Report for event "
				+ prop.getProperty("EventNameNSAppnPrdOpen") + "']")).click();
		String Text = driver.get().findElement(By.xpath(
				"(//button[@aria-label=\"Download Qualified Bidders Report for event EQA_R320_NS_AutoTesting\"]/ancestor::tr//td[@class='MuiTableCell-root MuiTableCell-body'])[4]"))
				.getText();
		System.out.println(Text);
		boolean GeneratedOnTime = driver.get()
				.findElement(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][4]")).getText().isBlank();
		try {
			Assert.assertTrue(GeneratedOnTime);
			System.out.println("The Qualified Bidders report is a Dynamic report. (prior to Bidding period is open)");
		} catch (AssertionError e) {
			Assert.assertFalse(GeneratedOnTime);
			System.out.println("The Qualified Bidders report is a Static report. (prior to Bidding period is open)");
		}
		ObjectRepo.test.log(Status.PASS, "Qualified Bidders Report Downloaded Successfully");
	}

	public void C31489_ConfirmEventDetailsPageAllowanceSaleDsiplaysLocalizedInformationWA1()
			throws InterruptedException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		administration1.click();
		wait.until(ExpectedConditions.elementToBeClickable(event1));
		event1.click();
		wait.until(ExpectedConditions.elementToBeClickable(rowsPerPage));
		rowsPerPage.click();
		wait.until(ExpectedConditions.elementToBeClickable(selectRowsNum));
		selectRowsNum.click();
		goToDetails.click();
		String EventDetails = Event_Details.getText();
		Assert.assertEquals(EventDetails, "Event Details");
		ObjectRepo.test.log(Status.PASS, "Event Details :- " + EventDetails);
		System.out.println("Succesfully navigated on page of " + EventDetails);
		String Text = driver.get().findElement(By.xpath("(//*[@class='MuiTableContainer-root'])[1]")).getText();
		System.out.println(Text
				+ " C31489- Confirm Event Details Page Allowance Sale Dsiplays Localized Information in English for NS Jurisdiction");
		ObjectRepo.test.log(Status.PASS,
				"C31489- Confirm Event Details Page Allowance Sale Dsiplays Localized Information in English for NS Jurisdiction");
	}

	public void C31489_ConfirmEventDetailsPageAllowanceSaleDsiplaysLocalizedInformationCA()
			throws InterruptedException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		administration1.click();
		wait.until(ExpectedConditions.elementToBeClickable(event1));
		event1.click();
		wait.until(ExpectedConditions.elementToBeClickable(rowsPerPage));
		rowsPerPage.click();
		wait.until(ExpectedConditions.elementToBeClickable(selectRowsNum));
		selectRowsNum.click();
		for (int i = 0; i < 5; i++) {
			WebElement element1 = null;
			try {
				element1 = driver.get()
						.findElement(By.xpath("//*[text()='" + prop.getProperty("AucEventForResultRepQC") + "']"));
			} catch (org.openqa.selenium.NoSuchElementException e) {
				WebElement nextPageButton = driver.get().findElement(By.xpath("(//*[@aria-label='Next Page'])[1]"));
				nextPageButton.click();
			}
			if (element1 != null && element1.isDisplayed()) {
				driver.get()
						.findElement(By.xpath(
								"//*[@title='Go to details of Event " + prop.getProperty("AucEventForResultRepQC") + "']"))
						.click();
			} else {
				System.out.println("Element not found on page " + (i + 1));
			}
		}
		String EventDetails = Event_Details.getText();
		Assert.assertEquals(EventDetails, "Event Details");
		ObjectRepo.test.log(Status.PASS, "Event Details :- " + EventDetails);
		System.out.println("Succesfully navigated on page of " + EventDetails);
		String Text = driver.get().findElement(By.xpath("(//*[@class='MuiTableContainer-root'])[1]")).getText();
		System.out.println(Text
				+ " C31489- Confirm Event Details Page Allowance Sale Dsiplays Localized Information in English for CA Jurisdiction");
		ObjectRepo.test.log(Status.PASS,
				"C31489- Confirm Event Details Page Allowance Sale Dsiplays Localized Information in English for CA Jurisdiction");
	}

	public void C31489_ConfirmEventDetailsPageAllowanceSaleDsiplaysLocalizedInformationQC()
			throws InterruptedException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		administration1.click();
		wait.until(ExpectedConditions.elementToBeClickable(event1));
		event1.click();
		wait.until(ExpectedConditions.elementToBeClickable(rowsPerPage));
		rowsPerPage.click();
		wait.until(ExpectedConditions.elementToBeClickable(selectRowsNum));
		selectRowsNum.click();
		for (int i = 0; i < 5; i++) {
			WebElement element = null;
			try {
				element = driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("Event_NameQC") + "']"));
			} catch (org.openqa.selenium.NoSuchElementException e) {
				WebElement nextPageButton = driver.get().findElement(By.xpath("(//*[@aria-label='Next Page'])[1]"));
				nextPageButton.click();
			}
//			if (element != null && element.isDisplayed()) {
//				driver.get()
//						.findElement(By
//								.xpath("//*[@title='Go to details of Event " + prop.getProperty("Event_NameQC") + "']"))
//						.click();
//			} else {
//				System.out.println("Element not found on page " + (i + 1));
//			}
		}
		driver.get()
		.findElement(By
				.xpath("//*[@title='Go to details of Event " + prop.getProperty("Event_NameQC") + "']"))
		.click();
		String EventDetails = Event_Details.getText();
		Assert.assertEquals(EventDetails, "Event Details");
		ObjectRepo.test.log(Status.PASS, "Event Details :- " + EventDetails);
		System.out.println("Succesfully navigated on page of " + EventDetails);
		String Text = driver.get().findElement(By.xpath("(//*[@class='MuiTableContainer-root'])[1]")).getText();
		System.out.println(Text
				+ " C31489- Confirm Event Details Page Allowance Sale Dsiplays Localized Information in English for CA Jurisdiction");
		ObjectRepo.test.log(Status.PASS,
				"C31489- Confirm Event Details Page Allowance Sale Dsiplays Localized Information in English for CA Jurisdiction");
		changeLang.click();
		selectFrance.click();
		List<WebElement> labels = driver.get().findElements(By.xpath(
				"//*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 MuiGrid-grid-sm-4 MuiGrid-grid-md-4']//label"));
		int labelSize = labels.size();
		String labelpresent = "";
		for (int i = 1; i <= labelSize - 1; i++) {
			labelpresent = labels.get(i).getText();
			System.out.println(labelpresent);
		}
	}

	public void C31492_ConfirmTheCMS_PageDisplaysLocalizedInformationQC()  {
		wait.until(ExpectedConditions.visibilityOf(CMS));
		CMS.click();
		String infoInEng = driver.get().findElement(By.xpath("(//*[@class='MuiContainer-root'])[2]")).getText();
		System.out.println(infoInEng + "All information displayed in English.");
		ObjectRepo.test.log(Status.PASS, " All information displayed in English.");
		wait.until(ExpectedConditions.visibilityOf(Header));
		publish.click();
		String RequiredSuccessMsg = "Please revisit the modified pages after few minutes as it may take up to 5 minutes for the changes to be reflected.";
		String ActualSuccessMsg = driver.get().findElement(By.xpath(
				"//*[text()='Please revisit the modified pages after few minutes as it may take up to 5 minutes for the changes to be reflected.']"))
				.getText();
		System.out.println(ActualSuccessMsg);
		Assert.assertEquals(RequiredSuccessMsg, ActualSuccessMsg);
		System.out.println("Actual success msg is in english.");
		removeSuccessPopUp.click();
		changeLang.click();
		selectFrance.click();
		List<WebElement> infoInFr = driver.get()
				.findElements(By.xpath("//*[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorInherit']//span"));
		int labelSize = infoInFr.size();
		String labelpresent = "";
		for (int i = 1; i <= labelSize - 1; i++) {
			labelpresent = infoInFr.get(i).getText();
			System.out.println(labelpresent);
		}
		System.out.println(infoInEng + " All information displayed in French.");
		ObjectRepo.test.log(Status.PASS, " All information displayed in French.");
		publier.click();
		String RequiredFrenchSuccessMsg = "Veuillez consulter de nouveau ces pages dans quelques minutes, car cela peut prendre jusqu'à 5 minutes pour que les modifications soient publiées.";
		String ActualFrenchSuccessMsg = driver.get().findElement(By.xpath(
				"//*[text()=\"Veuillez consulter de nouveau ces pages dans quelques minutes, car cela peut prendre jusqu'à 5 minutes pour que les modifications soient publiées.\"]"))
				.getText();
		Assert.assertEquals(RequiredFrenchSuccessMsg, ActualFrenchSuccessMsg);
		System.out.println("Actual success msg is in French.");
		ObjectRepo.test.log(Status.PASS, " C31492_Confirm_the_CMS_Page_displays_localized_informationQC.");
	}

	public void C31492_ConfirmTheCMS_PageDisplaysLocalizedInformationCA()  {
		CMS.click();
		String infoInEng = driver.get().findElement(By.xpath("(//*[@class='MuiContainer-root'])[2]")).getText();
		System.out.println(infoInEng + " All information displayed in English.");
		ObjectRepo.test.log(Status.PASS, " All information displayed in English.");
		String text1 = driver.get().findElement(By.xpath("//*[text()='Header']")).getText();
		Assert.assertEquals(text1, "Header");
		System.out.println("Header" + " = " + text1);
		ObjectRepo.test.log(Status.PASS, "Header is present on the page.");
		String text2 = driver.get().findElement(By.xpath("//*[text()='Jurisdiction Bar']")).getText();
		Assert.assertEquals(text2, "Jurisdiction Bar");
		System.out.println("Jurisdiction Bar" + " = " + text2);
		ObjectRepo.test.log(Status.PASS, "Jurisdiction Bar is present on the page.");
		String text3 = driver.get().findElement(By.xpath("//*[text()='About the WCI, Inc. Auction Platform']"))
				.getText();
		Assert.assertEquals(text3, "About the WCI, Inc. Auction Platform");
		System.out.println("About the WCI, Inc. Auction Platform" + " = " + text3);
		ObjectRepo.test.log(Status.PASS, "About the WCI, Inc. Auction Platform is present on the page.");
	}

	public void certifyEvent()  {
		administration.click();
		reserveSaleCertification.click();
		Actions act = new Actions(driver.get());
		WebElement certification = driver.get()
				.findElement(By.xpath("(//*[text()='" + prop.getProperty("EventForCertifyCA")
						+ "']/ancestor::tr/td[8]/div/button/span[@class='MuiIconButton-label'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", certification);
		certification.click();
		WebElement sumbitbtn1 = driver.get()
				.findElement(By.xpath("(//*[text()='" + prop.getProperty("EventForCertifyCA")
						+ "']/ancestor::tr/td[9]/div/button/span[text()='SUBMIT'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(sumbitbtn1));
		sumbitbtn1.click();
		js.executeScript("arguments[0].scrollIntoView();", getSuccesMsg);
		String approvalMsg = getSuccesMsg.getText();
		System.out.println(approvalMsg);
		Assert.assertEquals(approvalMsg, "Certification decision saved successfully.");
		System.out.println("Certification decision saved successfully.");
		js.executeScript("arguments[0].scrollIntoView();", popUpClose);
		popUpClose.click();
		System.out.println("popup closed sucessfully");
		act.moveToElement(logoutDdropdwon).click().perform();
		logout.click();
		System.out.println("You have been successfully logged out from first sponsor account.");
	}

	public void certify2()  {
		administration2.click();
		reserveSaleCertification2.click();
		Actions act2 = new Actions(driver.get());
		WebElement certification2 = driver.get()
				.findElement(By.xpath("(//*[text()='" + prop.getProperty("EventForCertifyCA")
						+ "']/ancestor::tr/td[8]/div/button/span[@class='MuiIconButton-label'])[2]"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver.get();
		js2.executeScript("arguments[0].scrollIntoView();", certification2);
		certification2.click();
		WebElement sumbitbtn2 = driver.get()
				.findElement(By.xpath("(//*[text()='" + prop.getProperty("EventForCertifyCA")
						+ "']/ancestor::tr/td[9]/div/button/span[text()='SUBMIT'])[2]"));
		wait.until(ExpectedConditions.visibilityOf(sumbitbtn2));
		sumbitbtn2.click();
		sumbitbtn4.click();
		js2.executeScript("arguments[0].scrollIntoView();", getSuccesMsg2);
		String approvalMsg2 = getSuccesMsg2.getText();
		System.out.println("Second Sponsar =" + approvalMsg2);
		Assert.assertEquals(approvalMsg2, "Certification decision saved successfully.");
		System.out.println("Certification decision saved successfully.");
		js2.executeScript("arguments[0].scrollIntoView();", popUpClose2);
		popUpClose2.click();
		System.out.println("popup closed successfully");
		act2.moveToElement(logoutDdropdwon2).click().perform();
		logout2.click();
	}

	public void algorithmRun1()  {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		administration1.click();
		wait.until(ExpectedConditions.elementToBeClickable(event1));
		event1.click();
		wait.until(ExpectedConditions.elementToBeClickable(rowsPerPage));
		rowsPerPage.click();
		wait.until(ExpectedConditions.elementToBeClickable(selectRowsNum));
		selectRowsNum.click();
		for (int i = 0; i < 5; i++) {
			WebElement element = null;
			try {
				element = driver.get()
						.findElement(By.xpath("//*[text()='" + prop.getProperty("EventForRunAlgoCA") + "']"));
			} catch (org.openqa.selenium.NoSuchElementException e) {
				WebElement nextPageButton = driver.get().findElement(By.xpath("(//*[@aria-label='Next Page'])[1]"));
				nextPageButton.click();
			}
			if (element != null && element.isDisplayed()) {
				driver.get()
						.findElement(By.xpath(
								"//*[@title='Go to details of Event " + prop.getProperty("EventForRunAlgoCA") + "']"))
						.click();
			} else {
				System.out.println("Element not found on page " + (i + 1));
			}
		}
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", runalgorithm_1);
		runalgorithm_1.click();
		System.out.println("Run algorithm proposed.");
		Actions act = new Actions(driver.get());
		act.moveToElement(logoutDropdown1).click().perform();
		logout1.click();
	}

	public void algorithmRun2()  {
		administration1.click();
		event1.click();
		rowsPerPage.click();
		selectRowsNum.click();
		for (int i = 0; i < 5; i++) {
			WebElement element = null;
			try {
				element = driver.get()
						.findElement(By.xpath("//*[text()='" + prop.getProperty("EventForRunAlgoCA") + "']"));
			} catch (org.openqa.selenium.NoSuchElementException e) {
				WebElement nextPageButton = driver.get().findElement(By.xpath("(//*[@aria-label='Next Page'])[1]"));
				nextPageButton.click();
			}
			if (element != null && element.isDisplayed()) {
				driver.get()
						.findElement(By.xpath(
								"//*[@title='Go to details of Event " + prop.getProperty("EventForRunAlgoCA") + "']"))
						.click();
			} else {
				System.out.println("Element not found on page " + (i + 1));
			}
		}
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", runalgorithm_2);
		runalgorithm_2.click();
		wait.until(ExpectedConditions.visibilityOf(continue1));
		continue1.click();
		wait.until(ExpectedConditions.visibilityOf(getSuccessMassage2));
		String successMsg = getSuccessMassage2.getText();
		System.out.println(successMsg);
	}

	public void c31973_report_AccessForFinancialStatementReport()  {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("ResSaleEventAfterCertify"));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();",search);
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("ResSaleEventAfterCertify") + "']"))
				.click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		js.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		click_On_Entiy_Dropdown.click();
		select_Entity_Name1.click();
		Select sel = new Select(select_Report_Name2);
		sel.selectByVisibleText("Financial Statement");
		driver.get().findElement(By.xpath("(//*[@title='Download Report'])[9]")).click();
		ObjectRepo.test.log(Status.PASS, "Financial statement Report Download Successfully");
		ObjectRepo.test.log(Status.PASS, "Financial statement Report Download Successfully");
	}

	public void c31960_report_AccessForBidsReport()  {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("ResSaleEventAfterCertify"));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();",search);
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("ResSaleEventAfterCertify") + "']"))
				.click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		js.executeScript("arguments[0].scrollIntoView();", scroll_To_Bottom);
		click_On_Entiy_Dropdown.click();
		select_Entity_Name1.click();
		Select sel = new Select(select_Report_Name2);
		sel.selectByVisibleText("Client Bids Report");
		driver.get().findElement(By.xpath("(//*[@title='Download Report'])[9]")).click();
		ObjectRepo.test.log(Status.PASS, "Client Bids Report Download Successfully");
	}

	public void C31515_Sponsor_EA_MMCannotViewMonitoringPageAfterCertification()  {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		administration1.click();
		wait.until(ExpectedConditions.elementToBeClickable(reserveSaleCertification));
		reserveSaleCertification.click();
		wait.until(ExpectedConditions.elementToBeClickable(rowsPerPage));
		rowsPerPage.click();
		wait.until(ExpectedConditions.elementToBeClickable(selectRowsNum));
		selectRowsNum.click();
		boolean certified = driver.get()
				.findElement(By.xpath(
						"//*[text()='" + prop.getProperty("ResSaleEventAfterCertify") + "']/ancestor::tr/td[10]"))
				.getText().isBlank();
		Assert.assertFalse(certified);
		System.out.println("This Event is certified.");
		click_onEventMonitoring.click();
		List<WebElement> EventList = driver.get()
				.findElements(By.xpath("//*[@class='MuiList-root MuiList-padding']/li"));
		int eventCount = EventList.size();
		String allEventName = "";
		String expectedEvent = prop.getProperty("ResSaleEventAfterCertify");
		for (int i = 0; i <= eventCount - 1; i++) {
			allEventName = EventList.get(i).getText();
			if (allEventName.equals(expectedEvent)) {
				System.out.println(
						"Event is present in monitoring Page. So, Sponsor/EA/MM can view the monitoring page after certification.");
				Assert.assertNotEquals(allEventName, expectedEvent, expectedEvent);
			}
		}
		System.out.println(
				"Event is not present in monitoring Page. So, Sponsor/EA/MM cannot view the monitoring page after certification.");
		ObjectRepo.test.log(Status.PASS, "C31515-Sponsor/EA/MM cannot view the monitoring page after certification.");
	}

	public void ResetAlgorithm()  {
		administration1.click();
		event1.click();
		wait.until(ExpectedConditions.elementToBeClickable(rowsPerPage));
		rowsPerPage.click();
		selectRowsNum.click();
		for (int i = 0; i < 5; i++) {
			WebElement element = null;
			try {
				element = driver.get()
						.findElement(By.xpath("//*[text()='" + prop.getProperty("EventForRunAlgoCA") + "']"));
			} catch (org.openqa.selenium.NoSuchElementException e) {
				WebElement nextPageButton = driver.get().findElement(By.xpath("(//*[@aria-label='Next Page'])[1]"));
				nextPageButton.click();
			}
			if (element != null && element.isDisplayed()) {
				driver.get()
						.findElement(By.xpath(
								"//*[@title='Go to details of Event " + prop.getProperty("EventForRunAlgoCA") + "']"))
						.click();
			} else {
				System.out.println("Element not found on page " + (i + 1));
			}
		}
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", runalgorithm_1);
		clickResetAlgorithm.click();
		System.out.println("Algorithm Reset Succesfully Done.");
		ObjectRepo.test.log(Status.PASS, "C31515-Sponsor/EA/MM cannot view the monitoring page after certification.");
	}

	public void ReportGenratedAfterRunAlgorithm()  {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		reports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']"))
				.sendKeys(prop.getProperty("EventForRunAlgoCA"));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", search);
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("EventForRunAlgoCA") + "']")).click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
		for (int i = 1; i <= 3; i++) {
			String ReportName = driver.get()
					.findElement(By.xpath("(//*[@class='MuiTableBody-root']/tr/td[1])[" + i + "]")).getText();
			String GeneratedOn = driver.get()
					.findElement(By.xpath("(//*[@class='MuiTableBody-root']/tr/td[4])[" + i + "]")).getText();
			System.out.println("Sponsors can access the " + ReportName + " Generated on = " + GeneratedOn);
		}
	}
}