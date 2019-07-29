package com.automation.common.utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.automation.common.config.ApplicationConfig;
import com.automation.common.config.ConfigLoader;

public class DriverCreator {
	private static ApplicationConfig applicationConfig = new ConfigLoader().getConfig();

	private DriverCreator() {

	}

	public static boolean isWebDriver() {
		return isWebDriver;
	}

	public static void setWebDriver(boolean isWebDriver) {
		DriverCreator.isWebDriver = isWebDriver;
	}

	private static WebDriver driver = null;
	private static boolean isWebDriver = false;
	private static final Logger LOGGER = Logger.getLogger(DriverCreator.class.getName());

	public static WebDriver webDriver() {

		try {

			setWebDriver(true);
			final File file = new File(applicationConfig.getMyDriver().getChromeDriverPath());
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.setExperimentalOption("useAutomationExtension", false);
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			options.setExperimentalOption("prefs", prefs);
			driver = new ChromeDriver(options);
//			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			

		} catch (Exception e) {
			LOGGER.debug(e.getMessage());
		}

		return driver;

	}
}
