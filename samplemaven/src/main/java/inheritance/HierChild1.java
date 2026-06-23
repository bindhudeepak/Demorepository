package inheritance;

public class HierChild1 extends HierParent{
	public void print()
	{
		show();
		System.out.println("Inside child1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierChild1 obj= new HierChild1();
		obj.print();
	}

}
