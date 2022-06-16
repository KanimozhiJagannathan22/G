package dmslite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homepage {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://winserv2012.datafabricx.com/DFXDMSLite/DFXWebApp/Home/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("DMS")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='nav-link'])[4]")).click();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.id("dashboardListBtn")).click();
//		
//		Thread.sleep(2000);
		
//		driver.findElement(By.id("addDashboard")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("dashboardName")).sendKeys("Test");
//		
//		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		driver.findElement(By.id("addWidgetBtn")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("countWidgetTextSample")).sendKeys("Today's Document");
		
		Thread.sleep(2000);
		
    	driver.findElement(By.id("countWidgetDescSample")).sendKeys("Sample");
    	
    	Thread.sleep(2000);
    	
        WebElement cache = driver.findElement(By.id("countInternalSample"));
        
//        cache.click();
//		
//     	((JavascriptExecutor)driver).executeScript("argument[0].value='30'", cache); 
        
        cache.clear();
	
		cache.sendKeys("30");
		
//     	Actions action = new Actions(driver);
//	
//     	action.sendKeys(cache, "30").perform();
    	
    	Thread.sleep(2000);
		
    	driver.findElement(By.id("countQuery")).click();
    	
    	Thread.sleep(2000);
		
		WebElement srccriteria = driver.findElement(By.xpath("//span[@role='combobox']"));
		
		Actions action1 = new Actions(driver);
		
		action1.sendKeys(srccriteria, "date");
		
		action1.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("//button[@class='btn btn-default mr-1']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-default save-query-img']")).click();
		
		
		driver.findElement(By.xpath("btn btn-primary mr-1")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}

}

