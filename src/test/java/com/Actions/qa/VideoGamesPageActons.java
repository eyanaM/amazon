package com.Actions.qa;

import org.testng.Assert;

import com.AmzonUtility.qa.BaseClass;
import com.Locators.qa.VideoGamesPageLocator;

public class VideoGamesPageActons extends BaseClass {
	
	VideoGamesPageLocator videoGamesPageLocator= new VideoGamesPageLocator();
	
	public void VesrifyVideoGamespageisdisplay(){
		
		boolean result=videoGamesPageLocator.verifyvideogames.isDisplayed();
		Assert.assertTrue(result);
		
		
	}

}
