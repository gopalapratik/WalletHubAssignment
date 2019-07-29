package com.automation.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.pages.LaunchloginPage;

public class WalletHubProfilePO extends LaunchloginPage {

	private static WebElement element = null;
	private static List<WebElement> elements = null;
	
	public static WebElement linkReview(WebDriver driver) {

		element = driver.findElement(By.xpath("//li//a[contains(@href,'/reviews/')]"));

		return element;

	}
	
	public static WebElement postedReview(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[@class='reviewlinks']//following-sibling::p"));

		return element;

	}
	
	
		
}

	
	
	