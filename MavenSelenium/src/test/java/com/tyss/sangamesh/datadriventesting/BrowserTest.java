package com.tyss.sangamesh.datadriventesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	@Test
	public void browserTest() {
		
		WebDriver driver=null;
		
		String URL = System.getProperty("url");
	    String BROWSER = System.getProperty("browser");
		
		//cross verify the browser version
	    
		
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
		
		System.out.println("hiiiiiiii");
		
	}
	


}
