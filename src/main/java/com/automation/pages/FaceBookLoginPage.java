package com.automation.pages;

import com.automation.common.config.ApplicationConfig;
import com.automation.common.config.ConfigLoader;
import com.automation.common.utils.EncryptionUtil;
import com.automation.pageobjects.FaceBookLoginPO;

public class FaceBookLoginPage extends LaunchloginPage {

	private static ApplicationConfig applicationConfig = new ConfigLoader().getConfig();
	public static void enterFBDetails() {
		FaceBookLoginPO.textEMail(driver).sendKeys(applicationConfig.getFacebook().getUsername());
		FaceBookLoginPO.textPassWord(driver).sendKeys(EncryptionUtil.decryptStr(applicationConfig.getFacebook().getPassword()));
		FaceBookLoginPO.btnLogIN(driver).click();
	}
	
	

}
