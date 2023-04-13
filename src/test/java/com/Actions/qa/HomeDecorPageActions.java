package com.Actions.qa;

import org.testng.Assert;

import com.AmzonUtility.qa.BaseClass;
import com.Locators.qa.HomeDecorPageLocator;

public class HomeDecorPageActions extends BaseClass {
	
	HomeDecorPageLocator homeDecorPageLocator= new HomeDecorPageLocator();

	public void verifyHomedecorpageisDisplayed() {
		boolean result=homeDecorPageLocator.verifyHMD.isDisplayed();
		Assert.assertTrue(result);
	}
	public void clickthebestseller() {
		homeDecorPageLocator.clickbestseller.click();
		
	}
	
	
	
}

