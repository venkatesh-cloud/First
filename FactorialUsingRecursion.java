import java.util.*;
public class FactorialUsingRecursion {
static int fact(int x)
	{
	if(x==0)
	{
		return 1;
	}
	else
	{
	 return x*fact(x-1);
	}
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter the number to get factorial");
	int num=sc.nextInt();
	int result=fact(num);
	System.out.println(result);
}
}
