package com.automation.pages;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.common.config.ApplicationConfig;
import com.automation.common.config.ConfigLoader;
import com.automation.common.utils.DriverCreator;

public class LaunchloginPage {

	public static WebDriver driver;
	private static ApplicationConfig applicationConfig = new ConfigLoader().getConfig();

	public static void launchApp(String application) throws MalformedURLException {
		driver = DriverCreator.webDriver();
		switch (application) {
		case "FaceBook":
			driver.get(applicationConfig.getFacebook().getUrl());
			assertEquals(driver.getTitle(), applicationConfig.getFacebook().getLoginpagetitle());
			break;
		case "WalletHub":
			driver.get(applicationConfig.getWallethub().getUrl());
			assertEquals(driver.getTitle().contains("Test Insurance Company Reviews:"), true);
			break;
		default:
			break;
		}
	}

	}
