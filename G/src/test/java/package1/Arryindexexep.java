package package1;

public class Arryindexexep {
	
	public static void main(String[] args) {
		try {
		String[] name = new String[5];
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[5]);
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception.toString());
		}
		System.out.println("end");
	
	}

}
