package OOPSConcept;

abstract class abstractExample {
	
	//Hiding implementation 
	//Only neccessory things to tell user and hinding uneccessory things
	//ex- TV Remote
	//ex- call connecting
	//amazone - login id, product purchase, recent search, cart
	//diffrence - Encapsulation hides the data
	//          - Abstraction hide the implementation
	//Class must be Abstract to define abstarct method
	//We cannot create a Object of Abstarct class
	
	private int a=5;      //we can define it is public or private
	
	abstract void transmeter(); //use abstarct keyword to hide implementation which we not want to show user.
	
	abstract void communication(); //abstract method is always un-implimented. There is no body of abstract class.
	
	public void operate()
	{
		System.out.println("you can operate remote");  
	}
	
	public void ChangeCell()
	{
		System.out.println("ChangeCell");  
	}
	
	

}
