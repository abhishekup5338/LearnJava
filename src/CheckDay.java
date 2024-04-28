import java.security.Signer;
import java.util.Scanner;

public class CheckDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int num = 5;
		
		if(num==1)
		{
			System.out.println("Today is Sunday");
		}
		else if(num==2)
		{
			System.out.println("Today is Monday");
		}
		else if(num==3)
		{
			System.out.println("Today is Tuesday");
		}
			
		else if(num==4)
		{
			System.out.println("Today is Wednesday");
		}
		
		else if(num==5)
		{
			System.out.println("Today is Thursday");
		}
		
		else if(num==6)
		{
			System.out.println("Today is Friday");
		}
		
		else if(num==7)
		{
			System.out.println("Today is Saturday");
		}
		
		else
				
		{
			System.out.println("wrong number");
		}
		
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number between 1 to 7");
		int num = scan.nextInt();
		
		if(num==1)
		{
			System.out.println("Today is Sunday");
		}
		else if(num==2)
		{
			System.out.println("Today is Monday");
		}
		else if(num==3)
		{
			System.out.println("Today is Tuesday");
		}
			
			else if(num==4)
			{
				System.out.println("Today is Wednesday");
			}
		
			else if(num==5)
			{
				System.out.println("Today is Thursday");
			}
		
			else if(num==6)
			{
				System.out.println("Today is Friday");
			}
		
			else if(num==7)
			{
				System.out.println("Today is Saturday");
			}
		
			else
				
			{
				System.out.println("wrong number");
			}
		
	}

}
