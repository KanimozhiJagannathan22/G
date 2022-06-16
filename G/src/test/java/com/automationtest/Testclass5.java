package com.automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass5 {
	
//	is select, is deselect and multiple
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://electoralsearch.in/");
//		
//		driver.findElement(By.id("continue")).click();
//		
//	    WebElement ss = driver.findElement(By.id("nameStateList"));
//	    
//	    //for multi select purpose
//	    
//	    Select select = new Select(ss);
//	    
//	    System.out.println(select.isMultiple());
	    
	    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	    
	    driver.switchTo().frame("iframeResult");
	    
	    WebElement cars = driver.findElement(By.id("cars"));
	    
	    Select select1 = new Select(cars);
	    
//	    cars.sendKeys("Volvo");
//	    
//	    cars.sendKeys("Opel");
	    
	    //select by
	    
	    select1.selectByIndex(1);
	    
	    select1.selectByValue("opel");
	    
	    select1.selectByVisibleText("Audi");
	    
	    //deselect by
	    
//	    select1.deselectByIndex(1);
//	    
//	    select1.deselectByValue("opel");
//	    
//	    select1.deselectByVisibleText("Audi");
//	    
     select1.deselectAll();
        
//        System.out.println(select1.getAllSelectedOptions().size());
	    
	    Thread.sleep(2000);
	    
	    Thread.sleep(2000);
	    
	    driver.close();
	    
	}

}
