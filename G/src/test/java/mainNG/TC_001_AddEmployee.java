package mainNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_AddEmployee {
	
		@Test
		public void addEmployee() throws Exception {
		// Open Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		// Login
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		// Add Employee
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("SRIKRISHNA");
		driver.findElement(By.id("lastName")).sendKeys("A");
		String id = driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println("Employee ID:" + id);
		driver.findElement(By.id("btnSave")).click();
		// Logout
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		// Close Browser
		Thread.sleep(2000);
		driver.quit();

}
}
