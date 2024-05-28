package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider2 {

	public Properties Pro1;

	public ConfigDataProvider2() throws IOException {
		File src = new File(System.getProperty("user.dir") + "/Configuration/Config_Prescribed_Event.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			Pro1 = new Properties();
			Pro1.load(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	public String getBrowser() {
		return Pro1.getProperty("Browser");
	}

	public String getBaseUrl() {
		return Pro1.getProperty("QABaseUrl");
	}

	public String getWATBaseUrl() {
		return Pro1.getProperty("WATBaseUrl");
	}

	public String getProdBaseUrl() {
		return Pro1.getProperty("ProdBaseUrl");
	}

	public String getPassWord() {
		return Pro1.getProperty("Password");
	}

	public String getPassWord2() {
		return Pro1.getProperty("Password2");
	}

	public String getUserSponsorCa() {
		return Pro1.getProperty("UserSponsorCa");

	}

	public String getUserSponsorCa2() {
		return Pro1.getProperty("UserSponsorCa2");

	}

	public String getUserSponsorWs() {
		return Pro1.getProperty("UserSponsorWS");
	}
	public String getUserSponsorWs2() {
		return Pro1.getProperty("UserSponsorWS2");
	}

	public String getUserSponsorNS2() {
		return Pro1.getProperty("UserSponsorNS2");
	}

	public String getUserSponsorQc() {
		return Pro1.getProperty("UserSponsorQc");
	}

	public String getUserSponsorNs() {
		return Pro1.getProperty("UserSponsorNS");
	}

	public String getUserMMCa() {
		return Pro1.getProperty("UnameMMCa");
	}

	public String getUserMMQc() {
		return Pro1.getProperty("UnameMMQc");
	}

	public String getUserMMNs() {
		return Pro1.getProperty("UnameMMNS");
	}

	public String getUserFSACa() {
		return Pro1.getProperty("UnameFSACa");
	}

	public String getUserFSAQc() {
		return Pro1.getProperty("UnameFSAQc");
	}

	public String getUserFSANs() {
		return Pro1.getProperty("UnameFSANS");
	}

	public String getUserEACa() {
		return Pro1.getProperty("UnameEACa");
	}

	public String getUserEAQc() {
		return Pro1.getProperty("UnameEAQc");
	}

	public String getUserEANs() {
		return Pro1.getProperty("UnameEANS");
	}


}
