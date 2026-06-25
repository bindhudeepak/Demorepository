package aggregationexample;

public class Department {

	String deptName;
	String branch;
	Employee ref_employee;
	Employee_id e_id;
	Department(String deptName,String branch,Employee ref_employee,Employee_id e_id)
	{
		this.deptName=deptName;
		this.branch=branch;
		this.ref_employee=ref_employee;
		this.e_id=e_id;
	}
	void show()
	{
		System.out.println("Department name : "+deptName);
		System.out.println("Branch name : "+branch);
		System.out.println("Employee name : "+ref_employee.name);
		System.out.println("Employee id : "+e_id.emp_id);
		System.out.println("Age : "+ref_employee.age);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee empobj= new Employee("Bindhu",30);
Employee_id emp_idobj= new Employee_id("1234");
Department depobj=new Department("IT","KOCHI",empobj,emp_idobj);

depobj.show();
	}

}
