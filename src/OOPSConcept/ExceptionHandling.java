package OOPSConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import pkg3.subclass;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub
 /*
    **Exception is unwanted error that terminates the program execution.
		Exceptions
		1. Checked exceptions -- compilation time exceptions
		2. Unchecked exceptions -- runtime exceptions
		*/
		
		//UNCHECKED EXCEPTIONS
		
		//Runtime Exception is only handle with the TRY AND CATCH statement
		//Throws - It handle the compilation time exception at method level.
		//Throw - It throw the exception
		/*
		System.out.println("Execution Started");
		
		int a,b,c;
		a = 8;
		b = 4;
		c = a/b;
		
		System.out.println("div="+c);
		
		
		int a,b,c;
		try
		{
			int [] ar = new int[2];
			ar[0] = 10;
			ar[1] = 20;
			ar[2] = 30;
			
			
		a = 8;
		b = 0;
		c = a/b;
		
		System.out.println("div="+c);
		}
		catch(ArithmeticException e)  
		{
			System.out.println(e.getMessage());
			e.printStackTrace();                   //for printing red colour message
		}
		
		catch(ArrayIndexOutOfBoundsException e)  //Use different try,catch statement for every exception
		{
			System.out.println(e.getMessage());  //if they find error in running code it will auto-matically wo to catch exception
			e.printStackTrace();                  //and skip the other codes  
		}
		
		System.out.println("Execution Completed"); 
		*/ 
		/*
		catch(Exception e)   //We can also use "EXCEPTION" it is a super class of all exceptions.
		{
			System.out.println(e.getMessage());  
			e.printStackTrace();                    
		}
		*/
		
		/*
		catch(Exception e)   //We can also use "THROWABLE" it is a super class of exception.
		{
			System.out.println(e.getMessage());  
			e.printStackTrace();                    
		}
		*/
		
		
		
		//EXAMPLE THAT DEVELOPER USE GENERALLY
		
		
		
		System.out.println("Execution Started");
		int a,b,c;
		try
		{
			a = 8;
			b = 0;
			c = a/b;
			
			System.out.println("div="+c);
			
		}
		catch(Exception e)   //We can also use "EXCEPTION" it is a super class of all exceptions.
		{
			System.out.println(e.getMessage());  
			e.printStackTrace();                    
		}
		
		try
		{
			int [] ar = new int[2];
			ar[0] = 10;
			ar[1] = 20;
			ar[2] = 30;
		}
		catch(Exception e)   //We can also use "EXCEPTION" it is a super class of all exceptions.
		{
			System.out.println(e.getMessage());  
			e.printStackTrace();                    
		}
		
		finally   //This is run in any condition if there is error in TRY or not.
		{
			System.out.println("This is finally block");
		}
		
		
		System.out.println("Execution Completed"); 
		
		//If we remove CATCH block than code will terminated but in that case also FINALLY BLOCK runs.
		
		
		
		
		//CHECKED EXCEPTION
		
		Thread.sleep(2000);   //complier will tell that there is an error will running an program
		
		Thread.sleep(2000); //When we write the program that time we will known that the error
		
		FileInputStream fis = new FileInputStream("");  //We can also add it's super class "EXCEPTION" in THROWS.
		}
		
	   
	}


