package com.automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass23 {
	
	//loop statements  // for loop
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
//		int index = 1; //another approach, once we are familiar with this , we enter directly in for()
		
		for(int index = 1;index<=3;index ++) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println("browser executed");
		driver.quit();
//		index = index + 1;
		
	}
		System.out.println("end");

}
}
