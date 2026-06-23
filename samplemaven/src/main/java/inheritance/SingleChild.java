package inheritance;

public class SingleChild extends SingleParentClass{

	public void show()
	{
		System.out.println("name is " +name);
		System.out.println("Age" +age);
		display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SingleChild obj= new SingleChild();
        obj.show();
	}

}
