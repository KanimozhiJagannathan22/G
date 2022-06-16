package package1;

public class EmployeeTest {
	
	//encapsulation
	
	public static void main(String[] args) {
		
       Employee e = new Employee();
       
       e.setId(-1111);
//       e.id = 12343;
       
       e.setA('H');
//       e.a = 'H';
       
       e.setSalary(23457);
//       e.salary = 23457;
       
       System.out.println(e.getId());
//       System.out.println(e.id);
       
       System.out.println(e.getA());
//       System.out.println(e.a);
       
       System.out.println(e.getSalary());
//       System.out.println(e.salary);
       
       
       
       
       
       
		
	}

}
