package week1.day1.assignments;

public class Factorial {
	
	public static void main(String[] args)
	{
		int i,no=5,fact=1;
		
		for(i=1;i<=no;i++)	
			fact=fact*i;
		
		System.out.println("Factorial of "+no+" is "+fact);
	}


}
