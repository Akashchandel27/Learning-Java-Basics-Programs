package learning_java;

public class New_021_Interface6execution {

	public static void main(String[] args) {
		
		// Can we make object of an interface ? answer :- NOT ALLOWED
		// Automobile automobile = new automobile();-- you can't create object of an interface (Automobile)
		
		New_021_Interface6Hyundai hyundai = new New_021_Interface6Hyundai(); // Class ka object ban jayega in interface (Hyundai)
		hyundai.horn(); // all the override will come
		hyundai.steering();
		hyundai.infotainment();
		hyundai.cruisecontrol();
		hyundai.brakes();
		hyundai.main(args);
		
		hyundai.sunroof();      // this is not a good practice to call a static method via object reference, show warning in that case
		New_021_Interface6Automobile.sunroof();  // this is a better way to call a static method via a class name directly.
		
		New_021_Interface6Automobile automobile = new New_021_Interface6Hyundai(); // WebDriver driver = new chromeDriver();
		
		
	    // New_021_Interface6Automobile                     - Interface
	    // automobile                                       - reference variable
        // New_021_Interface6Hyundai                        - class
		
           automobile.steering();
           automobile.horn();
           automobile.infotainment();
           automobile.cruisecontrol();
           automobile.brakes();
           automobile.main(args);

			New_021_Interface6Automobile.sunroof();
			System.out.println(New_021_Interface6Automobile.i);
			System.out.println(New_021_Interface6Automobile.name);

		}
	}
