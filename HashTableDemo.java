package MapDemo;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht=new Hashtable<>();
		
		ht.put(1, "Rohini");
		ht.put(2, "Vidhi");
		ht.put(3, "Neha");
		ht.put(4, "Swara");
		ht.put(5, "Riya");

		for (Map.Entry<Integer, String> me:ht.entrySet()) {
			
			System.out.println("Key is : "+me.getKey()+" Value is : "+me.getValue());
		}
	}

}
