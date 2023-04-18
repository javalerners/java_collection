package MapDemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm=new TreeMap<>();
		
		tm.put(1, "Rohini");
		tm.put(2, "Vidhi");
		tm.put(3, "Neha");
		tm.put(0, null);
		tm.put(4, "Swara");
		tm.put(5, "Riya");
		
		for(Map.Entry<Integer, String>me:tm.entrySet()) {
			
			System.out.println("Key is : "+me.getKey()+" Value is : "+me.getValue());
		}

	}

}
