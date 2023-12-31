package learning_java;

public class New_015_Array4 {

	public static void main(String[] args) {

		// Declaration and Initialization of Multi Dimensional Array
		int a[][] = { { 1, 2, 3, 7 }, { 4, 5, 6, 0 }, { 7, 8, 9, 6 } };

		// Total Rows
		int row = a.length; // length is a property of an array
		System.out.println("Total Rows : " + row);

		// Total Columns
		int column = a[0].length;
		System.out.println("Total Column : " + column);

		// Print all data present in Multi Dimensional Array
		// Outer Loop
		for (int i = 0; i < row; i++) {

			// Inner Loop
			for (int j = 0; j < column; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();

		}

	}
}