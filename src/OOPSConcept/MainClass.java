package OOPSConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MainClass {

	public static void main(String[] args) {
		/*
		principle of OOPS
		1- What is class
		2- how to create object of any class
		3- methods of creating class
		4- what is global variable / class instance
		
		we have to do all the work in class
		ex- class is like container/blue print
		
		-public class is accessable for ever one.
		-we also create our own method in class
		
		-public static void this is known as method of class.
		*/
		
		/*
		System.out.println("This is main method");
		
		//classname objectname - new classname(); This is the syntax for creating object
		
		Calc c = new Calc();
		c.sum();
		c.sub(); 
		
		
		Calc c1 = new Calc();
		c1.a=8;
		c1.b=5;
		c1.sum();
		c1.sub();
		
		c1.add(12, 3);
		
		c1.get("http://localhost:100");
		
		double si = c1.getSimpleInterest(1000, 5, 1);
		double totalamount = 1000+si;
		System.out.println(totalamount);
		
		
		overloading ol = new overloading();
		ol.sum(2, 3);
		ol.sum(3, 100);
		*/
		
		//ConstructorExample ce = new ConstructorExample();
		/*
		ce.sum();
		ConstructorExample ce1 = new ConstructorExample(5);
		ConstructorExample ce2 = new ConstructorExample(3,6);
		
		//Example of "CONSTRUCTOR"
		
		WebDriver driver = new ChromeDriver();
		
		Select s = new Select(driver.findElement(By.name("abc")));
		
		Actions act = new Actions(driver);
		
		ce.x=100;
		ce.y=50;
		ce.sum1();
		
		
		ConstructorExample ce = new ConstructorExample(100,50); //To reduce the line of code we can add the value in constructor.
         ce.sum1();
         
         Calc c = new Calc();  //STATIC CONCEPT EXAMPLE
         c.sum();
         c.div();  //STATIC METHOD ALWAYS ITALIC TILT
         
         Calc.div(); //WE CAN CALL IT DIRECT.
         
         Math.sqrt(23); //EXAMPLE
         
         
         AutoTesting at = new AutoTesting(5,7); //INHERITANCE EX USING EXTENDS KEY WORD
         at.smoke();
         at.performance();   //method is over ride but constructor was not
         at.sanity();
         at.regression();
         
         
		
		
		EncapsulationExample enc = new EncapsulationExample();  //Example of Encapsulation
		System.out.println(enc.EmpSalary);
		System.out.println(enc.GetSalary("nandan"));
		
		//abstractExample abs = new abstractExample(); We cannot create a Object of Abstarct class
		
		
		useAbstract ua = new useAbstract();
		ua.ChangeCell();
		ua.communication();
		ua.operate();
		ua.transmeter();
		*/
		
		
		
	//	interface1 in = new interface1();  We cannot create a Object of interface class
		
		
		useinterface1 ui = new useinterface1();
		ui.communication1();
		ui.trasmeter1();
		interface1.operate1();
		
		
		
		
		
		
         
         
         
         
         
	}

}
