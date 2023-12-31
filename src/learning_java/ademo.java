package learning_java;

import java.util.HashMap;

public class ademo {
	
	public static void main(String[] args) {
		
		
		String s1="akash chandel akash is good";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		String strarry[] =s1.split(" ");
		
		for(String c: strarry) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}	
		}
		
		System.out.println(map);
		
	}

	
}
