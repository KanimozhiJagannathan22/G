package com.automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass18 {
	
	//condition statement //if elseif
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		WebDriver driver = null;
		String input = "chrome";
		
		if(input.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
			
		}else if(input.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
			
		}else if(input.equals("edge")) {
			WebDriverManager.edgedriver().setup();
		   driver = new EdgeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println("browser executed");
		
		System.out.println("end");
		
	}


}
