import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
	//IMPORTANT
		//There is a in-build class in Java to read the Properties File
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Code\\LearnJava\\src\\config.properties");
		prop.load(fis); //The file has been readed and stored in system memory
		
		//The data is stored in key value formate.
		//When we want any URL we have to pass key.
		
		System.out.println(prop.getProperty("UserId"));
		System.out.println(prop.getProperty("AppUrl"));
		
		//We can also write in RUNTIME.
		
		prop.setProperty("OrderNo", "8082398233");
		
		System.out.println(prop.getProperty("OrderNo"));
		//It does not show physically.It will store in memory.
		
		
		
		
		
		
	}

}
