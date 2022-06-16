package package1;

public class Polymethodoverl {
	
	public static void display() { //method
		System.out.println("Hello");
	}
	
	public static void display(String firstname) { //method
		System.out.println("Hello" + firstname);
	}
	
	public static void display(String firstname,String lastname) { //method
		System.out.println("Hello" + firstname+" "+lastname);
	}
	
	public static void main(String[] args) {
		Polymethodoverl.display("harry","potter");
	}

}
