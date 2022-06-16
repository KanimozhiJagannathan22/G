package com.automationtest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass13 {
	
//	screenshot
	
	public static void main(String[] args) throws Exception {
		
		   WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://datatables.net/");
			
			Actions action = new Actions(driver);
			
			action.sendKeys(Keys.PAGE_DOWN).perform();
			
			Thread.sleep(5000);
			
			WebElement table = driver.findElement(By.id("example"));
			
//			File src = (TakeScreenshot)driver)getScreenshotAs(OutputType.FILE);
//			it will take ss entire tab
			
			File src = table.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("D:\\Image.jpg");
			
			FileHandler.copy(src, dest);
			
			driver.close();
			
			
			
			
		
	}

}
