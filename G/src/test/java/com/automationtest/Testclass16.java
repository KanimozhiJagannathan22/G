package com.automationtest;

public class Testclass16 {
	
	// 2d array
	
	public static void main(String[] args) {
		 
		String[][] data = new String[2][3];
		
		System.out.println(data.length);
		System.out.println(data[0].length);
		
		data[0][0] = "Test";
		data[0][1] = "class";
		data[0][2] = "type";  //0 2
		
		System.out.println(data[0][0]);
		System.out.println(data[0][1]);
		System.out.println(data[1][2]); //1 2
		
	}

}
