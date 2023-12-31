package learning_java;

public class New_015_Arraybasicobject {

	public static void main(String[] args) {
		
		int i[]= {1,2,3,4}; // Array
		Object ob[] = {1,2,3,4.5,'c','d',"hello"}; // Object Array
		
		Object obj[][]= new Object[3][4];
		obj[0][0]="Selenium";
		obj[0][1]=10.24;
		obj[0][2]=35;
		obj[0][3]=true;
		
		obj[1][0]="web driver";
		obj[1][1]=132.34;
		obj[1][2]=321;
		obj[1][3]=false;
		
		obj[2][0]="python";
		obj[2][1]=2322.34;
		obj[2][2]=3223;
		obj[2][3]=true;
		
		System.out.println("the rows of this object array is:" +i.length);
		System.out.println("the rows of this object array is:" +ob.length);
		System.out.println("the rows of this object array is:" +obj.length);
		System.out.println("the cols of the object array is " + obj[0].length);
		
		
		// Print all the elements inside this object array
		int rows = obj.length;
		int cols = obj[0].length;

		for (int a = 0; a < rows; a++) {
			for (int b = 0; b < cols; b++) {
				System.out.println(obj[a][b] + "");
			}
			System.out.println();
		}
	}
}
