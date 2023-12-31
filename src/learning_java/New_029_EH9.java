package learning_java;

public class New_029_EH9 {

	public static void main(String[] args) {
		
		try {
			int i=20/2;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				int a =5/0;
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("fianlly block will excuted ");
		}
		

	}

}
