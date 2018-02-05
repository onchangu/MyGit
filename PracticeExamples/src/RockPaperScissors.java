import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	
	public String computerInput() {
		
		int num = (int) (3 * Math.random() + 1);
		System.out.println(num + " is computer's selection \n\n");
		return getInput(num);
	}
	
	public String getInput(int number){
		
		String choice = "";
		
		switch(number) {
			case 1: choice = "Rock";
			break;
			
			case 2: choice = "Paper";
			break;
			
			case 3: choice = "Scissors";
			break;			
		}
		
		return choice;
	}
	
	public String userInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 - Rock, 2 - Paper, or 3 - Scissors :\n");
		int userChoice = scan.nextInt();
		String play = getInput(userChoice);
		return play;
		
	}
	
	public String gameRules(String userInput, String computerInput) {
		
		String output;
		output = "The computer's chose " + computerInput + "\n";
		output += "The user chose "+ userInput + "\n\n";
		
		if(userInput.equalsIgnoreCase("Rock")) {
			if(computerInput().equalsIgnoreCase("Scissors")) 
			{
				output+= "Rock beats scissors.  \nUser wins!!";
			}else if (computerInput.equalsIgnoreCase("Paper"))
			{
				output += "Paper beats rock.  \nThe computer wins!!";
			}
			else { 
				output +="Its a tie";
			}
			
			
		} else if (userInput.equalsIgnoreCase("Paper")) {
			if(computerInput.equalsIgnoreCase("Scissors")) {
				output +="Scissors cuts papers.  \nThe computer wins!!";
			}else if(computerInput.equalsIgnoreCase("Rock")) {
				output +="Paper beats rock. \nThe user wins!!";
			}
			
			else {
				output +="The game is tied.\nPlay again...";
			}
			
		} else if (userInput.equalsIgnoreCase("Scissors")) {
			if(computerInput.equalsIgnoreCase("Rock")) {
				output +="Rock beats paper. \nThe computer wins!!";
			}
			else if(computerInput.equalsIgnoreCase("Paper")) {
				output += "Scissors beats paper. \nThe user wins!!";
			}
			else {
				output +="Game is tied.";
			}
		}
		
		return output;
	
	}
	

	public static void main(String[] args) {
		String computer;
		String user;
		RockPaperScissors rps = new RockPaperScissors();
		Scanner scan = new Scanner("System.in");
		
		do {
			computer = rps.computerInput();
			user = rps.userInput();
			
			//determine winner
			String output = rps.gameRules(user, computer);
			System.out.println(output);
			
		} while (user.equalsIgnoreCase(computer));
		
		scan.close();
	}

}
