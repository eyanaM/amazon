package com.AmzonUtility.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	
	public  BaseClass() {
		try {
			FileInputStream fls= new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\Amzonconfig\\qa\\AmazonConfiq.properties");
			prop= new Properties();
			prop.load(fls);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}  
	public void initBrowser() {
		
		String BrowserSet= prop.getProperty("Browser1");
		
		 if(BrowserSet.equals("ChromeDriver")){
			 
			 //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
			 //driver= new ChromeDriver();
			 System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+ "\\EdgeDriver\\msedgedriver.exe");
			 driver= new EdgeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestData.implicitlyWait));
			 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestData.pageloadTimeWait));
	 
			 
			 
		 }
		 else if(BrowserSet.equals("FireFox")) {
			 
			 
			 
		 } else {
			 System.out.println("something went wrong=========================================================================================");
		 }
		 }
		
	public static void launchURL (String URL)	{
		driver.get(prop.getProperty("URL"));
		
		
		
	
		 
		 
	}
	
	
	
	
	
	
	
}
	
	
	