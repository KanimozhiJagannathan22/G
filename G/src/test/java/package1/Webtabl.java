package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//webtables

public class Webtabl {
	
	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		System.out.println("Table size :" + driver.findElements(By.xpath("//table")).size());
		
		System.out.println("Table row :" + driver.findElements(By.xpath("//table[@id='example']//tr")).size());
		
		System.out.println("Table body row :" + driver.findElements(By.xpath("//table[@id='example']//tbody//tr")).size());
		
		System.out.println("Table head :" + driver.findElements(By.xpath("//table[@id='example']//thead//th")).size());
		
		System.out.println("Table head (index) :" + driver.findElements(By.xpath("(//table[@id='example']//tr)[1]//th")).size());
		
		WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
		
		System.out.println(table.getText());
		
		WebElement specificrow = driver.findElement(By.xpath("(//table[@id='example']//tr)[5]"));
		
		System.out.println(specificrow.getText());
		
		WebElement rowcol = driver.findElement(By.xpath("(//table[@id='example']//tr)[5]//td[4]"));
		
		System.out.println(rowcol.getText());
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}

}
