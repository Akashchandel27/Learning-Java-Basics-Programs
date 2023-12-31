package learning_java;

public class New_019_Encapsulation3 {

	private String student_name;                   // Data hiding
	private int student_id;                        // Data hiding
    private String pan_no;
    private String phone_no;
    
	public void setData(String name, int id, String pan,String phone) {
		this.student_name = name;
		this.student_id = id;
		this.pan_no = pan;
		this.phone_no = phone;
		
	}
	
	public String getData3() {
		return phone_no;
	}

	public String getData() {
		return student_name;

	}

	public int getData1() {
		return student_id;

	}

	public String getData2() {
		return pan_no;

	}
}