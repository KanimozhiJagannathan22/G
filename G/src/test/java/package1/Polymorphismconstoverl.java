package package1;

public class Polymorphismconstoverl {
	
		//constructor over loading
	
	private int index;
	
	public Polymorphismconstoverl() {
		index = 0;
	}
	
	public Polymorphismconstoverl(int indx) {
		index = indx;
	}
	
	public Polymorphismconstoverl(double indx) {
		index = (int)indx; //(int)indx type casting
	}
	
	public void display() {
		System.out.println("index"+index);
		
	}
	
	public static void main(String[] args) {
		
		Polymorphismconstoverl p = new Polymorphismconstoverl();
		p.display();
	}

}
