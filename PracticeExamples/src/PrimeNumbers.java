import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers 
{

	public static void main(String[] args) 
	{
		// Ask user input
		System.out.println("Enter the limit of the prime numbers you would like to see:\n");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		// Create a list 
		List <Integer>myNumList = new ArrayList<Integer>();
		
		//check for prime numbers
		for(int i=2; i<num; i++)
		{
			boolean isPrime=true;
			for(int j=2; j<i; j++)
			{	
				if(i%j == 0) // check for divisibility
				{
					isPrime=false;
				}		
			}		
			if(isPrime)
			{
				//place prime numbers on a list
				myNumList.add(i);
			}
						
		}
		System.out.println("\nAll the prime numbers up to " + num + " are:" + myNumList);
		scan.close();
	}
}
		



