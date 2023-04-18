package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap<>();
		
		hm.put(1, "Rohini");
		hm.put(2, "Vidhi");
		hm.put(3, "Neha");
		hm.put(0, null);
		hm.put(4, "Swara");
		hm.put(5, "Riya");

		for(Map.Entry<Integer, String> me:hm.entrySet()) {
			
			System.out.println("Key is : "+me.getKey()+ " Value is : "+me.getValue());
		}
	}

}
