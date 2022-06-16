package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Syncho_Impliwait {
	
	//implicit wait
	//explicit wait
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
		
//		visibility - wait.until(Expectedconditions.VisibilityOfElementLocated(By.id("email");
//		Element is present but not visible or clickable
//		wait.until(Expectedconditions.elementToBeClickable(By.id("email");
		
		driver.manage().window().maximize();
		
		driver.get("https://my.microfocus.com/");
		
		driver.findElement(By.partialLinkText("Login")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//explicit wait
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		
		driver.findElement(By.id("username")).sendKeys("harry");
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
