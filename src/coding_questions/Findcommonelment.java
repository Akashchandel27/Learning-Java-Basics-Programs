package Progarm_practice;

import java.util.ArrayList;

public class Findcommonelment {

	public static void main(String[] args) {
		
		int[] arr1 = {4,8,12,16,20,24};
		int[] arr2 = {3,6,9,12,15,18,21,24};
		int[] arr3 = {};
		
		Object[] a;
		//ArrayList<Integer> arrayList=new ArrayList<>();
		Object arrayList;
		for(int i=0; i<arr1.length; i++) {
		for(int j=0; j<arr2.length; j++) {
		if(arr1[i]==arr2[j]) {
			ArrayList arrayList2 = new ArrayList();
			arrayList2.add(a[i]);
		break;
		}
		}
		
		for (int element : arrayList) {
		System.out.println(element);
		}
		}
		System.out.println("Common elements: ");
		FindCommonElementsInArray array=new FindCommonElementsInArray();
		array.findCommonElements(arr1, arr2);
		
}

}
