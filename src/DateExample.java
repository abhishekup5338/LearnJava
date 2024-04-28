import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		System.out.println(d);  // THIS WILL RETURN CURRENT DATE AND TIME
		
		
		DateFormat f = new SimpleDateFormat("DD/MM/YYYY hh:mm:ss"); //PASS THE FORMATE AS A CONSTRUCTOR
		String d2 = f.format(d);
		System.out.println(d2);
		
		System.out.println("====================================");
		
		Calendar calendar = Calendar.getInstance();  //IT IS STATIC METHOD
		   System.out.println("The current date is : " + calendar.getTime());  
		   calendar.add(Calendar.DATE, -15);  
		   System.out.println("15 days ago: " + calendar.getTime());  
		   calendar.add(Calendar.MONTH, 4);  
		   System.out.println("4 months later: " + calendar.getTime());  
		   calendar.add(Calendar.YEAR, 2);  
		   System.out.println("2 years later: " + calendar.getTime()); 
	}

}
