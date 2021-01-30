package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class LoginPage {
	
	public LoginPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-email")
	public static WebElement loginEmail;
	
	@FindBy(id="input-password")
	public static WebElement loginPassword;
	
	@FindBy(css="input[type='submit'][class='btn btn-primary']")
	public static WebElement loginButton;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement invalidCredsError;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement forgotPassword;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement successMessage;

}
