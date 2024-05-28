package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static resources.listeners.prop;
import static constants.ThreadConstants.driver;
import static resources.listeners.wait;

public class Reports_POM {
	private By btnBidsAuditReports_CA_Single_Auction = By.xpath(
			"//button[@aria-label='Download Bids Audit Report for event " + prop.getProperty("eventNameCA") + "']");
	private By btnPostEventOperationsReport_CA_Single_Auction = By
			.xpath("//button[@aria-label='Download Post Event Operations Report for event "
					+ prop.getProperty("eventNameCA") + "']");
	private By btnFinancialSettlementReport_CA_Single_Auction = By
			.xpath("//button[@aria-label='Download Financial Settlement Report for event "
					+ prop.getProperty("eventNameCA") + "']");
	private By btnBidsReports_CA_Single_Auction = By
			.xpath("//button[@aria-label='Download Bids Report for event " + prop.getProperty("eventNameCA") + "']");
	private By btnResultsReports_CA_Single_Auction = By
			.xpath("//button[@aria-label='Download Results Report for event " + prop.getProperty("eventNameCA") + "']");
	private By btnAllowanceDeliveryReport_CA_Single_Auction = By
			.xpath("//button[@aria-label='Download Allowance Delivery Report for event "
					+ prop.getProperty("eventNameCA") + "']");
	private By btnQualifiedBiddersReport_CA_Single_Auction = By
			.xpath("//button[@aria-label='Download Qualified Bidders Report for event "
					+ prop.getProperty("eventNameCA") + "']");

	// QuebecSingleAuction
	private By btnBidsAuditReports_QC_Single_Auction = By.xpath(
			"//button[@aria-label='Download Bids Audit Report for event " + prop.getProperty("eventNameQC") + "']");
	private By btnPostEventOperationsReport_QC_Single_Auction = By
			.xpath("//button[@aria-label='Download Post Event Operations Report for event "
					+ prop.getProperty("eventNameQC") + "']");
	private By btnFinancialSettlementReport_QC_Single_Auction = By
			.xpath("//button[@aria-label='Download Financial Settlement Report for event "
					+ prop.getProperty("eventNameQC") + "']");
	private By btnBidsReports_QC_Single_Auction = By.xpath(
			"//button[@aria-label='Download Bids Report for event " + prop.getProperty("QuebecSingleAuction") + "']");
	private By btnResultsReports_QC_Single_Auction = By
			.xpath("//button[@aria-label='Download Results Report for event " + prop.getProperty("eventNameQC") + "']");
	private By btnAllowanceDeliveryReport_QC_Single_Auction = By
			.xpath("//button[@aria-label='Download Allowance Delivery Report for event "
					+ prop.getProperty("eventNameQC") + "']");
	private By btnQualifiedBiddersReport_QC_Single_Auction = By
			.xpath("//button[@aria-label='Download Qualified Bidders Report for event "
					+ prop.getProperty("eventNameQC") + "']");

	// WashingtonSingleAuction
	private By btnBidsAuditReports_WA_Single_Auction = By.xpath(
			"//button[@aria-label='Download Bids Audit Report for event " + prop.getProperty("eventNameWS") + "']");
	private By btnPostEventOperationsReport_WA_Single_Auction = By
			.xpath("//button[@aria-label='Download Post Event Operations Report for event "
					+ prop.getProperty("eventNameWS") + "']");
	private By btnFinancialSettlementReport_WA_Single_Auction = By
			.xpath("//button[@aria-label='Download Financial Settlement Report for event "
					+ prop.getProperty("eventNameWS") + "']");
	private By btnBidsReports_WA_Single_Auction = By
			.xpath("//button[@aria-label='Download Bids Report for event " + prop.getProperty("eventNameWS") + "']");
	private By btnResultsReports_WA_Single_Auction = By
			.xpath("//button[@aria-label='Download Results Report for event " + prop.getProperty("eventNameWS") + "']");
	private By btnAllowanceDeliveryReport_WA_Single_Auction = By
			.xpath("//button[@aria-label='Download Allowance Delivery Report for event "
					+ prop.getProperty("eventNameWS") + "']");
	private By btnQualifiedBiddersReport_WA_Single_Auction = By
			.xpath("//button[@aria-label='Download Qualified Bidders Report for event "
					+ prop.getProperty("eventNameWS") + "']");

	// JointAuction
	private By btnBidsAuditReports_JA_Single_Auction = By.xpath(
			"//button[@aria-label='Download Bids Audit Report for event " + prop.getProperty("Event_Name") + "']");
	private By btnPostEventOperationsReport_JA_Single_Auction = By
			.xpath("//button[@aria-label='Download Post Event Operations Report for event "
					+ prop.getProperty("Event_Name") + "']");
	private By btnFinancialSettlementReport_JA_Single_Auction = By
			.xpath("//button[@aria-label='Download Financial Settlement Report for event "
					+ prop.getProperty("Event_Name") + "']");
	private By btnBidsReports_JA_Single_Auction = By
			.xpath("//button[@aria-label='Download Bids Report for event " + prop.getProperty("Event_Name") + "']");
	private By btnResultsReports_JA_Single_Auction = By
			.xpath("//button[@aria-label='Download Results Report for event " + prop.getProperty("Event_Name") + "']");
	private By btnAllowanceDeliveryReport_JA_Single_Auction = By
			.xpath("//button[@aria-label='Download Allowance Delivery Report for event "
					+ prop.getProperty("Event_Name") + "']");
	private By btnQualifiedBiddersReport_JA_Single_Auction = By
			.xpath("//button[@aria-label='Download Qualified Bidders Report for event " + prop.getProperty("Event_Name")
					+ "']");

	// ReserveSaleCalifornia
	private By btnBidsAuditReports_CA_RS_Single_Auction = By
			.xpath("//button[@aria-label='Download Bids Audit Report for event "
					+ prop.getProperty("ReserveSaleEventName") + "']");
	private By btnPostEventOperationsReport_CA_RS_Single_Auction = By
			.xpath("//button[@aria-label='Download Post Event Operations Report for event "
					+ prop.getProperty("ReserveSaleEventName") + "']");
	private By btnFinancialSettlementReport_CA_RS_Single_Auction = By
			.xpath("//button[@aria-label='Download Financial Settlement Report for event "
					+ prop.getProperty("ReserveSaleEventName") + "']");
	private By btnFinancialSettlementReport_CA_RS_FSA = By
			.xpath("//button[@aria-label='Download Financial Settlement Report for event "
					+ prop.getProperty("ResSaleEventAfterCertify") + "']");
	private By btnBidsReports_CA_RS_Single_Auction = By.xpath(
			"//button[@aria-label='Download Bids Report for event " + prop.getProperty("ReserveSaleEventName") + "']");
	private By btnResultsReports_CA_RS_Single_Auction = By
			.xpath("//button[@aria-label='Download Results Report for event " + prop.getProperty("ReserveSaleEventName")
					+ "']");
	private By btnAllowanceDeliveryReport_CA_RS_Single_Auction = By
			.xpath("//button[@aria-label='Download Allowance Delivery Report for event "
					+ prop.getProperty("ReserveSaleEventName") + "']");
	private By btnQualifiedBiddersReport_CA_RS_Single_Auction = By
			.xpath("//button[@aria-label='Download Qualified Bidders Report for event "
					+ prop.getProperty("ReserveSaleEventName") + "']");

	// ReserveSaleWashington
	private By btnBidsAuditReports_WA_RS_Single_Auction = By
			.xpath("//button[@aria-label='Download Bids Audit Report for event "
					+ prop.getProperty("ReserveSaleEventName_WA") + "']");
	private By btnPostEventOperationsReport_WA_RS_Single_Auction = By
			.xpath("//button[@aria-label='Download Post Event Operations Report for event "
					+ prop.getProperty("ReserveSaleEventName_WA") + "']");
	private By btnFinancialSettlementReport_WA_RS_Single_Auction = By
			.xpath("//button[@aria-label='Download Financial Settlement Report for event "
					+ prop.getProperty("ReserveSaleEventName_WA") + "']");
	private By btnBidsReports_WA_RS_Single_Auction = By.xpath("//button[@aria-label='Download Bids Report for event "
			+ prop.getProperty("ReserveSaleEventName_WA") + "']");
	private By btnResultsReports_WA_RS_Single_Auction = By
			.xpath("//button[@aria-label='Download Results Report for event "
					+ prop.getProperty("ReserveSaleEventName_WA") + "']");
	private By btnAllowanceDeliveryReport_WA_RS_Single_Auction = By
			.xpath("//button[@aria-label='Download Allowance Delivery Report for event "
					+ prop.getProperty("ReserveSaleEventName_WA") + "']");
	private By btnQualifiedBiddersReport_WA_RS_Single_Auction = By
			.xpath("//button[@aria-label='Download Qualified Bidders Report for event "
					+ prop.getProperty("ReserveSaleEventName_WA") + "']");

	@FindBy(xpath = "//*[@title='Reports']")
	private WebElement btnReports;
	
	@FindBy(xpath = "//*[text()='Reports']")
	private WebElement searchreport;

	@FindBy(xpath = "//*[text()='Search Reports']")
	private WebElement searchreport2;

	@FindBy(xpath = "//*[@aria-label='Event Name']")
	private WebElement eventNameoptions;

	@FindBy(xpath = "//*[text()='SEARCH']")
	private WebElement btnSearch;

	public Reports_POM() {
        PageFactory.initElements(driver.get(), this);
    }

	public void searchReportsByEventNameForCASingleAuction() throws InterruptedException {
		try {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Monitoring'])")));
	} catch (Exception e) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Event Monitoring'])")));
	}
		btnReports.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		Thread.sleep(5000);
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='Event Name']")).sendKeys(prop.getProperty("eventNameCA"));
		WebElement element11 = driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("eventNameCA") + "']"));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", element11);
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("eventNameCA") + "']"))
		.click();
		driver.get().findElement(By.xpath("//*[text()='SEARCH']")).click();
	}

	public void downloadbidsAuditReportForCASingleAuction() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(btnBidsAuditReports_CA_Single_Auction);
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    driver.get().findElement(btnBidsAuditReports_CA_Single_Auction).click();
	}

	public void downloadPostEventOperationsReportForCASingleAuction() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(btnPostEventOperationsReport_CA_Single_Auction);
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    driver.get().findElement(btnPostEventOperationsReport_CA_Single_Auction).click();
	}

	public void downloadFinancialSettlementReportForCASingleAuction() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(btnFinancialSettlementReport_CA_Single_Auction);
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    driver.get().findElement(btnFinancialSettlementReport_CA_Single_Auction).click();
	}

	public void downloadBidsReportForCASingleAuction() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(btnBidsReports_CA_Single_Auction);
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    driver.get().findElement(btnBidsReports_CA_Single_Auction).click();
	}

	public void downloadResultsReportForCASingleAuction() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(btnResultsReports_CA_Single_Auction);
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    driver.get().findElement(btnResultsReports_CA_Single_Auction).click();
	}

	public void downloadAllowanceDeliveryReportForCASingleAuction() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(btnAllowanceDeliveryReport_CA_Single_Auction);
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    driver.get().findElement(btnAllowanceDeliveryReport_CA_Single_Auction).click();
	}

	public void downloadQualifiedBidderReportForCASingleAuction() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
	    WebElement element = driver.get().findElement(btnQualifiedBiddersReport_CA_Single_Auction);
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    driver.get().findElement(btnQualifiedBiddersReport_CA_Single_Auction).click();
	}

	public void searchReportsByEventNameForQCSingleAuction() throws InterruptedException {
		try {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Monitoring'])")));
	} catch (Exception e) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Event Monitoring'])")));
	}
	    searchreport.click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
	    searchreport2.click();
	    Thread.sleep(5000);
	    eventNameoptions.click();
	    eventNameoptions.sendKeys(prop.getProperty("eventNameQC"));
		WebElement element11 = driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("eventNameQC") + "']"));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", element11);
	    driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("eventNameQC") + "']")).click();
	    btnSearch.click();
	}

	public void downloadbidsAuditReportForQCSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnBidsAuditReports_QC_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnBidsAuditReports_QC_Single_Auction).click();
	}

	public void downloadPostEventOperationsReportForQCSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnPostEventOperationsReport_QC_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnPostEventOperationsReport_QC_Single_Auction).click();
	}

	public void downloadFinancialSettlementReportForQCSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnFinancialSettlementReport_QC_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnFinancialSettlementReport_QC_Single_Auction).click();
	}

	public void downloadBidsReportForQCSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnBidsReports_QC_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnBidsReports_QC_Single_Auction).click();
	}

	public void downloadResultsReportForQCSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnResultsReports_QC_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnResultsReports_QC_Single_Auction).click();
	}

	public void downloadAllowanceDeliveryReportForQCSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnAllowanceDeliveryReport_QC_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnAllowanceDeliveryReport_QC_Single_Auction).click();
	}

	public void downloadQualifiedBidderReportForQCSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnQualifiedBiddersReport_QC_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnQualifiedBiddersReport_QC_Single_Auction).click();
	}

	public void searchReportsByEventNameForWASingleAuction() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(By.xpath("//*[text()='REPORT NAME']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		driver.get().findElement(By.xpath("//*[text()='Search Reports']")).click();
		Thread.sleep(5000);
	    eventNameoptions.click();
	    eventNameoptions.sendKeys(prop.getProperty("eventNameWS"));
	    Actions action = new Actions(driver.get());
	    WebElement element1 = driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("eventNameWS") + "']"));
	    action.moveToElement(element1).build().perform();
	    driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("eventNameWS") + "']")).click();
	    WebElement element2 = btnSearch;
	    action.moveToElement(element2).build().perform();
	    btnSearch.click();
	}

	public void downloadbidsAuditReportForWASingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnBidsAuditReports_WA_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnBidsAuditReports_WA_Single_Auction).click();
	}

	public void downloadPostEventOperationsReportForWASingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnPostEventOperationsReport_WA_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnPostEventOperationsReport_WA_Single_Auction).click();
	}

	public void downloadFinancialSettlementReportForWASingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnFinancialSettlementReport_WA_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnFinancialSettlementReport_WA_Single_Auction).click();
	}

	public void downloadBidsReportForWASingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnBidsReports_WA_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnBidsReports_WA_Single_Auction).click();
	}

	public void downloadResultsReportForWASingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnResultsReports_WA_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnResultsReports_WA_Single_Auction).click();
	}

	public void downloadAllowanceDeliveryReportForWASingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnAllowanceDeliveryReport_WA_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnAllowanceDeliveryReport_WA_Single_Auction).click();
	}

	public void downloadQualifiedBidderReportForWASingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnQualifiedBiddersReport_WA_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnQualifiedBiddersReport_WA_Single_Auction).click();
	}

	public void searchReportsByEventNameForJointAuction() throws InterruptedException {
		searchreport.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Search Reports']")));
		searchreport2.click();
		eventNameoptions.click();
		eventNameoptions.sendKeys(prop.getProperty("Event_Name"));
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("Event_Name") + "']")).click();
		btnSearch.click();
	}

	public void downloadbidsAuditReportForJASingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnBidsAuditReports_JA_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnBidsAuditReports_JA_Single_Auction).click();
	}

	public void downloadPostEventOperationsReportForJASingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnPostEventOperationsReport_JA_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnPostEventOperationsReport_JA_Single_Auction).click();
	}

	public void downloadFinancialSettlementReportForJASingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnFinancialSettlementReport_JA_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnFinancialSettlementReport_JA_Single_Auction).click();
	}

	public void downloadBidsReportForJASingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnBidsReports_JA_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnBidsReports_JA_Single_Auction).click();
	}

	public void downloadResultsReportForJASingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnResultsReports_JA_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnResultsReports_JA_Single_Auction).click();
	}

	public void downloadAllowanceDeliveryReportForJASingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnAllowanceDeliveryReport_JA_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnAllowanceDeliveryReport_JA_Single_Auction).click();
	}

	public void downloadQualifiedBidderReportForJASingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnQualifiedBiddersReport_JA_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnQualifiedBiddersReport_JA_Single_Auction).click();
	}

	public void searchReportsByEventNameForReserveSaleCalifornia() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		searchreport2.click();
		eventNameoptions.click();
		eventNameoptions.sendKeys(prop.getProperty("ReserveSaleEventName"));
		Actions action = new Actions(driver.get());
		WebElement element = driver.get()
				.findElement(By.xpath("//*[text()='" + prop.getProperty("ReserveSaleEventName") + "']"));
		action.moveToElement(element).build().perform();
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("ReserveSaleEventName") + "']")).click();
		WebElement element2 = btnSearch;
		action.moveToElement(element2).build().perform();
		btnSearch.click();
//		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("ReserveSaleEventName") + "']")).click();
//		btnSearch.click();
	}

	public void downloadbidsAuditReportForCA_RSSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnBidsAuditReports_CA_RS_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnBidsAuditReports_CA_RS_Single_Auction).click();
	}

	public void downloadPostEventOperationsReportForCA_RSSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnPostEventOperationsReport_CA_RS_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnPostEventOperationsReport_CA_RS_Single_Auction).click();
	}

	public void downloadFinancialSettlementReportForCA_RSSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnFinancialSettlementReport_CA_RS_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnFinancialSettlementReport_CA_RS_Single_Auction).click();
	}

	public void downloadFinancialSettlementReportForCA_RSFSA() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnFinancialSettlementReport_CA_RS_FSA);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnFinancialSettlementReport_CA_RS_FSA).click();
	}
	
	public void downloadBidsReportForCA_RSSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnBidsReports_CA_RS_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnBidsReports_CA_RS_Single_Auction).click();
	}

	public void downloadResultsReportForCA_RSSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnResultsReports_CA_RS_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnResultsReports_CA_RS_Single_Auction).click();
	}

	public void downloadAllowanceDeliveryReportForCA_RSSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnAllowanceDeliveryReport_CA_RS_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnAllowanceDeliveryReport_CA_RS_Single_Auction).click();
	}

	public void downloadQualifiedBidderReportForCA_RSSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnQualifiedBiddersReport_CA_RS_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnQualifiedBiddersReport_CA_RS_Single_Auction).click();
	}

	public void searchReportsByEventNameForReserveSaleWashington() throws InterruptedException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Monitoring'])")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Event Monitoring'])")));
		}
		searchreport.click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(By.xpath("//*[text()='REPORT NAME']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Search Reports']")));
		searchreport2.click();
		Thread.sleep(5000);
		eventNameoptions.click();
		eventNameoptions.sendKeys(prop.getProperty("ReserveSaleEventName_WA"));
		Actions action = new Actions(driver.get());
		WebElement element1 = driver.get()
				.findElement(By.xpath("//*[text()='" + prop.getProperty("ReserveSaleEventName_WA") + "']"));
		action.moveToElement(element1).build().perform();
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("ReserveSaleEventName_WA") + "']")).click();
		WebElement element2 = btnSearch;
		action.moveToElement(element2).build().perform();
		btnSearch.click();
	}
	public void searchReportsByEventNameForReserveSaleWashingtonFSA() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(searchreport));
		searchreport.click();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(By.xpath("//*[text()='REPORT NAME']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='REPORT NAME']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Search Reports']")));
		searchreport2.click();
		eventNameoptions.click();
		eventNameoptions.sendKeys(prop.getProperty("ReserveSaleEventName_WA"));
		Actions action = new Actions(driver.get());
		WebElement element1 = driver.get()
				.findElement(By.xpath("//*[text()='" + prop.getProperty("ReserveSaleEventName_WA") + "']"));
		action.moveToElement(element1).build().perform();
		driver.get().findElement(By.xpath("//*[text()='" + prop.getProperty("ReserveSaleEventName_WA") + "']")).click();
		WebElement element2 = btnSearch;
		action.moveToElement(element2).build().perform();
		btnSearch.click();
	}

	public void downloadbidsAuditReportForWA_RSSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnBidsAuditReports_WA_RS_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnBidsAuditReports_WA_RS_Single_Auction).click();
	}

	public void downloadPostEventOperationsReportForWA_RSSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnPostEventOperationsReport_WA_RS_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnPostEventOperationsReport_WA_RS_Single_Auction).click();
	}

	public void downloadFinancialSettlementReportForWA_RSSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnFinancialSettlementReport_WA_RS_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnFinancialSettlementReport_WA_RS_Single_Auction).click();
	}

	public void downloadBidsReportForWA_RSSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnBidsReports_WA_RS_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnBidsReports_WA_RS_Single_Auction).click();
	}

	public void downloadResultsReportForWA_RSSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnResultsReports_WA_RS_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnResultsReports_WA_RS_Single_Auction).click();
	}

	public void downloadAllowanceDeliveryReportForWA_RSSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnAllowanceDeliveryReport_WA_RS_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnAllowanceDeliveryReport_WA_RS_Single_Auction).click();
	}

	public void downloadQualifiedBidderReportForWA_RSSingleAuction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element = driver.get().findElement(btnQualifiedBiddersReport_WA_RS_Single_Auction);
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.get().findElement(btnQualifiedBiddersReport_WA_RS_Single_Auction).click();
		Thread.sleep(20000);
	}

}
