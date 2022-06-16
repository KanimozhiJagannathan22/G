package com.automationtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass7 {
	
	// alert 
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete14/dialogs/#");
		
		driver.findElement(By.linkText("Show Alert")).click();
		
	    Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		driver.findElement(By.linkText("Show Prompt")).click();
		
		System.out.println(alert.getText());
		
		alert.sendKeys("Howarts");
		
		alert.accept();
		
		driver.close();
		
		
	}

}
