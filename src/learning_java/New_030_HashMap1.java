package learning_java;

import java.util.HashMap;

public class New_030_HashMap1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Jan",1);  // it will printed in the according to the number of sequence
		hm.put("new",2);  // priority will be high for small alphabet 
		hm.put("aaaaa",5);
		hm.put("Feb",3);
		hm.put("Mar",4);

//		System.out.println(hm.get("new"));
//		System.out.println(hm.get(2));
//		System.out.println(hm.get(3));
//		System.out.println(hm.get(4));
		
		System.out.println(hm); // It will printed in the sequence
	}

}
