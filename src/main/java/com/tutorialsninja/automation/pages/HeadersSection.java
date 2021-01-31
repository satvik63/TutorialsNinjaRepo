package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class HeadersSection {
	
	public HeadersSection()
	{
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(xpath="//span[text()=\"My Account\"]")
	public static WebElement myAccountlink;
	
	@FindBy(linkText="Register")
	public static WebElement register;
	
	@FindBy(linkText="Login")
	public static WebElement login;
	
	@FindBy(css="input[name='search']")
	public static WebElement searchBox;
	
	@FindBy(css="button[class='btn btn-default btn-lg']")
	public static WebElement searchButton;
	
	
	
	
	
	
}
