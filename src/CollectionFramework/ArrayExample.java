package CollectionFramework;

public class ArrayExample {
	
	
	
	
	public static void main (String[] args)
	{
	//	int a = 10; //at a time it store only one variable
	//	int a =20;  //20 will replace 10
		
		// Array variable [] is use to store multiple value of same variable.
		
		
		int[] a = new int[3];  //which size will be pass those variable we can use
	//	int a[] = new int[3];  We can also write in this way
		a[0] = 10;
		a[1] = 20;
		a[2] = 30; //This are called single dimentional array
		/*
		System.out.println(a[2]); //When we have to retrive his value we to written variable along with the array number.
		
		System.out.println(a[0]+a[1]+a[2]);  //same variable can hold different different value.
		
		for(int i = 0; i<=a.length - 1; i++)
		{
			System.out.println(a[i]);
		}
		*/
		
		for(int i:a)  //it written the value of every array one by one in i
		{
			System.out.println(i);  //When ever the varible has multiple value we can use this.
		}
		
		
		int [] b = {2,3,4,6,8,10};  //Other option
		
		for(int i:b)
		{
			System.out.println(i);
		}
		
		System.out.println("===============================");
		
		int c[][] = new int[2][3];  //Double dimentional array or multiple dimentinal array.
		c[0][0] = 10;
		c[0][1] = 20;
		c[0][2] = 30;
		c[1][0] = 100;
		c[1][1] = 200;
		c[1][2] = 300;
		
		for (int d[]:c)
		{
			for (int e:d)
			{
				System.out.println(e);
			}
		}
		
		//EXAMPLE Another Option
		
		int[][] x = {{10,20,30},{100,200,300}};
		for (int d[]:x)
		{
			for(int e:d)
			{
				System.out.println(e);
			}
		}
		
		//Array is fixed size and value
		//It could not be add or  modified in future
		//Therefore we use it very less
		//We can handle it's limitation with the help of ARRAYLIST
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
