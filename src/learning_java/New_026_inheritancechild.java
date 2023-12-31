package learning_java;

public class New_026_inheritancechild extends New_026_inheritanceparent {

	public static void main(String[] args) {
		
		New_026_inheritancechild child = new New_026_inheritancechild();
		child.money();
		child.land();
		child.bungalow();

	   // From grandparent
		child.farmhouse();
		child.farmlands();

		New_026_inheritanceparent parent = new New_026_inheritanceparent();
		parent.land();
		parent.money();
		parent.bungalow();

		}
		public void newbike() {
		System.out.println("Child's bike");
		}
		
		public void money() {
		System.out.println("Child'S money");
		}

	}


