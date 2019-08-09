package com.qa.stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefination {
	
	@Before
	public void setUp(){
		System.out.println("-----Browser created and launched-----");
	}
	
	
	@After
	public void tearDown(){
		System.out.println("-----Browser is closed-----");
	}
	
	
	
//	@Given("^User launch site$")
//	public void user_launch_site(){
//		System.out.println("");
//	}
//	
//	
//
//	@Given("^User should see all tabs$")
//	public void user_should_see_all_tabs() {
//		System.out.println("");
//	}
//	
//	@Given("^User should see logo$")
//	public void user_should_see_logo() {
//		System.out.println("");
//	}
//	
//
//	@Given("^user entered wrong credentails$")
//	public void user_entered_wrong_credentails()  {
//		System.out.println("");
//	}
//	
//
//	@When("^User click login butotn$")
//	public void user_click_login_butotn() {
//		System.out.println("");
//	}
//	
//
//	@Then("^User should see error message$")
//	public void user_should_see_error_message() {
//		System.out.println("");
//	}
//	
//	
//	@Given("^user should see all footer details$")
//	public void user_should_see_all_footer_details()  {
//		System.out.println("");
//	}
//
//	@When("^User click SignIn link$")
//	public void user_click_SignIn_link()  {
//		System.out.println("");
//	}
//
//	@Then("^User should navigate to SignInPage$")
//	public void user_should_navigate_to_SignInPage()  {
//		System.out.println("");
//	}
//
//	@Then("^User should enter username and password$")
//	public void user_should_enter_username_and_password() {
//		System.out.println("");
//	}
//	
//	
//	@Then("^User should click LogInBUtton$")
//	public void user_should_click_LogInBUtton()  {
//		System.out.println("");
//	}
//
//	@Then("^User User should be on Home page$")
//	public void user_User_should_be_on_Home_page()  {
//		System.out.println("");
//	}


	@Given("^User launch site$")
	public void user_launch_site() throws Throwable {
	    
	}

	@Given("^User should see all tabs$")
	public void user_should_see_all_tabs() throws Throwable {
	    
	}

	@Given("^User should see logo$")
	public void user_should_see_logo() throws Throwable {
	    
	}

	@Given("^user entered wrong credentails$")
	public void user_entered_wrong_credentails() throws Throwable {
	    
	}

	@When("^User click login butotn$")
	public void user_click_login_butotn() throws Throwable {
	    
	}

	@Then("^User should see error message$")
	public void user_should_see_error_message() throws Throwable {
	    
	}

	@Given("^user should see all footer details$")
	public void user_should_see_all_footer_details() throws Throwable {
	   
	}

	@When("^User click SignIn link$")
	public void user_click_SignIn_link() throws Throwable {
	   
	}

	@Then("^User should navigate to SignInPage$")
	public void user_should_navigate_to_SignInPage() throws Throwable {
	    
	}

	@Then("^User should enter username and password$")
	public void user_should_enter_username_and_password() throws Throwable {
	    
	}

	@Then("^User should click LogInBUtton$")
	public void user_should_click_LogInBUtton() throws Throwable {
	    
	}

	@Then("^User User should be on Home page$")
	public void user_User_should_be_on_Home_page() throws Throwable {
	    
	}




}
