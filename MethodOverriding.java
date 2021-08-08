class School
{ 
	String stu_id="FE839";
    int stu_fee=25000;
	 void display()
	{
		System.out.println("The id of the person is"+stu_id+"and fee is"+stu_fee);
	}
	 void display2()
		{
			System.out.println("I am a method");
		} 
}
class Student extends School
{
	String stu_id="FE857";
     void display()
		{
    	 System.out.println("The id of the person is"+stu_id+"salary is"+stu_fee);
		}
	
}
public class MethodOverriding {
public static void main(String[] args)
{
	Student s1=new Student();
	s1.display();
	s1.display2();
}
}
