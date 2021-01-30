package com.tutorialsninja.automation.stepdef;




import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegisterPage;
import com.tutorialsninja.automation.pages.SuccessPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {
	
	HeadersSection headers=new HeadersSection();
	RegisterPage register=new RegisterPage();
	SuccessPage success=new SuccessPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
		
		Base.driver.get(Base.reader.getUrl());
	}

	@Given("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page()  {
	    
		Elements.click(HeadersSection.myAccountlink);
		Elements.click(HeadersSection.register);
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable)   {
		
		RegisterPage.enterAllDetails(dataTable,"unique");
		
	
	}

	@When("^I select the Privacy Policy$")
	public void i_select_the_Privacy_Policy() {
		
		Elements.click(RegisterPage.privacyCheckBox);
	    
	}

	@When("^I click on Continue button$")
	public void i_click_on_Continue_button() {
		
		Elements.click(RegisterPage.continueButton);
		
	}

	@Then("^I should see that the User Account has successfully created$")
	public void i_should_see_that_the_User_Account_has_successfully_created() {
		
		Assert.assertTrue(Elements.isDisplayed(SuccessPage.successBreadcrumb));
		
	}
	
	@Then("^I should see that the User Account is not created$")
	public void i_should_see_that_the_User_Account_is_not_created()  {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.registerBreadcrumb));
				
	}

	@And("^I should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields()  {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstnameError));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.lastnameError));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.emailError));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephoneError));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.passwordError));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.privacypolicyError));
		
	}
	
	@And("^I subscribe to the Newsletter$")
	public void i_subscribe_to_the_Newsletter() {
		
		Elements.click(RegisterPage.subscribenewsLetter);
	}
	

	@When("^I provide the below duplicate details into the fields$")
	public void i_provide_the_below_duplicate_details_into_the_fields(DataTable dataTable)  {
		
		RegisterPage.enterAllDetails(dataTable, "duplicate");
	}

	@Then("^I should see the warning message stating that the user is already created$")
	public void i_should_see_the_warning_message_stating_that_the_user_is_already_created() {
    
	}

	
}
