package accessspecifier2;

import accessspecifier1.Access1Class1;

public class Access2Demo1 extends Access1Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access2Demo1 obj1= new Access2Demo1();
		obj1.protectname();
		obj1.name();
		//outside the package public and protected 
	}

}
