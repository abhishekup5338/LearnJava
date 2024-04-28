package OOPSConcept;

public class AutoTesting extends Testing{
	int a;
	int b;
	//AutoTesting extends Testing
	//childclass extends parentclass
	//derivedclass extends baseclass
	//subclass extends superclass
	
	public AutoTesting(int a, int b) //it automatically create super key word
	{
		super(a, b);  //super key word must be in first line other wise it show error
		this.a=a;    //it creates the ambidutie problem
		this.b=b;     // This represent the current class
		System.out.println("Child class constructor");
	}

	public void regression()
	{
		System.out.println("auto regression"); //overiding JVM auto matically calls child class method
		super.sanity(); //we can also call the object using super key word
	}
	
	
	

}
