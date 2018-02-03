import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) 
	{
		/*
		//generate random numbers between 1 and 10 
		// add total of generated random numbers so long as they are less than 100
		int total = 0;
		while(total<12)
		{
			int random = (int) (9 * Math.random() + 1);
			System.out.println(random);
			total+=random;
			System.out.println("Total = " + total);
		}
		
		*/

		//create an array and variable to hold random numbers
		int random, total = 0;
		
		List<Integer>alist = new ArrayList<Integer>();
		
		for(int i = 0; i<12; i++)
		{
			
			random = (int) (9 * Math.random() + 1);
			alist.add(random);
			total+=random;
			
		}
		
		System.out.println(alist + " and the total is " + total);
		
	}
}
