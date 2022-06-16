package package1;

public class Runtime_poly extends Object{
	
	private int id;
	
	private String name;
	
	private double salary;
	
	public Runtime_poly(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + salary;
		
	}
	
	public static void main(String[] args) {
		Runtime_poly rp = new Runtime_poly(1111,"Harry", 29999);
		System.out.println(rp.toString()); //Object > Ctrl + click > ctrl + O > to string > then run
	}
	

}
