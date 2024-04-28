package pkg2;

public class testPkg {
	
	//We can use same class name in different different pakage.
    // We can also create class under class
	//inner class pakage can access the default element in class
	//outer side class pakage annot access the default element
	//outer class must be public and default
	
	public int a=5;
	
	
	public class innerclass
	{
		
	}
	
	public void sum()
	{
		System.out.println("sum");
	}

}
