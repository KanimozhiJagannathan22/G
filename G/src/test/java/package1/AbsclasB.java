package package1;

public class AbsclasB extends AbsclsA{

	@Override
	void m2() {
		System.out.println("m2");
		
	}
	
	public static void main(String[] args) {
		
		AbsclsA A = new AbsclasB();
		A.m1();
		A.m2();
	}

}
