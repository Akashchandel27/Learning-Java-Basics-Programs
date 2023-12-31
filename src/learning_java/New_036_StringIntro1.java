package learning_java;

public class New_036_StringIntro1 {

	public static void main(String[] args) {
		//What is String Constant Pool(String Literal pool)?
		//Answer:- Memory location jo ki string object store karta hai
		
		//Java mein basically 5 type ki memory store areas
		//1. Method Area
		//2. Heap Area (String Constant Pool)- Size manipulate kar sakte hai)
		//3. Stack Area
		//4. PC Register
		//5. Native Method area String S = new String(); // An object is created. kaha pe ye store hai?
		
		// Heap area (new keywords se jo bhi object bante hai vo heap area mai store hota hai)
		String S1= new String("Java"); // here we added string literal-- //1 object banega in heap area and 1 aur object banega in SCP/SLP area.
		
		// Interview Questions- SCP/SLP ke andar jo bhi object create hote hai kya wo garbage collection ke tahat delete hu sakte hai?
		// Answer :- No
		
		String S2 = "C++"; // literal hai, yeh object directly SCP mein create hoga aur heap area mai crate nahi hoga.
		//String S1= new String("Java"); VS String S2 = "C++"; KYA antar hai
		// 2 object are created heap memory mai and scp memory 1 object is created directly inside the SCP memory.
		// heavy hu jata hai because mutilple object is created // light rehta hai beacuase only object is created.
		// this is not recommended /// Recommended and  preferred.
		
		
		String S3 = new String("JAVA"); // IT will make in both the memory
		String S4 = new String("Dot net"); //iT will make in both the memory
		String s5 = new String("JAVA"); // IT will craete only 1 object in the heap memory.
		String s6= ("python"); // Direct SCP MAI JAYEGA
		String s7=("JAVA");
		String s8=("JAVA");



	}

}
