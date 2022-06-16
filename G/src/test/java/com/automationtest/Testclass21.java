package com.automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass21 {
	
	//loop conditions //while
	
  public static void main(String[] args) {
	
	  System.out.println("start");
	  
////	  boolean status = false; // it will print just start and end because boolean status is false
//	  boolean status = true;
//	  //while loop
//	  while(status) {
//		  System.out.println("while loop");
//		  status = false; // true - it will print infinite time
//	  }
	  int index = 1;  
	 
String url ="https://www.google.co.in/";
  
  
  while(index<=3) { //number of time chrome browser will execute
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	  index = index + 1;
	  
  }
  
  System.out.println("end");
  }
}
  
  
  


