package com.AmazonRunner.qa;




import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.AmzonUtility.qa.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


 @CucumberOptions(features = {"src/test/resources/amazonFeatures"},
 plugin = {"json:target/cucumber.json"},
  glue = "AmazonStepDeff",tags = {"@test"})



public class testRunnerClass extends AbstractTestNGCucumberTests{

	 @BeforeTest
		public void startURL() {
		 BaseClass test= new BaseClass();
			test.initBrowser();
		}
		
		@AfterTest
		public void closedURL() {
			BaseClass test=  new BaseClass();
			test.driver.quit();
		}
	  
	
}
	
	


