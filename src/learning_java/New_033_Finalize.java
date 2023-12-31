package learning_java;

public class New_033_Finalize {

	public static void main(String[] args) {
		
		// Finalize is a not a reserved keyword
		// Once the finalize method completes, immediately garbage collector destroy that object.
		// finalize method is present in object class.
		// that object which is eligible for the garbage collection, that object corresponding class finalize method is going to be executed.

		String str1 = new String("Automation Hub");
		str1= null;

		New_033_Finalize objref = new New_033_Finalize();
		objref.finalize();


		System.gc(); // this is the way to call the garbage collection
		System.out.println("i am ending main method");

		}
		// TODO Auto-generated constructor stub


		public void finalize() {
		System.out.println("this is a finalize method");

		}

	}


