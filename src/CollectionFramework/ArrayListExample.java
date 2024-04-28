package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst = new ArrayList<Integer>();  //We have to start with LIST rather than ARRAYLIST
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.add(50);
		lst.add(40); //LIST are supports duplicate value But SET are not support duplicate value it count only one at a time.
		
		lst.remove(2);  //We can any time remove the value that we don't want to print.
		
		lst.add(100); //We can add any time any value that we forgot to add.
		
		System.out.println("size of list="+lst.size());  //To find the size of list.
		
		System.out.println("single value="+lst.get(4));
		
		Collections.sort(lst);  //We can also sort our list with the help of this
		
		for(int i:lst)
		{
			System.out.println(i);
		}
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium_software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:100");
		
		String s = driver.findElement(By.name("login_theme")).getTagName();
		System.out.println("tag name="+s );
		
		Select sel = new Select(driver.findElement(By.name("login_theme")));
		
		List<WebElement> elms = sel.getOptions();
		System.out.println("Number of options available="+elms.size());
		
		WebElement we = sel.getFirstSelectedOption();
		System.out.println("default selected option is="+we.getText());
		
		System.out.println("==================================");
		for(WebElement e:elms)
		{
			System.out.println(e.getText());
		}
		
		
		
		
		
		
		
		
		

	}

}
