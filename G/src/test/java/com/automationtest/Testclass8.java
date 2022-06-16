package com.automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass8 {
	
//	frames
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
//		
//		driver.switchTo().frame("iframeResult");
//		
//		WebElement cars = driver.findElement(By.id("cars"));
//		
//		cars.sendKeys("volvo");
		
		driver.get("http://hamcrest.org/JavaHamcrest/javadoc/2.2/");
		
//		string frame
//		driver.switchTo().frame("packageListFrame");
		
//     	index frame
  	    driver.switchTo().frame(0); //1st table
		
		WebElement element = driver.findElement(By.linkText("org.hamcrest"));
		
		element.click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(1); //2nd table
		
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Matcher']"));
		
		element1.click();
		
        driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
        driver.switchTo().frame(2); //3rd table
		
		WebElement element3 = driver.findElement(By.linkText("AllOf"));
		
		element3.click();
		
        driver.switchTo().defaultContent();
        
//        driver.switchTo().parentFrame();  //switch to next frame but in default it move the 1st frame
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
	}

}
