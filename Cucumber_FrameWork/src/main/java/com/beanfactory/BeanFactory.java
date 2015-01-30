package com.beanfactory;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;


public class BeanFactory {

	

	public String emailRandomValuesGeneration( ){
		return	RandomStringUtils.randomAlphabetic(5).toLowerCase()+"@sivathota.com";
	    
	  }
	
	public static String randomUserGeneration(){
		return RandomStringUtils.randomAlphabetic(8);
		
	}

	public Map<String, String> dataMap(){
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("unibetSecurityQuestion", "The name of my first pet?");
		
		  String emailvalue= emailRandomValuesGeneration();
		  String username= randomUserGeneration();
		  map.put("unibetfirstName",randomUserGeneration());
		  map.put("unibetlastName",randomUserGeneration());
		  map.put("unibetuserName",username);
		  map.put("unibetpassword","testing@123");
		  map.put("unibetconfirm-password","testing@123");
		  map.put("unibetstreet","address");
		  map.put("unibetemail",emailvalue);
		  map.put("unibetpostalCode","lu13ny");
		  map.put("unibetcity","luton");
		  map.put("unibetday","22");
		  map.put("unibetmonth","July");
		  map.put("unibetyear", "1993");
		  map.put("unibetphoneNumber","9999999999");
		  map.put("unibetcity","lu13ny");
		  map.put("unisecurityanswer", "Test");
		  map.put("unisearchtxt", "Europa");
		  map.put("specialcharacter1","*");
		  map.put("invalidsearchtxt","Siva Thota");
		  
		return map;
		
}
	
	
}
