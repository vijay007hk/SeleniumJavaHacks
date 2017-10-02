package firstPackage;

import java.util.Calendar;

public class CharAtIndexString {

	public static void main(String[] args) {
		
		String s = "This dog is a string dog";
		String sd = "The quick brown fox jumps over the lazy dog.";
		String s1 = "Thesarus";
		String s2 = "THERMAL";
		char c = s.charAt(6);
		int c2 = s.codePointAt(6);
		int c3 = s.codePointBefore(6);
		int numofcps = s.codePointCount(3, 8);
		char[] carr = {'a','f','x','h'};
		String builder = "";
		String msg = "Current date and Time :";
		
		int yr = Calendar.YEAR;
		int mnth = Calendar.MONTH;
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(numofcps);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s.contains("is a"));
		System.out.println(s1.contentEquals(s2));
		for(int o=0; o<carr.length; o++){
			
			builder = builder+carr[o];
		}
		System.out.println(builder);
		System.out.println(s.endsWith("string"));
		System.out.println("Date :" + yr + ", " + mnth);
		s1.getBytes();
		System.out.println(s1.getBytes()[3]);
		s2.toCharArray();
		System.out.println(s2.toCharArray()[3]);
		System.out.println(s1.hashCode());
		System.out.println(sd.indexOf('c'));
        System.out.println("Cannonical rep :"+sd.intern());
        System.out.println(sd.lastIndexOf("fox"));
        System.out.println(s.regionMatches(17, sd, 40, 3));
        System.out.println(msg.replace('d', 'f'));
        System.out.println(s.replaceAll("dog", "fox"));
        System.out.println(sd.startsWith("The"));
        System.out.println("Substring :" + sd.substring(4, 9));
        System.out.println(sd.toUpperCase());
        System.out.println(s.toLowerCase());
	}

}
