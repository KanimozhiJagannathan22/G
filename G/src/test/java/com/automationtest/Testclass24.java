package com.automationtest;

public class Testclass24 {
	
	//loop statement  //for loop  //fixed num of time use for loop
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		String[] employeenames = new String[500];
		
		employeenames[0] = "harry";
		
		employeenames[499] ="dobby";
		
//		System.out.println(employeenames[0]);
//		System.out.println(employeenames[499]);
		
//		int index =0;
//		for(;index<=499;) {
//			System.out.println(employeenames[index]);
//			index ++;
//		}
		
		for(int index = 0; index<=499; index ++) {
			System.out.println(employeenames[index]);
		}
		
		System.out.println("end");
	}

}
