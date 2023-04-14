package SetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) { //hash set uses hashing technique to maintain uniqueness.
		// TODO Auto-generated method stub
		HashSet<String> studName=new HashSet<>();  //hash set does not maintain any insertion order.
		
		studName.add("rohini"); //hash set does not allow any duplicate element.
		studName.add(" ");       // hash set allow null element.
		studName.add("vidhi");
		studName.add("sai");
		studName.add("rohini");  
		
		Iterator<String> itr=studName.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}
