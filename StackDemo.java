package listDemo;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Stack<String> city=new Stack<>(); //to add new element use push(); method.
		
		city.push("nashik");  //stack maintain the insertion order.
		city.push(" ");       //stack allow the null value.
		city.push("pune");
		city.push("nashik"); //stack allow duplicate element. 
		city.push("mumbai");
		
		
		city.pop();    //to remove element use pop(); method.
		
		Iterator<String>itr=city.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
