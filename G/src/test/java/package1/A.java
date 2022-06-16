package package1;

public class A {
	
	//acess modifier
	// private[class]
	//default[package]
	//public[world]
	//protected[package+outside package[inheritance[subclass]]
	
	
//	public void m1() we can access any where even in package
  protected void m1() {  // if its in private we can't access in another class 
		System.out.println("m1");
	}
	
	public static void main(String[] args) {
		
		A a = new A();
	    a.m1();
	}
	

}
