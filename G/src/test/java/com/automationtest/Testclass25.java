package com.automationtest;

public class Testclass25 {
	
	//loop statements // for each  // over an array or collections  use for each
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		String[] names = new String[500];
		
         names[0] = "harry";
		
		names[499] ="dobby";
		
		for(String str:names) {   //for(String int:names) //for(String float:names)
			System.out.println(str);
		}
			
		
		
		System.out.println("end");
	}

}
