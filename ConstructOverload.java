
class Employee
{
	Employee(int id,String name)
	{
		System.out.println("employee id:"+id+" and name is "+name);
		
	}

	Employee(int id)
	{
		System.out.println("employee id:"+id);
		
	}
}
public class ConstructOverload {
	public static void main(String[] args)
	{
		Employee e1=new Employee(234);
		Employee e2=new Employee(235);
		Employee e3=new Employee(236,"venky");
		Employee e4=new Employee(237,"karthik");
	}

}
