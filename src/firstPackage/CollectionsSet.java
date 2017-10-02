package firstPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSet {

	public static void main(String[] args) {
		
		Set<String> strset = new HashSet<>();
		Set<String> strset2 = new TreeSet<>();
		Object arr[];
		strset.add("One");
		strset.add("Two");
		strset.add("Three");
		strset.add("Four");
		strset.add("one");
		//*******************
		strset2.add("One");
		strset2.add("Two");
		strset2.add("Four");
		strset2.add("one");
		strset2.add("Three");
		System.out.println(strset);
		strset.remove("Three");
		System.out.println(strset.contains("Three"));
		System.out.println(strset);
		System.out.println(strset.containsAll(strset2));
		System.out.println(strset.equals(strset2));
		strset.addAll(strset2);
		System.out.println(strset);
		strset.isEmpty();
		strset.removeAll(strset2);
		System.out.println(strset);
		strset.addAll(strset2);
		arr = strset.toArray();
		System.out.println(arr[3]);
		Iterator<String> i = strset2.iterator();
		for(String s : strset){
			System.out.println("For each :" + s);
		}
		while(i.hasNext()){
		System.out.println("Iterator: "+i.next());
		}
		System.out.println(i.equals("Four"));
		
		

	}

}
