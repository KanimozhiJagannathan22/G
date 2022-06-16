package com.automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass22 {
	
	//loop conditions // do while
	
	public static void main(String[] args) {
		
    System.out.println("Start");
		
		String input = "chrome";
		
		do { //do  // even a false case also want to execute use do whilr
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println("browser executed");
		driver.quit();
		}while(input.equals("firefox")); //while
		
		System.out.println("end");
	
	}
	
	

}
