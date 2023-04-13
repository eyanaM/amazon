package com.Locators.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AmzonUtility.qa.BaseClass;

public class VideoGamesPageLocator extends BaseClass {
	

public VideoGamesPageLocator() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath = "//h1[text()='Best Sellers in Video Games']")
public WebElement verifyvideogames;
}
