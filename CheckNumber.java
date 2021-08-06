import java.util.*;
public class CheckNumber {
public static void main(String[] args)
{
	float sum=0.0f;
	float avg;
float arr[]=new float[3];
		arr[0]=1.4f;
		arr[1]=3.5f;
		arr[2]=6.3f;
 for(int i=0;i<arr.length;i++)
 {
	 sum+=arr[i];
 }
 avg=sum/arr.length;
 System.out.printf("average is %.2f\n",avg);
 System.out.println("enter the number you are searching for:");
 Scanner sc=new Scanner(System.in);
  float num=sc.nextFloat();
 boolean isPresent=false;
 for(float element:arr)
 {
	if(num==element)
	{
		 
	    isPresent=true;
		 break;
	}
 }
 if(isPresent)
 {
	 System.out.println("Found the number");
 }
 else
 {
	 System.out.println("Not found ");
 }
 String txt="Ramu is a good boy";
 System.out.println("the length of string is"+txt.length());
 System.out.println(txt.indexOf("g"));
 
}
}
