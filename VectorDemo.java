package listDemo;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> dept=new Vector<>(); // vector maintain insertion order.
		
		dept.add("arts");
		dept.add("commerce");
		dept.add(" ");			//vector allow null element 	
		dept.add("science");
		dept.add("arts");  //vector allow duplicate element
		
		Iterator<String> itr=dept.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

}
