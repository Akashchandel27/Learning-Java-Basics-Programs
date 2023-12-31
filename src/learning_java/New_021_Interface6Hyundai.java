package learning_java;

public class New_021_Interface6Hyundai implements New_021_Interface6Automobile {
    
	public void main(String[] args) {
		System.out.println(" main 2nd method");
	}
	
	public static void sunroof() {
		System.out.println("Hyundai's sunroof");
	}
	
	@Override
	public void steering() {
		System.out.println("class steering");
		
	}

	@Override
	public void horn() {
		System.out.println("class horn");
	}

	@Override
	public void infotainment() {
		System.out.println("class infotainment");
		
	}

	@Override
	public void cruisecontrol() {
		System.out.println("class cruisecontrol");
		
	}

	@Override
	public void brakes() {
		System.out.println("class brakes");
		
	}

	
}
