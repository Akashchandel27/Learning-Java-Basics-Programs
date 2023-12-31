package learning_java;
public interface New_049_bank {
	
	float rate_of_interest();
	
}

	class SBI implements New_049_bank{

		@Override
		public float rate_of_interest() {
			
			return 9.15f;
		}
		
	class PNB implements New_049_bank{

		@Override
		public float rate_of_interest() {
			
			return 9.7f;
		}
		
	}

}
