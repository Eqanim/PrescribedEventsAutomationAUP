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
public class PrescribedEvent_R317 {

//	@Test
//	public void Reset_Citss_EventID_A42()
//			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
//		DataBAseQueriesMethod.setConnection();
//		DataBAseQueriesMethod ref = new DataBAseQueriesMethod();
//		ref.updateCittsEventID_PE1();
//	}

	@Test(priority = 1, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void CreateNewEvent_R317() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginCa();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ObjectRepo.test.log(Status.PASS, "Security Answer sent Successfully");
		ref.createEventForCaReserveSaleEvent();
		ObjectRepo.test.log(Status.PASS, "Event Created Successfully");
		ref.californiaFirstSponsorApprovalForEventCreation_PECa();
		System.out.println("******************************************************************");
	}

	@Test(priority = 2, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Approval_By_CaliforniaSecondSponsorR317() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsor2LoginCa();
		System.out.println("Step4: California Sponsor Login successfully ");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Step5: Security question handled successfully ");
		ref.secondApproval_PECa();
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
	public void Placing_Bids_FirstEntity_R317() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginPECa();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity1_PECa();
		ref.selectEventForBidding_PECa();
		ref.BiddingByARforTestData1_PECa();
		System.out.println("First bid placed ");
		ObjectRepo.test.log(Status.PASS, "First bid placed ");
	}

	@Test(priority = 5, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_SecondEntity_R317() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginPECa();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity2_PECa();
		ref.selectEventForBidding_PECa();
		ref.BiddingByARforTestData2_PECa();
		System.out.println("Second bid placed ");
		ObjectRepo.test.log(Status.PASS, "Second bid placed");
		ref.BiddingByARforTestData3_PECa();
		System.out.println("Third bid placed ");
		ObjectRepo.test.log(Status.PASS, "Third bid placed ");
	}

	@Test(priority = 6, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_ThirdEntity_R317() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.ARLoginPECa();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity3_PECa();
		ref.selectEventForBidding_PECa();
		ref.BiddingByARforTestData4_PECa();
		System.out.println("Fourth bid placed ");
		ObjectRepo.test.log(Status.PASS, "Fourth bid placed ");
	}

	@Test(priority = 7, retryAnalyzer = analyzer.RetryAnalyzer.class, enabled = true)
	public void Closing_Bidding_Window() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginCa();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PECa();
		ref.closeBidding();
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.californiaFirstSponsorApprovalForEventCreation_PECa();
		System.out.println("******************************************************************");
	}

	@Test(priority = 8, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Approval_By_CaliforniaSponsor2_For_Edit_BiddingWindow_CloseTime() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsor2LoginCa();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.secondApproval_PECa();
	}

	@Test(priority = 9, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Run_Algorithm_CaliforniaFirstSponsor() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginCa();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PECa();
		ref.runAlgorithm();
	}

	@Test(priority = 10, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Run_Algorithm_CaliforniaSecondSponsor() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsor2LoginCa();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PECa(); 
		ref.runAlgorithm2();
	}

	@Test(priority = 11, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void EventCertification_CaliforniaFirstSponsor() throws InterruptedException {
		
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginCa();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.AuctionCertificationButtonPECa();
	}

	@Test(priority = 12, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void EventCertification_CaliforniaSecondSponsor() throws InterruptedException {
		
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsor2LoginCa();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.AuctionCertification2ButtonPECa(); 
	}

}
