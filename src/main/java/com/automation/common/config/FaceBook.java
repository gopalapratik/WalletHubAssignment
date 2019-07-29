package com.automation.common.config;

public class FaceBook {
	
	

	private String url;
	private String loginpagetitle;
	private String username;
	private String password;

	
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getLoginpagetitle() {
		return loginpagetitle;
	}


	public void setLoginpagetitle(String loginpagetitle) {
		this.loginpagetitle = loginpagetitle;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
	
	@Override
	public String toString() {
		return "FaceBook [url=" + url + ", loginpagetitle=" + loginpagetitle + ", username=" + username + ", password="
				+ password + "]";
	}
}
