import java.util.Scanner;

public class GuessNumber {
	
	public static void main(String [] args)
	{
		int randomNumber, userInput, count = 0;
		
		do {
			
			// generate random number
			randomNumber = (int)(20 * Math.random()+ 1 );
			
			// ask user input
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the number to between 1 and 20 \n");
			userInput = scan.nextInt();
			System.out.println("You guessed " + userInput + " and the computer generated " + randomNumber);
			count++;
			System.out.println("Tries = "+ count);
			
		} while(randomNumber !=userInput);
		
		
		
	}

}
