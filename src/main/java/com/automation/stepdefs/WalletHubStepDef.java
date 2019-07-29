package com.automation.stepdefs;

import com.automation.pages.LaunchloginPage;
import com.automation.pages.WalletHubConfirmationPage;
import com.automation.pages.WalletHubHomePage;
import com.automation.pages.WalletHubLoginPage;
import com.automation.pages.WalletHubProfilePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WalletHubStepDef {
	
	

	@Given("^user launches WalletHub \"([^\"]*)\"$")
	public void user_launches_WalletHub(String application) throws Throwable {
		LaunchloginPage.launchApp(application);
	    
	}

	@When("^user enters valid WalletHub credentials$")
	public void user_enters_valid_WalletHub_credentials() throws Throwable {
		WalletHubLoginPage.login();
	    
	}

	@Then("^user lands on WalletHub Homepage and give five stars after hovering on every star$")
	public void user_lands_on_WalletHub_Homepage_and_give_five_stars_after_hovering_on_every_star() throws Throwable {
		WalletHubHomePage.starValidationAndClick();
	    
	}

	@Then("^user chooses Policy dropdown, write the review and click on Submit button$")
	public void user_chooses_Policy_dropdown_write_the_review_and_click_on_Submit_button() throws Throwable {
		WalletHubHomePage.chooseDropDown();
		
	    
	}

	@Then("^user is navigated to confirmation page where user validates the review post is successfully posted and clicks on Continue button$")
	public void user_is_navigated_to_confirmation_page_where_user_validates_the_review_post_is_successfully_posted_and_clicks_on_Continue_button() throws Throwable {
		WalletHubConfirmationPage.confirmation();
	    
	}

	@When("^user navigates to Profile page from home page$")
	public void user_navigates_to_Profile_page_from_home_page() throws Throwable {
		WalletHubHomePage.goToProfilePage();
	    
	}

	@Then("^user validates review message$")
	public void user_validates_review_message() throws Throwable {
		WalletHubProfilePage.reviewOnProfileValidation();
	}



	
	
}
