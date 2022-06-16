package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	//youtube
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		WebElement search = driver.findElement(By.id("search-input"));
		
		Actions action = new Actions(driver);
		
		action.sendKeys(search, "bitch and boss").perform();
		
		Thread.sleep(2000);
		
		action.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(2000);
		
//		action.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(2000);
		
		action.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		WebElement song = driver.findElement(By.xpath("(//a[@class='yt-simple-endpoint style-scope ytd-video-renderer'])[1]"));
			
		song.click();
		
//		Actions action1 = new Actions(driver);
//		
//		Thread.sleep(2000);
//		
//		action1.click(song).perform();
//		
		Thread.sleep(2000);
		
//    	driver.close();
		
	}

}

