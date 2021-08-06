import java.util.Random;
import java.util.*;
public class RandomNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int min=1,max=3;
		while(true) 
		{
		System.out.println("Enter your input 1.snake 2.water 3.gun 4.exit");
		int user_input=sc.nextInt();
		int random_num=rand.nextInt((max-min)+1)+min;
		if (random_num==user_input)
			{
				if(random_num==1) 
				{
				System.out.println("Your choice is snake and Computer Choice is snake");
				System.out.println("Its a tie");
				}
				else if(random_num==2)
				{
					System.out.println("Your choice is water and Computer Choice is water");
					System.out.println("Its a tie");
				}
				else
				{
					System.out.println("Your choice is gun and Computer Choice is gun");
					System.out.println("Its a tie");
					
				}
			}
		else if(user_input==1 && random_num==2)
			{
			System.out.println("Your choice is snake and Computer Choice is water");
			System.out.println("You won");
			}
		else if(user_input==1 && random_num==3)
			{
			System.out.println("Your choice is snake and Computer Choice is gun");
			System.out.println("Computer won");
			}
		else if(user_input==2 && random_num==3)
			{
			System.out.println("Your choice is water and Computer Choice is gun");
			System.out.println("You won");
			}
		else if(user_input==2 && random_num==1)
			{
			System.out.println("Your choice is water and Computer Choice is snake");
			System.out.println("Computer won");
			}
		else if(user_input==3 && random_num==1)
			{
			System.out.println("Your choice is gun and Computer Choice is snake");
			System.out.println("You won");
			}
		else if(user_input==3 && random_num==2)
			{
			System.out.println("Your choice is gun and Computer Choice is water");
			System.out.println("Computer won");
			}
		else if(user_input==4)
			{
			break;
			}
		else
			{
			System.out.println("Invalid choice");
			}
		}
	}
		
}


