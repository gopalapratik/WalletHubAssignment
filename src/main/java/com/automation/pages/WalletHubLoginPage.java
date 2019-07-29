package com.automation.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.common.config.ApplicationConfig;
import com.automation.common.config.ConfigLoader;
import com.automation.common.utils.EncryptionUtil;
import com.automation.pageobjects.WalletHubLoginPO;

public class WalletHubLoginPage extends LaunchloginPage {

	private static ApplicationConfig applicationConfig = new ConfigLoader().getConfig();
	public static WebDriverWait wait = new WebDriverWait(driver, 20);

	public static void login() throws InterruptedException {
		WalletHubLoginPO.linkLogin(driver).click();
		assertEquals(driver.getTitle(),"Login");
		WalletHubLoginPO.textEmail(driver).sendKeys(applicationConfig.getWallethub().getUsername());
		WalletHubLoginPO.textPassword(driver).sendKeys(EncryptionUtil.decryptStr(applicationConfig.getWallethub().getPassword()));
		WalletHubLoginPO.btnLogin(driver).click();
		Thread.sleep(3000);
		assertEquals(driver.getTitle().contains("Test Insurance Company Reviews:"), true);
	}
}