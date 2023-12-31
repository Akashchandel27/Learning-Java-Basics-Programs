package Progarm_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class program_1 {

	public static void main(String[] args) {

		String input = "The more you give, the more you get";
		HashMap<String, Integer> result = findDuplicateWords(input);
		System.out.println(result);
	}

	public static HashMap<String, Integer> findDuplicateWords(String s) {
		String str = s.toLowerCase();
		if (str == null || str.isEmpty()) {
			throw new IllegalArgumentException("String cannot be null or empty");
		}
		HashMap<String, Integer> map = new HashMap<>();
		String[] strArray = str.split(" ");
		for (String string : strArray) {
			if (map.containsKey(string)) {
				map.put(string, map.get(string) + 1);
			} else {
				map.put(string, 1);
			}
		}
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		System.out.println("Duplicate characters in a string " + str + ":");
		HashMap<String, Integer> duplicate = new HashMap<>();
		for (Map.Entry<String, Integer> entry : set) {
			if (entry.getValue() > 1) {
				duplicate.put(entry.getKey(), entry.getValue());
			}
		}
		return duplicate;
	}
}