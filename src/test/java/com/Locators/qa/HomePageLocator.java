package com.Locators.qa;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AmzonUtility.qa.BaseClass;

public class HomePageLocator extends BaseClass{
	
	
 public HomePageLocator() {
	 PageFactory.initElements(driver, this);
	   
	
}
 @FindBy(id = "twotabsearchtextbox")
 public WebElement searchHmd;
 
 @FindBy(id = "nav-search-submit-button")
 public WebElement clicksearch;
 
 
}
