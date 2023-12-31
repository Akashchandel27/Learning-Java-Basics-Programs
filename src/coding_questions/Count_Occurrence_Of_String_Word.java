package Progarm_practice;

import java.util.HashMap;

public class Count_Occurrence_Of_String_Word {

	public static void main(String[] args) {
		String s1 = "Practice makes anyone perfect perfect";

		HashMap<String, Integer> map = new HashMap();

		String strArray[] = s1.split(" ");

		for (String s : strArray) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
				
			} else {
				map.put(s, 1);
				
			}
		}
		System.out.println(map);

	}
}
