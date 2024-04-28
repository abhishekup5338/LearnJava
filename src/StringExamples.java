
public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		String str = "Automation Test Hub";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		*/
		
		String str = "Automation Test Hub";
		System.out.println(str.trim());
		System.out.println(str.length());
		
		System.out.println(str.indexOf("Test"));
		
		System.out.println(str.contains("Test"));
		
		System.out.println(str.charAt(11));
		
		System.out.println(str.substring(0));
		
		System.out.println(str.substring(11, 15));
		
		
		String s = "Order no. SIBS2172S has been placed successfully";
		
		System.out.println(s.substring(s.indexOf("no.")+4, s.indexOf("has")-1));
		
		
		String s1 = "Hello";
		String s2 = "hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		String[] ar = s.split(" ");
		System.out.println(ar[2]);
		
		
		
		
		
		
		
	}

}
