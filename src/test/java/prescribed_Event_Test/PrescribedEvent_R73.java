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
public class PrescribedEvent_R73 {

//	@Test
//	public void Reset_Citss_EventID_A42()
//			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
//		DataBAseQueriesMethod.setConnection();
//		DataBAseQueriesMethod ref = new DataBAseQueriesMethod();
//		ref.updateCittsEventID_PE1();
//	}

	@Test(priority = 1, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void CreateNewEvent_R73() throws Exception {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginQc();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ObjectRepo.test.log(Status.PASS, "Security Answer sent Successfully");
		ref.createEventForSBMA_R73();
		ObjectRepo.test.log(Status.PASS, "Event Created Successfully");
		ref.quebecFirstSponsorApprovalForEventCreation_PEQc4();
		System.out.println("******************************************************************");
	}

	@Test(priority = 2, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Approval_By_QuebecSecondSponsorR73() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsor2LoginQc();
		System.out.println("Step4: California Sponsor Login successfully ");
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.changeLangauge();
		System.out.println("Step5: Security question handled successfully ");
		ref.secondApproval_PEQc4();
		System.out.println("Step6: Second approval given successfully");
		ObjectRepo.test.log(Status.PASS, "Second approval given successfully");

	}

	@Test(priority = 3, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Execute_API() throws InterruptedException, SQLException {
		testCaseId.set("41375");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginQc();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.executeAPIGetQualifiedBidder();	 
		driver.get().navigate().refresh();	 
		ref.executeAPIGetBidLimitations();
		//ref.Logout();
	}
	
	@Test(priority = 4, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void uploadEmmissionUnits() throws InterruptedException  {
		
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginQc();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PEQc4();
		ref.uploadEmissionUnitsFileR73();
		System.out.println("Emission Units File Uploaded Successfully");
		ObjectRepo.test.log(Status.PASS, "Emission Units File Uploaded Successfully");
	}

	@Test(priority = 5, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Placing_Bids_FirstAR_R73() throws Exception {
		testCaseId.set("41380");
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.AR1LoginPEQcSBMA5();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.SelectEntity1_SBMA5();
		ref.changeLangauge();
		ref.selectEventForBidding_SBMA5();
		ref.BiddingByAR1_SBMA5();
		System.out.println("AR1 bids placed ");
		ObjectRepo.test.log(Status.PASS, "AR1 bids placed ");
		
	}

	@Test(priority = 6, retryAnalyzer = analyzer.RetryAnalyzer.class, enabled = true)
	public void Closing_Bidding_Window() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginQc();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PEQc4();
		ref.closeBidding();
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.quebecFirstSponsorApprovalForEventCreation_PEQc4();
		System.out.println("******************************************************************");
	}

	@Test(priority = 7, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Approval_By_QuebecSponsor2_For_Edit_BiddingWindow_CloseTime() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsor2LoginQc();
		ref.handleSecurityQue();
		ref.clickOnnext();
		ref.changeLangauge();
		ref.secondApproval_PEQc4();
	}

	@Test(priority = 8, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Run_Algorithm_QuebecFirstSponsor() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginQc();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PEQc4();
		ref.runAlgorithm();
	}

	@Test(priority = 9, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void Run_Algorithm_QuebecSecondSponsor() throws InterruptedException {
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsor2LoginQc();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.changeLangauge();
		ref.clickbtnAdmin();
		ref.clickbtnEvent();
		ref.getCurrentEvent_PEQc4(); 
		ref.runAlgorithm2();
	}

	@Test(priority = 10, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void EventCertification_QuebecFirstSponsor() throws InterruptedException {
		
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsorLoginQc();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.clickbtnAdmin();
		ref.AuctionCertificationButtonPEQc();
	}

	@Test(priority = 11, retryAnalyzer = analyzer.RetryAnalyzer.class)
	public void EventCertification_QuebecSecondSponsor() throws InterruptedException {
		
		com_pomClassForJointAuctionTieBreaker ref = new com_pomClassForJointAuctionTieBreaker();
		ref.sponsor2LoginQc();
		System.out.println("Sponsor Login successfully");
		ref.handleSecurityQue();
		ref.clickOnnext();
		System.out.println("Security Question handled successfully");
		ref.changeLangauge();
		ref.clickbtnAdmin();
		ref.AuctionCertification2ButtonPEQc(); 
	}
}
