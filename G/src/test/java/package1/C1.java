package package1;

public class C1 extends B1{ // already we extend A1 in B1

	//java doesn't allowed multi level inheritance through classes
	
	public void n3() {
		System.out.println("n3");
	}
	
	public static void main(String[] args) {
		 C1 c1 = new C1();
		 c1.n1();
		 c1.n2();
		 c1.n3();
		 
	}
}
