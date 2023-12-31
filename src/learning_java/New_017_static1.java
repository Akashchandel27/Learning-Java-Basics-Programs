package learning_java;

public class New_017_static1 {
		
		int x = 500;             // Global non static variable
		static int y = 900;      // Global static variable
		String str = "Selenium"; // Global non static Variable
		
	
		// static function/method
		public static void func1() {
			String x = "Hello";
			System.out.println(x);// local variable
		}
		
		public static void akash() {
			
			System.out.println("akash chandel- with static");
			
		}
		
		public void akash_chandel() {
			 
			System.out.println("akash chandel without static");
		}
		// local variable we can't create static

		// Non Static Function
		public void func2() {
			int i = 100;  // local variable
			System.out.println(i);
		}

	}


