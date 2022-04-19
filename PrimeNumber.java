package week1.day1.assignments;

public class PrimeNumber {
	
	public static void main(String[] args)
	{
		int i,no=13;
		boolean flag=false;
		
		for(i=2;i<=no/2;i++)	
		{
			if(no%i==0)
				{
				flag=true;
				break;
				}
		}
		if (!flag)
			System.out.println(no+" is a prime number");
		else
			System.out.println(no+" is not a prime number");
	}


}
