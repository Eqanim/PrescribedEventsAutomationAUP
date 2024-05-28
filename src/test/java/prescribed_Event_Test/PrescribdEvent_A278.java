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
public class PrescribdEvent_A278 {

//	@Test
//	public void Reset_Citss_EventID_A42()
//			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
//		DataBAseQueriesMethod.setConnection();
//		DataBAseQueriesMethod ref = new DataBAseQueriesMethod();
//		ref.updateCittsEventID_PE1();
//	}

	@Test(priority = 1, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void CreateNewEvent_A278() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginWa();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ObjectRepo.test.log(Status.PASS, "Security Answer sent Successfully");
		ref.createEventForWashingtonAuctionEventA278();
		ObjectRepo.test.log(Status.PASS, "Event Created Successfully");
		ref.WashingtonFirstSponsorApprovalForEventCreation_PEWa2();
		System.out.println("******************************************************************");
	}

	@Test(priority = 2, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Approval_By_WashingtonSecondSponsorA278() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginWa2();
		System.out.println("Step4: Washington Sponsor Login successfully ");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Step5: Security question handled successfully ");
		ref.secondApproval_PEWa2();
		System.out.println("Step6: Second approval given successfully");

	}

	@Test(priority = 3, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Execute_API() throws InterruptedException, SQLException {
		testCaseId.set("41375");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginWa2();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.executeAPIGetQualifiedBidder();		 
		driver.get().navigate().refresh();		 
		ref.executeAPIGetBidLimitations();
		//ref.Logout();
	}

	@Test(priority = 4, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_FirstEntity_A278() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginPEWa2();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity1_PEwa2();
		ref.selectEventForBidding_PEWa2();
		ref.BiddingByARforTestData1_PEWa2();
		System.out.println("First bid placed ");
		ObjectRepo.test.log(Status.PASS, "First bid placed ");
		ref.BiddingByARforTestData2_PEWa2();
		System.out.println("Second bid placed ");
		ObjectRepo.test.log(Status.PASS, "Second bid placed ");
		ref.BiddingByARforTestData3_PEWa2();
		System.out.println("Third bid placed ");
		ObjectRepo.test.log(Status.PASS, "Third bid placed ");
	}

	@Test(priority = 5, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_SecondEntity_A278() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginPEWa2();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity2_PEWa2();
		ref.selectEventForBidding_PEWa2();
		ref.BiddingByARforTestData4_PEWa2();
		System.out.println("Fourth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Fourth bid placed");
		ref.BiddingByARforTestData5_PEWa2();
		System.out.println("Fifth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Fifth bid placed ");
		ref.BiddingByARforTestData6_PEWa2();
		System.out.println("Sixth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Sixth bid placed ");
	}

	@Test(priority = 6, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_ThirdEntity_A278() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginPEWa2();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity3_PEWa2();
		ref.selectEventForBidding_PEWa2();
		ref.BiddingByARforTestData7_PEWa2();
		System.out.println("Seventh bid placed ");
		ObjectRepo.test.log(Status.PASS, "Seventh bid placed ");
		ref.BiddingByARforTestData8_PEWa2();
		System.out.println("Eighth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Eighth bid placed ");
		ref.BiddingByARforTestData9_PEWa2();
		System.out.println("Ninth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Ninth bid placed ");
		ref.BiddingByARforTestData10_PEWa2();
		System.out.println("Tenth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Tenth bid placed ");
		ref.BiddingByARforTestData11_PEWa2();
		System.out.println("Eleventh bid placed ");
		ObjectRepo.test.log(Status.PASS, "Eleventh bid placed ");
		ref.BiddingByARforTestData12_PEWa2();
		System.out.println("Twelveth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Twelveth bid placed ");
		ref.BiddingByARforTestData13_PEWa2();
		System.out.println("Thiteenth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Thiteenth bid placed ");
	}
	
	@Test(priority = 7, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_FourthEntity_A278() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginPEWa2();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity4_PEWa2();
		ref.selectEventForBidding_PEWa2();
		ref.BiddingByARforTestData14_PEWa2();
		System.out.println("Fourteenth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Fourteenth bid placed");
		ref.BiddingByARforTestData15_PEWa2();
		System.out.println("Fifteenth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Fifteenth bid placed ");
		ref.BiddingByARforTestData16_PEWa2();
		System.out.println("Sixteenth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Sixteenth bid placed ");
	}
	
	@Test(priority = 8, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_FifthEntity_A278() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginPEWa2();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity5_PEWa2();
		ref.selectEventForBidding_PEWa2();
		ref.BiddingByARforTestData17_PEWa2();
		System.out.println("Seventeenth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Seventeenth bid placed");
		ref.BiddingByARforTestData18_PEWa2();
		System.out.println("Eighteenth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Eighteenth bid placed ");
		ref.BiddingByARforTestData19_PEWa2();
		System.out.println("Ninteenth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Ninteenth bid placed ");
		ref.BiddingByARforTestData20_PEWa2();
		System.out.println("Twentieth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Twentieth bid placed ");
	}
	
	@Test(priority = 9, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_SixthEntity_A278() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginPEWa2();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity6_PEWa2();
		ref.selectEventForBidding_PEWa2();
		ref.BiddingByARforTestData21_PEWa2();
		System.out.println("TwentyFirst bid placed ");
		ObjectRepo.test.log(Status.PASS, "TwentyFirst bid placed");
		ref.BiddingByARforTestData22_PEWa2();
		System.out.println("TwentySecond bid placed ");
		ObjectRepo.test.log(Status.PASS, "TwentySecond bid placed ");
		ref.BiddingByARforTestData23_PEWa2();
		System.out.println("TwentyThird bid placed ");
		ObjectRepo.test.log(Status.PASS, "TwentyThird bid placed ");
	}
	
	@Test(priority = 10, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_SeventhEntity_A278() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginPEWa2();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity7_PEWa2();
		ref.selectEventForBidding_PEWa2();
		ref.BiddingByARforTestData24_PEWa2();
		System.out.println("TwentyFourth bid placed ");
		ObjectRepo.test.log(Status.PASS, "TwentyFourth bid placed");
		ref.BiddingByARforTestData25_PEWa2();
		System.out.println("TwentyFifth bid placed ");
		ObjectRepo.test.log(Status.PASS, "TwentyFifth bid placed ");
		ref.BiddingByARforTestData26_PEWa2();
		System.out.println("TwentySixth bid placed ");
		ObjectRepo.test.log(Status.PASS, "TwentySixth bid placed ");
		ref.BiddingByARforTestData27_PEWa2();
		System.out.println("TwentySeventh bid placed ");
		ObjectRepo.test.log(Status.PASS, "TwentySeventh bid placed ");
		ref.BiddingByARforTestData28_PEWa2();
		System.out.println("TwentyEighth bid placed ");
		ObjectRepo.test.log(Status.PASS, "TwentyEighth bid placed ");
	}

	@Test(priority = 11, retryAnalyzer = analyzer.RetryAnalyzer.class, enabled = true)
	public void Closing_Bidding_Window() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginWa();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PEWa2();
		ref.closeBidding();
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.WashingtonFirstSponsorApprovalForEventCreation_PEWa2();
		System.out.println("******************************************************************");
	}

	@Test(priority = 12, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Approval_By_WashingtonSponsor2_For_Edit_BiddingWindow_CloseTime() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginWa2();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.secondApproval_PEWa2();
	}

	@Test(priority = 13, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Run_Algorithm_WashingtonFirstSponsor() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginWa();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PEWa2();
		ref.runAlgorithm();

	}

	@Test(priority = 14, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Run_Algorithm_WashingtonSecondSponsor() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginWa2();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PEWa2(); 
		ref.runAlgorithm2();
	}

	@Test(priority = 15, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void EventCertification_WashingtonFirstSponsor() throws InterruptedException {
		
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginWa();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.AuctionCertificationButtonWa1();
	}

	@Test(priority = 16, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void EventCertification_WashingtonSecondSponsor() throws InterruptedException {
		
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginWa2();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.AuctionCertificationButtonWa2();
		 
	}

}
