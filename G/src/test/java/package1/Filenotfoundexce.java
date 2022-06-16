package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Filenotfoundexce {
	

	public static void main(String[] args)  {
		
		try { // we can use try catch instead of interrupted or exception  
			Thread.sleep(2000);
			File file = new File("D:\\test.xlsx");
			FileInputStream inputstream = new FileInputStream(file); 
			//file not exception > click throw declaration
		}catch(Exception exception) {
			System.out.println(exception.toString());
		}
		System.out.println("end");
		
	}
}
