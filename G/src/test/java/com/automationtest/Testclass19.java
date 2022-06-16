package com.automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass19 {
	
	//conditional statement //switch
	
	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		System.out.println("start");
		
//		String input = "dobby"; //invalid browser // 
		String input = "chrome";
		
		switch (input) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
			break;
			
        case "edge":
        	WebDriverManager.edgedriver().setup();
 		   driver = new EdgeDriver();
			break;
			
        default:
        	System.out.println("invalid browser");
        	System.exit(1);
        
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println("browser executed");
		driver.quit();
		
		System.out.println("end");
		
	}

}
