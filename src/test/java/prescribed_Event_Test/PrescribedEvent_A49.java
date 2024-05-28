package prescribed_Event_Test;
import java.sql.SQLException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import dbConnection.DataBAseQueriesMethod;
import pageObjects.com_pomClassForJointAuctionTieBreaker;
import resources.ObjectRepo;

import static constants.ThreadConstants.driver;
import static constants.ThreadConstants.testCaseId;
@Listeners({ resources.listeners.class, resources.SuiteListener.class })
public class PrescribedEvent_A49  {
	
//	@Test
//	public void Reset_Citss_EventID_A49()
//			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
//		DataBAseQueriesMethod.setConnection();
//		DataBAseQueriesMethod ref = new DataBAseQueriesMethod();
//		ref.updateCittsEventID_PE6();
//	}

	@Test(priority = 1, retryAnalyzer = analyzer.RetryAnalyzer.class)//, dependsOnMethods = "Reset_Citss_EventID_A49")
	public void CreateNewEvent_A49() throws Exception {
		testCaseId.set("42141");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
		ref.sponsorLoginCa2();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ObjectRepo.test.log(Status.PASS, "Security Answer sent Successfully");
		ref.createEventForJointAuction_PE6();
		ObjectRepo.test.log(Status.PASS, "Event Created Successfully");
		ref.CaliforniaJuridictionApprovalForEventCreation_PE6();
		System.out.println("******************************************************************");
	}

	@Test(priority = 2, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Approval_By_QuebecSponsor_A49() throws InterruptedException {
		testCaseId.set("42142");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
		ref.sponsorLoginQc();
		System.out.println("Step4: Quebec Sponsor Login successfully ");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Step5: Security question handled successfully ");
		ref.SecondApproval_PE6();
		System.out.println("Step6: Second approval given successfully");
		
	}
	
	@Test(priority = 3, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void SET_FXRATE_QC_A49() throws InterruptedException {
		testCaseId.set("42360");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
		ref.sponsorLoginQc();
		System.out.println("Step4: Quebec Sponsor Login successfully ");
		ref.handleSecurityQue();
		ref.clickOnnext();
	    ref.setFXrateQC_PE6();
	    System.out.println("Step7: FX rate set with quebec approval");
	    ref.Logout();
	
	}
	
	@Test(priority = 4, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void SET_FXRATE_CA_A49() throws InterruptedException {
		testCaseId.set("42360");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
	
	ref.sponsorLoginCa2();
	ref.handleSecurityQue();
	ref.clickOnnext();
	ref.setFXrateCal_PE6();
	System.out.println("Step8: FX rate set with california approval");
	System.out.println("******************************************************************");
	}
	
	@Test(priority = 5, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Execute_API() throws InterruptedException, SQLException {
		testCaseId.set("42143");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
		ref.sponsorLoginCa2();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.executeAPIGetQualifiedBidder();
		driver.get().navigate().refresh();
		ref.executeAPIGetBidLimitations();
		//ref.Logout();

	}
	
	@Test(priority = 6, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_FirstEntity_A49() throws Exception {
		testCaseId.set("42144");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
		ref.ARLoginCA_PE1();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity1_PE6();
		ref.selectEventForBidding_PE6();
		ref.BiddingByARforTestData1_PE6();
		System.out.println("First bid placed ");
		 ObjectRepo.test.log(Status.PASS, "First bid placed ");
		ref.BiddingByARforTestData2_PE6();
		System.out.println("Second bid placed ");
		 ObjectRepo.test.log(Status.PASS, "Second bid placed ");
		ref.BiddingByARforTestData3_PE6();
		System.out.println("Third bid placed ");
		 ObjectRepo.test.log(Status.PASS, "Third bid placed");
		 ref.BiddingByARforTestData4_PE6();
		System.out.println("Fourth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Fourth bid placed");
	}

	@Test(priority = 7, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_SecondEntity_A49() throws Exception {
		testCaseId.set("42145");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
		ref.ARLoginCA_PE1();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity2_PE6();
		ref.selectEventForBidding_PE6();
		ref.BiddingByARforTestData5_PE6();
		System.out.println("5th bid placed ");
		 ObjectRepo.test.log(Status.PASS, "5th bid placed ");
		ref.BiddingByARforTestData6_PE6();
		System.out.println("6th bid placed ");
		 ObjectRepo.test.log(Status.PASS, "6th bid placed ");
		ref.BiddingByARforTestData7_PE6();
		System.out.println("7th bid placed ");
		 ObjectRepo.test.log(Status.PASS, "7th bid placed ");
		 ref.BiddingByARforTestData8_PE6();
			System.out.println("8th bid placed ");
			 ObjectRepo.test.log(Status.PASS, "8th bid placed ");
		
	}

	@Test(priority = 8, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_ThirdEntity_A49() throws Exception {
		testCaseId.set("42146");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
		ref.ARLoginCA_PE1();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity3_PE6();
		ref.selectEventForBidding_PE6();
		ref.BiddingByARforTestData9_PE6();
		System.out.println("9th bid placed ");
		 ObjectRepo.test.log(Status.PASS, "9th bid placed ");
		ref.BiddingByARforTestData10_PE6();
		System.out.println("10th bid placed ");
		 ObjectRepo.test.log(Status.PASS, "10th bid placed ");
		ref.BiddingByARforTestData11_PE6();
		System.out.println("11th bid placed ");
		 ObjectRepo.test.log(Status.PASS, "11th bid placed ");
		ref.BiddingByARforTestData12_PE6();
		System.out.println("12th bid placed ");
		 ObjectRepo.test.log(Status.PASS, "12th bid placed ");
		
	}
	@Test(priority = 9, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_FourthEntity_A49() throws Exception {
		testCaseId.set("42147");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
		ref.ARLoginCA_PE1();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity4_PE6();
		ref.selectEventForBidding_PE6();
		ref.BiddingByARforTestData13_PE6();
		System.out.println("13th bid placed ");
		 ObjectRepo.test.log(Status.PASS, "13th bid placed ");
		ref.BiddingByARforTestData14_PE6();
		System.out.println("14th bid placed ");
		 ObjectRepo.test.log(Status.PASS, "14th bid placed ");
		ref.BiddingByARforTestData15_PE6();
		System.out.println("15th bid placed ");
		 ObjectRepo.test.log(Status.PASS, "15th bid placed ");
		 ref.BiddingByARforTestData16_PE6();
			System.out.println("16th bid placed ");
			 ObjectRepo.test.log(Status.PASS, "16th bid placed ");
	}
	@Test(priority = 10, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_FifthEntity_A49() throws Exception {
		testCaseId.set("42148");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
		ref.ARLoginQC_PE1();
		ref.handleSecurityQue();
		ref.clickOnnextQC();
		ref.SelectEntity5_PE6();
		ref.changeLangauge();
		ref.selectEventForBidding_PE6();
		ref.BiddingByARforTestData17_PE6();
		System.out.println("17th bid placed ");
		 ObjectRepo.test.log(Status.PASS, "17th bid placed ");
		ref.BiddingByARforTestData18_PE6();
		System.out.println("18th bid placed ");
		 ObjectRepo.test.log(Status.PASS, "18th bid placed ");
		ref.BiddingByARforTestData19_PE6();
		System.out.println("19th bid placed ");
		 ObjectRepo.test.log(Status.PASS, "19th bid placed ");
		 ref.BiddingByARforTestData20_PE6();
			System.out.println("20th bid placed ");
			 ObjectRepo.test.log(Status.PASS, "20th bid placed ");
	}
	@Test(priority = 11, retryAnalyzer = analyzer.RetryAnalyzer.class, enabled = true)
	public void Closing_Bidding_Window() throws InterruptedException {
		testCaseId.set("42151");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
		ref.sponsorLoginCa2();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PE6();
		ref.closeBidding();
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.CaliforniaJuridictionApprovalForEventCreation_PE6();
		System.out.println("******************************************************************");
		
	}
	@Test(priority = 12, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Approval_By_QuebecSponsor_For_Edit_BiddingWindow_CloseTime() throws InterruptedException {
		testCaseId.set("42152");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
		ref.sponsorLoginQc();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SecondApproval_PE6();
	}
	
	@Test(priority = 13, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Run_Algorithm_California() throws InterruptedException {
		testCaseId.set("42154");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
		ref.sponsorLoginCa2();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PE6();
		ref.runAlgorithm();
		
	}
	
	@Test(priority = 14, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Run_Algorithm_Quebec() throws InterruptedException {
		testCaseId.set("42155");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
		ref.sponsorLoginQc();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PE6();
		ref.runAlgorithm2();
	}

	@Test(priority = 15, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void EventCertification_California() throws InterruptedException {
		testCaseId.set("42164");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
		ref.sponsorLoginCa2();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.AuctionCertificationButtonca();
	}
	@Test(priority = 16, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void EventCertification_DualApproval_Quebec() throws InterruptedException {
		testCaseId.set("42165");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker( );
		ref.sponsorLoginQc();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.AuctionCertificationButtonqc();
	}
	
	
}
