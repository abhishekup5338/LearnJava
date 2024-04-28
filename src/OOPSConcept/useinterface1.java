package OOPSConcept;

public class useinterface1 implements interface1,interface2{
	

	//To inherite the INTERFACE in class we use "IMPLEMENTS".
	//A ABSTRACT class can implements a INTERFACE.
	//In a class we can inherite the multiple interfaces.
    //we cannot extends multiple class 
	
	
	@Override
	public void communication1()
	{
		System.out.println("communication1");
		
	}

	@Override
	public void trasmeter1()
	{
		System.out.println("trasmeter1");
		
	}

	@Override
	public void communication2() {
		System.out.println("communication2");
		
	}

	@Override
	public void trasmeter2() {
		System.out.println("trasmeter2");
		
	}


}
