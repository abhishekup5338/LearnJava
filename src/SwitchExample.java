import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1 = scan.nextInt();
		
		System.out.println("Please enter second number");
		int num2 = scan.nextInt();
		
		System.out.println("Please enter action");
		String act = scan.next();
		
		switch(act)
		{
		case "+":
			System.out.println("sum="+(num1+num2));
			break;
		case "-":
			System.out.println("sub="+(num1-num2));
			break;
			case "*":
				System.out.println("mul="+(num1*num2));
				break;
			case "/":
				System.out.println("div="+(num1/num2));
				break;
				default:
					System.out.println("wrong number");
		}
		
		 if(act.equals("+"))
		{
			System.out.println("sum="+(num1+num2));
		}
		

		else if(act.equals("-"))
		{
			System.out.println("sub="+(num1-num2));
		}
		
		else if(act.equals("*"))
		{
			System.out.println("mul="+(num1*num2));
		}
		
		else if(act.equals("/"))
		{
			System.out.println("div="+(num1/num2));
		}
		
		else
		{
			System.out.println("wrong input");
		}

		
		
		
		
		
		
		
		
		
		
		
	}

}
