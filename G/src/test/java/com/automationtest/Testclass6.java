package com.automationtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass6 {
	
	public static void main(String[] args) {
		
//		get options , get all option, and option size, list webelement
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement cars = driver.findElement(By.id("cars"));
		
		Select select = new Select(cars);
		
        select.selectByValue("opel");
	    
	    select.selectByVisibleText("Audi");
	
		System.out.println(select.getOptions().size());
		
		System.out.println(select.getAllSelectedOptions().size());
		
 		List<WebElement> carlist = select.getAllSelectedOptions();
 		
 		for(WebElement element:carlist) {
 			System.out.println(element.getText());
 			
 		}
 		driver.close();
		
		
		
	}

}
