package com.test;

import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utils.WebElements;
import com.beanfactory.BeanFactory;
import com.beanfactory.PropertiesFactory;
import com.setup.Setup;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Unibet_StepDefinition implements Setup {

	private WebDriver driver = null;

	private WebDriverWait driverWait;
	Properties object = null;
	BeanFactory beanfactory = new BeanFactory();

	PropertiesFactory propertiesfactory = new PropertiesFactory();

	WebElements webelements = new  WebElements(driver, driverWait);
 
		
	String emailvalue;
	private static Logger logger = Logger.getLogger(Unibet_StepDefinition.class);

	private Map<String, String> datamap ;
	private Map<String, String> PropertiesMap;

	@Before
	public void setUP() {

		datamap = beanfactory.dataMap();
		PropertiesMap = propertiesfactory.getObjectProperties();
		emailvalue=	beanfactory.emailRandomValuesGeneration();
		
	}
	
	@Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_go_to(String url, String Browser) throws Exception {
		System.out.println("I am going to " + url + " on " + Browser);
		logger.info("The driver value is " + Browser);
		logger.info("The url value is " + url);
		webelements.openBrowser(Browser);
		webelements.navigateBrowser(url);
	}
	
	
	@And("^I enter text into \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_enter_text_into(String objectprop, String text)
			throws Exception {
		webelements.enterText(PropertiesMap.get(objectprop), driverWait,
				datamap.get(text), webelements.getpageTitle());
	}
	

	@And("^I click on \"([^\"]*)\"$")
	public void I_click_on(String objectprop) {
		Map<String, String> PropertiesMap = propertiesfactory
				.getObjectProperties();
		webelements.click(PropertiesMap.get(objectprop));
	}
	
	@And("^I_select_value_from_drop_down_is into \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_select_value_from_drop_down_is(String objectprop, String propertybean){
		Map<String, String> PropertiesMap = propertiesfactory.getObjectProperties();
		Map<String, String> BeansMap= beanfactory.dataMap();
		webelements.selectValuefromDropDown(PropertiesMap.get(objectprop), driverWait, BeansMap.get(propertybean));
	}
	
	@When("^I MouseHover onto \"([^\"]*)\"$")
	 
	 public void I_MouseHover_onto(String objectprop){
	  
	  webelements.mouseHover(PropertiesMap.get(objectprop));
	  
	 }
	
	@Then("^Search should be \"([^\"]*)\"$")
	public void Search_should_be(String objectprop) {
		 boolean result = webelements.isDisplayed(PropertiesMap.get(objectprop));
		   
		   if(result==true){
		    
		    logger.info("Test case is passed");
		    
		   }else
		    logger.info("Test case is failed");
		 
	}
	
	
	@And("^I_am_waiting$")
	public void I_am_waiting()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@After
	public void browserclose(){
	
	webelements.browserQuit();
	}
	
}
