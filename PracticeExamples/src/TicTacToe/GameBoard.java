package TicTacToe;
import java.util.Arrays;
import java.util.Scanner;



public class GameBoard {

	private char [][]gameBoard;
	private boolean playAgain = true;
	
	
	public GameBoard() {
		
		gameBoard = new char[3][3];
		
		for(int row=0; row<gameBoard.length; row++)
		{
			Arrays.fill(gameBoard[row], ' ');
		}
	}
	
	public void displayBoard()
	{
		for(int row = 0; row<gameBoard.length; row ++)
		{
			for(int col = 0; col<gameBoard[0].length; col++)
			{
	
				System.out.print("\t " + gameBoard[row][col]);
				
				if(col == 0 || col == 1)
				{
					System.out.print("|");
				}
				
			}
			
			if(row == 0 || row ==1)
			{
				System.out.print("\n------------------------------\n");
			}
		}
	}
	
	public boolean makeMove(char player, int row, int col) {
		if (row >=0 && row <=2 && col >=0 && col<=2)
		{
			if(gameBoard[row][col] != ' ')
			{
				return false;
			}
			else
			{
				gameBoard[row][col] = player;
				return true;
			}
		}
		
		return false;
		
	}
	
	public boolean gameActive() {
		return playAgain;
	}
	
	public void askPlayer(char player) {
		Scanner scan = new Scanner(System.in);
		int row, col;
		
		do
		{
			System.out.printf("\nPlayer %s please enter a row (1-3): ", player);
			row = scan.nextInt();
			
			System.out.printf("\nPlayer %s please enter a column (1-3): ", player);
			col = scan.nextInt();
			
			
		}	while(notValid(row,col));
	
	
		makeMove(player, row-1, col-1);

	}
	
	
	public boolean notValid(int row, int col) {
		if(row>3 || row < 1 || col >3 || col < 1 || !isEmpty(row,col))
			return true;
		else
			return false;
	}
	
	public boolean isEmpty(int row,int col) {
		if(gameBoard[row-1][col-1] == ' ')
			return true;
		else
			System.out.println("Position already taken\n");
			return false;
	}
	
	public boolean checkWinner() {
		for (int row = 0; row<gameBoard.length; row++)
		{
			if(gameBoard[row][0] == gameBoard[row][1] && gameBoard[row][1] ==gameBoard[row][2]
					&& gameBoard[row][0] != ' ')
			{
				System.out.println("\n\nPlayer " + gameBoard[row][0] + " Wins !!");
				playAgain = false;
			}
		}
		
		for (int col = 0; col<gameBoard.length; col++)
		{
			if(gameBoard[0][col] == gameBoard[1][col] && gameBoard[1][col] ==gameBoard[2][col]&& gameBoard[0][col] != ' ') 
			{
				System.out.println("\n\nPlayer " + gameBoard[0][col] + " Wins !!");
				playAgain = false;
			}

		}
		
		if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2] && gameBoard[0][0] != ' ') 
		{
			System.out.println("\n\nPlayer " + gameBoard[0][0] + " Wins !!");
			playAgain = false;
			
		}
		
		if(gameBoard[2][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[0][2] && gameBoard[0][2] != ' ') 
		{
			System.out.println("\n\nPlayer " + gameBoard[2][0] + " Wins !!");
			playAgain = false;
		}
		
		return false;
	}
	


}
