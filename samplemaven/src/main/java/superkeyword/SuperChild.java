package superkeyword;

public class SuperChild extends SuperParent{
String name="Catherine";
SuperChild()
{
	super();
	System.out.println("Inside child class constructor");
}
public void show()
{
	System.out.println("Child class name is "+name);
	System.out.println("Parent class name is "+super.name);
	display();
	super.display();
	
}
public void display()
{
	System.out.println("Inside the child class display show");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperChild obj =new SuperChild();
obj.show();
	}

}
