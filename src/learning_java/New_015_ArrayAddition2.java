package learning_java;

import java.util.Scanner;

public class New_015_ArrayAddition2 {

	int matrix3 [][] = new int[2][2];
	int matrix1 [][] = new int[2][2];
	int matrix2 [][] = new int[2][2];
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter The Number Of Matrix1 Rows");

		int matrixRow1 = scan.nextInt();

		System.out.println("Enter The Number Of Matrix Columns1");

		int matrixCol1 = scan.nextInt();

		// defining 2D array to hold matrix data
		int[][] matrix1 = new int[matrixRow1][matrixCol1];
		
		// Enter Matrix Data
		enterMatrixData1(scan, matrix1, matrixRow1, matrixCol1);

		// Print Matrix Data
		printMatrix1(matrix1, matrixRow1, matrixCol1);
		
		// for the matrix -2
		System.out.println("Enter The Number Of Matrix2 Rows");

		int matrixRow2 = scan.nextInt();

		System.out.println("Enter The Number Of Matrix Columns2");

		int matrixCol2 = scan.nextInt();

		// defining 2D array to hold matrix data
		int[][] matrix2 = new int[matrixRow2][matrixCol2];
		
		// Enter Matrix Data
		enterMatrixData1(scan, matrix2, matrixRow2, matrixCol2);

		// Print Matrix Data
		printMatrix1(matrix2, matrixRow2, matrixCol2);
	}

	
	public static void enterMatrixData1(Scanner scan, int[][] matrix1, int matrixRow1, int matrixCol1) {
		System.out.println("Enter Matrix1 Data");

		for (int i = 0; i < matrixRow1; i++) {
			for (int j = 0; j < matrixCol1; j++) {
				matrix1[i][j] = scan.nextInt();
			}
		}
	}

	public static void printMatrix1(int[][] matrix1, int matrixRow1, int matrixCol1) {
		System.out.println("Your Matrix1 is : ");

		for (int i = 0; i < matrixRow1; i++) {
			for (int j = 0; j < matrixCol1; j++) {
				System.out.print(matrix1[i][j] + "\t");
			}

			System.out.println();
		}
	}
	
	


public static void enterMatrixData2(Scanner scan, int[][] matrix2, int matrixRow2, int matrixCol2) {
	System.out.println("Enter Matrix2 Data");

	for (int i = 0; i < matrixRow2; i++) {
		for (int j = 0; j < matrixCol2; j++) {
			matrix2[i][j] = scan.nextInt();
		}
	}
}

public static void printMatrix(int[][] matrix2, int matrixRow2, int matrixCol2) {
	System.out.println("Your Matrix2 is : ");

	for (int i = 0; i < matrixRow2; i++) {
		for (int j = 0; j < matrixCol2; j++) {
			System.out.print(matrix2[i][j] + "\t");
		}

		System.out.println();
	}
}

{
	
for (int i = 0; i <=2; i++) {
	
	for (int j = 0; j <=2; j++) {
		
		matrix3[i][j] = matrix1[i][j] + matrix2[i][j]; // use - for subtraction
		System.out.print(matrix3[i][j] + " ");
	}
	System.out.println();// new line
	


}
}
}
