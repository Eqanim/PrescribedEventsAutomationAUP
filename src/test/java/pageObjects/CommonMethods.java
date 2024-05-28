package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static resources.listeners.wait;
import static constants.ThreadConstants.driver;

public class CommonMethods {

	String url = "";
	int count;
	public void brokenLinksOnAWebPage() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a")));
		List<WebElement> links = driver.get().findElements(By.xpath("//a"));
		System.out.println("No of links are " + links.size());
		System.out.println("Total No of links Present on this webpage as below");
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
		System.out.println("***********************************************************************************");
		for (int i = 0; i < links.size(); i++) {
			WebElement E1 = links.get(i);
			String url = E1.getAttribute("href");
			if (url == null || url.isEmpty()) {
				String BrokenLink = E1.getText();
				System.out.println("BrokenLink present on this webpage:" + BrokenLink);
			}
		}
		System.out.println("***********************************************************************************");
	}

}
