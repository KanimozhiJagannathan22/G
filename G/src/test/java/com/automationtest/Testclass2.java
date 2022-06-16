package com.automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass2 {
	
	// navigate, gettitle, getcurrenturl, get page source
	
	public static void main(String[] args) throws Exception {
		
      WebDriverManager.chromedriver().setup();
      
      WebDriver driver = new ChromeDriver();
      
      driver.manage().window().maximize();
      
      driver.get("https://www.thepancard.com/");
      
      System.out.println(driver.getTitle());
      
      System.out.println(driver.getCurrentUrl());
      
      System.out.println(driver.getPageSource());
      
      driver.navigate().forward();
      
      driver.navigate().back();
      
      driver.navigate().refresh();
      
      Thread.sleep(2000);
      
      driver.navigate().to("https://www.apsrtconline.in/oprs-web/");
      
		
	}

}
