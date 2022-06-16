package com.automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass11 {
	
//	keyboard actions //page down page up
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/");
		
		Actions action = new Actions(driver);
		
		// one page down action result ends to page end, if user want scroll down feet by feet use 
//		   two page down
		
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		Thread.sleep(2000);
		
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		Thread.sleep(2000);
		
		action.sendKeys(Keys.PAGE_UP).perform();
		
		Thread.sleep(2000);
		
		action.sendKeys(Keys.PAGE_UP).perform();
		
		Thread.sleep(2000);
		
		action.sendKeys(Keys.END).perform();
		
		Thread.sleep(2000);
		
		action.sendKeys(Keys.HOME).perform();
		
	    Thread.sleep(2000);
		
		// keyboard select 
		
	    driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	    
	    driver.switchTo().frame("iframeResult");
	    
	    Actions action1 = new Actions(driver);
	    
	    action1.keyDown(Keys.CONTROL).perform();
	    
	    WebElement optvolvo = driver.findElement(By.xpath("//option[@value='volvo']"));
	    
	    action1.click(optvolvo).perform();
	    
	    Thread.sleep(2000);
	    
	    WebElement optaudi = driver.findElement(By.xpath("//option[@value='audi']"));
	    
	    action1.click(optaudi).perform();
	    
	    action1.keyUp(Keys.CONTROL).perform();
	    
	    Thread.sleep(2000);
	   
		driver.close();
	    
	}

}
