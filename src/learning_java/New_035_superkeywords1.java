package learning_java;

import net.bytebuddy.implementation.bind.annotation.Super;

public class New_035_superkeywords1 extends New_035_superkeywords {

	int i = 20;

	public void check(int i) {
		System.out.println(i);       // this is referred to the interger with the value
		System.out.println(this.i);  // this is referred to the child class -20
		System.out.println(super.i); // this is referred to parent value of i-10

	}

	public static void main(String[] args) {

	New_035_superkeywords1 obj = new New_035_superkeywords1();
	obj.check(43);
	System.out.println();

	
	System.out.println();
	

	}

}
