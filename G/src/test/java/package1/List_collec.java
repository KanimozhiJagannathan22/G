package package1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//list //set

public class List_collec {
	
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>(); //list = doesn't allow duplicate
		Set<String> list = new HashSet<String>(); //set = allow the duplicate
		list.add("UFT");
		list.add("QTP");
		list.add("RFT");
		list.add("SELENIUM");
		list.add("LFT");
		list.add("SELENIUM"); // set - if allow duplicate
		
		
	System.out.println(list.isEmpty());	
	System.out.println(list.size());
	System.out.println(list);
	
	list.remove("UFT"); //remove
	System.out.println(list);
	
	
	}
	

}
