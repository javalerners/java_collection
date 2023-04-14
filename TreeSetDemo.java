package SetDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<>(); //tree set always maintain the element in ascending order.
		
		ts.add("apple");
		ts.add("cat");
		ts.add(" ");  //tree set allow the null value in tree set but does not allow in tree map.
		ts.add("pink");
		ts.add("black");
		ts.add("zebra");
		ts.add("apple"); // tree set does not allow duplicate value.
		
		Iterator<String> itr=ts.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
				
				
	}

}
