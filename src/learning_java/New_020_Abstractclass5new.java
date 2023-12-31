package learning_java;

public class New_020_Abstractclass5new extends New_020_Abstractclass3{

	public static void main(String[] args) {
		
		// At the moment you call the class constructor will call
		
		//New_020_Abstractclass3 gen = new New_020_Abstractclass3();          object nahi ban sakta
		New_020_Abstractclass5new gn = new New_020_Abstractclass5new();
		gn.startmechanism();          //New Generator starts with ignition button
		
		New_020_Abstractclass4  go = new New_020_Abstractclass4();
		go.startmechanism();         // old generator starts with rope pully mechanism this will print
		
		gn.primaryfuel ="kerosene";
		gn.secondaryfuel="Diesel";
		
		go.roll_no=1323;
		go.temp=23;
		
		System.out.println(gn.primaryfuel);
		System.out.println(gn.secondaryfuel);
		
		System.out.println(go.roll_no);
		System.out.println(go.temp);
	}

	@Override
	public void startmechanism() {
		System.out.println("New Generator starts with ignition button");
		
	}

}
