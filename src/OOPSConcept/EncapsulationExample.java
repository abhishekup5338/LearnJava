package OOPSConcept;

public class EncapsulationExample {
	
	//it is basically use for security purpose
	//Protecting the data
	//Hiding the confidential information
	//we can also provide the information to minimum person in company.
	
	public String EmpName= "Abhishek";
	public int EmpSalary= 900000;
	
	private int EmpSalary1= 900000;// When we create private class no one will access the class except the current class
	
	private int Age=20;
	
	
	
	public int GetSalary(String person)
	{
		if(person.equals("Mgr") || person.equals("HR"))
		{
		return EmpSalary1;
		}
		else
		{
			return 0;
		}
	}
	
	public int GetAge()
	{
		return Age;
	}
	
	public void SetSalary(int NewSalary, String person)
	{
		if(person.equals("HR"))
		{
		EmpSalary1 = NewSalary;
		}
	}
	
	public void SetAge(int NewAge, String person)
	{
		if(person.equals("HR"))
		{
		Age = NewAge;
		}
	}
	
 
}
