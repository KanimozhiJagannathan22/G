package mainNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_003_DeleteEmployee {
	@Test
	public void deleteEmployee() throws Exception {
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
	// Delete Employee
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("SRIKRISHNA A");
	driver.findElement(By.id("searchBtn")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("ohrmList_chkSelectAll")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("btnDelete")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("dialogDeleteBtn")).click();
	// Logout
	driver.findElement(By.id("welcome")).click();
	driver.findElement(By.linkText("Logout")).click();
	// Close Browser
	Thread.sleep(2000);
	driver.quit();
	}
	
}
