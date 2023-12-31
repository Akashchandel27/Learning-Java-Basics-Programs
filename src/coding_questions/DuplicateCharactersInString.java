package Progarm_practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void main(String[] args) {

		String s1 = "Test data";
		// findDuplicateCharacter("Test data");
		// findDuplicateCharacter(" Keerthana");

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		char[] charArray = s1.toCharArray();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		Set<Map.Entry <Character, Integer>> set = map.entrySet();
		System.out.println("Duplicate characters in a string " + s1 + ":");
		
		for (Map.Entry<Character, Integer> entry : set) {
			if (entry.getValue() > 1) {
		
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}

	}
}
