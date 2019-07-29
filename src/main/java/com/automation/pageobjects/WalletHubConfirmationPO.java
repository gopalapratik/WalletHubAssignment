package com.automation.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.pages.LaunchloginPage;

public class WalletHubConfirmationPO extends LaunchloginPage {

	private static WebElement element = null;
	private static List<WebElement> elements = null;
	
	
	
	
	public static List<WebElement> noOfElementsForStarLit(WebDriver driver) {

		elements = driver.findElements(By.xpath("//span[contains(text(),'What')]//parent::h3//following-sibling::review-star//*[name()='svg']/*[name()='g']/*[name()='path']"));

		return elements;

	}
	
	public static WebElement textReviewPosted(WebDriver driver) {

		element = driver.findElement(By.xpath("//h4"));

		return element;

	}
	
	public static WebElement btnContinue(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[contains(text(),'Continue')]"));

		return element;

	}
		
}

	
	
	