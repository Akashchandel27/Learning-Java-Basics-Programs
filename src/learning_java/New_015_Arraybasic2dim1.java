package learning_java;

public class New_015_Arraybasic2dim1 {

	public static void main(String[] args) {
		
		String Str[][]= new String[3][4];
		Str[0][0] = "Selenium";
		Str[0][1] = "java";
		Str[0][2] ="python";
		Str[0][3] = "csharp";


		Str[1][0] = "Selenium";
		Str[1][1] = "python";
		Str[1][2] = "java";
		Str[1][3] = "python";

		Str[2][0] = "Selenium";
		Str[2][1] = "java";
		Str[2][2] = "peral";
		Str[2][3] = "flask";
		
		System.out.println("the numbers of rows are :-" + Str.length);
		System.out.println("the number of cols are :-" + Str[0].length);
		
		int rows = Str.length;
		int cols = Str[0].length;

		for (int a = 0; a < rows; a++) {
			for (int b = 0; b < cols; b++) {
				System.out.println(Str[a][b] + "");
			}
			System.out.println();
		}
	}
}


