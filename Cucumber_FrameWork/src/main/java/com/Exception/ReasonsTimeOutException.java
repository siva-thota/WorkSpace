package com.Exception;

import org.openqa.selenium.TimeoutException;

public class ReasonsTimeOutException extends TimeoutException{

	/**
	 * @param args
	 */
	
	public ReasonsTimeOutException(String message) {
		 super(message);
	}

	private String createMessage(String originalMessageString) {
		return "";
	   	  }

	  public String getSystemInformation() {
		  return ""; 
	  }
	
	  public String toString() {
		    return "";
		  }
	  
}
