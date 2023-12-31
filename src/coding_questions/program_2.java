package Progarm_practice;

import java.util.HashMap;

public class program_2 {

	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<>();
		String s = "Keerthana";
		char charArray[] = s.toCharArray();
		char a[] = s.toCharArray();

		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);

	}
}
