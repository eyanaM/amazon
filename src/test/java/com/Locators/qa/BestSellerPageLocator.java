package com.Locators.qa;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AmzonUtility.qa.BaseClass;

public class BestSellerPageLocator extends BaseClass{
	
 public BestSellerPageLocator() {
	 
	 
	 PageFactory.initElements(driver, this);
}
 @FindBy(linkText = "Video Games")
 public WebElement videogamelink;
 
 
}
