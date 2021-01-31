package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.SearchResultPage;

import cucumber.api.java.en.*;

public class Search {
	
	HeadersSection headers=new HeadersSection();
	SearchResultPage srp=new SearchResultPage();


	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String product)  {
		
		Elements.TypeText(HeadersSection.searchBox, product);
		Elements.click(HeadersSection.searchButton);
    
		}

	@Then("^I should see the product in the search resultsil address$")
	public void i_should_see_the_product_in_the_search_resultsil_address() {
		
		Assert.assertTrue(Elements.isDisplayed(SearchResultPage.samsungResultLink));	
   
		}

	@Then("^I should see the page displaying the message \"([^\"]*)\"$")
	public void i_should_see_the_page_displaying_the_message(String msg) {
		
		Assert.assertTrue(Elements.VerifyTextEquals(SearchResultPage.noResultMessage, msg));

		}
	
}

