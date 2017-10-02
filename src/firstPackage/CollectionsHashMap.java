package firstPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsHashMap {

	public static void main(String[] args) {
		
		Map<Integer, String> hp = new HashMap<Integer,String>();
		Collection<String> co = new ArrayList<>();
		Set<Map.Entry<Integer, String>> st = new HashSet<>();
		Set<Integer> stt = new HashSet<>();
		Map<Integer, String> hp2 = new HashMap<>(); 
		Map<Integer,String> hp3 = new HashMap<>();
		hp.put(1, "Red");
		hp.put(2, "Blue");
		hp.put(3, "Green");
		hp.put(4, "Brown");
		hp.put(5, "Pink");
		//************************
		hp2.put(1, "Red");
		hp2.put(2, "Blue");
		hp2.put(3, "Green");
		hp2.put(5, "Pink");
		hp2.put(6, "Black");
		//************************
		hp3.put(7, "One");
		hp3.put(8, "Two");
		hp3.put(9, "Three");
		hp3.put(10, "Four");
		hp3.put(11, "five");
		 
		
		System.out.println(hp.get(3));
		System.out.println("Key Check:"+hp.containsKey(5));
		hp.remove(4);
		System.out.println(hp.size());
		co = hp.values();
		System.out.println(co);
		//hp.clear();
		System.out.println("Value check: "+hp.containsValue("Pink"));
		st = hp.entrySet();
		System.out.println("Set Size :" + st.size());
		hp.put(6, "Black");
		System.out.println("New Size of set:"+st.size());
		System.out.println(hp.equals(hp2));
		System.out.println("Get or Default: "+hp.getOrDefault(7, "Cyan"));
		System.out.println("IsEmpty; "+hp.isEmpty());
		stt = hp.keySet();
		System.out.println("Set Keys: "+ stt);
		hp.putAll(hp3);
		System.out.println(hp);
		hp.remove(2);
		System.out.println(hp);
		hp.putIfAbsent(2, "Blue");
		System.out.println(hp);
		hp.replace(2, "Blue", "Maroon");
		System.out.println(hp);
		//hp.replaceAll(function);
		
		
		
		

	}

}
