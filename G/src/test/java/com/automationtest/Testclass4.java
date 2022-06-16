package com.automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass4 {
	
//	is selected,
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.thepancard.com/");
		
		driver.findElement(By.linkText("Apply New PAN Card")).click();
		
		WebElement poi = driver.findElement(By.id("agreeproof"));
		
		System.out.println(poi.isSelected());
		
		poi.click();
		
		Thread.sleep(2000);
		
//		poi.click();
		
		WebElement pdob = driver.findElement(By.id("proof_dob"));
		
		Thread.sleep(2000);
		
		pdob.sendKeys("Passport");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
	}

}
