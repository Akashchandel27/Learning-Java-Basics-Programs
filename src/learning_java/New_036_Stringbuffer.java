package learning_java;

public class New_036_Stringbuffer {

	public static void main(String[] args) {
		
		String S1 = "Automation";
		String s2=S1.concat("Hub Sarthak");
		System.out.println(s2); // this prove that string are immutable


		StringBuffer S2= new StringBuffer("gold"); // same object mai kaam hu jate hai
		S2.append("diamond");
		System.out.println(S2); // This proves that string buffer is mutable.

		// All the methods in stringBuffer are synchronized
		// Synchronized :- there are 2 threads. (these 2 threads can't excutes a synchroized method which requires the same lock simulateoulsy/ concurrently).
		// Impact of sychronization- waiting period badh jaati hai and performance khrab hu jata hai


		StringBuffer S3= new StringBuffer();
		System.out.println(S3.capacity()); // OUTPUT=16
		S3.append("HELLO WORLDooooo"); //   phele 16 pure hoge fir baadega fir 34 hoga
		System.out.println(S3.capacity()); // OUTPUT=16 HERE IT SHOULD BE 27 BUT STILL IT COMES 16.
		S3.append("sarthak");
		System.out.println(S3.capacity());


		StringBuilder S4= new StringBuilder();
		// the methods inside stringbuilder are non-synchrozied.

	}

}
