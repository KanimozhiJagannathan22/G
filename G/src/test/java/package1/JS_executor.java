package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JS_executor {

	//javascript executor
	
	public static void main(String[] args) throws Exception {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://emicalculator.net/");
		
//		WebElement interestrate = driver.findElement(By.id("loaninterest"));
		
//		((JavascriptExecutor)driver).executeScript("argument[0].value='12.5'", interestrate);
		
	((JavascriptExecutor)driver).executeScript("document.getElementById('loaninterest').value='12.5';"); // another approach
//		copy id> open console beside the element > clear(); > documenttype.getelementbyid('loaninterest').value='12.5';>copy and 
//		paste here
		
//		interestrate.clear();
//		
//		interestrate.sendKeys("12.5");
//		
//		Actions action = new Actions(driver);
//		
//		action.sendKeys(interestrate, "12.5").perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
	
}
