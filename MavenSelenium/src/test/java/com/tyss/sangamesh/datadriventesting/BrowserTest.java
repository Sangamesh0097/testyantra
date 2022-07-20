package com.tyss.sangamesh.datadriventesting;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	public void browser() {
		
		WebDriver driver=null;
		
		String URL = System.getProperty("url");
	    String BROWSER = System.getProperty("browser");
	    
		
		//Execute chrome browser
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver=WebDriverManager.chromedriver().create();
		}
		
		//Execute firefox browser
		else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver=WebDriverManager.firefoxdriver().create();
		}
		
		//Execute MSEdge browser
		else if (BROWSER.equalsIgnoreCase("edge")) {
			driver=WebDriverManager.edgedriver().create();
		}
		
	}
	
	

}