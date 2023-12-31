package learning_java;

import java.util.Scanner;

public class New_043_userinput {

	public static void main(String[] args) {
		
		System.out.println("Enter the user namme, age and salary");
		
		Scanner myobj = new Scanner(System.in);
		
		String name= myobj.nextLine();
		
		int age = myobj.nextInt();
		
		double salary = myobj.nextDouble();
		
		System.out.println("name is " +name +age +salary);
		
		myobj.close();

	}

}
