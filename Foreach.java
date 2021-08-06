import java.util.*;
public class Foreach {
public static void main(String[] args)
{
	int N=5;
	int S[]=new int[N];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter numbers into array");
	for(int i=0;i<N;i++)
	{
		S[i]=sc.nextInt();
		
	}
	System.out.println(S);//it prints the address
	
	for(int k:S)
	{
		System.out.println(k);
	}
}
}
