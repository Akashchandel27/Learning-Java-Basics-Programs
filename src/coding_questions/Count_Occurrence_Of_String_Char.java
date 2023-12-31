package Progarm_practice;

import java.util.*;

public class Count_Occurrence_Of_String_Char {

	public static void main(String[] args) {
		String s1 = "akash chandel";
				
		HashMap<Character, Integer> map = new HashMap();

		char charArray[] = s1.toCharArray();

		for (char c : charArray) {

			if (map.containsKey(c)) {
				//System.out.println("1 line :" + c);// 3.

				map.put(c, map.get(c) + 1);
				//System.out.println("2 line :" + c);
			} else {
				map.put(c, 1);

				//System.out.println("3 line :" + c); // 1. a //2. k
			}
		}
		System.out.println(map);
	}
}
