package inheritance;

public class HierChild2 extends HierParent{

	public void print1()
	{
		show();
		System.out.println("Inside child2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierChild2 obj1= new HierChild2();
		obj1.print1();
	}

}
