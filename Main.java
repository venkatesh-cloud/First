import java.util.*;
public class Main {
	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      while(true)
      {
	    System.out.println("enter 1.addition 2.substraction 3.multiplication 4.Division 5.reminder 6.exit");
	     int z=sc.nextInt();
	     if (z==6)
		     {
		    	 break;
		     }
	     else
		     {
		      System.out.println("enter x");
		      int x=sc.nextInt();
		       System.out.println("enter y");
		      int y=sc.nextInt();
		     if(z==1)
		     {
		    	 System.out.println(x+y);
		     }
		     else if(z==2)
		     {
		    	 System.out.println(x-y);
		     }
		     else if(z==3)
		     {
		    	 System.out.println(x*y);
		     }
		     else if(z==4)
		     {
		    	 System.out.println(x/y);
		     }
		     else if(z==5)
		     {
		    	 System.out.println(x%y);
		     }
		     else
		     {
		    	 System.out.println("You chose wrong option");
		     }
	      }   
	   }
	}

}
	
