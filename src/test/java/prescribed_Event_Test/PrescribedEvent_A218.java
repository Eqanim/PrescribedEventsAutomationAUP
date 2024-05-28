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
public class PrescribedEvent_A218 {

//	@Test
//	public void Reset_Citss_EventID_A42()
//			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
//		DataBAseQueriesMethod.setConnection();
//		DataBAseQueriesMethod ref = new DataBAseQueriesMethod();
//		ref.updateCittsEventID_PE1();
//	}

	@Test(priority = 1, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void CreateNewEvent_A218() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginWa();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ObjectRepo.test.log(Status.PASS, "Security Answer sent Successfully");
		ref.createEventForWashingtonAuctionEvent();
		ObjectRepo.test.log(Status.PASS, "Event Created Successfully");
		ref.WashingtonFirstSponsorApprovalForEventCreation_PEWa();
		System.out.println("******************************************************************");
	}

	@Test(priority = 2, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Approval_By_WashingtonSecondSponsorA218() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginWa2();
		System.out.println("Step4: Washington Sponsor Login successfully ");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Step5: Security question handled successfully ");
		ref.secondApproval_PEWa();
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
	public void Placing_Bids_FirstEntity_A218() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginPEWa();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity1_PEwa();
		ref.selectEventForBidding_PEWa();
		ref.BiddingByARforTestData1_PEWa();
		System.out.println("First bid placed ");
		ObjectRepo.test.log(Status.PASS, "First bid placed ");
		ref.BiddingByARforTestData2_PEWa();
		System.out.println("Second bid placed ");
		ObjectRepo.test.log(Status.PASS, "Second bid placed ");
	}

	@Test(priority = 5, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_SecondEntity_A218() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginPEWa();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity2_PEWa();
		ref.selectEventForBidding_PEWa();
		ref.BiddingByARforTestData3_PEWa();
		System.out.println("Third bid placed ");
		ObjectRepo.test.log(Status.PASS, "Third bid placed");
		ref.BiddingByARforTestData4_PEWa();
		System.out.println("Fourth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Fourth bid placed ");
	}

	@Test(priority = 6, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_ThirdEntity_A218() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginPEWa();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity3_PEWa();
		ref.selectEventForBidding_PEWa();
		ref.BiddingByARforTestData5_PEWa();
		System.out.println("Fifth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Fifth bid placed ");
		ref.BiddingByARforTestData6_PEWa();
		System.out.println("Sixth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Sixth bid placed ");
	}

	@Test(priority = 7, retryAnalyzer = analyzer.RetryAnalyzer.class, enabled = true)
	public void Closing_Bidding_Window() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginWa();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PEWa();
		ref.closeBidding();
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.WashingtonFirstSponsorApprovalForEventCreation_PEWa();
		System.out.println("******************************************************************");
	}

	@Test(priority = 8, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Approval_By_WashingtonSponsor2_For_Edit_BiddingWindow_CloseTime() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginWa2();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.secondApproval_PEWa();
	}

	@Test(priority = 9, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Run_Algorithm_WashingtonFirstSponsor() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginWa();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PEWa();
		ref.runAlgorithm();

	}

	@Test(priority = 10, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Run_Algorithm_WashingtonSecondSponsor() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginWa2();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PEWa(); 
		ref.runAlgorithm2();
	}

	@Test(priority = 11, retryAnalyzer = analyzer.RetryAnalyzer.class)
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

	@Test(priority = 12, retryAnalyzer = analyzer.RetryAnalyzer.class)
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
