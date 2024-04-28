import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		//When we have to read and write something in file. There are multiple choices in java.
		//There are two type of function that we use write in file 1) BufferWriter 2) FileWriter 
		
		File f = new File("C:\\Code\\LearnJava\\src\\test.txt");
		
		FileWriter fw = new FileWriter(f,true); //Pass the file as a constructor and also we can add boolean. File also a append
		BufferedWriter bw = new BufferedWriter(fw); //Pass the Writer as a constructor.
		
		bw.write("Hello World");
		bw.newLine();
		
		fw.write("Hello Java");
		
		fw.flush(); //Whenever we press the run key the file will append (write Hello Java in File).
		
		//If we didn't mentioned true in file constructor it will override the method.
		//When we write true it will append the method.
	
		
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		//System.out.println(br.readLine());
		
		Scanner sc = new Scanner(f); //Scanner is the best option for reading the file.
		
		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
		
		//With the help of this we can perform the operation in .txt file.
		
	}

}
