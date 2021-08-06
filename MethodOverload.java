
public class MethodOverload 
{
	static int sum(int x,int y)
		{
		return x+y;
		}
	static double sum(double x,double y)
		{
		return x+y;
		}
	public static void main(String[] args)
	{
		float avg1=((float)sum(10,15))/2;
		double avg2=sum(3.5,4.5)/2;
		System.out.println(avg1);
		System.out.println(avg2);
		
	}
}
