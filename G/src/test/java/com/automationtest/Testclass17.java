package com.automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass17 {
	 
	//condition statement  //if //if else
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		String input = "chrome";
		
//		normal output
//		if(input.equals("chrome")){
//			System.out.println("brower executed");
//			
//		}
		
//		selenium output
		
		if(input.equals("firefox")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			System.out.println("browser executed");
			
		}else {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			System.out.println("browser executed");
			driver.close();
			
		}
		
		System.out.println("end");
		
	}

}
