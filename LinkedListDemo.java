package listDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> studName=new LinkedList<>(); // LinkedList maintain the insertion order.
		
		studName.add("rohini"); // linked list allow the duplicate element.
		studName.add("vidhi");
		studName.add(" ");    //linked list allow the null element.
		studName.add("sai");
		studName.add("sandeep");
		studName.add("rohini");
		
		Iterator<String> itr=studName.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
	}

}
