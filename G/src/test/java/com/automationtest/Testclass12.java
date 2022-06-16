package com.automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass12 {
	
	//keyboard drop down selection
	
	public static void main(String[] args) throws Exception {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.apsrtconline.in/oprs-web/");
		
		WebElement textfrm = driver.findElement(By.id("fromPlaceName"));
		
		Actions action = new Actions(driver);
		
	   action.sendKeys(textfrm, "Hyderabad").perform();
	   
	   Thread.sleep(2000);
	   
	   action.sendKeys(Keys.ARROW_DOWN).perform();
	   
	   Thread.sleep(2000);
	   
	   action.sendKeys(Keys.ENTER).perform();
	   
	   Thread.sleep(2000);
	   
	   driver.close();
		
	}
	
	

}
