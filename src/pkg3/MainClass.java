package pkg3;

import pkg2.testPkg;

public class MainClass {

	public static void main(String[] args) {
		
		//when we have to call element from different pakage we have to import the pakage at object creating time.
		// "IMPORT means the location of anything.
		
		testPkg tp = new testPkg();
		tp.sum();
		
		// types of modifiers 
		//In c++ we also called it access specifier
		//1. public
		//2. private
		//3. default
		//4. protected
		
		//supporting modifiers
		//1.final
		//2.abstract
		//3.static
		
		
		subclass sb = new subclass();
		
		
		
		
		
		
		
		
		
	}

}
