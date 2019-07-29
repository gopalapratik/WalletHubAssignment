package com.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.pages.LaunchloginPage;

public class FaceBookLoginPO extends LaunchloginPage {

	private static WebElement element = null;
	
	public static WebElement textEMail(WebDriver driver) {

		element = driver.findElement(By.id("email"));

		return element;

	}

	public static WebElement textPassWord(WebDriver driver) {

		element = driver.findElement(By.id("pass"));

		return element;

	}

	public static WebElement btnLogIN(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@value='Log In']"));

		return element;

	}

	
	
}

	
	
	