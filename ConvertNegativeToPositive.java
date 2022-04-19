package week1.day1.assignments;

public class ConvertNegativeToPositive {
	
	public static void main(String[] args) {
		
		int number=-40,neg=-1;
		int dummy=number;
		
		if (number < 0)
		{
			
			number=number * neg;		
			System.out.print("The " +dummy +" is converted into " +number);
		}		
		else 
			
			System.out.print(number +" is a positive number ");
	}

}
