package package1;

public class Interfaimpl implements Interfa3{

	@Override
	public void k1() {
		System.out.println("Interfa1");
		
	}

	@Override
	public void k2() {
		System.out.println("Interfa2");
		
	}

	@Override
	public void k3() {
		System.out.println("Interfa3");
		
	}
	
	public static void main(String[] args) {
		Interfa3 I3 = new Interfaimpl();
		I3.k1();
		I3.k2();
		I3.k3();
	}
	
	

}
