package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class SwagLabsPage {
	
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement Username ;
	
	@FindBy(how = How.ID, using = "password")
	public static WebElement Password ;
	
	@FindBy(how = How.ID, using = "login-button")
	public static WebElement Loginbtn ;
	
	public SwagLabsPage() {
		PageFactory.initElements(Setup.driver, this);
	}
}
