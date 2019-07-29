package com.automation.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.common.config.ApplicationConfig;
import com.automation.common.config.ConfigLoader;
import com.automation.pageobjects.FaceBookHomePO;
import com.automation.pageobjects.WalletHubConfirmationPO;
import com.automation.pageobjects.WalletHubHomePO;
import com.automation.pageobjects.WalletHubProfilePO;

public class WalletHubProfilePage extends LaunchloginPage {

	private static ApplicationConfig applicationConfig = new ConfigLoader().getConfig();
	public static WebDriverWait wait = new WebDriverWait(driver, 20);

	public static void reviewOnProfileValidation() throws InterruptedException {
		WalletHubProfilePO.linkReview(driver).click();
		assertEquals(WalletHubProfilePO.postedReview(driver).getText(),applicationConfig.getWallethub().getReviewtext());
}
	
	
	

}
