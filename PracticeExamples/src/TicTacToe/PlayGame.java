package TicTacToe;

public class PlayGame {

	public static void main(String[] args) {
		GameBoard gb = new GameBoard();
		int counter = 1;
		gb.displayBoard();

		while(gb.gameActive())
		{
			if (counter % 2 == 0)
			{
				gb.askPlayer('O');
			}
			else
			{
				gb.askPlayer('X');
			}
			
			counter++;
			System.out.println("\n\n");
			gb.displayBoard();
			gb.checkWinner();
		}
	}

}
