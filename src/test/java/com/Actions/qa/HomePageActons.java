package com.Actions.qa;

import com.AmzonUtility.qa.BaseClass;
import com.Locators.qa.HomePageLocator;

public class HomePageActons extends BaseClass{
	HomePageLocator homePageLocator= new HomePageLocator();
	
	public void enterHomedecoronseachfield() {
		homePageLocator.searchHmd.sendKeys("Homedecor");
	}
 public void clicksearchbutton() {
	 homePageLocator.clicksearch.click();
 }
}
