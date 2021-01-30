package com.tutorialsninja.automation.pages;

import java.util.Map;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage {
	
	public RegisterPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-firstname")
	public static WebElement firstName;
	
	@FindBy(id="input-lastname")
	public static WebElement lastName;
	
	@FindBy(id="input-email")
	public static WebElement Email;
	
	@FindBy(id="input-telephone")
	public static WebElement Telephone;
	
	@FindBy(id="input-password")
	public static WebElement Password;
	
	@FindBy(id="input-confirm")
	public static WebElement confirmPassword;
	
	@FindBy(css="input[name='agree'][value='1']")
	public static WebElement privacyCheckBox;
	
	@FindBy(css="input[type='submit'][value='Continue']")
	public static WebElement continueButton;
	
	@FindBy(linkText="Register")
	public static WebElement registerBreadcrumb;
	
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement firstnameError;
	
	@FindBy(css="input[id='input-lastname']+div")
	public static WebElement lastnameError;
	
	@FindBy(css="input[id='input-email']+div")
	public static WebElement emailError;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement telephoneError;	
	
	@FindBy(css="input[id='input-password']+div")
	public static WebElement passwordError;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement privacypolicyError;
	
	@FindBy(css="input[name='newsletter'][value='1']")
	public static WebElement subscribenewsLetter;
	
	
	
	public static void enterAllDetails(DataTable dataTable, String type)
	{
	
	Map<String, String> map=dataTable.asMap(String.class, String.class);
	Elements.TypeText(RegisterPage.firstName, map.get("First Name"));
	Elements.TypeText(RegisterPage.lastName, map.get("LastName"));
	
	Elements.TypeText(RegisterPage.Telephone, map.get("Telephone"));
	Elements.TypeText(RegisterPage.Password, map.get("Password"));
	Elements.TypeText(RegisterPage.confirmPassword, map.get("Password"));
	
	if(type.equalsIgnoreCase("unique")) {
		
		Elements.TypeText(RegisterPage.Email, System.currentTimeMillis()+map.get("Email"));
	}
	else
	{
		Elements.TypeText(RegisterPage.Email, map.get("Email"));

	}
	
	}
	

	
	

}
