package com.beanfactory;

import java.util.HashMap;
import java.util.Map;

public class PropertiesFactory {

	public Map<String, String> getObjectProperties(){
		Map<String, String> map = new HashMap<String, String>();
		  map.put("unibetjoinuslocator", ".//*[@id='sidebar-follow']/div[5]/div/div/a/img");
		  map.put("unibetfirstNametextboxlocator", "//*[@name='firstName']");
		  map.put("unibetlastNametextboxlocator", "//*[@name='lastName']");
		  map.put("unibetuserNametextboxlocator", "//*[@name='userName']");
		  map.put("unibetpasswordtextboxlocator", "//*[@name='password']");
		  map.put("unibetconfirm-passwordtextboxlocator", "//*[@name='confirm-password']");
		  map.put("unibetstreettextboxlocator", "//*[@name='street']");
		  map.put("unibetemailtextboxlocator", "//*[@name='email']");
		  map.put("unibetcitytextboxlocator", "//*[@name='city']");
		  map.put("unibetdaylocator", "//*[@name='day']");
		  map.put("unibetmonthlocator", "//*[@name='month']");
		  map.put("unibetyearlocator", "//*[@name='year']");
		  map.put("unibetphoneNumbertextboxlocator", "//*[@name='phoneNumber']");
		  map.put("unibetgenderradioButtonlocatormale", "//*[contains(text(),'Male')]/../span[1]");
		  map.put("unibetsubmit-registrationbuttonlocator", "//*[@name='submit-registration']");
		  map.put("unibetpostalCodetextbuttonlocator", "//*[@name='postalCode']");
		  map.put("unibetsecurityAnswertextbuttonlocator", "//*[@name='securityAnswer']");
		  map.put("unibetsecurityanswerlocator", "//input[@name='securityAnswer']");
		  map.put("unibetbonusyeslocator","//*[contains(text(),'Yes')]/../span[1]");
		  map.put("unibetagreetermslocator", "//label[@data-test-name='termsAndConditionsAcceptDate']/span[@class='custom-checkbox']");
		  map.put("unibetsubmitcontinuebuttonlocator", "//button[@name='submit-registration']");
		  map.put("unibetwelcometxt", "//h1[contains(text(),'Welcome to Unibet!')]");
		  map.put("unisearchButton", "//a[@data-target='#search']");
		  map.put("unisearchtxtboxlocator", "//div[@id='search']//input[@name='query']");
		  map.put("unibetsearchButton", "//div[@id='search']//input[@value='Search']");
		  map.put("unibetsearchresult", "//*[contains(text(),'results ')]");
		  map.put("specialcharacter1result", "//*[contains(text(),'About 947 results')]");
		  map.put("noresults","//*[contains(text(),'No Results')]");
		return map;
		
	}
	
	
}
