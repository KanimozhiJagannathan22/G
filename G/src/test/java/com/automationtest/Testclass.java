package com.automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass {
	
	public static void main(String[] args) throws InterruptedException {
		
//		id,xpath
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.apsrtconline.in/oprs-web/");
		
//	    driver.findElement(By.id("searchBtn")).click();
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
//		WebElement sb = driver.findElement(By.id("searchBtn"));
//		sb.click();
	    Thread.sleep(2000);
	    
	    driver.quit();
	    
	    
		
			
		
		
	}

}
