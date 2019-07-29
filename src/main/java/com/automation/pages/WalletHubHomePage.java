package com.automation.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.automation.common.config.ApplicationConfig;
import com.automation.common.config.ConfigLoader;
import com.automation.pageobjects.WalletHubHomePO;

public class WalletHubHomePage extends LaunchloginPage {

	private static ApplicationConfig applicationConfig = new ConfigLoader().getConfig();
	public static WebDriverWait wait = new WebDriverWait(driver, 20);

	public static void starValidationAndClick() throws InterruptedException {
		Actions builder;
		for (int i =1;i<=5;i++) {
			System.out.println(i + " is lightened " + WalletHubHomePO.elementStar(driver).get(i-1).isSelected());
			builder = new Actions(driver);
			builder.moveToElement(WalletHubHomePO.elementStar(driver).get(i-1));
			builder.build().perform();
			Thread.sleep(2000);
			int size = WalletHubHomePO.noOfElementsForStarLit(driver).size();
			assertEquals(size, i+5);
			System.out.println(i + " is lightened");
			if(i-1==4) {
				builder.moveToElement(WalletHubHomePO.elementStar(driver).get(i-1));
				builder.click().build().perform();
			}
		}
	}
	
	public static void chooseDropDown() throws InterruptedException {
		WalletHubHomePO.dropDownTestInsCom(driver).click();
		for(WebElement e:WalletHubHomePO.chooseOption(driver)) {
			if(e.getText().equalsIgnoreCase("Health Insurance")) {
				e.click();
				break;
			}
		}
		WalletHubHomePO.textReview(driver).sendKeys(applicationConfig.getWallethub().getReviewtext());
		WalletHubHomePO.btnSubmit(driver).click();
		Thread.sleep(5000);
		assertEquals(driver.getTitle(), "WalletHub - Review Confirmation");
	}

	public static void goToProfilePage() {
		assertEquals(WalletHubHomePO.validateReviewTextOnHomePage(driver).get(0).getText(),applicationConfig.getWallethub().getReviewtext());
		Actions builder = new Actions(driver);
		builder.moveToElement(WalletHubHomePO.hoverUserName(driver));
		builder.build().perform();
		WalletHubHomePO.dropDownProfile(driver).click();
		assertEquals(driver.getTitle().contains("on Wallet Hub"), true);
	}
	

}
