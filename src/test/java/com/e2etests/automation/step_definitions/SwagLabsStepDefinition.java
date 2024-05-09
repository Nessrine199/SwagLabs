package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_object.SwagLabsPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabsStepDefinition {
	private SwagLabsPage swagLabsPage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;
	private ConfigFileReader configFileReader;
	
	public SwagLabsStepDefinition() {
		this.swagLabsPage = new SwagLabsPage();
		this.seleniumUtils = new SeleniumUtils();
		this.configFileReader = new ConfigFileReader();
		this.validations = new Validations(); 
	}
	

	@Given("I want to login into Swag Labs website")
	public void iWantToLoginIntoSwagLabsWebsite() {
	seleniumUtils.get(configFileReader.getProperties("swagLabs.url"));
	}
	
	@When("I enter my username")
	public void iEnterMyUsername() {
	seleniumUtils.click(swagLabsPage.Username);   
	}
	
	@When("I add password")
	public void iAddPassword() {
	seleniumUtils.click(swagLabsPage.Password);
	}
	
	@When("I click on Login button")
	public void iClickOnLoginButton() {
	seleniumUtils.click(swagLabsPage.Loginbtn);  
	}
	
	
	@Then("I am logged in the swag Labs website")
	public void iAmLoggedInTheSwagLabsWebsite() {
	   
	}
	
	@Then("I am redirected to the internal page of swagLabs")
	public void jeMeRedergieVersLaPageInterneDeSwagLabs() throws InterruptedException {
	Thread.sleep(3000);
	seleniumUtils.get(configFileReader.getProperties("redirection.url"));
	}







}
