package inheritance;

public class MultiChild extends MultiParent{

	public void displaying()
	{
		System.out.println("Displaying child class");
		
		add();
		display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultiChild obj= new MultiChild();
obj.displaying();
	}

}
