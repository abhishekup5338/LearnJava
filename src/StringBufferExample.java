
public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello";
		System.out.println(s1);
		
		String s3 = "Hello"; //It is not every time storing the "Hello" value. It simply indicate s3 to "Hello".
		
		String s2 = new String("Hello");
		System.out.println(s2 );
		
		
		StringBuilder b = new StringBuilder("Hello");
		System.out.println(b);
		
		/*
		There are 2 types of memory in java.
		 1) STACK MEMORY - Local Variable memory store here. This called primary or temporary base memory.
		 2) HEAP MEMORY - Whenever we create any object like = new ChromeDriver is store in HEAP Memory.
		  There is a 2 type of area in Heap Memory 1) String Pool Area
		                                           2) Static Area
		   
		   
		 - The String is immutable(We cannot modify string). 
		 - The StringBuilder is mutable(We can modify it). IT HAS A FUNCTION TO MODIFY. It is new concept.It is non-synchronized method.
		    It is introduced in Java 1.5.
		 - The StringBuffer is mutable.It is the Older concept. It is a synchronized Method.It is introduced in Java 1.0.
		*/
		
	}

}
