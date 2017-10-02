package firstPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionsList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		List<Integer> intlist = new ArrayList<Integer>();
		List<String> list2 = new ArrayList<String>();
		Object[] arr; 
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Brown");
		list.add("Red");
		list2.add("Purple");
		list2.add("Black");
		list2.add("Pink");
		System.out.println(list.get(0));
		System.out.println(list);
		System.out.println(list.size());
		
		intlist.add(2);
		intlist.add(5);
		intlist.add(8);
		
		list.addAll(list2);
		System.out.println(list.size());
		System.out.println(list);
		for(String s : list){
			System.out.print(s+" ");
		}
		System.out.println(list.contains("Pink"));
		System.out.println(list.equals(list2));
		System.out.println(list.containsAll(list2));
		System.out.println(list.hashCode());
		//list.forEach("Pink");
		Iterator<String> i = list.iterator();
		for(int j=0; j<list.size(); j++){
		 System.out.println("From Iterator :" + i.next());
		}
		i.remove();
		System.out.println(list);
        list.removeAll(list2);
        
        System.out.println(list);
        list.addAll(list2);
        System.out.println(list.lastIndexOf("Red"));
        System.out.println(list.indexOf("Red"));
        list.retainAll(list2);
        System.out.println(list);
        ListIterator<String> ls = list.listIterator(0);
        System.out.println("ListIter next:"+ls.next());
        System.out.println("ListIter next:"+ls.next());
        System.out.println("ListIter prev:"+ls.previous());
        System.out.println("ListIter prev:"+ls.previous());
        list.set(1, "Blue");
        System.out.println(list);
        list.sort(null);
        System.out.println(list);
        System.out.println(list.subList(0, 2));
        arr = list.toArray();
        for(int j=0; j<arr.length; j++){
        	System.out.println(arr[j]);
     
        }
        
        String intlsts = intlist.toString();
        System.out.println(intlsts);
        
        
	}

}
