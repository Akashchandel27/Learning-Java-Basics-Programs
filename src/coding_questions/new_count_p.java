package Progarm_practice;

import java.util.HashMap;

public class new_count_p {

	public static void main(String[] args) {
		
		String s1 ="chinu chinu chandel";
		
		HashMap<String, Integer>  maps = new HashMap<String, Integer>();
		String [] chinu = s1.split(" ");
		
		for(String s: chinu) {
			if(maps.containsKey(" ")) {
				maps.put(s, maps.get(s));
			}
			else {
				maps.put(s,1);
			}
		}
		
		System.out.println(maps);
	}
	

	
	
}