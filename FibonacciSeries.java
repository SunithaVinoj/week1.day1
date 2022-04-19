package week1.day1.assignments;

public class FibonacciSeries {
	
	public static void main(String[] args)
	{
		int sum,i,range=8,firstNum=0,secondNum=1;
		
		System.out.println("Fibonacci Series");
					
		for(i=1;i<=range;i++)
		{
			
			System.out.println(firstNum);
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
		}
	}
}
