package com.automation.common.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplicationConfig {

	@JsonProperty("actionConfiguration")
	

	private DriverConfig myDriver;
	private FaceBook facebook;
	private WalletHub wallethub;

	public DriverConfig getMyDriver() {
		return myDriver;
	}

	public void setMyDriver(DriverConfig myDriver) {
		this.myDriver = myDriver;
	}

	
	
	
	public FaceBook getFacebook() {
		return facebook;
	}

	public void setFacebook(FaceBook facebook) {
		this.facebook = facebook;
	}
	
	public WalletHub getWallethub() {
		return wallethub;
	}

	public void setWallethub(WalletHub wallethub) {
		this.wallethub = wallethub;
	}

	@Override
	public String toString() {
		return "ApplicationConfig [myDriver=" + myDriver + ", facebook=" + facebook + ", wallethub=" + wallethub + "]";
	}

	
	


	


}


