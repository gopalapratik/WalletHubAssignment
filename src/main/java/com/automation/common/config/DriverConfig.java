package com.automation.common.config;

public class DriverConfig {

	private String driver;
	private String chromeDriverPath;


	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}


	public String getChromeDriverPath() {
		return chromeDriverPath;
	}

	public void setChromeDriverPath(String chromeDriverPath) {
		this.chromeDriverPath = chromeDriverPath;
	}

	@Override
	public String toString() {
		return "DriverConfig [driver=" + driver + ",  chromeDriverPath=" + chromeDriverPath + "]";
	}

}
