package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features= {"classpath:FeatureFiles"},
glue= {"classpath:com.tutorialsninja.automation.stepdef"},
tags= {"@Login"})
public class Runner {

}
