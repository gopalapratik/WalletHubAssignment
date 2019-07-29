package com.automation.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.pages.LaunchloginPage;

public class WalletHubLoginPO extends LaunchloginPage {

	private static WebElement element = null;
	private static List<WebElement> elements = null;
	
	public static List<WebElement> elementStar(WebDriver driver) {

		elements = driver.findElements(By.xpath("//span[contains(text(),'What')]//parent::h3//following-sibling::review-star//*[name()='svg']/*[name()='g']"));

		return elements;

	}
	
	public static WebElement linkLogin(WebDriver driver) {

		element = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));

		return element;

	}
	
	public static WebElement textEmail(WebDriver driver) {

		element = driver.findElement(By.name("em"));

		return element;

	}
	
	public static WebElement textPassword(WebDriver driver) {

		element = driver.findElement(By.name("pw"));

		return element;

	}
	
	public static WebElement btnLogin(WebDriver driver) {

		element = driver.findElement(By.xpath("//span[contains(text(),'Login')]//ancestor::button"));

		return element;

	}
	
}
