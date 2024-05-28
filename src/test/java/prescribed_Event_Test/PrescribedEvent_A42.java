package prescribed_Event_Test;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

import dbConnection.DataBAseQueriesMethod;
import pageObjects.com_pomClassForJointAuctionTieBreaker;
import resources.ObjectRepo;
import static constants.ThreadConstants.testCaseId;
import static resources.listeners.wait;
import static constants.ThreadConstants.driver;

@Listeners({ resources.listeners.class, resources.SuiteListener.class })
public class PrescribedEvent_A42 {

//	@Test
//	public void Reset_Citss_EventID_A42()
//			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
//		DataBAseQueriesMethod.setConnection();
//		DataBAseQueriesMethod ref = new DataBAseQueriesMethod();
//		ref.updateCittsEventID_PE1();
//	}

	@Test(priority = 1, retryAnalyzer = analyzer.RetryAnalyzer.class)//, dependsOnMethods = "Reset_Citss_EventID_A42")
	public void CreateNewEvent_A42() throws Exception {
		testCaseId.set("41373");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginCa2();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ObjectRepo.test.log(Status.PASS, "Security Answer sent Successfully");
		ref.createEventForJointAuction_PE1();
		ObjectRepo.test.log(Status.PASS, "Event Created Successfully");
		ref.CaliforniaJuridictionApprovalForEventCreation_PE1();
		System.out.println("******************************************************************");
	}

	@Test(priority = 2, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Approval_By_QuebecSponsor_A42() throws InterruptedException {
		testCaseId.set("41374");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginQc();
		System.out.println("Step4: Quebec Sponsor Login successfully ");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Step5: Security question handled successfully ");
		ref.secondApproval_PE1();
		System.out.println("Step6: Second approval given successfully");

	}

	@Test(priority = 3, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void SET_FXRATE_QC_A42() throws InterruptedException {
		testCaseId.set("42355");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginQc();
		System.out.println("Step4: Quebec Sponsor Login successfully ");
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.setFXrateQC_PE1();
		 
		System.out.println("Step7: FX rate set with quebec approval");
		ref.Logout();

	}

	@Test(priority = 4, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void SET_FXRATE_CA_A42() throws InterruptedException {
		testCaseId.set("42355");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginCa2();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.setFXrateCal_PE1();
		 
		System.out.println("Step8: FX rate set with california approval");
		System.out.println("******************************************************************");
	}

	@Test(priority = 5, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Execute_API() throws InterruptedException, SQLException {
		testCaseId.set("41375");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginCa2();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.executeAPIGetQualifiedBidder();
		 
		driver.get().navigate().refresh();
		 
		ref.executeAPIGetBidLimitations();
		//ref.Logout();
	}

	@Test(priority = 6, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_FirstEntity_A42() throws Exception {
		testCaseId.set("41376");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginCA_PE1();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity1_PE1();
		ref.selectEventForBidding_PE1();
		ref.BiddingByARforTestData1_PE1();
		System.out.println("First bid placed ");
		ObjectRepo.test.log(Status.PASS, "First bid placed ");
		ref.BiddingByARforTestData2_PE1();
		System.out.println("Second bid placed ");
		ObjectRepo.test.log(Status.PASS, "Second bid placed ");
		ref.BiddingByARforTestData3_PE1();
		System.out.println("Third bid placed ");
		ObjectRepo.test.log(Status.PASS, "Third bid placed");
	}

	@Test(priority = 7, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_SecondEntity_A42() throws Exception {
		testCaseId.set("41377");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginCA_PE1();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity2_PE1();
		ref.selectEventForBidding_PE1();
		ref.BiddingByARforTestData4_PE1();
		System.out.println("Fourth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Fourth bid placed");
		ref.BiddingByARforTestData5_PE1();
		System.out.println("Fifth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Fifth bid placed ");
		ref.BiddingByARforTestData6_PE1();
		System.out.println("Sixth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Sixth bid placed ");
	}

	@Test(priority = 8, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_ThirdEntity_A42() throws Exception {
		testCaseId.set("41378");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginCA_PE1();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity3_PE1();
		ref.selectEventForBidding_PE1();
		ref.BiddingByARforTestData7_PE1();
		System.out.println("Seventh bid placed ");
		ObjectRepo.test.log(Status.PASS, "Seventh bid placed ");
		ref.BiddingByARforTestData8_PE1();
		System.out.println("Eighth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Eighth bid placed ");
		ref.BiddingByARforTestData9_PE1();
		System.out.println("9th bid placed ");
		ObjectRepo.test.log(Status.PASS, "9th bid placed ");
		ref.BiddingByARforTestData10_PE1();
		System.out.println("10th bid placed ");
		ObjectRepo.test.log(Status.PASS, "10th bid placed ");
		ref.BiddingByARforTestData11_PE1();
		System.out.println("11th  bid placed ");
		ObjectRepo.test.log(Status.PASS, "11th bid placed ");
	}

	@Test(priority = 9, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_FourthEntity_A42() throws Exception {
		testCaseId.set("41379");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginQC_PE1();
		ref.handleSecurityQue();
		ref.clickOnnextQC();
		ref.SelectEntity4_PE1();
		ref.changeLangauge();
		ref.selectEventForBidding_PE1();
		ref.BiddingByARforTestData12_PE1();
		System.out.println("12th bid placed ");
		ObjectRepo.test.log(Status.PASS, "12th bid placed ");
		ref.BiddingByARforTestData13_PE1();
		System.out.println("13th bid placed ");
		ObjectRepo.test.log(Status.PASS, "13th bid placed ");
		ref.BiddingByARforTestData14_PE1();
		System.out.println("14th bid placed ");
		ObjectRepo.test.log(Status.PASS, "14th bid placed ");
	}

	@Test(priority = 10, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_FifthEntity_A42() throws Exception {
		testCaseId.set("41380");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginQC_PE1();
		ref.handleSecurityQue();
		ref.clickOnnextQC();
		ref.SelectEntity5_PE1();
		ref.changeLangauge();
		ref.selectEventForBidding_PE1();
		ref.BiddingByARforTestData15_PE1();
		System.out.println("15th bid placed ");
		ObjectRepo.test.log(Status.PASS, "15th bid placed ");
		ref.BiddingByARforTestData16_PE1();
		System.out.println("16th bid placed ");
		ObjectRepo.test.log(Status.PASS, "16th bid placed ");
		ref.BiddingByARforTestData17_PE1();
		System.out.println("17th bid placed ");
		ObjectRepo.test.log(Status.PASS, "17th bid placed ");
		ref.BiddingByARforTestData18_PE1();
		System.out.println("18th bid placed ");
		ObjectRepo.test.log(Status.PASS, "18th bid placed ");
		ref.BiddingByARforTestData19_PE1();
		System.out.println("19th bid placed ");
		ObjectRepo.test.log(Status.PASS, "19th bid placed ");
		ref.BiddingByARforTestData20_PE1();
		System.out.println("20th bid placed ");
		ObjectRepo.test.log(Status.PASS, "20th bid placed ");
		ref.BiddingByARforTestData21_PE1();
		System.out.println("21st bid placed ");
		ObjectRepo.test.log(Status.PASS, "21st bid placed ");
	}

	@Test(priority = 11, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_SixthEntity_A42() throws Exception {
		testCaseId.set("41381");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginQC_PE1();
		ref.handleSecurityQue();
		ref.clickOnnextQC();
		ref.SelectEntity6_PE1();
		ref.changeLangauge();
		ref.selectEventForBidding_PE1();
		ref.BiddingByARforTestData22_PE1();
		System.out.println("22nd bid placed ");
		ObjectRepo.test.log(Status.PASS, "22nd bid placed ");
		ref.BiddingByARforTestData23_PE1();
		System.out.println("23rd bid placed ");
		ObjectRepo.test.log(Status.PASS, "23rd bid placed ");
		ref.BiddingByARforTestData24_PE1();
		System.out.println("24th bid placed ");
		ObjectRepo.test.log(Status.PASS, "24th bid placed ");
	}

	@Test(priority = 12, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_SeventhEntity_A42() throws Exception {
		testCaseId.set("41382");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginQC_PE1();
		ref.handleSecurityQue();
		ref.clickOnnextQC();
		ref.SelectEntity7_PE1();
		ref.changeLangauge();
		ref.selectEventForBidding_PE1();
		ref.BiddingByARforTestData25_PE1();
		System.out.println("25th bid placed ");
		ObjectRepo.test.log(Status.PASS, "25th bid placed ");
		ref.BiddingByARforTestData26_PE1();
		System.out.println("26th bid placed ");
		ObjectRepo.test.log(Status.PASS, "26th bid placed ");
		ref.BiddingByARforTestData27_PE1();
		System.out.println("27th bid placed ");
		ObjectRepo.test.log(Status.PASS, "27th bid placed ");
		ref.BiddingByARforTestData28_PE1();
		System.out.println("28th bid placed ");
		ObjectRepo.test.log(Status.PASS, "28th bid placed ");
	}

	@Test(priority = 13, retryAnalyzer = analyzer.RetryAnalyzer.class, enabled = true)
	public void Closing_Bidding_Window() throws InterruptedException {
		testCaseId.set("41383");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginCa2();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PE1();
		ref.closeBidding();
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.CaliforniaJuridictionApprovalForEventCreation_PE1();
		System.out.println("******************************************************************");
	}

	@Test(priority = 14, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Approval_By_QuebecSponsor_For_Edit_BiddingWindow_CloseTime() throws InterruptedException {
		testCaseId.set("41384");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginQc();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SecondApproval_PE1();
	}

	@Test(priority = 15, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Run_Algorithm_California() throws InterruptedException {
		testCaseId.set("41385");
		 
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginCa2();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PE1();
		ref.runAlgorithm();

	}

	@Test(priority = 16, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Run_Algorithm_Quebec() throws InterruptedException {
		testCaseId.set("41386");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginQc();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PE1();
		 
		ref.runAlgorithm2();
	}	

	@Test(priority = 17, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void EventCertification_California() throws InterruptedException {
		testCaseId.set("41394");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginCa2();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.AuctionCertificationButtonca();
	}

	@Test(priority = 18, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void EventCertification_DualApproval_Quebec() throws InterruptedException {
		testCaseId.set("41395");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginQc();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.AuctionCertificationButtonqc();
		 
	}

}
