package learning_java;

public class New_019_Encapsulation5 {
	
	private int roll_no_10;
	private String name;
	private int roll_no_12;
	
	public void setData(int roll_no_10, String name, int roll_no_12) {
		this.roll_no_10 = roll_no_10;
		this.name=name;
		this.roll_no_12= roll_no_12;
	}

	public int getData() {
		return roll_no_10;
		
	}
	
	public String getData1() {
		return name;
	}
	
	public int getData2 () {
		return roll_no_12;
	
	}
}
