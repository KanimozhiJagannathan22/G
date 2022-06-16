package package2;

import package1.A;

//access modifier

public class C extends A{
	
	public static void main(String[] args) {
		
		C c = new C();
		c.m1();
		
//		A a = new A(); if A is in public we can call it from package A directly
//		a.m1();
		

	}

}
