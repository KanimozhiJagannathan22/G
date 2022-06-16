package com.automationtest;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass9 {
	
	//actions // click  //double click  //drag and drop   //click and hold   //release
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
/////   click   //////		
		
//		driver.get("https://www.timesjobs.com/");
//		
//		Thread.sleep(5000);
//		
//		WebElement uploadbtn = driver.findElement(By.id("resumeFile_basic"));
//		
//		Actions action = new Actions(driver);
//		
//		action.click(uploadbtn).perform();  //click
		
		
		
/////		double click   /////
		
//		driver.get("https://api.jquery.com/dblclick/");
		
//		driver.switchTo().frame(0);
//		
//		WebElement dblclick = driver.findElement(By.tagName("div"));
//		
//		Actions action = new Actions(driver);
//		
//		action.click(dblclick).perform();
//		
//		Thread.sleep(5000);
//		
//		driver.close();
		
/////    drag and drop  ///////	
		
//		driver.get("https://jqueryui.com/droppable/");
//		
//		driver.switchTo().frame(0);
//		
//		WebElement drag = driver.findElement(By.id("draggable"));
//		
//		WebElement drop = driver.findElement(By.id("droppable"));
//		
//		Actions action = new Actions(driver);
//		
//		action.dragAndDrop(drag, drop).perform();
//		
//		driver.close();
		
////  drag hold and release   ///////
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(drag).perform();
		
		Thread.sleep(2000);
		
		action.release(drop).perform();
		
//		action.clickAndHold(drag).release(drop).perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
	
		
		
		
		
		
	}

}
