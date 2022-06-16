  package com.automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass10 {
	
//	move to element
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.dtdc.in/");
		
		WebElement mve2ele = driver.findElement(By.linkText("Tracking"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(mve2ele).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("E-Tracker")).click();
		
// 		context click
		
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement contextclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action1 = new Actions(driver);
		
		action1.contextClick(contextclick).perform();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElement(By.tagName("span"));
		
		Actions action2 = new Actions(driver);
		
		action2.dragAndDropBy(slider, 100, 0).perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
				
				
		
	}

}
