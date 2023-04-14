package listDemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> number=new ArrayList<>();  // Array list maintain the insertion order.
		
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		number.add(7);
		number.add(1);   // array list allow the duplicate element.
		
		ListIterator<Integer> itr=number.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------@@@@------------------");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}	 
	}

}
