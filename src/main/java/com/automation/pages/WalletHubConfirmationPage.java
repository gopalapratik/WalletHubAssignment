package com.automation.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.WebDriverWait;
import com.automation.common.config.ApplicationConfig;
import com.automation.common.config.ConfigLoader;
import com.automation.pageobjects.WalletHubConfirmationPO;

public class WalletHubConfirmationPage extends LaunchloginPage {

	private static ApplicationConfig applicationConfig = new ConfigLoader().getConfig();
	public static WebDriverWait wait = new WebDriverWait(driver, 20);

	public static void confirmation() throws InterruptedException {
		assertEquals(WalletHubConfirmationPO.textReviewPosted(driver).getText(),"Your review has been posted.");
		WalletHubConfirmationPO.btnContinue(driver).click();
		assertEquals(driver.getTitle().contains("Test Insurance Company Reviews:"), true);
}
	
	
	

}
