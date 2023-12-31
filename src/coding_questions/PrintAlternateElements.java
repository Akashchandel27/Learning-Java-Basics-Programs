package Progarm_practice;

public class PrintAlternateElements {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 6, 10, 9, 15 };
		//int n = arr.length;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
