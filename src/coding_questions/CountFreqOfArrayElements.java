package Progarm_practice;

import java.util.HashMap;

public class CountFreqOfArrayElements {

	public static void main(String[] args) {
		int[] arr = { 5, 10, 15, 20, 10, 15 };
		//int n = arr.length;

		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}

		}
		System.out.println(map);

	}

}
