package OOPSConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConstructorExample {
	
	//Constructor is a method having same class name. There is no void and written type.
	
	//When we are not passing any types of constructor is called "NO ARGUMENT CONSTRUCTOR"
	
	public ConstructorExample() //example of "NO ARGUMENT CONSTRUCTOR"
	{
		System.out.println("no argument constructor");
	}
	
	public ConstructorExample(int a) 
	{
		System.out.println("one argument constructor");
	}
	
//	public ConstructorExample(int a, int b) 
	{
		
		System.out.println("two argument constructor");
	}
	
	public void sum()
	{
		System.out.println("sum");
	}
	
	
	int x=8;
	int y=4;
	
	public void sum1()
	{
		System.out.println("sum="+(x+y));
	}
	
	//To reduce the line of code we can add the value in constructor.
	
	public ConstructorExample(int c, int d) 
	{
		x=c;
		y=d;
		System.out.println("two argument constructor");
	}
	
	//WE CAN CREATE MULTIPLE CONSTRUCTOR IN ONE CLASS WITH DIFFERENT SIGNATURE
	//IN CONSTRUCTOR OVERLOADING IS POSSIBLE
	//WE HAVE TO CREATE CLASS OBJECT AND CONSTRUCTOR WILL AUTOMATICALLY CALLED IT SELF.
	//IT DOSN'T HAVE TO CALL
	
	/*
	 Type of Constructor
	 1. Default Constructor
	 2. no argument Constructor
	 3.parameterized Constructor
	 */
	
	
}
