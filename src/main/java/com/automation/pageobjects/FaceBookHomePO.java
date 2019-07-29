package com.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.pages.LaunchloginPage;

public class FaceBookHomePO extends LaunchloginPage {

	private static WebElement element = null;
	
	public static WebElement homeButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Home')]//parent::div[@data-click='home_icon']"));

		return element;

	}
	
	public static WebElement linkCreatePost(WebDriver driver) {

		element = driver.findElement(By.xpath("//span[contains(text(),'Create post')]//ancestor::a"));

		return element;

	}

	
	public static WebElement textWriteSomething(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[contains(text(),'Write something here...')]"));

		return element;

	}
	
	public static WebElement btnShare(WebDriver driver) {

		element = driver.findElement(By.xpath("//span[contains(text(),'Share')]//ancestor::button"));

		return element;

	}
	
	public static WebElement btnRadioUserStory(WebDriver driver) {

		element = driver.findElement(By.xpath("//span[contains(text(),'Your story')]//parent::div//preceding-sibling::div[@class='_1se-']//div"));

		return element;

	}

	public static WebElement linkJustNow(WebDriver driver) {

		element = driver.findElement(By.xpath("//span[contains(text(),'Just now')]"));

		return element;

	}
	
	public static WebElement textPosted(WebDriver driver) {

		element = driver.findElement(By.xpath("//p[contains(text(),'Hello World')]"));

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

	
	
	