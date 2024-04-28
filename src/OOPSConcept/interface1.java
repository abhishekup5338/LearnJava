package OOPSConcept;

public interface interface1 {

	//it is by default 100% abstract 
	//we cannot implement any method 
	//final- In final keyword we cannot change the value
	//     - cannot extends the class
	//     - cannot override methods
	//In a class we can inherite the multiple interfaces.
    //we cannot extends multiple class 
	
	/*
	abstract                                                        interface
	1.Abstract is a Class.                                  1. Interface is a Interface.
	2.In Abstract class there is                            2.In Interface all methos are by-default Abstract.
	Abstract or non-Abstract methods.                         In java 1.8 we can define Static methods as non-Abstract methods.
	3.In Abstract Class we use Abstract                     3. In Interface the methods are by-Default Abstract
	keyword to define methods 
	4.In Abstract Class the we are                          4.In Interface the variable are by-Default public,static,final
	defining diffrent-diffrent variable Public,Private.
	5.We can use extends keyword to inherite child aur      5.To inherite the interface we are using implements keyword.
	sub-class in Abstract.
	6.At a time we can inherite only one class              6.In child class we can inherite multiple interface using implements
	
	*/
	
	
	int a1=5;     //it is by default public, private, final
	
	public void communication1();
	
	public void trasmeter1();
	
	//In java 1.8 using STATIC keyword we can implement and create body of methods in INTERFACE.  
	
	public static void operate1()
	{
		System.out.println("operate1");
	}
	

}
