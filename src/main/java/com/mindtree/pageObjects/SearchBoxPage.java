package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIstore.SearchBoxPageLocators;

public class SearchBoxPage {
		
	       WebDriver driver = null;
	       
	       public SearchBoxPage(WebDriver driver)
	       {
	    	   this.driver = driver;
	       }
	       
	       public WebElement getSearchBox()
	       {
	    	   return driver.findElement(SearchBoxPageLocators.searchBox);
	       }
	      
}
