
public class SqureAndCube {

	public static void main(String[] args) 
	{
		int cube = 0;
		int square = 0;
		for(int i = 1; i<=10; i++)
		{
			square = i*i;
			System.out.println("The square of "+ i + "=" + square + "\n");
			
			cube = i * square;
			System.out.println("The of cube of "+ i + "=" + cube + "\n");
			
		}

	}

}
