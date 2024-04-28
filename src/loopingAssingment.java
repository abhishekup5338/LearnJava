
public class loopingAssingment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*
       1 2 3
       4 5 6
       7 8 9
       
		
		for(int i=1;i<=9;i++)
		{
			System.out.print(" "+i);
			if(i%3==0)
			{
				System.out.println("");
			}
		}
		
	
		
		1 0 0
		0 1 0
		0 0 1
		
		*/
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==j)
				{
					System.out.print(" 1 ");
				}
				else
				{
					System.out.print(" 0 ");
				}
					
			}
			 System.out.println("");
		}
		
		
	}

}
