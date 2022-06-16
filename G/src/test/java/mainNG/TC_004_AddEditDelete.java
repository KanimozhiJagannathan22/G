package mainNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_004_AddEditDelete {
	
	private WebDriver driver = null;
	
	// Open Browser
    @BeforeTest
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
 // Login
    @BeforeMethod
    public void Login() {
 	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
 	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
 	driver.findElement(By.id("btnLogin")).click();
    }
 	
   @Test (priority=1)//(groups = {"Smoke","Regression"},description="") 
//                        <group>name ="regression"</group> if group is present
	public void addEmployee() throws Exception {
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
	

}
	@Test (priority=2) //,groups = {"Smoke"})
	public void editEmployee() throws Exception {
	// Edit Employee
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("SRIKRISHNA A");
	driver.findElement(By.id("searchBtn")).click();
	driver.findElement(By.linkText("SRIKRISHNA")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Edit']")).click();
	driver.findElement(By.xpath("//input[@value='Save']")).click();
	
}
	
	@Test (priority=3) //,groups = {"Regression"})
	public void deleteEmployee() throws Exception {
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
	
	}
	
	@AfterMethod
	public void Logout() {
		// Logout
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	@AfterTest
	public void CloseBrowser() throws Exception {
		// Close Browser
		Thread.sleep(2000);
		driver.quit();
	}
	

	

}
