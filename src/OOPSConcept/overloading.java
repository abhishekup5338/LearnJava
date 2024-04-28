package OOPSConcept;

public class overloading {

	/*
	 POLYMORPHISM
	 1. COMPILATION TIME - OVERLOADING -- STATIC BINDING --- EARLY BINDING
	 2. RUNTIME - OVERRINDING -- DYNAMIC BINDING --- LATE BINDING
	 */
	
	public void sum()
	{
		System.out.println("This is simple sum");
	}
	
	public void sum(int a)
	{
		System.out.println("This is sum having 1 parameter");
	}
	
	public void sum(int a, int b)
	{
		System.out.println("This is sum having 2 parameter");
	}
	
	public void sum(int a, double b)
	{
		System.out.println("This is sum having 2 parameter");
	}
	
	
	public void sum(double a, double b)
	{
		System.out.println("This is sum having 2 parameter");
	}
	
	//In same class with same name creating different different method with signature is known as  "OVERLOADING".
	
	//constructor
	//static concept
	//inheritance 
	//overriding 
	//learn from youtube to understand better
	
}
