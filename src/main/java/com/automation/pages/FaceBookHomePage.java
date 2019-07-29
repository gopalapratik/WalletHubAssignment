package com.automation.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.common.config.ApplicationConfig;
import com.automation.common.config.ConfigLoader;
import com.automation.pageobjects.FaceBookHomePO;

public class FaceBookHomePage extends LaunchloginPage {

	private static ApplicationConfig applicationConfig = new ConfigLoader().getConfig();
	public static WebDriverWait wait = new WebDriverWait(driver,20);
		
	public static void navigationToHomePageValidation() {

		assertEquals(FaceBookHomePO.homeButton(driver).isDisplayed(),true);
	}

	
	
	public static void postMessage(String message) throws InterruptedException {
		FaceBookHomePO.linkCreatePost(driver).click();
		wait.until(ExpectedConditions.elementToBeClickable(FaceBookHomePO.textWriteSomething(driver)));//, "Write something here..."));
		Actions actions = new Actions(driver);
		actions.click();
		actions.moveToElement(FaceBookHomePO.textWriteSomething(driver));
		actions.click();
		actions.sendKeys(message);
		actions.build().perform();
		FaceBookHomePO.btnRadioUserStory(driver).click();
		FaceBookHomePO.btnShare(driver).click();
	}
	
	public static void postMessageValidation(String message) {
		wait.until(ExpectedConditions.stalenessOf(FaceBookHomePO.linkJustNow(driver)));
		assertEquals(FaceBookHomePO.textPosted(driver).getText(),message);
	}


}
