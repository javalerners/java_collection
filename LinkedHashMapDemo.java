package MapDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
		
		lhm.put(1, "Rohini");
		lhm.put(2, "Vidhi");
		lhm.put(3, "Neha");
		lhm.put(0, null);
		lhm.put(4, "Swara");
		lhm.put(5, "Riya");
		
		for(Map.Entry<Integer, String> me:lhm.entrySet()) {
			
			System.out.println("Kay is : "+me.getKey()+ " Value is : "+me.getValue());
		}

	}

}
