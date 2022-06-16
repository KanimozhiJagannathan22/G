package com.automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass3 {
	
//	link test,get attribute, clear, sendkeys 
//	is enabled, is displayed, is selected
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.thepancard.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Apply New PAN Card")).click();
		
//		 WebElement apc = driver.findElement(By.linkText("Apply New PAN Card"));
		
//		 apc.click();
		
		
	driver.findElement(By.id("txtDOB")).sendKeys("22/12/2022");
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("txtDOB")).getAttribute("value"));
		
		driver.findElement(By.id("txtDOB")).clear();
		
		WebElement textbox = driver.findElement(By.id("txtDOB"));
//		
//		textbox.sendKeys("22/12/2022");
//		
//		textbox.getAttribute("value");
//		
//		textbox.clear();
		
		System.out.println(textbox.isEnabled());
		
		System.out.println(textbox.isDisplayed());
		
//		WebElement indvidualbtn = driver.findElement(By.id("rblCategory_0"));
		
		WebElement indvidualbtn = driver.findElement(By.id("rblCategory_1"));
		
		indvidualbtn.click();
	
		
		System.out.println(indvidualbtn.isSelected());
		
		Thread.sleep(2000);
		 
		driver.close();
	}

}
