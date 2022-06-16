package package1;

public class Employee {
	
//	encapsulation
	
		//private 
//	select private > right click click setter and getter
		private int id;
	    private char a;
		private double salary;
		
		
		public void setId(int id) {
			if(id<=0) {
				System.out.println("Invalid");
				System.exit(1);
			}else {
				this.id = id;
			}
			
		}
		
		public int getId() {
			return id;
		}
		
		
		public void setA(char a) {
			this.a = a;
		}
		

		public char getA() {
			return a;
		}
		
		public void setSalary(double salary) {
			this.salary = salary;
		}

	
		public double getSalary() {
			return salary;
		}

		
	
		
	

}
