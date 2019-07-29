package com.automation.stepdefs;

import com.automation.pages.FaceBookHomePage;
import com.automation.pages.FaceBookLoginPage;
import com.automation.pages.LaunchloginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBookStepDef {
	
	@Given("^user login to \"([^\"]*)\"$")
	public void user_login_to(String application) throws Throwable {
		LaunchloginPage.launchApp(application);

	}
	
	@When("^user provides username and password$")
	public void user_provides_username_and_password() throws Throwable {
		FaceBookLoginPage.enterFBDetails();
	}

	@Then("^user is logged into FaceBook home page$")
	public void user_is_logged_into_FaceBook_home_page() throws Throwable {
	    FaceBookHomePage.navigationToHomePageValidation();

	}

	@When("^user posts a status message \"([^\"]*)\"$")
	public void user_posts_a_status_message(String message) throws Throwable {
		FaceBookHomePage.postMessage(message);
	}

	
	@Then("^status message \"([^\"]*)\" is posted successfully$")
	public void status_message_is_posted_successfully(String message) throws Throwable {
		FaceBookHomePage.postMessageValidation(message);
	}
	
}
