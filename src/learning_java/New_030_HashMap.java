package learning_java;

import java.util.HashMap;

public class New_030_HashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap();
		
		hm.put(1, "Jan");               // it will printed in the according to the number of sequence
		hm.put(4, "new");
		hm.put(2, "Feb");
		hm.put(3, "Mar");
	    hm.put(null, null);      // Allow only one null key
	    hm.put(null, null);     
	    hm.put(null,"india");      
	    hm.put(1, null);        // Allow only any number of null key
	    hm.put(2, null);
	    //hm.put(null, null);
	    

//		System.out.println(hm.get(1));
//		System.out.println(hm.get(2));
//		System.out.println(hm.get(3));
//		System.out.println(hm.get(4));
		//System.out.println(hm.get(null));
		
		System.out.println(hm); // It will printed in the sequence

	}

}
