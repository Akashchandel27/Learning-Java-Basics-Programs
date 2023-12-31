package Progarm_practice;

import java.util.ArrayList;

public class FindCommonElementsInArray {

	public void findCommonElements(int[] a, int[] b) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					arrayList.add(a[i]);
					break;
				}
			}
		}
		for (int element : arrayList) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 4, 8, 12, 16, 20, 24 };
		int[] arr2 = { 3, 6, 9, 12, 15, 18, 21, 24 };
		System.out.println("Common elements: ");
		FindCommonElementsInArray array = new FindCommonElementsInArray();
		array.findCommonElements(arr1, arr2);
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					arrayList.add(a[i]);
					break;
				}
			}
		}
		for (int element : arrayList) {
			System.out.println(element);
		}
	}
}
