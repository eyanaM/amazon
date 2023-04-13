package com.Locators.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AmzonUtility.qa.BaseClass;

public class HomeDecorPageLocator extends BaseClass{
	
	public HomeDecorPageLocator() {
		 PageFactory.initElements(driver, this);
		 
			
	}
 @FindBy(xpath = "//span[text()='Shop unique Handmade items']")
 public WebElement verifyHMD;
 
 @FindBy(linkText = "Best Sellers")
 public WebElement clickbestseller;
	
}
