package learning_java;

public class New_016_MethodsAnimals_itntialize_object {

	    String color;
		int age;
		int roll;
		String z;

		public static void main(String[] args) {

		New_016_MethodsAnimals_itntialize_object romeo = new New_016_MethodsAnimals_itntialize_object(); // reference variable
		romeo.inti_object("inid", 3);
		romeo.display(23);

		}


		public void inti_object(String c, int d) { // by value
		color= c;
		age = d;
		}
		
		public void display(int roll) {
		System.out.println(color + " " + age + " " + roll ); // this will not print in the case.
		}

	}


