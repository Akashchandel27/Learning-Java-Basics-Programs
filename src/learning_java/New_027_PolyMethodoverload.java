package learning_java;

public class New_027_PolyMethodoverload {

	public static void main(String[] args) {
		
		
		New_027_PolyMethodoverload ref = new New_027_PolyMethodoverload();
		ref.display();
		ref.display(10);
		ref.display(23,32);
		ref.display("new");
		ref.display("bew", "india");
		ref.display(new StringBuffer("Selenium"));
		ref.display(new StringBuilder("Selenium"));
//		ref.display(a);
		
		public void display() {
		System.out.println("this is a simple method");
		}

		public void display(int i) {
		System.out.println(" this is single int parameter method");
		}

		public void display(int i,int k) {
		System.out.println(" this is multi int parameter method");
		}

		public void display(String s) {
		System.out.println(" this is string parameter method");
		}

		public void display(String s, String s2) {
		System.out.println("this is mutil string parameter method");
		}

		public void display(StringBuffer S3) {
		System.out.println("this is a string buffer method");
		}

		public void display(StringBuilder S4) {
		System.out.println("this is a stringbuilder method");
		}

		public String display(Object obj) {
		String a="this is a obj method";
		return a;
		
		}


	
}