package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.Reporter;
import static constants.EventNameConstants.*;
import static resources.listeners.prop1;

public class SuiteListener implements ISuiteListener {

	public static Properties prop;
	public static Properties prop1;
	public static Properties prop2;
	static String os;
	public static String url;
	
	String configFilePath  = System.getProperty("user.dir") + "/Configuration/config.properties";
	String configFilePath1 = System.getProperty("user.dir") + "/Configuration/Config_Prescribed_Event.properties";
	String configFilePath2 = System.getProperty("user.dir")+ "/Configuration/Config_Prescribed_ReserveSale_Events.properties";


	@Override
	public void onStart(ISuite suite) {
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
		eventName_PEWa = prop1.getProperty("Event_Name_PEWa");
		eventNameEng = prop.getProperty("Event_Name");
		eventNameFR = prop.getProperty("Event_NameForQC");
		ReserveSaleEventName = prop.getProperty("ReserveSaleEventName");
		ReserveSaleEventNameR70 = prop2.getProperty("Event_Name_RE1");
		eventNameWS = prop.getProperty("eventNameWS");
		eventNameCA = prop.getProperty("eventNameCA");
		eventNameQC = prop.getProperty("eventNameQC");
		ReserveSaleEventName_WA = prop.getProperty("ReserveSaleEventName_WA");
	}

	public static void checkUrl(String url) {
		if (url == null) {
			Reporter.log("Url is empty", true);
			Assert.fail("Url is empty");
		}
	}
}
