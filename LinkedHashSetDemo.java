package SetDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> ls=new LinkedHashSet<>(); //linked hash set maintain insertion order.
		
		ls.add("rohini");  //linked hash set does not allow duplicate element.
		ls.add("sandeep");
		ls.add(" ");	// linked hash set allow null element.
		ls.add("vidhi");
		ls.add("rohini");
		
		Iterator<String> itr=ls.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

}
