package com.automation.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.pages.LaunchloginPage;

public class WalletHubHomePO extends LaunchloginPage {

	private static WebElement element = null;
	private static List<WebElement> elements = null;
	
	public static List<WebElement> elementStar(WebDriver driver) {

		elements = driver.findElements(By.xpath("//span[contains(text(),'What')]//parent::h3//following-sibling::review-star//*[name()='svg']/*[name()='g']"));

		return elements;

	}
	
	
	public static List<WebElement> noOfElementsForStarLit(WebDriver driver) {

		elements = driver.findElements(By.xpath("//span[contains(text(),'What')]//parent::h3//following-sibling::review-star//*[name()='svg']/*[name()='g']/*[name()='path']"));

		return elements;

	}
	
	public static WebElement dropDownTestInsCom(WebDriver driver) {

		element = driver.findElement(By.xpath("//span[contains(text(),'Select...')]//parent::div"));

		return element;

	}
	
	public static List<WebElement> chooseOption(WebDriver driver) {

		elements = driver.findElements(By.xpath("//span[contains(text(),'Select...')]//parent::div//ul//li"));

		return elements;

	}
	
	public static WebElement textReview(WebDriver driver) {

		element = driver.findElement(By.xpath("//textarea[@placeholder='Write your review...']"));

		return element;

	}
	
	public static WebElement btnSubmit(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[contains(text(),'Submit')]"));

		return element;

	}
	
	public static WebElement hoverUserName(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[@class='brgm-button brgm-user brgm-list-box']//span[contains(text(),'gopala_pratik')]"));

		return element;

	}
		
	public static WebElement dropDownProfile(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[@class='brgm-button brgm-user brgm-list-box']//a[contains(text(),'Profile')]"));

		return element;

	}
	
	public static List<WebElement> validateReviewTextOnHomePage(WebDriver driver) {

		elements = driver.findElements(By.xpath("//div[@class='rvtab-ci-content with-links text-select']"));

		return elements;

	}
	
	
}

	
	
	