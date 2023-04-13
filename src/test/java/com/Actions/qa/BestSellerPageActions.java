package com.Actions.qa;




import org.openqa.selenium.JavascriptExecutor;

import com.AmzonUtility.qa.BaseClass;
import com.Locators.qa.BestSellerPageLocator;

public class BestSellerPageActions extends BaseClass{
	BestSellerPageLocator bestSellerPageLocator= new BestSellerPageLocator();
	 
	public void scrolldowntothebestseller() {
		
		
		((JavascriptExecutor)driver).executeScript("scroll(0,600)");
		
				
		
	}
	public void clickvideoGameslick() {
		bestSellerPageLocator.videogamelink.click();
		
		
	}
	

}
