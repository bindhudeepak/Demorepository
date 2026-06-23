package accessspecifier1;

public class Access1Class1 {

	public void name()
	{
		System.out.println("My name is Bindhu");
	}
	private void pname()
	{
		System.out.println("inside private method in class1 ");
	}
	protected void protectname()
	{
		System.out.println("inside protected method in class1 ");
	}
	 void defname()
	{
		System.out.println("inside default method in class1 ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1Class1 obj = new Access1Class1();
		obj.name();
		obj.pname();
		obj.protectname();
		obj.defname();
	}

}
