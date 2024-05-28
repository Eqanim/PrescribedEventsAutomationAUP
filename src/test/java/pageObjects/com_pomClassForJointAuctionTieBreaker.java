package pageObjects;

import static constants.EventNameConstants.eventNameEng;
import static constants.EventNameConstants.eventNameQC;
import static constants.EventNameConstants.eventName_PE1;
import static constants.EventNameConstants.eventName_PE2;
import static constants.EventNameConstants.eventName_PE3;
import static constants.EventNameConstants.eventName_PE4;
import static constants.EventNameConstants.eventName_PE5;
import static constants.EventNameConstants.eventName_PE6;
import static constants.EventNameConstants.eventName_PE7;
import static constants.EventNameConstants.eventName_PE8;
import static constants.EventNameConstants.eventName_PE9;
import static constants.EventNameConstants.eventName_PE10;
import static constants.EventNameConstants.eventName_PE11;
import static constants.EventNameConstants.eventName_PE12;
import static constants.EventNameConstants.eventName_PEWa;
import static constants.EventNameConstants.eventName_PEWa2;
import static constants.EventNameConstants.eventName_REWA1;
import static constants.EventNameConstants.eventName_REWA2;
import static constants.EventNameConstants.eventName_PECa;
import static constants.EventNameConstants.eventName_PEQc;
import static constants.EventNameConstants.eventName_PEQc1;
import static constants.EventNameConstants.eventName_PEQc2;
import static constants.EventNameConstants.eventName_PEQc3;
import static constants.EventNameConstants.eventName_PEQc4;
import static constants.EventNameConstants.eventName_PEQc5;
import static constants.EventNameConstants.eventName_PEQc6;


import static constants.ThreadConstants.driver;
import static resources.listeners.folderPath;
import static resources.listeners.prop;
import static resources.listeners.prop1;
import static resources.listeners.prop2;
import static resources.listeners.wait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import resources.DownloadQualifiedBidderReport;
import resources.ObjectRepo;
import resources.commonLib;

public class com_pomClassForJointAuctionTieBreaker {

//	private static final String Event_Name_PE1 = null;
//	private static final String eventName_PEWa = null;
	public static String path;
	public String date1;
	public static Actions action;
	String randomString;
	XSSFWorkbook wb;
	
	@FindBy(xpath = "//*[@name='allowancesPerBidLot']")
	private WebElement EmissionUnitsPerLot;
	
	@FindBy(xpath = "//*[text()='UPLOAD']")
	private WebElement UploadEmissionUnits;
	
	@FindBy(xpath = "(//*[text()='UPLOAD'])[2]")
	private WebElement UploadEmissionUnitsPopup;
	
	@FindBy(xpath = "//*[text()='34 records were uploaded successfully.']")
	private WebElement FileUploadSuccessMessageR69;
	
	@FindBy(xpath = "//*[text()='5 records were uploaded successfully.']")
	private WebElement FileUploadSuccessMessageR70;
	
	@FindBy(xpath = "//*[text()='5 records were uploaded successfully.']")
	private WebElement FileUploadSuccessMessageR71;
	
	@FindBy(xpath = "//*[text()='5 records were uploaded successfully.']")
	private WebElement FileUploadSuccessMessageR72;
	
	@FindBy(xpath = "//*[text()='5 records were uploaded successfully.']")
	private WebElement FileUploadSuccessMessageR73;
	
	@FindBy(xpath = "//*[text()='5 records were uploaded successfully.']")
	private WebElement FileUploadSuccessMessageR74;
	
	@FindBy(xpath = "//*[text()='5 records were uploaded successfully.']")
	private WebElement FileUploadSuccessMessageR76;
		
	@FindBy(xpath = "//*[text()='FX Rate submitted.']")
	private WebElement QCFxRateText;
	
	@FindBy(xpath = "(//*[@data-icon=\"angle-down\"])[4]")
	private WebElement EntityDropdown2;
	
	@FindBy(xpath = "(//*[@data-icon=\"angle-down\"])[3]")
	private WebElement EntityDropdown;
	
	@FindBy(xpath = "(//*[@role='menuitem'])[1]")
	private WebElement EntityName;
	
	@FindBy(xpath = "//*[text() = 'Entreprise QC01684 (QC01684-02852)']")
	private WebElement Entity2;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+B - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4091-5112)']")
	private WebElement Entity2SBMA2;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+B - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4091-5112)']")
	private WebElement Entity2SBMA3;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+B - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4091-5112)']")
	private WebElement Entity2SBMA4;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+B - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4091-5112)']")
	private WebElement Entity2SBMA5;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+B - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4091-5112)']")
	private WebElement Entity2SBMA6;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+B - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4091-5112)']")
	private WebElement Entity2SBMA7;
	
	@FindBy(xpath = "//*[text() = 'WA_Entity+B (WA6586-9940)']")
	private WebElement Entity2REWA1;
	
	@FindBy(xpath = "//*[text() = 'WA_Entity+C (WA6587-9942)']")
	private WebElement Entity3REWA1;
	
	@FindBy(xpath = "//*[text() = 'WA_Entity+D (WA6588-9944)']")
	private WebElement Entity4REWA1;
	
	@FindBy(xpath = "//*[text() = 'WA_Entity+E (WA6589-9946)']")
	private WebElement Entity5REWA1;
	
	@FindBy(xpath = "//*[text() = 'WA_Entity+B (WA6586-9940)']")
	private WebElement Entity2REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Entity+C (WA6587-9942)']")
	private WebElement Entity3REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Entity+D (WA6588-9944)']")
	private WebElement Entity4REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Entity+E (WA6589-9946)']")
	private WebElement Entity5REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Entity+F (WA6590-9948)']")
	private WebElement Entity6REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Entity+G (WA6591-9950)']")
	private WebElement Entity7REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Entity+H+I+J (WA6592-9952)']")
	private WebElement Entity8REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Entity+H+I+J (WA6593-9954)']")
	private WebElement Entity9REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Entity+H+I+J (WA6594-9956)']")
	private WebElement Entity10REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Utility+A (WA6611-9990)']")
	private WebElement Entity11REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Utility+B (WA6612-9993)']")
	private WebElement Entity12REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Utility+C (WA6613-9996)']")
	private WebElement Entity13REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Utility+D (WA6614-9999)']")
	private WebElement Entity14REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Utility+E (WA6615-10002)']")
	private WebElement Entity15REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Utility+F (WA6616-10005)']")
	private WebElement Entity16REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Utility+G (WA6617-10008)']")
	private WebElement Entity17REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Utility+H (WA6618-10011)']")
	private WebElement Entity18REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Utility+i (WA6619-10014)']")
	private WebElement Entity19REWA2;
	
	@FindBy(xpath = "//*[text() = 'WA_Utility+J (WA6620-10017)']")
	private WebElement Entity20REWA2;
	
	
	@FindBy(xpath = "//*[text() = 'Entreprise QC21659 (QC21659-42726)']")
	private WebElement Entity3;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+C - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4096-5122)']")
	private WebElement Entity3SBMA2;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+C - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4096-5122)']")
	private WebElement Entity3SBMA3;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+C - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4096-5122)']")
	private WebElement Entity3SBMA4;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+C - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4096-5122)']")
	private WebElement Entity3SBMA5;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+C - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4096-5122)']")
	private WebElement Entity3SBMA6;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+C - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4096-5122)']")
	private WebElement Entity3SBMA7;
	
	@FindBy(xpath = "//*[text() = 'Entreprise QC41652 (QC41652-42656)']")
	private WebElement Entity4;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+D - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4097-5124)']")
	private WebElement Entity4SBMA2;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+D - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4097-5124)']")
	private WebElement Entity4SBMA3;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+D - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4097-5124)']")
	private WebElement Entity4SBMA4;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+D - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4097-5124)']")
	private WebElement Entity4SBMA5;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+D - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4097-5124)']")
	private WebElement Entity4SBMA6;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+D - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4097-5124)']")
	private WebElement Entity4SBMA7;
	
	@FindBy(xpath = "//*[text() = 'Entreprise QC91608 (QC91608-52231)']")
	private WebElement Entity5;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+E - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4098-5126)']")
	private WebElement Entity5SBMA2;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+E - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4098-5126)']")
	private WebElement Entity5SBMA3;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+E - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4098-5126)']")
	private WebElement Entity5SBMA4;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+E - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4098-5126)']")
	private WebElement Entity5SBMA5;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+E - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4098-5126)']")
	private WebElement Entity5SBMA6;
	
	@FindBy(xpath = "//*[text() = 'Prescribed_Emitter+E - PLC=0 PLA=0 HLC=15717500 HLA=0 (QC4098-5126)']")
	private WebElement Entity5SBMA7;
	
	@FindBy(xpath = "//*[text() = 'T1CA+QCEmetteurL+M+N (QC3738-4145)']")
	private WebElement Entity7;
	
	@FindBy(xpath = "//*[text() = 'T1CA+QCEmetteurL+M+N (QC3739-4147)']")
	private WebElement Entity8;
	
	@FindBy(xpath = "//*[text() = 'T1QCEmetteurO (QC3740-4149)']")
	private WebElement Entity9;
	
	@FindBy(xpath = "//*[text() = 'T1QCEmetteurP (QC3741-4151)']")
	private WebElement Entity10;
	
	@FindBy(xpath = "//*[text() = 'T3CAEmetteurB (CA3340-4662)']")
	private WebElement Entity2_Ca_PE11;
	
	@FindBy(xpath = "//*[text() = 'T3CAEmetteurB (CA3340-4662)']")
	private WebElement Entity2_Ca_PE12;
	
	@FindBy(xpath = "//*[text() = 'T3CAEmetteurC (CA3341-4664)']")
	private WebElement Entity3_Ca_PE11;
	
	@FindBy(xpath = "//*[text() = 'T3CAEmetteurC (CA3341-4664)")
	private WebElement Entity3_Ca_PE12;
	
	@FindBy(xpath = "//*[text() = 'T3QCEmetteurB (QC3797-4243)']")
	private WebElement Entity2_Qc_PE11;
	
	@FindBy(xpath = "//*[text() = 'T3QCEmetteurB (QC3797-4243)']")
	private WebElement Entity2_Qc_PE12;
	
	@FindBy(xpath = "//*[text()='The event has been successfully certified. It may take a few minutes for the reports to be generated.']")
	private WebElement SecCertificationQcSuccessMsg;
	
	@FindBy(xpath = "//*[text() = 'CONTINUE']")
	private WebElement ContinueButton;
	
	
	
	@FindBy(xpath = "//input[@name='rollDownProcedure']")
	private WebElement rollDownbids;
 
	@FindBy(xpath = "//input[@name='setMaximumBidPrice']")
	private WebElement includebids;
	
	private By btnQualifiedBidderReports_PE1 = By
			.xpath("//*[@aria-label='Download Qualified Bidders Report for event " + eventName_PE1 + "']");
	private By btnResultReports_PE1 = By
			.xpath("//button[@aria-label='Download Results Report for event " + eventName_PE1 + "']");
	private By btnQualifiedBidderReports_PE2 = By
			.xpath("//*[@aria-label='Download Qualified Bidders Report for event " + eventName_PE2 + "']");
	private By btnQualifiedBidderReports_PE3 = By
			.xpath("//*[@aria-label='Download Qualified Bidders Report for event " + eventName_PE3 + "']");
	private By btnQualifiedBidderReports_PE4 = By
			.xpath("//*[@aria-label='Download Qualified Bidders Report for event " + eventName_PE4 + "']");
	private By btnQualifiedBidderReports_PE5 = By
			.xpath("//*[@aria-label='Download Qualified Bidders Report for event " + eventName_PE5 + "']");
	private By btnQualifiedBidderReports_PE6 = By
			.xpath("//*[@aria-label='Download Qualified Bidders Report for event " + eventName_PE6 + "']");
	private By btnQualifiedBidderReports_PE7 = By
			.xpath("//*[@aria-label='Download Qualified Bidders Report for event " + eventName_PE7 + "']");
	private By btnQualifiedBidderReports_PE8 = By
			.xpath("//*[@aria-label='Download Qualified Bidders Report for event " + eventName_PE8 + "']");
	private By btnQualifiedBidderReports_PE9 = By
			.xpath("//*[@aria-label='Download Qualified Bidders Report for event " + eventName_PE9 + "']");
	private By btnQualifiedBidderReports_PE10 = By
			.xpath("//*[@aria-label='Download Qualified Bidders Report for event " + eventName_PE10 + "']");
	private By btnResultReports_PE2 = By
			.xpath("//button[@aria-label='Download Results Report for event " + eventName_PE2 + "']");
	private By btnResultReports_PE3 = By
			.xpath("//button[@aria-label='Download Results Report for event " + eventName_PE3 + "']");
	private By btnResultReports_PE4 = By
			.xpath("//button[@aria-label='Download Results Report for event " + eventName_PE4 + "']");
	private By btnResultReports_PE5 = By
			.xpath("//button[@aria-label='Download Results Report for event " + eventName_PE5 + "']");
	private By btnResultReports_PE6 = By
			.xpath("//button[@aria-label='Download Results Report for event " + eventName_PE6 + "']");
	private By btnResultReports_PE7 = By
			.xpath("//button[@aria-label='Download Results Report for event " + eventName_PE7 + "']");
	private By btnResultReports_PE8 = By
			.xpath("//button[@aria-label='Download Results Report for event " + eventName_PE8 + "']");
	private By btnResultReports_PE9 = By
			.xpath("//button[@aria-label='Download Results Report for event " + eventName_PE9 + "']");
	private By btnResultReports_PE10 = By
			.xpath("//button[@aria-label='Download Results Report for event " + eventName_PE10 + "']");
	private By eventDetailsBtn_PE1 = By.xpath("(//*[@title='Go to details of Event " + eventName_PE1 + "'])[1]");
	private By eventDetailsBtn_PEWa = By.xpath("(//*[@title='Go to details of Event " + eventName_PEWa + "'])[1]");
	private By eventDetailsBtn_PEWa2 = By.xpath("(//*[@title='Go to details of Event " + eventName_PEWa2 + "'])[1]");
	private By eventDetailsBtn_REWA1 = By.xpath("(//*[@title='Go to details of Event " + eventName_REWA1 + "'])[1]");
	private By eventDetailsBtn_REWA2 = By.xpath("(//*[@title='Go to details of Event " + eventName_REWA2 + "'])[1]");
	private By eventDetailsBtn_PECa = By.xpath("(//*[@title='Go to details of Event " + eventName_PECa + "'])[1]");
	//private By eventDetailsBtn_PECaDropdown = By.xpath("(//*[text()='"+eventName_PECa+"'])[1]");
	private By eventDetailsBtn_PEQc = By.xpath("(//*[@title='Go to details of Event " + eventName_PEQc + "'])[1]");
	private By eventDetailsBtn_PEQc1 = By.xpath("(//*[@title='Go to details of Event " + eventName_PEQc1 + "'])[1]");
	private By eventDetailsBtn_PEQc2= By.xpath("(//*[@title='Go to details of Event " + eventName_PEQc2 + "'])[1]");
	private By eventDetailsBtn_PEQc3 = By.xpath("(//*[@title='Go to details of Event " + eventName_PEQc3 + "'])[1]");
	private By eventDetailsBtn_PEQc4 = By.xpath("(//*[@title='Go to details of Event " + eventName_PEQc4 + "'])[1]");
	private By eventDetailsBtn_PEQc5 = By.xpath("(//*[@title='Go to details of Event " + eventName_PEQc5 + "'])[1]");
	private By eventDetailsBtn_PEQc6 = By.xpath("(//*[@title='Go to details of Event " + eventName_PEQc6 + "'])[1]");
	private By eventDetailsBtn_PE2 = By.xpath("(//*[@title='Go to details of Event " + eventName_PE2 + "'])[1]");
	private By eventDetailsBtn_PE3 = By.xpath("(//*[@title='Go to details of Event " + eventName_PE3 + "'])[1]");
	private By eventDetailsBtn_PE4 = By.xpath("(//*[@title='Go to details of Event " + eventName_PE4 + "'])[1]");
	private By eventDetailsBtn_PE5 = By.xpath("(//*[@title='Go to details of Event " + eventName_PE5 + "'])[1]");
	private By eventDetailsBtn_PE6 = By.xpath("(//*[@title='Go to details of Event " + eventName_PE6 + "'])[1]");
	private By eventDetailsBtn_PE7 = By.xpath("(//*[@title='Go to details of Event " + eventName_PE7 + "'])[1]");
	private By eventDetailsBtn_PE8 = By.xpath("(//*[@title='Go to details of Event " + eventName_PE8 + "'])[1]");
	private By eventDetailsBtn_PE9 = By.xpath("(//*[@title='Go to details of Event " + eventName_PE9 + "'])[1]");
	private By eventDetailsBtn_PE10 = By.xpath("(//*[@title='Go to details of Event " + eventName_PE10 + "'])[1]");
	private By eventDetailsBtn_PE11 = By.xpath("(//*[@title='Go to details of Event " + eventName_PE11 + "'])[1]");
	private By eventDetailsBtn_PE12 = By.xpath("(//*[@title='Go to details of Event " + eventName_PE12 + "'])[1]");
	private By eventDetailsBtnReport = By.xpath("(//*[@title='Go to details of Event " + eventNameEng + "'])[1]");
	private By eventDetailsBtnReportQC = By.xpath("(//*[@title='Go to details of Event " + eventNameQC + "'])[1]");
	private By btnEntity5 = By.xpath("//span[text()='" + prop.getProperty("QCFirstEntity") + "']");
	private By Selectentity1_PE1 = By.xpath("//span[text()='" + prop1.getProperty("CAFirstEntity_PE1") + "']");
	private By Selectentity2_PE1 = By.xpath("//span[text()='" + prop1.getProperty("CASecondEntity_PE1") + "']");
	private By eventDetailsBtnWA = By
			.xpath("(//*[@title='Go to details of Event " + prop.getProperty("eventNameWS") + "'])[1]");
	private By eventDetailsBtnCASingleAUction = By
			.xpath("(//*[@title='Go to details of Event " + prop.getProperty("eventNameCA") + "'])[1]");
	private By eventDetailsBtnCA2 = By
			.xpath("(//*[@title='Go to details of Event " + prop.getProperty("ReserveSaleEventName") + "'])[1]");
	private By eventDetailsBtnRSQCR70 = By
			.xpath("(//*[@title='Go to details of Event " + prop2.getProperty("Event_Name_RE1") + "'])[1]");
	private By eventDetailsBtnRS_WA = By
			.xpath("(//*[@title='Go to details of Event " + prop.getProperty("ReserveSaleEventName_WA") + "'])[1]");
	private By eventnameonbidpage = By.xpath("(//*[text()='" + eventNameEng + "'])[1]");
	private By eventnameonbidpageCalJointAuction = By
			.xpath("(//*[text()='" + prop.getProperty("Event_Name") + "'])[1]");
	private By biddingWindowOpenTimer = By.xpath("//*[text()='BIDDING CLOSES IN']");
	private By eventnameonbidpage_PE1 = By.xpath("(//*[text()='" + eventName_PE1 + "'])[1]");
	private By eventnameonbidpage_PE2 = By.xpath("(//*[text()='" + eventName_PE2 + "'])[1]");
	private By eventnameonbidpage_PE3 = By.xpath("(//*[text()='" + eventName_PE3 + "'])[1]");
	private By eventnameonbidpage_PE4 = By.xpath("(//*[text()='" + eventName_PE4 + "'])[1]");
	private By eventnameonbidpage_PE5 = By.xpath("(//*[text()='" + eventName_PE5 + "'])[1]");
	private By eventnameonbidpage_PE6 = By.xpath("(//*[text()='" + eventName_PE6 + "'])[1]");
	private By eventnameonbidpage_PE7 = By.xpath("(//*[text()='" + eventName_PE7 + "'])[1]");
	private By eventnameonbidpage_PE8 = By.xpath("(//*[text()='" + eventName_PE8 + "'])[1]");
	private By eventnameonbidpage_PE9 = By.xpath("(//*[text()='" + eventName_PE9 + "'])[1]");
	private By eventnameonbidpage_PE10 = By.xpath("(//*[text()='" + eventName_PE10 + "'])[1]");
	private By eventnameonbidpage_PE11 = By.xpath("(//*[text()='" + eventName_PE11 + "'])[1]");
	private By eventnameonbidpage_PE12 = By.xpath("(//*[text()='" + eventName_PE12 + "'])[1]");
	private By eventnameonbidpage_PEWa = By.xpath("(//*[text()='" + eventName_PEWa + "'])[1]");
	private By eventnameonbidpage_PEWa2 = By.xpath("(//*[text()='" + eventName_PEWa2 + "'])[1]");
	private By eventnameonbidpage_REWA1 = By.xpath("(//*[text()='" + eventName_REWA1 + "'])[1]");
	private By eventnameonbidpage_REWA2 = By.xpath("(//*[text()='" + eventName_REWA2 + "'])[1]");
	private By eventnameonbidpage_PECa = By.xpath("(//*[text()='" + eventName_PECa + "'])[1]");
	private By eventnameonbidpage_SBMA1 = By.xpath("(//*[text()='" + eventName_PEQc + "'])[1]");
	private By eventnameonbidpage_SBMA2 = By.xpath("(//*[text()='" + eventName_PEQc1 + "'])[1]");
	private By eventnameonbidpage_SBMA3 = By.xpath("(//*[text()='" + eventName_PEQc2 + "'])[1]");
	private By eventnameonbidpage_SBMA4 = By.xpath("(//*[text()='" + eventName_PEQc3 + "'])[1]");
	private By eventnameonbidpage_SBMA5 = By.xpath("(//*[text()='" + eventName_PEQc4 + "'])[1]");
	private By eventnameonbidpage_SBMA6 = By.xpath("(//*[text()='" + eventName_PEQc5 + "'])[1]");
	private By eventnameonbidpage_SBMA7 = By.xpath("(//*[text()='" + eventName_PEQc6 + "'])[1]");
	
	// (remaining similar lines truncated for brevity)
	private By EventDropdown = By.xpath("//*[text()='Events']");
	private By Selectentity5_PE10 = By.xpath("//span[text()='" + prop1.getProperty("QCSecondEntity_PE10") + "']");
	private By btnEntity6 = By.xpath("//span[text()='" + prop.getProperty("QCSecondEntity") + "']");
	private By btnEntity7 = By.xpath("//span[text()='" + prop.getProperty("CAThirdEntity") + "']");
	private By btnDownloadResultReport = By
			.xpath("//*[@aria-label='Download Results Report for event " + eventNameEng + "']");
	private By btnDownloadQualifiedBidderReport = By
			.xpath("//*[@aria-label='Download Qualified Bidders Report for event " + eventNameEng + "']");

	@FindBy(xpath = "//p[text()='JointAuctionAutomation']")
	private WebElement runningEventName;
	
	@FindBy(xpath = "//*[text()='Auction']")
	private WebElement Auction;

	@FindBy(xpath = "(//*[text()='A211_OpenBW_Automation'])[1]")
	private WebElement runningEventName1;

	@FindBy(xpath = "//*[@aria-label='secondAuctionCertified']")
	private WebElement QCcertificationbutton;
	
	@FindBy(xpath = "//*[@aria-label='secondAuctionCertified']")
	private WebElement Wa2certificationbutton;
	
	@FindBy(xpath = "//*[@aria-label='secondAuctionCertified']")
	private WebElement Ca2certificationbutton;
	
	@FindBy(xpath = "//*[@name='tiers']")
	private WebElement tiersDropDown;
	
	@FindBy(xpath = "(//*[@name='tiers'])[2]")
	private WebElement tiersDropDown2;
	
	@FindBy(xpath = "(//*[@name='tiers'])[3]")
	private WebElement tiersDropDown3;
	
	@FindBy(xpath = "//*[@name=\"tiersPrices\"]")
	private WebElement texttiersprices;
	
	@FindBy(xpath = "(//*[@name=\"tiersPrices\"])[2]")
	private WebElement texttiersprices2;
	
	@FindBy(xpath = "(//*[@name=\"tiersPrices\"])[3]")
	private WebElement texttiersprices3;
	
	@FindBy(xpath = "//*[@name=\"totalAllowancesAvailablePerTier\"]")
	private WebElement texttotalallowanceavail;
	
	@FindBy(xpath = "(//*[@name=\"totalAllowancesAvailablePerTier\"])[2]")
	private WebElement texttotalallowanceavail2;
	
	@FindBy(xpath = "(//*[@name=\"totalAllowancesAvailablePerTier\"])[3]")
	private WebElement texttotalallowanceavail3;
	
	@FindBy(xpath = "//*[@name=\"processingOrder\"]")
	private WebElement processingOrderDropDown;
	
	@FindBy(xpath = "(//*[@name=\"processingOrder\"])[2]")
	private WebElement processingOrderDropDown2;
	
	@FindBy(xpath = "(//*[@name=\"processingOrder\"])[3]")
	private WebElement processingOrderDropDown3;
	
	@FindBy(xpath = "//*[text()='Add New']")
	private WebElement btnAddNewTier;
	
	@FindBy(xpath = "//input[@name='rollDownProcedure']")
	private WebElement btnrollDownProcedure;
	
	@FindBy(xpath = "//*[text()='Contact Us']")
	private WebElement contactUs;
	
	
	@FindBy(xpath = "(//*[@name='vintages'])[1]")
	private WebElement dropDownVintage1;

	@FindBy(xpath = "(//*[@name='vintages'])[2]")
	private WebElement dropDownVintage2;

	@FindBy(xpath = "(//select[@name='vintageType'])[1]")
	private WebElement drpdownVintageType1;

	@FindBy(xpath = "(//select[@name='vintageType'])[2]")
	private WebElement drpdownVintageType2;

	@FindBy(xpath = "(//select[@name='processingOrder'])[1]")
	private WebElement drpdownProCessOrder1;

	@FindBy(xpath = "(//select[@name='processingOrder'])[2]")
	private WebElement drpdownProCessOrder2;

	@FindBy(xpath = "//select[@name='algorithm']")
	private WebElement dropdownAlgorithm;

	@FindBy(xpath = "(//select[@id='demo-customized-select'])[1]")
	private WebElement eventTypeDropDown;

	@FindBy(xpath = "//div[@id='demo-customized-select']")
	private WebElement ParticipatingJurisdictions;
	
	@FindBy (xpath = "(//div[@id='demo-customized-select'])[1]")
	private WebElement ParticipatingJurisdictionsWa;

	@FindBy(xpath = "(//div[@id='demo-customized-select'])[2]")
	private WebElement currencyAcc;
	
	@FindBy(xpath = "(//*[@id=\"demo-customized-select\"])[3]")
	private WebElement currencyAccCa;

	@FindBy(xpath = "//*[text()='Events']")
	private WebElement btnevent;

	@FindBy(xpath = "//*[text()='You have been successfully logged out.']")
	private WebElement Logoutmessage;

	@FindBy(xpath = "//*[text()='The approval of the event creation has been proposed by the first sponsor.']")
	private WebElement ApprovalMessage;
	
	@FindBy(xpath = "//*[text()='The creation of the event has been approved by both Sponsors.']")
	private WebElement ApprovalMessage2;

	@FindBy(xpath = "(//*[text()='Auction Certification'])[1]")
	private WebElement AuctionCertificationButton;
	
	@FindBy(xpath = "//*[text()='Reserve Sale Certification']")
	private WebElement ReserveSaleCertificationButton;
	
	@FindBy(xpath = "//*[text()='Allowance Price Containment Reserve Certification']")
	private WebElement APCRCertificationButton;
	
	@FindBy(xpath = "//*[text()='Sale Certification']")
	private WebElement SBMACertificationButton;

	@FindBy(xpath = "(//*[text()='SUBMIT'])[1]")
	private WebElement submitBtncertification;

	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[4]")
	private WebElement submitBtncertificationsubmitpopup;

	@FindBy(xpath = "//span[text()='CREATE NEW EVENT']")
	private WebElement btnCreateEvent;

	@FindBy(xpath = "//span[text()='SAVE']")
	private WebElement btnSave;

	@FindBy(xpath = "//*[@data-icon='check-circle']")
	private WebElement btnApprovalQue;
	
	@FindBy (xpath = "//*[@data-icon='check-circle']")
	private WebElement btnApprovalWa;

	@FindBy(xpath = "//*[@aria-label='approval1Status']")
	private WebElement btnfirstApproval;
	
	@FindBy(xpath = "//*[@aria-label='approval2Status']")
	private WebElement btnSecondApproval;

	@FindBy(xpath = "(//*[text()='SUBMIT'])[1]")
	private WebElement btnSubmit1;

	@FindBy(xpath = "(//span[text()='SUBMIT'])[2]")
	private WebElement btnSubmit2;

	@FindBy(xpath = "//*[text()='APPROVE']")
	private WebElement popupBtn;
	
	
	@FindBy(xpath = "//*[text()='Minimum Price']")
	private WebElement btnMinPrice;

	@FindBy(xpath = "(//span[text()='SUBMIT'])[1]")
	private WebElement btnsubmitqc;

	@FindBy(xpath = "(//span[text()='SUBMIT'])[2]")
	private WebElement btnsubmitCal;

	@FindBy(xpath = "//*[text()='Welcome, SP']")
	private WebElement btnProfile;

	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement btnLogout;

	@FindBy(xpath = "//*[@href='/reservepriceadministrations']")
	private WebElement btnReservePrice2;

	@FindBy(xpath = "//button[@title='SUBMIT']")
	private WebElement btnConfirmSubmit;

	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[4]")
	private WebElement btnAlertSubmit;

	@FindBy(xpath = "//a[text()='Reports']")
	private WebElement btnReport;

	@FindBy(xpath = "//span[text()='Search Reports']")
	private WebElement btnSearchReport;

	@FindBy(xpath = "//*[text()='Reserve Price']")
	private WebElement btnReservePrice;

	@FindBy(xpath = "(//select[@id='demo-customized-select'])")
	private WebElement reportNameDropDown1;

	@FindBy(xpath = "(//input[@aria-label='Event Name'])")
	private WebElement Bdropdwnname;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input'])[1]")
	private WebElement textBoxFxCal;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input Mui-disabled Mui-disabled'])[1]")
	private WebElement textBoxFxQc;

	@FindBy(xpath = "//input[@id='eventNameInEnglish']")
	private WebElement eventName;
	
	@FindBy(xpath = "//input[@id='eventNameInFrench']")
	private WebElement eventNameFr;

	@FindBy(xpath = "//*[@id='eventNameInFrench']")
	private WebElement frenchEventName;

	@FindBy(xpath = "//input[@name='USD']")
	private WebElement textBoxUSD;

	@FindBy(xpath = "//input[@name='CAD']")
	private WebElement textBoxCAD;

	@FindBy(xpath = "//input[@id='eventId']")
	private WebElement textBoxEventID;

	@FindBy(xpath = "(//input[@name='vintagesAllowancesAvailable'])[1]")
	private WebElement textBoxVintage1;

	@FindBy(xpath = "(//input[@name='vintagesAllowancesAvailable'])[2]")
	private WebElement textBoxVintage2;

	@FindBy(xpath = "(//input[@name='eventBiddingPeriodOpen'])")
	private WebElement dateBiddingPeroidOpen;

	@FindBy(xpath = "//input[@name='eventBiddingPeriodClose']")
	private WebElement dateBiddingPeriodClose;

	@FindBy(xpath = "//*[@name='eventApplicationOpen']")
	private WebElement dateEventAppOpen;

	@FindBy(xpath = "//*[@name='eventApplicationClose']")
	private WebElement dateEventAppClose;

	@FindBy(xpath = "//input[@name='resultsAvailable']")
	private WebElement dateBidResultAvail;

	@FindBy(xpath = "//input[@name='eventClosure']")
	private WebElement dateEventClosure;

	@FindBy(xpath = "//input[@name='financialSettlement']")
	private WebElement dateFinantialSettlement;

	@FindBy(xpath = "//*[text()='ADD BID']")
	private WebElement btnAddbid;
	
	@FindBy(xpath = "//*[@id=\"bidLot\"]")
	private WebElement textBidLot;
	
	@FindBy(xpath = "//*[@name=\"tier\"]")
	private WebElement selectTier;
	

	@FindBy(xpath = "//input[@id='bidPrice']")
	private WebElement textBidPrice;

	@FindBy(xpath = "//input[@id='bidLot']")
	private WebElement textBidLots;

	@FindBy(xpath = "//select[@id='demo-customized-select']")
	private WebElement dropdownvintage;

	@FindBy(xpath = "//span[text()='SUBMIT']")
	private WebElement btnSubmit;

	@FindBy(xpath = "//span[text()='CONFIRM']")
	private WebElement btnConfirm;

	@FindBy(xpath = "//*[text()='Bid successfully added.']")
	private WebElement alertMsg;

	@FindBy(xpath = "//*[text()='Bid successfully submitted.']")
	private WebElement alertMsg2;
	
	@FindBy(xpath = "(//*[text()='RUN ALGORITHM'])[1]")
	private WebElement btnRunAlgorithmWA;

	@FindBy(xpath = "(//*[text()='RUN ALGORITHM'])[2]")
	private WebElement btnRunAlgorithmWA2;

	@FindBy(xpath = "//*[@data-icon='times']")
	private WebElement alertPopup;

	@FindBy(xpath = "//*[@title='Log in']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//*[text()='Log in']")
	private WebElement Login;
	
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

	@FindBy(xpath = "//span[contains(text(),'SOUMETTRE')]")
	private WebElement btnNextQC;

	@FindBy(xpath = "//span[text()='Administration']")
	private WebElement btnAdminstration;

	@FindBy(xpath = "//a[text()='Event']")
	private WebElement btnEvent;

	@FindBy(xpath = "//*[text()='CONTINUE']")
	private WebElement btnContineu;

	@FindBy(xpath = "//a[@href='/report']")
	private WebElement btnReports;

	@FindBy(xpath = "//button//*[text()='Search Reports']")
	private WebElement btnSearchReports;

	@FindBy(xpath = "//button[@title='SEARCH']")
	private WebElement btnSearch;

	@FindBy(xpath = "//button[@title='Settings']")
	private WebElement btnSettings;

	@FindBy(xpath = "//a[text()='Execute API']")
	private WebElement btnExecuteAPI;

	@FindBy(xpath = "(//*[text()='Execute'])[2]")
	private WebElement APIGetQualifiedBidder;

	@FindBy(xpath = "(//*[text()='Execute'])[3]")
	private WebElement APIGetBidLimitations;

	@FindBy(xpath = "//span[text()='Execute API']")
	private WebElement APIexecutionPopupbtn;

	@FindBy(xpath = "//*[text()='Français']")
	private WebElement langBtnFrench;

	@FindBy(xpath = "//li[text()='English']")
	private WebElement langBtnEng;

	@FindBy(xpath = "//*[@aria-label='firstAuctionCertified']")
	private WebElement auctionCerButton;

	@FindBy(xpath = "(//*[text()='RUN ALGORITHM'])[1]")
	private WebElement btnRunAlgorithmCA;
	
	@FindBy(xpath ="//*[text()='About WCI, Inc.']")
	private WebElement btnAboutWci;

	@FindBy(xpath = "(//*[text()='RUN ALGORITHM'])[2]")
	private WebElement btnRunAlgorithmQC;
	
	@FindBy(xpath = "//*[@id='menu-participatingJurisdictions']//ul/li[2]")
	private WebElement btnCalifornia;
	
	@FindBy(xpath = "//*[@id='menu-participatingJurisdictions']//ul/li[3]")
	private WebElement btnQuebec;
	
	@FindBy(xpath = "//*[text()='USD']")
	private WebElement tagUSD;
	
	@FindBy(xpath = "//*[text()='CAD']")
	private WebElement tagCAD;
	
	@FindBy(xpath ="//*[text()='The event has been created successfully.']")
	private WebElement successmsg;
	
	
	
	
	//WebElement btnCalifornia;
	//WebElement btnQuebec;
	@FindBy(xpath = "(//*[text()='Washington'])[2]")
	WebElement btnWashinton;
	
	
	private By Selectentity1_PE2;
	private By Selectentity1_PE3;
	private By Selectentity1_PE5;
	private By Selectentity1_PE6;
	private By Selectentity1_PE7;
	private By Selectentity1_PE8;
	private By Selectentity1_PE9;
	private By Selectentity1_PE10;
	private By Selectentity1_PE4;
	private By Selectentity2_PE4;
	private By Selectentity2_PE5;
	private By Selectentity2_PE6;
	private By Selectentity2_PE7;
	private By Selectentity2_PE8;
	private By Selectentity2_PE9;
	private By Selectentity2_PE10;
	private By Selectentity3_PE4;
	private By Selectentity4_PE4;
	private By Selectentity5_PE4;

	private By Selectentity3_PE1;
	private By Selectentity4_PE1;
	private By Selectentity2_PE2;
	private By Selectentity2_PE3;
	private By Selectentity5_PE1;
	private By Selectentity3_PE2;
	private By Selectentity3_PE3;
	private By Selectentity3_PE5;
	private By Selectentity3_PE6;
	private By Selectentity3_PE7;
	private By Selectentity3_PE8;
	private By Selectentity3_PE9;
	private By Selectentity3_PE10;
	private By Selectentity6_PE1;
	private By Selectentity4_PE2;
	private By Selectentity4_PE3;
	private By Selectentity4_PE5;
	private By Selectentity4_PE6;
	private By Selectentity4_PE7;
	private By Selectentity4_PE8;
	private By Selectentity4_PE9;
	private By Selectentity4_PE10;
	private By Selectentity7_PE1;
	private By Selectentity5_PE2;
	private By Selectentity5_PE3;
	private By Selectentity5_PE5;
	private By Selectentity5_PE6;
	private By Selectentity5_PE7;
	private By Selectentity5_PE8;
	private By Selectentity5_PE9;

	public com_pomClassForJointAuctionTieBreaker() {
		PageFactory.initElements(driver.get(), this);
	}

	public void loginsponsor() throws InterruptedException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnLogin)).click();
			username.sendKeys(prop.getProperty("UserSponsorCa"));
			password.sendKeys(prop.getProperty("Password"));
			btnLogin2.click();
			System.out.println("California sponsor2 login successfully");
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
			btnLogin.click();
			username.clear();
			password.clear();
			username.sendKeys(prop.getProperty("UserSponsorCa"));
			password.sendKeys(prop.getProperty("Password"));
			btnLogin2.click();
			System.out.println("California sponsor2 login successfully");
		}
	}

	public void runAlgorithm2() throws InterruptedException {
		
        try {
			wait.until(ExpectedConditions.visibilityOf(btnRunAlgorithmWA));
			btnRunAlgorithmWA.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(btnRunAlgorithmWA2));
			btnRunAlgorithmWA2.click();
		}
		wait.until(ExpectedConditions.visibilityOf(btnContineu));
		btnContineu.click();
		Thread.sleep(10000);	
	}

	public void AuctionCertificationButtonca() throws InterruptedException {
		AuctionCertificationButton.click();
//		commonLib lib = new commonLib();
//		lib.scroll(auctionCerButton, "scrollToElement", "Move to Auction certification ");
//		lib.click(auctionCerButton, "seleniumClick", "click on Auction certification ");
//		submitBtncertification.click();
//		ObjectRepo.test.log(Status.PASS, "Clicked on Auction Certification by California Sponsor");
		WebElement element111 = auctionCerButton;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", element111);
		element111.click();
		submitBtncertification.click();
		Thread.sleep(7000);
	}
	
	public void AuctionCertificationButtonWa1() throws InterruptedException {
		AuctionCertificationButton.click();
//		commonLib lib = new commonLib();
//		lib.scroll(auctionCerButton, "scrollToElement", "Move to Auction certification ");
//		lib.click(auctionCerButton, "seleniumClick", "click on Auction certification ");
//		submitBtncertification.click();
//		ObjectRepo.test.log(Status.PASS, "Clicked on Auction Certification by California Sponsor");
		WebElement element111 = auctionCerButton;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", element111);
		element111.click();
		Thread.sleep(2000);
		submitBtncertification.click();
		Thread.sleep(7000);
	}
	
	public void AuctionCertificationButtonPECa() throws InterruptedException {
		ReserveSaleCertificationButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(auctionCerButton));

		WebElement element111 = auctionCerButton;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", element111);
		element111.click();
		Thread.sleep(2000);
		submitBtncertification.click();
		Thread.sleep(7000);
	}
	
	public void AuctionCertificationButtonREWA1() throws InterruptedException {
		APCRCertificationButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(auctionCerButton));

		WebElement element111 = auctionCerButton;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", element111);
		element111.click();
		Thread.sleep(2000);
		submitBtncertification.click();
		Thread.sleep(7000);
	}
	
	public void AuctionCertificationButtonPEQc() throws InterruptedException {
		SBMACertificationButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(auctionCerButton));
		WebElement element111 = auctionCerButton;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", element111);
		element111.click();
		Thread.sleep(2000);
		submitBtncertification.click();
		Thread.sleep(7000);
	}

	public void AuctionCertificationButtonqc() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(AuctionCertificationButton));
		AuctionCertificationButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(QCcertificationbutton));
		QCcertificationbutton.click();
        Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtncertification));
		submitBtncertification.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtncertificationsubmitpopup));
		submitBtncertificationsubmitpopup.click();
		Thread.sleep(5000);
		ObjectRepo.test.log(Status.PASS, "Clicked on Auction Certification by Quebec Sponsor");
	}
	
	public void AuctionCertificationButtonWa2() throws InterruptedException {
		AuctionCertificationButton.click();
//		wait.until(ExpectedConditions.elementToBeClickable(Wa2certificationbutton));
//		Wa2certificationbutton.click();
		WebElement element111 = Wa2certificationbutton;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", element111);
		wait.until(ExpectedConditions.elementToBeClickable(Wa2certificationbutton));
		Wa2certificationbutton.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtncertification));
		submitBtncertification.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtncertificationsubmitpopup));
		submitBtncertificationsubmitpopup.click();
		Thread.sleep(2000);
		ObjectRepo.test.log(Status.PASS, "Clicked on Auction Certification by WashingtonSecond Sponsor");
	}
	
	public void AuctionCertification2ButtonPECa() throws InterruptedException {
		ReserveSaleCertificationButton.click();
//		wait.until(ExpectedConditions.elementToBeClickable(Wa2certificationbutton));
//		Wa2certificationbutton.click();
		WebElement element111 = Ca2certificationbutton;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", element111);
		wait.until(ExpectedConditions.elementToBeClickable(Ca2certificationbutton));
		Ca2certificationbutton.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtncertification));
		submitBtncertification.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtncertificationsubmitpopup));
		submitBtncertificationsubmitpopup.click();
		Thread.sleep(2000);
		ObjectRepo.test.log(Status.PASS, "Clicked on Auction Certification by CaliforniaSecond Sponsor");
	}
	
	public void AuctionCertification2ButtonREWA1() throws InterruptedException {
		APCRCertificationButton.click();
//		wait.until(ExpectedConditions.elementToBeClickable(Wa2certificationbutton));
//		Wa2certificationbutton.click();
		WebElement element111 = Ca2certificationbutton;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", element111);
		wait.until(ExpectedConditions.elementToBeClickable(Ca2certificationbutton));
		Ca2certificationbutton.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtncertification));
		submitBtncertification.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtncertificationsubmitpopup));
		submitBtncertificationsubmitpopup.click();
		Thread.sleep(2000);
		ObjectRepo.test.log(Status.PASS, "Clicked on Auction Certification by Washington Second Sponsor");
	}
	
	public void AuctionCertification2ButtonPEQc() throws InterruptedException {
		SBMACertificationButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(Ca2certificationbutton));
		WebElement element111 = Ca2certificationbutton;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", element111);
		wait.until(ExpectedConditions.elementToBeClickable(Ca2certificationbutton));
		Ca2certificationbutton.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtncertification));
		submitBtncertification.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtncertificationsubmitpopup));
		submitBtncertificationsubmitpopup.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(SecCertificationQcSuccessMsg));
		ObjectRepo.test.log(Status.PASS, "Clicked on Auction Certification by QuebecSecond Sponsor");
	}


	public void searchQualifiedbidderReportFunctionality() throws InterruptedException {
		try {
			btnReports.click();
			DownloadReports ref = new DownloadReports();
			ref.searchReportsByEventNameForJointAuction();
			WebElement element2 = wait
					.until(ExpectedConditions.visibilityOfElementLocated(btnDownloadQualifiedBidderReport));
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			js.executeScript("arguments[0].scrollIntoView();", element2);
			driver.get().findElement(btnDownloadQualifiedBidderReport).click();
		} catch (Exception e) {
			btnReports.click();
			WebElement element = btnSearchReports;
			Actions action = new Actions(driver.get());
			action.moveToElement(element).build().perform();
			action.click(element).build().perform();
			btnSearchReports.click();
			driver.get().findElement(By.xpath("//input[@id='auto' and @aria-label='Event Name']"))
					.sendKeys(eventNameEng);
			WebElement element1 = btnSearch;
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			js.executeScript("arguments[0].scrollIntoView();", element1);
			action.moveToElement(element1).build().perform();
			action.click(element1).build().perform();
			driver.get().findElement(By.xpath(("//*[contains(text(),'" + prop.getProperty("Event_Name") + "')])[2]")))
					.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnDownloadQualifiedBidderReport)).click();
		}
	}

	public void clickreportmenu() throws Exception {
		
		wait.until(ExpectedConditions.elementToBeClickable(btnReport));
		Thread.sleep(2000);
//		WebElement element = btnReport;
//		Actions action = new Actions(driver.get());
//		action.click(element).build().perform();
		btnReport.click();
	}

	public void btnsearchreport() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(btnSearchReport));
		btnSearchReport.click();
	}

	public void ReportEventSelectfromDropdown_PE1() {
		wait.until(ExpectedConditions.elementToBeClickable(Bdropdwnname));
		WebElement abc4 = Bdropdwnname;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc4);
		abc4.click();
		WebElement element11 = driver.get().findElement(eventnameonbidpage_PE1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", element11);
		element11.click();
	}

	public void ReportEventSelectfromDropdown_PE2() {
		wait.until(ExpectedConditions.elementToBeClickable(Bdropdwnname));
		WebElement abc4 = Bdropdwnname;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc4);
		abc4.click();
		WebElement element11 = driver.get().findElement(eventnameonbidpage_PE1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", element11);
		element11.click();
	}

	public void ReportEventSelectfromDropdown_PE3() {
		wait.until(ExpectedConditions.elementToBeClickable(Bdropdwnname));
		WebElement abc4 = Bdropdwnname;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc4);
		abc4.click();
		WebElement element11 = driver.get().findElement(eventnameonbidpage_PE1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", element11);
		element11.click();
	}

	public void ReportEventSelectfromDropdown_PE5() {
		wait.until(ExpectedConditions.elementToBeClickable(Bdropdwnname));
		WebElement abc4 = Bdropdwnname;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc4);
		abc4.click();
		WebElement element11 = driver.get().findElement(eventnameonbidpage_PE1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", element11);
		element11.click();
	}

	public void ReportEventSelectfromDropdown_PE6() {
		wait.until(ExpectedConditions.elementToBeClickable(Bdropdwnname));
		WebElement abc4 = Bdropdwnname;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc4);
		abc4.click();
		WebElement element11 = driver.get().findElement(eventnameonbidpage_PE1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", element11);
		element11.click();
	}

	public void ReportEventSelectfromDropdown_PE7() {
		wait.until(ExpectedConditions.elementToBeClickable(Bdropdwnname));
		WebElement abc4 = Bdropdwnname;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc4);
		abc4.click();
		WebElement element11 = driver.get().findElement(eventnameonbidpage_PE1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", element11);
		element11.click();
	}

	public void ReportEventSelectfromDropdown_PE8() {
		wait.until(ExpectedConditions.elementToBeClickable(Bdropdwnname));
		WebElement abc4 = Bdropdwnname;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc4);
		abc4.click();
		WebElement element11 = driver.get().findElement(eventnameonbidpage_PE1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", element11);
		element11.click();
	}

	public void ReportEventSelectfromDropdown_PE9() {
		wait.until(ExpectedConditions.elementToBeClickable(Bdropdwnname));
		WebElement abc4 = Bdropdwnname;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc4);
		abc4.click();
		WebElement element11 = driver.get().findElement(eventnameonbidpage_PE1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", element11);
		element11.click();
	}

	public void ReportEventSelectfromDropdown_PE10() {
		wait.until(ExpectedConditions.elementToBeClickable(Bdropdwnname));
		WebElement abc4 = Bdropdwnname;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc4);
		abc4.click();
		WebElement element11 = driver.get().findElement(eventnameonbidpage_PE1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", element11);
		element11.click();
	}

	public void ReportEventSelectfromDropdown_PE4() {
		wait.until(ExpectedConditions.elementToBeClickable(Bdropdwnname));
		WebElement abc4 = Bdropdwnname;
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc4);
		abc4.click();
		WebElement element11 = driver.get().findElement(eventnameonbidpage);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", element11);
		element11.click();
	}

	public void QualifiedBiddersReportselectfromdropdown() {
		wait.until(ExpectedConditions.elementToBeClickable(reportNameDropDown1));
		WebElement eventType = reportNameDropDown1;
		Select s = new Select(eventType);
		s.selectByVisibleText("Qualified Bidders Report");
	}

	public void ResultReportselectfromdropdown() {
		wait.until(ExpectedConditions.elementToBeClickable(reportNameDropDown1));
		WebElement eventType = reportNameDropDown1;
		Select s = new Select(eventType);
		s.selectByVisibleText("Results Report");
	}

	public void searchQualifiedbidderReportFunctionality_PE1() throws Exception {
		clickreportmenu();
		Thread.sleep(2000);
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		Thread.sleep(2000);
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		QualifiedBiddersReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Qualified Bidders Report is  selected from dropdown");
		Thread.sleep(2000);
		ReportEventSelectfromDropdown_PE1();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		Thread.sleep(2000);
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventQualifiedBiddersReport_PE1();
	}

	public void searchQualifiedbidderReportFunctionality_PE2() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		QualifiedBiddersReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Qualified Bidders Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE2();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventQualifiedBiddersReport_PE2();
	}

	public void searchQualifiedbidderReportFunctionality_PE3() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		QualifiedBiddersReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Qualified Bidders Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE3();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventQualifiedBiddersReport_PE3();
	}

	public void searchQualifiedbidderReportFunctionality_PE5() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		QualifiedBiddersReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Qualified Bidders Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE5();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventQualifiedBiddersReport_PE5();
	}

	public void searchQualifiedbidderReportFunctionality_PE6() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		QualifiedBiddersReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Qualified Bidders Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE6();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventQualifiedBiddersReport_PE6();
	}

	public void searchQualifiedbidderReportFunctionality_PE7() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		QualifiedBiddersReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Qualified Bidders Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE7();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventQualifiedBiddersReport_PE7();
	}

	public void searchQualifiedbidderReportFunctionality_PE8() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		QualifiedBiddersReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Qualified Bidders Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE8();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventQualifiedBiddersReport_PE8();
	}

	public void searchQualifiedbidderReportFunctionality_PE9() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		QualifiedBiddersReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Qualified Bidders Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE9();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventQualifiedBiddersReport_PE9();
	}

	public void searchQualifiedbidderReportFunctionality_PE10() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		QualifiedBiddersReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Qualified Bidders Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE10();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventQualifiedBiddersReport_PE10();
	}

	public void searchQualifiedbidderReportFunctionality_PE4() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		QualifiedBiddersReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Qualified Bidders Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE4();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventQualifiedBiddersReport_PE4();
	}

	public void searchResultReportFunctionality_PE1() throws Exception {
		clickreportmenu();
		Thread.sleep(2000);
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		Thread.sleep(2000);
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		Thread.sleep(2000);
		ResultReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Result Report is  selected from dropdown");
		Thread.sleep(2000);
		ReportEventSelectfromDropdown_PE1();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		Thread.sleep(2000);
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventResultReport_PE1();
	}

	public void searchResultReportFunctionality_PE2() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		ResultReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Result Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE2();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventResultReport_PE2();
	}

	public void searchResultReportFunctionality_PE3() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		ResultReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Result Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE3();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventResultReport_PE3();
	}

	public void searchResultReportFunctionality_PE5() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		ResultReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Result Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE5();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventResultReport_PE5();
	}

	public void searchResultReportFunctionality_PE6() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		ResultReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Result Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE6();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventResultReport_PE6();
	}

	public void searchResultReportFunctionality_PE7() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		ResultReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Result Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE7();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventResultReport_PE7();
	}

	public void searchResultReportFunctionality_PE8() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		ResultReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Result Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE8();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventResultReport_PE8();
	}

	public void searchResultReportFunctionality_PE9() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		ResultReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Result Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE9();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventResultReport_PE9();
	}

	public void searchResultReportFunctionality_PE10() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		ResultReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Result Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE10();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventResultReport_PE10();
	}

	public void searchResultReportFunctionality_PE4() throws Exception {
		clickreportmenu();
		System.out.println("Click on Report menu");
		ObjectRepo.test.log(Status.PASS, "Click on Report menu");
		btnsearchreport();
		System.out.println("Click on Report search button");
		ObjectRepo.test.log(Status.PASS, "Click on Report search button");
		ResultReportselectfromdropdown();
		System.out.println("Report is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Result Report is  selected from dropdown");
		ReportEventSelectfromDropdown_PE4();
		System.out.println("Event name  is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "Event name is  selected from dropdown");
		clicksearchbtn();
		System.out.println("Click on search button");
		ObjectRepo.test.log(Status.PASS, "Click on search button");
		downloadongoingeventResultReport_PE4();
	}

	public void clicksearchbtn() {
		wait.until(ExpectedConditions.elementToBeClickable(btnSearch));
		btnSearch.click();
	}

	public void downloadongoingeventQualifiedBiddersReport_PE1() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnQualifiedBidderReports_PE1));
		WebElement abc7 = driver.get().findElement(btnQualifiedBidderReports_PE1);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Qualified Bidder Report Download Button");
	}

	public void downloadongoingeventQualifiedBiddersReport_PE2() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnQualifiedBidderReports_PE2));
		WebElement abc7 = driver.get().findElement(btnQualifiedBidderReports_PE2);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Qualified Bidder Report Download Button");
	}

	public void downloadongoingeventQualifiedBiddersReport_PE3() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnQualifiedBidderReports_PE3));
		WebElement abc7 = driver.get().findElement(btnQualifiedBidderReports_PE3);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Qualified Bidder Report Download Button");
	}

	public void downloadongoingeventQualifiedBiddersReport_PE5() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnQualifiedBidderReports_PE5));
		WebElement abc7 = driver.get().findElement(btnQualifiedBidderReports_PE5);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Qualified Bidder Report Download Button");
	}

	public void downloadongoingeventQualifiedBiddersReport_PE7() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnQualifiedBidderReports_PE7));
		WebElement abc7 = driver.get().findElement(btnQualifiedBidderReports_PE7);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Qualified Bidder Report Download Button");
	}

	public void downloadongoingeventQualifiedBiddersReport_PE8() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnQualifiedBidderReports_PE8));
		WebElement abc7 = driver.get().findElement(btnQualifiedBidderReports_PE8);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Qualified Bidder Report Download Button");
	}

	public void downloadongoingeventQualifiedBiddersReport_PE9() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnQualifiedBidderReports_PE9));
		WebElement abc7 = driver.get().findElement(btnQualifiedBidderReports_PE9);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Qualified Bidder Report Download Button");
	}

	public void downloadongoingeventQualifiedBiddersReport_PE10() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnQualifiedBidderReports_PE10));
		WebElement abc7 = driver.get().findElement(btnQualifiedBidderReports_PE10);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Qualified Bidder Report Download Button");
	}

	public void downloadongoingeventQualifiedBiddersReport_PE6() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnQualifiedBidderReports_PE6));
		WebElement abc7 = driver.get().findElement(btnQualifiedBidderReports_PE6);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Qualified Bidder Report Download Button");
	}

	public void downloadongoingeventQualifiedBiddersReport_PE4() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnQualifiedBidderReports_PE4));
		WebElement abc7 = driver.get().findElement(btnQualifiedBidderReports_PE4);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Qualified Bidder Report Download Button");
	}

	public void downloadongoingeventResultReport_PE1() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnResultReports_PE1));
		WebElement abc7 = driver.get().findElement(btnResultReports_PE1);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Result Report Download Button");
	}

	public void downloadongoingeventResultReport_PE2() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnResultReports_PE2));
		WebElement abc7 = driver.get().findElement(btnResultReports_PE2);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Result Report Download Button");
	}

	public void downloadongoingeventResultReport_PE3() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnResultReports_PE3));
		WebElement abc7 = driver.get().findElement(btnResultReports_PE3);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Result Report Download Button");
	}

	public void downloadongoingeventResultReport_PE5() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnResultReports_PE5));
		WebElement abc7 = driver.get().findElement(btnResultReports_PE5);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Result Report Download Button");
	}

	public void downloadongoingeventResultReport_PE6() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnResultReports_PE6));
		WebElement abc7 = driver.get().findElement(btnResultReports_PE6);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Result Report Download Button");
	}

	public void downloadongoingeventResultReport_PE7() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnResultReports_PE7));
		WebElement abc7 = driver.get().findElement(btnResultReports_PE7);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Result Report Download Button");
	}

	public void downloadongoingeventResultReport_PE8() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnResultReports_PE8));
		WebElement abc7 = driver.get().findElement(btnResultReports_PE8);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Result Report Download Button");
	}

	public void downloadongoingeventResultReport_PE9() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnResultReports_PE9));
		WebElement abc7 = driver.get().findElement(btnResultReports_PE9);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Result Report Download Button");
	}

	public void downloadongoingeventResultReport_PE10() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnResultReports_PE10));
		WebElement abc7 = driver.get().findElement(btnResultReports_PE10);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Result Report Download Button");
	}

	public void downloadongoingeventResultReport_PE4() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnResultReports_PE4));
		WebElement abc7 = driver.get().findElement(btnResultReports_PE4);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("arguments[0].scrollIntoView();", abc7);
		abc7.click();
		System.out.println("Click on Download option");
		ObjectRepo.test.log(Status.PASS, "Clicked on Result Report Download Button");
	}

	public void getQualifiedBidderReportData() throws Exception {
		DownloadQualifiedBidderReport report = new DownloadQualifiedBidderReport();
		String colomn1name = report.getStringData("Qualified Bidders Report", 5, 0);
		String regGenAccNo1 = report.getStringData("Qualified Bidders Report", 6, 0);
		String regGenAccNo2 = report.getStringData("Qualified Bidders Report", 7, 0);
		String regGenAccNo3 = report.getStringData("Qualified Bidders Report", 8, 0);
		String regGenAccNo4 = report.getStringData("Qualified Bidders Report", 9, 0);
		String regGenAccNo5 = report.getStringData("Qualified Bidders Report", 10, 0);
		String colomn2name = report.getStringData("Qualified Bidders Report", 5, 1);
		String entityLegalName1 = report.getStringData("Qualified Bidders Report", 6, 1);
		String entityLegalName2 = report.getStringData("Qualified Bidders Report", 7, 1);
		String entityLegalName3 = report.getStringData("Qualified Bidders Report", 8, 1);
		String entityLegalName4 = report.getStringData("Qualified Bidders Report", 9, 1);
		String entityLegalName5 = report.getStringData("Qualified Bidders Report", 10, 1);
		String colomn3name = report.getStringData("Qualified Bidders Report", 5, 2);
		String entityOperatingName1 = report.getStringData("Qualified Bidders Report", 6, 2);
		String entityOperatingName2 = report.getStringData("Qualified Bidders Report", 7, 2);
		String entityOperatingName3 = report.getStringData("Qualified Bidders Report", 8, 2);
		String entityOperatingName4 = report.getStringData("Qualified Bidders Report", 9, 2);
		String entityOperatingName5 = report.getStringData("Qualified Bidders Report", 10, 2);
		String colomn4name = report.getStringData("Qualified Bidders Report", 5, 3);
		String entityType1 = report.getStringData("Qualified Bidders Report", 6, 3);
		String entityType2 = report.getStringData("Qualified Bidders Report", 7, 3);
		String entityType3 = report.getStringData("Qualified Bidders Report", 8, 3);
		String entityType4 = report.getStringData("Qualified Bidders Report", 9, 3);
		String entityType5 = report.getStringData("Qualified Bidders Report", 10, 3);
		String colomn5name = report.getStringData("Qualified Bidders Report", 5, 4);
		String entJurisdiction1 = report.getStringData("Qualified Bidders Report", 6, 4);
		String entJurisdiction2 = report.getStringData("Qualified Bidders Report", 7, 4);
		String entJurisdiction3 = report.getStringData("Qualified Bidders Report", 8, 4);
		String entJurisdiction4 = report.getStringData("Qualified Bidders Report", 9, 4);
		String entJurisdiction5 = report.getStringData("Qualified Bidders Report", 10, 4);

		// FSA Acc No
		String colomn6name = report.getStringData("Qualified Bidders Report", 5, 5);
		String fsaAccNum1 = report.getStringData("Qualified Bidders Report", 6, 5);
		String fsaAccNum2 = report.getStringData("Qualified Bidders Report", 7, 5);
		String fsaAccNum3 = report.getStringData("Qualified Bidders Report", 8, 5);
		String fsaAccNum4 = report.getStringData("Qualified Bidders Report", 9, 5);
		String fsaAccNum5 = report.getStringData("Qualified Bidders Report", 10, 5);

		// Bid Guarantee Currency
		String colomn7name = report.getStringData("Qualified Bidders Report", 5, 5);
		String bidGuaranteeCurrency1 = report.getStringData("Qualified Bidders Report", 6, 6);
		String bidGuaranteeCurrency2 = report.getStringData("Qualified Bidders Report", 7, 6);
		String bidGuaranteeCurrency3 = report.getStringData("Qualified Bidders Report", 8, 6);
		String bidGuaranteeCurrency4 = report.getStringData("Qualified Bidders Report", 9, 6);
		String bidGuaranteeCurrency5 = report.getStringData("Qualified Bidders Report", 10, 6);

		// Total bid Guarantee value
		String colomn11name = report.getStringData("Qualified Bidders Report", 5, 11);
		double totalbidGuaranteeCurrency1 = report.getNumericData("Qualified Bidders Report", 6, 11);
		double totalbidGuaranteeCurrency2 = report.getNumericData("Qualified Bidders Report", 7, 11);
		double totalbidGuaranteeCurrency3 = report.getNumericData("Qualified Bidders Report", 8, 11);
		double totalbidGuaranteeCurrency4 = report.getNumericData("Qualified Bidders Report", 9, 11);
		double totalbidGuaranteeCurrency5 = report.getNumericData("Qualified Bidders Report", 10, 11);

		// Purchase limit for current auction
		String colomn12name = report.getStringData("Qualified Bidders Report", 5, 12);
		double purchaselimit1 = report.getNumericData("Qualified Bidders Report", 6, 12);
		double purchaselimit2 = report.getNumericData("Qualified Bidders Report", 7, 12);
		double purchaselimit3 = report.getNumericData("Qualified Bidders Report", 8, 12);
		double purchaselimit4 = report.getNumericData("Qualified Bidders Report", 9, 12);
		double purchaselimit5 = report.getNumericData("Qualified Bidders Report", 10, 12);

		// Holding limit for current auction
		String colomn14name = report.getStringData("Qualified Bidders Report", 5, 14);
		long holdingLimit1 = report.getNumericData1("Qualified Bidders Report", 6, 14);
		long holdingLimit2 = report.getNumericData1("Qualified Bidders Report", 7, 14);
		long holdingLimit3 = report.getNumericData1("Qualified Bidders Report", 8, 14);
		long holdingLimit4 = report.getNumericData1("Qualified Bidders Report", 9, 14);
		long holdingLimit5 = report.getNumericData1("Qualified Bidders Report", 10, 14);

		System.out.println(colomn1name + " : " + regGenAccNo1 + ",  " + colomn2name + " : " + entityLegalName1 + ",  "
				+ colomn3name + " : " + entityOperatingName1 + ",  " + colomn4name + " : " + entityType1 + ",  "
				+ colomn5name + " : " + entJurisdiction1 + ",  " + colomn6name + " : " + fsaAccNum1 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency1 + ",  " + colomn11name + " : "
				+ totalbidGuaranteeCurrency1 + ",  " + colomn12name + " : " + purchaselimit1 + ",  " + colomn14name
				+ " : " + holdingLimit1);

		System.out.println(colomn1name + " : " + regGenAccNo2 + ",  " + colomn2name + " : " + entityLegalName2 + ",  "
				+ colomn3name + " : " + entityOperatingName2 + ",  " + colomn4name + " : " + entityType2 + ",  "
				+ colomn5name + " : " + entJurisdiction2 + ",  " + colomn6name + " : " + fsaAccNum2 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency2 + ",  " + colomn11name + " : "
				+ totalbidGuaranteeCurrency2 + ",  " + colomn12name + " : " + purchaselimit2 + ",  " + colomn14name
				+ " : " + holdingLimit2);

		System.out.println(colomn1name + " : " + regGenAccNo3 + ",  " + colomn2name + " : " + entityLegalName3 + ",  "
				+ colomn3name + " : " + entityOperatingName3 + ",  " + colomn4name + " : " + entityType3 + ",  "
				+ colomn5name + " : " + entJurisdiction3 + ",  " + colomn6name + " : " + fsaAccNum3 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency3 + ",  " + colomn11name + " : "
				+ totalbidGuaranteeCurrency3 + ",  " + colomn12name + " : " + purchaselimit3 + ",  " + colomn14name
				+ " : " + holdingLimit3);

		System.out.println(colomn1name + " : " + regGenAccNo4 + ",  " + colomn2name + " : " + entityLegalName4 + ",  "
				+ colomn3name + " : " + entityOperatingName4 + ",  " + colomn4name + " : " + entityType4 + ",  "
				+ colomn5name + " : " + entJurisdiction4 + ",  " + colomn6name + " : " + fsaAccNum4 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency4 + ",  " + colomn11name + " : "
				+ totalbidGuaranteeCurrency4 + ",  " + colomn12name + " : " + purchaselimit4 + ",  " + colomn14name
				+ " : " + holdingLimit4);

		System.out.println(colomn1name + " : " + regGenAccNo5 + ",  " + colomn2name + " : " + entityLegalName5 + ",  "
				+ colomn3name + " : " + entityOperatingName5 + ",  " + colomn4name + " : " + entityType5 + ",  "
				+ colomn5name + " : " + entJurisdiction5 + ",  " + colomn6name + " : " + fsaAccNum5 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency5 + ",  " + colomn11name + " : "
				+ totalbidGuaranteeCurrency5 + ",  " + colomn12name + " : " + purchaselimit5 + ",  " + colomn14name
				+ " : " + holdingLimit5);

	}

	public void searchReportFunctionality() throws InterruptedException {
		btnReports.click();

		DownloadReports ref = new DownloadReports();
		ref.searchReportsByEventNameForJointAuction();
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnDownloadResultReport));
		driver.get().findElement(btnDownloadResultReport).click();
	}

	public void fetchExcelDataforresultReport() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(folderPath + File.separator + "Results Report - " + eventNameEng + " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforresultReport_PE1() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(folderPath + File.separator + "Results Report - " + eventName_PE1 + " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforresultReport_PE2() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(folderPath + File.separator + "Results Report - " + eventName_PE2 + " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforresultReport_PE3() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(folderPath + File.separator + "Results Report - " + eventName_PE3 + " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforresultReport_PE5() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(folderPath + File.separator + "Results Report - " + eventName_PE5 + " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforresultReport_PE6() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(folderPath + File.separator + "Results Report - " + eventName_PE6 + " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforresultReport_PE7() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(folderPath + File.separator + "Results Report - " + eventName_PE7 + " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforresultReport_PE8() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(folderPath + File.separator + "Results Report - " + eventName_PE8 + " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforresultReport_PE9() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(folderPath + File.separator + "Results Report - " + eventName_PE9 + " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforresultReport_PE10() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(folderPath + File.separator + "Results Report - " + eventName_PE10 + " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforresultReport_PE4() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(folderPath + File.separator + "Results Report - " + eventName_PE4 + " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getStringDataRR(String Sheetname, int row, int col) {
		return wb.getSheet(Sheetname).getRow(row).getCell(col).getStringCellValue();
	}

	public double getNumericDataRR(String Sheetname, int row, int col) {
		return wb.getSheet(Sheetname).getRow(row).getCell(col).getNumericCellValue();
	}

	public void fetchExcelDataforQualifiedBidderReport() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(
				folderPath + File.separator + "Qualified Bidders Report - " + eventNameEng + " " + date1 + ".xlsx");
		System.out.println("filepath:=" + folderPath + File.separator + "Qualified Bidders Report - " + eventNameEng
				+ " " + date1 + ".xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforQualifiedBidderReport_PE2() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(
				folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE2 + " " + date1 + ".xlsx");
		System.out.println("filepath:=" + folderPath + File.separator + "Qualified Bidders Report - " + eventNameEng
				+ " " + date1 + ".xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforQualifiedBidderReport_PE3() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(
				folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE3 + " " + date1 + ".xlsx");
		System.out.println("filepath:=" + folderPath + File.separator + "Qualified Bidders Report - " + eventNameEng
				+ " " + date1 + ".xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforQualifiedBidderReport_PE5() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(
				folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE5 + " " + date1 + ".xlsx");
		System.out.println("filepath:=" + folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE5
				+ " " + date1 + ".xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforQualifiedBidderReport_PE6() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(
				folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE6 + " " + date1 + ".xlsx");
		System.out.println("filepath:=" + folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE6
				+ " " + date1 + ".xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforQualifiedBidderReport_PE7() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(
				folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE7 + " " + date1 + ".xlsx");
		System.out.println("filepath:=" + folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE7
				+ " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforQualifiedBidderReport_PE8() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(
				folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE8 + " " + date1 + ".xlsx");
		System.out.println("filepath:=" + folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE8
				+ " " + date1 + ".xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforQualifiedBidderReport_PE9() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(
				folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE9 + " " + date1 + ".xlsx");
		System.out.println("filepath:=" + folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE9
				+ " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforQualifiedBidderReport_PE10() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(
				folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE10 + " " + date1 + ".xlsx");
		System.out.println("filepath:=" + folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE10
				+ " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforQualifiedBidderReport_PE4() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(
				folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE4 + " " + date1 + ".xlsx");
		System.out.println("filepath:=" + folderPath + File.separator + "Qualified Bidders Report - " + eventNameEng
				+ " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fetchExcelDataforQualifiedBidderReport_PE1() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(
				folderPath + File.separator + "Qualified Bidders Report - " + eventName_PE1 + " " + date1 + ".xlsx");
		System.out.println("filepath:=" + folderPath + File.separator + "Qualified Bidders Report - " + eventNameEng
				+ " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getStringData(String Sheetname, int row, int col) {
		return wb.getSheet(Sheetname).getRow(row).getCell(col).getStringCellValue();
	}

	public double getNumericData(String Sheetname, int row, int col) {
		return wb.getSheet(Sheetname).getRow(row).getCell(col).getNumericCellValue();
	}

	public void getQualifiedBidderData_PE1() throws InterruptedException {

		// Registry General Acc No
		String colomn1name = getStringData("Qualified Bidders Report", 5, 0);
		String regGenAccNo1 = getStringData("Qualified Bidders Report", 6, 0);
		String regGenAccNo2 = getStringData("Qualified Bidders Report", 7, 0);
		String regGenAccNo3 = getStringData("Qualified Bidders Report", 8, 0);
		String regGenAccNo4 = getStringData("Qualified Bidders Report", 9, 0);
		String regGenAccNo5 = getStringData("Qualified Bidders Report", 10, 0);
		String regGenAccNo6 = getStringData("Qualified Bidders Report", 11, 0);
		String regGenAccNo7 = getStringData("Qualified Bidders Report", 12, 0);

		// Entity legal name
		String colomn2name = getStringData("Qualified Bidders Report", 5, 1);
		String entityLegalName1 = getStringData("Qualified Bidders Report", 6, 1);
		String entityLegalName2 = getStringData("Qualified Bidders Report", 7, 1);
		String entityLegalName3 = getStringData("Qualified Bidders Report", 8, 1);
		String entityLegalName4 = getStringData("Qualified Bidders Report", 9, 1);
		String entityLegalName5 = getStringData("Qualified Bidders Report", 10, 1);
		String entityLegalName6 = getStringData("Qualified Bidders Report", 11, 1);
		String entityLegalName7 = getStringData("Qualified Bidders Report", 12, 1);

		// Entity Operating Name
		String colomn3name = getStringData("Qualified Bidders Report", 5, 2);
		String entityOperatingName1 = getStringData("Qualified Bidders Report", 6, 2);
		String entityOperatingName2 = getStringData("Qualified Bidders Report", 7, 2);
		String entityOperatingName3 = getStringData("Qualified Bidders Report", 8, 2);
		String entityOperatingName4 = getStringData("Qualified Bidders Report", 9, 2);
		String entityOperatingName5 = getStringData("Qualified Bidders Report", 10, 2);
		String entityOperatingName6 = getStringData("Qualified Bidders Report", 11, 2);
		String entityOperatingName7 = getStringData("Qualified Bidders Report", 12, 2);

		// Entity type
		String colomn4name = getStringData("Qualified Bidders Report", 5, 3);
		String entityType1 = getStringData("Qualified Bidders Report", 6, 3);
		String entityType2 = getStringData("Qualified Bidders Report", 7, 3);
		String entityType3 = getStringData("Qualified Bidders Report", 8, 3);
		String entityType4 = getStringData("Qualified Bidders Report", 9, 3);
		String entityType5 = getStringData("Qualified Bidders Report", 10, 3);
		String entityType6 = getStringData("Qualified Bidders Report", 11, 3);
		String entityType7 = getStringData("Qualified Bidders Report", 12, 3);

		// Entity Jurisdiction
		String colomn5name = getStringData("Qualified Bidders Report", 5, 4);
		String entJurisdiction1 = getStringData("Qualified Bidders Report", 6, 4);
		String entJurisdiction2 = getStringData("Qualified Bidders Report", 7, 4);
		String entJurisdiction3 = getStringData("Qualified Bidders Report", 8, 4);
		String entJurisdiction4 = getStringData("Qualified Bidders Report", 9, 4);
		String entJurisdiction5 = getStringData("Qualified Bidders Report", 10, 4);
		String entJurisdiction6 = getStringData("Qualified Bidders Report", 11, 4);
		String entJurisdiction7 = getStringData("Qualified Bidders Report", 12, 4);

		// FSA Acc No
		String colomn6name = getStringData("Qualified Bidders Report", 5, 5);
		String fsaAccNum1 = getStringData("Qualified Bidders Report", 6, 5);
		String fsaAccNum2 = getStringData("Qualified Bidders Report", 7, 5);
		String fsaAccNum3 = getStringData("Qualified Bidders Report", 8, 5);
		String fsaAccNum4 = getStringData("Qualified Bidders Report", 9, 5);
		String fsaAccNum5 = getStringData("Qualified Bidders Report", 10, 5);
		String fsaAccNum6 = getStringData("Qualified Bidders Report", 11, 5);
		String fsaAccNum7 = getStringData("Qualified Bidders Report", 12, 5);

		// Bid Guarantee Currency
		String colomn7name = getStringData("Qualified Bidders Report", 5, 5);
		String bidGuaranteeCurrency1 = getStringData("Qualified Bidders Report", 6, 6);
		String bidGuaranteeCurrency2 = getStringData("Qualified Bidders Report", 7, 6);
		String bidGuaranteeCurrency3 = getStringData("Qualified Bidders Report", 8, 6);
		String bidGuaranteeCurrency4 = getStringData("Qualified Bidders Report", 9, 6);
		String bidGuaranteeCurrency5 = getStringData("Qualified Bidders Report", 10, 6);
		String bidGuaranteeCurrency6 = getStringData("Qualified Bidders Report", 11, 6);
		String bidGuaranteeCurrency7 = getStringData("Qualified Bidders Report", 12, 6);

		// Total bid Guarantee value
		String colomn11name = getStringData("Qualified Bidders Report", 5, 11);
		double totalbidGuaranteeCurrency1 = getNumericData("Qualified Bidders Report", 6, 11);
		double totalbidGuaranteeCurrency2 = getNumericData("Qualified Bidders Report", 7, 11);
		double totalbidGuaranteeCurrency3 = getNumericData("Qualified Bidders Report", 8, 11);
		double totalbidGuaranteeCurrency4 = getNumericData("Qualified Bidders Report", 9, 11);
		double totalbidGuaranteeCurrency5 = getNumericData("Qualified Bidders Report", 10, 11);
		double totalbidGuaranteeCurrency6 = getNumericData("Qualified Bidders Report", 11, 11);
		double totalbidGuaranteeCurrency7 = getNumericData("Qualified Bidders Report", 12, 11);

		// Purchase limit for current auction
		String colomn12name = getStringData("Qualified Bidders Report", 5, 12);
		double purchaselimit1 = getNumericData("Qualified Bidders Report", 6, 12);
		double purchaselimit2 = getNumericData("Qualified Bidders Report", 7, 12);
		double purchaselimit3 = getNumericData("Qualified Bidders Report", 8, 12);
		double purchaselimit4 = getNumericData("Qualified Bidders Report", 9, 12);
		double purchaselimit5 = getNumericData("Qualified Bidders Report", 10, 12);
		double purchaselimit6 = getNumericData("Qualified Bidders Report", 11, 12);
		double purchaselimit7 = getNumericData("Qualified Bidders Report", 12, 12);

		// Holding limit for current auction
		String colomn14name = getStringData("Qualified Bidders Report", 5, 14);
		double holdingLimit1 = getNumericData("Qualified Bidders Report", 6, 14);
		double holdingLimit2 = getNumericData("Qualified Bidders Report", 7, 14);
		double holdingLimit3 = getNumericData("Qualified Bidders Report", 8, 14);
		double holdingLimit4 = getNumericData("Qualified Bidders Report", 9, 14);
		double holdingLimit5 = getNumericData("Qualified Bidders Report", 10, 14);
		double holdingLimit6 = getNumericData("Qualified Bidders Report", 11, 14);
		double holdingLimit7 = getNumericData("Qualified Bidders Report", 12, 14);
		double value1 = holdingLimit1;
		DecimalFormat formatter1 = new DecimalFormat("#,###");
		String formattedValue1 = formatter1.format(value1);
		double value2 = holdingLimit2;
		DecimalFormat formatter2 = new DecimalFormat("#,###");
		String formattedValue2 = formatter2.format(value2);
		double value3 = holdingLimit3;
		DecimalFormat formatter3 = new DecimalFormat("#,###");
		String formattedValue3 = formatter3.format(value3);
		double value4 = holdingLimit4;
		DecimalFormat formatter4 = new DecimalFormat("#,###");
		String formattedValue4 = formatter4.format(value4);
		double value5 = holdingLimit5;
		DecimalFormat formatter5 = new DecimalFormat("#,###");
		String formattedValue5 = formatter5.format(value5);
		double value6 = holdingLimit6;
		String formattedValue6 = formatter4.format(value6);
		double value7 = holdingLimit7;
		String formattedValue7 = formatter4.format(value7);
		System.out.println(colomn1name + " : " + regGenAccNo1 + ",  " + colomn2name + " : " + entityLegalName1 + ",  "
				+ colomn3name + " : " + entityOperatingName1 + ",  " + colomn4name + " : " + entityType1 + ",  "
				+ colomn5name + " : " + entJurisdiction1 + ",  " + colomn6name + " : " + fsaAccNum1 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency1 + ",  " + colomn11name + " : "
				+ totalbidGuaranteeCurrency1 + ",  " + colomn12name + " : " + purchaselimit1 + ",  " + colomn14name
				+ " : " + formattedValue1);

		ObjectRepo.test.log(Status.PASS,
				colomn1name + " : " + regGenAccNo1 + ",  " + colomn2name + " : " + entityLegalName1 + ",  "
						+ colomn3name + " : " + entityOperatingName1 + ",  " + colomn4name + " : " + entityType1 + ",  "
						+ colomn5name + " : " + entJurisdiction1 + ",  " + colomn6name + " : " + fsaAccNum1 + ",  "
						+ colomn7name + " : " + bidGuaranteeCurrency1 + ",  " + colomn11name + " : "
						+ totalbidGuaranteeCurrency1 + ",  " + colomn12name + " : " + purchaselimit1 + ",  "
						+ colomn14name + " : " + formattedValue1);

		System.out.println(colomn1name + " : " + regGenAccNo2 + ",  " + colomn2name + " : " + entityLegalName2 + ",  "
				+ colomn3name + " : " + entityOperatingName2 + ",  " + colomn4name + " : " + entityType2 + ",  "
				+ colomn5name + " : " + entJurisdiction2 + ",  " + colomn6name + " : " + fsaAccNum2 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency2 + ",  " + colomn11name + " : "
				+ totalbidGuaranteeCurrency2 + ",  " + colomn12name + " : " + purchaselimit2 + ",  " + colomn14name
				+ " : " + formattedValue2);

		ObjectRepo.test.log(Status.PASS,
				colomn1name + " : " + regGenAccNo2 + ",  " + colomn2name + " : " + entityLegalName2 + ",  "
						+ colomn3name + " : " + entityOperatingName2 + ",  " + colomn4name + " : " + entityType2 + ",  "
						+ colomn5name + " : " + entJurisdiction2 + ",  " + colomn6name + " : " + fsaAccNum2 + ",  "
						+ colomn7name + " : " + bidGuaranteeCurrency2 + ",  " + colomn11name + " : "
						+ totalbidGuaranteeCurrency2 + ",  " + colomn12name + " : " + purchaselimit2 + ",  "
						+ colomn14name + " : " + formattedValue2);

		System.out.println(colomn1name + " : " + regGenAccNo3 + ",  " + colomn2name + " : " + entityLegalName3 + ",  "
				+ colomn3name + " : " + entityOperatingName3 + ",  " + colomn4name + " : " + entityType3 + ",  "
				+ colomn5name + " : " + entJurisdiction3 + ",  " + colomn6name + " : " + fsaAccNum3 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency3 + ",  " + colomn11name + " : "
				+ totalbidGuaranteeCurrency3 + ",  " + colomn12name + " : " + purchaselimit3 + ",  " + colomn14name
				+ " : " + formattedValue3);

		ObjectRepo.test.log(Status.PASS,
				colomn1name + " : " + regGenAccNo3 + ",  " + colomn2name + " : " + entityLegalName3 + ",  "
						+ colomn3name + " : " + entityOperatingName3 + ",  " + colomn4name + " : " + entityType3 + ",  "
						+ colomn5name + " : " + entJurisdiction3 + ",  " + colomn6name + " : " + fsaAccNum3 + ",  "
						+ colomn7name + " : " + bidGuaranteeCurrency3 + ",  " + colomn11name + " : "
						+ totalbidGuaranteeCurrency3 + ",  " + colomn12name + " : " + purchaselimit3 + ",  "
						+ colomn14name + " : " + formattedValue3);

		System.out.println(colomn1name + " : " + regGenAccNo4 + ",  " + colomn2name + " : " + entityLegalName4 + ",  "
				+ colomn3name + " : " + entityOperatingName4 + ",  " + colomn4name + " : " + entityType4 + ",  "
				+ colomn5name + " : " + entJurisdiction4 + ",  " + colomn6name + " : " + fsaAccNum4 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency4 + ",  " + colomn11name + " : "
				+ totalbidGuaranteeCurrency4 + ",  " + colomn12name + " : " + purchaselimit4 + ",  " + colomn14name
				+ " : " + formattedValue4);

		ObjectRepo.test.log(Status.PASS,
				colomn1name + " : " + regGenAccNo4 + ",  " + colomn2name + " : " + entityLegalName4 + ",  "
						+ colomn3name + " : " + entityOperatingName4 + ",  " + colomn4name + " : " + entityType4 + ",  "
						+ colomn5name + " : " + entJurisdiction4 + ",  " + colomn6name + " : " + fsaAccNum4 + ",  "
						+ colomn7name + " : " + bidGuaranteeCurrency4 + ",  " + colomn11name + " : "
						+ totalbidGuaranteeCurrency4 + ",  " + colomn12name + " : " + purchaselimit4 + ",  "
						+ colomn14name + " : " + formattedValue4);

		System.out.println(colomn1name + " : " + regGenAccNo5 + ",  " + colomn2name + " : " + entityLegalName5 + ",  "
				+ colomn3name + " : " + entityOperatingName5 + ",  " + colomn4name + " : " + entityType5 + ",  "
				+ colomn5name + " : " + entJurisdiction5 + ",  " + colomn6name + " : " + fsaAccNum5 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency5 + ",  " + colomn11name + " : "
				+ totalbidGuaranteeCurrency5 + ",  " + colomn12name + " : " + purchaselimit5 + ",  " + colomn14name
				+ " : " + formattedValue5);

		ObjectRepo.test.log(Status.PASS,
				colomn1name + " : " + regGenAccNo5 + ",  " + colomn2name + " : " + entityLegalName5 + ",  "
						+ colomn3name + " : " + entityOperatingName5 + ",  " + colomn4name + " : " + entityType5 + ",  "
						+ colomn5name + " : " + entJurisdiction5 + ",  " + colomn6name + " : " + fsaAccNum5 + ",  "
						+ colomn7name + " : " + bidGuaranteeCurrency5 + ",  " + colomn11name + " : "
						+ totalbidGuaranteeCurrency5 + ",  " + colomn12name + " : " + purchaselimit5 + ",  "
						+ colomn14name + " : " + formattedValue5);
		System.out.println(colomn1name + " : " + regGenAccNo6 + ",  " + colomn2name + " : " + entityLegalName6 + ",  "
				+ colomn3name + " : " + entityOperatingName6 + ",  " + colomn4name + " : " + entityType6 + ",  "
				+ colomn5name + " : " + entJurisdiction6 + ",  " + colomn6name + " : " + fsaAccNum6 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency6 + ",  " + colomn11name + " : "
				+ totalbidGuaranteeCurrency6 + ",  " + colomn12name + " : " + purchaselimit6 + ",  " + colomn14name
				+ " : " + formattedValue6);

		ObjectRepo.test.log(Status.PASS,
				colomn1name + " : " + regGenAccNo6 + ",  " + colomn2name + " : " + entityLegalName6 + ",  "
						+ colomn3name + " : " + entityOperatingName6 + ",  " + colomn4name + " : " + entityType6 + ",  "
						+ colomn5name + " : " + entJurisdiction6 + ",  " + colomn6name + " : " + fsaAccNum6 + ",  "
						+ colomn7name + " : " + bidGuaranteeCurrency6 + ",  " + colomn11name + " : "
						+ totalbidGuaranteeCurrency6 + ",  " + colomn12name + " : " + purchaselimit6 + ",  "
						+ colomn14name + " : " + formattedValue6);
		System.out.println(colomn1name + " : " + regGenAccNo7 + ",  " + colomn2name + " : " + entityLegalName7 + ",  "
				+ colomn3name + " : " + entityOperatingName7 + ",  " + colomn4name + " : " + entityType7 + ",  "
				+ colomn5name + " : " + entJurisdiction7 + ",  " + colomn6name + " : " + fsaAccNum7 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency7 + ",  " + colomn11name + " : "
				+ totalbidGuaranteeCurrency7 + ",  " + colomn12name + " : " + purchaselimit7 + ",  " + colomn14name
				+ " : " + formattedValue7);

		ObjectRepo.test.log(Status.PASS,
				colomn1name + " : " + regGenAccNo7 + ",  " + colomn2name + " : " + entityLegalName7 + ",  "
						+ colomn3name + " : " + entityOperatingName7 + ",  " + colomn4name + " : " + entityType7 + ",  "
						+ colomn5name + " : " + entJurisdiction7 + ",  " + colomn6name + " : " + fsaAccNum7 + ",  "
						+ colomn7name + " : " + bidGuaranteeCurrency7 + ",  " + colomn11name + " : "
						+ totalbidGuaranteeCurrency7 + ",  " + colomn12name + " : " + purchaselimit7 + ",  "
						+ colomn14name + " : " + formattedValue7);

	}

	public void getQualifiedBidderData() throws InterruptedException {

		// Registry General Acc No
		String colomn1name = getStringData("Qualified Bidders Report", 5, 0);
		String regGenAccNo1 = getStringData("Qualified Bidders Report", 6, 0);
		String regGenAccNo2 = getStringData("Qualified Bidders Report", 7, 0);
		String regGenAccNo3 = getStringData("Qualified Bidders Report", 8, 0);
		String regGenAccNo4 = getStringData("Qualified Bidders Report", 9, 0);
		String regGenAccNo5 = getStringData("Qualified Bidders Report", 10, 0);

		// Entity legal name
		String colomn2name = getStringData("Qualified Bidders Report", 5, 1);
		String entityLegalName1 = getStringData("Qualified Bidders Report", 6, 1);
		String entityLegalName2 = getStringData("Qualified Bidders Report", 7, 1);
		String entityLegalName3 = getStringData("Qualified Bidders Report", 8, 1);
		String entityLegalName4 = getStringData("Qualified Bidders Report", 9, 1);
		String entityLegalName5 = getStringData("Qualified Bidders Report", 10, 1);

		// Entity Operating Name
		String colomn3name = getStringData("Qualified Bidders Report", 5, 2);
		String entityOperatingName1 = getStringData("Qualified Bidders Report", 6, 2);
		String entityOperatingName2 = getStringData("Qualified Bidders Report", 7, 2);
		String entityOperatingName3 = getStringData("Qualified Bidders Report", 8, 2);
		String entityOperatingName4 = getStringData("Qualified Bidders Report", 9, 2);
		String entityOperatingName5 = getStringData("Qualified Bidders Report", 10, 2);

		// Entity type
		String colomn4name = getStringData("Qualified Bidders Report", 5, 3);
		String entityType1 = getStringData("Qualified Bidders Report", 6, 3);
		String entityType2 = getStringData("Qualified Bidders Report", 7, 3);
		String entityType3 = getStringData("Qualified Bidders Report", 8, 3);
		String entityType4 = getStringData("Qualified Bidders Report", 9, 3);
		String entityType5 = getStringData("Qualified Bidders Report", 10, 3);

		// Entity Jurisdiction
		String colomn5name = getStringData("Qualified Bidders Report", 5, 4);
		String entJurisdiction1 = getStringData("Qualified Bidders Report", 6, 4);
		String entJurisdiction2 = getStringData("Qualified Bidders Report", 7, 4);
		String entJurisdiction3 = getStringData("Qualified Bidders Report", 8, 4);
		String entJurisdiction4 = getStringData("Qualified Bidders Report", 9, 4);
		String entJurisdiction5 = getStringData("Qualified Bidders Report", 10, 4);

		// FSA Acc No
		String colomn6name = getStringData("Qualified Bidders Report", 5, 5);
		String fsaAccNum1 = getStringData("Qualified Bidders Report", 6, 5);
		String fsaAccNum2 = getStringData("Qualified Bidders Report", 7, 5);
		String fsaAccNum3 = getStringData("Qualified Bidders Report", 8, 5);
		String fsaAccNum4 = getStringData("Qualified Bidders Report", 9, 5);
		String fsaAccNum5 = getStringData("Qualified Bidders Report", 10, 5);

		// Bid Guarantee Currency
		String colomn7name = getStringData("Qualified Bidders Report", 5, 5);
		String bidGuaranteeCurrency1 = getStringData("Qualified Bidders Report", 6, 6);
		String bidGuaranteeCurrency2 = getStringData("Qualified Bidders Report", 7, 6);
		String bidGuaranteeCurrency3 = getStringData("Qualified Bidders Report", 8, 6);
		String bidGuaranteeCurrency4 = getStringData("Qualified Bidders Report", 9, 6);
		String bidGuaranteeCurrency5 = getStringData("Qualified Bidders Report", 10, 6);

		// Total bid Guarantee value
		String colomn11name = getStringData("Qualified Bidders Report", 5, 11);
		double totalbidGuaranteeCurrency1 = getNumericData("Qualified Bidders Report", 6, 11);
		double totalbidGuaranteeCurrency2 = getNumericData("Qualified Bidders Report", 7, 11);
		double totalbidGuaranteeCurrency3 = getNumericData("Qualified Bidders Report", 8, 11);
		double totalbidGuaranteeCurrency4 = getNumericData("Qualified Bidders Report", 9, 11);
		double value1 = totalbidGuaranteeCurrency1;
		DecimalFormat formatter = new DecimalFormat("#,###");
		String formattedValue1 = formatter.format(value1);
		double value2 = totalbidGuaranteeCurrency2;
		String formattedValue2 = formatter.format(value2);
		double value3 = totalbidGuaranteeCurrency3;
		String formattedValue3 = formatter.format(value3);
		double value4 = totalbidGuaranteeCurrency4;
		String formattedValue4 = formatter.format(value4);
		double value5 = totalbidGuaranteeCurrency4;
		String formattedValue5 = formatter.format(value5);
		// Purchase limit for current auction
		String colomn12name = getStringData("Qualified Bidders Report", 5, 12);
		double purchaselimit1 = getNumericData("Qualified Bidders Report", 6, 12);
		double purchaselimit2 = getNumericData("Qualified Bidders Report", 7, 12);
		double purchaselimit3 = getNumericData("Qualified Bidders Report", 8, 12);
		double purchaselimit4 = getNumericData("Qualified Bidders Report", 9, 12);
		double purchaselimit5 = getNumericData("Qualified Bidders Report", 10, 12);
		double value6 = purchaselimit1;
		DecimalFormat formatter1 = new DecimalFormat("#,###");
		String formattedValue6 = formatter1.format(value6);
		double value7 = purchaselimit2;
		String formattedValue7 = formatter1.format(value7);
		double value8 = purchaselimit3;
		String formattedValue8 = formatter1.format(value8);
		double value9 = purchaselimit4;
		String formattedValue9 = formatter1.format(value9);
		double value10 = purchaselimit5;
		String formattedValue10 = formatter1.format(value10);
		// Holding limit for current auction
		String colomn14name = getStringData("Qualified Bidders Report", 5, 14);
		double holdingLimit1 = getNumericData("Qualified Bidders Report", 6, 14);
		double holdingLimit2 = getNumericData("Qualified Bidders Report", 7, 14);
		double holdingLimit3 = getNumericData("Qualified Bidders Report", 8, 14);
		double holdingLimit4 = getNumericData("Qualified Bidders Report", 9, 14);
		double holdingLimit5 = getNumericData("Qualified Bidders Report", 10, 14);
		double value11 = holdingLimit1;
//		DecimalFormat formatter1 = new DecimalFormat("#,###");
		String formattedValue11 = formatter1.format(value11);
		double value12 = holdingLimit2;
		String formattedValue12 = formatter1.format(value12);
		double value13 = holdingLimit3;
		String formattedValue13 = formatter1.format(value13);
		double value14 = holdingLimit4;
		String formattedValue14 = formatter1.format(value14);
		double value15 = holdingLimit5;
		String formattedValue15 = formatter1.format(value15);
		System.out.println(colomn1name + " : " + regGenAccNo1 + ",  " + colomn2name + " : " + entityLegalName1 + ",  "
				+ colomn3name + " : " + entityOperatingName1 + ",  " + colomn4name + " : " + entityType1 + ",  "
				+ colomn5name + " : " + entJurisdiction1 + ",  " + colomn6name + " : " + fsaAccNum1 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency1 + ",  " + colomn11name + " : " + formattedValue1 + ",  "
				+ colomn12name + " : " + formattedValue6 + ",  " + colomn14name + " : " + formattedValue11);

		ObjectRepo.test.log(Status.PASS,
				colomn1name + " : " + regGenAccNo1 + ",  " + colomn2name + " : " + entityLegalName1 + ",  "
						+ colomn3name + " : " + entityOperatingName1 + ",  " + colomn4name + " : " + entityType1 + ",  "
						+ colomn5name + " : " + entJurisdiction1 + ",  " + colomn6name + " : " + fsaAccNum1 + ",  "
						+ colomn7name + " : " + bidGuaranteeCurrency1 + ",  " + colomn11name + " : " + formattedValue1
						+ ",  " + colomn12name + " : " + formattedValue6 + ",  " + colomn14name + " : "
						+ formattedValue11);

		System.out.println(colomn1name + " : " + regGenAccNo2 + ",  " + colomn2name + " : " + entityLegalName2 + ",  "
				+ colomn3name + " : " + entityOperatingName2 + ",  " + colomn4name + " : " + entityType2 + ",  "
				+ colomn5name + " : " + entJurisdiction2 + ",  " + colomn6name + " : " + fsaAccNum2 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency2 + ",  " + colomn11name + " : " + formattedValue2 + ",  "
				+ colomn12name + " : " + formattedValue7 + ",  " + colomn14name + " : " + formattedValue12);

		ObjectRepo.test.log(Status.PASS,
				colomn1name + " : " + regGenAccNo2 + ",  " + colomn2name + " : " + entityLegalName2 + ",  "
						+ colomn3name + " : " + entityOperatingName2 + ",  " + colomn4name + " : " + entityType2 + ",  "
						+ colomn5name + " : " + entJurisdiction2 + ",  " + colomn6name + " : " + fsaAccNum2 + ",  "
						+ colomn7name + " : " + bidGuaranteeCurrency2 + ",  " + colomn11name + " : " + formattedValue2
						+ ",  " + colomn12name + " : " + formattedValue7 + ",  " + colomn14name + " : "
						+ formattedValue12);

		System.out.println(colomn1name + " : " + regGenAccNo3 + ",  " + colomn2name + " : " + entityLegalName3 + ",  "
				+ colomn3name + " : " + entityOperatingName3 + ",  " + colomn4name + " : " + entityType3 + ",  "
				+ colomn5name + " : " + entJurisdiction3 + ",  " + colomn6name + " : " + fsaAccNum3 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency3 + ",  " + colomn11name + " : " + formattedValue3 + ",  "
				+ colomn12name + " : " + formattedValue8 + ",  " + colomn14name + " : " + formattedValue13);

		ObjectRepo.test.log(Status.PASS,
				colomn1name + " : " + regGenAccNo3 + ",  " + colomn2name + " : " + entityLegalName3 + ",  "
						+ colomn3name + " : " + entityOperatingName3 + ",  " + colomn4name + " : " + entityType3 + ",  "
						+ colomn5name + " : " + entJurisdiction3 + ",  " + colomn6name + " : " + fsaAccNum3 + ",  "
						+ colomn7name + " : " + bidGuaranteeCurrency3 + ",  " + colomn11name + " : " + formattedValue3
						+ ",  " + colomn12name + " : " + formattedValue8 + ",  " + colomn14name + " : "
						+ formattedValue13);

		System.out.println(colomn1name + " : " + regGenAccNo4 + ",  " + colomn2name + " : " + entityLegalName4 + ",  "
				+ colomn3name + " : " + entityOperatingName4 + ",  " + colomn4name + " : " + entityType4 + ",  "
				+ colomn5name + " : " + entJurisdiction4 + ",  " + colomn6name + " : " + fsaAccNum4 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency4 + ",  " + colomn11name + " : " + formattedValue4 + ",  "
				+ colomn12name + " : " + formattedValue9 + ",  " + colomn14name + " : " + formattedValue14);

		ObjectRepo.test.log(Status.PASS,
				colomn1name + " : " + regGenAccNo4 + ",  " + colomn2name + " : " + entityLegalName4 + ",  "
						+ colomn3name + " : " + entityOperatingName4 + ",  " + colomn4name + " : " + entityType4 + ",  "
						+ colomn5name + " : " + entJurisdiction4 + ",  " + colomn6name + " : " + fsaAccNum4 + ",  "
						+ colomn7name + " : " + bidGuaranteeCurrency4 + ",  " + colomn11name + " : " + formattedValue4
						+ ",  " + colomn12name + " : " + formattedValue9 + ",  " + colomn14name + " : "
						+ formattedValue14);

		System.out.println(colomn1name + " : " + regGenAccNo5 + ",  " + colomn2name + " : " + entityLegalName5 + ",  "
				+ colomn3name + " : " + entityOperatingName5 + ",  " + colomn4name + " : " + entityType5 + ",  "
				+ colomn5name + " : " + entJurisdiction5 + ",  " + colomn6name + " : " + fsaAccNum5 + ",  "
				+ colomn7name + " : " + bidGuaranteeCurrency5 + ",  " + colomn11name + " : " + formattedValue5 + ",  "
				+ colomn12name + " : " + formattedValue10 + ",  " + colomn14name + " : " + formattedValue15);

		ObjectRepo.test.log(Status.PASS,
				colomn1name + " : " + regGenAccNo5 + ",  " + colomn2name + " : " + entityLegalName5 + ",  "
						+ colomn3name + " : " + entityOperatingName5 + ",  " + colomn4name + " : " + entityType5 + ",  "
						+ colomn5name + " : " + entJurisdiction5 + ",  " + colomn6name + " : " + fsaAccNum5 + ",  "
						+ colomn7name + " : " + bidGuaranteeCurrency5 + ",  " + colomn11name + " : " + formattedValue5
						+ ",  " + colomn12name + " : " + formattedValue10 + ",  " + colomn14name + " : "
						+ formattedValue15);

	}

	public void validateResultReport() throws Exception {
		// Data from result report

		String legalName1 = getStringDataRR("FINAL RESULTS", 1, 1);
		String legalName2 = getStringDataRR("FINAL RESULTS", 2, 1);
		String legalName3 = getStringDataRR("FINAL RESULTS", 3, 1);
		String legalName4 = getStringDataRR("FINAL RESULTS", 4, 1);
		String legalName5 = getStringDataRR("FINAL RESULTS", 5, 1);

		double num1 = getNumericDataRR("FINAL RESULTS", 1, 2);
		double num2 = getNumericDataRR("FINAL RESULTS", 2, 2);
		double num3 = getNumericDataRR("FINAL RESULTS", 3, 2);
		double num4 = getNumericDataRR("FINAL RESULTS", 4, 2);
		double num5 = getNumericDataRR("FINAL RESULTS", 5, 2);

		double value1 = num1;
		DecimalFormat formatter1 = new DecimalFormat("#,###");
		String formattedValue1 = formatter1.format(value1);
		double value2 = num2;
		DecimalFormat formatter2 = new DecimalFormat("#,###");
		String formattedValue2 = formatter2.format(value2);
		double value3 = num3;
		DecimalFormat formatter3 = new DecimalFormat("#,###");
		String formattedValue3 = formatter3.format(value3);
		double value4 = num4;
		DecimalFormat formatter4 = new DecimalFormat("#,###");
		String formattedValue4 = formatter4.format(value4);
		double value5 = num5;
		DecimalFormat formatter5 = new DecimalFormat("#,###");
		String formattedValue5 = formatter5.format(value5);

		ObjectRepo.test.log(Status.PASS, "Results validated from Result report ");

		ObjectRepo.test.log(Status.PASS,
				"Entity: " + legalName1 + " Granted With " + formattedValue1 + " Emission Units for Current Auction");
		ObjectRepo.test.log(Status.PASS,
				"Entity: " + legalName2 + " Granted With " + formattedValue2 + " Emission Units for Current Auction");
		ObjectRepo.test.log(Status.PASS,
				"Entity: " + legalName3 + " Granted With " + formattedValue3 + " Emission Units for Current Auction");
		ObjectRepo.test.log(Status.PASS,
				"Entity: " + legalName4 + " Granted With " + formattedValue4 + " Emission Units for Current Auction");
		ObjectRepo.test.log(Status.PASS,
				"Entity: " + legalName5 + " Granted With " + formattedValue5 + " Emission Units for Current Auction");
	}

	public void validateResultReport_PE1() throws Exception {

		// Data from result report

		String legalName1 = getStringDataRR("FINAL RESULTS", 1, 1);
		String legalName2 = getStringDataRR("FINAL RESULTS", 2, 1);
		String legalName3 = getStringDataRR("FINAL RESULTS", 3, 1);
		String legalName4 = getStringDataRR("FINAL RESULTS", 4, 1);
		String legalName5 = getStringDataRR("FINAL RESULTS", 5, 1);
		String legalName6 = getStringDataRR("FINAL RESULTS", 6, 1);
		String legalName7 = getStringDataRR("FINAL RESULTS", 7, 1);

		double num1 = getNumericDataRR("FINAL RESULTS", 1, 2);
		double num2 = getNumericDataRR("FINAL RESULTS", 2, 2);
		double num3 = getNumericDataRR("FINAL RESULTS", 3, 2);
		double num4 = getNumericDataRR("FINAL RESULTS", 4, 2);
		double num5 = getNumericDataRR("FINAL RESULTS", 5, 2);
		double num6 = getNumericDataRR("FINAL RESULTS", 6, 2);
		double value1 = num1;
		DecimalFormat formatter1 = new DecimalFormat("#,###");
		String formattedValue1 = formatter1.format(value1);

		double value2 = num2;
		DecimalFormat formatter2 = new DecimalFormat("#,###");
		String formattedValue2 = formatter2.format(value2);
		double value3 = num3;
		DecimalFormat formatter3 = new DecimalFormat("#,###");
		String formattedValue3 = formatter3.format(value3);
		double value4 = num4;
		DecimalFormat formatter4 = new DecimalFormat("#,###");
		String formattedValue4 = formatter4.format(value4);
		double value5 = num5;
		DecimalFormat formatter5 = new DecimalFormat("#,###");
		String formattedValue5 = formatter5.format(value5);
		double value6 = num6;
		String formattedValue6 = formatter1.format(value6);
		double value7 = num2;
		String formattedValue7 = formatter1.format(value7);
		double num1_advance = getNumericDataRR("FINAL RESULTS", 1, 3);
		double num2_advance = getNumericDataRR("FINAL RESULTS", 2, 3);
		double num3_advance = getNumericDataRR("FINAL RESULTS", 3, 3);
		double num4_advance = getNumericDataRR("FINAL RESULTS", 4, 3);
		double value_Advance_1 = num1_advance;
		DecimalFormat formatter_advance1 = new DecimalFormat("#,###");
		String formattedValue_advnace1 = formatter_advance1.format(value_Advance_1);

		double value_Advance_2 = num2_advance;
		DecimalFormat formatter_advance2 = new DecimalFormat("#,###");
		String formattedValue_advnace2 = formatter_advance2.format(value_Advance_2);
		double value_Advance_3 = num3_advance;
		DecimalFormat formatter_advance3 = new DecimalFormat("#,###");
		String formattedValue_advnace3 = formatter_advance3.format(value_Advance_3);
		double value_Advance_4 = num4_advance;
		DecimalFormat formatter_advance4 = new DecimalFormat("#,###");
		String formattedValue_advnace4 = formatter_advance4.format(value_Advance_4);
		double value_Advance_5 = num1_advance;
		DecimalFormat formatter_advance5 = new DecimalFormat("#,###");
		String formattedValue_advnace5 = formatter_advance5.format(value_Advance_5);
		double value_Advance_6 = num1_advance;
		DecimalFormat formatter_advance6 = new DecimalFormat("#,###");
		String formattedValue_advnace6 = formatter_advance6.format(value_Advance_6);
		double value_Advance_7 = num1_advance;
		DecimalFormat formatter_advance7 = new DecimalFormat("#,###");
		String formattedValue_advnace7 = formatter_advance7.format(value_Advance_7);

		ObjectRepo.test.log(Status.PASS, "Results validated from Result report ");

		ObjectRepo.test.log(Status.PASS, "Entity: " + legalName1 + " Granted With " + formattedValue1
				+ " Emission Units for Current Auction Allowance");
		ObjectRepo.test.log(Status.PASS, "Entity: " + legalName2 + " Granted With " + formattedValue2
				+ " Emission Units for Current Auction Allowance");
		ObjectRepo.test.log(Status.PASS, "Entity: " + legalName3 + " Granted With " + formattedValue3
				+ " Emission Units for Current Auction Allowance");
		ObjectRepo.test.log(Status.PASS, "Entity: " + legalName4 + " Granted With " + formattedValue4
				+ " Emission Units for Current Auction Allowance");
		ObjectRepo.test.log(Status.PASS, "Entity: " + legalName5 + " Granted With " + formattedValue5
				+ " Emission Units for Current Auction Allowance");
		ObjectRepo.test.log(Status.PASS, "Entity: " + legalName6 + " Granted With " + formattedValue6
				+ " Emission Units for Current Auction Allowance");
		ObjectRepo.test.log(Status.PASS, "Entity: " + legalName7 + " Granted With " + formattedValue7
				+ " Emission Units for Current Auction Allowance");

		ObjectRepo.test.log(Status.PASS, "Entity: " + legalName1 + " Granted With " + formattedValue_advnace1
				+ " Emission Units for Advance Auction Allowance");
		ObjectRepo.test.log(Status.PASS, "Entity: " + legalName2 + " Granted With " + formattedValue_advnace2
				+ " Emission Units for Advance Auction Allowance");
		ObjectRepo.test.log(Status.PASS, "Entity: " + legalName3 + " Granted With " + formattedValue_advnace3
				+ " Emission Units for Advance Auction Allowance");
		ObjectRepo.test.log(Status.PASS, "Entity: " + legalName4 + " Granted With " + formattedValue_advnace4
				+ " Emission Units for Advance Auction Allowance");
		ObjectRepo.test.log(Status.PASS, "Entity: " + legalName5 + " Granted With " + formattedValue_advnace5
				+ " Emission Units for Advance Auction Allowance");
		ObjectRepo.test.log(Status.PASS, "Entity: " + legalName6 + " Granted With " + formattedValue_advnace6
				+ " Emission Units for Advance Auction Allowance");
		ObjectRepo.test.log(Status.PASS, "Entity: " + legalName7 + " Granted With " + formattedValue_advnace7
				+ " Emission Units for Advance Auction Allowance");
	}

	public void eventCertification() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker login = new com_pomClassForJointAuctionTieBreaker();
		login.sponsorLoginCa2();
		System.out.println("Step1: Sponsor Login successfully");
		login.handleSecurityQue();
		login.clickOnnext();
		System.out.println("Step2: Security Question handled successfully");
		login.clickbtnAdmin();
		driver.get().findElement(By.xpath("(//*[text()='Auction Certification'])[1]")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='firstAuctionCertified']")).click();
		driver.get().findElement(By.xpath("(//*[text()='SUBMIT'])[1]")).click();
		login.Logout();
	}

	public void eventCertificationDualApproval() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker login = new com_pomClassForJointAuctionTieBreaker();
		login.sponsorLoginQc();
		System.out.println("Step1: Sponsor Login successfully");
		login.handleSecurityQue();
		login.clickOnnext();
		System.out.println("Step2: Security Question handled successfully");
		login.clickbtnAdmin();
		driver.get().findElement(By.xpath("(//*[text()='Auction Certification'])[1]")).click();
		driver.get().findElement(By.xpath("//*[@aria-label='secondAuctionCertified']")).click();
		driver.get().findElement(By.xpath("(//*[text()='SUBMIT'])[1]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[4]"))
				.click();
	}

	public void searchFinancialSettlementReportFunctionality() throws InterruptedException {
		try {
			btnReports.click();
			DownloadReports ref = new DownloadReports();
			ref.searchReportsByEventNameForJointAuction();
			driver.get()
					.findElement(By.xpath(
							"//*[@aria-label='Download Financial Settlement Report for event " + eventNameEng + "']"))
					.click();
		} catch (Exception e) {
			btnReports.click();
		}
	}

	public void getDataFromFSReport() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File src = new File(
				folderPath + File.separator + "Financial Settlement Report - " + eventNameEng + " " + date1 + ".xlsx");
		System.out.println(
				"path :" + folderPath + "Financial Settlement Report - " + eventNameEng + " " + date1 + ".xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getStringDataFS(String Sheetname, int row, int col) {
		return wb.getSheet(Sheetname).getRow(row).getCell(col).getStringCellValue();
	}

	public double getNumericDataFS(String Sheetname, int row, int col) {
		return wb.getSheet(Sheetname).getRow(row).getCell(col).getNumericCellValue();
	}

	public void getDataFromFinancialSettlementReport() throws Exception {

		String currentSettPriceUSD = getStringDataFS("Financial Settlement Report", 4, 0);
		String currentSettPriceCAD = getStringDataFS("Financial Settlement Report", 5, 0);
		String settlementpriceUSD = getStringDataFS("Financial Settlement Report", 4, 1);
		double settlementpriceCAD = getNumericDataFS("Financial Settlement Report", 5, 1);

		String Colomn1 = getStringDataFS("Financial Settlement Report", 7, 0);
		String regGenAccNo1 = getStringDataFS("Financial Settlement Report", 8, 0);
		String regGenAccNo2 = getStringDataFS("Financial Settlement Report", 9, 0);
		String regGenAccNo3 = getStringDataFS("Financial Settlement Report", 10, 0);
		String regGenAccNo4 = getStringDataFS("Financial Settlement Report", 11, 0);
		String regGenAccNo5 = getStringDataFS("Financial Settlement Report", 12, 0);

		String Colomn12 = getStringDataFS("Financial Settlement Report", 7, 11);
		double totalBidGuarantee1 = getNumericDataFS("Financial Settlement Report", 8, 11);
		double totalBidGuarantee2 = getNumericDataFS("Financial Settlement Report", 9, 11);
		double totalBidGuarantee3 = getNumericDataFS("Financial Settlement Report", 10, 11);
		double totalBidGuarantee4 = getNumericDataFS("Financial Settlement Report", 11, 11);
		double totalBidGuarantee5 = getNumericDataFS("Financial Settlement Report", 12, 11);

		String Colomn13 = getStringData("Financial Settlement Report", 7, 12);
		double currentSuccBidAllowances1 = getNumericDataFS("Financial Settlement Report", 8, 12);
		double currentSuccBidAllowances2 = getNumericDataFS("Financial Settlement Report", 9, 12);
		double currentSuccBidAllowances3 = getNumericDataFS("Financial Settlement Report", 10, 12);
		double currentSuccBidAllowances4 = getNumericDataFS("Financial Settlement Report", 11, 12);
		double currentSuccBidAllowances5 = getNumericDataFS("Financial Settlement Report", 12, 12);

		String Colomn15 = getStringData("Financial Settlement Report", 7, 14);
		double totalsuccessfullbidcost1 = getNumericDataFS("Financial Settlement Report", 8, 14);
		double totalsuccessfullbidcost2 = getNumericDataFS("Financial Settlement Report", 9, 14);
		double totalsuccessfullbidcost3 = getNumericDataFS("Financial Settlement Report", 10, 14);
		double totalsuccessfullbidcost4 = getNumericDataFS("Financial Settlement Report", 11, 14);
		double totalsuccessfullbidcost5 = getNumericDataFS("Financial Settlement Report", 12, 14);

		String Colomn16 = getStringDataFS("Financial Settlement Report", 7, 15);
		double amountOwed1 = getNumericDataFS("Financial Settlement Report", 8, 15);
		double amountOwed2 = getNumericDataFS("Financial Settlement Report", 9, 15);
		double amountOwed3 = getNumericDataFS("Financial Settlement Report", 10, 15);
		double amountOwed4 = getNumericDataFS("Financial Settlement Report", 11, 15);
		double amountOwed5 = getNumericDataFS("Financial Settlement Report", 12, 15);

		String Colomn17 = getStringDataFS("Financial Settlement Report", 7, 16);
		String amountOwedBy1 = getStringDataFS("Financial Settlement Report", 8, 16);
		String amountOwedBy2 = getStringDataFS("Financial Settlement Report", 9, 16);
		String amountOwedBy3 = getStringDataFS("Financial Settlement Report", 10, 16);
		String amountOwedBy4 = getStringDataFS("Financial Settlement Report", 11, 16);
		String amountOwedBy5 = getStringDataFS("Financial Settlement Report", 12, 16);

		System.out.println(currentSettPriceUSD + " : " + settlementpriceUSD);
		System.out.println(currentSettPriceCAD + " : " + settlementpriceCAD);

		System.out.println(Colomn1 + " : " + regGenAccNo1 + " , " + Colomn12 + " : " + totalBidGuarantee1 + " , "
				+ Colomn13 + " : " + currentSuccBidAllowances1 + " , " + Colomn15 + " : " + totalsuccessfullbidcost1
				+ " , " + Colomn16 + " : " + amountOwed1 + " , " + Colomn17 + " : " + amountOwedBy1);
		System.out.println(Colomn1 + " : " + regGenAccNo2 + " , " + Colomn12 + " : " + totalBidGuarantee2 + " , "
				+ Colomn13 + " : " + currentSuccBidAllowances2 + " , " + Colomn15 + " : " + totalsuccessfullbidcost2
				+ " , " + Colomn16 + " : " + amountOwed2 + " , " + Colomn17 + " : " + amountOwedBy2);
		System.out.println(Colomn1 + " : " + regGenAccNo3 + " , " + Colomn12 + " : " + totalBidGuarantee3 + " , "
				+ Colomn13 + " : " + currentSuccBidAllowances3 + " , " + Colomn15 + " : " + totalsuccessfullbidcost3
				+ " , " + Colomn16 + " : " + amountOwed3 + " , " + Colomn17 + " : " + amountOwedBy3);
		System.out.println(Colomn1 + " : " + regGenAccNo4 + " , " + Colomn12 + " : " + totalBidGuarantee4 + " , "
				+ Colomn13 + " : " + currentSuccBidAllowances4 + " , " + Colomn15 + " : " + totalsuccessfullbidcost4
				+ " , " + Colomn16 + " : " + amountOwed4 + " , " + Colomn17 + " : " + amountOwedBy4);
		System.out.println(Colomn1 + " : " + regGenAccNo5 + " , " + Colomn12 + " : " + totalBidGuarantee5 + " , "
				+ Colomn13 + " : " + currentSuccBidAllowances5 + " , " + Colomn15 + " : " + totalsuccessfullbidcost5
				+ " , " + Colomn16 + " : " + amountOwed5 + " , " + Colomn17 + " : " + amountOwedBy5);
		ObjectRepo.test.log(Status.PASS,
				Colomn1 + " : " + regGenAccNo1 + " , " + Colomn12 + " : " + totalBidGuarantee1 + " , " + Colomn13
						+ " : " + currentSuccBidAllowances1 + " , " + Colomn15 + " : " + totalsuccessfullbidcost1
						+ " , " + Colomn16 + " : " + amountOwed1 + " , " + Colomn17 + " : " + amountOwedBy1);
		ObjectRepo.test.log(Status.PASS,
				Colomn1 + " : " + regGenAccNo2 + " , " + Colomn12 + " : " + totalBidGuarantee2 + " , " + Colomn13
						+ " : " + currentSuccBidAllowances2 + " , " + Colomn15 + " : " + totalsuccessfullbidcost2
						+ " , " + Colomn16 + " : " + amountOwed2 + " , " + Colomn17 + " : " + amountOwedBy2);
		ObjectRepo.test.log(Status.PASS,
				Colomn1 + " : " + regGenAccNo3 + " , " + Colomn12 + " : " + totalBidGuarantee3 + " , " + Colomn13
						+ " : " + currentSuccBidAllowances3 + " , " + Colomn15 + " : " + totalsuccessfullbidcost3
						+ " , " + Colomn16 + " : " + amountOwed3 + " , " + Colomn17 + " : " + amountOwedBy3);
		ObjectRepo.test.log(Status.PASS,
				Colomn1 + " : " + regGenAccNo4 + " , " + Colomn12 + " : " + totalBidGuarantee4 + " , " + Colomn13
						+ " : " + currentSuccBidAllowances4 + " , " + Colomn15 + " : " + totalsuccessfullbidcost4
						+ " , " + Colomn16 + " : " + amountOwed4 + " , " + Colomn17 + " : " + amountOwedBy4);
		ObjectRepo.test.log(Status.PASS,
				Colomn1 + " : " + regGenAccNo5 + " , " + Colomn12 + " : " + totalBidGuarantee5 + " , " + Colomn13
						+ " : " + currentSuccBidAllowances5 + " , " + Colomn15 + " : " + totalsuccessfullbidcost5
						+ " , " + Colomn16 + " : " + amountOwed5 + " , " + Colomn17 + " : " + amountOwedBy5);

	}

	public File getLatestFilefromDir(String dirPath) {
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			return null;
		}
		File lastModifiedFile = files[0];
		for (int i = 1; i < files.length; i++) {
			if (lastModifiedFile.lastModified() < files[i].lastModified()) {
				lastModifiedFile = files[i];
			}
		}
		return lastModifiedFile;
	}

	public void clickbtnCreateEvent() {
		wait.until(ExpectedConditions.elementToBeClickable(btnCreateEvent));
		btnCreateEvent.click();
	}

	public void gettextBoxEvent() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop.getProperty("CITSS_Event_ID"));
	}

	public void gettextBoxEvent_PE1() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_PE1"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_PE1"));
	}
	
	public void gettextBoxEvent_PEWa() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_PEWa"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_PEWa"));
	}
	
	public void gettextBoxEvent_PEWa2() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_PEWa2"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_PEWa2"));
	}
	
	public void gettextBoxEvent_PECa() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_RE1Ca"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_RE1Ca"));
	}
	
	public void gettextBoxEvent_REWA1 () {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_REWA1"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_REWA1"));
	}
	
	public void gettextBoxEvent_REWA2 () {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_REWA2"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_REWA2"));
	}
	
	public void gettextBoxEvent_PEQc() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_SBMA1"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_SBMA1"));
	}
	
	public void gettextBoxEvent_PEQc1() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_SBMA2"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_SBMA2"));
	}
	
	public void gettextBoxEvent_PEQc2() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_SBMA3"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_SBMA3"));
	}
	
	public void gettextBoxEvent_PEQc3() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_SBMA4"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_SBMA4"));
	}
	
	public void gettextBoxEvent_PEQc6() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_SBMA7"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_SBMA7"));
	}
	
	public void gettextBoxEvent_PEQc4() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_SBMA5"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_SBMA5"));
	}
	
	public void gettextBoxEvent_PEQc5() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_SBMA6"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_SBMA6"));
	}


	public void gettextBoxEvent_PE2() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_PE2"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_PE2"));
	}

	public void gettextBoxEvent_PE3() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_PE3"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_PE3"));
	}

	public void gettextBoxEvent_PE5() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_PE5"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_PE5"));
	}

	public void gettextBoxEvent_PE6() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_PE6"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_PE6"));
	}

	public void gettextBoxEvent_PE7() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_PE7"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_PE7"));
	}

	public void gettextBoxEvent_PE8() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_PE8"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_PE8"));
	}

	public void gettextBoxEvent_PE9() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_PE9"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_PE9"));
	}

	public void gettextBoxEvent_PE10() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_PE10"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_PE10"));
	}
	
	public void gettextBoxEvent_PE11() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_PE11"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_PE11"));
	}
	
	public void gettextBoxEvent_PE12() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_PE12"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_PE12"));
	}

	public void gettextBoxEvent_PE4() {

		wait.until(ExpectedConditions.elementToBeClickable(textBoxEventID));
		textBoxEventID.sendKeys(prop1.getProperty("CITSS_Event_ID_PE4"));
		ObjectRepo.test.log(Status.PASS, "CITSS Event Id Entered : " + prop1.getProperty("CITSS_Event_ID_PE4"));
	}

	public void selectEventTypeFromDropDown() {
		wait.until(ExpectedConditions.elementToBeClickable(eventTypeDropDown));
		WebElement eventType = eventTypeDropDown;
		Select s = new Select(eventType);
		s.selectByVisibleText("Auction");
	}
	
	public void selectEventTypeFromDropDownCa() {
		wait.until(ExpectedConditions.elementToBeClickable(eventTypeDropDown));
		eventTypeDropDown.click();
		WebElement eventType = eventTypeDropDown;
		Select s = new Select(eventType);
		s.selectByVisibleText("Reserve Sale");
	}
	
	public void selectEventTypeFromDropDownREWA1() {
		wait.until(ExpectedConditions.elementToBeClickable(eventTypeDropDown));
		eventTypeDropDown.click();
		WebElement eventType = eventTypeDropDown;
		Select s = new Select(eventType);
		s.selectByVisibleText("Allowance Price Containment Reserve");
	}
	
	public void selectEventTypeFromDropDownQc() {
		wait.until(ExpectedConditions.elementToBeClickable(eventTypeDropDown));
		eventTypeDropDown.click();
		WebElement eventType = eventTypeDropDown;
		Select s = new Select(eventType);
		s.selectByVisibleText("Sale by Mutual Agreement");
	}

	public void enterEventName() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		Date date = new Date();
		date1 = dateFormat.format(date);
		LocalTime myDateObj = LocalTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH/mm");
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("Current time :" + formattedDate);
		eventName.sendKeys(eventNameEng);
	}

	public void enterEventName_PE1() {
		eventName.sendKeys(eventName_PE1);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PE1);
	}
	
	public void enterEventName_PEWa() {
		eventName.sendKeys(eventName_PEWa);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEWa);
	}
	
	public void enterEventName_PEWa2() {
		eventName.sendKeys(eventName_PEWa2);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEWa2);
	}
	
	public void enterEventName_PECa() {
		eventName.sendKeys(eventName_PECa);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PECa);
	}
	
	public void enterEventName_REWA1() {
		eventName.sendKeys(eventName_REWA1);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_REWA1);
	}
	
	public void enterEventName_REWA2() {
		eventName.sendKeys(eventName_REWA2);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_REWA2);
	}
	
	public void enterEventNameEng_PEQc() {
		eventName.sendKeys(eventName_PEQc);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEQc);
	}
	
	public void enterEventNameEng_PEQc1() {
		eventName.sendKeys(eventName_PEQc1);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEQc1);
	}
	
	public void enterEventNameEng_PEQc2() {
		eventName.sendKeys(eventName_PEQc2);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEQc2);
	}
	
	public void enterEventNameEng_PEQc3() {
		eventName.sendKeys(eventName_PEQc3);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEQc3);
	}
	
	public void enterEventNameEng_PEQc6() {
		eventName.sendKeys(eventName_PEQc6);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEQc6);
	}
	
	public void enterEventNameEng_PEQc4() {
		eventName.sendKeys(eventName_PEQc4);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEQc4);
	}
	
	public void enterEventNameEng_PEQc5() {
		eventName.sendKeys(eventName_PEQc5);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEQc5);
	}
	
	public void enterEventNameFr_PEQc() {
		eventNameFr.sendKeys(eventName_PEQc);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEQc);
	}
	
	public void enterEventNameFr_PEQc1() {
		eventNameFr.sendKeys(eventName_PEQc1);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEQc1);
	}
	
	public void enterEventNameFr_PEQc2() {
		eventNameFr.sendKeys(eventName_PEQc2);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEQc2);
	}
	
	public void enterEventNameFr_PEQc3() {
		eventNameFr.sendKeys(eventName_PEQc3);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEQc3);
	}
	
	public void enterEventNameFr_PEQc6() {
		eventNameFr.sendKeys(eventName_PEQc6);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEQc6);
	}
	
	public void enterEventNameFr_PEQc4() {
		eventNameFr.sendKeys(eventName_PEQc4);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEQc4);
	}
	
	public void enterEventNameFr_PEQc5() {
		eventNameFr.sendKeys(eventName_PEQc5);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PEQc5);
	}

	public void enterEventName_PE2() {
		eventName.sendKeys(eventName_PE2);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PE2);
	}

	public void enterEventName_PE3() {
		eventName.sendKeys(eventName_PE3);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PE3);
	}

	public void enterEventName_PE5() {
		eventName.sendKeys(eventName_PE5);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PE5);
	}

	public void enterEventName_PE6() {
		eventName.sendKeys(eventName_PE6);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PE6);
	}

	public void enterEventName_PE7() {
		eventName.sendKeys(eventName_PE7);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PE7);
	}

	public void enterEventName_PE8() {
		eventName.sendKeys(eventName_PE8);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PE8);
	}

	public void enterEventName_PE9() {
		eventName.sendKeys(eventName_PE9);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PE9);
	}

	public void enterEventName_PE10() {
		eventName.sendKeys(eventName_PE10);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PE10);
	}
	
	public void enterEventName_PE11() {
		eventName.sendKeys(eventName_PE11);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PE11);
	}
	
	public void enterEventName_PE12() {
		eventName.sendKeys(eventName_PE12);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PE12);
	}

	public void enterEventName_PE4() {
		eventName.sendKeys(eventName_PE4);
		ObjectRepo.test.log(Status.PASS, "Event Name Entered : " + eventName_PE4);
	}

	public void selectJurisdictionForJointAuction() throws InterruptedException {
		ParticipatingJurisdictions.click();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnCalifornia));
			btnCalifornia.click();
			wait.until(ExpectedConditions.elementToBeClickable(btnQuebec));
			btnQuebec.click();
		} catch (Exception e) {
			btnWashinton.click();
		}
		
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		Date date = new Date();
		date1 = dateFormat.format(date);
		LocalTime myDateObj = LocalTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH/mm");
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("Current time :" + formattedDate);

		WebElement abc2 = frenchEventName;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc2).build().perform();
		action.clickAndHold(abc2).build().perform();
		action.click(abc2).build().perform();
		frenchEventName.sendKeys(eventNameEng + "FrenchLang");
	}

	public void selectJurisdictionForJointAuctionA42() throws InterruptedException {
		ParticipatingJurisdictions.click();
		try {
			btnCalifornia.click();
			btnQuebec.click();
		} catch (Exception e) {
			btnWashinton.click();
		}
		WebElement abc2 = frenchEventName;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc2).build().perform();
		action.clickAndHold(abc2).build().perform();
		action.click(abc2).build().perform();
		frenchEventName.sendKeys("frenchEventName" + "A42");
	}
	
	public void selectJurisdictionWashingtonAuctionEvent() throws InterruptedException {
		ParticipatingJurisdictionsWa.click();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnWashinton));
            btnWashinton.click();	
		} catch (Exception e) {
			btnCalifornia.click();
			btnQuebec.click();
		}
		Thread.sleep(2000);
		WebElement element = driver.get().findElement(By.xpath("(//div[@id='demo-customized-select'])[2]"));
		new Actions(driver.get()).moveToElement(element).click().build().perform();
	}

	public void selectJurisdictionForJointAuctionA45() throws InterruptedException {
		ParticipatingJurisdictions.click();
		try {
			btnCalifornia.click();
			btnQuebec.click();
		} catch (Exception e) {
			btnWashinton.click();
		}
		WebElement abc2 = frenchEventName;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc2).build().perform();
		action.clickAndHold(abc2).build().perform();
		action.click(abc2).build().perform();
		frenchEventName.sendKeys("frenchEventName" + "A45");
	}

	public void selectJurisdictionForJointAuctionA46() throws InterruptedException {
		ParticipatingJurisdictions.click();
		try {
			btnCalifornia.click();
			btnQuebec.click();
		} catch (Exception e) {
			btnWashinton.click();
		}
		WebElement abc2 = frenchEventName;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc2).build().perform();
		action.clickAndHold(abc2).build().perform();
		action.click(abc2).build().perform();
		frenchEventName.sendKeys("frenchEventName" + "A46");
	}

	public void selectJurisdictionForJointAuctionA47() throws InterruptedException {
		ParticipatingJurisdictions.click();
		try {
			btnCalifornia.click();
			btnQuebec.click();
		} catch (Exception e) {
			btnWashinton.click();
		}
		WebElement abc2 = frenchEventName;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc2).build().perform();
		action.clickAndHold(abc2).build().perform();
		action.click(abc2).build().perform();
		frenchEventName.sendKeys("frenchEventName" + "A47");
	}

	public void selectJurisdictionForJointAuctionA48() throws InterruptedException {
		ParticipatingJurisdictions.click();
		try {
			btnCalifornia.click();
			btnQuebec.click();
		} catch (Exception e) {
			btnWashinton.click();
		}
		WebElement abc2 = frenchEventName;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc2).build().perform();
		action.clickAndHold(abc2).build().perform();
		action.click(abc2).build().perform();
		frenchEventName.sendKeys("frenchEventName" + "A48");
	}

	public void selectJurisdictionForJointAuctionA49() throws InterruptedException {
		ParticipatingJurisdictions.click();
		try {
			btnCalifornia.click();
			btnQuebec.click();
		} catch (Exception e) {
			btnWashinton.click();
		}
		WebElement abc2 = frenchEventName;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc2).build().perform();
		action.clickAndHold(abc2).build().perform();
		action.click(abc2).build().perform();
		frenchEventName.sendKeys("frenchEventName" + "A49");
	}

	public void selectJurisdictionForJointAuctionA50() throws InterruptedException {
		ParticipatingJurisdictions.click();
		try {
			btnCalifornia.click();
			btnQuebec.click();
		} catch (Exception e) {
			btnWashinton.click();
		}
		WebElement abc2 = frenchEventName;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc2).build().perform();
		action.clickAndHold(abc2).build().perform();
		action.click(abc2).build().perform();
		frenchEventName.sendKeys("frenchEventName" + "A50");
	}

	public void selectJurisdictionForJointAuctionA51() throws InterruptedException {
		ParticipatingJurisdictions.click();
		try {
			btnCalifornia.click();
			btnQuebec.click();
		} catch (Exception e) {
			btnWashinton.click();
		}
		WebElement abc2 = frenchEventName;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc2).build().perform();
		action.clickAndHold(abc2).build().perform();
		action.click(abc2).build().perform();
		frenchEventName.sendKeys("frenchEventName" + "A51");
	}

	public void selectJurisdictionForJointAuctionA56() throws InterruptedException {
		ParticipatingJurisdictions.click();
		try {
			btnCalifornia.click();
			btnQuebec.click();
		} catch (Exception e) {
			btnWashinton.click();
		}
		WebElement abc2 = frenchEventName;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc2).build().perform();
		action.clickAndHold(abc2).build().perform();
		action.click(abc2).build().perform();
		frenchEventName.sendKeys("frenchEventName" + "A56");
	}

	public void selectJurisdictionForJointAuctionA57() throws InterruptedException {
		ParticipatingJurisdictions.click();
		try {
			btnCalifornia.click();
			btnQuebec.click();
		} catch (Exception e) {
			btnWashinton.click();
		}
		WebElement abc2 = frenchEventName;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc2).build().perform();
		action.clickAndHold(abc2).build().perform();
		action.click(abc2).build().perform();
		frenchEventName.sendKeys("frenchEventName" + "A57");
	}
	
	public void selectJurisdictionForJointAuctionA297() throws InterruptedException {
		ParticipatingJurisdictions.click();
		try {
			btnCalifornia.click();
			btnQuebec.click();
		} catch (Exception e) {
			btnWashinton.click();
		}
		WebElement abc2 = frenchEventName;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc2).build().perform();
		action.clickAndHold(abc2).build().perform();
		action.click(abc2).build().perform();
		frenchEventName.sendKeys("frenchEventName" + "A297");
	}
	
	public void selectJurisdictionForJointAuctionA298() throws InterruptedException {
		ParticipatingJurisdictions.click();
		try {
			btnCalifornia.click();
			btnQuebec.click();
		} catch (Exception e) {
			btnWashinton.click();
		}
		WebElement abc2 = frenchEventName;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc2).build().perform();
		action.clickAndHold(abc2).build().perform();
		action.click(abc2).build().perform();
		frenchEventName.sendKeys("frenchEventName" + "A298");
	}

	public void currencyAccForjointAuction() throws InterruptedException {
		try {
			// ////
			WebElement abc3 = currencyAcc;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			// ////
			currencyAcc.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(tagUSD));
		tagUSD.click();

		tagCAD.click();
		WebElement abc4 = textBoxUSD;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc4).click().build().perform();
		action.click(abc4).build().perform();
		textBoxUSD.sendKeys(prop.getProperty("FloorPriceUSD"));

		WebElement abc5 = textBoxCAD;
		action.moveToElement(abc5).click().build().perform();
		action.click(abc5).build().perform();
		textBoxCAD.sendKeys(prop.getProperty("FloorPriceCAD"));
	}

	public void currencyAccForjointAuction_PE1() throws InterruptedException {
		try {
			WebElement abc3 = currencyAcc;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			currencyAcc.click();
		}

		tagUSD.click();

		tagCAD.click();
		WebElement abc4 = textBoxUSD;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc4).click().build().perform();
		action.click(abc4).build().perform();
		textBoxUSD.sendKeys(prop1.getProperty("FloorPriceUSD_PE1"));
		WebElement abc5 = textBoxCAD;
		action.moveToElement(abc5).click().build().perform();
		action.click(abc5).build().perform();
		textBoxCAD.sendKeys(prop1.getProperty("FloorPriceCAD_PE1"));
	}
	
	public void currencyAccForWashingtonAuctionEvent() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(currencyAcc));
		currencyAcc.click();
		try {
			WebElement abc3 = currencyAcc;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			currencyAcc.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(tagUSD));
        tagUSD.click();

		//tagCAD.click();
        wait.until(ExpectedConditions.elementToBeClickable(textBoxUSD));
		WebElement abc4 = textBoxUSD;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc4).click().build().perform();
		action.click(abc4).build().perform();
		textBoxUSD.sendKeys(prop1.getProperty("AnnualAuctionFloorPrice"));
		//WebElement abc5 = textBoxCAD;
		//action.moveToElement(abc5).click().build().perform();
		//action.click(abc5).build().perform();
		//textBoxCAD.sendKeys(prop1.getProperty("FloorPriceCAD_PE1"));
	}
	
	public void currencyAccForWashingtonAuctionEventA278() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(currencyAcc));
		currencyAcc.click();
		try {
			WebElement abc3 = currencyAcc;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			currencyAcc.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(tagUSD));
        tagUSD.click();

		//tagCAD.click();
        wait.until(ExpectedConditions.elementToBeClickable(textBoxUSD));
		WebElement abc4 = textBoxUSD;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc4).click().build().perform();
		action.click(abc4).build().perform();
		textBoxUSD.sendKeys(prop1.getProperty("AnnualAuctionFloorPriceA278"));
		//WebElement abc5 = textBoxCAD;
		//action.moveToElement(abc5).click().build().perform();
		//action.click(abc5).build().perform();
		//textBoxCAD.sendKeys(prop1.getProperty("FloorPriceCAD_PE1"));
	}
	
	public void currencyAccForCaReserveSaleEvent() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(currencyAccCa));
		currencyAccCa.click();
		try {
			WebElement abc3 = currencyAccCa;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			currencyAccCa.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(tagUSD));
        tagUSD.click();
	}
	
	public void currencyAccForQcSBMAEvent() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(currencyAccCa));
		currencyAccCa.click();
		try {
			WebElement abc3 = currencyAccCa;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			currencyAccCa.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(tagCAD));
		tagCAD.click();
	}

	public void currencyAccForjointAuction_PE2() throws InterruptedException {
		try {
			WebElement abc3 = currencyAcc;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			currencyAcc.click();
		}

		tagUSD.click();

		tagCAD.click();
		WebElement abc4 = textBoxUSD;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc4).click().build().perform();
		action.click(abc4).build().perform();
		textBoxUSD.sendKeys(prop1.getProperty("FloorPriceUSD_PE2"));
		WebElement abc5 = textBoxCAD;
		action.moveToElement(abc5).click().build().perform();
		action.click(abc5).build().perform();
		textBoxCAD.sendKeys(prop1.getProperty("FloorPriceCAD_PE2"));
	}

	public void currencyAccForjointAuction_PE3() throws InterruptedException {
		try {
			WebElement abc3 = currencyAcc;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			currencyAcc.click();
		}

		tagUSD.click();

		tagCAD.click();
		WebElement abc4 = textBoxUSD;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc4).click().build().perform();
		action.click(abc4).build().perform();
		textBoxUSD.sendKeys(prop1.getProperty("FloorPriceUSD_PE3"));
		WebElement abc5 = textBoxCAD;
		action.moveToElement(abc5).click().build().perform();
		action.click(abc5).build().perform();
		textBoxCAD.sendKeys(prop1.getProperty("FloorPriceCAD_PE3"));
	}
	
	public void currencyAccForjointAuction_PE4() throws InterruptedException {
		try {
			WebElement abc3 = currencyAcc;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			currencyAcc.click();
		}

		tagUSD.click();

		tagCAD.click();
		WebElement abc4 = textBoxUSD;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc4).click().build().perform();
		action.click(abc4).build().perform();
		textBoxUSD.sendKeys(prop1.getProperty("FloorPriceUSD_PE4"));
		WebElement abc5 = textBoxCAD;
		action.moveToElement(abc5).click().build().perform();
		action.click(abc5).build().perform();
		textBoxCAD.sendKeys(prop1.getProperty("FloorPriceCAD_PE4"));
	}

	public void currencyAccForjointAuction_PE5() throws InterruptedException {
		try {
			WebElement abc3 = currencyAcc;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			currencyAcc.click();
		}

		tagUSD.click();

		tagCAD.click();
		WebElement abc4 = textBoxUSD;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc4).click().build().perform();
		action.click(abc4).build().perform();
		textBoxUSD.sendKeys(prop1.getProperty("FloorPriceUSD_PE5"));
		WebElement abc5 = textBoxCAD;
		action.moveToElement(abc5).click().build().perform();
		action.click(abc5).build().perform();
		textBoxCAD.sendKeys(prop1.getProperty("FloorPriceCAD_PE5"));
	}

	public void currencyAccForjointAuction_PE6() throws InterruptedException {
		try {
			WebElement abc3 = currencyAcc;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			currencyAcc.click();
		}

		tagUSD.click();

		tagCAD.click();
		WebElement abc4 = textBoxUSD;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc4).click().build().perform();
		action.click(abc4).build().perform();
		textBoxUSD.sendKeys(prop1.getProperty("FloorPriceUSD_PE6"));
		WebElement abc5 = textBoxCAD;
		action.moveToElement(abc5).click().build().perform();
		action.click(abc5).build().perform();
		textBoxCAD.sendKeys(prop1.getProperty("FloorPriceCAD_PE6"));
	}

	public void currencyAccForjointAuction_PE7() throws InterruptedException {
		try {
			WebElement abc3 = currencyAcc;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			currencyAcc.click();
		}

		tagUSD.click();

		tagCAD.click();
		WebElement abc4 = textBoxUSD;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc4).click().build().perform();
		action.click(abc4).build().perform();
		textBoxUSD.sendKeys(prop1.getProperty("FloorPriceUSD_PE7"));
		WebElement abc5 = textBoxCAD;
		action.moveToElement(abc5).click().build().perform();
		action.click(abc5).build().perform();
		textBoxCAD.sendKeys(prop1.getProperty("FloorPriceCAD_PE7"));
	}

	public void currencyAccForjointAuction_PE8() throws InterruptedException {
		try {
			WebElement abc3 = currencyAcc;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			currencyAcc.click();
		}

		tagUSD.click();

		tagCAD.click();
		WebElement abc4 = textBoxUSD;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc4).click().build().perform();
		action.click(abc4).build().perform();
		textBoxUSD.sendKeys(prop1.getProperty("FloorPriceUSD_PE8"));
		WebElement abc5 = textBoxCAD;
		action.moveToElement(abc5).click().build().perform();
		action.click(abc5).build().perform();
		textBoxCAD.sendKeys(prop1.getProperty("FloorPriceCAD_PE8"));
	}

	public void currencyAccForjointAuction_PE9() throws InterruptedException {
		try {
			WebElement abc3 = currencyAcc;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			currencyAcc.click();
		}
		tagUSD.click();
		tagCAD.click();
		WebElement abc4 = textBoxUSD;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc4).click().build().perform();
		action.click(abc4).build().perform();
		textBoxUSD.sendKeys(prop1.getProperty("FloorPriceUSD_PE9"));
		WebElement abc5 = textBoxCAD;
		action.moveToElement(abc5).click().build().perform();
		action.click(abc5).build().perform();
		textBoxCAD.sendKeys(prop1.getProperty("FloorPriceCAD_PE9"));
	}

	public void currencyAccForjointAuction_PE10() throws InterruptedException {
		try {
			WebElement abc3 = currencyAcc;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			currencyAcc.click();
		}
		tagUSD.click();
		tagCAD.click();
		WebElement abc4 = textBoxUSD;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc4).click().build().perform();
		action.click(abc4).build().perform();
		textBoxUSD.sendKeys(prop1.getProperty("FloorPriceUSD_PE10"));
		WebElement abc5 = textBoxCAD;
		action.moveToElement(abc5).click().build().perform();
		action.click(abc5).build().perform();
		textBoxCAD.sendKeys(prop1.getProperty("FloorPriceCAD_PE10"));
	}
	
	public void currencyAccForjointAuction_PE11() throws InterruptedException {
		try {
			WebElement abc3 = currencyAcc;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc3).build().perform();
			action.click(abc3).build().perform();
		} catch (Exception e) {
			currencyAcc.click();
		}
		tagUSD.click();
		tagCAD.click();
		WebElement abc4 = textBoxUSD;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc4).click().build().perform();
		action.click(abc4).build().perform();
		textBoxUSD.sendKeys(prop1.getProperty("AnnualAuctionReservePriceUSD"));
		WebElement abc5 = textBoxCAD;
		action.moveToElement(abc5).click().build().perform();
		action.click(abc5).build().perform();
		textBoxCAD.sendKeys(prop1.getProperty("AnnualAuctionReservePriceCAD"));
	}

	public void selectVintage() {
		WebElement dropdownvint = dropDownVintage1;
		Select select = new Select(dropdownvint);
		select.selectByVisibleText("2023");
		textBoxVintage1.sendKeys(prop.getProperty("TotalAllowances"));
	}
	
	public void selectVintage_PEWa() {
		WebElement dropdownvint = dropDownVintage1;
		Select select = new Select(dropdownvint);
		select.selectByVisibleText("2023");
		textBoxVintage1.sendKeys(prop1.getProperty("TotalAllowances_Current_PEWa"));
		ObjectRepo.test.log(Status.PASS,
				"Current Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Current_PEWa"));
		WebElement dropdownvint2 = dropDownVintage2;
		Select select1 = new Select(dropdownvint2);
		select1.selectByVisibleText("2024");
		textBoxVintage2.sendKeys(prop1.getProperty("TotalAllowances_Advance_PEWa"));
		ObjectRepo.test.log(Status.PASS,
				"Advance Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Advance_PEWa"));
	}
	
	public void selectVintage_PEWa2() {
		WebElement dropdownvint = dropDownVintage1;
		Select select = new Select(dropdownvint);
		select.selectByVisibleText("2024");
		textBoxVintage1.sendKeys(prop1.getProperty("TotalAllowances_Current_PEWa2"));
		ObjectRepo.test.log(Status.PASS,
				"Current Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Current_PEWa2"));
		WebElement dropdownvint2 = dropDownVintage2;
		Select select1 = new Select(dropdownvint2);
		select1.selectByVisibleText("2025");
		textBoxVintage2.sendKeys(prop1.getProperty("TotalAllowances_Advance_PEWa2"));
		ObjectRepo.test.log(Status.PASS,
				"Advance Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Advance_PEWa2"));
	}
	
	public void selectTiers1_R317() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown));

		WebElement element = tiersDropDown;
		Select s = new Select(element);
		s.selectByVisibleText("Tier One");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices));
		texttiersprices.click();
		texttiersprices.sendKeys(prop1.getProperty("PriceOffered_Tier_one_RE1Ca"));
		texttotalallowanceavail.sendKeys(prop1.getProperty("TotalAllowances_Tier_one_RE1Ca"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown));
		processingOrderDropDown.click();
		WebElement element1 = processingOrderDropDown;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("1");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
	}
	
	public void selectTiers1_R319() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown));

		WebElement element = tiersDropDown;
		Select s = new Select(element);
		s.selectByVisibleText("Tier One");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices));
		texttiersprices.click();
		texttiersprices.sendKeys(prop1.getProperty("PriceOffered_Tier_one_REWA1"));
		texttotalallowanceavail.sendKeys(prop1.getProperty("TotalAllowances_Tier_one_REWA1"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown));
		processingOrderDropDown.click();
		WebElement element1 = processingOrderDropDown;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("1");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
	}
	
	public void selectTiers2_R319() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown));

		WebElement element = tiersDropDown2;
		Select s = new Select(element);
		s.selectByVisibleText("Tier Two");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices2));
		texttiersprices2.click();
		texttiersprices2.sendKeys(prop1.getProperty("PriceOffered_Tier_two_REWA1"));
		texttotalallowanceavail2.sendKeys(prop1.getProperty("TotalAllowances_Tier_two_REWA1"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown2));
		processingOrderDropDown2.click();
		WebElement element1 = processingOrderDropDown2;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("2");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
	}
	
	public void selectTiers3_R319() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown2));

		WebElement element = tiersDropDown3;
		Select s = new Select(element);
		s.selectByVisibleText("Tier Three");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices3));
		texttiersprices3.click();
		texttiersprices3.sendKeys(prop1.getProperty("PriceOffered_Tier_three_REWA1"));
		texttotalallowanceavail3.sendKeys(prop1.getProperty("TotalAllowances_Tier_three_REWA1"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown3));
		processingOrderDropDown3.click();
		WebElement element1 = processingOrderDropDown3;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("3");
	}
	
	public void selectTiers1_R325() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown));

		WebElement element = tiersDropDown;
		Select s = new Select(element);
		s.selectByVisibleText("Tier One");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices));
		texttiersprices.click();
		texttiersprices.sendKeys(prop1.getProperty("PriceOffered_Tier_one_REWA2"));
		texttotalallowanceavail.sendKeys(prop1.getProperty("TotalAllowances_Tier_one_REWA2"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown));
		processingOrderDropDown.click();
		WebElement element1 = processingOrderDropDown;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("1");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
	}
	
	public void selectTiers2_R325() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown));

		WebElement element = tiersDropDown2;
		Select s = new Select(element);
		s.selectByVisibleText("Tier Two");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices2));
		texttiersprices2.click();
		texttiersprices2.sendKeys(prop1.getProperty("PriceOffered_Tier_two_REWA2"));
		texttotalallowanceavail2.sendKeys(prop1.getProperty("TotalAllowances_Tier_two_REWA2"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown2));
		processingOrderDropDown2.click();
		WebElement element1 = processingOrderDropDown2;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("2");
	}
	
	public void selectCategoryA_R69() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown));

		WebElement element = tiersDropDown;
		Select s = new Select(element);
		s.selectByVisibleText("Category A");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices));
		texttiersprices.click();
		texttiersprices.sendKeys(prop1.getProperty("PriceOffered_CategoryA_SBMA1"));
		texttotalallowanceavail.sendKeys(prop1.getProperty("TotalAllowances_CategoryA_SBMA1"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown));
		processingOrderDropDown.click();
		WebElement element1 = processingOrderDropDown;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("1");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
	}
	
	public void selectCategoryA_R70() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown));

		WebElement element = tiersDropDown;
		Select s = new Select(element);
		s.selectByVisibleText("Category A");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices));
		texttiersprices.click();
		texttiersprices.sendKeys(prop1.getProperty("PriceOffered_CategoryA_SBMA2"));
		texttotalallowanceavail.sendKeys(prop1.getProperty("TotalAllowances_CategoryA_SBMA2"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown));
		processingOrderDropDown.click();
		WebElement element1 = processingOrderDropDown;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("1");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
	}
	
	public void selectCategoryA_R71() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown));

		WebElement element = tiersDropDown;
		Select s = new Select(element);
		s.selectByVisibleText("Category A");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices));
		texttiersprices.click();
		texttiersprices.sendKeys(prop1.getProperty("PriceOffered_CategoryA_SBMA3"));
		texttotalallowanceavail.sendKeys(prop1.getProperty("TotalAllowances_CategoryA_SBMA3"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown));
		processingOrderDropDown.click();
		WebElement element1 = processingOrderDropDown;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("1");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
	}
	
	public void selectCategoryA_R72() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown));

		WebElement element = tiersDropDown;
		Select s = new Select(element);
		s.selectByVisibleText("Category A");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices));
		texttiersprices.click();
		texttiersprices.sendKeys(prop1.getProperty("PriceOffered_CategoryA_SBMA4"));
		texttotalallowanceavail.sendKeys(prop1.getProperty("TotalAllowances_CategoryA_SBMA4"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown));
		processingOrderDropDown.click();
		WebElement element1 = processingOrderDropDown;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("1");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
	}
	
	public void selectCategoryA_R76() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown));

		WebElement element = tiersDropDown;
		Select s = new Select(element);
		s.selectByVisibleText("Category A");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices));
		texttiersprices.click();
		texttiersprices.sendKeys(prop1.getProperty("PriceOffered_CategoryA_SBMA7"));
		texttotalallowanceavail.sendKeys(prop1.getProperty("TotalAllowances_CategoryA_SBMA7"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown));
		processingOrderDropDown.click();
		WebElement element1 = processingOrderDropDown;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("1");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
	}
	
	public void selectCategoryA_R73() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown));

		WebElement element = tiersDropDown;
		Select s = new Select(element);
		s.selectByVisibleText("Category A");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices));
		texttiersprices.click();
		texttiersprices.sendKeys(prop1.getProperty("PriceOffered_CategoryA_SBMA5"));
		texttotalallowanceavail.sendKeys(prop1.getProperty("TotalAllowances_CategoryA_SBMA5"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown));
		processingOrderDropDown.click();
		WebElement element1 = processingOrderDropDown;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("1");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
	}
	
	public void selectCategoryA_R74() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown));

		WebElement element = tiersDropDown;
		Select s = new Select(element);
		s.selectByVisibleText("Category A");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices));
		texttiersprices.click();
		texttiersprices.sendKeys(prop1.getProperty("PriceOffered_CategoryA_SBMA6"));
		texttotalallowanceavail.sendKeys(prop1.getProperty("TotalAllowances_CategoryA_SBMA6"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown));
		processingOrderDropDown.click();
		WebElement element1 = processingOrderDropDown;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("1");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
	}
	
	public void selectCategoryB_R69() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown2));

		WebElement element = tiersDropDown2;
		Select s = new Select(element);
		s.selectByVisibleText("Category B");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices2));
		texttiersprices2.click();
		texttiersprices2.sendKeys(prop1.getProperty("PriceOffered_CategoryB_SBMA1"));
		texttotalallowanceavail2.sendKeys(prop1.getProperty("TotalAllowances_CategoryB_SBMA1"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown2));
		processingOrderDropDown2.click();
		WebElement element1 = processingOrderDropDown2;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("2");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
		
	}
	
	public void selectCategoryB_R70() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown2));

		WebElement element = tiersDropDown2;
		Select s = new Select(element);
		s.selectByVisibleText("Category B");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices2));
		texttiersprices2.click();
		texttiersprices2.sendKeys(prop1.getProperty("PriceOffered_CategoryB_SBMA2"));
		texttotalallowanceavail2.sendKeys(prop1.getProperty("TotalAllowances_CategoryB_SBMA2"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown2));
		processingOrderDropDown2.click();
		WebElement element1 = processingOrderDropDown2;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("2");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
		
	}
	
	public void selectCategoryB_R71() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown2));

		WebElement element = tiersDropDown2;
		Select s = new Select(element);
		s.selectByVisibleText("Category B");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices2));
		texttiersprices2.click();
		texttiersprices2.sendKeys(prop1.getProperty("PriceOffered_CategoryB_SBMA3"));
		texttotalallowanceavail2.sendKeys(prop1.getProperty("TotalAllowances_CategoryB_SBMA3"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown2));
		processingOrderDropDown2.click();
		WebElement element1 = processingOrderDropDown2;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("2");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
		
	}
	
	public void selectCategoryB_R72() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown2));

		WebElement element = tiersDropDown2;
		Select s = new Select(element);
		s.selectByVisibleText("Category B");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices2));
		texttiersprices2.click();
		texttiersprices2.sendKeys(prop1.getProperty("PriceOffered_CategoryB_SBMA4"));
		texttotalallowanceavail2.sendKeys(prop1.getProperty("TotalAllowances_CategoryB_SBMA4"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown2));
		processingOrderDropDown2.click();
		WebElement element1 = processingOrderDropDown2;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("2");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
		
	}
	
	public void selectCategoryB_R76() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown2));

		WebElement element = tiersDropDown2;
		Select s = new Select(element);
		s.selectByVisibleText("Category B");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices2));
		texttiersprices2.click();
		texttiersprices2.sendKeys(prop1.getProperty("PriceOffered_CategoryB_SBMA7"));
		texttotalallowanceavail2.sendKeys(prop1.getProperty("TotalAllowances_CategoryB_SBMA7"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown2));
		processingOrderDropDown2.click();
		WebElement element1 = processingOrderDropDown2;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("2");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
		
	}
	
	public void selectCategoryB_R73() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown2));

		WebElement element = tiersDropDown2;
		Select s = new Select(element);
		s.selectByVisibleText("Category B");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices2));
		texttiersprices2.click();
		texttiersprices2.sendKeys(prop1.getProperty("PriceOffered_CategoryB_SBMA5"));
		texttotalallowanceavail2.sendKeys(prop1.getProperty("TotalAllowances_CategoryB_SBMA5"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown2));
		processingOrderDropDown2.click();
		WebElement element1 = processingOrderDropDown2;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("2");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
		
	}
	
	public void selectCategoryB_R74() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown2));

		WebElement element = tiersDropDown2;
		Select s = new Select(element);
		s.selectByVisibleText("Category B");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices2));
		texttiersprices2.click();
		texttiersprices2.sendKeys(prop1.getProperty("PriceOffered_CategoryB_SBMA6"));
		texttotalallowanceavail2.sendKeys(prop1.getProperty("TotalAllowances_CategoryB_SBMA6"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown2));
		processingOrderDropDown2.click();
		WebElement element1 = processingOrderDropDown2;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("2");
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewTier));
		btnAddNewTier.click();
		
	}
	
	public void selectCategoryC_R69() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown3));

		WebElement element = tiersDropDown3;
		Select s = new Select(element);
		s.selectByVisibleText("Category C");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices3));
		texttiersprices3.click();
		texttiersprices3.sendKeys(prop1.getProperty("PriceOffered_CategoryC_SBMA1"));
		texttotalallowanceavail3.sendKeys(prop1.getProperty("TotalAllowances_CategoryC_SBMA1"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown3));
		processingOrderDropDown3.click();
		WebElement element1 = processingOrderDropDown3;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("3");
		
	}
	
	public void selectCategoryC_R70() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown3));

		WebElement element = tiersDropDown3;
		Select s = new Select(element);
		s.selectByVisibleText("Category C");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices3));
		texttiersprices3.click();
		texttiersprices3.sendKeys(prop1.getProperty("PriceOffered_CategoryC_SBMA2"));
		texttotalallowanceavail3.sendKeys(prop1.getProperty("TotalAllowances_CategoryC_SBMA2"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown3));
		processingOrderDropDown3.click();
		WebElement element1 = processingOrderDropDown3;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("3");
		
	}
	
	public void selectCategoryC_R71() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown3));

		WebElement element = tiersDropDown3;
		Select s = new Select(element);
		s.selectByVisibleText("Category C");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices3));
		texttiersprices3.click();
		texttiersprices3.sendKeys(prop1.getProperty("PriceOffered_CategoryC_SBMA3"));
		texttotalallowanceavail3.sendKeys(prop1.getProperty("TotalAllowances_CategoryC_SBMA3"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown3));
		processingOrderDropDown3.click();
		WebElement element1 = processingOrderDropDown3;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("3");
		
	}
	
	public void selectCategoryC_R72() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown3));

		WebElement element = tiersDropDown3;
		Select s = new Select(element);
		s.selectByVisibleText("Category C");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices3));
		texttiersprices3.click();
		texttiersprices3.sendKeys(prop1.getProperty("PriceOffered_CategoryC_SBMA4"));
		texttotalallowanceavail3.sendKeys(prop1.getProperty("TotalAllowances_CategoryC_SBMA4"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown3));
		processingOrderDropDown3.click();
		WebElement element1 = processingOrderDropDown3;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("3");
		
	}
	
	public void selectCategoryC_R76() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown3));

		WebElement element = tiersDropDown3;
		Select s = new Select(element);
		s.selectByVisibleText("Category C");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices3));
		texttiersprices3.click();
		texttiersprices3.sendKeys(prop1.getProperty("PriceOffered_CategoryC_SBMA7"));
		texttotalallowanceavail3.sendKeys(prop1.getProperty("TotalAllowances_CategoryC_SBMA7"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown3));
		processingOrderDropDown3.click();
		WebElement element1 = processingOrderDropDown3;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("3");
		
	}
	
	public void selectCategoryC_R73() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown3));

		WebElement element = tiersDropDown3;
		Select s = new Select(element);
		s.selectByVisibleText("Category C");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices3));
		texttiersprices3.click();
		texttiersprices3.sendKeys(prop1.getProperty("PriceOffered_CategoryC_SBMA5"));
		texttotalallowanceavail3.sendKeys(prop1.getProperty("TotalAllowances_CategoryC_SBMA5"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown3));
		processingOrderDropDown3.click();
		WebElement element1 = processingOrderDropDown3;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("3");
		
	}
	
	public void selectCategoryC_R74() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown3));

		WebElement element = tiersDropDown3;
		Select s = new Select(element);
		s.selectByVisibleText("Category C");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices3));
		texttiersprices3.click();
		texttiersprices3.sendKeys(prop1.getProperty("PriceOffered_CategoryC_SBMA6"));
		texttotalallowanceavail3.sendKeys(prop1.getProperty("TotalAllowances_CategoryC_SBMA6"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown3));
		processingOrderDropDown3.click();
		WebElement element1 = processingOrderDropDown3;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("3");
		
	}
	
	public void selectTiers2_R317() {
		wait.until(ExpectedConditions.elementToBeClickable(tiersDropDown2));

		WebElement element = tiersDropDown2;
		Select s = new Select(element);
		s.selectByVisibleText("Tier Two");
		wait.until(ExpectedConditions.elementToBeClickable(texttiersprices2));
		texttiersprices2.click();
		texttiersprices2.sendKeys(prop1.getProperty("PriceOffered_Tier_two_RE1Ca"));
		texttotalallowanceavail2.sendKeys(prop1.getProperty("TotalAllowances_Tier_two_RE1Ca"));
		
		wait.until(ExpectedConditions.elementToBeClickable(processingOrderDropDown2));
		processingOrderDropDown2.click();
		WebElement element1 = processingOrderDropDown2;
		Select s1 = new Select(element1);
		//Thread.sleep(2000);
		s1.selectByVisibleText("2");
		
	}
	
	public void selectVintage_PE1() {
		WebElement dropdownvint = dropDownVintage1;
		Select select = new Select(dropdownvint);
		select.selectByVisibleText("2024");
		textBoxVintage1.sendKeys(prop1.getProperty("TotalAllowances_Current_PE1"));
		ObjectRepo.test.log(Status.PASS,
				"Current Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Current_PE1"));
		WebElement dropdownvint2 = dropDownVintage2;
		Select select1 = new Select(dropdownvint2);
		select1.selectByVisibleText("2028");
		textBoxVintage2.sendKeys(prop1.getProperty("TotalAllowances_Advance_PE1"));
		ObjectRepo.test.log(Status.PASS,
				"Advance Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Advance_PE1"));
	}

	public void selectVintage_PE2() {
		WebElement dropdownvint = dropDownVintage1;
		Select select = new Select(dropdownvint);
		select.selectByVisibleText("2024");
		textBoxVintage1.sendKeys(prop1.getProperty("TotalAllowances_Current_PE2"));
		ObjectRepo.test.log(Status.PASS,
				"Current Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Current_PE2"));
	}

	public void selectVintage_PE3() {
		WebElement dropdownvint = dropDownVintage1;
		Select select = new Select(dropdownvint);
		select.selectByVisibleText("2024");
		textBoxVintage1.sendKeys(prop1.getProperty("TotalAllowances_Current_PE3"));
		ObjectRepo.test.log(Status.PASS,
				"Current Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Current_PE3"));
	}
	
	public void selectVintage_PE4() {
		WebElement dropdownvint = dropDownVintage1;
		Select select = new Select(dropdownvint);
		select.selectByVisibleText("2024");
		textBoxVintage1.sendKeys(prop1.getProperty("TotalAllowances_Current_PE4"));
		ObjectRepo.test.log(Status.PASS,
				"Current Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Current_PE4"));
	}

	public void selectVintage_PE5() {
		WebElement dropdownvint = dropDownVintage1;
		Select select = new Select(dropdownvint);
		select.selectByVisibleText("2024");
		textBoxVintage1.sendKeys(prop1.getProperty("TotalAllowances_Current_PE5"));
		ObjectRepo.test.log(Status.PASS,
				"Current Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Current_PE5"));
	}

	public void selectVintage_PE6() {
		WebElement dropdownvint = dropDownVintage1;
		Select select = new Select(dropdownvint);
		select.selectByVisibleText("2024");
		textBoxVintage1.sendKeys(prop1.getProperty("TotalAllowances_Current_PE6"));
		ObjectRepo.test.log(Status.PASS,
				"Current Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Current_PE6"));
	}

	public void selectVintage_PE7() {
		WebElement dropdownvint = dropDownVintage1;
		Select select = new Select(dropdownvint);
		select.selectByVisibleText("2024");
		textBoxVintage1.sendKeys(prop1.getProperty("TotalAllowances_Current_PE7"));
		ObjectRepo.test.log(Status.PASS,
				"Current Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Current_PE7"));
	}

	public void selectVintage_PE8() {
		WebElement dropdownvint = dropDownVintage1;
		Select select = new Select(dropdownvint);
		select.selectByVisibleText("2024");
		textBoxVintage1.sendKeys(prop1.getProperty("TotalAllowances_Current_PE8"));
		ObjectRepo.test.log(Status.PASS,
				"Current Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Current_PE8"));
	}

	public void selectVintage_PE9() {
		WebElement dropdownvint = dropDownVintage1;
		Select select = new Select(dropdownvint);
		select.selectByVisibleText("2024");
		textBoxVintage1.sendKeys(prop1.getProperty("TotalAllowances_Current_PE9"));
		ObjectRepo.test.log(Status.PASS,
				"Current Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Current_PE9"));
	}

	public void selectVintage_PE10() {
		WebElement dropdownvint = dropDownVintage1;
		Select select = new Select(dropdownvint);
		select.selectByVisibleText("2024");
		textBoxVintage1.sendKeys(prop1.getProperty("TotalAllowances_Current_PE10"));
		ObjectRepo.test.log(Status.PASS,
				"Current Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Current_PE10"));
	}
	
	public void selectVintage_PE11() {
		WebElement dropdownvint = dropDownVintage1;
		Select select = new Select(dropdownvint);
		select.selectByVisibleText("2024");
		textBoxVintage1.sendKeys(prop1.getProperty("TotalAllowances_Current_PE11"));
		ObjectRepo.test.log(Status.PASS,
				"Current Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Current_PE11"));
	}
	
	public void selectVintage_PE12() {
		WebElement dropdownvint = dropDownVintage1;
		Select select = new Select(dropdownvint);
		select.selectByVisibleText("2024");
		textBoxVintage1.sendKeys(prop1.getProperty("TotalAllowances_Current_PE12"));
		ObjectRepo.test.log(Status.PASS,
				"Current Event Vintage Entered : " + prop1.getProperty("TotalAllowances_Current_PE12"));
	}

	public void selectVintageType() {
		wait.until(ExpectedConditions.elementToBeClickable(dropDownVintage1));
		WebElement dropdownvintType = drpdownVintageType1;
		Select select = new Select(dropdownvintType);
		select.selectByVisibleText("Current");
	}

	public void selectVintageType_PE1() {
		wait.until(ExpectedConditions.elementToBeClickable(dropDownVintage1));
		WebElement dropdownvintType = drpdownVintageType1;
		Select select = new Select(dropdownvintType);
		select.selectByVisibleText("Current");
		WebElement dropdownvintType1 = drpdownVintageType2;
		Select select1 = new Select(dropdownvintType1);
		select1.selectByVisibleText("Advance");
	}
	
	public void selectVintageType_PEWa() {
		wait.until(ExpectedConditions.elementToBeClickable(drpdownVintageType1));
		WebElement dropdownvintType = drpdownVintageType1;
		Select select = new Select(dropdownvintType);
		select.selectByVisibleText("Current");
		wait.until(ExpectedConditions.elementToBeClickable(drpdownVintageType2));
		WebElement dropdownvintType1 = drpdownVintageType2;
		Select select1 = new Select(dropdownvintType1);
		select1.selectByVisibleText("Advance");
	}

	public void selectVintageType_PE2() {
		wait.until(ExpectedConditions.elementToBeClickable(dropDownVintage1));
		WebElement dropdownvintType = drpdownVintageType1;
		Select select = new Select(dropdownvintType);
		select.selectByVisibleText("Current");
	}

	public void selectProcessingOrder() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(drpdownProCessOrder1));
		WebElement dropdownProOrder = drpdownProCessOrder1;
		Select select = new Select(dropdownProOrder);
		select.selectByVisibleText("1");
	}

	public void selectProcessingOrder_PE1() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(drpdownProCessOrder1));
		WebElement dropdownProOrder = drpdownProCessOrder1;
		Select select = new Select(dropdownProOrder);
		select.selectByVisibleText("1");
		WebElement dropdownProOrder1 = drpdownProCessOrder2;
		Select select1 = new Select(dropdownProOrder1);
		select1.selectByVisibleText("2");
	}
	
	public void selectProcessingOrder_PEWa() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(drpdownProCessOrder1));
		WebElement dropdownProOrder = drpdownProCessOrder1;
		Select select = new Select(dropdownProOrder);
		select.selectByVisibleText("1");
		wait.until(ExpectedConditions.elementToBeClickable(drpdownProCessOrder2));
		WebElement dropdownProOrder1 = drpdownProCessOrder2;
		Select select1 = new Select(dropdownProOrder1);
		select1.selectByVisibleText("2");
	}

	public void selectProcessingOrder_PE2() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(drpdownProCessOrder1));
		WebElement dropdownProOrder = drpdownProCessOrder1;
		Select select = new Select(dropdownProOrder);
		select.selectByVisibleText("1");
		WebElement element = driver.get().findElement(By.xpath("(//*[@data-icon='trash-alt'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", element);
		Actions action = new Actions(driver.get());
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();
	}

	public void selectDates() throws InterruptedException {
		ZoneId easternTimeZone = ZoneId.of("America/New_York");
	    LocalDate today = LocalDate.now(easternTimeZone);
	    LocalDate tomorrow = today.plusDays(1);
	    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	    String date1 = today.format(dateFormat);
	    System.out.println("Today's date: " + date1);
	    String date2 = tomorrow.format(dateFormat);
	    System.out.println("Tomorrow's date: " + date2);
		
		LocalTime myDateObj = LocalTime.now(easternTimeZone);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("Current time :" + formattedDate);
		String hrs = formattedDate.substring(0, 2);
		String min = formattedDate.substring(3, 5);
		int num = Integer.valueOf(min);
		int num2 = Integer.valueOf(hrs);

		LocalTime time = LocalTime.of(num2, num);
		LocalTime BiddingStart = time.plusHours(0).plusMinutes(8);
		System.out.println("Bidding start time :" + BiddingStart);
		LocalTime BiddingEnd = time.plusHours(2).plusMinutes(15);
		System.out.println("Bidding end time :" + BiddingEnd);
		LocalTime applicationOpen = time.plusHours(0).plusMinutes(0);
		System.out.println("application open time :" + applicationOpen);
		LocalTime applicationClose = time.plusHours(0).plusMinutes(6);
		System.out.println("application Close time :" + applicationClose);

		LocalTime bidGuaranteeSubmissionDeadline = time.plusHours(0).plusMinutes(7);
		
		LocalTime resultsAvailable = time.plusHours(4).plusMinutes(40);
		LocalTime eventClosure = time.plusHours(8).plusMinutes(40);
		LocalTime financialSettlement = time.plusHours(6).plusMinutes(40);

		System.out.println("Bid Guarantee Submission Deadline: " + bidGuaranteeSubmissionDeadline);
		System.out.println("Results Available: " + resultsAvailable);
		System.out.println("Event Closure: " + eventClosure);
		System.out.println("Financial Settlement: " + financialSettlement);

		dateBiddingPeroidOpen.click();
		dateBiddingPeroidOpen.sendKeys(date1 + " " + BiddingStart);
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']"))
				.sendKeys(date1 + " " + bidGuaranteeSubmissionDeadline);
		Actions action = new Actions(driver.get());
		WebElement element = driver.get().findElement(By.xpath("//input[@name='eventBiddingPeriodClose']"));

		action.moveToElement(element).build().perform();

		wait.until(ExpectedConditions.elementToBeClickable(dateBiddingPeriodClose));

		dateBiddingPeriodClose.click();
		dateBiddingPeriodClose.sendKeys(date1 + " " + BiddingEnd);
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
		dateEventAppOpen.click();
		dateEventAppOpen.sendKeys(date1 + " " + applicationOpen);
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
		dateEventAppClose.click();
		dateEventAppClose.sendKeys(date1 + " " + applicationClose);

		dateBidResultAvail.click();
		dateBidResultAvail.sendKeys(date2 + " " + resultsAvailable);
		
		dateBiddingPeriodClose.click();
		dateEventClosure.click();
		dateEventClosure.sendKeys(date2 + " " + eventClosure);

		dateFinantialSettlement.click();
		dateFinantialSettlement.sendKeys(date2 + " " + financialSettlement);
		}

	public void selectDates_PE2() throws InterruptedException {
		ZoneId easternTimeZone = ZoneId.of("America/New_York");
	    LocalDate today = LocalDate.now(easternTimeZone);
	    LocalDate tomorrow = today.plusDays(1);
	    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	    String date1 = today.format(dateFormat);
	    System.out.println("Today's date: " + date1);
	    String date2 = tomorrow.format(dateFormat);
	    System.out.println("Tomorrow's date: " + date2);
		
		LocalTime myDateObj = LocalTime.now(easternTimeZone);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("Current time :" + formattedDate);
		String hrs = formattedDate.substring(0, 2);
		String min = formattedDate.substring(3, 5);
		int num = Integer.valueOf(min);
		int num2 = Integer.valueOf(hrs);

		LocalTime time = LocalTime.of(num2, num);
		LocalTime BiddingStart = time.plusHours(0).plusMinutes(7);
		System.out.println("Bidding start time :" + BiddingStart);
		LocalTime BiddingEnd = time.plusHours(2).plusMinutes(15);
		System.out.println("Bidding end time :" + BiddingEnd);
		LocalTime applicationOpen = time.plusHours(0).plusMinutes(0);
		System.out.println("application open time :" + applicationOpen);
		LocalTime applicationClose = time.plusHours(0).plusMinutes(5);
		System.out.println("application Close time :" + applicationClose);

		LocalTime bidGuaranteeSubmissionDeadline = time.plusHours(0).plusMinutes(6);
		
		LocalTime resultsAvailable = time.plusHours(4).plusMinutes(40);
		LocalTime eventClosure = time.plusHours(8).plusMinutes(40);
		LocalTime financialSettlement = time.plusHours(6).plusMinutes(40);

		System.out.println("Bid Guarantee Submission Deadline: " + bidGuaranteeSubmissionDeadline);
		System.out.println("Results Available: " + resultsAvailable);
		System.out.println("Event Closure: " + eventClosure);
		System.out.println("Financial Settlement: " + financialSettlement);

		dateBiddingPeroidOpen.click();
		dateBiddingPeroidOpen.sendKeys(date1 + " " + BiddingStart);
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']"))
				.sendKeys(date1 + " " + bidGuaranteeSubmissionDeadline);
		Actions action = new Actions(driver.get());
		WebElement element = driver.get().findElement(By.xpath("//input[@name='eventBiddingPeriodClose']"));

		action.moveToElement(element).build().perform();

		wait.until(ExpectedConditions.elementToBeClickable(dateBiddingPeriodClose));

		dateBiddingPeriodClose.click();
		dateBiddingPeriodClose.sendKeys(date1 + " " + BiddingEnd);
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
		dateEventAppOpen.click();
		dateEventAppOpen.sendKeys(date1 + " " + applicationOpen);
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
		dateEventAppClose.click();
		dateEventAppClose.sendKeys(date1 + " " + applicationClose);

		dateBidResultAvail.click();
		dateBidResultAvail.sendKeys(date2 + " " + resultsAvailable);
		
		dateBiddingPeriodClose.click();
		dateEventClosure.click();
		dateEventClosure.sendKeys(date2 + " " + eventClosure);

		dateFinantialSettlement.click();
		dateFinantialSettlement.sendKeys(date2 + " " + financialSettlement);
		}

	public void selectDates_PE3() throws InterruptedException {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		Date date = new Date();
		date1 = dateFormat.format(date);
		LocalTime myDateObj = LocalTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("Current time :" + formattedDate);
		String hrs = formattedDate.substring(0, 2);
		String min = formattedDate.substring(3, 5);
		int num = Integer.valueOf(min);
		int num2 = Integer.valueOf(hrs);
		LocalTime time = LocalTime.of(num2, num);
		LocalTime BiddingStart = time.plusHours(0).plusMinutes(5).plusSeconds(45);
		System.out.println("Bidding start time :" + BiddingStart);
		LocalTime BiddingEnd = time.plusHours(0).plusMinutes(30).plusSeconds(10);
		System.out.println("Bidding end time :" + BiddingEnd);
		LocalTime applicationOpen = time.minusHours(0).minusMinutes(10);
		System.out.println("application open time :" + applicationOpen);
		LocalTime applicationClose = time.minusHours(0).minusMinutes(5);
		System.out.println("application Close time :" + applicationClose);
		dateBiddingPeroidOpen.click();
		dateBiddingPeroidOpen.sendKeys(date1 + BiddingStart);
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
		Actions action = new Actions(driver.get());
		WebElement element = driver.get().findElement(By.xpath("//input[@name='eventBiddingPeriodClose']"));
		action.moveToElement(element).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(dateBiddingPeriodClose));
		dateBiddingPeriodClose.click();
		dateBiddingPeriodClose.sendKeys(date1 + BiddingEnd);
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
		dateEventAppOpen.click();
		dateEventAppOpen.sendKeys(date1 + applicationOpen);
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
		WebElement element2 = dateEventAppClose;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", element2);

		element2.click();
		dateEventAppClose.sendKeys(date1 + applicationClose);
	}

	public void selectDates_PE1() throws InterruptedException {
	ZoneId easternTimeZone = ZoneId.of("America/New_York");
    LocalDate today = LocalDate.now(easternTimeZone);
    LocalDate tomorrow = today.plusDays(1);
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    String date1 = today.format(dateFormat);
    System.out.println("Today's date: " + date1);
    String date2 = tomorrow.format(dateFormat);
    System.out.println("Tomorrow's date: " + date2);
	
	LocalTime myDateObj = LocalTime.now(easternTimeZone);
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
	String formattedDate = myDateObj.format(myFormatObj);
	System.out.println("Current time :" + formattedDate);
	String hrs = formattedDate.substring(0, 2);
	String min = formattedDate.substring(3, 5);
	int num = Integer.valueOf(min);
	int num2 = Integer.valueOf(hrs);

	LocalTime time = LocalTime.of(num2, num);
	LocalTime BiddingStart = time.plusHours(0).plusMinutes(7);
	System.out.println("Bidding start time :" + BiddingStart);
	LocalTime BiddingEnd = time.plusHours(2).plusMinutes(15);
	System.out.println("Bidding end time :" + BiddingEnd);
	LocalTime applicationOpen = time.plusHours(0).plusMinutes(0);
	System.out.println("application open time :" + applicationOpen);
	LocalTime applicationClose = time.plusHours(0).plusMinutes(5);
	System.out.println("application Close time :" + applicationClose);

	LocalTime bidGuaranteeSubmissionDeadline = time.plusHours(0).plusMinutes(6);
	
	LocalTime resultsAvailable = time.plusHours(4).plusMinutes(40);
	LocalTime eventClosure = time.plusHours(8).plusMinutes(40);
	LocalTime financialSettlement = time.plusHours(6).plusMinutes(40);

	System.out.println("Bid Guarantee Submission Deadline: " + bidGuaranteeSubmissionDeadline);
	System.out.println("Results Available: " + resultsAvailable);
	System.out.println("Event Closure: " + eventClosure);
	System.out.println("Financial Settlement: " + financialSettlement);

	dateBiddingPeroidOpen.click();
	dateBiddingPeroidOpen.sendKeys(date1 + " " + BiddingStart);
	driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
	driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']"))
			.sendKeys(date1 + " " + bidGuaranteeSubmissionDeadline);
	Actions action = new Actions(driver.get());
	WebElement element = driver.get().findElement(By.xpath("//input[@name='eventBiddingPeriodClose']"));

	action.moveToElement(element).build().perform();

	wait.until(ExpectedConditions.elementToBeClickable(dateBiddingPeriodClose));

	dateBiddingPeriodClose.click();
	dateBiddingPeriodClose.sendKeys(date1 + " " + BiddingEnd);
	driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
	dateEventAppOpen.click();
	dateEventAppOpen.sendKeys(date1 + " " + applicationOpen);
	driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
	dateEventAppClose.click();
	dateEventAppClose.sendKeys(date1 + " " + applicationClose);

	dateBidResultAvail.click();
	dateBidResultAvail.sendKeys(date2 + " " + resultsAvailable);

	dateEventClosure.click();
	dateEventClosure.sendKeys(date2 + " " + eventClosure);

	dateFinantialSettlement.click();
	dateFinantialSettlement.sendKeys(date2 + " " + financialSettlement);
	}
	
	public void selectDates_PEWa() throws InterruptedException {
		ZoneId easternTimeZone = ZoneId.of("America/New_York");
	    LocalDate today = LocalDate.now(easternTimeZone);
	    LocalDate tomorrow = today.plusDays(1);
	    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	    String date1 = today.format(dateFormat);
	    System.out.println("Today's date: " + date1);
	    String date2 = tomorrow.format(dateFormat);
	    System.out.println("Tomorrow's date: " + date2);
		
		LocalTime myDateObj = LocalTime.now(easternTimeZone);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("Current time :" + formattedDate);
		String hrs = formattedDate.substring(0, 2);
		String min = formattedDate.substring(3, 5);
		int num = Integer.valueOf(min);
		int num2 = Integer.valueOf(hrs);

		LocalTime time = LocalTime.of(num2, num);
		LocalTime BiddingStart = time.plusHours(0).plusMinutes(4).plusSeconds(30);
		System.out.println("Bidding start time :" + BiddingStart);
		LocalTime BiddingEnd = time.plusHours(2).plusMinutes(15);
		System.out.println("Bidding end time :" + BiddingEnd);
		LocalTime applicationOpen = time.plusHours(0).plusMinutes(0);
		System.out.println("application open time :" + applicationOpen);
		LocalTime applicationClose = time.plusHours(0).plusMinutes(3);
		System.out.println("application Close time :" + applicationClose);

		LocalTime bidGuaranteeSubmissionDeadline = time.plusHours(0).plusMinutes(4);
		;
		LocalTime resultsAvailable = time.plusHours(4).plusMinutes(40);
		LocalTime eventClosure = time.plusHours(8).plusMinutes(40);
		LocalTime financialSettlement = time.plusHours(6).plusMinutes(40);

		System.out.println("Bid Guarantee Submission Deadline: " + bidGuaranteeSubmissionDeadline);
		System.out.println("Results Available: " + resultsAvailable);
		System.out.println("Event Closure: " + eventClosure);
		System.out.println("Financial Settlement: " + financialSettlement);

		dateBiddingPeroidOpen.click();
		dateBiddingPeroidOpen.sendKeys(date1 + " " + BiddingStart);
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']"))
				.sendKeys(date1 + " " + bidGuaranteeSubmissionDeadline);
		Actions action = new Actions(driver.get());
		WebElement element = driver.get().findElement(By.xpath("//input[@name='eventBiddingPeriodClose']"));

		action.moveToElement(element).build().perform();

		wait.until(ExpectedConditions.elementToBeClickable(dateBiddingPeriodClose));

		dateBiddingPeriodClose.click();
		dateBiddingPeriodClose.sendKeys(date1 + " " + BiddingEnd);
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
		dateEventAppOpen.click();
		dateEventAppOpen.sendKeys(date1 + " " + applicationOpen);
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
		dateEventAppClose.click();
		dateEventAppClose.sendKeys(date1 + " " + applicationClose);

		dateBidResultAvail.click();
		dateBidResultAvail.sendKeys(date2 + " " + resultsAvailable);

		dateEventClosure.click();
		dateEventClosure.sendKeys(date2 + " " + eventClosure);

		dateFinantialSettlement.click();
		dateFinantialSettlement.sendKeys(date2 + " " + financialSettlement);
		}
	
	public void selectDates_PECa() throws InterruptedException {
		ZoneId easternTimeZone = ZoneId.of("America/New_York");
	    LocalDate today = LocalDate.now(easternTimeZone);
	    LocalDate tomorrow = today.plusDays(1);
	    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	    String date1 = today.format(dateFormat);
	    System.out.println("Today's date: " + date1);
	    String date2 = tomorrow.format(dateFormat);
	    System.out.println("Tomorrow's date: " + date2);
		
		LocalTime myDateObj = LocalTime.now(easternTimeZone);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("Current time :" + formattedDate);
		String hrs = formattedDate.substring(0, 2);
		String min = formattedDate.substring(3, 5);
		int num = Integer.valueOf(min);
		int num2 = Integer.valueOf(hrs);

		LocalTime time = LocalTime.of(num2, num);
		LocalTime BiddingStart = time.plusHours(0).plusMinutes(6);
		System.out.println("Bidding start time :" + BiddingStart);
		LocalTime BiddingEnd = time.plusHours(2).plusMinutes(15);
		System.out.println("Bidding end time :" + BiddingEnd);
		LocalTime applicationOpen = time.plusHours(0).plusMinutes(0);
		System.out.println("application open time :" + applicationOpen);
		LocalTime applicationClose = time.plusHours(0).plusMinutes(4);
		System.out.println("application Close time :" + applicationClose);

		LocalTime bidGuaranteeSubmissionDeadline = time.plusHours(0).plusMinutes(5);
		;
		LocalTime resultsAvailable = time.plusHours(4).plusMinutes(40);
		LocalTime eventClosure = time.plusHours(8).plusMinutes(40);
		LocalTime financialSettlement = time.plusHours(6).plusMinutes(40);

		System.out.println("Bid Guarantee Submission Deadline: " + bidGuaranteeSubmissionDeadline);
		System.out.println("Results Available: " + resultsAvailable);
		System.out.println("Event Closure: " + eventClosure);
		System.out.println("Financial Settlement: " + financialSettlement);

		dateBiddingPeroidOpen.click();
		dateBiddingPeroidOpen.sendKeys(date1 + " " + BiddingStart);
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']"))
				.sendKeys(date1 + " " + bidGuaranteeSubmissionDeadline);
		Actions action = new Actions(driver.get());
		WebElement element = driver.get().findElement(By.xpath("//input[@name='eventBiddingPeriodClose']"));

		action.moveToElement(element).build().perform();

		wait.until(ExpectedConditions.elementToBeClickable(dateBiddingPeriodClose));

		dateBiddingPeriodClose.click();
		dateBiddingPeriodClose.sendKeys(date1 + " " + BiddingEnd);
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
		dateEventAppOpen.click();
		dateEventAppOpen.sendKeys(date1 + " " + applicationOpen);
		driver.get().findElement(By.xpath("//input[@name='biddingGuaranteeSubmissionDeadline']")).click();
		dateEventAppClose.click();
		dateEventAppClose.sendKeys(date1 + " " + applicationClose);

		dateBidResultAvail.click();
		dateBidResultAvail.sendKeys(date2 + " " + resultsAvailable);
        
		dateBiddingPeriodClose.click();
		dateEventClosure.click();
		dateEventClosure.sendKeys(date2 + " " + eventClosure);

		dateFinantialSettlement.click();
		dateFinantialSettlement.sendKeys(date2 + " " + financialSettlement);
		}
	
	public void selectRollDownProcedure_PECa() throws Exception {
		try {
			rollDownbids.click();
			ObjectRepo.test.log(Status.PASS, "step 11 : Selected Roll down bids option");
		} catch (Exception e) {
			rollDownbids.click();
			ObjectRepo.test.log(Status.PASS, "step 11 : Selected Roll down bids option");
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(btnSave));
		btnSave.click();
		wait.until(ExpectedConditions.visibilityOf(successmsg));
		String alert = successmsg.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "The event has been created successfully.");
	}
	
	public void selectCombinedEvaluationOfTiers_PEQc() throws Exception {
		
		try {
			includebids.click();
			ObjectRepo.test.log(Status.PASS, "step 11 : Selected Combined Evaluation of Categories option");
		} catch (Exception e) {
			includebids.click();
			ObjectRepo.test.log(Status.PASS, "step 11 : Selected Combined Evaluation of Categories option");
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(btnSave));
		btnSave.click();
		wait.until(ExpectedConditions.visibilityOf(successmsg));
		String alert = successmsg.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "The event has been created successfully.");
	}
	
    public void selectEmissionUnitsPerLot_PEQc() throws Exception {
    	WebElement elementA = EmissionUnitsPerLot;
	Actions action = new Actions(driver.get());
	action.moveToElement(elementA).build().perform();
	action.doubleClick(elementA).build().perform();
	Thread.sleep(2000);
	EmissionUnitsPerLot.sendKeys("1");
	Thread.sleep(2000);
    }

	public void selectAlgorithm() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(dropdownAlgorithm));
		WebElement dropdownAlg = dropdownAlgorithm;
		Select select1 = new Select(dropdownAlg);
		try {
			driver.get().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[2]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		select1.selectByVisibleText("Algorithm for Individual/Joint Auctions");
		wait.until(ExpectedConditions.elementToBeClickable(btnSave));
		btnSave.click();
		wait.until(ExpectedConditions.visibilityOf(successmsg));
		String alert = successmsg.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "The event has been created successfully.");
	}

	public void selectAlgorithm_PE1() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(dropdownAlgorithm));
		WebElement dropdownAlg = dropdownAlgorithm;
		Select select1 = new Select(dropdownAlg);
		select1.selectByVisibleText("Algorithm for Individual/Joint Auctions");
		wait.until(ExpectedConditions.elementToBeClickable(btnSave));
		btnSave.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(successmsg));
		String alert = successmsg.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "The event has been created successfully.");
	}
	
	public void selectAlgorithm_PEWa() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(dropdownAlgorithm));
		WebElement dropdownAlg = dropdownAlgorithm;
		Select select1 = new Select(dropdownAlg);
		select1.selectByVisibleText("Algorithm for Individual/Joint Auctions");
		wait.until(ExpectedConditions.elementToBeClickable(btnSave));
		btnSave.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(successmsg));
		String alert = successmsg.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "The event has been created successfully.");
	}

	public void createEventForJointAuction() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent(); // Event Id
		selectEventTypeFromDropDown();
		enterEventName();
		selectJurisdictionForJointAuction();
		currencyAccForjointAuction();
		selectVintage();
		selectVintageType();
		selectProcessingOrder(); // Dates and Times
		selectDates();
		selectAlgorithm();
	}

	public void createEventForJointAuction_PE1() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PE1(); // Event Id
		selectEventTypeFromDropDown();
		enterEventName_PE1();
		selectJurisdictionForJointAuctionA42();
		currencyAccForjointAuction_PE1();
		selectVintage_PE1();
		selectVintageType_PE1();
		selectProcessingOrder_PE1(); // Dates and Times
		selectDates();
		selectAlgorithm_PE1();
	}
	
	public void createEventForWashingtonAuctionEvent() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PEWa(); // Event Id
		selectEventTypeFromDropDown();
		enterEventName_PEWa();
		selectJurisdictionWashingtonAuctionEvent();
		currencyAccForWashingtonAuctionEvent();
		selectVintage_PEWa();
		selectVintageType_PEWa();
		selectProcessingOrder_PEWa(); // Dates and Times
		selectDates_PEWa();
		selectAlgorithm_PEWa();
	}
	
	public void createEventForWashingtonAuctionEventA278() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PEWa2(); // Event Id
		selectEventTypeFromDropDown();
		enterEventName_PEWa2();
		selectJurisdictionWashingtonAuctionEvent();
		currencyAccForWashingtonAuctionEventA278();
		selectVintage_PEWa2();
		selectVintageType_PEWa();
		selectProcessingOrder_PEWa(); // Dates and Times
		selectDates();
		selectAlgorithm_PEWa();
	}
	
	public void createEventForCaReserveSaleEvent() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PECa(); // Event Id
		selectEventTypeFromDropDownCa();
		enterEventName_PECa();
		//selectJurisdictionWashingtonAuctionEvent();
		currencyAccForCaReserveSaleEvent();
		selectTiers1_R317();
		selectTiers2_R317();
		//selectVintage_PEWa();
		//selectVintageType_PEWa();
		//selectProcessingOrder_PEWa(); // Dates and Times
		selectDates_PECa();
		Thread.sleep(2000);
		selectEmissionUnitsPerLot_PEQc();
		selectRollDownProcedure_PECa();
	}
	
	public void createEventForWaReserveSaleEvent_REWA1() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_REWA1(); // Event Id
		selectEventTypeFromDropDownREWA1();
		enterEventName_REWA1();
		//selectJurisdictionWashingtonAuctionEvent();
		currencyAccForCaReserveSaleEvent();
		selectTiers1_R319();
		selectTiers2_R319();
		selectTiers3_R319();
		//selectVintage_PEWa();
		//selectVintageType_PEWa();
		//selectProcessingOrder_PEWa(); // Dates and Times
		selectDates_PECa();
		Thread.sleep(2000);
		selectEmissionUnitsPerLot_PEQc();
		selectCombinedEvaluationOfTiers_PEQc();
	}
	
	public void createEventForWaReserveSaleEvent_REWA2() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_REWA2(); // Event Id
		selectEventTypeFromDropDownREWA1();
		enterEventName_REWA2();
		currencyAccForCaReserveSaleEvent();
		
		selectTiers1_R325();
		selectTiers2_R325();
		
		selectDates_PECa();
		Thread.sleep(2000);
		selectEmissionUnitsPerLot_PEQc();
		selectCombinedEvaluationOfTiers_PEQc();
	}
	
	public void createEventForSBMA_R69() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PEQc(); // Event Id
		selectEventTypeFromDropDownQc();
		enterEventNameEng_PEQc();
		enterEventNameFr_PEQc();
		//selectJurisdictionWashingtonAuctionEvent();
		currencyAccForQcSBMAEvent();
		selectCategoryA_R69();
		selectCategoryB_R69();
		selectCategoryC_R69();
		//selectVintage_PEWa();
		//selectVintageType_PEWa();
		//selectProcessingOrder_PEWa(); // Dates and Times
		selectDates();
		Thread.sleep(2000);
		selectEmissionUnitsPerLot_PEQc();
		selectCombinedEvaluationOfTiers_PEQc();
	}
	
	public void createEventForSBMA_R70() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PEQc1(); // Event Id
		selectEventTypeFromDropDownQc();
		enterEventNameEng_PEQc1();
		enterEventNameFr_PEQc1();
		//selectJurisdictionWashingtonAuctionEvent();
		currencyAccForQcSBMAEvent();
		selectCategoryA_R70();
		selectCategoryB_R70();
		selectCategoryC_R70();
		//selectVintage_PEWa();
		//selectVintageType_PEWa();
		//selectProcessingOrder_PEWa(); // Dates and Times
		selectDates();
		Thread.sleep(2000);
		selectEmissionUnitsPerLot_PEQc();
		selectCombinedEvaluationOfTiers_PEQc();
	}
	
	public void createEventForSBMA_R71() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PEQc2(); // Event Id
		selectEventTypeFromDropDownQc();
		enterEventNameEng_PEQc2();
		enterEventNameFr_PEQc2();
		//selectJurisdictionWashingtonAuctionEvent();
		currencyAccForQcSBMAEvent();
		selectCategoryA_R71();
		selectCategoryB_R71();
		selectCategoryC_R71();
		//selectVintage_PEWa();
		//selectVintageType_PEWa();
		//selectProcessingOrder_PEWa(); // Dates and Times
		selectDates();
		Thread.sleep(2000);
		selectEmissionUnitsPerLot_PEQc();
		selectCombinedEvaluationOfTiers_PEQc();
	}
	
	public void createEventForSBMA_R72() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PEQc3(); // Event Id
		selectEventTypeFromDropDownQc();
		enterEventNameEng_PEQc3();
		enterEventNameFr_PEQc3();
		//selectJurisdictionWashingtonAuctionEvent();
		currencyAccForQcSBMAEvent();
		selectCategoryA_R72();
		selectCategoryB_R72();
		selectCategoryC_R72();
		//selectVintage_PEWa();
		//selectVintageType_PEWa();
		//selectProcessingOrder_PEWa(); // Dates and Times
		selectDates();
		Thread.sleep(2000);
		selectEmissionUnitsPerLot_PEQc();
		selectCombinedEvaluationOfTiers_PEQc();
	}
	
	public void createEventForSBMA_R76() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PEQc6(); // Event Id
		selectEventTypeFromDropDownQc();
		enterEventNameEng_PEQc6();
		enterEventNameFr_PEQc6();
		//selectJurisdictionWashingtonAuctionEvent();
		currencyAccForQcSBMAEvent();
		selectCategoryA_R76();
		selectCategoryB_R76();
		selectCategoryC_R76();
		//selectVintage_PEWa();
		//selectVintageType_PEWa();
		//selectProcessingOrder_PEWa(); // Dates and Times
		selectDates();
		Thread.sleep(2000);
		selectEmissionUnitsPerLot_PEQc();
		selectCombinedEvaluationOfTiers_PEQc();
	}
	
	public void createEventForSBMA_R73() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PEQc4(); // Event Id
		selectEventTypeFromDropDownQc();
		enterEventNameEng_PEQc4();
		enterEventNameFr_PEQc4();
		//selectJurisdictionWashingtonAuctionEvent();
		currencyAccForQcSBMAEvent();
		selectCategoryA_R73();
		selectCategoryB_R73();
		selectCategoryC_R73();
		//selectVintage_PEWa();
		//selectVintageType_PEWa();
		//selectProcessingOrder_PEWa(); // Dates and Times
		selectDates();
		Thread.sleep(2000);
		selectEmissionUnitsPerLot_PEQc();
		selectCombinedEvaluationOfTiers_PEQc();
		
	}
	
	public void createEventForSBMA_R74() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PEQc5(); // Event Id
		selectEventTypeFromDropDownQc();
		enterEventNameEng_PEQc5();
		enterEventNameFr_PEQc5();
		//selectJurisdictionWashingtonAuctionEvent();
		currencyAccForQcSBMAEvent();
		selectCategoryA_R74();
		selectCategoryB_R74();
		selectCategoryC_R74();
		//selectVintage_PEWa();
		//selectVintageType_PEWa();
		//selectProcessingOrder_PEWa(); // Dates and Times
		selectDates();
		Thread.sleep(2000);
		selectEmissionUnitsPerLot_PEQc();
		selectCombinedEvaluationOfTiers_PEQc();
		
	}
	
	

	public void createEventForJointAuction_PE2() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PE2(); // Event Id
		selectEventTypeFromDropDown();
		enterEventName_PE2();
		selectJurisdictionForJointAuctionA45();
		currencyAccForjointAuction_PE2();
		selectVintage_PE2();
		selectVintageType_PE2();
		selectProcessingOrder_PE2(); // Dates and Times
		selectDates_PE2();
		selectAlgorithm_PE1();
	}

	public void createEventForJointAuction_PE3() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PE3(); // Event Id
		selectEventTypeFromDropDown();
		enterEventName_PE3();
		selectJurisdictionForJointAuctionA46();
		currencyAccForjointAuction_PE3();
		selectVintage_PE3();
		selectVintageType_PE2();// Has only current Allowance --IT will work
		selectProcessingOrder_PE2(); // Dates and Times
		selectDates();
		selectAlgorithm_PE1();

	}

	public void createEventForJointAuction_PE5() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PE5();
		selectEventTypeFromDropDown();
		enterEventName_PE5();
		selectJurisdictionForJointAuctionA48();
		currencyAccForjointAuction_PE5();
		selectVintage_PE5();
		selectVintageType_PE2();
		selectProcessingOrder_PE2();
		selectDates();
		selectAlgorithm_PE1();

	}

	public void createEventForJointAuction_PE6() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PE6(); // Event Id
		selectEventTypeFromDropDown();
		enterEventName_PE6();
		selectJurisdictionForJointAuctionA49();
		currencyAccForjointAuction_PE6();
		selectVintage_PE6();
		selectVintageType_PE2();// Has only current Allowance --IT will work
		selectProcessingOrder_PE2(); // Dates and Times
		selectDates();
		selectAlgorithm_PE1();

	}

	public void createEventForJointAuction_PE7() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PE7(); // Event Id
		selectEventTypeFromDropDown();
		enterEventName_PE7();
		selectJurisdictionForJointAuctionA50();
		currencyAccForjointAuction_PE7();
		selectVintage_PE7();
		selectVintageType_PE2();// Has only current Allowance --IT will work
		selectProcessingOrder_PE2(); // Dates and Times
		selectDates();
		selectAlgorithm_PE1();

	}

	public void createEventForJointAuction_PE8() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PE8(); // Event Id
		selectEventTypeFromDropDown();
		enterEventName_PE8();
		selectJurisdictionForJointAuctionA51();
		currencyAccForjointAuction_PE8();
		selectVintage_PE8();
		selectVintageType_PE2();// Has only current Allowance --IT will work
		selectProcessingOrder_PE2(); // Dates and Times
		selectDates();
		selectAlgorithm_PE1();

	}

	public void createEventForJointAuction_PE9() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PE9(); // Event Id
		selectEventTypeFromDropDown();
		enterEventName_PE9();
		selectJurisdictionForJointAuctionA56();
		currencyAccForjointAuction_PE9();
		selectVintage_PE9();
		selectVintageType_PE2();// Has only current Allowance --IT will work
		selectProcessingOrder_PE2(); // Dates and Times
		selectDates();
		selectAlgorithm_PE1();

	}

	public void createEventForJointAuction_PE10() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PE10(); // Event Id
		selectEventTypeFromDropDown();
		enterEventName_PE10();
		selectJurisdictionForJointAuctionA57();
		currencyAccForjointAuction_PE10();
		selectVintage_PE10();
		selectVintageType_PE2();
		selectProcessingOrder_PE2();
		selectDates();
		selectAlgorithm_PE1();
	}
	
	public void createEventForJointAuction_PE11() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PE11(); // Event Id
		selectEventTypeFromDropDown();
		enterEventName_PE11();
		selectJurisdictionForJointAuctionA297();
		currencyAccForjointAuction_PE11();
		selectVintage_PE11();
		selectVintageType_PE2();
		selectProcessingOrder_PE2();
		selectDates();
		selectAlgorithm_PE1();
	}
	
	public void createEventForJointAuction_PE12() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PE12(); // Event Id
		selectEventTypeFromDropDown();
		enterEventName_PE12();
		selectJurisdictionForJointAuctionA298();
		currencyAccForjointAuction_PE11();
		selectVintage_PE12();
		selectVintageType_PE2();
		selectProcessingOrder_PE2();
		selectDates();
		selectAlgorithm_PE1();
	}

	public void createEventForJointAuction_PE4() throws Exception {
		clickbtnAdmin();
		clickbtnEvent();
		clickbtnCreateEvent();
		gettextBoxEvent_PE4();
		selectEventTypeFromDropDown();
		enterEventName_PE4();
		selectJurisdictionForJointAuctionA47();
		currencyAccForjointAuction_PE4();
		selectVintage_PE4();
		selectVintageType_PE2();
		selectProcessingOrder_PE2();
		selectDates();
		selectAlgorithm_PE1();

	}

	public void CaliforniaJuridictionApprovalForEventCreation() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtnReport);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtnReport).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		wait.until(ExpectedConditions.visibilityOf(ApprovalMessage));
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
	}

	public void CaliforniaJuridictionApprovalForEventCreation_PE1() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PE1);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PE1).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
//		Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
//		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
	}
	
	public void WashingtonFirstSponsorApprovalForEventCreation_PEWa() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PEWa);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PEWa).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		Thread.sleep(3000);
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
//		Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
//		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
	}
	
	public void WashingtonFirstSponsorApprovalForEventCreation_PEWa2() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PEWa2);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PEWa2).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		Thread.sleep(3000);
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
//		Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
	}
	
	public void californiaFirstSponsorApprovalForEventCreation_PECa() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PECa);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PECa).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		Thread.sleep(3000);
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
//		Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
	}
	
	public void WashingtonFirstSponsorApprovalForEventCreation_REWA1() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_REWA1);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_REWA1).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		Thread.sleep(3000);
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
//		Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
	}
	
	public void WashingtonFirstSponsorApprovalForEventCreation_REWA2() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_REWA2);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_REWA2).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		Thread.sleep(3000);
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
//		Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
	}
	
	public void quebecFirstSponsorApprovalForEventCreation_PEQc() throws InterruptedException {
		
		//wait.until(ExpectedConditions.elementToBeClickable(eventDetailsBtn_PEQc));

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PEQc);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PEQc).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		Thread.sleep(3000);
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
//		Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
	}
	
public void quebecFirstSponsorApprovalForEventCreation_PEQc1() throws InterruptedException {
		
		//wait.until(ExpectedConditions.elementToBeClickable(eventDetailsBtn_PEQc));

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PEQc1);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PEQc1).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		Thread.sleep(3000);
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
//		Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
	}

public void quebecFirstSponsorApprovalForEventCreation_PEQc2() throws InterruptedException {
	
	//wait.until(ExpectedConditions.elementToBeClickable(eventDetailsBtn_PEQc));

	JavascriptExecutor js = (JavascriptExecutor) driver.get();
	WebElement element1 = driver.get().findElement(eventDetailsBtn_PEQc2);
	js.executeScript("arguments[0].scrollIntoView();", element1);
	driver.get().findElement(eventDetailsBtn_PEQc2).click();
	wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
	btnfirstApproval.click();
	wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
	btnSubmit1.click();
	Thread.sleep(3000);
	String alert = ApprovalMessage.getText();
	System.out.println(alert);
//	Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
	ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
}

public void quebecFirstSponsorApprovalForEventCreation_PEQc3() throws InterruptedException {
	
	//wait.until(ExpectedConditions.elementToBeClickable(eventDetailsBtn_PEQc));

	JavascriptExecutor js = (JavascriptExecutor) driver.get();
	WebElement element1 = driver.get().findElement(eventDetailsBtn_PEQc3);
	js.executeScript("arguments[0].scrollIntoView();", element1);
	driver.get().findElement(eventDetailsBtn_PEQc3).click();
	wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
	btnfirstApproval.click();
	wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
	btnSubmit1.click();
	Thread.sleep(3000);
	String alert = ApprovalMessage.getText();
	System.out.println(alert);
//	Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
	ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
}

public void quebecFirstSponsorApprovalForEventCreation_PEQc6() throws InterruptedException {
	
	//wait.until(ExpectedConditions.elementToBeClickable(eventDetailsBtn_PEQc));

	JavascriptExecutor js = (JavascriptExecutor) driver.get();
	WebElement element1 = driver.get().findElement(eventDetailsBtn_PEQc6);
	js.executeScript("arguments[0].scrollIntoView();", element1);
	driver.get().findElement(eventDetailsBtn_PEQc6).click();
	wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
	btnfirstApproval.click();
	wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
	btnSubmit1.click();
	Thread.sleep(3000);
	String alert = ApprovalMessage.getText();
	System.out.println(alert);
//	Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
	ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
}

public void quebecFirstSponsorApprovalForEventCreation_PEQc4() throws InterruptedException {
	
	//wait.until(ExpectedConditions.elementToBeClickable(eventDetailsBtn_PEQc));

	JavascriptExecutor js = (JavascriptExecutor) driver.get();
	WebElement element1 = driver.get().findElement(eventDetailsBtn_PEQc4);
	js.executeScript("arguments[0].scrollIntoView();", element1);
	driver.get().findElement(eventDetailsBtn_PEQc4).click();
	wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
	btnfirstApproval.click();
	wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
	btnSubmit1.click();
	Thread.sleep(3000);
	String alert = ApprovalMessage.getText();
	System.out.println(alert);
//	Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
	ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
}

public void quebecFirstSponsorApprovalForEventCreation_PEQc5() throws InterruptedException {
	
	//wait.until(ExpectedConditions.elementToBeClickable(eventDetailsBtn_PEQc));

	JavascriptExecutor js = (JavascriptExecutor) driver.get();
	WebElement element1 = driver.get().findElement(eventDetailsBtn_PEQc5);
	js.executeScript("arguments[0].scrollIntoView();", element1);
	driver.get().findElement(eventDetailsBtn_PEQc5).click();
	wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
	btnfirstApproval.click();
	wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
	btnSubmit1.click();
	Thread.sleep(3000);
	String alert = ApprovalMessage.getText();
	System.out.println(alert);
//	Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
	ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
}

	public void CaliforniaJuridictionApprovalForEventCreation_PE2() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PE2);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PE2).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
//		Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");

	}

	public void CaliforniaJuridictionApprovalForEventCreation_PE3() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PE3);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PE3).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
//		Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");

	}
	
	public void CaliforniaJuridictionApprovalForEventCreation_PE4() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PE4);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PE4).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
		//Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
	}

	public void CaliforniaJuridictionApprovalForEventCreation_PE5() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PE5);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PE5).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
		//Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");

	}

	public void CaliforniaJuridictionApprovalForEventCreation_PE6() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PE6);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PE6).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
		//Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");

	}

	public void CaliforniaJuridictionApprovalForEventCreation_PE7() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PE7);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PE7).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
		//Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
	}

	public void CaliforniaJuridictionApprovalForEventCreation_PE8() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PE8);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PE8).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
		//Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");

	}

	public void CaliforniaJuridictionApprovalForEventCreation_PE9() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PE9);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PE9).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();
		String alert = ApprovalMessage.getText();
		System.out.println(alert);
	//	Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
	}

	public void CaliforniaJuridictionApprovalForEventCreation_PE10() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PE10);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PE10).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();

		String alert = ApprovalMessage.getText();
		System.out.println(alert);
		//Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
	}
	
	public void CaliforniaJuridictionApprovalForEventCreation_PE11() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PE11);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PE11).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();

		String alert = ApprovalMessage.getText();
		System.out.println(alert);
		//Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
	}
	
	public void CaliforniaJuridictionApprovalForEventCreation_PE12() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element1 = driver.get().findElement(eventDetailsBtn_PE12);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		driver.get().findElement(eventDetailsBtn_PE12).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnfirstApproval));
		btnfirstApproval.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		btnSubmit1.click();

		String alert = ApprovalMessage.getText();
		System.out.println(alert);
		//Assert.assertEquals(alert, "The approval of the event creation has been proposed by the first sponsor.");
		ObjectRepo.test.log(Status.PASS, "The approval of the event creation has been proposed by the first sponsor.");
	}

	public void runtimesponsorLoginCa() throws InterruptedException {
		try {
			username.sendKeys(prop.getProperty("UserSponsorCa2"));
			ObjectRepo.test.log(Status.PASS, "Sponsor Username Entered  : " + prop.getProperty("UserSponsorCa2"));
			password.sendKeys(prop.getProperty("Password1"));
			ObjectRepo.test.log(Status.PASS, "Sponsor Password Entered  : " + prop.getProperty("Password1"));
			btnLogin.click();
			System.out.println("" + prop.getProperty("UserSponsorCa2") + " Sponsor (California) login successfully");
			ObjectRepo.test.log(Status.PASS,
					"" + prop.getProperty("UserSponsorCa2") + " Sponsor (California) login successfully");
		} catch (Exception e) {

			wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
			btnLogin.click();
			username.clear();
			password.clear();
			username.sendKeys(prop.getProperty("UserSponsorCa2"));
			ObjectRepo.test.log(Status.PASS, "Sponsor Username Entered  : " + prop.getProperty("UserSponsorCa2"));
			password.sendKeys(prop.getProperty("Password1"));
			ObjectRepo.test.log(Status.PASS, "Sponsor Password Entered  : " + prop.getProperty("Password1"));
			btnLogin2.click();
			System.out.println("" + prop.getProperty("UserSponsorCa2") + " Sponsor (California) login successfully");
			ObjectRepo.test.log(Status.PASS,
					"" + prop.getProperty("UserSponsorCa2") + " Sponsor (California) login successfully");
		}

	}

	public void secondApproval() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtnReport);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
		} catch (Exception e) {

			btnApprovalQue.click();
		}
		try {
			btnSubmit1.click();
		} catch (Exception e) {
			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	public void SecondApproval_PE1() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
		} catch (Exception e) {

			btnApprovalQue.click();
		}
		try {
			
			btnSubmit1.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			
            btnSubmit2.click();
            Thread.sleep(2000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		WebElement abc1 = popupBtn;
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		Thread.sleep(3000);
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	public void SecondApproval_PE2() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE2);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
		} catch (Exception e) {

			btnApprovalQue.click();
		}
		try {

			btnSubmit1.click();
		} catch (Exception e) {

			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	public void SecondApproval_PE3() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE3);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
			Thread.sleep(2000);;
		} catch (Exception e) {

			btnApprovalQue.click();
			Thread.sleep(2000);
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
			btnSubmit1.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit2));
			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		Thread.sleep(3000);		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}
	
	public void SecondApproval_PE4() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE4);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
			Thread.sleep(2000);;
		} catch (Exception e) {

			btnApprovalQue.click();
			Thread.sleep(2000);
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
			btnSubmit1.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit2));
			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		Thread.sleep(3000);		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	public void SecondApproval_PE5() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE5);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
			Thread.sleep(2000);;
		} catch (Exception e) {

			btnApprovalQue.click();
			Thread.sleep(2000);
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
			btnSubmit1.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit2));
			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		Thread.sleep(3000);		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	public void SecondApproval_PE6() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE6);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
			Thread.sleep(2000);;
		} catch (Exception e) {

			btnApprovalQue.click();
			Thread.sleep(2000);
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
			btnSubmit1.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit2));
			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		Thread.sleep(3000);		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	public void SecondApproval_PE7() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE7);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
			Thread.sleep(2000);;
		} catch (Exception e) {

			btnApprovalQue.click();
			Thread.sleep(2000);
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
			btnSubmit1.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit2));
			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		Thread.sleep(3000);		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	public void SecondApproval_PE8() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE8);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
			Thread.sleep(2000);;
		} catch (Exception e) {

			btnApprovalQue.click();
			Thread.sleep(2000);
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
			btnSubmit1.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit2));
			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		Thread.sleep(3000);		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	public void SecondApproval_PE9() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE9);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
			Thread.sleep(2000);;
		} catch (Exception e) {

			btnApprovalQue.click();
			Thread.sleep(2000);
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
			btnSubmit1.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit2));
			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		Thread.sleep(3000);		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	public void SecondApproval_PE10() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE10);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
			Thread.sleep(2000);;
		} catch (Exception e) {

			btnApprovalQue.click();
			Thread.sleep(2000);
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
			btnSubmit1.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit2));
			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		Thread.sleep(3000);		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}
	
	public void SecondApproval_PE11() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE11);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
			Thread.sleep(2000);;
		} catch (Exception e) {

			btnApprovalQue.click();
			Thread.sleep(2000);
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
			btnSubmit1.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit2));
			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		Thread.sleep(3000);		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}
	
	public void SecondApproval_PE12() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE12);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
			Thread.sleep(2000);;
		} catch (Exception e) {

			btnApprovalQue.click();
			Thread.sleep(2000);
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
			btnSubmit1.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit2));
			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		Thread.sleep(3000);		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	
	public void secondApproval_PE1() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
		} catch (Exception e) {

			btnApprovalQue.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		try {
			btnSubmit1.click();
		} catch (Exception e) {

			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(abc1));
		abc1.click();
		Thread.sleep(2000);
		
		String alert = driver.get().findElement(By.xpath("//*[text()='The creation of the event has been approved by both Sponsors.']")).getText();
		System.out.println(alert);
		//Assert.assertEquals(alert,"The creation of the event has been approved by both Sponsors.");
		//ObjectRepo.test.log(Status.PASS, "The creation of the event has been approved by both Sponsors.");
		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}
	
	public void secondApproval_PEWa() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		Thread.sleep(5000);		
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEWa);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSecondApproval));
			btnSecondApproval.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			btnSecondApproval.click();
			Thread.sleep(3000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		try {
			btnSubmit1.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {

			btnSubmit2.click();
			Thread.sleep(3000);
	
		}
		//WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		popupBtn.click();
		Thread.sleep(3000);
		
		String alert = driver.get().findElement(By.xpath("//*[text()='The event has been approved.']")).getText();
		System.out.println(alert);
		//Assert.assertEquals(alert,"The event has been approved.");
		//ObjectRepo.test.log(Status.PASS, "The event has been approved.");
		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Washington jurisdiction");
	}
	
	public void secondApproval_PEWa2() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		Thread.sleep(5000);		
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEWa2);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSecondApproval));
			btnSecondApproval.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			btnSecondApproval.click();
			Thread.sleep(3000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		try {
			btnSubmit1.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {

			btnSubmit2.click();
			Thread.sleep(3000);
	
		}
		//WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		popupBtn.click();
		Thread.sleep(3000);
		
		String alert = driver.get().findElement(By.xpath("//*[text()='The event has been approved.']")).getText();
		System.out.println(alert);
		//Assert.assertEquals(alert,"The event has been approved.");
		//ObjectRepo.test.log(Status.PASS, "The event has been approved.");
		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Washington jurisdiction");
	}
	
	public void secondApproval_PECa() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		Thread.sleep(5000);		
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PECa);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSecondApproval));
			btnSecondApproval.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			btnSecondApproval.click();
			Thread.sleep(3000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		try {
			btnSubmit1.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {

			btnSubmit2.click();
			Thread.sleep(3000);
	
		}
		//WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		popupBtn.click();
		Thread.sleep(3000);
		
		String alert = driver.get().findElement(By.xpath("//*[text()='The event has been approved.']")).getText();
		System.out.println(alert);
		//Assert.assertEquals(alert,"The event has been approved.");
		ObjectRepo.test.log(Status.PASS, "The event has been approved.");
		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by California jurisdiction");
	}
	
	public void secondApproval_REWA1() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		Thread.sleep(5000);		
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_REWA1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSecondApproval));
			btnSecondApproval.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			btnSecondApproval.click();
			Thread.sleep(3000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		try {
			btnSubmit1.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {

			btnSubmit2.click();
			Thread.sleep(3000);
	
		}
		//WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		popupBtn.click();
		Thread.sleep(3000);
		
		String alert = driver.get().findElement(By.xpath("//*[text()='The event has been approved.']")).getText();
		System.out.println(alert);
		//Assert.assertEquals(alert,"The event has been approved.");
		ObjectRepo.test.log(Status.PASS, "The event has been approved.");
		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Washington jurisdiction");
	}
	
	public void secondApproval_REWA2() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		Thread.sleep(5000);		
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_REWA2);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSecondApproval));
			btnSecondApproval.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			btnSecondApproval.click();
			Thread.sleep(3000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		try {
			btnSubmit1.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {

			btnSubmit2.click();
			Thread.sleep(3000);
	
		}
		//WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		popupBtn.click();
		Thread.sleep(3000);
		
		String alert = driver.get().findElement(By.xpath("//*[text()='The event has been approved.']")).getText();
		System.out.println(alert);
		//Assert.assertEquals(alert,"The event has been approved.");
		ObjectRepo.test.log(Status.PASS, "The event has been approved.");
		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Washington jurisdiction");
	}
	
	public void secondApproval_PEQc() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		Thread.sleep(2000);
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		Thread.sleep(5000);		
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEQc);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSecondApproval));
			btnSecondApproval.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			btnSecondApproval.click();
			Thread.sleep(3000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		try {
			btnSubmit1.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {

			btnSubmit2.click();
			Thread.sleep(3000);
	
		}
		//WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		popupBtn.click();
		Thread.sleep(3000);
		
		String alert = driver.get().findElement(By.xpath("//*[text()='The creation of the event has been approved by both Sponsors.']")).getText();
		System.out.println(alert);
		//Assert.assertEquals(alert,"The creation of the event has been approved by both Sponsors.");
		ObjectRepo.test.log(Status.PASS, "The creation of the event has been approved by both Sponsors.");
		
	}
	
	public void secondApproval_PEQc1() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		Thread.sleep(2000);
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		Thread.sleep(5000);		
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEQc1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSecondApproval));
			btnSecondApproval.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			btnSecondApproval.click();
			Thread.sleep(3000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		try {
			btnSubmit1.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {

			btnSubmit2.click();
			Thread.sleep(3000);
	
		}
		//WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		popupBtn.click();
		Thread.sleep(3000);
		
		String alert = driver.get().findElement(By.xpath("//*[text()='The creation of the event has been approved by both Sponsors.']")).getText();
		System.out.println(alert);
		//Assert.assertEquals(alert,"The creation of the event has been approved by both Sponsors.");
		ObjectRepo.test.log(Status.PASS, "The creation of the event has been approved by both Sponsors.");
	}
	
	public void secondApproval_PEQc2() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		Thread.sleep(2000);
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		Thread.sleep(5000);		
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEQc2);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSecondApproval));
			btnSecondApproval.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			btnSecondApproval.click();
			Thread.sleep(3000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		try {
			btnSubmit1.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {

			btnSubmit2.click();
			Thread.sleep(3000);
	
		}
		//WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		popupBtn.click();
		Thread.sleep(3000);
		
		String alert = driver.get().findElement(By.xpath("//*[text()='The creation of the event has been approved by both Sponsors.']")).getText();
		System.out.println(alert);
		//Assert.assertEquals(alert,"The creation of the event has been approved by both Sponsors.");
		ObjectRepo.test.log(Status.PASS, "The creation of the event has been approved by both Sponsors.");
	}
	
	public void secondApproval_PEQc3() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		Thread.sleep(2000);
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		Thread.sleep(5000);		
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEQc3);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSecondApproval));
			btnSecondApproval.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			btnSecondApproval.click();
			Thread.sleep(3000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		try {
			btnSubmit1.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {

			btnSubmit2.click();
			Thread.sleep(3000);
	
		}
		//WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		popupBtn.click();
		Thread.sleep(3000);
		
		String alert = driver.get().findElement(By.xpath("//*[text()='The creation of the event has been approved by both Sponsors.']")).getText();
		System.out.println(alert);
		//Assert.assertEquals(alert,"The creation of the event has been approved by both Sponsors.");
		ObjectRepo.test.log(Status.PASS, "The creation of the event has been approved by both Sponsors.");
	}
	
	public void secondApproval_PEQc6() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		Thread.sleep(2000);
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		Thread.sleep(5000);		
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEQc6);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSecondApproval));
			btnSecondApproval.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			btnSecondApproval.click();
			Thread.sleep(3000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		try {
			btnSubmit1.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {

			btnSubmit2.click();
			Thread.sleep(3000);
	
		}
		//WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		popupBtn.click();
		Thread.sleep(3000);
		
		String alert = driver.get().findElement(By.xpath("//*[text()='The creation of the event has been approved by both Sponsors.']")).getText();
		System.out.println(alert);
		//Assert.assertEquals(alert,"The creation of the event has been approved by both Sponsors.");
		ObjectRepo.test.log(Status.PASS, "The creation of the event has been approved by both Sponsors.");
	}
	
	public void secondApproval_PEQc4() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		Thread.sleep(2000);
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		Thread.sleep(5000);		
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEQc4);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSecondApproval));
			btnSecondApproval.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			btnSecondApproval.click();
			Thread.sleep(3000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		try {
			btnSubmit1.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {

			btnSubmit2.click();
			Thread.sleep(3000);
	
		}
		//WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		popupBtn.click();
		Thread.sleep(3000);
		
		String alert = driver.get().findElement(By.xpath("//*[text()='The creation of the event has been approved by both Sponsors.']")).getText();
		System.out.println(alert);
		//Assert.assertEquals(alert,"The creation of the event has been approved by both Sponsors.");
		ObjectRepo.test.log(Status.PASS, "The creation of the event has been approved by both Sponsors.");
	}
	
	public void secondApproval_PEQc5() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		Thread.sleep(2000);
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		Thread.sleep(5000);		
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEQc5);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnSecondApproval));
			btnSecondApproval.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			btnSecondApproval.click();
			Thread.sleep(3000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		try {
			btnSubmit1.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {

			btnSubmit2.click();
			Thread.sleep(3000);
	
		}
		//WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(popupBtn));
		popupBtn.click();
		Thread.sleep(3000);
		
		String alert = driver.get().findElement(By.xpath("//*[text()='The creation of the event has been approved by both Sponsors.']")).getText();
		System.out.println(alert);
		//Assert.assertEquals(alert,"The creation of the event has been approved by both Sponsors.");
		ObjectRepo.test.log(Status.PASS, "The creation of the event has been approved by both Sponsors.");
	}

	public void secondApproval_PE2() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE2);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
			Thread.sleep(2000);
		} catch (Exception e) {

			btnApprovalQue.click();
			Thread.sleep(2000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit1));
		try {
			btnSubmit1.click();
		} catch (Exception e) {

			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		wait.until(ExpectedConditions.elementToBeClickable(abc1));
		abc1.click();
		Thread.sleep(3000);		
		String alert = driver.get().findElement(By.xpath("//*[text()='The creation of the event has been approved by both Sponsors.']")).getText();
		System.out.println(alert);
		Assert.assertEquals(alert,"The creation of the event has been approved by both Sponsors.");
		ObjectRepo.test.log(Status.PASS, "The creation of the event has been approved by both Sponsors.");
		
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	public void secondApproval_PE5() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE5);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
		} catch (Exception e) {

			btnApprovalQue.click();
		}
		try {
			btnSubmit1.click();
		} catch (Exception e) {

			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	public void secondApproval_PE6() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE6);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
		} catch (Exception e) {

			btnApprovalQue.click();
		}
		try {
			btnSubmit1.click();
		} catch (Exception e) {

			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	public void secondApproval_PE7() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE7);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {

			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
		} catch (Exception e) {

			btnApprovalQue.click();
		}
		try {

			btnSubmit1.click();
		} catch (Exception e) {

			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	public void secondApproval_PE8() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE8);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {

			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
		} catch (Exception e) {

			btnApprovalQue.click();
		}
		try {

			btnSubmit1.click();
		} catch (Exception e) {

			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	public void secondApproval_PE9() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE9);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {

			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
		} catch (Exception e) {

			btnApprovalQue.click();
		}
		try {

			btnSubmit1.click();
		} catch (Exception e) {

			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		action.moveToElement(abc1).build().perform();
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	public void secondApproval_PE10() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		btnEvent.click();
		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE10);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnApprovalQue));
			btnApprovalQue.click();
		} catch (Exception e) {
			btnApprovalQue.click();
		}
		try {
			btnSubmit1.click();
		} catch (Exception e) {
			btnSubmit2.click();
		}
		WebElement abc1 = popupBtn;
		action.moveToElement(abc1).build().perform();
		action.click(abc1).build().perform();
		System.out.println("Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Approval given by Quebec jurisdiction");
	}

	

	public void setFXrateQC() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnMinPrice));
			btnMinPrice.click();
		} catch (Exception e1) {

			wait.until(ExpectedConditions.elementToBeClickable(btnReservePrice));
			btnReservePrice.click();
		}
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop.getProperty("FXRate"));
		} catch (Exception e) {

			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop.getProperty("FXRate"));
		}
		System.out.println("fx rate set for quebec juridiction ");
		try {

			btnsubmitqc.click();
		} catch (Exception e) {

			btnsubmitCal.click();
		}
	}

	public void setFXrateQC_PE1() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		try {

			wait.until(ExpectedConditions.elementToBeClickable(btnMinPrice));
			btnMinPrice.click();
		} catch (Exception e1) {

			wait.until(ExpectedConditions.elementToBeClickable(btnReservePrice));
			btnReservePrice.click();
		}
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE1"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE1"));
		} catch (Exception e) {

			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE1"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE1"));
		}
		System.out.println("fx rate set for quebec juridiction ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitCal));
			btnsubmitCal.click();
			Thread.sleep(3000);
		}
		//btnAlertSubmit.click();
		wait.until(ExpectedConditions.visibilityOf(QCFxRateText));
		String alert = QCFxRateText.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "FX Rate submitted.");
		ObjectRepo.test.log(Status.PASS, "FX Rate submitted.");
		
	}
	
	public void setFXrateQC_PE2() throws InterruptedException {

		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		try {

			wait.until(ExpectedConditions.elementToBeClickable(btnMinPrice));
			btnMinPrice.click();
		} catch (Exception e1) {

			wait.until(ExpectedConditions.elementToBeClickable(btnReservePrice));
			btnReservePrice.click();
		}
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE2"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE2"));
		} catch (Exception e) {

			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE2"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE2"));
		}
		System.out.println("fx rate set for quebec juridiction ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitCal));
			btnsubmitCal.click();
			Thread.sleep(3000);
		}
		//btnAlertSubmit.click();
		wait.until(ExpectedConditions.visibilityOf(QCFxRateText));
		String alert = QCFxRateText.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "FX Rate submitted.");
		ObjectRepo.test.log(Status.PASS, "FX Rate submitted.");
	}

	public void setFXrateQC_PE3() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnMinPrice));
			btnMinPrice.click();
		} catch (Exception e1) {
			wait.until(ExpectedConditions.elementToBeClickable(btnReservePrice));
			btnReservePrice.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE3"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE3"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE3"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE3"));
		}
		System.out.println("fx rate set for quebec juridiction ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitCal.click();
			Thread.sleep(3000);
		}
		//btnAlertSubmit.click();
		wait.until(ExpectedConditions.visibilityOf(QCFxRateText));
		String alert = QCFxRateText.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "FX Rate submitted.");
		ObjectRepo.test.log(Status.PASS, "FX Rate submitted.");
	}
	
	public void setFXrateQC_PE4() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnMinPrice));
			btnMinPrice.click();
		} catch (Exception e1) {
			wait.until(ExpectedConditions.elementToBeClickable(btnReservePrice));
			btnReservePrice.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE4"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE4"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE4"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE4"));
		}
		System.out.println("fx rate set for quebec juridiction ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitCal.click();
			Thread.sleep(3000);
		}
		//btnAlertSubmit.click();
		wait.until(ExpectedConditions.visibilityOf(QCFxRateText));
		String alert = QCFxRateText.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "FX Rate submitted.");
		ObjectRepo.test.log(Status.PASS, "FX Rate submitted.");
	}

	public void setFXrateQC_PE5() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnMinPrice));
			btnMinPrice.click();
		} catch (Exception e1) {
			wait.until(ExpectedConditions.elementToBeClickable(btnReservePrice));
			btnReservePrice.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE5"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE5"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE5"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE5"));
		}
		System.out.println("fx rate set for quebec juridiction ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitCal.click();
			Thread.sleep(3000);
		}
		//btnAlertSubmit.click();
		wait.until(ExpectedConditions.visibilityOf(QCFxRateText));
		String alert = QCFxRateText.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "FX Rate submitted.");
		ObjectRepo.test.log(Status.PASS, "FX Rate submitted.");
	}

	public void setFXrateQC_PE6() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnMinPrice));
			btnMinPrice.click();
		} catch (Exception e1) {
			wait.until(ExpectedConditions.elementToBeClickable(btnReservePrice));
			btnReservePrice.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE6"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE6"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE6"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE6"));
		}
		System.out.println("fx rate set for quebec juridiction ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitCal.click();
			Thread.sleep(3000);
		}
		//btnAlertSubmit.click();
		wait.until(ExpectedConditions.visibilityOf(QCFxRateText));
		String alert = QCFxRateText.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "FX Rate submitted.");
		ObjectRepo.test.log(Status.PASS, "FX Rate submitted.");
	}

	public void setFXrateQC_PE7() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnMinPrice));
			btnMinPrice.click();
		} catch (Exception e1) {
			wait.until(ExpectedConditions.elementToBeClickable(btnReservePrice));
			btnReservePrice.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE7"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE7"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE7"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE7"));
		}
		System.out.println("fx rate set for quebec juridiction ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitCal.click();
			Thread.sleep(3000);
		}
		//btnAlertSubmit.click();
		wait.until(ExpectedConditions.visibilityOf(QCFxRateText));
		String alert = QCFxRateText.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "FX Rate submitted.");
		ObjectRepo.test.log(Status.PASS, "FX Rate submitted.");
	}

	public void setFXrateQC_PE8() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnMinPrice));
			btnMinPrice.click();
		} catch (Exception e1) {
			wait.until(ExpectedConditions.elementToBeClickable(btnReservePrice));
			btnReservePrice.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE8"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE8"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE8"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE8"));
		}
		System.out.println("fx rate set for quebec juridiction ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitCal.click();
			Thread.sleep(3000);
		}
		//btnAlertSubmit.click();
		wait.until(ExpectedConditions.visibilityOf(QCFxRateText));
		String alert = QCFxRateText.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "FX Rate submitted.");
		ObjectRepo.test.log(Status.PASS, "FX Rate submitted.");
	}

	public void setFXrateQC_PE9() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnMinPrice));
			btnMinPrice.click();
		} catch (Exception e1) {
			wait.until(ExpectedConditions.elementToBeClickable(btnReservePrice));
			btnReservePrice.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE9"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE9"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE9"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE9"));
		}
		System.out.println("fx rate set for quebec juridiction ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitCal.click();
			Thread.sleep(3000);
		}
		//btnAlertSubmit.click();
		wait.until(ExpectedConditions.visibilityOf(QCFxRateText));
		String alert = QCFxRateText.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "FX Rate submitted.");
		ObjectRepo.test.log(Status.PASS, "FX Rate submitted.");
	}

	public void setFXrateQC_PE10() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnMinPrice));
			btnMinPrice.click();
		} catch (Exception e1) {
			wait.until(ExpectedConditions.elementToBeClickable(btnReservePrice));
			btnReservePrice.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE10"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE10"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE10"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE10"));
		}
		System.out.println("fx rate set for quebec juridiction ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitCal.click();
			Thread.sleep(3000);
		}
		//btnAlertSubmit.click();
		wait.until(ExpectedConditions.visibilityOf(QCFxRateText));
		String alert = QCFxRateText.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "FX Rate submitted.");
		ObjectRepo.test.log(Status.PASS, "FX Rate submitted.");
	}
	
	public void setFXrateQC_PE11() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.clickbtnAdmin();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnMinPrice));
			btnMinPrice.click();
		} catch (Exception e1) {
			wait.until(ExpectedConditions.elementToBeClickable(btnReservePrice));
			btnReservePrice.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE11"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE11"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE11"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE11"));
		}
		System.out.println("fx rate set for quebec juridiction ");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitCal.click();
			Thread.sleep(3000);
		}
		//btnAlertSubmit.click();
		wait.until(ExpectedConditions.visibilityOf(QCFxRateText));
		String alert = QCFxRateText.getText();
		System.out.println(alert);
		Assert.assertEquals(alert, "FX Rate submitted.");
		ObjectRepo.test.log(Status.PASS, "FX Rate submitted.");
	}

	public void setFXrateCal() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btnAdminstration));
		btnAdminstration.click();
		try {
			btnReservePrice.click();
		} catch (Exception e1) {
			btnReservePrice2.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop.getProperty("FXRate"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop.getProperty("FXRate"));
		}

		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitCal));
			btnsubmitCal.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmSubmit));
		btnConfirmSubmit.click();
		System.out.println("fx rate set for Joint Auction ");
	}

	public void setFXrateCal_PE1() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btnAdminstration));
		btnAdminstration.click();
		try {
			btnReservePrice.click();
		} catch (Exception e1) {

			btnReservePrice2.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE1"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE1"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE1"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE1"));
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitCal));
			btnsubmitCal.click();
			Thread.sleep(3000);	
			}
		catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
			Thread.sleep(3000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmSubmit));
		btnConfirmSubmit.click();
		Thread.sleep(3000);
		System.out.println("fx rate set for Joint Auction ");
	}
	
	public void setFXrateCal_PE2() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btnAdminstration));
		btnAdminstration.click();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnReservePrice));
			btnReservePrice.click();
		} catch (Exception e1) {
			btnReservePrice2.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE2"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE2"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE2"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE2"));
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitCal));
			btnsubmitCal.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmSubmit));
		btnConfirmSubmit.click();
		Thread.sleep(3000);
		System.out.println("fx rate set for Joint Auction ");
	}

	public void setFXrateCal_PE3() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btnAdminstration));
		btnAdminstration.click();
		try {
			btnReservePrice.click();
		} catch (Exception e1) {
			btnReservePrice2.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE3"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE3"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE3"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE3"));
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitCal));
			btnsubmitCal.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmSubmit));
		btnConfirmSubmit.click();
		Thread.sleep(3000);
		System.out.println("fx rate set for Joint Auction ");
	}
	
	public void setFXrateCal_PE4() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btnAdminstration));
		btnAdminstration.click();
		try {
			btnReservePrice.click();
		} catch (Exception e1) {
			btnReservePrice2.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE4"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE4"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE4"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE4"));
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitCal));
			btnsubmitCal.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmSubmit));
		btnConfirmSubmit.click();
		Thread.sleep(3000);
		System.out.println("fx rate set for Joint Auction ");
	}


	public void setFXrateCal_PE5() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btnAdminstration));
		btnAdminstration.click();
		try {
			btnReservePrice.click();
		} catch (Exception e1) {
			btnReservePrice2.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE5"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE5"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE5"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE5"));
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitCal));
			btnsubmitCal.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmSubmit));
		btnConfirmSubmit.click();
		Thread.sleep(4000);
		System.out.println("fx rate set for Joint Auction ");
	}

	public void setFXrateCal_PE6() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btnAdminstration));
		btnAdminstration.click();
		try {
			btnReservePrice.click();
		} catch (Exception e1) {
			btnReservePrice2.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE6"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE6"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE6"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE6"));
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitCal));
			btnsubmitCal.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmSubmit));
		btnConfirmSubmit.click();
		Thread.sleep(3000);
		System.out.println("fx rate set for Joint Auction ");
	}

	public void setFXrateCal_PE7() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btnAdminstration));
		btnAdminstration.click();
		try {
			btnReservePrice.click();
		} catch (Exception e1) {
			btnReservePrice2.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE7"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE7"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE7"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE7"));
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitCal));
			btnsubmitCal.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmSubmit));
		btnConfirmSubmit.click();
		Thread.sleep(3000);
		System.out.println("fx rate set for Joint Auction ");
	}

	public void setFXrateCal_PE8() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btnAdminstration));
		btnAdminstration.click();
		try {
			btnReservePrice.click();
		} catch (Exception e1) {
			btnReservePrice2.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE8"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE8"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE8"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE8"));
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitCal));
			btnsubmitCal.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmSubmit));
		btnConfirmSubmit.click();
		Thread.sleep(3000);
		System.out.println("fx rate set for Joint Auction ");
	}

	public void setFXrateCal_PE9() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btnAdminstration));
		btnAdminstration.click();
		try {
			btnReservePrice.click();
		} catch (Exception e1) {
			btnReservePrice2.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE9"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE9"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE9"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE9"));
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitCal));
			btnsubmitCal.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmSubmit));
		btnConfirmSubmit.click();
		Thread.sleep(3000);
		System.out.println("fx rate set for Joint Auction ");
	}

	public void setFXrateCal_PE10() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btnAdminstration));
		btnAdminstration.click();
		try {
			btnReservePrice.click();
		} catch (Exception e1) {
			btnReservePrice2.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE10"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE10"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE10"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE10"));
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitCal));
			btnsubmitCal.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmSubmit));
		btnConfirmSubmit.click();
		Thread.sleep(3000);
		System.out.println("fx rate set for Joint Auction ");

	}
	
	public void setFXrateCal_PE11() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btnAdminstration));
		btnAdminstration.click();
		try {
			btnReservePrice.click();
		} catch (Exception e1) {
			btnReservePrice2.click();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxCal;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxCal.click();
			textBoxFxCal.sendKeys(prop1.getProperty("FXRate_PE11"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE11"));
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element = textBoxFxQc;
			js.executeScript("arguments[0].scrollIntoView();", element);
			textBoxFxQc.click();
			textBoxFxQc.sendKeys(prop1.getProperty("FXRate_PE11"));
			ObjectRepo.test.log(Status.PASS, "FX Rate Entered : " + prop1.getProperty("FXRate_PE11"));
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitCal));
			btnsubmitCal.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(btnsubmitqc));
			btnsubmitqc.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmSubmit));
		btnConfirmSubmit.click();
		Thread.sleep(3000);
		System.out.println("fx rate set for Joint Auction ");

	}

	
	 public void executeAPIGetQualifiedBidder() throws InterruptedException {
	        try {
	            try {
	                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Monitoring')]")));
	            } catch (Exception e) {
	                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Monitoring')]")));
	            }
	            btnSettings.click();
	            wait.until(ExpectedConditions.elementToBeClickable(btnExecuteAPI));
	            btnExecuteAPI.click();
	            WebElement element1 = APIGetQualifiedBidder;
	            JavascriptExecutor js = (JavascriptExecutor) driver.get();
	            js.executeScript("arguments[0].scrollIntoView();", element1);
	            APIGetQualifiedBidder.click();
	        } catch (Exception e) {
	            wait.until(ExpectedConditions.elementToBeClickable(APIGetBidLimitations));
	            APIGetBidLimitations.click();
	        }
	        wait.until(ExpectedConditions.elementToBeClickable(APIexecutionPopupbtn));
	        APIexecutionPopupbtn.click();
	        Thread.sleep(8000);
	        System.out.println("Get Qualified bidder API  Executed successfully");
	        ObjectRepo.test.log(Status.PASS, "Get Qualified bidder API  Executed successfully");


	    }

	public void executeAPIPostUserRelationShip() throws InterruptedException {
		try {
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Event Monitoring']")));
			} catch (Exception e) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Monitoring']")));
			}
			wait.until(ExpectedConditions.elementToBeClickable(btnSettings));
			WebElement abc = btnSettings;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc).build().perform();
			action.clickAndHold(abc).build().perform();
			action.click(abc).build().perform();
			wait.until(ExpectedConditions.elementToBeClickable(btnExecuteAPI));
			btnExecuteAPI.click();

			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			WebElement element1 = driver.get().findElement(By.xpath("(//button[@title='Execute'])[3]"));
			js.executeScript("arguments[0].scrollIntoView();", element1);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(APIGetQualifiedBidder));
			APIGetQualifiedBidder.click();
		}
		APIexecutionPopupbtn.click();
		System.out.println("Get Qualified bidder API  Executed successfully");
		ObjectRepo.test.log(Status.PASS, "Get Qualified bidder API  Executed successfully");

	}
	
	public void executeAPIGetBidLimitations() throws InterruptedException {
        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Monitoring')]")));
            } catch (Exception e) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Monitoring')]")));
            }
            wait.until(ExpectedConditions.elementToBeClickable(btnSettings));
            btnSettings.click();
            wait.until(ExpectedConditions.elementToBeClickable(btnExecuteAPI));
            btnExecuteAPI.click();
            JavascriptExecutor js = (JavascriptExecutor) driver.get();
            WebElement element2 = APIGetBidLimitations;
            js.executeScript("arguments[0].scrollIntoView();", element2);
            wait.until(ExpectedConditions.elementToBeClickable(APIGetBidLimitations));
            APIGetBidLimitations.click();
        } catch (Exception e) {
            APIGetBidLimitations.click();
        }
        APIexecutionPopupbtn.click();
        Thread.sleep(20000);
        System.out.println("Get Bid Limitation API  Executed successfully");
        ObjectRepo.test.log(Status.PASS, "Get Bid Limitation API  Executed successfully");
        
    }

	public void executeApisForWashingtonReserveSale() throws InterruptedException {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Monitoring']")));
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnSettings));
		WebElement abc = btnSettings;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc).build().perform();
		action.clickAndHold(abc).build().perform();
		action.click(abc).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(btnExecuteAPI));
		btnExecuteAPI.click();

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		WebElement element2 = APIGetQualifiedBidder;
		js.executeScript("arguments[0].scrollIntoView();", element2);
		APIGetQualifiedBidder.click();

		APIexecutionPopupbtn.click();

		String Msg = driver.get().findElement(By.xpath("//tbody//tr[2]/td[4]")).getText();
		if (Msg.contains("Success")) {
			System.out.println("Get Qualified Bidder API executed successfully");

			WebElement element3 = APIGetBidLimitations;
			js.executeScript("arguments[0].scrollIntoView();", element3);

			element3.click();
			APIGetQualifiedBidder.click();
			System.out.println("Get Bid Limitation API executed successfully");

		} else {
			WebElement element1 = driver.get().findElement(By.xpath("(//*[text()='Execute'])[4]"));
			js.executeScript("arguments[0].scrollIntoView();", element1);
			driver.get().findElement(By.xpath("(//*[text()='Execute'])[4]")).click();

			APIexecutionPopupbtn.click();

			String Msg2 = driver.get().findElement(By.xpath("//tbody//tr[4]/td[4]")).getText();
			Assert.assertEquals(Msg2, "Success");
			driver.get().navigate().refresh();

			js.executeScript("arguments[0].scrollIntoView();", element2);
			APIGetBidLimitations.click();

			js.executeScript("arguments[0].scrollIntoView();", element2);
			APIGetQualifiedBidder.click();

		}

	}

	public void ARLoginQC3() {
		try {
			btnLogin.click();
			username.sendKeys(prop.getProperty("AR_USerName2"));
			password.sendKeys(prop.getProperty("AR_PassWord"));
			btnLogin2.click();
			// ObjectRepo.test.log(Status.PASS, "AR california login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop.getProperty("AR_USerName2"));
			password.sendKeys(prop.getProperty("AR_PassWord"));
			btnLogin.click();
		}

	}

	public void ARLoginCA_PE1() {
		try {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName1_PE1"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName1_PE1"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName1_PE1") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName1_PE1") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName1_PE1"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName1_PE1"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin.click();
			System.out.println("" + prop1.getProperty("AR_USerName1_PE1") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName1_PE1") + " AR login successfully");
		}

	}
	
	public void ARLoginCA_PE11() {
		try {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName1_PE11"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName1_PE11"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName1_PE11") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName1_PE11") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName1_PE11"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName1_PE11"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin.click();
			System.out.println("" + prop1.getProperty("AR_USerName1_PE11") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName1_PE11") + " AR login successfully");
		}

	}
	
	public void ARLoginPEWa() {
		try {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName1_PEWa"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName1_PEWa"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName1_PEWa") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName1_PEWa") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName1_PEWa"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName1_PEWa"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName1_PEWa") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName1_PEWa") + " AR login successfully");
		}

	}
	
	public void ARLoginPEWa2() {
		try {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName1_PEWa2"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName1_PEWa2"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName1_PEWa2") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName1_PEWa2") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName1_PEWa2"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName1_PEWa2"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName1_PEWa2") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName1_PEWa2") + " AR login successfully");
		}

	}
	
	public void ARLoginPECa() {
		try {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName1_RE1Ca"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName1_RE1Ca"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName1_RE1Ca") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName1_RE1Ca") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName1_RE1Ca"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName1_RE1Ca"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName1_RE1Ca") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName1_RE1Ca") + " AR login successfully");
		}
	}
	
	public void ARLoginREWA1() {
		try {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName_REWA1"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName_REWA1"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName_REWA1") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName_REWA1") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName_REWA1"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName_REWA1"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName_REWA1") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName_REWA1") + " AR login successfully");
		}
	}
	
	public void AR1LoginPEQcSBMA1() throws InterruptedException {
		Thread.sleep(5000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName1_SBMA1"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName1_SBMA1"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName1_SBMA1") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName1_SBMA1") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName1_SBMA1"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName1_SBMA1"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName1_SBMA1") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName1_SBMA1") + " AR login successfully");
		}

	}
	
	public void AR1LoginPEQcSBMA2() throws InterruptedException {
		Thread.sleep(5000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName_SBMA2"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName_SBMA2"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName_SBMA2") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName_SBMA2") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName_SBMA2"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName_SBMA2"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName_SBMA2") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName_SBMA2") + " AR login successfully");
		}

	}
	
	public void AR1LoginPEQcSBMA3() throws InterruptedException {
		Thread.sleep(5000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName_SBMA3"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName_SBMA3"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName_SBMA3") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName_SBMA3") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName_SBMA3"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName_SBMA3"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName_SBMA3") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName_SBMA3") + " AR login successfully");
		}

	}
	
	public void AR1LoginPEQcSBMA4() throws InterruptedException {
		Thread.sleep(5000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName_SBMA4"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName_SBMA4"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName_SBMA4") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName_SBMA4") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName_SBMA4"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName_SBMA4"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName_SBMA4") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName_SBMA4") + " AR login successfully");
		}

	}
	
	public void AR1LoginPEQcSBMA7() throws InterruptedException {
		Thread.sleep(5000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName_SBMA7"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName_SBMA7"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName_SBMA7") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName_SBMA7") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName_SBMA7"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName_SBMA7"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName_SBMA7") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName_SBMA7") + " AR login successfully");
		}

	}
	
	public void AR1LoginPEQcSBMA5() throws InterruptedException {
		Thread.sleep(5000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName_SBMA5"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName_SBMA5"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName_SBMA5") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName_SBMA5") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName_SBMA5"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName_SBMA5"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName_SBMA5") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName_SBMA5") + " AR login successfully");
		}

	}
	
	public void AR1LoginPEQcSBMA6() throws InterruptedException {
		Thread.sleep(5000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName_SBMA6"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName_SBMA6"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName_SBMA6") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName_SBMA6") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName_SBMA6"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName_SBMA6"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName_SBMA6") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName_SBMA6") + " AR login successfully");
		}

	}
	
	public void AR2LoginPEQcSBMA1() throws InterruptedException {
		Thread.sleep(5000);	
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName2_SBMA1"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName2_SBMA1"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName2_SBMA1") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName2_SBMA1") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName2_SBMA1"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName2_SBMA1"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName2_SBMA1") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName2_SBMA1") + " AR login successfully");
		}

	}
	
	public void AR3LoginPEQcSBMA1() throws InterruptedException {
		Thread.sleep(5000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName3_SBMA1"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName3_SBMA1"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName3_SBMA1") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName3_SBMA1") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName3_SBMA1"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName3_SBMA1"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName3_SBMA1") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName3_SBMA1") + " AR login successfully");
		}

	}
	
	public void AR4LoginPEQcSBMA1() throws InterruptedException {
		Thread.sleep(5000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName4_SBMA1"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName4_SBMA1"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName4_SBMA1") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName4_SBMA1") + " AR login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName4_SBMA1"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName4_SBMA1"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName4_SBMA1") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName4_SBMA1") + " AR login successfully");
		}

	}

	public void clickOnnextQC() throws InterruptedException {

		WebElement abc = btnNextQC;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc).click().build().perform();
		action.click(abc).build().perform();

	}

	public void SelectEntity1()  {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(btnEntity5));
//		driver.get().findElement(By.xpath("//input[@placeholder='Enter Entity Name or Entity ID']"))
//				.sendKeys(prop.getProperty("FirstEntity"));
		driver.get().findElement(btnEntity5).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
		// ObjectRepo.test.log(Status.PASS, ":Selected AR1 entity1 account");

	}

	public void SelectEntity1_PE1() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFirstEntity_PE1"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFirstEntity_PE1") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity1_PEwa() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("WAFirstEntity_PEWa"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("WAFirstEntity_PEWa") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity1_PEwa2() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("WAFirstEntity_PEWa2"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("WAFirstEntity_PEWa2") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity2_PEWa2() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("WASecondEntity_PEWa2"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("WASecondEntity_PEWa2") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity3_PEWa2() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("WAThirdEntity_PEWa2"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("WAThirdEntity_PEWa2") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity4_PEWa2() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("WAFourthEntity_PEWa2"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("WAFourthEntity_PEWa2") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity5_PEWa2() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("WAFifthEntity_PEWa2"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("WAFifthEntity_PEWa2") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity6_PEWa2() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("WASixthEntity_PEWa2"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("WASixthEntity_PEWa2") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity7_PEWa2() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("WASeventhEntity_PEWa2"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("WASeventhEntity_PEWa2") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity1_PECa() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CA_FirstEntity_RE1Ca"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CA_FirstEntity_RE1Ca") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity1_REWA1() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("WA_FirstEntity_REWA1"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("WA_FirstEntity_REWA1") + " :Entity Account Selected By Account Representative");
		
	}
	
	public void SelectEntity1_REWA2() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("WA_FirstEntity_REWA2"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("WA_FirstEntity_REWA2") + " :Entity Account Selected By Account Representative");
		
	}
	
	public void SelectEntity2_PEWa() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("WASecondEntity_PEWa"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("WASecondEntity_PEWa") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity2_PECa() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CA_SecondEntity_RE1Ca"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CA_SecondEntity_RE1Ca") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity3_PEWa() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("WAThirdEntity_PEWa"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("WAThirdEntity_PEWa") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity3_PECa() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CA_ThirdEntity_RE1Ca"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CA_ThirdEntity_RE1Ca") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity1_PE2() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFirstEntity_PE2"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFirstEntity_PE2") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity1_PE3() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFirstEntity_PE3"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFirstEntity_PE3") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity1_PE5() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFirstEntity_PE5"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFirstEntity_PE5") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity1_PE6() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFirstEntity_PE6"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFirstEntity_PE6") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity1_PE7() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFirstEntity_PE7"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFirstEntity_PE7") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity1_PE8() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFirstEntity_PE8"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFirstEntity_PE8") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity1_PE9() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFirstEntity_PE9"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFirstEntity_PE9") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity1_PE10() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFirstEntity_PE10"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFirstEntity_PE10") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity1_PE11() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFirstEntity_PE11"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFirstEntity_PE11") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity1_PE12() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFirstEntity_PE12"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFirstEntity_PE12") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity1_PE4() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFirstEntity_PE4"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFirstEntity_PE4") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity2_PE4() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CASecoundEntity_PE4"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CASecoundEntity_PE4") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity2_PE5() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CASecoundEntity_PE5"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CASecoundEntity_PE5") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity2_PE6() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CASecoundEntity_PE6"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CASecoundEntity_PE6") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity2_PE7() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CASecoundEntity_PE7"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CASecoundEntity_PE7") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity2_PE8() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CASecoundEntity_PE8"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CASecoundEntity_PE8") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity2_PE9() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CASecoundEntity_PE9"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CASecoundEntity_PE9") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity2_PE10() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CASecoundEntity_PE10"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CASecoundEntity_PE10") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity3_PE4() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAThirdEntity_PE4"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAThirdEntity_PE4") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity4_PE4() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFourthEntity_PE4"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFourthEntity_PE4") + " :Entity Account Selected By Account Representative");

	}

	public void selectEventForBiddingE2E() throws InterruptedException {
		try {

			wait.until(ExpectedConditions.elementToBeClickable(btnevent));
			btnEvent.click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(eventnameonbidpage));
			driver.get().findElement(eventnameonbidpage).click();

		} catch (Exception e) {

			driver.get().findElement(By.xpath("//*[text()='Auction']")).click();
		}

	}

	public void selectEventForBiddingE2EJointAuction() throws InterruptedException {
		try {

			wait.until(ExpectedConditions.elementToBeClickable(btnevent));
			btnEvent.click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(eventnameonbidpageCalJointAuction));
			driver.get().findElement(eventnameonbidpageCalJointAuction).click();

		} catch (Exception e) {

			driver.get().findElement(By.xpath("//*[text()='Auction']")).click();
		}

	}

	public void selectEventForBidding_PE1() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	            Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_PE1);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	         
	        }

	}
	
	public void selectEventForBidding_SBMA1() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_SBMA1);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	           
	        }

	}
	
	public void selectEventForBidding_SBMA2() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_SBMA2);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	            
	        }
	}
	
	public void selectEventForBidding_SBMA3() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_SBMA3);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	            
	        }
	}
	
	public void selectEventForBidding_SBMA4() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_SBMA4);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	            
	        }
	}
	
	public void selectEventForBidding_SBMA7() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_SBMA7);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	            
	        }
	}
	
	public void selectEventForBidding_SBMA5() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_SBMA5);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	           
	        }
	}
	
	public void selectEventForBidding_SBMA6() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_SBMA6);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	        }
	}
	
	public void selectEventForBidding_PEWa() throws InterruptedException {
		 try {
	            driver.get().findElement(By.xpath("//*[text()='Auction']")).click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_PEWa);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	        }
	}
	
	public void selectEventForBidding_PEWa2() throws InterruptedException {
		 try {
	            driver.get().findElement(By.xpath("//*[text()='Auction']")).click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();            
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_PEWa2);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	        }
	}
	
	public void selectEventForBidding_PECa() throws InterruptedException {
		 try {
	            driver.get().findElement(By.xpath("//*[text()='Auction']")).click();
	        }
	        catch (Exception e) {
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_PECa);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	        }
	}
	
	public void selectEventForBidding_REWA1() throws InterruptedException {
		 try {
	            driver.get().findElement(By.xpath("//*[text()='Auction']")).click();
	        }
	        catch (Exception e) {
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_REWA1);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	            
	        }
	}
	
	public void selectEventForBidding_REWA2() throws InterruptedException {
		 try {
	            driver.get().findElement(By.xpath("//*[text()='Auction']")).click();
	        }
	        catch (Exception e) {
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_REWA2);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	          
	        }
	}

	public void selectEventForBidding_PE2() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	          Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_PE2);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	    
	        }

	}

	public void selectEventForBidding_PE3() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_PE3);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	           
	        }

	}
	
	public void selectEventForBidding_PE4() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_PE4);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	  
	        }

	}

	public void selectEventForBidding_PE5() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_PE5);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	            
	        }

	}

	public void selectEventForBidding_PE6() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_PE6);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	        }

	}

	public void selectEventForBidding_PE7() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_PE7);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	          
	        }

	}

	public void selectEventForBidding_PE8() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_PE8);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	            
	        }

	}

	public void selectEventForBidding_PE9() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_PE9);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	        }

	}

	public void selectEventForBidding_PE10() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_PE10);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	            
	        }
	}
	
	public void selectEventForBidding_PE11() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_PE11);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	       
	        }
	}
	
	public void selectEventForBidding_PE12() throws InterruptedException {
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Auction));
	         Auction.click();
	        }
	        catch (Exception e) {
	        	Thread.sleep(3000);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Events'])")));
	            driver.get().findElement(By.xpath("//*[text()='Events']")).click();
	            
	            Thread.sleep(3000);
	            WebElement currentEvent = driver.get().findElement(eventnameonbidpage_PE12);
	            Actions act = new Actions(driver.get());
	            act.moveToElement(currentEvent).build().perform();
	            Thread.sleep(3000);
	            act.click(currentEvent).build().perform();
	          
	        }
	}

	public void selectEventForBiddingMonitoringtestcase() throws InterruptedException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnevent));
			btnEvent.click();

			runningEventName.click();
		} catch (Exception e) {

			driver.get().findElement(By.xpath("//*[text()='Auction']")).click();

		}

	}

	public void selectEventForBiddingMonitoringtestcase1()  {
		// Thread.sleep(4000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Events']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Auction']")));
		}
		driver.get().findElement(By.xpath("//*[text()='Events']")).click();
		wait.until(ExpectedConditions.visibilityOf(runningEventName1));
		runningEventName1.click();
	}

	public void BiddingByARforTestData1() {
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		try {
			Thread.sleep(6000);
			wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
			btnAddbid.click();
		} catch (Exception e) {
			btnAddbid.click();
		}
		textBidPrice.sendKeys(prop.getProperty("Bid_Price1"));

		textBidLots.sendKeys(prop.getProperty("Bid_Lot1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData1_PE1() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(5000);
		btnAddbid.click();

		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot1_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}
	
	public void BiddingByARforTestData1_PEWa() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		
		btnAddbid.click();
		Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData1_PEWa2() throws IOException, InterruptedException {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(4000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData2_PEWa2() throws IOException, InterruptedException {
		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
        
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData4_PEWa2() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(4000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData5_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_4"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_4"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData7_PEWa2() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(4000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData8_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData9_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_7"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_7"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	public void BiddingByARforTestData10_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData11_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData12_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData14_PEWa2() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(4000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_11"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_11"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData15_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_12"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_12"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData17_PEWa2() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(4000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_13"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_13"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData18_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_14"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_14"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData19_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_15"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_15"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData21_PEWa2() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(4000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_16"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_16"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData22_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_17"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_17"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	public void BiddingByARforTestData24_PEWa2() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(4000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_18"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_18"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	public void BiddingByARforTestData25_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_19"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_19"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	public void BiddingByARforTestData26_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_20"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_20"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	public void BiddingByARforTestData27_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2_21"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2_21"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();	
	} 
	
	public void BiddingByARforTestData1_PECa() throws IOException, InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		try {
			Thread.sleep(4000);
			wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
			btnAddbid.click();
		} catch (Exception e) {
			btnAddbid.click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__RE1Ca"));
		Thread.sleep(2000);
		WebElement element0 = selectTier;
		Select s = new Select(element0);
		s.selectByVisibleText("Tier Two");
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
		
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
		
	} 
	
public void BiddingByAR_REWA1() throws IOException, InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		try {
			Thread.sleep(4000);
			wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
			btnAddbid.click();
		} catch (Exception e) {
			btnAddbid.click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot1__REWA1"));
		Thread.sleep(2000);
		WebElement element0 = selectTier;
		Select s = new Select(element0);
		s.selectByVisibleText("Tier One");
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
		
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();

		//-------------------Entity2------------------------------
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
				Thread.sleep(2000);
				try {
					wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
					EntityDropdown2.click();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
					EntityDropdown.click();
				}
				WebElement ref = EntityName;
				action = new Actions(driver.get());
				action.moveToElement(ref).build().perform();
				
				WebElement ref1 = Entity2REWA1;
				JavascriptExecutor js = (JavascriptExecutor) driver.get();
				js.executeScript("arguments[0].scrollIntoView();", ref1);
				Entity2REWA1.click();
				
				wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
				ContinueButton.click();
				
				selectEventForBidding_REWA1();
				
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

				Thread.sleep(5000);
				btnAddbid.click();
				
				textBidLot.sendKeys(prop1.getProperty("Bid_Lot2__REWA1"));
				WebElement element1 = selectTier;
				Select s1 = new Select(element1);
				s1.selectByVisibleText("Tier Two");
				
				btnSubmit.click();
				wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
				btnConfirm.click();
				String Message2;
				try {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
					Message2 = alertMsg2.getText();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
					Message2 = alertMsg.getText();
				}
				System.out.println(Message2);
				Thread.sleep(3000);
				alertPopup.click();
				
				//-----------------Entity3-----------------------------------
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
				Thread.sleep(2000);
				try {
					wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
					EntityDropdown2.click();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
					EntityDropdown.click();
				}
				action = new Actions(driver.get());
				action.moveToElement(ref).build().perform();
				
				WebElement ref2 = Entity3REWA1;
				js.executeScript("arguments[0].scrollIntoView();", ref2);
				Entity3REWA1.click();
				
				wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
				ContinueButton.click();
				
				selectEventForBidding_REWA1();
				
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

				Thread.sleep(5000);
				btnAddbid.click();
				
				textBidLot.sendKeys(prop1.getProperty("Bid_Lot3__REWA1"));
				
				Select s2 = new Select(element1);
				s2.selectByVisibleText("Tier One");
				
				btnSubmit.click();
				wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
				btnConfirm.click();
				String Message3;
				try {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
					Message3 = alertMsg2.getText();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
					Message3 = alertMsg.getText();
				}
				System.out.println(Message3);
				Thread.sleep(3000);
				alertPopup.click();
				
				//--------------------Entity4-----------------------------------------
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
				
				Thread.sleep(2000);
				try {
					wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
					EntityDropdown2.click();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
					EntityDropdown.click();
				}
				
				action = new Actions(driver.get());
				action.moveToElement(ref).build().perform();
				
				WebElement ref3 = Entity4REWA1;
				js.executeScript("arguments[0].scrollIntoView();", ref3);
				Entity4REWA1.click();
				
				wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
				ContinueButton.click();
				
				selectEventForBidding_REWA1();
				
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

				Thread.sleep(5000);
				btnAddbid.click();
				
				textBidLot.sendKeys(prop1.getProperty("Bid_Lot4__REWA1"));
				
				Select s3 = new Select(element1);
				s3.selectByVisibleText("Tier Two");
				
				btnSubmit.click();
				wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
				btnConfirm.click();
				String Message4;
				try {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
					Message4 = alertMsg2.getText();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
					Message4 = alertMsg.getText();
				}
				System.out.println(Message4);
				Thread.sleep(3000);
				alertPopup.click();
				
				//--------------------Entity5-----------------------------------------
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
				
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
						action = new Actions(driver.get());
						action.moveToElement(ref).build().perform();
						
						WebElement ref4 = Entity5REWA1;
						js.executeScript("arguments[0].scrollIntoView();", ref4);
						Entity5REWA1.click();
						
						wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
						ContinueButton.click();
						
						selectEventForBidding_REWA1();
						
						Thread.sleep(10000);
						wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
						driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
						driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
						driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

						Thread.sleep(5000);
						btnAddbid.click();
						
						textBidLot.sendKeys(prop1.getProperty("Bid_Lot5__REWA1"));
						
						Select s4 = new Select(element1);
						s4.selectByVisibleText("Tier Three");
						
						btnSubmit.click();
						wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
						btnConfirm.click();
						String Message5;
						try {
							wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
							Message5 = alertMsg2.getText();
						} catch (Exception e) {
							wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
							Message5 = alertMsg.getText();
						}
						System.out.println(Message5);
						Thread.sleep(3000);
						alertPopup.click();	
	} 

public void BiddingByAR_REWA2() throws IOException, InterruptedException {
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	try {
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
	} catch (Exception e) {
		btnAddbid.click();
	}
	
	wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
	textBidLot.sendKeys(prop1.getProperty("Bid_Lot1__REWA2"));
	Thread.sleep(2000);
	WebElement element0 = selectTier;
	Select s = new Select(element0);
	s.selectByVisibleText("Tier One");
	wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
	btnSubmit.click();
	wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
	btnConfirm.click();
	Thread.sleep(3000);
	
	String Massage2 = alertMsg.getText();
	System.out.println(Massage2);
	alertPopup.click();
	
	driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
	textBidLot.sendKeys(prop1.getProperty("Bid_Lot2__REWA2"));
	Thread.sleep(2000);
	s.selectByVisibleText("Tier Two");
	wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
	btnSubmit.click();
	wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
	btnConfirm.click();
	Thread.sleep(3000);
	alertPopup.click();

	//-------------------Entity2------------------------------
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
			Thread.sleep(2000);
			try {
				wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
				EntityDropdown2.click();
			} catch (Exception e) {
				wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
				EntityDropdown.click();
			}
			WebElement ref = EntityName;
			action = new Actions(driver.get());
			action.moveToElement(ref).build().perform();
			
			WebElement ref1 = Entity2REWA2;
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			js.executeScript("arguments[0].scrollIntoView();", ref1);
			Entity2REWA2.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
			ContinueButton.click();
			
			selectEventForBidding_REWA2();
			
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

			Thread.sleep(5000);
			btnAddbid.click();
			
			textBidLot.sendKeys(prop1.getProperty("Bid_Lot3__REWA2"));
			WebElement element1 = selectTier;
			Select s1 = new Select(element1);
			s1.selectByVisibleText("Tier One");
			
			btnSubmit.click();
			wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
			btnConfirm.click();
			String Message2;
			try {
				wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
				Message2 = alertMsg2.getText();
			} catch (Exception e) {
				wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
				Message2 = alertMsg.getText();
			}
			System.out.println(Message2);
			Thread.sleep(3000);
			alertPopup.click();
			
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
			wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
			wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
			textBidLot.sendKeys(prop1.getProperty("Bid_Lot4__REWA2"));
			Thread.sleep(2000);
			s.selectByVisibleText("Tier Two");
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
			btnSubmit.click();
			wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
			btnConfirm.click();
			Thread.sleep(3000);
			alertPopup.click();
			
			//-----------------Entity3-----------------------------------
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
			Thread.sleep(2000);
			try {
				wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
				EntityDropdown2.click();
			} catch (Exception e) {
				wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
				EntityDropdown.click();
			}
			action = new Actions(driver.get());
			action.moveToElement(ref).build().perform();
			
			WebElement ref2 = Entity3REWA2;
			js.executeScript("arguments[0].scrollIntoView();", ref2);
			Entity3REWA2.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
			ContinueButton.click();
			
			selectEventForBidding_REWA2();
			
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

			Thread.sleep(5000);
			btnAddbid.click();
			
			textBidLot.sendKeys(prop1.getProperty("Bid_Lot5__REWA2"));
			
			Select s2 = new Select(element1);
			s2.selectByVisibleText("Tier One");
			
			btnSubmit.click();
			wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
			btnConfirm.click();
			String Message3;
			try {
				wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
				Message3 = alertMsg2.getText();
			} catch (Exception e) {
				wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
				Message3 = alertMsg.getText();
			}
			System.out.println(Message3);
			Thread.sleep(3000);
			alertPopup.click();
			
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
			wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
			wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
			textBidLot.sendKeys(prop1.getProperty("Bid_Lot6__REWA2"));
			Thread.sleep(2000);
			s.selectByVisibleText("Tier Two");
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
			btnSubmit.click();
			wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
			btnConfirm.click();
			Thread.sleep(3000);
			alertPopup.click();
			
			//--------------------Entity4-----------------------------------------
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
			
			Thread.sleep(2000);
			try {
				wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
				EntityDropdown2.click();
			} catch (Exception e) {
				wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
				EntityDropdown.click();
			}
			
			action = new Actions(driver.get());
			action.moveToElement(ref).build().perform();
			
			WebElement ref3 = Entity4REWA2;
			js.executeScript("arguments[0].scrollIntoView();", ref3);
			Entity4REWA2.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
			ContinueButton.click();
			
			selectEventForBidding_REWA2();
			
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

			Thread.sleep(5000);
			btnAddbid.click();
			
			textBidLot.sendKeys(prop1.getProperty("Bid_Lot7__REWA2"));
			
			Select s3 = new Select(element1);
			s3.selectByVisibleText("Tier One");
			
			btnSubmit.click();
			wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
			btnConfirm.click();
			String Message4;
			try {
				wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
				Message4 = alertMsg2.getText();
			} catch (Exception e) {
				wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
				Message4 = alertMsg.getText();
			}
			System.out.println(Message4);
			Thread.sleep(3000);
			alertPopup.click();
			
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
			wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
			wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
			textBidLot.sendKeys(prop1.getProperty("Bid_Lot8__REWA2"));
			Thread.sleep(2000);
			s.selectByVisibleText("Tier Two");
			wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
			btnSubmit.click();
			wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
			btnConfirm.click();
			Thread.sleep(3000);
			alertPopup.click();
			
			//--------------------Entity5-----------------------------------------
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
			
					wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
					EntityDropdown.click();
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref4 = Entity5REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref4);
					Entity5REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot9__REWA2"));
					
					Select s4 = new Select(element1);
					s4.selectByVisibleText("Tier One");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message5;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message5 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message5 = alertMsg.getText();
					}
					System.out.println(Message5);
					Thread.sleep(3000);
					alertPopup.click();	
					
					//--------------------Entity6-----------------------------------------
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					
					Thread.sleep(2000);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
						EntityDropdown2.click();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
					}
					
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref03 = Entity6REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref03);
					Entity6REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot10__REWA2"));
					
					s3.selectByVisibleText("Tier One");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message6;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message6 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message6 = alertMsg.getText();
					}
					System.out.println(Message6);
					Thread.sleep(3000);
					alertPopup.click();
				
					//--------------------Entity7-----------------------------------------
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					
					Thread.sleep(2000);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
						EntityDropdown2.click();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
					}
					
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref04 = Entity7REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref04);
					Entity7REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot11__REWA2"));
					
					s3.selectByVisibleText("Tier One");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message7;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message7 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message7 = alertMsg.getText();
					}
					System.out.println(Message7);
					Thread.sleep(3000);
					alertPopup.click();
					
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
					wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot12__REWA2"));
					Thread.sleep(2000);
					s.selectByVisibleText("Tier Two");
					wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					Thread.sleep(3000);
					alertPopup.click();
					
					//--------------------Entity8---------------------------------------
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					
					Thread.sleep(2000);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
						EntityDropdown2.click();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
					}
					
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref05 = Entity8REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref05);
					Entity8REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot13__REWA2"));
					
					s3.selectByVisibleText("Tier Two");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message8;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message8 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message8 = alertMsg.getText();
					}
					System.out.println(Message8);
					Thread.sleep(3000);
					alertPopup.click();
					
					//--------------------Entity9-----------------------------------------
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					
					Thread.sleep(2000);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
						EntityDropdown2.click();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
					}
					
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref06 = Entity9REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref06);
					Entity9REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot14__REWA2"));
					
					s3.selectByVisibleText("Tier One");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message9;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message9 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message9 = alertMsg.getText();
					}
					System.out.println(Message9);
					Thread.sleep(3000);
					alertPopup.click();
					
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
					wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot15__REWA2"));
					Thread.sleep(2000);
					s.selectByVisibleText("Tier Two");
					wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					Thread.sleep(3000);
					alertPopup.click();
					
					//--------------------Entity10-----------------------------------------
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					
					Thread.sleep(2000);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
						EntityDropdown2.click();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
					}
					
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref07 = Entity10REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref07);
					Entity10REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot16__REWA2"));
					
					s3.selectByVisibleText("Tier One");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message10;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message10 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message10 = alertMsg.getText();
					}
					System.out.println(Message10);
					Thread.sleep(3000);
					alertPopup.click();
					
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
					wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot17__REWA2"));
					Thread.sleep(2000);
					s.selectByVisibleText("Tier Two");
					wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					Thread.sleep(3000);
					alertPopup.click();
					
					//--------------------Entity11-----------------------------------------
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					
					Thread.sleep(2000);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
						EntityDropdown2.click();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
					}
					
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref08 = Entity11REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref08);
					Entity11REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot18__REWA2"));
					
					s3.selectByVisibleText("Tier One");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message11;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message11 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message11 = alertMsg.getText();
					}
					System.out.println(Message11);
					Thread.sleep(3000);
					alertPopup.click();
					
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
					wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot19__REWA2"));
					Thread.sleep(2000);
					s.selectByVisibleText("Tier Two");
					wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					Thread.sleep(3000);
					alertPopup.click();
					
					//--------------------Entity12-----------------------------------------
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					
					Thread.sleep(2000);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
						EntityDropdown2.click();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
					}
					
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref09 = Entity12REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref09);
					Entity12REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot20__REWA2"));
					
					s3.selectByVisibleText("Tier One");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message12;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message12 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message12 = alertMsg.getText();
					}
					System.out.println(Message12);
					Thread.sleep(3000);
					alertPopup.click();
					
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
					wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot21__REWA2"));
					Thread.sleep(2000);
					s.selectByVisibleText("Tier Two");
					wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					Thread.sleep(3000);
					alertPopup.click();
					
					//--------------------Entity13-----------------------------------------
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					
					Thread.sleep(2000);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
						EntityDropdown2.click();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
					}
					
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref10 = Entity13REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref10);
					Entity13REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot22__REWA2"));
					
					s3.selectByVisibleText("Tier One");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message13;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message13 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message13 = alertMsg.getText();
					}
					System.out.println(Message13);
					Thread.sleep(3000);
					alertPopup.click();
					
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
					wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot23__REWA2"));
					Thread.sleep(2000);
					s.selectByVisibleText("Tier Two");
					wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					Thread.sleep(3000);
					alertPopup.click();
					
					//--------------------Entity14--------------------------------------
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					
					Thread.sleep(2000);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
						EntityDropdown2.click();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
					}
					
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref11 = Entity14REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref11);
					Entity14REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot24__REWA2"));
					
					s3.selectByVisibleText("Tier One");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message14;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message14 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message14 = alertMsg.getText();
					}
					System.out.println(Message14);
					Thread.sleep(3000);
					alertPopup.click();
					
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
					wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot25__REWA2"));
					Thread.sleep(2000);
					s.selectByVisibleText("Tier Two");
					wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					Thread.sleep(3000);
					alertPopup.click();
					
					//--------------------Entity15--------------------------------------
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					
					Thread.sleep(2000);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
						EntityDropdown2.click();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
					}
					
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref12 = Entity15REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref12);
					Entity15REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot26__REWA2"));
					
					s3.selectByVisibleText("Tier One");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message15;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message15 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message15 = alertMsg.getText();
					}
					System.out.println(Message15);
					Thread.sleep(3000);
					alertPopup.click();
					
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
					wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot27__REWA2"));
					Thread.sleep(2000);
					s.selectByVisibleText("Tier Two");
					wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					Thread.sleep(3000);
					alertPopup.click();
					
					//--------------------Entity16--------------------------------------
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					
					Thread.sleep(2000);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
						EntityDropdown2.click();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
					}
					
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref13 = Entity16REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref13);
					Entity16REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot28__REWA2"));
					
					s3.selectByVisibleText("Tier One");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message16;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message16 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message16 = alertMsg.getText();
					}
					System.out.println(Message16);
					Thread.sleep(3000);
					alertPopup.click();
					
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
					wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot29__REWA2"));
					Thread.sleep(2000);
					s.selectByVisibleText("Tier Two");
					wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					Thread.sleep(3000);
					alertPopup.click();
					
					//--------------------Entity17--------------------------------------
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					
					Thread.sleep(2000);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
						EntityDropdown2.click();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
					}
					
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref14 = Entity17REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref14);
					Entity17REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot30__REWA2"));
					
					s3.selectByVisibleText("Tier One");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message17;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message17 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message17 = alertMsg.getText();
					}
					System.out.println(Message17);
					Thread.sleep(3000);
					alertPopup.click();
					
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
					wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot31__REWA2"));
					Thread.sleep(2000);
					s.selectByVisibleText("Tier Two");
					wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					Thread.sleep(3000);
					alertPopup.click();
					
					//--------------------Entity18--------------------------------------
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					
					Thread.sleep(2000);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
						EntityDropdown2.click();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
					}
					
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref15 = Entity18REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref15);
					Entity18REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot32__REWA2"));
					
					s3.selectByVisibleText("Tier One");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message18;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message18 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message18 = alertMsg.getText();
					}
					System.out.println(Message18);
					Thread.sleep(3000);
					alertPopup.click();
					
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
					wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot33__REWA2"));
					Thread.sleep(2000);
					s.selectByVisibleText("Tier Two");
					wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					Thread.sleep(3000);
					alertPopup.click();
					
					//--------------------Entity19--------------------------------------
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					
					Thread.sleep(2000);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
						EntityDropdown2.click();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
					}
					
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref16 = Entity19REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref16);
					Entity19REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot34__REWA2"));
					
					s3.selectByVisibleText("Tier One");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message19;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message19 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message19 = alertMsg.getText();
					}
					System.out.println(Message19);
					Thread.sleep(3000);
					alertPopup.click();
					
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
					wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot35__REWA2"));
					Thread.sleep(2000);
					s.selectByVisibleText("Tier One");
					wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					Thread.sleep(3000);
					alertPopup.click();
					
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
					wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot36__REWA2"));
					Thread.sleep(2000);
					s.selectByVisibleText("Tier Two");
					wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					Thread.sleep(3000);
					alertPopup.click();
					
					//--------------------Entity20--------------------------------------
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
					
					Thread.sleep(2000);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
						EntityDropdown2.click();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
						EntityDropdown.click();
					}
					
					action = new Actions(driver.get());
					action.moveToElement(ref).build().perform();
					
					WebElement ref17 = Entity20REWA2;
					js.executeScript("arguments[0].scrollIntoView();", ref17);
					Entity20REWA2.click();
					
					wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
					ContinueButton.click();
					
					selectEventForBidding_REWA2();
					
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

					Thread.sleep(5000);
					btnAddbid.click();
					
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot37__REWA2"));
					
					s3.selectByVisibleText("Tier One");
					
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					String Message20;
					try {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
						Message20 = alertMsg2.getText();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
						Message20 = alertMsg.getText();
					}
					System.out.println(Message20);
					Thread.sleep(3000);
					alertPopup.click();
					
					driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
					wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
					wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
					textBidLot.sendKeys(prop1.getProperty("Bid_Lot38__REWA2"));
					Thread.sleep(2000);
					s.selectByVisibleText("Tier Two");
					wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
					btnSubmit.click();
					wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
					btnConfirm.click();
					Thread.sleep(3000);
					alertPopup.click();
} 
	
	public void BiddingByARforTestData2_PECa() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		try {
			Thread.sleep(4000);
			wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
			btnAddbid.click();
		} catch (Exception e) {
			btnAddbid.click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot1__RE1Ca"));
		Thread.sleep(2000);
		WebElement element0 = selectTier;
		Select s = new Select(element0);
		s.selectByVisibleText("Tier One");
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
		
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	} 
	
	public void BiddingByARforTestData3_PECa() throws IOException, InterruptedException {
		
		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
		
		wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot2__RE1Ca"));
		Thread.sleep(2000);
		WebElement element0 = selectTier;
		Select s = new Select(element0);
		s.selectByVisibleText("Tier Two");
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
		
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	} 
	
	public void BiddingByARforTestData4_PECa() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		try {
			Thread.sleep(4000);
			wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
			btnAddbid.click();
		} catch (Exception e) {
			btnAddbid.click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(textBidLot));
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot3__RE1Ca"));
		Thread.sleep(2000);
		WebElement element0 = selectTier;
		Select s = new Select(element0);
		s.selectByVisibleText("Tier One");
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
		
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	} 
	
	public void BiddingByARforTestData2_PEWa() throws IOException, InterruptedException {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
	    textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Advance_PEWa1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Advance_PEWa1"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}
	
	public void BiddingByARforTestData3_PEWa2() throws IOException, InterruptedException {
		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);

		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Advance_PEWa2_1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Advance_PEWa2_1"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}
	
	public void BiddingByARforTestData6_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Advance_PEWa2_2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Advance_PEWa2_2"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}
	
	public void BiddingByARforTestData13_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Advance_PEWa2_3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Advance_PEWa2_3"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}
	
	public void BiddingByARforTestData16_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Advance_PEWa2_4"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Advance_PEWa2_4"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}
	
	public void BiddingByARforTestData20_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Advance_PEWa2_5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Advance_PEWa2_5"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}
	
	public void BiddingByARforTestData23_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Advance_PEWa2_6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Advance_PEWa2_6"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}
	
	public void BiddingByARforTestData28_PEWa2() throws IOException, InterruptedException {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Advance_PEWa2_7"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Advance_PEWa2_7"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}
	
	public void BiddingByARforTestData3_PEWa() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(4000);
		btnAddbid.click();
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}
	
	public void BiddingByARforTestData4_PEWa() throws IOException, InterruptedException {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Advance_PEWa2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Advance_PEWa2"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}
	
	public void BiddingByARforTestData5_PEWa() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PEWa3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Current_PEWa3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}
	
	public void BiddingByARforTestData6_PEWa() throws IOException, InterruptedException {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Advance_PEWa3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot_Advance_PEWa3"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		Thread.sleep(3000);
        String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData1_PE2() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(5000);
		btnAddbid.click();

		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot1_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();	
	}

	public void BiddingByARforTestData1_PE3() throws IOException, InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		WebElement element = btnAddbid;
		Actions action = new Actions(driver.get());
		action.moveToElement(element).build().perform();

		try {
			action.click(element).build().perform();
		} catch (Exception e) {
			element.click();
		}
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot1_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
		
	}

	public void BiddingByARforTestData1_PE5() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		WebElement element = btnAddbid;
		Actions action = new Actions(driver.get());
		action.moveToElement(element).build().perform();

		try {
			action.click(element).build().perform();
		} catch (Exception e) {
			element.click();
		}
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot1_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData1_PE6() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		WebElement element = btnAddbid;
		Actions action = new Actions(driver.get());
		action.moveToElement(element).build().perform();

		try {
			action.click(element).build().perform();
		} catch (Exception e) {
			element.click();
		}
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot1_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData1_PE8() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		WebElement element = btnAddbid;
		Actions action = new Actions(driver.get());
		action.moveToElement(element).build().perform();

		try {
			action.click(element).build().perform();
		} catch (Exception e) {
			element.click();
		}
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot1_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData1_PE9() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		WebElement element = btnAddbid;
		Actions action = new Actions(driver.get());
		action.moveToElement(element).build().perform();

		try {
			action.click(element).build().perform();
		} catch (Exception e) {
			element.click();
		}
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot1_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData1_PE10() throws IOException, InterruptedException {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		WebElement element = btnAddbid;
		Actions action = new Actions(driver.get());
		action.moveToElement(element).build().perform();

		try {
			action.click(element).build().perform();
		} catch (Exception e) {
			element.click();
		}
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot1_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}
	
	public void BiddingByCaAR_PE11() throws IOException, InterruptedException {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		WebElement element = btnAddbid;
		Actions action = new Actions(driver.get());
		action.moveToElement(element).build().perform();

		try {
			action.click(element).build().perform();
		} catch (Exception e) {
			element.click();
		}
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price1_Current_PE11"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot1_Current_PE11"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
		
		//--------------------------Entity2_Ca------------------------------
		
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
			EntityDropdown2.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
			EntityDropdown.click();
		}
		WebElement ref = EntityName;
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref7 = Entity2_Ca_PE11;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref7);
		Entity2_Ca_PE11.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_PE11();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price2_Current_PE11"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot2_Current_PE11"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Message2 = alertMsg.getText();
		System.out.println(Message2);
		alertPopup.click();
		
//--------------------------Entity3_Ca------------------------------
		
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
			EntityDropdown2.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
			EntityDropdown.click();
		}
		WebElement ref1 = EntityName;
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		
		WebElement ref2 = Entity3_Ca_PE11;
		
		js.executeScript("arguments[0].scrollIntoView();", ref2);
		Entity3_Ca_PE11.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_PE11();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price3_Current_PE11"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot3_Current_PE11"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Message3 = alertMsg.getText();
		System.out.println(Message3);
		alertPopup.click();
	}
	
	public void BiddingByCaAR_PE12() throws IOException, InterruptedException {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		WebElement element = btnAddbid;
		Actions action = new Actions(driver.get());
		action.moveToElement(element).build().perform();

		try {
			action.click(element).build().perform();
		} catch (Exception e) {
			element.click();
		}
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price1_Current_PE12"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot1_Current_PE12"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
		
		//--------------------------Entity2_Ca------------------------------
		
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
			EntityDropdown2.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
			EntityDropdown.click();
		}
		WebElement ref = EntityName;
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref7 = Entity2_Ca_PE12;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref7);
		Entity2_Ca_PE12.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_PE11();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price2_Current_PE12"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot2_Current_PE12"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Message2 = alertMsg.getText();
		System.out.println(Message2);
		alertPopup.click();
		
//--------------------------Entity3_Ca------------------------------
		
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
			EntityDropdown2.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
			EntityDropdown.click();
		}
		WebElement ref1 = EntityName;
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		
		WebElement ref2 = Entity3_Ca_PE12;
		
		js.executeScript("arguments[0].scrollIntoView();", ref2);
		Entity3_Ca_PE12.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_PE11();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price3_Current_PE12"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot3_Current_PE12"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Message3 = alertMsg.getText();
		System.out.println(Message3);
		alertPopup.click();
	}
	
	public void BiddingByARforTestData1_PE12() throws IOException, InterruptedException {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		WebElement element = btnAddbid;
		Actions action = new Actions(driver.get());
		action.moveToElement(element).build().perform();

		try {
			action.click(element).build().perform();
		} catch (Exception e) {
			element.click();
		}
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price1_Current_PE12"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot1_Current_PE12"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData2(){
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		try {
			Thread.sleep(6000);
			wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
			btnAddbid.click();
		} catch (Exception e) {
			btnAddbid.click();
		}
		textBidPrice.sendKeys(prop.getProperty("Bid_Price2"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData2_PE1() throws Exception {
		
		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price2_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot2_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData2_PE2() throws Exception {
		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price2_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot2_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
		
	}

	public void BiddingByARforTestData2_PE3() throws Exception {
		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price2_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot2_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData2_PE5() throws Exception {
		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price2_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot2_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData2_PE6() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price2_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot2_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData2_PE8() throws Exception {
		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price2_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot2_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData2_PE9() throws Exception {
		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price2_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot2_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData2_PE10() throws Exception {
		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price2_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot2_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData3() throws Exception {
//	 
//		driver.get().findElement(btnAuction).click();

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
//		try {
//			WebElement element = btnAddbid;
//			JavascriptExecutor js2 = (JavascriptExecutor) driver.get();
//			js2.executeScript("arguments[0].click()", element);
//		} catch (Exception e) {
//			btnAddbid.click();
//		}
		textBidPrice.sendKeys(prop.getProperty("Bid_Price3"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
//		                             
		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData3_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price3_Advance_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot3_Advance_PE1"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData3_PE2() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price3_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot3_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
		
	}

	public void BiddingByARforTestData3_PE3() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price3_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot3_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData3_PE5() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price3_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot3_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData3_PE6() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price3_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot3_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData3_PE8() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price3_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot3_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData3_PE9() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price3_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot3_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData3_PE10() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price3_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot3_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData4() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price4"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot4"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData4_PE1() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(5000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price4_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot4_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}
	
	public void BiddingByARforTestData4_PE2() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price4_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot4_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
		
	}

	public void BiddingByARforTestData4_PE3() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price4_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot4_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData4_PE5() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price4_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot4_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData4_PE6() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price4_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot4_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData4_PE8() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price4_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot4_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData4_PE9() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price4_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot4_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData4_PE10() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price4_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot4_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData5_PE3() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price5_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot5_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData5_PE5() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price5_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot5_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData5_PE6() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price5_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot5_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData5_PE8() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price5_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot5_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData5_PE9() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price5_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot5_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData5_PE10() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price5_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot5_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData6_PE3() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price6_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot6_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData6_PE5() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price6_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot6_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData6_PE6() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price6_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot6_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData6_PE8() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price6_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot6_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData6_PE9() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price6_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot6_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData6_PE10() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price6_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot6_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData7_PE3() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price7_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot7_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData7_PE5() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price7_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot7_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData7_PE6() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price7_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot7_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData7_PE8() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price7_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot7_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData7_PE9() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price7_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot7_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData7_PE10() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price7_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot7_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData8_PE3() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price8_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot8_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData8_PE5() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price8_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot8_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData8_PE6() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price8_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot8_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData8_PE8() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price8_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot8_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData8_PE9() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price8_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot8_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData8_PE10() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price8_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot8_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData9_PE3() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price9_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot9_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData9_PE5() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price9_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot9_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData9_PE6() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price9_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot9_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData9_PE8() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price9_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot9_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData9_PE9() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price9_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot9_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData9_PE10() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price9_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot9_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData10_PE3() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price10_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot10_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData10_PE5() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price10_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot10_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData10_PE6() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price10_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot10_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData10_PE8() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price10_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot10_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData10_PE9() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price10_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot10_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData10_PE10() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price10_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot10_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData11_PE3() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price11_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot11_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData11_PE5() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price11_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot11_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData11_PE6() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price11_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot11_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData11_PE8() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price11_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot11_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData11_PE9() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price11_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot11_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData11_PE10() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price11_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot11_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData12_PE3() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price12_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot12_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData12_PE5() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price12_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot12_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData12_PE6() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price12_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot12_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData12_PE8() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price12_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot12_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData12_PE9() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price12_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot12_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData12_PE10() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price12_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot12_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData13_PE3() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price13_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot13_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData13_PE5() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price13_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot13_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData13_PE6() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price13_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot13_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData13_PE8() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price13_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot13_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData13_PE9() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price13_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot13_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData13_PE10() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price13_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot13_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}
	
	public void BiddingByQcAR_PE11() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price4_Current_PE11"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot4_Current_PE11"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
		
//--------------------------Entity2_Qc------------------------------
		
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
			EntityDropdown2.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
			EntityDropdown.click();
		}
		WebElement ref = EntityName;
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref7 = Entity2_Qc_PE11;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref7);
		Entity2_Qc_PE11.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_PE11();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price5_Current_PE11"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot5_Current_PE11"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Message2 = alertMsg.getText();
		System.out.println(Message2);
		alertPopup.click();
	}
	
	public void BiddingByQcAR_PE12() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price4_Current_PE12"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot4_Current_PE12"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
		
//--------------------------Entity2_Qc------------------------------
		
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
			EntityDropdown2.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
			EntityDropdown.click();
		}
		WebElement ref = EntityName;
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref7 = Entity2_Qc_PE12;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref7);
		Entity2_Qc_PE12.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_PE11();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price5_Current_PE12"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot5_Current_PE12"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Message2 = alertMsg.getText();
		System.out.println(Message2);
		alertPopup.click();
	}

	public void BiddingByARforTestData14_PE3() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price14_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot14_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData14_PE5() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price14_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot14_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData14_PE6() throws Exception {
		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);

		
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price14_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot14_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData14_PE8() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price14_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot14_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData14_PE9() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price14_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot14_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData14_PE10() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price14_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot14_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData15_PE3() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price15_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot15_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData15_PE5() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price15_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot15_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData15_PE6() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price15_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot15_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData15_PE8() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price15_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot15_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData15_PE9() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price15_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot15_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData15_PE10() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price15_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot15_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData16_PE3() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price16_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot16_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData16_PE5() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price16_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot16_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData16_PE6() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price16_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot16_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData16_PE8() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price16_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot16_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData16_PE9() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price16_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot16_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData16_PE10() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price16_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot16_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData5() throws Exception {
//		WebElement element = btnAddbid;
//		Actions action = new Actions(driver.get());
//		action.moveToElement(element).build().perform();
//		                               
//		action.click(element).build().perform();

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price5"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData5_PE1() throws Exception {
		
		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
     
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price5_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot5_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData6() throws Exception {
//	 
//		driver.get().findElement(btnAuction).click();
//		                             
//		                               
//		try {
//			WebElement element = btnAddbid;
//			JavascriptExecutor js2 = (JavascriptExecutor) driver.get();
//			js2.executeScript("arguments[0].click()", element);
//		} catch (Exception e) {
//			btnAddbid.click();
//		}

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price6"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData6_PE1() throws Exception {
		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price6_Advance_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot6_Advance_PE1"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData7() throws Exception {

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price7"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot7"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData7_PE1() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
        Thread.sleep(6000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price7_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot7_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData8() throws Exception {

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price8"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
		String Massage2 = alertMsg2.getText();
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData8_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price8_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot8_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();

		wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
		String Massage2 = alertMsg.getText();
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData9() throws Exception {

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price9"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		wait.until(ExpectedConditions.elementToBeClickable(alertPopup)).click();
		
	}

	public void BiddingByARforTestData9_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price9_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot9_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(alertPopup)).click();
	}


	public void BiddingByARforTestData10() throws Exception {

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price10"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();

	}

	public void BiddingByARforTestData10_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price10_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot10_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();

	}

	public void BiddingByARforTestData11() throws Exception {

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price11"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot11"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData11_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price11_Advance_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot11_Advance_PE1"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData12() throws Exception {

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price12"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot12"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData12_PE1() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(6000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price12_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot12_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData5_PE2() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price5_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot5_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	
	}

	public void BiddingByARforTestData13() throws Exception {

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price13"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot13"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData13_PE1() throws Exception {
		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price13_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot13_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData6_PE2() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price6_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot6_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	
	}

	public void BiddingByARforTestData14() throws Exception {

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price14"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot14"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData14_PE1() throws Exception {
		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price14_Advance_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot14_Advance_PE1"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData7_PE2() throws Exception {
		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price7_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot7_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
		
	}

	public void BiddingByARforTestData8_PE2() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price8_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot8_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData15() throws Exception {

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price15"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot15"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData15_PE1() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(5000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price15_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot15_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}
	
	public void BiddingByAR1_SBMA1() throws Exception {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		
		btnAddbid.click();
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA1-1"));
		WebElement element0 = selectTier;
		Select s = new Select(element0);
		s.selectByVisibleText("CATEGORY B");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message = alertMsg.getText();
		}
		System.out.println(Message);
		Thread.sleep(3000);
		alertPopup.click();
		//-------------------Entity2------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		WebElement ref = EntityName;
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref1 = Entity2;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		Entity2.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA1();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA1-2"));
		WebElement element1 = selectTier;
		Select s1 = new Select(element1);
		s1.selectByVisibleText("CATEGORY A");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message2 = alertMsg.getText();
		}
		System.out.println(Message2);
		Thread.sleep(3000);
		alertPopup.click();
		
		//-----------------Entity3-----------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref2 = Entity3;
		js.executeScript("arguments[0].scrollIntoView();", ref2);
		Entity3.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA1();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA1-2"));
		
		Select s2 = new Select(element1);
		s2.selectByVisibleText("CATEGORY B");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message3;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message3 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message3 = alertMsg.getText();
		}
		System.out.println(Message3);
		Thread.sleep(3000);
		alertPopup.click();
		
		//--------------------Entity4-----------------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref3 = Entity4;
		js.executeScript("arguments[0].scrollIntoView();", ref3);
		Entity4.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA1();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA1-4"));
		
		Select s3 = new Select(element1);
		s3.selectByVisibleText("CATEGORY B");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message4;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message4 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message4 = alertMsg.getText();
		}
		System.out.println(Message4);
		Thread.sleep(3000);
		alertPopup.click();
		
		//--------------------Entity5-----------------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
				wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
				EntityDropdown.click();
				action = new Actions(driver.get());
				action.moveToElement(ref).build().perform();
				
				WebElement ref4 = Entity5;
				js.executeScript("arguments[0].scrollIntoView();", ref4);
				Entity5.click();
				
				wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
				ContinueButton.click();
				
				selectEventForBidding_SBMA1();
				
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

				Thread.sleep(5000);
				btnAddbid.click();
				
				textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA1-5"));
				
				Select s4 = new Select(element1);
				s4.selectByVisibleText("CATEGORY C");
				
				btnSubmit.click();
				wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
				btnConfirm.click();
				String Message5;
				try {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
					Message5 = alertMsg2.getText();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
					Message5 = alertMsg.getText();
				}
				System.out.println(Message5);
				Thread.sleep(3000);
				alertPopup.click();
		
	}
	
	public void BiddingByAR1_SBMA2() throws Exception {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		
		btnAddbid.click();
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA2_1"));
		WebElement element0 = selectTier;
		Select s = new Select(element0);
		s.selectByVisibleText("CATEGORY A");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message = alertMsg.getText();
		}
		System.out.println(Message);
		Thread.sleep(3000);
		alertPopup.click();
		//-------------------Entity2------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		WebElement ref = EntityName;
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref1 = Entity2SBMA2;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		Entity2SBMA2.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA2();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA2_2"));
		WebElement element1 = selectTier;
		Select s1 = new Select(element1);
		s1.selectByVisibleText("CATEGORY A");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message2 = alertMsg.getText();
		}
		System.out.println(Message2);
		Thread.sleep(3000);
		alertPopup.click();
		
		//-----------------Entity3-----------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref2 = Entity3SBMA2;
		js.executeScript("arguments[0].scrollIntoView();", ref2);
		Entity3SBMA2.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA2();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA2_3"));
		
		Select s2 = new Select(element1);
		s2.selectByVisibleText("CATEGORY B");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message3;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message3 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message3 = alertMsg.getText();
		}
		System.out.println(Message3);
		Thread.sleep(3000);
		alertPopup.click();
		
		//--------------------Entity4-----------------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref3 = Entity4SBMA2;
		js.executeScript("arguments[0].scrollIntoView();", ref3);
		Entity4SBMA2.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA2();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA2_4"));
		
		Select s3 = new Select(element1);
		s3.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message4;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message4 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message4 = alertMsg.getText();
		}
		System.out.println(Message4);
		Thread.sleep(3000);
		alertPopup.click();
		
		//--------------------Entity5-----------------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
				wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
				EntityDropdown.click();
				action = new Actions(driver.get());
				action.moveToElement(ref).build().perform();
				
				WebElement ref4 = Entity5SBMA2;
				js.executeScript("arguments[0].scrollIntoView();", ref4);
				Entity5SBMA2.click();
				
				wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
				ContinueButton.click();
				
				selectEventForBidding_SBMA2();
				
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

				Thread.sleep(5000);
				btnAddbid.click();
				
				textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA2_5"));
				
				Select s4 = new Select(element1);
				s4.selectByVisibleText("CATEGORY C");
				
				btnSubmit.click();
				wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
				btnConfirm.click();
				String Message5;
				try {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
					Message5 = alertMsg2.getText();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
					Message5 = alertMsg.getText();
				}
				System.out.println(Message5);
				Thread.sleep(3000);
				alertPopup.click();
		
	}
	
	public void BiddingByAR1_SBMA3() throws Exception {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		
		btnAddbid.click();
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA3_1"));
		WebElement element0 = selectTier;
		Select s = new Select(element0);
		s.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message = alertMsg.getText();
		}
		System.out.println(Message);
		Thread.sleep(3000);
		alertPopup.click();
		//-------------------Entity2------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		WebElement ref = EntityName;
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref1 = Entity2SBMA3;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		Entity2SBMA3.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA3();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA3_2"));
		WebElement element1 = selectTier;
		Select s1 = new Select(element1);
		s1.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message2 = alertMsg.getText();
		}
		System.out.println(Message2);
		Thread.sleep(3000);
		alertPopup.click();
		
		//-----------------Entity3-----------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref2 = Entity3SBMA3;
		js.executeScript("arguments[0].scrollIntoView();", ref2);
		Entity3SBMA3.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA3();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA3_3"));
		
		Select s2 = new Select(element1);
		s2.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message3;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message3 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message3 = alertMsg.getText();
		}
		System.out.println(Message3);
		Thread.sleep(3000);
		alertPopup.click();
		
		//--------------------Entity4-----------------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref3 = Entity4SBMA3;
		js.executeScript("arguments[0].scrollIntoView();", ref3);
		Entity4SBMA3.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA3();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA3_4"));
		
		Select s3 = new Select(element1);
		s3.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message4;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message4 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message4 = alertMsg.getText();
		}
		System.out.println(Message4);
		Thread.sleep(3000);
		alertPopup.click();
		
		//--------------------Entity5-----------------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
				wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
				EntityDropdown.click();
				action = new Actions(driver.get());
				action.moveToElement(ref).build().perform();
				
				WebElement ref4 = Entity5SBMA3;
				js.executeScript("arguments[0].scrollIntoView();", ref4);
				Entity5SBMA3.click();
				
				wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
				ContinueButton.click();
				
				selectEventForBidding_SBMA3();
				
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

				Thread.sleep(5000);
				btnAddbid.click();
				
				textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA3_5"));
				
				Select s4 = new Select(element1);
				s4.selectByVisibleText("CATEGORY C");
				
				btnSubmit.click();
				wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
				btnConfirm.click();
				String Message5;
				try {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
					Message5 = alertMsg2.getText();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
					Message5 = alertMsg.getText();
				}
				System.out.println(Message5);
				Thread.sleep(3000);
				alertPopup.click();
		
	}
	
	public void BiddingByAR1_SBMA4() throws Exception {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		
		btnAddbid.click();
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA4_1"));
		WebElement element0 = selectTier;
		Select s = new Select(element0);
		s.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message = alertMsg.getText();
		}
		System.out.println(Message);
		Thread.sleep(3000);
		alertPopup.click();
		//-------------------Entity2------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		WebElement ref = EntityName;
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref1 = Entity2SBMA4;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		Entity2SBMA4.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA4();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA4_2"));
		WebElement element1 = selectTier;
		Select s1 = new Select(element1);
		s1.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message2 = alertMsg.getText();
		}
		System.out.println(Message2);
		Thread.sleep(3000);
		alertPopup.click();
		
		//-----------------Entity3-----------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref2 = Entity3SBMA4;
		js.executeScript("arguments[0].scrollIntoView();", ref2);
		Entity3SBMA4.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA4();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA4_3"));
		
		Select s2 = new Select(element1);
		s2.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message3;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message3 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message3 = alertMsg.getText();
		}
		System.out.println(Message3);
		Thread.sleep(3000);
		alertPopup.click();
		
		//--------------------Entity4-----------------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref3 = Entity4SBMA4;
		js.executeScript("arguments[0].scrollIntoView();", ref3);
		Entity4SBMA4.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA4();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA4_4"));
		
		Select s3 = new Select(element1);
		s3.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message4;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message4 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message4 = alertMsg.getText();
		}
		System.out.println(Message4);
		Thread.sleep(3000);
		alertPopup.click();
		
		//--------------------Entity5-----------------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
				wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
				EntityDropdown.click();
				action = new Actions(driver.get());
				action.moveToElement(ref).build().perform();
				
				WebElement ref4 = Entity5SBMA4;
				js.executeScript("arguments[0].scrollIntoView();", ref4);
				Entity5SBMA4.click();
				
				wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
				ContinueButton.click();
				
				selectEventForBidding_SBMA4();
				
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

				Thread.sleep(5000);
				btnAddbid.click();
				
				textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA4_5"));
				
				Select s4 = new Select(element1);
				s4.selectByVisibleText("CATEGORY C");
				
				btnSubmit.click();
				wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
				btnConfirm.click();
				String Message5;
				try {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
					Message5 = alertMsg2.getText();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
					Message5 = alertMsg.getText();
				}
				System.out.println(Message5);
				Thread.sleep(3000);
				alertPopup.click();
		
	}
	
	public void BiddingByAR1_SBMA7() throws Exception {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		
		btnAddbid.click();
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA7_1"));
		WebElement element0 = selectTier;
		Select s = new Select(element0);
		s.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message = alertMsg.getText();
		}
		System.out.println(Message);
		Thread.sleep(3000);
		alertPopup.click();
		//-------------------Entity2------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		WebElement ref = EntityName;
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref1 = Entity2SBMA7;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		Entity2SBMA7.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA7();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA7_2"));
		WebElement element1 = selectTier;
		Select s1 = new Select(element1);
		s1.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message2 = alertMsg.getText();
		}
		System.out.println(Message2);
		Thread.sleep(3000);
		alertPopup.click();
		
		//-----------------Entity3-----------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref2 = Entity3SBMA7;
		js.executeScript("arguments[0].scrollIntoView();", ref2);
		Entity3SBMA7.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA7();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA7_3"));
		
		Select s2 = new Select(element1);
		s2.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message3;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message3 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message3 = alertMsg.getText();
		}
		System.out.println(Message3);
		Thread.sleep(3000);
		alertPopup.click();
		
		//--------------------Entity4-----------------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref3 = Entity4SBMA7;
		js.executeScript("arguments[0].scrollIntoView();", ref3);
		Entity4SBMA7.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA7();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA7_4"));
		
		Select s3 = new Select(element1);
		s3.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message4;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message4 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message4 = alertMsg.getText();
		}
		System.out.println(Message4);
		Thread.sleep(3000);
		alertPopup.click();
		
		//--------------------Entity5-----------------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
				wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
				EntityDropdown.click();
				action = new Actions(driver.get());
				action.moveToElement(ref).build().perform();
				
				WebElement ref4 = Entity5SBMA7;
				js.executeScript("arguments[0].scrollIntoView();", ref4);
				Entity5SBMA7.click();
				
				wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
				ContinueButton.click();
				
				selectEventForBidding_SBMA7();
				
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

				Thread.sleep(5000);
				btnAddbid.click();
				
				textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA7_5"));
				
				Select s4 = new Select(element1);
				s4.selectByVisibleText("CATEGORY C");
				
				btnSubmit.click();
				wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
				btnConfirm.click();
				String Message5;
				try {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
					Message5 = alertMsg2.getText();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
					Message5 = alertMsg.getText();
				}
				System.out.println(Message5);
				Thread.sleep(3000);
				alertPopup.click();
		
	}
	
	public void BiddingByAR1_SBMA5() throws Exception {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		
		btnAddbid.click();
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA5_1"));
		WebElement element0 = selectTier;
		Select s = new Select(element0);
		s.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message = alertMsg.getText();
		}
		System.out.println(Message);
		Thread.sleep(3000);
		alertPopup.click();
		//-------------------Entity2------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		WebElement ref = EntityName;
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref1 = Entity2SBMA5;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		Entity2SBMA5.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA5();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA5_2"));
		WebElement element1 = selectTier;
		Select s1 = new Select(element1);
		s1.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message2 = alertMsg.getText();
		}
		System.out.println(Message2);
		Thread.sleep(3000);
		alertPopup.click();
		
		//-----------------Entity3-----------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref2 = Entity3SBMA5;
		js.executeScript("arguments[0].scrollIntoView();", ref2);
		Entity3SBMA5.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA5();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA5_3"));
		
		Select s2 = new Select(element1);
		s2.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message3;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message3 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message3 = alertMsg.getText();
		}
		System.out.println(Message3);
		Thread.sleep(3000);
		alertPopup.click();
		
		//--------------------Entity4-----------------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref3 = Entity4SBMA5;
		js.executeScript("arguments[0].scrollIntoView();", ref3);
		Entity4SBMA5.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA5();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA5_4"));
		
		Select s3 = new Select(element1);
		s3.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message4;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message4 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message4 = alertMsg.getText();
		}
		System.out.println(Message4);
		Thread.sleep(3000);
		alertPopup.click();
		
		//--------------------Entity5-----------------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
				wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
				EntityDropdown.click();
				action = new Actions(driver.get());
				action.moveToElement(ref).build().perform();
				
				WebElement ref4 = Entity5SBMA5;
				js.executeScript("arguments[0].scrollIntoView();", ref4);
				Entity5SBMA5.click();
				
				wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
				ContinueButton.click();
				
				selectEventForBidding_SBMA5();
				
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

				Thread.sleep(5000);
				btnAddbid.click();
				
				textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA5_5"));
				
				Select s4 = new Select(element1);
				s4.selectByVisibleText("CATEGORY C");
				
				btnSubmit.click();
				wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
				btnConfirm.click();
				String Message5;
				try {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
					Message5 = alertMsg2.getText();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
					Message5 = alertMsg.getText();
				}
				System.out.println(Message5);
				Thread.sleep(3000);
				alertPopup.click();
		
	}
	
	public void BiddingByAR1_SBMA6() throws Exception {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		
		btnAddbid.click();
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA6_1"));
		WebElement element0 = selectTier;
		Select s = new Select(element0);
		s.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message = alertMsg.getText();
		}
		System.out.println(Message);
		Thread.sleep(3000);
		alertPopup.click();
		//-------------------Entity2------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		WebElement ref = EntityName;
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref1 = Entity2SBMA6;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		Entity2SBMA6.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA6();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA6_2"));
		WebElement element1 = selectTier;
		Select s1 = new Select(element1);
		s1.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message2 = alertMsg.getText();
		}
		System.out.println(Message2);
		Thread.sleep(3000);
		alertPopup.click();
		
		//-----------------Entity3-----------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref2 = Entity3SBMA6;
		js.executeScript("arguments[0].scrollIntoView();", ref2);
		Entity3SBMA6.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA6();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA6_3"));
		
		Select s2 = new Select(element1);
		s2.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message3;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message3 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message3 = alertMsg.getText();
		}
		System.out.println(Message3);
		Thread.sleep(3000);
		alertPopup.click();
		
		//--------------------Entity4-----------------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
		EntityDropdown.click();
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref3 = Entity4SBMA6;
		js.executeScript("arguments[0].scrollIntoView();", ref3);
		Entity4SBMA6.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA6();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA6_4"));
		
		Select s3 = new Select(element1);
		s3.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message4;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message4 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message4 = alertMsg.getText();
		}
		System.out.println(Message4);
		Thread.sleep(3000);
		alertPopup.click();
		
		//--------------------Entity5-----------------------------------------
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
				wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
				EntityDropdown.click();
				action = new Actions(driver.get());
				action.moveToElement(ref).build().perform();
				
				WebElement ref4 = Entity5SBMA6;
				js.executeScript("arguments[0].scrollIntoView();", ref4);
				Entity5SBMA6.click();
				
				wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
				ContinueButton.click();
				
				selectEventForBidding_SBMA6();
				
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

				Thread.sleep(5000);
				btnAddbid.click();
				
				textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA6_5"));
				
				Select s4 = new Select(element1);
				s4.selectByVisibleText("CATEGORY C");
				
				btnSubmit.click();
				wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
				btnConfirm.click();
				String Message5;
				try {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
					Message5 = alertMsg2.getText();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
					Message5 = alertMsg.getText();
				}
				System.out.println(Message5);
				Thread.sleep(3000);
				alertPopup.click();
		
	}
	
	public void BiddingByAR2_SBMA1() throws Exception {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(5000);
		btnAddbid.click();
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA1-6"));
		WebElement element0 = selectTier;
		Select s = new Select(element0);
		s.selectByVisibleText("CATEGORY B");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message = alertMsg.getText();
		}
		System.out.println(Message);
		Thread.sleep(3000);
		alertPopup.click();
		
		//---------------------Entity 7---------------------------------
		
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
			EntityDropdown2.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
			EntityDropdown.click();
		}
		WebElement ref = EntityName;
		action = new Actions(driver.get());
		action.moveToElement(ref).build().perform();
		
		WebElement ref7 = Entity7;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref7);
		Entity7.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		
		selectEventForBidding_SBMA1();
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		Thread.sleep(5000);
		btnAddbid.click();
		
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA1-7"));
		WebElement element1 = selectTier;
		Select s1 = new Select(element1);
		s1.selectByVisibleText("CATEGORY A");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message2 = alertMsg.getText();
		}
		System.out.println(Message2);
		Thread.sleep(3000);
		alertPopup.click();
		
		//-----------------Entity8-----------------------------------
		
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
			EntityDropdown2.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
			EntityDropdown.click();
		}
		
				action = new Actions(driver.get());
				action.moveToElement(ref).build().perform();
				
				WebElement ref8 = Entity8;
				js.executeScript("arguments[0].scrollIntoView();", ref8);
				Entity8.click();
				
				wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
				ContinueButton.click();
				
				selectEventForBidding_SBMA1();
				
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

				Thread.sleep(5000);
				btnAddbid.click();
				
				textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA1-8"));
				
				Select s2 = new Select(element1);
				s2.selectByVisibleText("CATEGORY B");
				
				btnSubmit.click();
				wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
				btnConfirm.click();
				String Message3;
				try {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
					Message3 = alertMsg2.getText();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
					Message3 = alertMsg.getText();
				}
				System.out.println(Message3);
				Thread.sleep(3000);
				alertPopup.click();
				
				//-------------------Entity 9-------------------------------
				
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
				
				
				try {
					wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
					EntityDropdown2.click();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
					EntityDropdown.click();
				}
				
				action = new Actions(driver.get());
				action.moveToElement(ref).build().perform();
				
				WebElement ref9 = Entity9;
				js.executeScript("arguments[0].scrollIntoView();", ref9);
				Entity9.click();
				
				wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
				ContinueButton.click();
				
				selectEventForBidding_SBMA1();
				
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

				Thread.sleep(5000);
				btnAddbid.click();
				
				textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA1-9"));
				
				Select s3 = new Select(element1);
				s3.selectByVisibleText("CATEGORY C");
				
				btnSubmit.click();
				wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
				btnConfirm.click();
				String Message4;
				try {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
					Message4 = alertMsg2.getText();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
					Message4 = alertMsg.getText();
				}
				System.out.println(Message4);
				Thread.sleep(3000);
				alertPopup.click();
				
				//---------------------------Entity 10--------------------------
				
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.UP);
				
				
				try {
					wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown2));
					EntityDropdown2.click();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(EntityDropdown));
					EntityDropdown.click();
				}
				
				action = new Actions(driver.get());
				action.moveToElement(ref).build().perform();
				
				WebElement ref10 = Entity10;
				js.executeScript("arguments[0].scrollIntoView();", ref10);
				Entity10.click();
				
				wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
				ContinueButton.click();
				
				selectEventForBidding_SBMA1();
				
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
				driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

				Thread.sleep(5000);
				btnAddbid.click();
				
				textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA1-10"));
				
				Select s4 = new Select(element1);
				s4.selectByVisibleText("CATEGORY A");
				
				btnSubmit.click();
				wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
				btnConfirm.click();
				String Message5;
				try {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
					Message5 = alertMsg2.getText();
				} catch (Exception e) {
					wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
					Message5 = alertMsg.getText();
				}
				System.out.println(Message5);
				Thread.sleep(3000);
				alertPopup.click();
		
	}
	
	public void BiddingByAR3_SBMA1() throws Exception {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(5000);
		btnAddbid.click();
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA1-11"));
		WebElement element0 = selectTier;
		Select s = new Select(element0);
		s.selectByVisibleText("CATEGORY A");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message = alertMsg.getText();
		}
		System.out.println(Message);
		Thread.sleep(3000);
		alertPopup.click();
		
	}
	
	public void BiddingByAR4_SBMA1() throws Exception {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(5000);
		btnAddbid.click();
		textBidLot.sendKeys(prop1.getProperty("Bid_Lot__SBMA1-12"));
		WebElement element0 = selectTier;
		Select s = new Select(element0);
		s.selectByVisibleText("CATEGORY C");
		
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Message;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Message = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Message = alertMsg.getText();
		}
		System.out.println(Message);
		Thread.sleep(3000);
		alertPopup.click();
		
	}


	public void BiddingByARforTestData9_PE2() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price9_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot9_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData22_PE1() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(5000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price22_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot22_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData13_PE2() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price13_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot13_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData25_PE1() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		Thread.sleep(5000);
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price25_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot25_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData17_PE2() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price17_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot17_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData17_PE3() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);


		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price17_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot17_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData17_PE5() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price17_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot17_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData17_PE6() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price17_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot17_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData17_PE8() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price17_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot17_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData17_PE9() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price17_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot17_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData17_PE10() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(biddingWindowOpenTimer));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price17_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot17_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData18_PE3() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price18_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot18_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData18_PE5() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price18_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot18_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData18_PE6() throws Exception {
		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);

		
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price18_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot18_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData18_PE8() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price18_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot18_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData18_PE9() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price18_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot18_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData18_PE10() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price18_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot18_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData19_PE3() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price19_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot19_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData19_PE5() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price19_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot19_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData19_PE6() throws Exception {
		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);

		
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price19_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot19_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData19_PE8() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price19_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot19_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData19_PE9() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price19_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot19_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData19_PE10() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price19_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot19_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData20_PE3() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price20_Current_PE3"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot20_Current_PE3"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}
	
	public void BiddingByARforTestData20_PE4() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price20_Current_PE4"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot20_Current_PE4"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData20_PE5() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price20_Current_PE5"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot20_Current_PE5"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData20_PE6() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price20_Current_PE6"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot20_Current_PE6"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData20_PE8() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
	        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price20_Current_PE8"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot20_Current_PE8"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData20_PE9() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price20_Current_PE9"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot20_Current_PE9"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData20_PE10() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price20_Current_PE10"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot20_Current_PE10"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData18_PE2() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price18_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot18_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData19_PE2() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price19_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot19_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData20_PE2() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price20_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot20_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData16() throws Exception {

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price16"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot16"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData16_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price16_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot16_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData10_PE2() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price10_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot10_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData23_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price23_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot23_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData14_PE2() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price14_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot14_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData26_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price26_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot26_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData17() throws Exception {

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();

		textBidPrice.sendKeys(prop.getProperty("Bid_Price17"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot17"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData17_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price17_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot17_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData11_PE2() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);

		textBidPrice.sendKeys(prop1.getProperty("Bid_Price11_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot11_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData24_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);

		textBidPrice.sendKeys(prop1.getProperty("Bid_Price24_Advance_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot24_Advance_PE1"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData16_PE2() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);

		textBidPrice.sendKeys(prop1.getProperty("Bid_Price16_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot16_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData15_PE2() throws Exception {

		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);

		textBidPrice.sendKeys(prop1.getProperty("Bid_Price15_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot15_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData27_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price27_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot27_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData28_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);

		textBidPrice.sendKeys(prop1.getProperty("Bid_Price28_Advance_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot28_Advance_PE1"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}


	public void BiddingByARforTestData18() throws Exception {

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price18"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot18"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData18_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price18_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot18_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData12_PE2() throws Exception {
		Thread.sleep(2000);
        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
            btnAddbid.click();
        } catch (Exception e) {
            btnAddbid.click();
        }
        Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price12_Current_PE2"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot12_Current_PE2"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData19() throws Exception {

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price19"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot19"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData19_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price19_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot19_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData20() throws Exception {

		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
		btnAddbid.click();
		textBidPrice.sendKeys(prop.getProperty("Bid_Price20"));
		textBidLots.sendKeys(prop.getProperty("Bid_Lot20"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		alertPopup.click();
	}

	public void BiddingByARforTestData20_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price20_Current_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot20_Current_PE1"));
		dropdownvintage.sendKeys("Current");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void BiddingByARforTestData21_PE1() throws Exception {

		 Thread.sleep(2000);
	        driver.get().findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	        try {
	            Thread.sleep(4000);
	            wait.until(ExpectedConditions.elementToBeClickable(btnAddbid));
	            btnAddbid.click();
	        } catch (Exception e) {
	            btnAddbid.click();
	        }
     Thread.sleep(2000);
		textBidPrice.sendKeys(prop1.getProperty("Bid_Price21_Advance_PE1"));
		textBidLots.sendKeys(prop1.getProperty("Bid_Lot21_Advance_PE1"));
		dropdownvintage.sendKeys("Advance");
		btnSubmit.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm));
		btnConfirm.click();
		String Massage2;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg));
			Massage2 = alertMsg.getText();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(alertMsg2));
			Massage2 = alertMsg2.getText();
		}
		System.out.println(Massage2);
		Thread.sleep(3000);
		alertPopup.click();
	}

	public void SelectEntity2() throws InterruptedException {
		////
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(btnEntity6));
//		driver.get().findElement(By.xpath("//input[@placeholder='Enter Entity Name or Entity ID']"))
//				.sendKeys(prop.getProperty("FirstEntity"));
		driver.get().findElement(btnEntity6).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
		// ObjectRepo.test.log(Status.PASS, ":Selected AR1 entity1 account");
	}

	public void SelectEntity2_PE1() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CASecondEntity_PE1"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CASecondEntity_PE1") + " :Entity Account Selected By Account Representative");

	}

	public void ARLoginQC2() {
		try {
			btnLogin.click();
			username.sendKeys(prop.getProperty("AR_USerName1"));
			password.sendKeys(prop.getProperty("AR_PassWord"));
			btnLogin2.click();
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop.getProperty("AR_USerName1"));
			password.sendKeys(prop.getProperty("AR_PassWord"));
			btnLogin2.click();
		}

	}

	public void ARLoginQC_PE1() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName2_PE1"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName2_PE1") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName2_PE1") + " AR login successfully");
		
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName2_PE1"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName2_PE1"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName2_PE1") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName2_PE1") + " AR login successfully");
		}

	}
	
	public void ARLoginQC_PE11() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
			btnLogin.click();
			username.sendKeys(prop1.getProperty("AR_USerName2_PE11"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName2_PE11") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName2_PE1") + " AR login successfully");
		
		} catch (Exception e) {
			Login.click();
			username.sendKeys(prop1.getProperty("AR_USerName2_PE11"));
			ObjectRepo.test.log(Status.PASS, "AR Username Entered  : " + prop1.getProperty("AR_USerName2_PE11"));
			password.sendKeys(prop1.getProperty("AR_PassWord"));
			ObjectRepo.test.log(Status.PASS, "AR Passward Entered  : " + prop1.getProperty("AR_PassWord"));
			btnLogin2.click();
			System.out.println("" + prop1.getProperty("AR_USerName2_PE11") + " AR login successfully");
			ObjectRepo.test.log(Status.PASS, "" + prop1.getProperty("AR_USerName2_PE11") + " AR login successfully");
		}

	}

	public void SelectEntity3() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(btnEntity7));
		driver.get().findElement(btnEntity7).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity3_PE1() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAThirdEntity_PE1"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAThirdEntity_PE1") + " :Entity Account Selected By Account Representative");
					
	}

	public void SelectEntity4() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Enter Entity Name or Entity ID']")));
		driver.get().findElement(By.xpath("//input[@placeholder='Enter Entity Name or Entity ID']"))
				.sendKeys(prop.getProperty("CAFourthEntity"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity4_PE1() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_PE1"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity2_PE2() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_PE2"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity2_PE3() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CASecoundEntity_PE3"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CASecoundEntity_PE3") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity5() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Enter Entity Name or Entity ID']")));
		driver.get().findElement(By.xpath("//input[@placeholder='Enter Entity Name or Entity ID']"))
				.sendKeys(prop.getProperty("CAFifthEntity"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity5_PE1() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCSecoundEntity_PE1"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}
	
	public void SelectEntity1_SBMA1() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("QCFirstEntity_SBMA1"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("QCFirstEntity_SBMA1") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity1_SBMA2() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_SBMA2"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}
	
	public void SelectEntity1_SBMA3() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_SBMA3"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}
	
	public void SelectEntity1_SBMA4() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_SBMA4"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}
	
	public void SelectEntity1_SBMA7() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_SBMA7"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}
	
	public void SelectEntity1_SBMA5() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_SBMA5"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}
	
	public void SelectEntity1_SBMA6() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_SBMA6"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}
	
	public void SelectEntity6_SBMA1() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("QCSixthEntity_SBMA1"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("QCSixthEntity_SBMA1") + " :Entity Account Selected By Account Representative");

	}
	
	public void SelectEntity11_SBMA1() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCEleventhEntity_SBMA1"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}
	
	public void SelectEntity12_SBMA1() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("QCTwelvethEntity_SBMA1"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("QCTwelvethEntity_SBMA1") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity3_PE2() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCSecoundEntity_PE2"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity3_PE3() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAThirdEntity_PE3"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAThirdEntity_PE3") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity3_PE5() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAThirdEntity_PE5"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAThirdEntity_PE5") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity3_PE6() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAThirdEntity_PE6"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAThirdEntity_PE6") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity3_PE7() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAThirdEntity_PE7"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAThirdEntity_PE7") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity3_PE8() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAThirdEntity_PE8"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAThirdEntity_PE8") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity3_PE9() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAThirdEntity_PE9"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAThirdEntity_PE9") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity3_PE10() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAThirdEntity_PE10"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAThirdEntity_PE10") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity6_PE1() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCThirdEntity_PE1"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();

	}

	public void SelectEntity4_PE2() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCThirdEntity_PE2"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity4_PE3() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFourthEntity_PE3"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFourthEntity_PE3") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity4_PE5() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFourthEntity_PE5"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFourthEntity_PE5") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity4_PE6() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFourthEntity_PE6"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFourthEntity_PE6") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity4_PE7() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFourthEntity_PE7"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFourthEntity_PE7") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity4_PE8() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Enter Entity Name or Entity ID\"]"))
		.sendKeys(prop1.getProperty("CAFourthEntity_PE8"));
		driver.get().findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();

		driver.get().findElement(By.xpath(
				"(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary\"])[2]"))
				.click();
		ObjectRepo.test.log(Status.PASS,
				prop1.getProperty("CAFourthEntity_PE8") + " :Entity Account Selected By Account Representative");

	}

	public void SelectEntity4_PE9() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_PE9"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity4_PE10() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_PE10"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}
	
	public void SelectEntity4_PE11() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_PE11"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}
	
	public void SelectEntity4_PE12() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_PE12"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity7_PE1() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFourthEntity_PE1"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity5_PE2() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFourthEntity_PE2"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity5_PE3() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_PE3"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}
	
	public void SelectEntity5_PE4() throws InterruptedException {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_PE4"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity5_PE5() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_PE5"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity5_PE6() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_PE6"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity5_PE7() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_PE7"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity5_PE8() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCFirstEntity_PE8"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity5_PE9() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCSecondEntity_PE9"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void SelectEntity5_PE10() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]")));
		driver.get().findElement(By.xpath("//*[@placeholder=\"Inscrire le nom ou l'ID de l'entité\"]"))
				.sendKeys(prop1.getProperty("QCSecondEntity_PE10"));
		driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.get().findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary'])[2]"))
				.click();
	}

	public void clickbtnEvent() {
		wait.until(ExpectedConditions.elementToBeClickable(btnEvent));
		WebElement abc1 = btnEvent;
		Actions action = new Actions(driver.get());
		action.moveToElement(abc1).build().perform();
		action.clickAndHold(abc1).build().perform();
		action.click(abc1).build().perform();

	}

	public void getCurrentEvent() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtnReport);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");

	}

	public void getCurrentEvent_PE1() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");

	}
	
	public void getCurrentEvent_PEWa() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEWa);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");
	}
	
	public void getCurrentEvent_PEWa2() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEWa2);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");
	}
	
	public void getCurrentEvent_PECa() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PECa);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");

	}
	
	public void getCurrentEvent_REWA1() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_REWA1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");

	}
	
	public void getCurrentEvent_REWA2() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_REWA2);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");

	}
	
	public void getCurrentEvent_PEQc() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEQc);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");

	}
	
	public void getCurrentEvent_PEQc1() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEQc1);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");

	}
	
	public void getCurrentEvent_PEQc2() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEQc2);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");
	}
	
	public void getCurrentEvent_PEQc3() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEQc3);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");
	}
	
	public void getCurrentEvent_PEQc6() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEQc6);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");
	}
	
	public void getCurrentEvent_PEQc4() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEQc4);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");
	}
	
	public void getCurrentEvent_PEQc5() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PEQc5);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");
	}
	
	
	public void uploadEmissionUnitsFileR69() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(UploadEmissionUnits));
		UploadEmissionUnits.click();
		Thread.sleep(4000);
		try {
			Runtime.getRuntime().exec("C:\\Users\\Rohit Vibhute\\Desktop\\FilesAutoIT\\R69.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(UploadEmissionUnitsPopup));
		UploadEmissionUnitsPopup.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfAllElements(FileUploadSuccessMessageR69));

	}
	
	public void uploadEmissionUnitsFileR70() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(UploadEmissionUnits));
		UploadEmissionUnits.click();
		Thread.sleep(4000);
		try {
			Runtime.getRuntime().exec("C:\\Users\\Rohit Vibhute\\Desktop\\FilesAutoIT\\R70.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(UploadEmissionUnitsPopup));
		UploadEmissionUnitsPopup.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfAllElements(FileUploadSuccessMessageR70));
	}
	
	public void uploadEmissionUnitsFileR71() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(UploadEmissionUnits));
		UploadEmissionUnits.click();
		Thread.sleep(4000);
		try {
			Runtime.getRuntime().exec("C:\\Users\\Rohit Vibhute\\Desktop\\FilesAutoIT\\R71.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(UploadEmissionUnitsPopup));
		UploadEmissionUnitsPopup.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfAllElements(FileUploadSuccessMessageR71));
	}
	
	public void uploadEmissionUnitsFileR72() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(UploadEmissionUnits));
		UploadEmissionUnits.click();
		Thread.sleep(4000);
		try {
			Runtime.getRuntime().exec("C:\\Users\\Rohit Vibhute\\Desktop\\FilesAutoIT\\R72.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(UploadEmissionUnitsPopup));
		UploadEmissionUnitsPopup.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfAllElements(FileUploadSuccessMessageR72));
	}
	
	public void uploadEmissionUnitsFileR76() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(UploadEmissionUnits));
		UploadEmissionUnits.click();
		Thread.sleep(4000);
		try {
			Runtime.getRuntime().exec("C:\\Users\\Rohit Vibhute\\Desktop\\FilesAutoIT\\R76.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(UploadEmissionUnitsPopup));
		UploadEmissionUnitsPopup.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfAllElements(FileUploadSuccessMessageR76));
	}
	
	public void uploadEmissionUnitsFileR73() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(UploadEmissionUnits));
		UploadEmissionUnits.click();
		Thread.sleep(4000);
		try {
			Runtime.getRuntime().exec("C:\\Users\\Rohit Vibhute\\Desktop\\FilesAutoIT\\R73.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(UploadEmissionUnitsPopup));
		UploadEmissionUnitsPopup.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfAllElements(FileUploadSuccessMessageR73));
	}
	
	public void uploadEmissionUnitsFileR74() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(UploadEmissionUnits));
		UploadEmissionUnits.click();
		Thread.sleep(4000);
		try {
			Runtime.getRuntime().exec("C:\\Users\\Rohit Vibhute\\Desktop\\FilesAutoIT\\R74.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(UploadEmissionUnitsPopup));
		UploadEmissionUnitsPopup.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfAllElements(FileUploadSuccessMessageR74));
	}

	public void getCurrentEvent_PE2() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE2);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");

	}

	public void getCurrentEvent_PE3() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE3);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");

	}
	
	public void getCurrentEvent_PE4() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE4);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");

	}

	public void getCurrentEvent_PE5() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE5);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");

	}

	public void getCurrentEvent_PE6() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE6);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");

	}

	public void getCurrentEvent_PE7() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE7);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");

	}

	public void getCurrentEvent_PE8() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE8);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");

	}

	public void getCurrentEvent_PE9() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE9);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");

	}

	public void getCurrentEvent_PE10() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE10);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");
	}
	
	public void getCurrentEvent_PE11() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE11);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");
	}
	
	public void getCurrentEvent_PE12() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtn_PE12);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigated to Particular Event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");
	}

	public void getCurrentEventQC() throws InterruptedException {
		WebElement ref1 = driver.get().findElement(eventDetailsBtnReportQC);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");

	}

	public void getCurrentEventWA() throws InterruptedException {
		WebElement ref1 = driver.get().findElement(eventDetailsBtnWA);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");

	}

	public void getCurrentEventCA() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(eventDetailsBtnCASingleAUction));
		WebElement ref1 = driver.get().findElement(eventDetailsBtnCASingleAUction);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		ObjectRepo.test.log(Status.PASS, "Navigated to particular event ");
		Thread.sleep(20000);

	}

	public void getCurrentEventRSCA() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(eventDetailsBtnCA2));
		WebElement ref1 = driver.get().findElement(eventDetailsBtnCA2);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		ObjectRepo.test.log(Status.PASS, "Navigate to particular event ");

	}

	public void getCurrentEventRSQCR70() throws InterruptedException {

		WebElement ref1 = driver.get().findElement(eventDetailsBtnRSQCR70);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		ObjectRepo.test.log(Status.PASS, "Navigate to particular event ");

	}

	public void getCurrentEventRS_WA() throws InterruptedException {
		WebElement ref1 = driver.get().findElement(eventDetailsBtnRS_WA);
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("arguments[0].scrollIntoView();", ref1);
		action = new Actions(driver.get());
		action.moveToElement(ref1).build().perform();
		action.click(ref1).build().perform();
		System.out.println("Navigate to particular event ");
		ObjectRepo.test.log(Status.PASS, "Navigate to particular event ");

	}

	public void runAlgorithm() throws InterruptedException {

		 Thread.sleep(7000);
		try {
			wait.until(ExpectedConditions.visibilityOf(btnRunAlgorithmWA));
			btnRunAlgorithmWA.click();
			Thread.sleep(10000);
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(btnRunAlgorithmWA2));
			btnRunAlgorithmWA2.click();
			Thread.sleep(10000);
		}
	}

	public void RuntimeSponsorLoginQc() throws InterruptedException {
		try {
			username.sendKeys(prop.getProperty("UserSponsorQc2"));
			ObjectRepo.test.log(Status.PASS, "Sponsor Username Entered  : " + prop.getProperty("UserSponsorQc2"));
			password.sendKeys(prop.getProperty("Password1"));
			ObjectRepo.test.log(Status.PASS, "Sponsor Password Entered  : " + prop.getProperty("Password1"));
			btnLogin.click();
			System.out.println("" + prop.getProperty("UserSponsorQc2") + " Sponsor (Quebec) login successfully");
			ObjectRepo.test.log(Status.PASS,
					"" + prop.getProperty("UserSponsorCa") + " Sponsor (Quebec) login successfully");
		} catch (Exception e) {
			btnLogin.click();
			username.sendKeys(prop.getProperty("UserSponsorQc2"));
			ObjectRepo.test.log(Status.PASS, "Sponsor Username Entered  : " + prop.getProperty("UserSponsorQc2"));
			password.sendKeys(prop.getProperty("Password1"));
			ObjectRepo.test.log(Status.PASS, "Sponsor Password Entered  : " + prop.getProperty("Password1"));
			btnLogin2.click();
			System.out.println("" + prop.getProperty("UserSponsorQc2") + " Sponsor (Quebec) login successfully");
			ObjectRepo.test.log(Status.PASS,
					"" + prop.getProperty("UserSponsorCa") + " Sponsor (Quebec) login successfully");
		}

	}

	public void changeLangauge() throws InterruptedException {
		
		try {
			Thread.sleep(5000);
	        wait.until(ExpectedConditions.visibilityOf(langBtnFrench));
	        wait.until(ExpectedConditions.elementToBeClickable(langBtnFrench));
	        langBtnFrench.click();
	        wait.until(ExpectedConditions.visibilityOf(langBtnEng));
	        langBtnEng.click();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
       System.out.println("Langauge changed successfully from french to english ");
       }

	public void Logout() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btnProfile));
		btnProfile.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnLogout));
		btnLogout.click();

	}

	public void clickbtnAdmin() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Event Monitoring']")));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Monitoring']")));
		}
		btnAdminstration.click();
	}

	public void clickOnnext() {
		try {
			WebElement abc = btnNext;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc).click().build().perform();
			action.click(abc).build().perform();
		} catch (Exception e) {
			WebElement abc = btnNextQC;
			Actions action = new Actions(driver.get());
			action.moveToElement(abc).click().build().perform();
			action.click(abc).build().perform();
		}

	}

	public void handleSecurityQue() {
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
		} else if (str.contains("année?")) {
			securityAnswer.sendKeys("Answer_2");
		} else if (str.contains("crédit?")) {
			securityAnswer.sendKeys("Answer_3");
		} else {
			System.out.println("None of the above security question");
		}
	}

	public void sponsorLoginCa2() throws InterruptedException {
		try {
			wait.until(ExpectedConditions.visibilityOf(btnLogin));
			btnLogin.click();
		} catch (Exception e) {
			Login.click();
		}
		
		username.sendKeys(prop1.getProperty("UserSponsorCa"));
		ObjectRepo.test.log(Status.PASS, "Sponsor Username Entered  : " + prop1.getProperty("UserSponsorCa"));
		password.sendKeys(prop1.getProperty("Password"));
		ObjectRepo.test.log(Status.PASS, "Sponsor Password Entered  : " + prop1.getProperty("Password"));
		btnLogin2.click();
		System.out.println("" + prop1.getProperty("UserSponsorCa") + " Sponsor (California) login successfully");
		ObjectRepo.test.log(Status.PASS,
				"" + prop1.getProperty("UserSponsorCa") + " Sponsor (California) login successfully");
	}
	
	public void sponsorLoginWa() throws InterruptedException {
		try {
			wait.until(ExpectedConditions.visibilityOf(btnLogin));
			btnLogin.click();
		} catch (Exception e) {
			Login.click();
		}
		
		username.sendKeys(prop1.getProperty("UserSponsorWa"));
		ObjectRepo.test.log(Status.PASS, "Sponsor Username Entered  : " + prop1.getProperty("UserSponsorWa"));
		password.sendKeys(prop1.getProperty("SponsorPasswordWa"));
		ObjectRepo.test.log(Status.PASS, "Sponsor Password Entered  : " + prop1.getProperty("SponsorPasswordWa"));
		btnLogin2.click();
		System.out.println("" + prop1.getProperty("UserSponsorWa") + " Sponsor (California) login successfully");
		ObjectRepo.test.log(Status.PASS,
				"" + prop1.getProperty("UserSponsorWa") + " Sponsor (California) login successfully");
	}
	
	public void sponsorLoginCa() throws InterruptedException {
		try {
			wait.until(ExpectedConditions.visibilityOf(btnLogin));
			btnLogin.click();
		} catch (Exception e) {
			Login.click();
		}
		
		username.sendKeys(prop1.getProperty("UserSponsorCa"));
		ObjectRepo.test.log(Status.PASS, "Sponsor Username Entered  : " + prop1.getProperty("UserSponsorCa"));
		password.sendKeys(prop1.getProperty("SponsorPasswordCa"));
		ObjectRepo.test.log(Status.PASS, "Sponsor Password Entered  : " + prop1.getProperty("SponsorPasswordCa"));
		btnLogin2.click();
		System.out.println("" + prop1.getProperty("UserSponsorCa") + " Sponsor (California) login successfully");
		ObjectRepo.test.log(Status.PASS,
				"" + prop1.getProperty("UserSponsorCa") + " Sponsor (California) login successfully");
	}
	
	public void sponsorLoginQc() {
		
		try {
			wait.until(ExpectedConditions.visibilityOf(btnLogin));
			btnLogin.click();
		} catch (Exception e) {
			Login.click();
		}

		username.sendKeys(prop1.getProperty("UserSponsorQc"));
		ObjectRepo.test.log(Status.PASS, "Sponsor Username Entered  : " + prop1.getProperty("UserSponsorQc"));
		password.sendKeys(prop1.getProperty("Password"));
		ObjectRepo.test.log(Status.PASS, "Sponsor Password Entered  : " + prop1.getProperty("Password"));
		btnLogin2.click();
		System.out.println("" + prop1.getProperty("UserSponsorQc") + " Sponsor (Quebec) login successfully");
		ObjectRepo.test.log(Status.PASS,
				"" + prop1.getProperty("UserSponsorQc") + " Sponsor (Quebec) login successfully");
	}
	
	public void sponsorLoginWa2() {
		
		try {
			wait.until(ExpectedConditions.visibilityOf(btnLogin));
			btnLogin.click();
		} catch (Exception e) {
			Login.click();
		}

		username.sendKeys(prop1.getProperty("UserSponsorWa2"));
		ObjectRepo.test.log(Status.PASS, "Sponsor Username Entered  : " + prop1.getProperty("UserSponsorWa2"));
		password.sendKeys(prop1.getProperty("SponsorPasswordWa"));
		ObjectRepo.test.log(Status.PASS, "Sponsor Password Entered  : " + prop1.getProperty("SponsorPasswordWa"));
		btnLogin2.click();
		System.out.println("" + prop1.getProperty("UserSponsorWa2") + " Sponsor (Washington) login successfully");
		ObjectRepo.test.log(Status.PASS,
				"" + prop1.getProperty("UserSponsorWa2") + " Sponsor (Washington) login successfully");
	}
	
public void sponsor2LoginCa() {
		
		try {
			wait.until(ExpectedConditions.visibilityOf(btnLogin));
			btnLogin.click();
		} catch (Exception e) {
			btnLogin.click();
		}

		username.sendKeys(prop1.getProperty("UserSponsorCa2"));
		ObjectRepo.test.log(Status.PASS, "Sponsor Username Entered  : " + prop1.getProperty("UserSponsorCa2"));
		password.sendKeys(prop1.getProperty("SponsorPasswordCa"));
		ObjectRepo.test.log(Status.PASS, "Sponsor Password Entered  : " + prop1.getProperty("SponsorPasswordCa"));
		btnLogin2.click();
		System.out.println("" + prop1.getProperty("UserSponsorCa2") + " Sponsor (California) login successfully");
		ObjectRepo.test.log(Status.PASS,
				"" + prop1.getProperty("UserSponsorCa2") + " Sponsor (California) login successfully");
	}

public void sponsor2LoginQc() {
	
	try {
		wait.until(ExpectedConditions.visibilityOf(btnLogin));
		btnLogin.click();
	} catch (Exception e) {
		Login.click();
	}

	username.sendKeys(prop1.getProperty("UserSponsorQc2"));
	ObjectRepo.test.log(Status.PASS, "Sponsor Username Entered  : " + prop1.getProperty("UserSponsorQc2"));
	password.sendKeys(prop1.getProperty("SponsorPasswordQc"));
	ObjectRepo.test.log(Status.PASS, "Sponsor Password Entered  : " + prop1.getProperty("SponsorPasswordQc"));
	btnLogin2.click();
	System.out.println("" + prop1.getProperty("UserSponsorQc2") + " Sponsor (Quebec) login successfully");
	ObjectRepo.test.log(Status.PASS,
			"" + prop1.getProperty("UserSponsorQc2") + " Sponsor (Quebec) login successfully");
}


	

public void closeBidding() throws InterruptedException {

	driver.get().findElement(By.xpath("//*[text()='Edit Event']")).click();
	wait.until(ExpectedConditions.elementToBeClickable(dateBiddingPeriodClose));
	ZoneId easternTimeZone = ZoneId.of("America/New_York");
	ZonedDateTime zonedDateTime = ZonedDateTime.now(easternTimeZone);
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
	String formattedDate = zonedDateTime.format(myFormatObj);
	System.out.println("Current time: " + formattedDate);
	int num2 = Integer.parseInt(formattedDate.substring(0, 2));
	int num = Integer.parseInt(formattedDate.substring(3, 5));
	LocalTime time = LocalTime.of(num2, num);
	LocalTime biddingEnd = time.plusMinutes(2);
	DateTimeFormatter biddingFormatObj = DateTimeFormatter.ofPattern("HH:mm");
	String biddingEndFormatted = biddingEnd.format(biddingFormatObj);
	System.out.println("Bidding end time: " + biddingEndFormatted);

	
    LocalDate myDateObj2 = zonedDateTime.toLocalDate();
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    String formattedCurrentDate = myDateObj2.format(dateFormatter);
    System.out.println("Current date: " + formattedCurrentDate);

	dateBiddingPeriodClose.click();
	dateBiddingPeriodClose.sendKeys(Keys.CONTROL, "a");
	dateBiddingPeriodClose.sendKeys(Keys.DELETE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(Keys.BACK_SPACE);
	dateBiddingPeriodClose.sendKeys(formattedCurrentDate +" "+ biddingEndFormatted);
	ObjectRepo.test.log(Status.PASS, "Bidding End Time changed to : " + formattedCurrentDate + biddingEndFormatted);
	driver.get().findElement(By.xpath("//*[text()='SAVE']")).click();
	Thread.sleep(20000);
	driver.get().navigate().refresh();
}

}
