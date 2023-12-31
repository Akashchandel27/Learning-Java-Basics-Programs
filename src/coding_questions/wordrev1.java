package Progarm_practice;

public class wordrev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "my name is lakhan singh";
		
		String s1[] = s.split(" ");
		System.out.println(s1.length);
		//System.out.println(s.length());

		for (int i = 0; i < s1.length; i++) {
			
			for (int j = s1[i].length() - 1; j >= 0; j--) {
				
				System.out.print(s1[i].charAt(j));
			}
			System.out.print(" ");

		}

	}
}
