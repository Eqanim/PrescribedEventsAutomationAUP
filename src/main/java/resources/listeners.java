package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Level;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import static constants.EventNameConstants.ReserveSaleEventName;
import static constants.EventNameConstants.ReserveSaleEventNameR70;
import static constants.EventNameConstants.ReserveSaleEventName_WA;
import static constants.EventNameConstants.eventNameCA;
import static constants.EventNameConstants.eventNameEng;
import static constants.EventNameConstants.eventNameFR;
import static constants.EventNameConstants.eventNameQC;
import static constants.EventNameConstants.eventNameWS;
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

public class listeners implements ITestListener {
	ExtentReports extent = ExtentReporterNG.getReportObject();
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	public static String folderPath;
	File parentDirectory;
	String browserName = "Chrome";

	public static Properties prop;
	public static Properties prop1;
	public static Properties prop2;
	static String os;
	public static String url;
	public static WebDriverWait wait;

	String configFilePath = System.getProperty("user.dir") + "/Configuration/config.properties";
	String configFilePath1 = System.getProperty("user.dir") + "/Configuration/Config_Prescribed_Event.properties";
	String configFilePath2 = System.getProperty("user.dir")
			+ "/Configuration/Config_Prescribed_ReserveSale_Events.properties";

	public void onExecutionStart() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(configFilePath);
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			prop1 = new Properties();
			FileInputStream ip = new FileInputStream(configFilePath1);
			prop1.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			prop2 = new Properties();
			FileInputStream ip = new FileInputStream(configFilePath2);
			prop2.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		readProperties();
	}

	public void readProperties() {
		url = prop.getProperty("QABaseUrl");
		System.out.println("url : " + url);
		eventName_PE1 = prop1.getProperty("Event_Name_PE1");
		eventName_PE2 = prop1.getProperty("Event_Name_PE2");
		eventName_PE3 = prop1.getProperty("Event_Name_PE3");
		eventName_PE4 = prop1.getProperty("Event_Name_PE4");
		eventName_PE5 = prop1.getProperty("Event_Name_PE5");
		eventName_PE6 = prop1.getProperty("Event_Name_PE6");
		eventName_PE7 = prop1.getProperty("Event_Name_PE7");
		eventName_PE8 = prop1.getProperty("Event_Name_PE8");
		eventName_PE9 = prop1.getProperty("Event_Name_PE9");
		eventName_PE10 = prop1.getProperty("Event_Name_PE10");
		eventName_PE11 = prop1.getProperty("Event_Name_PE11");
		eventName_PE12 = prop1.getProperty("Event_Name_PE12");
		eventName_PEWa = prop1.getProperty("Event_Name_PEWa");
		eventName_PEWa2 = prop1.getProperty("Event_Name_PEWa2");
		eventName_REWA1 = prop1.getProperty("Event_Name_REWA1");
		eventName_REWA2 = prop1.getProperty("Event_Name_REWA2");
		eventName_PECa = prop1.getProperty("Event_Name_RE1Ca");
		eventName_PEQc = prop1.getProperty("Event_Name_SBMA1");
		eventName_PEQc1 = prop1.getProperty("Event_Name_SBMA2");
		eventName_PEQc2 = prop1.getProperty("Event_Name_SBMA3");
		eventName_PEQc3 = prop1.getProperty("Event_Name_SBMA4");
		eventName_PEQc4 = prop1.getProperty("Event_Name_SBMA5");
		eventName_PEQc5 = prop1.getProperty("Event_Name_SBMA6");
		eventName_PEQc6 = prop1.getProperty("Event_Name_SBMA7");
		eventNameEng = prop.getProperty("Event_Name");
		eventNameFR = prop.getProperty("Event_NameForQC");
		ReserveSaleEventName = prop.getProperty("ReserveSaleEventName");
		ReserveSaleEventNameR70 = prop2.getProperty("Event_Name_RE1");
		eventNameWS = prop.getProperty("eventNameWS");
		eventNameCA = prop.getProperty("eventNameCA");
		eventNameQC = prop.getProperty("eventNameQC");
		ReserveSaleEventName_WA = prop.getProperty("ReserveSaleEventName_WA");
	}

	public void onTestStart(ITestResult result) {
		onExecutionStart();
		System.out.println(browserName);
		if (browserName.equals("Chrome")) {
			initializeWebDriver();
		}
		initializeExtentTest(result);
	}

	private void initializeFolder() {
		String parentDirectoryPath = System.getProperty("user.dir") + File.separator + "directory";
		System.out.println(parentDirectoryPath);
		parentDirectory = new File(parentDirectoryPath);
		if (!parentDirectory.exists()) {
			System.out.println("Parent directory does not exist.");
		} else {
			String newFolderName = UUID.randomUUID().toString();
			File folder = new File(parentDirectory, newFolderName);
			if (folder.mkdir()) {
				System.out.println("New folder created successfully as: " + folder);
				folderPath = folder.getAbsolutePath();
			} else {
				System.out.println("Failed to create new folder.");
			}
		}
	}

	private void initializeWebDriver() {
		initializeFolder(); // Ensure folder is created before initializing WebDriver
		Reporter.log("Chrome launched", true);
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", folderPath); // Set the download directory here
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver.set(new ChromeDriver(options));
		LoggingPreferences logPrefs = new LoggingPreferences();
		logPrefs.enable(LogType.BROWSER, Level.ALL);
		driver.get().manage().logs().get(LogType.BROWSER).getAll();
		driver.get().get(url);
		driver.get().manage().window().maximize();
	    driver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver.get(), Duration.ofSeconds(30));
//		getAllLinks();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		waitUntilPageLoaded(js);
		Reporter.log("Navigated to BaseUrl: " + url, true);
		List<LogEntry> logs = driver.get().manage().logs().get(LogType.BROWSER).getAll();
		boolean jsRunning = logs.stream().anyMatch(logEntry -> logEntry.getMessage().contains("JavaScript"));
		if (jsRunning) {
			System.out.println("JavaScript is running on the page.");
		} else {
			System.out.println("No JavaScript detected on the page.");
		}
	}

	private void initializeExtentTest(ITestResult result) {
		ObjectRepo.test = extent
				.createTest(result.getTestClass().getName() + "==" + result.getMethod().getMethodName());
		extentTest.set(ObjectRepo.test);
	}

	public void onTestSuccess(ITestResult result) {
		extentTest.get().log(Status.PASS, "Test Passed");
		extentTest.get().addScreenCaptureFromBase64String(getScreen(), "ScreenShot Pass");
		String testMethodName = result.getMethod().getMethodName();
		System.out.println(testMethodName + "  Test Passed");
		ObjectRepo.test.log(Status.INFO, "ClassName : " + result.getTestClass().getName() + "==" + "MethodName : "
				+ result.getMethod().getMethodName());
		System.out.println("ClassName : " + result.getTestClass().getName() + "==" + "MethodName : "
				+ result.getMethod().getMethodName());
//        TestRailManager.addResultsForTestCase(testCaseId.get(), TestRailManager.TEST_CASE_PASS_STATUS,
//                ", testcase passed through script" + "  Method Name :  " + result.getName() + "  is passed");
		deleteFolder();
		driver.get().quit();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.get().log(Status.SKIP, "Test Skipped");
		driver.get().quit();
	}

	public void getAllLinks() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("a")));
		int totalLinks = elements.size();
		for (int i = 0; i < totalLinks - 1; i++) {
			String linkPresent = elements.get(i).getText();
			System.out.println(linkPresent);
		}
	}
	
	public static void waitUntilPageLoaded(JavascriptExecutor js) {
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
        boolean pageLoaded = false;
        int attempts = 0;
        while (!pageLoaded && attempts < 10) {
            try {
                pageLoaded = (Boolean) js.executeScript("return document.readyState").equals("complete");
                Thread.sleep(1000); // Wait for 1 second before checking again
                attempts++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

	public String getScreen() {
		return ((TakesScreenshot) driver.get()).getScreenshotAs(OutputType.BASE64);
	}

	public void onTestFailure(ITestResult result) {
		extentTest.get().fail(result.getThrowable());
		String testMethodName = result.getMethod().getMethodName();
		try {
			System.out.println(testMethodName + "  Test Failed");
		} catch (Exception e) {
			System.out.println(testMethodName + "  Test Failed");
		}
		try {
			extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName),
					result.getMethod().getMethodName());
		} catch (Exception e) {
			e.printStackTrace();
		}
//		TestRailManager.addResultsForTestCase(testCaseId.get(), TestRailManager.TEST_CASE_FAIL_STATUS,
//				", testcase failed through script" + "   Method Name :  " + result.getName() + "is Failed");
		deleteFolder();
		driver.get().quit();

	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}

	protected static boolean deleteFolder(File folder) {
		if (!folder.exists()) {
			return true;
		}

		File[] contents = folder.listFiles();
		if (contents != null) {
			for (File file : contents) {
				if (file.isDirectory()) {
					deleteFolder(file);
				} else {
					file.delete();
				}
			}
		}
		return folder.delete();
	}

	public void deleteFolder() {
		if (!parentDirectory.exists()) {
			System.out.println("Parent directory does not exist.");
			return;
		}

		File[] folders = parentDirectory.listFiles(File::isDirectory);

		if (folders != null) {
			for (File folder : folders) {
				if (deleteFolder(folder)) {
					System.out.println("Folder deleted successfully: " + folder.getName());
				} else {
					System.out.println("Failed to delete folder: " + folder.getName());
				}
			}
		} else {
			System.out.println("No folders found in the directory.");
		}
	}

	public String getScreenShotPath(String testCaseName) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver.get();
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\Screenshots\\" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;

	}
}
