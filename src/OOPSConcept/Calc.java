package OOPSConcept;

public class Calc {
	
	public int a=5; //global variable
	public int b=3;
	
	
	public void sum()
	{
		int p = 5; //local variable
		System.out.println("sum="+(a+b));
	}
	
	public void sub()
	{
		System.out.println("sub="+(a-b));
	}
	
	public void add(int x, int y)
	{
		System.out.println("add="+(x+y));
	}
	
	public void get(String url)
	{
		System.out.println("navigate to url="+url);
	}
	
	public double getSimpleInterest(double p, double r, double t)
	{
	  double si = (p*r*t)/100;
	  return si;
	}
	
	
	
	public Calc() //This is constructor
	{
		
	}
	
	public static void div() //STATIC CONCEPT EXAMPLE
	{
		System.out.println("this is static div");
	}
	
	
	/*
	public void sum()
	{
		System.out.println("This is sum");
	}
*/
}
