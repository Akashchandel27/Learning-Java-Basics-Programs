package learning_java;

import java.util.HashMap;
import java.util.Hashtable;

public class New_030_HashTable {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hm = new Hashtable<Integer, String> ();
		hm.put(1, "Jan");               // it will printed in the according to the number of sequence
		hm.put(4, "new");
		hm.put(10,"newew");
		hm.put(2, "Feb");
		hm.put(3, "Mar");
		    
	   // hm.put(null, null); 

//		System.out.println(hm.get(1));
//		System.out.println(hm.get(2));
//		System.out.println(hm.get(3));
//		System.out.println(hm.get(4));
		
		System.out.println(hm); // It will printed in the sequence
	}

}
